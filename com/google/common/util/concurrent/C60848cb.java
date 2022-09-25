package com.google.common.util.concurrent;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import p3186j$.util.Objects;

/* renamed from: com.google.common.util.concurrent.cb */
/* compiled from: PG */
public final class C60848cb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60854ch f164931a;

    /* renamed from: b */
    final /* synthetic */ C58485gu f164932b;

    /* renamed from: c */
    final /* synthetic */ int f164933c;

    public C60848cb(C60854ch chVar, C58485gu guVar, int i) {
        this.f164931a = chVar;
        this.f164932b = guVar;
        this.f164933c = i;
    }

    public final void run() {
        C60854ch chVar = this.f164931a;
        C58485gu guVar = this.f164932b;
        int i = this.f164933c;
        C60870cx cxVar = (C60870cx) Objects.requireNonNull(chVar.f164945d[i]);
        chVar.f164945d[i] = null;
        int i2 = chVar.f164946e;
        while (true) {
            int i3 = ((C58724pq) guVar).f156474d;
            if (i2 >= i3) {
                chVar.f164946e = i3;
                return;
            } else if (((C60873d) guVar.get(i2)).mo57358p(cxVar)) {
                chVar.mo57337a();
                chVar.f164946e = i2 + 1;
                return;
            } else {
                i2++;
            }
        }
    }
}
