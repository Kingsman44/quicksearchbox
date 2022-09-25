package com.google.android.apps.gsa.sidekick.shared.monet.p7252h;

import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.h.c */
/* compiled from: PG */
abstract class C91844c {
    /* renamed from: a */
    public abstract int mo86312a();

    /* renamed from: b */
    public abstract int mo86313b();

    /* renamed from: c */
    public abstract int mo86314c();

    /* renamed from: d */
    public abstract int mo86315d();

    /* renamed from: e */
    public abstract int mo86316e();

    /* renamed from: f */
    public abstract int mo86318f();

    /* renamed from: g */
    public abstract int mo86319g();

    /* renamed from: h */
    public abstract int mo86320h();

    /* renamed from: i */
    public abstract long mo86322i();

    /* renamed from: j */
    public abstract long mo86323j();

    /* renamed from: k */
    public abstract C58485gu mo86324k();

    /* renamed from: l */
    public abstract String mo86325l();

    /* renamed from: m */
    public abstract boolean mo86326m();

    /* renamed from: n */
    public final void mo86329n(C91857e eVar, int i, int i2) {
        C7751ip ipVar = (C7751ip) C7752iq.f27124E.createBuilder();
        long j = mo86323j();
        ipVar.copyOnWrite();
        C7752iq iqVar = (C7752iq) ipVar.instance;
        iqVar.f27131a |= 1048576;
        iqVar.f27154x = j;
        long i3 = mo86322i();
        ipVar.copyOnWrite();
        C7752iq iqVar2 = (C7752iq) ipVar.instance;
        iqVar2.f27131a |= 64;
        iqVar2.f27142l = i3;
        boolean m = mo86326m();
        ipVar.copyOnWrite();
        C7752iq iqVar3 = (C7752iq) ipVar.instance;
        iqVar3.f27131a |= 256;
        iqVar3.f27143m = m;
        if (i2 == -2147483647) {
            i2 = mo86314c();
        }
        ipVar.copyOnWrite();
        C7752iq iqVar4 = (C7752iq) ipVar.instance;
        iqVar4.f27131a |= 4096;
        iqVar4.f27147q = i2;
        if (i == -2147483647) {
            i = mo86312a();
        }
        ipVar.copyOnWrite();
        C7752iq iqVar5 = (C7752iq) ipVar.instance;
        iqVar5.f27131a |= 512;
        iqVar5.f27144n = i;
        int b = mo86313b();
        ipVar.copyOnWrite();
        C7752iq iqVar6 = (C7752iq) ipVar.instance;
        iqVar6.f27131a |= 16384;
        iqVar6.f27149s = b;
        int d = mo86315d();
        ipVar.copyOnWrite();
        C7752iq iqVar7 = (C7752iq) ipVar.instance;
        iqVar7.f27131a |= 8192;
        iqVar7.f27148r = d;
        ipVar.copyOnWrite();
        C7752iq iqVar8 = (C7752iq) ipVar.instance;
        iqVar8.f27131a |= 1024;
        iqVar8.f27145o = mo86320h();
        int e = mo86316e();
        ipVar.copyOnWrite();
        C7752iq iqVar9 = (C7752iq) ipVar.instance;
        iqVar9.f27131a |= 2048;
        iqVar9.f27146p = e;
        ipVar.copyOnWrite();
        C7752iq iqVar10 = (C7752iq) ipVar.instance;
        iqVar10.f27131a |= 32768;
        iqVar10.f27150t = mo86318f();
        int g = mo86319g();
        ipVar.copyOnWrite();
        C7752iq iqVar11 = (C7752iq) ipVar.instance;
        iqVar11.f27131a |= 65536;
        iqVar11.f27151u = g;
        eVar.mo86359a("EVENT_ENTRY_VIEW", mo86325l(), C23245b.m43556a((C7752iq) ipVar.build()));
    }
}
