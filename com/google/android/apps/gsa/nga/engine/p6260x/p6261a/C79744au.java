package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.au */
/* compiled from: PG */
public final /* synthetic */ class C79744au implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82964gz f218642a;

    public /* synthetic */ C79744au(C82964gz gzVar) {
        this.f218642a = gzVar;
    }

    public final void accept(Object obj) {
        C79813di diVar = (C79813di) obj;
        String str = this.f218642a.f226347c;
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        C79814dj djVar2 = C79814dj.f218834O;
        str.getClass();
        djVar.f218851a |= 2;
        djVar.f218853c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
