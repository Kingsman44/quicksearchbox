package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ala */
/* compiled from: PG */
final class ala extends aht {
    /* renamed from: a */
    public final void mo14776a(alb alb) {
        if (alb instanceof ais) {
            ((ais) alb).mo14836n();
            return;
        }
        int i = alb.f20850a;
        if (i == 0) {
            i = alb.mo14895s();
        }
        if (i == 13) {
            alb.f20850a = 9;
        } else if (i == 12) {
            alb.f20850a = 8;
        } else if (i == 14) {
            alb.f20850a = 10;
        } else {
            throw new IllegalStateException("Expected a name but was " + alc.m18902a(alb.mo14838p()) + alb.mo14896t());
        }
    }
}
