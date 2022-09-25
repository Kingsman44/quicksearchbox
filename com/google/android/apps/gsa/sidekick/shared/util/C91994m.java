package com.google.android.apps.gsa.sidekick.shared.util;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.p375ai.p378b.C7666fl;
import com.google.p375ai.p378b.C7668fn;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7746ik;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.m */
/* compiled from: PG */
public final class C91994m {
    /* renamed from: a */
    public static long m150994a(C7669fo foVar) {
        if (foVar == null) {
            return 0;
        }
        C7668fn a = C7668fn.m22799a(foVar.f26637c);
        if (a == null) {
            a = C7668fn.TYPE_UNDEFINED;
        }
        int i = a.f26632m;
        String str = foVar.f26636b;
        long j = foVar.f26638d;
        return C91042a.m148718b(i + str + j);
    }

    /* renamed from: b */
    public static long m150995b(C7718hj hjVar) {
        if (hjVar == null) {
            return 0;
        }
        C7669fo foVar = hjVar.f26968i;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        return m150994a(foVar);
    }

    /* renamed from: c */
    public static C7669fo m150996c(C7726hr hrVar) {
        C7718hj hjVar;
        int i = hrVar.f27010a;
        if ((i & 2) != 0) {
            hjVar = hrVar.f27015f;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
        } else if ((i & 8) != 0) {
            hjVar = hrVar.f27016g;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
        } else {
            hjVar = hrVar.f27013d.size() > 0 ? (C7718hj) hrVar.f27013d.get(0) : null;
        }
        if (hjVar != null) {
            C7669fo foVar = hjVar.f26968i;
            if (foVar == null) {
                return C7669fo.f26633e;
            }
            return foVar;
        }
        C7666fl flVar = (C7666fl) C7669fo.f26633e.createBuilder();
        flVar.copyOnWrite();
        C7669fo foVar2 = (C7669fo) flVar.instance;
        foVar2.f26635a |= 1;
        foVar2.f26636b = "missing.f";
        C7668fn fnVar = C7668fn.CARD;
        flVar.copyOnWrite();
        C7669fo foVar3 = (C7669fo) flVar.instance;
        foVar3.f26637c = fnVar.f26632m;
        foVar3.f26635a |= 2;
        long a = C91978bb.m150935a(C7746ik.GENERIC_CARD, C90734ar.m148198a(hrVar.toByteArray()));
        flVar.copyOnWrite();
        C7669fo foVar4 = (C7669fo) flVar.instance;
        foVar4.f26635a |= 4;
        foVar4.f26638d = a;
        return (C7669fo) flVar.build();
    }

    /* renamed from: d */
    public static String m150997d(C7669fo foVar) {
        long j = foVar.f26638d;
        String str = foVar.f26636b;
        C7668fn a = C7668fn.m22799a(foVar.f26637c);
        if (a == null) {
            a = C7668fn.TYPE_UNDEFINED;
        }
        String name = a.name();
        return "[" + j + "," + str + "," + name + "]";
    }

    /* renamed from: e */
    public static String m150998e(C7726hr hrVar) {
        C7669fo c = m150996c(hrVar);
        return c != null ? m150997d(c) : BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public static boolean m150999f(C7726hr hrVar, C7669fo foVar) {
        if ((hrVar.f27010a & 2) != 0) {
            C7718hj hjVar = hrVar.f27015f;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            C7669fo foVar2 = hjVar.f26968i;
            if (foVar2 == null) {
                foVar2 = C7669fo.f26633e;
            }
            if (foVar.equals(foVar2)) {
                return true;
            }
        }
        if ((hrVar.f27010a & 8) != 0) {
            C7718hj hjVar2 = hrVar.f27016g;
            if (hjVar2 == null) {
                hjVar2 = C7718hj.f26927af;
            }
            C7669fo foVar3 = hjVar2.f26968i;
            if (foVar3 == null) {
                foVar3 = C7669fo.f26633e;
            }
            if (foVar.equals(foVar3)) {
                return true;
            }
        }
        for (C7718hj hjVar3 : hrVar.f27013d) {
            C7669fo foVar4 = hjVar3.f26968i;
            if (foVar4 == null) {
                foVar4 = C7669fo.f26633e;
            }
            if (foVar.equals(foVar4)) {
                return true;
            }
        }
        for (C7726hr f : hrVar.f27012c) {
            if (m150999f(f, foVar)) {
                return true;
            }
        }
        return false;
    }
}
