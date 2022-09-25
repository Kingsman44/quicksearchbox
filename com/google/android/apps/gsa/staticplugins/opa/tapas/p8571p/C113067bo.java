package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.assistant.p3781ad.p3789d.p3791b.C48717by;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bo */
/* compiled from: PG */
public final /* synthetic */ class C113067bo implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C113071bs f313281a;

    /* renamed from: b */
    public final /* synthetic */ Optional f313282b;

    public /* synthetic */ C113067bo(C113071bs bsVar, Optional optional) {
        this.f313281a = bsVar;
        this.f313282b = optional;
    }

    public final Object apply(Object obj) {
        C58485gu guVar;
        C113071bs bsVar = this.f313281a;
        Optional optional = this.f313282b;
        C48718bz bzVar = (C48718bz) obj;
        if (optional.isPresent()) {
            guVar = bsVar.mo99838i((List) Stream.CC.concat(Collection.EL.stream(bzVar.f126053a), Stream.CC.m71935of((C48716bx) optional.get())).collect(C58370cn.f155946a));
        } else {
            guVar = bsVar.mo99838i(bzVar.f126053a);
        }
        C48717by byVar = (C48717by) bzVar.toBuilder();
        byVar.copyOnWrite();
        ((C48718bz) byVar.instance).f126053a = C48718bz.emptyProtobufList();
        byVar.mo53176a(guVar);
        C48718bz bzVar2 = (C48718bz) byVar.build();
        bsVar.f313297l = Integer.valueOf(guVar.size());
        bsVar.f313298m = Integer.valueOf(bzVar2.getSerializedSize());
        C121537f fVar = C113071bs.f313287b;
        Integer num = bsVar.f313297l;
        num.getClass();
        fVar.mo105239h("profile_size_entries", (long) num.intValue());
        C121537f fVar2 = C113071bs.f313287b;
        Integer num2 = bsVar.f313298m;
        num2.getClass();
        fVar2.mo105239h("profile_size_bytes", (long) num2.intValue());
        C111248k kVar = bsVar.f313292g;
        C111255r rVar = C111255r.USER_PROFILE;
        Integer num3 = bsVar.f313297l;
        num3.getClass();
        Integer num4 = bsVar.f313298m;
        num4.getClass();
        kVar.mo99076a(rVar, String.format("Writing user profile with %d entries (%d bytes)", new Object[]{num3, num4}));
        return bzVar2;
    }
}
