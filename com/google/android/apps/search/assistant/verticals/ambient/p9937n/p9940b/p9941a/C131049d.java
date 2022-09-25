package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58539iu;
import com.google.common.p4522b.C58735qa;
import java.util.HashMap;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C131049d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131051f f358473a;

    /* renamed from: b */
    public final /* synthetic */ Instant f358474b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f358475c;

    public /* synthetic */ C131049d(C131051f fVar, Instant instant, C58485gu guVar) {
        this.f358473a = fVar;
        this.f358474b = instant;
        this.f358475c = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131051f fVar = this.f358473a;
        Instant instant = this.f358474b;
        C58485gu guVar = this.f358475c;
        UsageEvents queryEvents = ((UsageStatsManager) obj).queryEvents(instant.toEpochMilli(), fVar.f358479c.mo57444a().toEpochMilli());
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(C131050e.f358476a).collect(C58370cn.f155946a);
        C58480gp e = C58485gu.m89837e();
        while (queryEvents.hasNextEvent()) {
            UsageEvents.Event event = new UsageEvents.Event();
            queryEvents.getNextEvent(event);
            if (guVar2.contains(event.getPackageName())) {
                e.mo55395g(event);
            }
        }
        C58485gu f = e.mo55394f();
        C58539iu iuVar = new C58539iu(Comparator.CC.comparing(C131013b.f358412a));
        Collection.EL.forEach(f, new C131040c(fVar, iuVar, new HashMap()));
        return ((C58735qa) iuVar.mo55486f()).f156507e;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
