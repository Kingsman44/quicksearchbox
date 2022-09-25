package com.google.apps.tiktok.tracing;

import androidx.p060c.C0984n;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.tracing.bn */
/* compiled from: PG */
public class C47563bn {

    /* renamed from: a */
    private final C47563bn f123427a;

    /* renamed from: b */
    public final C0984n f123428b;

    /* renamed from: c */
    public boolean f123429c = false;

    public C47563bn(C47563bn bnVar, C0984n nVar) {
        if (bnVar != null) {
            C58838bb.m90868c(bnVar.f123429c);
        }
        this.f123427a = bnVar;
        this.f123428b = nVar;
    }

    /* renamed from: c */
    static C47563bn m84653c(Set set) {
        if (set.isEmpty()) {
            return C47562bm.f123426a;
        }
        if (set.size() == 1) {
            return (C47563bn) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            C47563bn bnVar = (C47563bn) it.next();
            do {
                i += bnVar.f123428b.f3122d;
                bnVar = bnVar.f123427a;
            } while (bnVar != null);
        }
        if (i == 0) {
            return C47562bm.f123426a;
        }
        C0984n nVar = new C0984n(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C47563bn bnVar2 = (C47563bn) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    C0984n nVar2 = bnVar2.f123428b;
                    if (i2 >= nVar2.f3122d) {
                        break;
                    }
                    C58838bb.m90873h(nVar.put((C47560bk) nVar2.mo3702e(i2), bnVar2.f123428b.mo3708h(i2)) == null, "Duplicate bindings: %s", bnVar2.f123428b.mo3702e(i2));
                    i2++;
                }
                bnVar2 = bnVar2.f123427a;
            } while (bnVar2 != null);
        }
        return new C47562bm((C47563bn) null, nVar).mo51424e();
    }

    /* renamed from: d */
    static C47563bn m84654d(C47563bn bnVar, C47563bn bnVar2) {
        if (bnVar.mo51427h()) {
            return bnVar2;
        }
        if (bnVar2.mo51427h()) {
            return bnVar;
        }
        return m84653c(C58528ij.m90011K(bnVar, bnVar2));
    }

    /* renamed from: i */
    public static C47559bj m84655i(C47560bk bkVar, C47563bn bnVar) {
        Object f = bnVar.mo51425f(bkVar);
        return f == null ? C47559bj.m84647d(3) : new C47559bj(1, f, false);
    }

    /* renamed from: b */
    public final C47561bl mo51423b() {
        return new C47562bm(this, new C0984n(0));
    }

    /* renamed from: e */
    public final C47563bn mo51424e() {
        if (!this.f123429c) {
            this.f123429c = true;
            C47563bn bnVar = this.f123427a;
            return (bnVar == null || !this.f123428b.isEmpty()) ? this : bnVar;
        }
        throw new IllegalStateException("Already frozen");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r2.f123427a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo51425f(com.google.apps.tiktok.tracing.C47560bk r3) {
        /*
            r2 = this;
            boolean r0 = r2.f123429c
            com.google.common.base.C58838bb.m90883r(r0)
            androidx.c.n r0 = r2.f123428b
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x0016
            com.google.apps.tiktok.tracing.bn r1 = r2.f123427a
            if (r1 == 0) goto L_0x0016
            java.lang.Object r3 = r1.mo51425f(r3)
            return r3
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.tracing.C47563bn.mo51425f(com.google.apps.tiktok.tracing.bk):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo51426g(C47560bk bkVar) {
        if (this.f123428b.containsKey(bkVar)) {
            return true;
        }
        C47563bn bnVar = this.f123427a;
        return bnVar != null && bnVar.mo51426g(bkVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo51427h() {
        return this == C47562bm.f123426a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (C47563bn bnVar = this; bnVar != null; bnVar = bnVar.f123427a) {
            for (int i = 0; i < bnVar.f123428b.f3122d; i++) {
                sb.append(this.f123428b.mo3708h(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
