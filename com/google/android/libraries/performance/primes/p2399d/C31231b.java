package com.google.android.libraries.performance.primes.p2399d;

import android.content.Context;
import android.os.Process;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71263cs;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71264ct;

/* renamed from: com.google.android.libraries.performance.primes.d.b */
/* compiled from: PG */
public final class C31231b {
    /* renamed from: a */
    public static C71264ct m58233a(String str, Context context) {
        C71263cs csVar = (C71263cs) C71264ct.f190277f.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        csVar.copyOnWrite();
        C71264ct ctVar = (C71264ct) csVar.instance;
        ctVar.f190279a |= 1;
        ctVar.f190280b = elapsedCpuTime;
        boolean c = C31230a.m58231c(context);
        csVar.copyOnWrite();
        C71264ct ctVar2 = (C71264ct) csVar.instance;
        ctVar2.f190279a |= 2;
        ctVar2.f190281c = c;
        int activeCount = Thread.activeCount();
        csVar.copyOnWrite();
        C71264ct ctVar3 = (C71264ct) csVar.instance;
        ctVar3.f190279a |= 4;
        ctVar3.f190282d = activeCount;
        if (str != null) {
            csVar.copyOnWrite();
            C71264ct ctVar4 = (C71264ct) csVar.instance;
            ctVar4.f190279a |= 8;
            ctVar4.f190283e = str;
        }
        return (C71264ct) csVar.build();
    }
}
