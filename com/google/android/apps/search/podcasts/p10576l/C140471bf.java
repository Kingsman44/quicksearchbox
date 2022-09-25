package com.google.android.apps.search.podcasts.p10576l;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4082j.p4083a.C54362bo;

/* renamed from: com.google.android.apps.search.podcasts.l.bf */
/* compiled from: PG */
public final /* synthetic */ class C140471bf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140488bw f381554a;

    /* renamed from: b */
    public final /* synthetic */ boolean f381555b;

    public /* synthetic */ C140471bf(C140488bw bwVar, boolean z) {
        this.f381554a = bwVar;
        this.f381555b = z;
    }

    public final Object apply(Object obj) {
        C54362bo boVar;
        C140488bw bwVar = this.f381554a;
        boolean z = this.f381555b;
        C140448aj ajVar = (C140448aj) ((C140450al) obj).toBuilder();
        C140442ad adVar = (C140442ad) C140443ae.f381490d.createBuilder();
        if (z) {
            boVar = C54362bo.ENABLE_PERSONALIZATION;
        } else {
            boVar = C54362bo.DISABLE_PERSONALIZATION;
        }
        adVar.copyOnWrite();
        ((C140443ae) adVar.instance).f381492a = boVar.getNumber();
        adVar.copyOnWrite();
        ((C140443ae) adVar.instance).f381494c = true;
        long b = bwVar.f381576c.mo26870b();
        adVar.copyOnWrite();
        ((C140443ae) adVar.instance).f381493b = b;
        ajVar.copyOnWrite();
        C140443ae aeVar = (C140443ae) adVar.build();
        aeVar.getClass();
        ((C140450al) ajVar.instance).f381519e = aeVar;
        return (C140450al) ajVar.build();
    }
}
