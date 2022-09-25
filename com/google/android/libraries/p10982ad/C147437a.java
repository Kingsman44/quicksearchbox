package com.google.android.libraries.p10982ad;

import android.animation.TimeAnimator;
import android.view.animation.AnimationUtils;

/* renamed from: com.google.android.libraries.ad.a */
/* compiled from: PG */
final class C147437a implements TimeAnimator.TimeListener {

    /* renamed from: a */
    final /* synthetic */ C147443g f397984a;

    public C147437a(C147443g gVar) {
        this.f397984a = gVar;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        C147443g gVar = this.f397984a;
        boolean z = true;
        if (gVar.mo124181g()) {
            gVar.mo124178d(true);
            this.f397984a.mo124177c();
            this.f397984a.f397995a.mo124198b(Long.MAX_VALUE).mo124194d();
            return;
        }
        long j3 = gVar.f398001g;
        gVar.f398001g = AnimationUtils.currentAnimationTimeMillis();
        C147443g gVar2 = this.f397984a;
        long j4 = gVar2.f398001g;
        if (j4 >= j3) {
            if (!gVar2.mo124181g()) {
                if (j4 == j3) {
                    gVar2.f398002h++;
                } else {
                    gVar2.f398002h = 0;
                }
            }
            C147451o b = gVar2.f397995a.mo124198b(j4);
            long j5 = this.f397984a.f398001g;
            boolean z2 = Math.abs(b.mo124190a(j5)) < 1.0E-4f && Math.abs(b.mo124191b(j5)) < 0.006f;
            C147443g gVar3 = this.f397984a;
            C147452p pVar = gVar3.f397995a;
            long j6 = gVar3.f398001g;
            long j7 = pVar.f398018b;
            if (!z2 || j7 > j6) {
                z = false;
            }
            gVar3.mo124178d(z);
            this.f397984a.mo124177c();
            if (z2) {
                b.mo124194d();
                return;
            }
            return;
        }
        throw new IllegalStateException("Time going backwards is not supported.");
    }
}
