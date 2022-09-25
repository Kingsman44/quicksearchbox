package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C83073b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80392e f226683a;

    public /* synthetic */ C83073b(C80392e eVar) {
        this.f226683a = eVar;
    }

    public final void accept(Object obj) {
        C80392e eVar = this.f226683a;
        C51809dy dyVar = (C51809dy) obj;
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        C80394g gVar2 = C80394g.f220645c;
        dyVar.getClass();
        gVar.f220648b = dyVar;
        gVar.f220647a = 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
