package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.e */
/* compiled from: PG */
final class C135185e implements C42834at {

    /* renamed from: a */
    public static final C135185e f368234a = new C135185e();

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("\n      CREATE TABLE feed_table (\n        feed_id TEXT NOT NULL,\n        is_background BOOLEAN_NOT_NULL,\n        session_state BLOB NOT NULL,\n        PRIMARY KEY(feed_id, is_background)\n      );\n      ");
        bfVar.mo45935i("\n      CREATE TABLE feed_content_table (\n        feed_id TEXT NOT NULL,\n        is_background BOOLEAN NOT NULL,\n        name TEXT NOT NULL,\n        value BLOB NOT NULL,\n        PRIMARY KEY(name, feed_id, is_background)\n        FOREIGN KEY(feed_id, is_background)\n          REFERENCES feed_table(feed_id, is_background)\n          ON DELETE CASCADE\n          ON UPDATE CASCADE\n      );\n      ");
        bfVar.mo45935i("\n      INSERT INTO feed_table\n      SELECT\n        \"MAIN_FEED\",\n        is_background,\n        value\n      FROM name_value_table\n      WHERE name=\"Session::Current\";\n      ");
        bfVar.mo45935i("\n      INSERT INTO feed_content_table\n      SELECT\n        \"MAIN_FEED\",\n        is_background,\n        name,\n        value\n      FROM name_value_table\n      WHERE name!=\"Session::Current\";\n      ");
        bfVar.mo45935i("DROP TABLE name_value_table;");
    }
}
