package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.app.usage.UsageStatsManager;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C106439ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ long f296895a;

    /* renamed from: b */
    public final /* synthetic */ long f296896b;

    /* renamed from: c */
    public final /* synthetic */ List f296897c;

    public /* synthetic */ C106439ae(long j, long j2, List list) {
        this.f296895a = j;
        this.f296896b = j2;
        this.f296897c = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C58495hd) Collection.EL.stream(((HashMap) Collection.EL.stream(((UsageStatsManager) obj).queryUsageStats(4, this.f296895a, this.f296896b)).filter(new C106462c(this.f296897c)).collect(Collectors.groupingBy(C106463d.f296951a, C106464e.f296952a, C58370cn.f155946a))).values()).map(C106465f.f296953a).collect(C58370cn.m89403c(C106463d.f296951a, C106466g.f296954a, C106467h.f296955a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
