package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91331bi;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7694gm;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C8178yk;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.aq */
/* compiled from: PG */
final class C98062aq extends C91953ad {

    /* renamed from: a */
    final C58485gu f273798a;

    /* renamed from: b */
    final C91307al f273799b;

    /* renamed from: c */
    final C90998g f273800c;

    /* renamed from: d */
    final List f273801d;

    /* renamed from: e */
    int f273802e = 0;

    public C98062aq(C58485gu guVar, C91307al alVar, C90998g gVar) {
        this.f273798a = guVar;
        this.f273799b = alVar;
        this.f273800c = gVar;
        this.f273801d = C58597ky.m90211b(guVar);
    }

    /* renamed from: g */
    private static C7718hj m162350g(C7718hj hjVar, C7718hj hjVar2) {
        C58976aa aaVar = C58975e.f156826a;
        C7711hc hcVar = (C7711hc) hjVar2.toBuilder();
        if (hjVar.f26954Z.size() != 0) {
            hcVar.copyOnWrite();
            ((C7718hj) hcVar.instance).f26954Z = C7718hj.emptyProtobufList();
            hcVar.mo16938a(hjVar.f26954Z);
            C7746ik ikVar = C7746ik.UNKNOWN;
        }
        if ((hjVar.f26961b & 1048576) != 0) {
            C7694gm gmVar = hjVar.f26956aa;
            if (gmVar == null) {
                gmVar = C7694gm.f26861e;
            }
            hcVar.copyOnWrite();
            C7718hj hjVar3 = (C7718hj) hcVar.instance;
            gmVar.getClass();
            hjVar3.f26956aa = gmVar;
            hjVar3.f26961b |= 1048576;
            C7746ik ikVar2 = C7746ik.UNKNOWN;
        }
        if ((hjVar.f26955a & 128) != 0 && (((C7718hj) hcVar.instance).f26955a & 128) == 0) {
            C8178yk ykVar = hjVar.f26973n;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            hcVar.copyOnWrite();
            C7718hj hjVar4 = (C7718hj) hcVar.instance;
            ykVar.getClass();
            hjVar4.f26973n = ykVar;
            hjVar4.f26955a |= 128;
        }
        C7709ha haVar = hjVar.f26972m;
        if (haVar == null) {
            haVar = C7709ha.f26910f;
        }
        if ((haVar.f26912a & 1) != 0) {
            C7709ha haVar2 = hjVar.f26972m;
            if (haVar2 == null) {
                haVar2 = C7709ha.f26910f;
            }
            C60220t tVar = haVar2.f26913b;
            if (tVar == null) {
                tVar = C60220t.f162931e;
            }
            C91331bi.m149339h(tVar, hcVar);
        }
        return (C7718hj) hcVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r0.equals(r1) == false) goto L_0x002d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m162351h(com.google.p375ai.p378b.C7718hj r5, com.google.p375ai.p378b.C7718hj r6) {
        /*
            int r0 = r5.f26966g
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.m22834a(r0)
            if (r0 != 0) goto L_0x000a
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x000a:
            com.google.ai.b.ik r1 = com.google.p375ai.p378b.C7746ik.PUBLIC_ALERT
            r2 = 1
            if (r0 == r1) goto L_0x0045
            int r0 = r5.f26955a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x002d
            int r0 = r6.f26955a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x002d
            com.google.ai.b.fo r0 = r5.f26968i
            if (r0 != 0) goto L_0x0021
            com.google.ai.b.fo r0 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0021:
            com.google.ai.b.fo r1 = r6.f26968i
            if (r1 != 0) goto L_0x0027
            com.google.ai.b.fo r1 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0027:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0043
        L_0x002d:
            int r0 = r6.f26955a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0045
            int r0 = r5.f26955a
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0044
            long r3 = r5.f26969j
            long r5 = r6.f26969j
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            return r2
        L_0x0044:
            r2 = 0
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98062aq.m162351h(com.google.ai.b.hj, com.google.ai.b.hj):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7718hj mo85623c(C7718hj hjVar) {
        C58485gu guVar = this.f273798a;
        int size = guVar.size();
        C7718hj hjVar2 = hjVar;
        for (int i = 0; i < size; i++) {
            C7718hj hjVar3 = (C7718hj) guVar.get(i);
            C7746ik a = C7746ik.m22834a(hjVar.f26966g);
            if (a == null) {
                a = C7746ik.UNKNOWN;
            }
            C7746ik a2 = C7746ik.m22834a(hjVar3.f26966g);
            if (a2 == null) {
                a2 = C7746ik.UNKNOWN;
            }
            if (a == a2 && m162351h(hjVar, hjVar3)) {
                this.f273801d.remove(hjVar3);
                if ((hjVar.f26955a & 16) == 0 || (hjVar3.f26955a & 16) == 0 || hjVar3.f26970k > hjVar.f26970k) {
                    if (this.f256451g) {
                        hjVar2 = m162350g(hjVar, hjVar3);
                        this.f273799b.mo85603d(hjVar, hjVar2);
                    } else {
                        hjVar2 = m162350g(hjVar, hjVar3);
                    }
                    this.f273802e++;
                } else {
                    this.f273800c.mo85270f("Skipping entry update", new C98060ao(hjVar));
                }
            } else if (m162351h(hjVar, hjVar3)) {
                this.f273800c.mo85270f("Skipping entry update by type", new C98061ap(hjVar3));
            }
        }
        return hjVar2;
    }
}
