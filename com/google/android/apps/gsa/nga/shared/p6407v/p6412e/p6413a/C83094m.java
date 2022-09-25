package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.m */
/* compiled from: PG */
public final /* synthetic */ class C83094m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82837cg f226703a;

    public /* synthetic */ C83094m(C82837cg cgVar) {
        this.f226703a = cgVar;
    }

    public final void accept(Object obj) {
        C82837cg cgVar = this.f226703a;
        C82843cm cmVar = (C82843cm) obj;
        cgVar.copyOnWrite();
        C82838ch chVar = (C82838ch) cgVar.instance;
        C82838ch chVar2 = C82838ch.f225874h;
        cmVar.getClass();
        chVar.f225882g = cmVar;
        chVar.f225876a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
