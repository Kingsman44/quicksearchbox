package com.google.android.apps.search.podcasts.p10576l;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.l.ba */
/* compiled from: PG */
public final /* synthetic */ class C140466ba implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140488bw f381548a;

    public /* synthetic */ C140466ba(C140488bw bwVar) {
        this.f381548a = bwVar;
    }

    public final Object apply(Object obj) {
        C140488bw bwVar = this.f381548a;
        C140450al alVar = (C140450al) obj;
        C140448aj ajVar = (C140448aj) alVar.toBuilder();
        C140447ai aiVar = alVar.f381521g;
        if (aiVar == null) {
            aiVar = C140447ai.f381502c;
        }
        if (Float.compare(aiVar.f381504a, 0.0f) == 0) {
            C140446ah ahVar = (C140446ah) aiVar.toBuilder();
            ahVar.copyOnWrite();
            ((C140447ai) ahVar.instance).f381504a = 1.0f;
            ajVar.copyOnWrite();
            C140447ai aiVar2 = (C140447ai) ahVar.build();
            aiVar2.getClass();
            ((C140450al) ajVar.instance).f381521g = aiVar2;
        }
        if (alVar.f381524j == null) {
            C140510v vVar = (C140510v) C140511w.f381636b.createBuilder();
            vVar.copyOnWrite();
            ((C140511w) vVar.instance).f381638a = true;
            C140511w wVar = (C140511w) vVar.build();
            ajVar.copyOnWrite();
            wVar.getClass();
            ((C140450al) ajVar.instance).f381524j = wVar;
        }
        C140443ae aeVar = alVar.f381519e;
        if (aeVar == null) {
            aeVar = C140443ae.f381490d;
        }
        C54362bo a = C54362bo.m87369a(aeVar.f381492a);
        if (a == null) {
            a = C54362bo.UNRECOGNIZED;
        }
        if (a == C54362bo.UNSET) {
            C140443ae aeVar2 = alVar.f381519e;
            if (aeVar2 == null) {
                aeVar2 = C140443ae.f381490d;
            }
            C140442ad adVar = (C140442ad) aeVar2.toBuilder();
            C54362bo boVar = C54362bo.ENABLE_PERSONALIZATION;
            adVar.copyOnWrite();
            ((C140443ae) adVar.instance).f381492a = boVar.getNumber();
            ajVar.copyOnWrite();
            C140443ae aeVar3 = (C140443ae) adVar.build();
            aeVar3.getClass();
            ((C140450al) ajVar.instance).f381519e = aeVar3;
        }
        if (bwVar.f381581h) {
            C140513y yVar = alVar.f381517c;
            if (yVar == null) {
                yVar = C140513y.f381639d;
            }
            long j = yVar.f381641a;
            long j2 = yVar.f381642b;
            if (j <= 0) {
                j = Duration.ofDays(1).toMillis();
            }
            if (j2 <= 0) {
                j2 = Duration.ofDays(30).toMillis();
            }
            C140512x xVar = (C140512x) yVar.toBuilder();
            xVar.copyOnWrite();
            ((C140513y) xVar.instance).f381641a = j;
            xVar.copyOnWrite();
            ((C140513y) xVar.instance).f381642b = j2;
            ajVar.copyOnWrite();
            C140513y yVar2 = (C140513y) xVar.build();
            yVar2.getClass();
            ((C140450al) ajVar.instance).f381517c = yVar2;
        }
        return (C140450al) ajVar.build();
    }
}
