package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.d */
/* compiled from: PG */
final class C135184d implements C42834at {

    /* renamed from: a */
    public static final C135184d f368233a = new C135184d();

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("\n    CREATE TEMPORARY TABLE temp_name_value_table as SELECT * from name_value_table;\n    ");
        bfVar.mo45935i("\n    DROP TABLE name_value_table;\n    ");
        bfVar.mo45935i("\n    CREATE TABLE name_value_table (\n      name VARCHAR(127) NOT NULL,\n      value BLOB NOT NULL,\n      is_background BOOLEAN NOT NULL, -- Note booleans are actually longs.\n      -- The same content can be in the foreground and background tree, so the pair has to be used\n      -- as the primary key.\n      PRIMARY KEY(\n        name, is_background\n      )\n    );\n    ");
        bfVar.mo45935i("\n    INSERT INTO name_value_table\n      SELECT name, value, /* background is false */ 0 FROM temp_name_value_table;\n    ");
        bfVar.mo45935i("\n    DROP TABLE temp_name_value_table;\n    ");
    }
}
