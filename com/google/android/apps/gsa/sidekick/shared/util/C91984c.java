package com.google.android.apps.gsa.sidekick.shared.util;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.c */
/* compiled from: PG */
public final class C91984c {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r4.f26952X;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m150952a(com.google.p375ai.p378b.C7718hj r4) {
        /*
            int r0 = r4.f26961b
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00b7
            int r0 = r4.f26952X
            int r1 = com.google.p375ai.p378b.C7650ew.m22795a(r0)
            if (r1 != 0) goto L_0x0011
            goto L_0x00b7
        L_0x0011:
            r2 = 1
            if (r1 == r2) goto L_0x00b7
            int r0 = com.google.p375ai.p378b.C7650ew.m22795a(r0)
            if (r0 == 0) goto L_0x00c6
            r1 = 3
            if (r0 != r1) goto L_0x00c6
            com.google.ai.b.lr r0 = r4.f26984y
            if (r0 != 0) goto L_0x0023
            com.google.ai.b.lr r0 = com.google.p375ai.p378b.C7834lr.f27467c
        L_0x0023:
            com.google.protobuf.cq r0 = r0.f27469a
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L_0x0086
            com.google.ai.b.lr r4 = r4.f26984y
            if (r4 != 0) goto L_0x0032
            com.google.ai.b.lr r4 = com.google.p375ai.p378b.C7834lr.f27467c
        L_0x0032:
            com.google.protobuf.cq r4 = r4.f27469a
            java.lang.Object r4 = r4.get(r1)
            com.google.ai.b.rp r4 = (com.google.p375ai.p378b.C7994rp) r4
            int r0 = r4.f28073b
            r3 = 14
            if (r0 != r3) goto L_0x0045
            java.lang.Object r0 = r4.f28074c
            com.google.ai.b.tt r0 = (com.google.p375ai.p378b.C8052tt) r0
            goto L_0x0047
        L_0x0045:
            com.google.ai.b.tt r0 = com.google.p375ai.p378b.C8052tt.f28314B
        L_0x0047:
            com.google.protobuf.cq r0 = r0.f28324g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00c6
            int r0 = r4.f28073b
            if (r0 != r3) goto L_0x0058
            java.lang.Object r4 = r4.f28074c
            com.google.ai.b.tt r4 = (com.google.p375ai.p378b.C8052tt) r4
            goto L_0x005a
        L_0x0058:
            com.google.ai.b.tt r4 = com.google.p375ai.p378b.C8052tt.f28314B
        L_0x005a:
            com.google.protobuf.cq r4 = r4.f28324g
            java.lang.Object r4 = r4.get(r1)
            com.google.ai.b.lb r4 = (com.google.p375ai.p378b.C7818lb) r4
            com.google.protobuf.cq r0 = r4.f27419b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00c6
            com.google.protobuf.cq r4 = r4.f27419b
            java.lang.Object r4 = r4.get(r1)
            com.google.ai.b.kv r4 = (com.google.p375ai.p378b.C7811kv) r4
            int r0 = r4.f27308b
            if (r0 != r2) goto L_0x007b
            java.lang.Object r4 = r4.f27309c
            com.google.ai.b.ll r4 = (com.google.p375ai.p378b.C7828ll) r4
            goto L_0x007d
        L_0x007b:
            com.google.ai.b.ll r4 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x007d:
            com.google.ai.b.xj r4 = r4.f27458b
            if (r4 != 0) goto L_0x0083
            com.google.ai.b.xj r4 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0083:
            java.lang.String r4 = r4.f28660b
            return r4
        L_0x0086:
            com.google.ai.b.lr r0 = r4.f26981v
            if (r0 != 0) goto L_0x008c
            com.google.ai.b.lr r0 = com.google.p375ai.p378b.C7834lr.f27467c
        L_0x008c:
            com.google.protobuf.cq r0 = r0.f27469a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00c6
            com.google.ai.b.lr r4 = r4.f26981v
            if (r4 != 0) goto L_0x009a
            com.google.ai.b.lr r4 = com.google.p375ai.p378b.C7834lr.f27467c
        L_0x009a:
            com.google.protobuf.cq r4 = r4.f27469a
            java.lang.Object r4 = r4.get(r1)
            com.google.ai.b.rp r4 = (com.google.p375ai.p378b.C7994rp) r4
            com.google.ai.b.ax r4 = r4.f28077f
            if (r4 != 0) goto L_0x00a8
            com.google.ai.b.ax r4 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x00a8:
            int r0 = r4.f26088c
            r1 = 7
            if (r0 != r1) goto L_0x00b2
            java.lang.Object r4 = r4.f26089d
            com.google.ai.b.de r4 = (com.google.p375ai.p378b.C7605de) r4
            goto L_0x00b4
        L_0x00b2:
            com.google.ai.b.de r4 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x00b4:
            java.lang.String r4 = r4.f26272b
            return r4
        L_0x00b7:
            int r0 = r4.f26955a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x00c6
            com.google.ai.b.jo r4 = r4.f26977r
            if (r4 != 0) goto L_0x00c3
            com.google.ai.b.jo r4 = com.google.p375ai.p378b.C7777jo.f27217m
        L_0x00c3:
            java.lang.String r4 = r4.f27221c
            return r4
        L_0x00c6:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.util.C91984c.m150952a(com.google.ai.b.hj):java.lang.String");
    }

    /* renamed from: b */
    public static String m150953b(C7726hr hrVar) {
        String str;
        if ((hrVar.f27010a & 8) != 0) {
            C7718hj hjVar = hrVar.f27016g;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            str = m150952a(hjVar);
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (TextUtils.isEmpty(str) && (hrVar.f27010a & 2) != 0) {
            C7718hj hjVar2 = hrVar.f27015f;
            if (hjVar2 == null) {
                hjVar2 = C7718hj.f26927af;
            }
            str = m150952a(hjVar2);
        }
        if (TextUtils.isEmpty(str)) {
            for (C7718hj a : hrVar.f27013d) {
                str = m150952a(a);
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            for (C7726hr b : hrVar.f27012c) {
                str = m150953b(b);
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
            }
        }
        return str;
    }
}
