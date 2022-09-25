package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.assistant.p3897e.p3929l.p3930a.C52668aa;
import com.google.assistant.p3897e.p3929l.p3930a.C52669ab;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.b */
/* compiled from: PG */
public final /* synthetic */ class C131975b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f360314a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f360315b;

    public /* synthetic */ C131975b(C60870cx cxVar, C60870cx cxVar2) {
        this.f360314a = cxVar;
        this.f360315b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f360314a;
        String str = (String) C60856cj.m92909r(this.f360315b);
        str.getClass();
        String b = C131948aa.m214404b(str);
        C52668aa aaVar = (C52668aa) C52669ab.f138265d.createBuilder();
        aaVar.copyOnWrite();
        C52669ab abVar = (C52669ab) aaVar.instance;
        abVar.f138267a |= 1;
        abVar.f138268b = str;
        return (C58485gu) Stream.CC.concat(Stream.CC.m71935of((C52669ab) aaVar.build()), Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar)).map(C131981c.f360321a).flatMap(C132002d.f360342a)).map(new C132003e(b)).collect(C58370cn.f155946a);
    }
}
