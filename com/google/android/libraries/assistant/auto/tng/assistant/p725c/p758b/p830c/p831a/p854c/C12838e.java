package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import androidx.p104d.p105a.C2169h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C59799g;
import com.google.common.p4552o.C60003j;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.e */
/* compiled from: PG */
public final /* synthetic */ class C12838e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C12844k f40067a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f40068b;

    /* renamed from: c */
    public final /* synthetic */ C51809dy f40069c;

    /* renamed from: d */
    public final /* synthetic */ AtomicLong f40070d;

    public /* synthetic */ C12838e(C12844k kVar, C60870cx cxVar, C51809dy dyVar, AtomicLong atomicLong) {
        this.f40067a = kVar;
        this.f40068b = cxVar;
        this.f40069c = dyVar;
        this.f40070d = atomicLong;
    }

    public final Object apply(Object obj) {
        C12844k kVar = this.f40067a;
        C60870cx cxVar = this.f40068b;
        C51809dy dyVar = this.f40069c;
        AtomicLong atomicLong = this.f40070d;
        C52070ec ecVar = (C52070ec) obj;
        String str = dyVar.f135936b;
        C59799g gVar = (C59799g) C60003j.f162165g.createBuilder();
        gVar.copyOnWrite();
        C60003j jVar = (C60003j) gVar.instance;
        str.getClass();
        jVar.f162167a |= 1;
        jVar.f162168b = str;
        long j = atomicLong.get();
        gVar.copyOnWrite();
        C60003j jVar2 = (C60003j) gVar.instance;
        jVar2.f162167a |= 8;
        jVar2.f162171e = j;
        long d = kVar.f40082f.mo26872d();
        gVar.copyOnWrite();
        C60003j jVar3 = (C60003j) gVar.instance;
        jVar3.f162167a |= 16;
        jVar3.f162172f = d;
        kVar.f40081e.add(C2169h.m6027a(new C12839f(kVar, cxVar, gVar)));
        return null;
    }
}
