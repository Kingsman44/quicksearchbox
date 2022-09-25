package com.google.android.apps.search.googleapp.p10370p;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62995dn;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.search.googleapp.p.v */
/* compiled from: PG */
public final /* synthetic */ class C136886v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136848ao f372566a;

    public /* synthetic */ C136886v(C136848ao aoVar) {
        this.f372566a = aoVar;
    }

    public final C60870cx apply(Object obj) {
        C136848ao aoVar = this.f372566a;
        C136881q qVar = (C136881q) obj;
        ((C59052c) ((C59052c) C136848ao.f372475a.mo56224b()).mo56372aa(40687)).mo56386p("#getFeatureUsageInfo");
        long epochMilli = Instant.ofEpochMilli(aoVar.f372483i.mo26870b()).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
        C136870f fVar = C136870f.f372528b;
        C62995dn dnVar = qVar.f372555b;
        Long valueOf = Long.valueOf(epochMilli);
        if (dnVar.containsKey(valueOf)) {
            fVar = (C136870f) dnVar.get(valueOf);
        }
        if (!fVar.equals(C136870f.f372528b)) {
            return C60856cj.m92900i(C136848ao.m222536b(qVar, epochMilli));
        }
        C60870cx c = aoVar.mo113412c();
        C136843aj ajVar = new C136843aj(aoVar, epochMilli);
        return C60922j.m93045h(c, C47810es.m84966f(ajVar), aoVar.f372480f);
    }
}
