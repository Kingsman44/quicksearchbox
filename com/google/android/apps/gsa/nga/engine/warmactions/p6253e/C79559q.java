package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.q */
/* compiled from: PG */
public final /* synthetic */ class C79559q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79561s f218279a;

    /* renamed from: b */
    public final /* synthetic */ C59582aj f218280b;

    public /* synthetic */ C79559q(C79561s sVar, C59582aj ajVar) {
        this.f218279a = sVar;
        this.f218280b = ajVar;
    }

    public final void accept(Object obj) {
        C79561s sVar = this.f218279a;
        C59582aj ajVar = this.f218280b;
        String h = sVar.f218284c.mo74223h((C83320io) obj);
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        h.getClass();
        cbVar.f160062a |= 4;
        cbVar.f160127h = h;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
