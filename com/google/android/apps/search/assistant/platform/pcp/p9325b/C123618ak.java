package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C123618ak implements C42834at {

    /* renamed from: a */
    public static final /* synthetic */ C123618ak f341544a = new C123618ak();

    private /* synthetic */ C123618ak() {
    }

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("INSERT INTO LastClientDataQuery(data_type, data_id, client_type, last_query_timestamp, query_time, data_hash) SELECT data_type, data_id, client_type, last_query_timestamp, query_time, data_hash FROM tmp_LastClientDataQuery");
    }
}
