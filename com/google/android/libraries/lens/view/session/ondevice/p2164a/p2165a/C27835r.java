package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24451f;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24462q;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24463r;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24464s;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.r */
/* compiled from: PG */
final class C27835r {

    /* renamed from: a */
    private final Map f75903a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C27842y f75904b;

    public C27835r(C27842y yVar) {
        this.f75904b = yVar;
    }

    /* renamed from: b */
    private final synchronized C60870cx m51855b(String str) {
        C60870cx h;
        C27842y yVar = this.f75904b;
        C24462q qVar = (C24462q) C24463r.f66960c.createBuilder();
        C24464s sVar = (C24464s) C24465t.f66964f.createBuilder();
        sVar.copyOnWrite();
        C24465t tVar = (C24465t) sVar.instance;
        str.getClass();
        tVar.f66966a |= 1;
        tVar.f66967b = str;
        sVar.copyOnWrite();
        C24465t tVar2 = (C24465t) sVar.instance;
        tVar2.f66966a |= 8;
        tVar2.f66970e = "GddLensText";
        qVar.copyOnWrite();
        C24463r rVar = (C24463r) qVar.instance;
        C24465t tVar3 = (C24465t) sVar.build();
        tVar3.getClass();
        rVar.f66963b = tVar3;
        rVar.f66962a |= 1;
        h = C60922j.m93045h(((C24451f) yVar.f75912b.mo27525b()).mo29905a(C58485gu.m89846n((C24463r) qVar.build())), C47810es.m84966f(new C27839v(yVar, str)), C60826bg.f164896a);
        this.f75903a.put(str, h);
        return h;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo33325a(String str) {
        return (C60870cx) C58833ax.m90833j((C60870cx) this.f75903a.get(str)).mo56109e(m51855b(str));
    }
}
