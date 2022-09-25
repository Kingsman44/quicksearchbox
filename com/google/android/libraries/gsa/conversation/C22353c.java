package com.google.android.libraries.gsa.conversation;

import com.google.android.libraries.gsa.conversation.p1851e.C22571j;
import com.google.android.libraries.gsa.conversation.p1855h.C22715s;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.gsa.conversation.c */
/* compiled from: PG */
public final class C22353c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22571j f61700a;

    public C22353c(C22571j jVar) {
        this.f61700a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C22571j jVar = this.f61700a;
        jVar.f62205a.mo27655a(String.format("%s\n%s", new Object[]{th.getClass().getName(), jVar.mo27660c()}), "CCL");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C22571j jVar = this.f61700a;
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        C52070ec d = ((C22715s) obj).mo27849d();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        d.getClass();
        ekVar.f136675c = d;
        ekVar.f136674b = 3;
        jVar.mo27658a((C52078ek) ejVar.build());
    }
}
