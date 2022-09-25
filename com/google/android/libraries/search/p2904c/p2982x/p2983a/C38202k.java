package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.android.libraries.search.p2904c.p2908b.C37381e;
import com.google.android.libraries.search.p2904c.p2908b.C37382f;
import com.google.android.libraries.search.p2904c.p2908b.C37388l;
import com.google.android.libraries.search.p2904c.p2908b.C37390n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.x.a.k */
/* compiled from: PG */
final class C38202k implements C37363a {

    /* renamed from: a */
    final /* synthetic */ C38203l f101251a;

    public C38202k(C38203l lVar) {
        this.f101251a = lVar;
    }

    /* renamed from: c */
    public final C58833ax mo24473c(C37388l lVar) {
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo24474d() {
        return C60856cj.m92900i(C37381e.AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo24475e(boolean z) {
        return C60856cj.m92900i(C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS);
    }

    /* renamed from: f */
    public final C60870cx mo24476f(C37390n nVar) {
        this.f101251a.mo41336o();
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37516dw dwVar = C37516dw.CLOSED;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dwVar.f99638d);
        duVar.f99631a = 1;
        return C60856cj.m92900i((C37514du) dtVar.build());
    }
}
