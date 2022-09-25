package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48717by;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48593ai;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48594aj;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.v */
/* compiled from: PG */
public final /* synthetic */ class C113109v implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113110w f313386a;

    public /* synthetic */ C113109v(C113110w wVar) {
        this.f313386a = wVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C48594aj ajVar;
        C48594aj ajVar2;
        C113110w wVar = this.f313386a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            long b = wVar.f313391e.mo26870b();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return (C48635bx) bvVar.build();
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C113105r.f313382a).sorted(Comparator.CC.comparingLong(C113106s.f313383a)).collect(C58370cn.f155946a);
        C113049ax b2 = C113049ax.m187033b(guVar2);
        C113049ax b3 = C113049ax.m187033b((List) Collection.EL.stream(guVar2).filter(new C113107t(wVar)).collect(C58370cn.f155946a));
        C48633bv bvVar2 = (C48633bv) C48635bx.f125704d.createBuilder();
        long b4 = wVar.f313391e.mo26870b();
        bvVar2.copyOnWrite();
        ((C48635bx) bvVar2.instance).f125708c = b4;
        C48593ai aiVar = (C48593ai) C48594aj.f125598e.createBuilder();
        C48717by byVar = (C48717by) C48718bz.f126051b.createBuilder();
        byVar.mo53176a(guVar2);
        aiVar.copyOnWrite();
        C48594aj ajVar3 = (C48594aj) aiVar.instance;
        C48718bz bzVar = (C48718bz) byVar.build();
        bzVar.getClass();
        ajVar3.f125601b = bzVar;
        ajVar3.f125600a |= 1;
        C113101n a = b2.mo99823a();
        aiVar.copyOnWrite();
        C48594aj ajVar4 = (C48594aj) aiVar.instance;
        a.getClass();
        ajVar4.f125602c = a;
        ajVar4.f125600a |= 2;
        C113101n a2 = b3.mo99823a();
        aiVar.copyOnWrite();
        C48594aj ajVar5 = (C48594aj) aiVar.instance;
        a2.getClass();
        ajVar5.f125603d = a2;
        ajVar5.f125600a |= 4;
        C48594aj ajVar6 = (C48594aj) aiVar.build();
        bvVar2.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar2.instance;
        ajVar6.getClass();
        bxVar.f125707b = ajVar6;
        bxVar.f125706a = 26;
        C48635bx bxVar2 = (C48635bx) bvVar2.build();
        C113110w.f313387a.mo105240i("gemini_user_profile_fetched");
        C113110w.f313387a.mo105239h("gemini_user_profile_signal_size_bytes", (long) bxVar2.getSerializedSize());
        C121537f fVar = C113110w.f313387a;
        if (bxVar2.f125706a == 26) {
            ajVar = (C48594aj) bxVar2.f125707b;
        } else {
            ajVar = C48594aj.f125598e;
        }
        C48718bz bzVar2 = ajVar.f125601b;
        if (bzVar2 == null) {
            bzVar2 = C48718bz.f126051b;
        }
        fVar.mo105239h("gemini_user_profile_num_records", (long) bzVar2.f126053a.size());
        C121537f fVar2 = C113110w.f313387a;
        if (bxVar2.f125706a == 26) {
            ajVar2 = (C48594aj) bxVar2.f125707b;
        } else {
            ajVar2 = C48594aj.f125598e;
        }
        C48718bz bzVar3 = ajVar2.f125601b;
        if (bzVar3 == null) {
            bzVar3 = C48718bz.f126051b;
        }
        fVar2.mo105239h("gemini_user_profile_raw_profile_size_bytes", (long) bzVar3.getSerializedSize());
        return bxVar2;
    }
}
