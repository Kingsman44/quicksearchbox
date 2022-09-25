package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131074d;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131089l;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131090m;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.assistant.p3886c.p3887a.C50680p;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.HashMap;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bl */
/* compiled from: PG */
public final /* synthetic */ class C131025bl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131043cc f358425a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f358426b;

    /* renamed from: c */
    public final /* synthetic */ boolean f358427c;

    /* renamed from: d */
    public final /* synthetic */ C50672h f358428d;

    /* renamed from: e */
    public final /* synthetic */ C50680p f358429e;

    /* renamed from: f */
    public final /* synthetic */ C50680p f358430f;

    /* renamed from: g */
    public final /* synthetic */ C131074d f358431g;

    public /* synthetic */ C131025bl(C131043cc ccVar, C58485gu guVar, boolean z, C50672h hVar, C50680p pVar, C50680p pVar2, C131074d dVar) {
        this.f358425a = ccVar;
        this.f358426b = guVar;
        this.f358427c = z;
        this.f358428d = hVar;
        this.f358429e = pVar;
        this.f358430f = pVar2;
        this.f358431g = dVar;
    }

    public final Object apply(Object obj) {
        C131043cc ccVar = this.f358425a;
        C58485gu guVar = this.f358426b;
        C131043cc ccVar2 = ccVar;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(((HashMap) Collection.EL.stream(guVar).flatMap(C130994ah.f358385a).collect(Collectors.groupingBy(C130995ai.f358386a, C131038by.f358448a, C58370cn.f155946a))).values()).map(new C130996aj(ccVar2, this.f358427c, this.f358428d, this.f358429e, this.f358430f, this.f358431g, Collection.EL.stream(guVar).filter(C131041ca.f358453a).mapToLong(C131042cb.f358454a).sum(), (C58485gu) obj)).filter(C130997ak.f358395a).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C130998al.f358396a))).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) ccVar.f358456b.mo56224b()).mo56372aa(39024)).mo56387q("Sending app suggestions from V1, suggestion count: %d", guVar2.size());
        C131089l c = C131090m.m213618c();
        c.mo110064b(guVar.size());
        c.mo110065c(guVar2);
        return c.mo110063a();
    }
}
