package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.b */
/* compiled from: PG */
public final /* synthetic */ class C130815b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130820g f358056a;

    public /* synthetic */ C130815b(C130820g gVar) {
        this.f358056a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130820g gVar = this.f358056a;
        C145948p pVar = gVar.f358064d;
        C142787ac acVar = new C142787ac();
        acVar.f387581e = 1;
        acVar.mo117690b(new Section("thing_proto", false, 0));
        acVar.f387580d = 5;
        acVar.f387582f = new STSortSpec("(GET_NUM _LAST_USED_TIMESTAMP)");
        return C47633f.m84733g(C43205e.m76192b(pVar.mo122337a("type:Alarm", (String) obj, (String[]) null, 0, 50, acVar.mo117689a()))).mo51513e(C143842n.class, C130817d.f358058a, gVar.f358062b).mo51515h(C130818e.f358059a, gVar.f358062b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
