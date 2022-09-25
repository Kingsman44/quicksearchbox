package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.podcasts.b.a.q */
/* compiled from: PG */
final class C140004q implements C42834at {

    /* renamed from: a */
    public static final C140004q f380527a = new C140004q();

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("\n      CREATE TABLE show_metadata (\n        feed_url TEXT PRIMARY KEY,\n        show_result_proto BLOB NOT NULL,\n        update_time_ms INT NOT NULL\n      )\n    ");
        bfVar.mo45935i("\n      CREATE TABLE episode_metadata (\n        feed_url TEXT,\n        guid TEXT,\n        episode_proto BLOB NOT NULL,\n        published_time_millis INT NOT NULL,\n        update_time_ms INT NOT NULL,\n      PRIMARY KEY (feed_url, guid))\n    ");
    }
}
