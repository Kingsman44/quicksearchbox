package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.do */
/* compiled from: PG */
final class C6881do implements C7333uh, C7034jf {

    /* renamed from: a */
    final /* synthetic */ C6885ds f21902a;

    /* renamed from: b */
    private final C6883dq f21903b;

    /* renamed from: c */
    private C7332ug f21904c;

    /* renamed from: d */
    private C7033je f21905d;

    public C6881do(C6885ds dsVar, C6883dq dqVar) {
        this.f21902a = dsVar;
        this.f21904c = dsVar.f21918e;
        this.f21905d = dsVar.f21919f;
        this.f21903b = dqVar;
    }

    /* renamed from: g */
    private final boolean m20054g(int i, C7321tw twVar) {
        C7321tw twVar2 = null;
        if (twVar != null) {
            C6883dq dqVar = this.f21903b;
            int i2 = 0;
            while (true) {
                if (i2 >= dqVar.f21911c.size()) {
                    break;
                } else if (((C7321tw) dqVar.f21911c.get(i2)).f23862d == twVar.f23862d) {
                    twVar2 = twVar.mo16541a(Pair.create(dqVar.f21910b, twVar.f23859a));
                    break;
                } else {
                    i2++;
                }
            }
            if (twVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.f21903b.f21912d;
        C7332ug ugVar = this.f21904c;
        if (ugVar.f23893a != i3 || !aeu.m18533c(ugVar.f23894b, twVar2)) {
            this.f21904c = this.f21902a.f21918e.mo16552a(i3, twVar2, 0);
        }
        C7033je jeVar = this.f21905d;
        if (jeVar.f22538a == i3 && aeu.m18533c(jeVar.f22539b, twVar2)) {
            return true;
        }
        this.f21905d = this.f21902a.f21919f.mo16067a(i3, twVar2);
        return true;
    }

    /* renamed from: U */
    public final void mo15712U(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        if (m20054g(i, twVar)) {
            this.f21904c.mo16557f(toVar, ttVar);
        }
    }

    /* renamed from: V */
    public final void mo15713V(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        if (m20054g(i, twVar)) {
            this.f21904c.mo16560i(toVar, ttVar);
        }
    }

    /* renamed from: W */
    public final void mo15714W(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        if (m20054g(i, twVar)) {
            this.f21904c.mo16563l(toVar, ttVar);
        }
    }

    /* renamed from: X */
    public final void mo15715X(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar, IOException iOException, boolean z) {
        if (m20054g(i, twVar)) {
            this.f21904c.mo16566o(toVar, ttVar, iOException, z);
        }
    }

    /* renamed from: Y */
    public final void mo15716Y(int i, C7321tw twVar, C7318tt ttVar) {
        if (m20054g(i, twVar)) {
            this.f21904c.mo16568q(ttVar);
        }
    }

    /* renamed from: Z */
    public final void mo15717Z(int i, C7321tw twVar, C7318tt ttVar) {
        if (m20054g(i, twVar)) {
            this.f21904c.mo16570s(ttVar);
        }
    }
}
