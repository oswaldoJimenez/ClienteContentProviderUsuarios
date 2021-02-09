package com.example.clientecontentproviderusuarios;

import android.net.Uri;
import android.provider.BaseColumns;

public class MiProverdorContenidoContract {

    public static final String AUTHORITY = "user_dictionary";
    public static final Uri CONTENT_URI = null;

    public MiProverdorContenidoContract() {
        throw new RuntimeException("Stub!");
    }

    public static class Usuarios implements BaseColumns {

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.userword";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.userword";
        public static final Uri CONTENT_URI = null;



        public static final String LOCALE = "locale";
        public static final String _ID = "_id";
        public static final String EMAIL = "email";
        public static final String NOMBRE = "nombre";
        public static final String PASS = "password";
        public static final String TELEFONO = "telefono";




    }
}
