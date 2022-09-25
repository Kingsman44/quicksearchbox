package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import java.util.HashMap;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C81355a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81359e f222679a;

    /* renamed from: b */
    public final /* synthetic */ boolean f222680b;

    /* renamed from: c */
    public final /* synthetic */ HashMap f222681c;

    public /* synthetic */ C81355a(C81359e eVar, boolean z, HashMap hashMap) {
        this.f222679a = eVar;
        this.f222680b = z;
        this.f222681c = hashMap;
    }

    public final void accept(Object obj) {
        C81359e eVar = this.f222679a;
        C80267v vVar = (C80267v) obj;
        this.f222681c.put(vVar, (Instant) Collection.EL.stream(eVar.f222687b.mo75018a(vVar, this.f222680b)).max(C81356b.f222682a).orElse(Instant.EPOCH));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
