package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6130c;

import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5218j.C67042ix;
import com.google.speech.p5218j.C67066ju;
import com.google.speech.p5218j.C67079kg;
import com.google.speech.p5218j.C67082kj;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67095kw;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.c.a */
/* compiled from: PG */
public final class C77827a {
    /* renamed from: b */
    public static Optional m124845b(C67083kk kkVar) {
        int i = kkVar.f182354b;
        if (i == 1) {
            C67095kw kwVar = ((C67042ix) kkVar.f182355c).f182237i;
            if (kwVar == null) {
                kwVar = C67095kw.f182399i;
            }
            return m124848e(kwVar);
        } else if (i == 4) {
            C67095kw kwVar2 = ((C67079kg) kkVar.f182355c).f182346e;
            if (kwVar2 == null) {
                kwVar2 = C67095kw.f182399i;
            }
            return m124848e(kwVar2);
        } else if (i != 2) {
            return Optional.empty();
        } else {
            C67095kw kwVar3 = ((C67066ju) kkVar.f182355c).f182308e;
            if (kwVar3 == null) {
                kwVar3 = C67095kw.f182399i;
            }
            return m124848e(kwVar3);
        }
    }

    /* renamed from: c */
    public static Optional m124846c(C67083kk kkVar) {
        C67042ix ixVar;
        if (kkVar.f182354b == 1) {
            ixVar = (C67042ix) kkVar.f182355c;
        } else {
            ixVar = C67042ix.f182227l;
        }
        C67095kw kwVar = ixVar.f182237i;
        if (kwVar == null) {
            kwVar = C67095kw.f182399i;
        }
        int i = kwVar.f182401a;
        if ((i & 8) == 0 || (i & 2) == 0 || (i & 16) == 0 || (i & 256) == 0) {
            return Optional.empty();
        }
        return Optional.m71637of(Duration.ofMillis((((kwVar.f182404d - kwVar.f182402b) / 1000) + kwVar.f182405e) - kwVar.f182407g));
    }

    /* renamed from: d */
    public static List m124847d(C67083kk kkVar) {
        int i = kkVar.f182354b;
        if (i == 2) {
            return ((C67066ju) kkVar.f182355c).f182305b;
        }
        if (i == 1) {
            return ((C67042ix) kkVar.f182355c).f182230b;
        }
        if (i == 4) {
            return ((C67079kg) kkVar.f182355c).f182343b;
        }
        return C58485gu.m89845m();
    }

    /* renamed from: e */
    private static Optional m124848e(C67095kw kwVar) {
        long j = kwVar.f182404d;
        long j2 = kwVar.f182403c;
        if (j == 0) {
            if (j2 == 0) {
                return Optional.empty();
            }
            j = 0;
        }
        return Optional.m71637of(Duration.m71141of(j, ChronoUnit.MICROS));
    }

    /* renamed from: a */
    public static Optional m124844a(C67083kk kkVar) {
        int a = C67082kj.m97421a(kkVar.f182354b);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            return Optional.m71637of(C77556ai.FINAL);
        } else {
            if (i == 1) {
                return Optional.m71637of(C77556ai.PARTIAL);
            }
            if (i != 2) {
                return Optional.empty();
            }
            return Optional.m71637of(C77556ai.PREFETCH);
        }
    }
}
