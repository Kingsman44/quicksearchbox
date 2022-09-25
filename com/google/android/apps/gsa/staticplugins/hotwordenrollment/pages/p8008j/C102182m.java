package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.m */
/* compiled from: PG */
public final /* synthetic */ class C102182m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C102186q f285058a;

    /* renamed from: b */
    public final /* synthetic */ boolean f285059b;

    public /* synthetic */ C102182m(C102186q qVar, boolean z) {
        this.f285058a = qVar;
        this.f285059b = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C102186q qVar = this.f285058a;
        boolean z = this.f285059b;
        if (!qVar.f285064b.mo56113h()) {
            return C60856cj.m92899h(new Throwable("Failed to retrieve fedAssSettingsCallback"));
        }
        return ((C84232e) qVar.f285064b.mo56107c()).mo77698g(z);
    }
}
