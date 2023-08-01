package org.daniel._09_suppliers;

import java.util.List;
import java.util.function.Supplier;

public class _Suppliers {
    public static void main(String[] args) {
        System.out.println(getDatabaseConnectionUrl());
        System.out.println(getDatabaseConnectionUrlSupplier.get());
        System.out.println(getDatabaseConnectionUrlListSupplier.get());
    }

    static String getDatabaseConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDatabaseConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDatabaseConnectionUrlListSupplier = () -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:1234/users",
            "jdbc://localhost:9876/users"
    );
}
