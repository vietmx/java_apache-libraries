package com.maixuanviet.meecrowave;

import org.apache.meecrowave.Meecrowave;

public class Server {
    public static void main(String[] args) {
        final Meecrowave.Builder builder = new Meecrowave.Builder();
        builder.setScanningPackageIncludes("com.maixuanviet.meecrowave");
        builder.setJaxrsMapping("/api/*");
        builder.setJsonpPrettify(true);

        try (Meecrowave meecrowave = new Meecrowave(builder)) {
            meecrowave.bake().await();
        }
    }
}
