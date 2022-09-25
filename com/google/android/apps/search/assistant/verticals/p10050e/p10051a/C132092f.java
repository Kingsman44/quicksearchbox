package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.f */
/* compiled from: PG */
public final /* synthetic */ class C132092f implements C42834at {

    /* renamed from: a */
    public static final /* synthetic */ C132092f f360476a = new C132092f();

    private /* synthetic */ C132092f() {
    }

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("CREATE TABLE IF NOT EXISTS deeplinks (query TEXT PRIMARY KEY ON CONFLICT IGNORE, data BLOB NOT NULL )");
        bfVar.mo45935i("CREATE INDEX IF NOT EXISTS _query_index ON deeplinks (query)");
        bfVar.mo45935i("CREATE TABLE IF NOT EXISTS version (version TEXT PRIMARY KEY ON CONFLICT IGNORE  )");
    }
}
