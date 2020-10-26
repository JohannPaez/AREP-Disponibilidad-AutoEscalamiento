package com.arep;

import com.arep.services.MathServices;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        MathServices mathServices = new MathServices();
        port(getPort());
        get("/:num", ((request, response) -> {
            String res = "El número debe estar entre 0 y 10000";
            int num = Integer.parseInt(request.params("num"));
            if (num < 0 || num > 10000) {
                response.status(400);
                return "<h1> BAD REQUEST </h1>" + "<br>" + res;
            }

            return mathServices.combinateOneToN(Integer.parseInt(request.params("num")));
        }));
    }

    /**
     * Funcion que retorna el número del puerto por el cual se correrá el servicio.
     * @return El número de puerto del servicio.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 80;
    }

}
