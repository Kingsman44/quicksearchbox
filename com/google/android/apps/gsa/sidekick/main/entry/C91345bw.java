package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7833lq;
import com.google.p375ai.p378b.C7834lr;
import com.google.p375ai.p378b.C7991rm;
import com.google.p375ai.p378b.C7994rp;
import com.google.p375ai.p378b.C8072um;
import com.google.p375ai.p378b.C8074uo;
import com.google.p375ai.p378b.C8075up;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bw */
/* compiled from: PG */
public final class C91345bw implements C91326bd {

    /* renamed from: a */
    private final C8074uo f254899a;

    /* renamed from: b */
    private final byte[] f254900b;

    /* renamed from: b */
    private static byte[] m149364b(C7718hj hjVar) {
        if (hjVar == null) {
            return null;
        }
        for (C7708h hVar : hjVar.f26935G) {
            C7681g a = C7681g.m22802a(hVar.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (a != C7681g.INTEREST_PICKER_ADD) {
                int i = hVar.f26897b;
                C7681g a2 = C7681g.m22802a(i);
                if (a2 == null) {
                    a2 = C7681g.INVALID;
                }
                if (a2 != C7681g.INTEREST_PICKER_CLEAR) {
                    C7681g a3 = C7681g.m22802a(i);
                    if (a3 == null) {
                        a3 = C7681g.INVALID;
                    }
                    if (a3 != C7681g.INTEREST_PICKER_REMOVE) {
                        continue;
                    }
                }
            }
            if ((hVar.f26896a & 128) != 0) {
                return hVar.f26904i.mo59174N();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C58833ax mo85522a(C7718hj hjVar) {
        byte[] b = m149364b(hjVar);
        byte[] bArr = this.f254900b;
        if (!(b == null || bArr == null || !Arrays.equals(b, bArr))) {
            C7834lr lrVar = hjVar.f26981v;
            if (lrVar == null) {
                lrVar = C7834lr.f27467c;
            }
            if (lrVar.f27469a.size() != 0) {
                C7711hc hcVar = (C7711hc) hjVar.toBuilder();
                C7834lr lrVar2 = ((C7718hj) hcVar.instance).f26981v;
                if (lrVar2 == null) {
                    lrVar2 = C7834lr.f27467c;
                }
                C7833lq lqVar = (C7833lq) lrVar2.toBuilder();
                for (int i = 0; i < Collections.unmodifiableList(((C7834lr) lqVar.instance).f27469a).size(); i++) {
                    C7994rp rpVar = (C7994rp) ((C7834lr) lqVar.instance).f27469a.get(i);
                    if ((rpVar.f28072a & C89885b.NOW_VALUE) != 0) {
                        C7991rm rmVar = (C7991rm) rpVar.toBuilder();
                        C8075up upVar = rpVar.f28082k;
                        if (upVar == null) {
                            upVar = C8075up.f28418l;
                        }
                        C8072um umVar = (C8072um) upVar.toBuilder();
                        C8074uo uoVar = this.f254899a;
                        umVar.copyOnWrite();
                        C8075up upVar2 = (C8075up) umVar.instance;
                        upVar2.f28427h = uoVar.f28417d;
                        upVar2.f28420a |= 64;
                        rmVar.copyOnWrite();
                        C7994rp rpVar2 = (C7994rp) rmVar.instance;
                        C8075up upVar3 = (C8075up) umVar.build();
                        upVar3.getClass();
                        rpVar2.f28082k = upVar3;
                        rpVar2.f28072a |= C89885b.NOW_VALUE;
                        lqVar.copyOnWrite();
                        C7834lr lrVar3 = (C7834lr) lqVar.instance;
                        C7994rp rpVar3 = (C7994rp) rmVar.build();
                        rpVar3.getClass();
                        C62971cq cqVar = lrVar3.f27469a;
                        if (!cqVar.mo58948c()) {
                            lrVar3.f27469a = C62942bv.mutableCopy(cqVar);
                        }
                        lrVar3.f27469a.set(i, rpVar3);
                    }
                }
                hcVar.copyOnWrite();
                C7718hj hjVar2 = (C7718hj) hcVar.instance;
                C7834lr lrVar4 = (C7834lr) lqVar.build();
                lrVar4.getClass();
                hjVar2.f26981v = lrVar4;
                hjVar2.f26955a |= C89885b.S3REQUEST_VALUE;
                return C58833ax.m90834k((C7718hj) hcVar.build());
            }
        }
        return C58836b.f156633a;
    }

    public C91345bw(C7718hj hjVar, C8074uo uoVar) {
        uoVar.getClass();
        this.f254899a = uoVar;
        this.f254900b = m149364b(hjVar);
    }
}
