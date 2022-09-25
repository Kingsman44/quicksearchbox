package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82906ev;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C79747ax implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82906ev f218645a;

    public /* synthetic */ C79747ax(C82906ev evVar) {
        this.f218645a = evVar;
    }

    public final void accept(Object obj) {
        C82906ev evVar = this.f218645a;
        C79813di diVar = (C79813di) obj;
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        C82907ew ewVar = (C82907ew) evVar.build();
        C79814dj djVar2 = C79814dj.f218834O;
        ewVar.getClass();
        djVar.f218856f = ewVar;
        djVar.f218851a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
