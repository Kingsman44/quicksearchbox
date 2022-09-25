package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.u */
/* compiled from: PG */
public final /* synthetic */ class C79837u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82889ee f218908a;

    public /* synthetic */ C79837u(C82889ee eeVar) {
        this.f218908a = eeVar;
    }

    public final void accept(Object obj) {
        C82889ee eeVar = this.f218908a;
        C79813di diVar = (C79813di) obj;
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        C79814dj djVar2 = C79814dj.f218834O;
        eeVar.getClass();
        djVar.f218874x = eeVar;
        djVar.f218851a |= 256;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
