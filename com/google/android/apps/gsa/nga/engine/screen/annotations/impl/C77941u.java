package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.ab;
import com.google.android.apps.gsa.nga.d.a.ac;
import com.google.p4273bs.p4277b.p4278a.C56481u;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.u */
/* compiled from: PG */
public final /* synthetic */ class C77941u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ab f214681a;

    public /* synthetic */ C77941u(ab abVar) {
        this.f214681a = abVar;
    }

    public final void accept(Object obj) {
        ab abVar = this.f214681a;
        C56481u uVar = (C56481u) obj;
        abVar.copyOnWrite();
        ac acVar = ac.c;
        uVar.getClass();
        abVar.instance.a = uVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
