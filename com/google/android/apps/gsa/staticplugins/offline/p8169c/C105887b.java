package com.google.android.apps.gsa.staticplugins.offline.p8169c;

import com.google.android.apps.gsa.staticplugins.offline.p8169c.p8171b.C105889b;
import com.google.android.apps.gsa.staticplugins.offline.p8169c.p8171b.C105890c;
import com.google.p4152bb.p4153a.C55130gz;
import com.google.p4152bb.p4153a.C55135hd;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55362po;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4242bp.p4267h.C56394af;
import com.google.p4242bp.p4267h.C56402i;
import com.google.p4242bp.p4267h.C56405l;
import com.google.p4242bp.p4267h.C56406m;
import com.google.p4242bp.p4267h.C56414u;
import com.google.p4242bp.p4267h.C56415v;
import com.google.p4242bp.p4267h.C56419z;
import com.google.protobuf.C62971cq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.c.b */
/* compiled from: PG */
public class C105887b {

    /* renamed from: a */
    protected C56415v f295531a;

    /* renamed from: b */
    protected final C105890c f295532b = new C105889b();

    /* renamed from: c */
    protected C56394af f295533c;

    /* renamed from: d */
    protected Set f295534d;

    public C105887b(C56415v vVar) {
        this.f295531a = vVar;
        if (vVar != null) {
            for (C56414u uVar : vVar.f150456a) {
                for (C55365pr prVar : uVar.f150451b) {
                    C105890c cVar = this.f295532b;
                    C56419z a = C56419z.m87986a(uVar.f150450a);
                    if (a == null) {
                        a = C56419z.UNSPECIFIED;
                    }
                    cVar.mo95144b(a, prVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo95142a(C56394af afVar) {
        this.f295533c = afVar;
        this.f295534d = new HashSet(afVar.f150404d);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo95135b(com.google.p4152bb.p4153a.C55130gz r17) {
        /*
            r16 = this;
            r0 = r17
            com.google.protobuf.bv r1 = r0.instance
            com.google.bb.a.hc r1 = (com.google.p4152bb.p4153a.C55134hc) r1
            int r2 = r1.f145121a
            r2 = r2 & 16
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00bd
            com.google.bb.a.hg r1 = r1.f145127g
            if (r1 != 0) goto L_0x0014
            com.google.bb.a.hg r1 = com.google.p4152bb.p4153a.C55138hg.f145142g
        L_0x0014:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.bb.a.hf r1 = (com.google.p4152bb.p4153a.C55137hf) r1
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.hg r2 = (com.google.p4152bb.p4153a.C55138hg) r2
            int r5 = r2.f145144a
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0035
            java.lang.String r2 = r2.f145145b
            if (r2 == 0) goto L_0x0035
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.bb.a.hg r5 = (com.google.p4152bb.p4153a.C55138hg) r5
            int r6 = r5.f145144a
            r6 = r6 | r4
            r5.f145144a = r6
            r5.f145145b = r2
        L_0x0035:
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.hg r2 = (com.google.p4152bb.p4153a.C55138hg) r2
            int r5 = r2.f145144a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0052
            java.lang.String r2 = r2.f145146c
            if (r2 == 0) goto L_0x0052
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.bb.a.hg r5 = (com.google.p4152bb.p4153a.C55138hg) r5
            int r6 = r5.f145144a
            r6 = r6 | 4
            r5.f145144a = r6
            r5.f145146c = r2
        L_0x0052:
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.hg r2 = (com.google.p4152bb.p4153a.C55138hg) r2
            int r5 = r2.f145144a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x006f
            java.lang.String r2 = r2.f145147d
            if (r2 == 0) goto L_0x006f
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.bb.a.hg r5 = (com.google.p4152bb.p4153a.C55138hg) r5
            int r6 = r5.f145144a
            r6 = r6 | 16
            r5.f145144a = r6
            r5.f145147d = r2
        L_0x006f:
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.hg r2 = (com.google.p4152bb.p4153a.C55138hg) r2
            int r5 = r2.f145144a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x008c
            java.lang.String r2 = r2.f145148e
            if (r2 == 0) goto L_0x008c
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.bb.a.hg r5 = (com.google.p4152bb.p4153a.C55138hg) r5
            int r6 = r5.f145144a
            r6 = r6 | 64
            r5.f145144a = r6
            r5.f145148e = r2
        L_0x008c:
            r2 = 0
        L_0x008d:
            com.google.protobuf.bv r5 = r1.instance
            com.google.bb.a.hg r5 = (com.google.p4152bb.p4153a.C55138hg) r5
            com.google.protobuf.cq r5 = r5.f145149f
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x00a5
            java.lang.String r5 = r1.mo54202a(r2)
            if (r5 == 0) goto L_0x00a2
            r1.mo54203b(r2, r5)
        L_0x00a2:
            int r2 = r2 + 1
            goto L_0x008d
        L_0x00a5:
            r17.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.bb.a.hc r2 = (com.google.p4152bb.p4153a.C55134hc) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.bb.a.hg r1 = (com.google.p4152bb.p4153a.C55138hg) r1
            r1.getClass()
            r2.f145127g = r1
            int r1 = r2.f145121a
            r1 = r1 | 16
            r2.f145121a = r1
        L_0x00bd:
            com.google.protobuf.bt r1 = com.google.p4242bp.p4267h.C56395b.f150409b
            boolean r1 = r0.mo58882j(r1)
            if (r1 == 0) goto L_0x0208
            com.google.protobuf.bt r1 = com.google.p4242bp.p4267h.C56395b.f150409b
            java.lang.Object r1 = r0.mo58881i(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = r16
            com.google.bp.h.af r5 = r2.f295533c
            com.google.protobuf.dn r5 = r5.f150406f
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.lang.Object r1 = r5.get(r1)
            com.google.bp.h.ad r1 = (com.google.p4242bp.p4267h.C56392ad) r1
            if (r1 != 0) goto L_0x00e0
            return r3
        L_0x00e0:
            int r5 = r1.f150394a
            r6 = r5 & 1
            if (r6 == 0) goto L_0x00fc
            java.lang.String r1 = r1.f150395b
            r17.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.bb.a.hc r3 = (com.google.p4152bb.p4153a.C55134hc) r3
            r1.getClass()
            int r5 = r3.f145121a
            r5 = r5 | 4
            r3.f145121a = r5
            r3.f145124d = r1
            goto L_0x020a
        L_0x00fc:
            r6 = 2
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0112
            int r1 = r1.f150396c
            r17.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.bb.a.hc r3 = (com.google.p4152bb.p4153a.C55134hc) r3
            int r5 = r3.f145121a
            r5 = r5 | r4
            r3.f145121a = r5
            r3.f145122b = r1
            goto L_0x020a
        L_0x0112:
            com.google.protobuf.bv r5 = r0.instance
            com.google.bb.a.hc r5 = (com.google.p4152bb.p4153a.C55134hc) r5
            int r5 = r5.f145121a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0207
            com.google.protobuf.cq r5 = r1.f150397d
            int r5 = r5.size()
            if (r5 == 0) goto L_0x0207
            com.google.protobuf.bv r5 = r0.instance
            com.google.bb.a.hc r5 = (com.google.p4152bb.p4153a.C55134hc) r5
            com.google.bb.a.hg r5 = r5.f145127g
            if (r5 != 0) goto L_0x012e
            com.google.bb.a.hg r5 = com.google.p4152bb.p4153a.C55138hg.f145142g
        L_0x012e:
            com.google.protobuf.cq r1 = r1.f150397d
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x0139
        L_0x0136:
            r11 = 0
            goto L_0x01e4
        L_0x0139:
            int r7 = r1.size()
            com.google.protobuf.cq r9 = r5.f145149f
            java.lang.String[] r10 = new java.lang.String[r7]
            java.util.Iterator r1 = r1.iterator()
            r11 = 0
        L_0x0146:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0177
            java.lang.Object r12 = r1.next()
            if (r12 != 0) goto L_0x0157
            java.lang.String r12 = ""
            r10[r11] = r12
            goto L_0x0174
        L_0x0157:
            int r13 = r9.size()
            if (r11 >= r13) goto L_0x016e
            java.lang.Object r13 = r9.get(r11)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r14[r3] = r12
            java.lang.String r12 = java.lang.String.format(r13, r14)
            r10[r11] = r12
            goto L_0x0174
        L_0x016e:
            java.lang.String r12 = r12.toString()
            r10[r11] = r12
        L_0x0174:
            int r11 = r11 + 1
            goto L_0x0146
        L_0x0177:
            if (r7 == 0) goto L_0x0136
            if (r7 == r4) goto L_0x01e2
            if (r7 == r6) goto L_0x01cc
            int r1 = r7 + -1
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0183:
            if (r9 >= r7) goto L_0x01e4
            r14 = r10[r9]
            if (r12 != 0) goto L_0x018b
            r13 = r14
            goto L_0x01c7
        L_0x018b:
            if (r12 != r4) goto L_0x01a0
            int r11 = r5.f145144a
            r11 = r11 & 4
            if (r11 == 0) goto L_0x0136
            java.lang.String r11 = r5.f145146c
            java.lang.Object[] r15 = new java.lang.Object[r6]
            r15[r3] = r13
            r15[r4] = r14
            java.lang.String r11 = java.lang.String.format(r11, r15)
            goto L_0x01c7
        L_0x01a0:
            if (r12 >= r1) goto L_0x01b5
            int r15 = r5.f145144a
            r15 = r15 & 16
            if (r15 == 0) goto L_0x0136
            java.lang.String r15 = r5.f145147d
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r3] = r11
            r8[r4] = r14
            java.lang.String r11 = java.lang.String.format(r15, r8)
            goto L_0x01c7
        L_0x01b5:
            int r8 = r5.f145144a
            r8 = r8 & 64
            if (r8 == 0) goto L_0x0136
            java.lang.String r8 = r5.f145148e
            java.lang.Object[] r15 = new java.lang.Object[r6]
            r15[r3] = r11
            r15[r4] = r14
            java.lang.String r11 = java.lang.String.format(r8, r15)
        L_0x01c7:
            int r12 = r12 + 1
            int r9 = r9 + 1
            goto L_0x0183
        L_0x01cc:
            int r1 = r5.f145144a
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0136
            java.lang.String r1 = r5.f145145b
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r6 = r10[r3]
            r5[r3] = r6
            r6 = r10[r4]
            r5[r4] = r6
            java.lang.String r11 = java.lang.String.format(r1, r5)
            goto L_0x01e4
        L_0x01e2:
            r11 = r10[r3]
        L_0x01e4:
            if (r11 != 0) goto L_0x01e7
            return r3
        L_0x01e7:
            r17.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bb.a.hc r1 = (com.google.p4152bb.p4153a.C55134hc) r1
            int r3 = r1.f145121a
            r3 = r3 | 4
            r1.f145121a = r3
            r1.f145124d = r11
            r17.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.bb.a.hc r1 = (com.google.p4152bb.p4153a.C55134hc) r1
            r3 = 0
            r1.f145127g = r3
            int r3 = r1.f145121a
            r3 = r3 & -17
            r1.f145121a = r3
            goto L_0x020a
        L_0x0207:
            return r3
        L_0x0208:
            r2 = r16
        L_0x020a:
            com.google.protobuf.bt r1 = com.google.p4242bp.p4267h.C56395b.f150409b
            r0.mo58884l(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8169c.C105887b.mo95135b(com.google.bb.a.gz):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo95136c(C55135hd hdVar) {
        String str;
        int i;
        Iterator it = ((List) hdVar.mo58881i(C56406m.f150433d)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C56402i iVar = (C56402i) it.next();
            Set set = this.f295534d;
            C62971cq cqVar = iVar.f150419a;
            if (cqVar != null) {
                Iterator it2 = cqVar.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!set.contains((String) it2.next())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (iVar.f150420b.size() > 0) {
                int i2 = this.f295533c.f150405e;
                if (i2 < 0) {
                    i = new Random().nextInt(iVar.f150420b.size());
                } else {
                    i = i2 % iVar.f150420b.size();
                }
                C55135hd hdVar2 = (C55135hd) ((C55136he) iVar.f150420b.get(i)).toBuilder();
                if (mo95136c(hdVar2)) {
                    hdVar.clear();
                    hdVar.mergeFrom((C55136he) hdVar2.build());
                    return true;
                } else if (!iVar.f150421c) {
                    return false;
                }
            }
        }
        hdVar.mo58884l(C56406m.f150433d);
        if (hdVar.mo58882j(C56406m.f150431b)) {
            return mo95138e();
        }
        for (int i3 = 0; i3 < ((C55136he) hdVar.instance).f145138g.size(); i3++) {
            C55130gz gzVar = (C55130gz) hdVar.mo54198a(i3).toBuilder();
            boolean b = mo95135b(gzVar);
            hdVar.mo54200c(i3, gzVar);
            if (!b) {
                return false;
            }
        }
        C55136he heVar = (C55136he) hdVar.instance;
        if ((heVar.f145132a & 1) != 0) {
            String str2 = heVar.f145133b;
            for (C56405l lVar : (List) hdVar.mo58881i(C56406m.f150432c)) {
                String str3 = lVar.f150427b;
                if ((lVar.f150426a & 4) != 0) {
                    str = lVar.f150429d;
                } else {
                    str = lVar.f150428c;
                }
                if (str != null) {
                    str2 = str2.replaceAll("\\{\\{" + str3 + "\\}\\}", str);
                }
            }
            hdVar.mo58884l(C56406m.f150432c);
            hdVar.copyOnWrite();
            C55136he heVar2 = (C55136he) hdVar.instance;
            str2.getClass();
            heVar2.f145132a |= 1;
            heVar2.f145133b = str2;
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo95137d(C55362po poVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo95138e() {
        return false;
    }
}
