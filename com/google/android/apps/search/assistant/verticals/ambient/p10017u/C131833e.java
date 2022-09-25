package com.google.android.apps.search.assistant.verticals.ambient.p10017u;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p4016z.C53709bg;
import com.google.assistant.p4016z.C53710bh;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.e */
/* compiled from: PG */
public final /* synthetic */ class C131833e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C53709bg f360043a;

    public /* synthetic */ C131833e(C53709bg bgVar) {
        this.f360043a = bgVar;
    }

    public final void accept(Object obj) {
        C53709bg bgVar = this.f360043a;
        C83739ak akVar = (C83739ak) obj;
        bgVar.copyOnWrite();
        C53710bh bhVar = (C53710bh) bgVar.instance;
        C53710bh bhVar2 = C53710bh.f141001c;
        akVar.getClass();
        bhVar.mo54009a();
        bhVar.f141004b.add(akVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
