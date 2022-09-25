package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.android.apps.gsa.p8867w.p8879i.C118800b;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.k */
/* compiled from: PG */
public final /* synthetic */ class C133560k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133567r f363884a;

    /* renamed from: b */
    public final /* synthetic */ C133570u f363885b;

    public /* synthetic */ C133560k(C133567r rVar, C133570u uVar) {
        this.f363884a = rVar;
        this.f363885b = uVar;
    }

    public final C60870cx apply(Object obj) {
        C133567r rVar = this.f363884a;
        C133570u uVar = this.f363885b;
        Void voidR = (Void) obj;
        C118800b bVar = rVar.f363908m;
        boolean b = uVar.mo111260b();
        C86337q b2 = bVar.f331367a.mo80076b();
        b2.mo80067b("signed_out_search", b);
        b2.apply();
        return C60866ct.f164955a;
    }
}
