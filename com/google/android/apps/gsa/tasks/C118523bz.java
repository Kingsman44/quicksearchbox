package com.google.android.apps.gsa.tasks;

/* renamed from: com.google.android.apps.gsa.tasks.bz */
/* compiled from: PG */
final class C118523bz {
    /* renamed from: a */
    static int m196760a(C118522by byVar) {
        return (byVar.f329106cj * -2) - 1;
    }

    /* renamed from: b */
    static int m196761b(C118522by byVar) {
        return (byVar.f329106cj * -2) - 2;
    }

    /* renamed from: c */
    static C118466aa m196762c(int i) {
        if (i <= -1000000) {
            return C118466aa.NONEXCLUSIVE;
        }
        if (i % 2 == -1) {
            return C118466aa.EXCLUSIVE;
        }
        return C118466aa.PERIODIC;
    }

    /* renamed from: d */
    static boolean m196763d(int i, C118522by byVar) {
        C118522by byVar2;
        if (m196762c(i) != C118466aa.NONEXCLUSIVE) {
            if (m196762c(i) == C118466aa.NONEXCLUSIVE) {
                byVar2 = null;
            } else {
                byVar2 = C118522by.m196758b((-(i + 1)) / 2);
            }
            if (byVar == byVar2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
