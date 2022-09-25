package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.p489g.p493c.C9132e;
import com.google.android.apps.p489g.p493c.C9133f;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8173yf;
import com.google.p375ai.p378b.C8174yg;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.bj */
/* compiled from: PG */
abstract class C91525bj {

    /* renamed from: a */
    public static final C59071e f255276a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.bj");

    /* renamed from: b */
    private static final C91525bj f255277b = new C91522bg();

    /* renamed from: c */
    private static final C91525bj f255278c = new C91523bh();

    /* renamed from: d */
    private static final C91525bj f255279d = new C91524bi();

    /* renamed from: f */
    static C91525bj m149693f(C7874nd ndVar) {
        if ((ndVar.f27589a & 4) == 0) {
            return f255277b;
        }
        C8174yg ygVar = ndVar.f27593e;
        if (ygVar == null) {
            ygVar = C8174yg.f28719i;
        }
        if (ygVar.f28722b.size() > 1) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        } else if (ygVar.f28722b.size() != 0) {
            C8174yg ygVar2 = ndVar.f27593e;
            if (ygVar2 == null) {
                ygVar2 = C8174yg.f28719i;
            }
            C8173yf a = C8173yf.m22962a(ygVar2.f28722b.mo58914d(0));
            if (a == null) {
                a = C8173yf.AT_TIME;
            }
            if (a != C8173yf.AT_LOCATION) {
                if (a == C8173yf.AT_TIME) {
                    if ((ygVar.f28721a & 2) != 0) {
                        return f255279d;
                    }
                    C58976aa aaVar2 = C58975e.f156826a;
                }
                return null;
            } else if (ygVar.f28724e.size() != 0) {
                return f255278c;
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                return null;
            }
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            return null;
        }
    }

    /* renamed from: g */
    protected static final long m149694g(C9133f fVar, boolean z) {
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        if ((ndVar.f27589a & 8) != 0) {
            return ndVar.f27594f;
        }
        C7718hj hjVar2 = fVar.f31432b;
        if (hjVar2 == null) {
            hjVar2 = C7718hj.f26927af;
        }
        C7746ik a = C7746ik.m22834a(hjVar2.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a == C7746ik.REMINDER || !z) {
            return Long.MAX_VALUE;
        }
        long j = ndVar.f27595g;
        if (j != 0) {
            return j + TimeUnit.HOURS.toSeconds(12);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: h */
    protected static final boolean m149695h(C9133f fVar, boolean z) {
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        if ((ndVar.f27589a & 8) == 0) {
            return z && ndVar.f27595g != 0;
        }
        return true;
    }

    /* renamed from: i */
    protected static final boolean m149696i(C9133f fVar) {
        return fVar.f31434d && !fVar.f31435e;
    }

    /* renamed from: k */
    static final long m149698k(C9133f fVar, boolean z, boolean z2) {
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if (a != C7746ik.REMINDER && z && !m149695h(fVar, z2)) {
            return 0;
        }
        if (!m149696i(fVar)) {
            return Long.MAX_VALUE;
        }
        return m149694g(fVar, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo85862a(C9133f fVar);

    /* renamed from: b */
    public abstract boolean mo85863b(C9133f fVar, long j, List list);

    /* renamed from: c */
    public void mo85864c(C9132e eVar, Map map, C58881cr crVar) {
    }

    /* renamed from: d */
    public boolean mo85865d(C7874nd ndVar, C7874nd ndVar2) {
        return m149693f(ndVar) != m149693f(ndVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo85866e(C9133f fVar, long j, boolean z, boolean z2) {
        if (fVar.f31434d || fVar.f31435e) {
            return Long.MAX_VALUE;
        }
        C7718hj hjVar = fVar.f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7746ik a = C7746ik.m22834a(hjVar.f26966g);
        if (a == null) {
            a = C7746ik.UNKNOWN;
        }
        if ((a == C7746ik.REMINDER || !z || m149695h(fVar, z2)) && m149694g(fVar, z2) >= j) {
            return mo85862a(fVar);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: j */
    protected static final boolean m149697j(C9133f fVar, long j, Long l) {
        long j2;
        if (l == null && (fVar.f31431a & 128) == 0) {
            return false;
        }
        if (l == null) {
            l = 0L;
        }
        if ((fVar.f31431a & 128) != 0) {
            j2 = (((long) fVar.f31439i) * 86400000) / 1000;
        } else {
            j2 = l.longValue();
        }
        if (j - fVar.f31437g <= j2) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }
}
