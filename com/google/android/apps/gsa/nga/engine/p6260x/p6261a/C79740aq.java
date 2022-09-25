package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C79740aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82889ee f218638a;

    public /* synthetic */ C79740aq(C82889ee eeVar) {
        this.f218638a = eeVar;
    }

    public final void accept(Object obj) {
        C82889ee eeVar = this.f218638a;
        C79813di diVar = (C79813di) obj;
        if ((((C79814dj) diVar.instance).f218851a & 1024) == 0) {
            diVar.copyOnWrite();
            C79814dj djVar = (C79814dj) diVar.instance;
            eeVar.getClass();
            djVar.f218876z = eeVar;
            djVar.f218851a |= 1024;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
