package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aao */
/* compiled from: PG */
public final class aao implements Comparable {

    /* renamed from: a */
    private final boolean f20091a;

    /* renamed from: b */
    private final boolean f20092b;

    public aao(C6864cy cyVar, int i) {
        this.f20091a = 1 != (cyVar.f21804d & 1) ? false : true;
        this.f20092b = aaw.m18093b(i, false);
    }

    /* renamed from: a */
    public final int compareTo(aao aao) {
        return aqv.m19338g().mo15220d(this.f20092b, aao.f20092b).mo15220d(this.f20091a, aao.f20091a).mo15221e();
    }
}
