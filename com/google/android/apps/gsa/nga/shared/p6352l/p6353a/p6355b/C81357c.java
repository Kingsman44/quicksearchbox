package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import java.util.HashMap;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C81357c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81359e f222683a;

    /* renamed from: b */
    public final /* synthetic */ boolean f222684b;

    /* renamed from: c */
    public final /* synthetic */ HashMap f222685c;

    public /* synthetic */ C81357c(C81359e eVar, boolean z, HashMap hashMap) {
        this.f222683a = eVar;
        this.f222684b = z;
        this.f222685c = hashMap;
    }

    public final void accept(Object obj) {
        C81359e eVar = this.f222683a;
        C80267v vVar = (C80267v) obj;
        this.f222685c.put(vVar, (Instant) Collection.EL.stream(eVar.f222687b.mo75018a(vVar, this.f222684b)).max(C81356b.f222682a).orElse(Instant.EPOCH));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
