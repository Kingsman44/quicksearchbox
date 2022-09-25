package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C131199f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131208o f358811a;

    /* renamed from: b */
    public final /* synthetic */ C50794cr f358812b;

    /* renamed from: c */
    public final /* synthetic */ C62910ar f358813c;

    public /* synthetic */ C131199f(C131208o oVar, C50794cr crVar, C62910ar arVar) {
        this.f358811a = oVar;
        this.f358812b = crVar;
        this.f358813c = arVar;
    }

    public final Object apply(Object obj) {
        C131208o oVar = this.f358811a;
        return Collection.EL.stream(((C131197d) obj).f358809a).filter(new C131198e(this.f358812b)).filter(C131202i.f358816a).filter(new C131203j(C62953e.m95487l(C62950b.m95471b(oVar.f358824c), this.f358813c))).max(Comparator.CC.comparing(C131204k.f358818a, C62953e.m95489n()));
    }
}
