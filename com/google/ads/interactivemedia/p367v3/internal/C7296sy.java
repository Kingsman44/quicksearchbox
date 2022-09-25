package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sy */
/* compiled from: PG */
final class C7296sy implements C7333uh, C7034jf {

    /* renamed from: a */
    final /* synthetic */ C7299ta f23782a;

    /* renamed from: b */
    private final Object f23783b;

    /* renamed from: c */
    private C7332ug f23784c;

    /* renamed from: d */
    private C7033je f23785d;

    public C7296sy(C7299ta taVar, Object obj) {
        this.f23782a = taVar;
        this.f23784c = taVar.mo16471f((C7321tw) null);
        this.f23785d = taVar.mo16473h((C7321tw) null);
        this.f23783b = obj;
    }

    /* renamed from: g */
    private final boolean m21766g(int i, C7321tw twVar) {
        C7321tw twVar2;
        if (twVar != null) {
            twVar2 = this.f23782a.mo16513A(this.f23783b, twVar);
            if (twVar2 == null) {
                return false;
            }
        } else {
            twVar2 = null;
        }
        int z = this.f23782a.mo16520z(this.f23783b, i);
        C7332ug ugVar = this.f23784c;
        if (ugVar.f23893a != z || !aeu.m18533c(ugVar.f23894b, twVar2)) {
            this.f23784c = this.f23782a.mo16485t(z, twVar2);
        }
        C7033je jeVar = this.f23785d;
        if (jeVar.f22538a == z && aeu.m18533c(jeVar.f22539b, twVar2)) {
            return true;
        }
        this.f23785d = this.f23782a.mo16474i(z, twVar2);
        return true;
    }

    /* renamed from: h */
    private static final C7318tt m21767h(C7318tt ttVar) {
        long j = ttVar.f23857f;
        long j2 = ttVar.f23858g;
        return ttVar;
    }

    /* renamed from: U */
    public final void mo15712U(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        if (m21766g(i, twVar)) {
            C7332ug ugVar = this.f23784c;
            m21767h(ttVar);
            ugVar.mo16557f(toVar, ttVar);
        }
    }

    /* renamed from: V */
    public final void mo15713V(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        if (m21766g(i, twVar)) {
            C7332ug ugVar = this.f23784c;
            m21767h(ttVar);
            ugVar.mo16560i(toVar, ttVar);
        }
    }

    /* renamed from: W */
    public final void mo15714W(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar) {
        if (m21766g(i, twVar)) {
            C7332ug ugVar = this.f23784c;
            m21767h(ttVar);
            ugVar.mo16563l(toVar, ttVar);
        }
    }

    /* renamed from: X */
    public final void mo15715X(int i, C7321tw twVar, C7313to toVar, C7318tt ttVar, IOException iOException, boolean z) {
        if (m21766g(i, twVar)) {
            C7332ug ugVar = this.f23784c;
            m21767h(ttVar);
            ugVar.mo16566o(toVar, ttVar, iOException, z);
        }
    }

    /* renamed from: Y */
    public final void mo15716Y(int i, C7321tw twVar, C7318tt ttVar) {
        if (m21766g(i, twVar)) {
            C7332ug ugVar = this.f23784c;
            m21767h(ttVar);
            ugVar.mo16568q(ttVar);
        }
    }

    /* renamed from: Z */
    public final void mo15717Z(int i, C7321tw twVar, C7318tt ttVar) {
        if (m21766g(i, twVar)) {
            C7332ug ugVar = this.f23784c;
            m21767h(ttVar);
            ugVar.mo16570s(ttVar);
        }
    }
}
