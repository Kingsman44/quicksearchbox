package com.google.android.libraries.web.p3343a.p3344a;

import com.google.android.libraries.web.p3343a.C43226b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.web.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C43224d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C43225e f112955a;

    /* renamed from: b */
    public final /* synthetic */ String f112956b;

    public /* synthetic */ C43224d(C43225e eVar, String str) {
        this.f112955a = eVar;
        this.f112956b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C43225e eVar = this.f112955a;
        if (eVar.f112958b.mo46468a().f113329b.equals(this.f112956b)) {
            return eVar.f112957a.mo46276a();
        }
        return C60856cj.m92899h(new C43226b("Url changed before screenshot could be taken."));
    }
}
