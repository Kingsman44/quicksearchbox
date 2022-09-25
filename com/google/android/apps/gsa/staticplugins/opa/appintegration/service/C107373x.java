package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.IBinder;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.x */
/* compiled from: PG */
final class C107373x implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ C107374y f298840a;

    /* renamed from: b */
    private final C107372w f298841b;

    /* renamed from: c */
    private final IBinder f298842c;

    public C107373x(C107374y yVar, C107372w wVar, IBinder iBinder) {
        this.f298840a = yVar;
        this.f298841b = wVar;
        this.f298842c = iBinder;
    }

    public final void binderDied() {
        C107372w wVar = this.f298841b;
        C107367r rVar = wVar.f298833e;
        C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
        alVar.copyOnWrite();
        C17883am amVar = (C17883am) alVar.instance;
        amVar.f51245b = 6;
        amVar.f51246c = true;
        String str = wVar.f298831c;
        alVar.copyOnWrite();
        C17883am amVar2 = (C17883am) alVar.instance;
        str.getClass();
        amVar2.f51244a = 1 | amVar2.f51244a;
        amVar2.f51247d = str;
        rVar.mo95987b((C17883am) alVar.build());
        this.f298840a.mo95993a(this.f298841b);
        this.f298842c.unlinkToDeath(this, 0);
    }
}
