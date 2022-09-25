package com.google.android.apps.search.podcasts.p10576l;

import com.google.common.base.C58817ah;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.l.bc */
/* compiled from: PG */
public final /* synthetic */ class C140468bc implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Duration f381550a;

    public /* synthetic */ C140468bc(Duration duration) {
        this.f381550a = duration;
    }

    public final Object apply(Object obj) {
        Duration duration = this.f381550a;
        C140450al alVar = (C140450al) obj;
        C140513y yVar = ((C140450al) ((C140448aj) alVar.toBuilder()).instance).f381517c;
        if (yVar == null) {
            yVar = C140513y.f381639d;
        }
        C140512x xVar = (C140512x) yVar.toBuilder();
        long millis = duration.toMillis();
        xVar.copyOnWrite();
        ((C140513y) xVar.instance).f381642b = millis;
        xVar.copyOnWrite();
        ((C140513y) xVar.instance).f381643c = true;
        C140448aj ajVar = (C140448aj) alVar.toBuilder();
        ajVar.copyOnWrite();
        C140513y yVar2 = (C140513y) xVar.build();
        yVar2.getClass();
        ((C140450al) ajVar.instance).f381517c = yVar2;
        return (C140450al) ajVar.build();
    }
}
