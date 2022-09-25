package com.google.android.apps.gsa.staticplugins.p7444be;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.be.f */
/* compiled from: PG */
public final /* synthetic */ class C94547f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C94552k f264444a;

    /* renamed from: b */
    public final /* synthetic */ aaj f264445b;

    public /* synthetic */ C94547f(C94552k kVar, aaj aaj) {
        this.f264444a = kVar;
        this.f264445b = aaj;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        e eVar;
        String str;
        C94552k kVar = this.f264444a;
        aaj aaj = this.f264445b;
        boolean z = aaj.f237078b;
        if (aaj.f237080d || z) {
            eVar = e.bL;
        } else {
            eVar = e.ak;
        }
        if ((aaj.f237077a & 64) != 0) {
            str = aaj.f237084h;
        } else {
            str = aaj.f237080d ? "and.opa.wired" : !aaj.f237078b ? "and.opa.bluetooth" : "and.opa";
        }
        return kVar.f264454C.mo39461a(Integer.valueOf(eVar.ca), str);
    }
}
