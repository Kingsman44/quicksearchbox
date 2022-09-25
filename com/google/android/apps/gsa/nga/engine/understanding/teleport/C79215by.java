package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79882d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.by */
/* compiled from: PG */
public final /* synthetic */ class C79215by implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79882d f217680a;

    public /* synthetic */ C79215by(C79882d dVar) {
        this.f217680a = dVar;
    }

    public final void accept(Object obj) {
        C79882d dVar = this.f217680a;
        String str = (String) obj;
        dVar.copyOnWrite();
        C79885g gVar = (C79885g) dVar.instance;
        C79885g gVar2 = C79885g.f218957h;
        str.getClass();
        gVar.f218959a |= 4;
        gVar.f218962d = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
