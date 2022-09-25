package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.android.libraries.storage.p3315b.C42834at;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.e */
/* compiled from: PG */
public final /* synthetic */ class C123628e implements C42834at {

    /* renamed from: a */
    public static final /* synthetic */ C123628e f341554a = new C123628e();

    private /* synthetic */ C123628e() {
    }

    /* renamed from: a */
    public final void mo45917a(C42847bf bfVar) {
        bfVar.mo45935i("INSERT INTO LastClientDataQuery(data_type, data_id, client_type, last_query_timestamp, query_time, data_hash) SELECT data_type, data_id, client_type, last_query_timestamp, query_time, data_hash FROM tmp_LastClientDataQuery");
    }
}
