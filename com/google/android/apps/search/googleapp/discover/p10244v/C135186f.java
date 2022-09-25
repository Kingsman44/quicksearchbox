package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.f */
/* compiled from: PG */
final class C135186f implements C42834at {

    /* renamed from: a */
    public static final C135186f f368235a = new C135186f();

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("\n    CREATE TEMPORARY TABLE tmp_feed_content_table AS \n      SELECT * \n      FROM feed_content_table\n    ");
        bfVar.mo45935i("\n    DROP TABLE feed_content_table\n    ");
        bfVar.mo45935i("\n    CREATE TEMPORARY TABLE tmp_feed_table AS \n      SELECT * \n      FROM feed_table;\n    ");
        bfVar.mo45935i("\n    DROP TABLE feed_table\n    ");
        bfVar.mo45935i("\n    CREATE TABLE feed_table (\n      feed_id TEXT NOT NULL PRIMARY KEY,\n      session_state BLOB NOT NULL\n    );\n    ");
        bfVar.mo45935i("\n    INSERT INTO feed_table \n      SELECT \n        feed_id,\n        session_state\n      FROM tmp_feed_table\n      WHERE NOT(is_background) \n    ");
        bfVar.mo45935i("\n    DROP TABLE tmp_feed_table\n    ");
        bfVar.mo45935i("\n      CREATE TABLE feed_content_table (\n        feed_id TEXT NOT NULL,\n        name TEXT NOT NULL,\n        value BLOB NOT NULL,\n        PRIMARY KEY(name, feed_id)\n        FOREIGN KEY(feed_id)\n          REFERENCES feed_table(feed_id)\n          ON DELETE CASCADE\n          ON UPDATE CASCADE\n      );\n    ");
        bfVar.mo45935i("\n    INSERT INTO feed_content_table \n      SELECT \n        feed_id,\n        name,\n        value\n      FROM tmp_feed_content_table\n      WHERE NOT(is_background)\n    ");
        bfVar.mo45935i("\n    DROP TABLE tmp_feed_content_table\n    ");
    }
}
