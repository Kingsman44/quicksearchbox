package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.n */
/* compiled from: PG */
public final /* synthetic */ class C132100n implements C42846be {

    /* renamed from: a */
    public static final /* synthetic */ C132100n f360488a = new C132100n();

    private /* synthetic */ C132100n() {
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        bfVar.mo45935i("DROP INDEX IF EXISTS _query_index");
        bfVar.mo45930b("deeplinks", BuildConfig.FLAVOR, new String[0]);
        bfVar.mo45930b("version", BuildConfig.FLAVOR, new String[0]);
    }
}
