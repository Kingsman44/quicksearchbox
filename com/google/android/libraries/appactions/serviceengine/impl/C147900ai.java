package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.android.libraries.appactions.serviceengine.api.C147881n;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.assistant.p3944g.p3948b.p3949a.C52934ae;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.ai */
/* compiled from: PG */
public final /* synthetic */ class C147900ai implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f398961a;

    /* renamed from: b */
    public final /* synthetic */ C147881n f398962b;

    public /* synthetic */ C147900ai(C147906ao aoVar, C147881n nVar) {
        this.f398961a = aoVar;
        this.f398962b = nVar;
    }

    public final Object apply(Object obj) {
        C62722b bVar;
        C147906ao aoVar = this.f398961a;
        C147881n nVar = this.f398962b;
        C52934ae aeVar = (C52934ae) obj;
        Stream stream = Collection.EL.stream(aeVar.f138788a);
        C147914g gVar = aoVar.f398977g;
        Objects.requireNonNull(gVar);
        C58485gu guVar = (C58485gu) stream.map(new C147916i(gVar)).collect(C58370cn.f155946a);
        if (aoVar.f398975e.isPresent() && nVar.mo124565l().isPresent() && nVar.mo124550e().isPresent()) {
            C37215b bVar2 = (C37215b) aoVar.f398975e.get();
            C37257f fVar = C37182a.f98180ho;
            if (!aeVar.f138788a.isEmpty()) {
                bVar = C62722b.OK;
            } else {
                bVar = C62722b.INTERNAL;
            }
            bVar2.mo19974a(fVar.mo40805c(bVar));
        }
        return guVar;
    }
}
