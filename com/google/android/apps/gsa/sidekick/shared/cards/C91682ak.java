package com.google.android.apps.gsa.sidekick.shared.cards;

import com.google.android.apps.gsa.sidekick.shared.util.C91997p;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C8144xd;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.ak */
/* compiled from: PG */
public final class C91682ak extends C91997p {

    /* renamed from: a */
    private boolean f255678a;

    /* renamed from: b */
    private C7726hr f255679b;

    /* renamed from: g */
    private static final boolean m150071g(int i) {
        return i == 2 || i == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo86071a(C7718hj hjVar, C7718hj hjVar2) {
        int i = 1;
        if (this.f255678a) {
            return true;
        }
        int i2 = hjVar.f26955a;
        if ((134217728 & i2) != 0) {
            if ((i2 & 4194304) != 0) {
                int a = C8144xd.m22956a(hjVar.f26929A);
                if (a == 0) {
                    a = 1;
                }
                if (!m150071g(a)) {
                    return false;
                }
            }
            return true;
        }
        int a2 = C8144xd.m22956a(hjVar.f26929A);
        if (a2 != 0) {
            i = a2;
        }
        return m150071g(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo86159c(C7726hr hrVar) {
        if ((hrVar.f27010a & 8) != 0) {
            C7718hj hjVar = hrVar.f27016g;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            if ((hjVar.f26955a & 4194304) != 0) {
                C7718hj hjVar2 = hrVar.f27016g;
                if (hjVar2 == null) {
                    hjVar2 = C7718hj.f26927af;
                }
                int a = C8144xd.m22956a(hjVar2.f26929A);
                if (a == 0) {
                    a = 1;
                }
                if (m150071g(a)) {
                    this.f255679b = hrVar;
                    this.f255678a = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo86160d(C7726hr hrVar) {
        if (this.f255679b == hrVar) {
            this.f255679b = null;
            this.f255678a = false;
        }
    }
}
