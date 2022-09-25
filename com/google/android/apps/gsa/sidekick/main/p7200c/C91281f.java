package com.google.android.apps.gsa.sidekick.main.p7200c;

import com.google.android.apps.gsa.sidekick.main.entry.C91330bh;
import com.google.android.apps.gsa.sidekick.main.entry.C91346bx;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7725hq;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7746ik;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.c.f */
/* compiled from: PG */
public final class C91281f extends C91346bx {
    public C91281f(C91330bh bhVar) {
        super(bhVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85554a(C7718hj hjVar) {
        C7746ik ikVar = C7746ik.UNKNOWN;
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a.ordinal() != 13) {
            return null;
        }
        return new C91279d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo85555b(C7718hj hjVar, List list) {
        C7725hq hqVar = (C7725hq) C7726hr.f27008i.createBuilder();
        hqVar.copyOnWrite();
        C7726hr hrVar = (C7726hr) hqVar.instance;
        hrVar.f27015f = hjVar;
        hrVar.f27010a |= 2;
        hqVar.mo16949b(list);
        C7726hr hrVar2 = (C7726hr) hqVar.build();
        C7746ik ikVar = C7746ik.UNKNOWN;
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 14 || ordinal == 17 || ordinal == 18) {
            return new C91279d(this, hrVar2);
        }
        return null;
    }
}
