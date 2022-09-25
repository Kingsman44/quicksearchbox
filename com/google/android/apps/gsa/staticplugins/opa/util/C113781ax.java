package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62964ck;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ax */
/* compiled from: PG */
public final /* synthetic */ class C113781ax implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C113785ba f315115a;

    /* renamed from: b */
    public final /* synthetic */ Optional f315116b;

    public /* synthetic */ C113781ax(C113785ba baVar, Optional optional) {
        this.f315115a = baVar;
        this.f315116b = optional;
    }

    public final Object apply(Object obj) {
        C113785ba baVar = this.f315115a;
        Optional optional = this.f315116b;
        C81237ab abVar = (C81237ab) obj;
        C81328x xVar = (C81328x) abVar.toBuilder();
        int intValue = ((Integer) optional.orElse(Integer.valueOf(abVar.f222389h + 1))).intValue();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a |= 4;
        abVar2.f222389h = intValue;
        Optional max = Collection.EL.stream(abVar.f222391j).max(C113778au.f315112a);
        if (max.isEmpty() || Instant.ofEpochMilli(((Long) max.get()).longValue()).mo43048g(C113785ba.f315124b, ChronoUnit.MILLIS).isBefore(baVar.f315127e.mo57444a())) {
            xVar.copyOnWrite();
            ((C81237ab) xVar.instance).f222391j = C81237ab.emptyLongList();
            C62964ck ckVar = abVar.f222391j;
            xVar.mo74996a((C58485gu) Stream.CC.concat(Collection.EL.stream(ckVar), Stream.CC.m71935of(Long.valueOf(baVar.f315127e.mo57444a().toEpochMilli()))).skip((long) Math.max(0, ckVar.size() - 99)).collect(C58370cn.f155946a));
        }
        return (C81237ab) xVar.build();
    }
}
