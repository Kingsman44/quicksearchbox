package com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a;

import com.google.android.apps.gsa.staticplugins.offline.p8166a.C105856a;
import com.google.android.apps.gsa.staticplugins.offline.p8169c.C105887b;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55130gz;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55135hd;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55362po;
import com.google.p4152bb.p4153a.C55364pq;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55366ps;
import com.google.p4152bb.p4153a.C55367pt;
import com.google.p4242bp.p4267h.C56415v;
import com.google.p4242bp.p4267h.C56419z;
import com.google.p4242bp.p4267h.p4268a.C56371d;
import com.google.p4242bp.p4267h.p4268a.C56375h;
import com.google.p4242bp.p4267h.p4268a.C56385r;
import com.google.p4242bp.p4267h.p4268a.C56388u;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62926bf;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62939bs;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.c.a.b */
/* compiled from: PG */
public final class C105886b extends C105887b {

    /* renamed from: e */
    public Map f295525e;

    /* renamed from: f */
    private final C105885a f295526f = new C105885a(this);

    /* renamed from: g */
    private C56388u f295527g;

    /* renamed from: h */
    private Set f295528h;

    /* renamed from: i */
    private C55365pr f295529i;

    /* renamed from: j */
    private final C105856a f295530j;

    public C105886b(C56415v vVar, C105856a aVar) {
        super(vVar);
        this.f295530j = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo95135b(C55130gz gzVar) {
        if (!super.mo95135b(gzVar)) {
            return false;
        }
        if (gzVar.mo58882j(C56371d.f150332b)) {
            Integer num = (Integer) this.f295525e.get(Integer.valueOf(((C54944ab) gzVar.mo58881i(C56371d.f150332b)).f144530R));
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            gzVar.copyOnWrite();
            C55134hc hcVar = (C55134hc) gzVar.instance;
            C55134hc hcVar2 = C55134hc.f145119i;
            hcVar.f145121a |= 1;
            hcVar.f145122b = intValue;
            gzVar.mo58884l(C56371d.f150332b);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo95136c(C55135hd hdVar) {
        return super.mo95136c(hdVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo95137d(C55362po poVar) {
        int a;
        if (mo95140g((C55365pr) poVar.build(), C56375h.f150341c)) {
            return false;
        }
        C62940bt btVar = C56375h.f150342d;
        C62937bq bqVar = (C62937bq) poVar.instance;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        bqVar.mo58887l(r0);
        if (bqVar.f169962ag.mo58853k(r0.f169971d) > 0 && !mo95140g((C55365pr) poVar.build(), C56375h.f150342d)) {
            return false;
        }
        poVar.mo58884l(C56375h.f150341c);
        poVar.mo58884l(C56375h.f150342d);
        if (this.f295528h.contains(C56385r.STOP_ALL_INTERACTIONS)) {
            if (((C55365pr) poVar.instance).f145883f != 0) {
                return false;
            }
            poVar.copyOnWrite();
            C55365pr prVar = (C55365pr) poVar.instance;
            prVar.f145882e = 0;
            prVar.f145878a |= 8;
        }
        if (this.f295528h.contains(C56385r.CLEAR_ALL_DISPLAY_PROMPTS)) {
            poVar.copyOnWrite();
            C55365pr prVar2 = (C55365pr) poVar.instance;
            C55365pr prVar3 = C55365pr.f145876l;
            prVar2.f145879b = null;
            prVar2.f145878a &= -2;
        } else {
            C55365pr prVar4 = (C55365pr) poVar.instance;
            if ((prVar4.f145878a & 1) != 0) {
                C55136he heVar = prVar4.f145879b;
                if (heVar == null) {
                    heVar = C55136he.f145130j;
                }
                C55135hd hdVar = (C55135hd) heVar.toBuilder();
                if (super.mo95136c(hdVar)) {
                    poVar.copyOnWrite();
                    C55365pr prVar5 = (C55365pr) poVar.instance;
                    C55136he heVar2 = (C55136he) hdVar.build();
                    heVar2.getClass();
                    prVar5.f145879b = heVar2;
                    prVar5.f145878a |= 1;
                } else {
                    poVar.copyOnWrite();
                    C55365pr prVar6 = (C55365pr) poVar.instance;
                    prVar6.f145879b = null;
                    prVar6.f145878a &= -2;
                }
            }
        }
        if (this.f295528h.contains(C56385r.CLEAR_ALL_VOCAL_PROMPTS) || (this.f295528h.contains(C56385r.CLEAR_NON_FOLLOW_ON_VOCAL_PROMPTS) && ((a = C55364pq.m87677a(((C55365pr) poVar.instance).f145882e)) == 0 || a != 2))) {
            poVar.copyOnWrite();
            C55365pr prVar7 = (C55365pr) poVar.instance;
            prVar7.f145880c = null;
            prVar7.f145878a &= -3;
        } else {
            C55365pr prVar8 = (C55365pr) poVar.instance;
            if ((prVar8.f145878a & 2) != 0) {
                C55136he heVar3 = prVar8.f145880c;
                if (heVar3 == null) {
                    heVar3 = C55136he.f145130j;
                }
                C55135hd hdVar2 = (C55135hd) heVar3.toBuilder();
                if (super.mo95136c(hdVar2)) {
                    poVar.copyOnWrite();
                    C55365pr prVar9 = (C55365pr) poVar.instance;
                    C55136he heVar4 = (C55136he) hdVar2.build();
                    heVar4.getClass();
                    prVar9.f145880c = heVar4;
                    prVar9.f145878a |= 2;
                } else {
                    poVar.copyOnWrite();
                    C55365pr prVar10 = (C55365pr) poVar.instance;
                    prVar10.f145880c = null;
                    prVar10.f145878a &= -3;
                }
            }
        }
        int i = 0;
        while (true) {
            if (i >= ((C55365pr) poVar.instance).f145888k.size()) {
                break;
            }
            if ((poVar.mo54250a(i).f145892a & 1) != 0) {
                C55136he heVar5 = poVar.mo54250a(i).f145893b;
                if (heVar5 == null) {
                    heVar5 = C55136he.f145130j;
                }
                C55135hd hdVar3 = (C55135hd) heVar5.toBuilder();
                if (!super.mo95136c(hdVar3)) {
                    poVar.copyOnWrite();
                    ((C55365pr) poVar.instance).f145888k = C55365pr.emptyProtobufList();
                    break;
                }
                C55366ps psVar = (C55366ps) poVar.mo54250a(i).toBuilder();
                psVar.copyOnWrite();
                C55367pt ptVar = (C55367pt) psVar.instance;
                C55136he heVar6 = (C55136he) hdVar3.build();
                heVar6.getClass();
                ptVar.f145893b = heVar6;
                ptVar.f145892a |= 1;
                poVar.mo54251b(i, psVar);
            }
            if ((poVar.mo54250a(i).f145892a & 2) == 0 && (poVar.mo54250a(i).f145892a & 4) == 0) {
                C55366ps psVar2 = (C55366ps) poVar.mo54250a(i).toBuilder();
                C55136he heVar7 = poVar.mo54250a(i).f145893b;
                if (heVar7 == null) {
                    heVar7 = C55136he.f145130j;
                }
                String str = heVar7.f145133b;
                psVar2.copyOnWrite();
                C55367pt ptVar2 = (C55367pt) psVar2.instance;
                str.getClass();
                ptVar2.f145892a |= 2;
                ptVar2.f145894c = str;
                poVar.mo54251b(i, psVar2);
            }
            i++;
        }
        if (poVar.mo58882j(C56375h.f150340b)) {
            poVar.mo58884l(C56375h.f150340b);
            this.f295532b.mo95144b((C56419z) poVar.mo58881i(C56375h.f150340b), (C55365pr) poVar.build());
        }
        int i2 = ((C55365pr) poVar.instance).f145878a;
        if ((i2 & 1) == 0 && (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo95138e() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0239  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95139f(com.google.p4242bp.p4267h.C56394af r24, com.google.p4152bb.p4153a.C55323oc r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            super.mo95142a(r24)
            com.google.protobuf.bt r2 = com.google.p4242bp.p4267h.p4268a.C56388u.f150376i
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r1 = r1.mo58854l(r3)
            if (r1 != 0) goto L_0x001d
            java.lang.Object r1 = r2.f169969b
            goto L_0x0021
        L_0x001d:
            java.lang.Object r1 = r2.mo58889c(r1)
        L_0x0021:
            com.google.bp.h.a.u r1 = (com.google.p4242bp.p4267h.p4268a.C56388u) r1
            r0.f295527g = r1
            com.google.protobuf.cj r2 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r1.f150379b
            com.google.protobuf.ci r3 = com.google.p4242bp.p4267h.p4268a.C56388u.f150374c
            r2.<init>(r1, r3)
            java.util.HashSet r1 = com.google.common.p4522b.C58758qx.m90648f(r2)
            r0.f295528h = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f295525e = r1
            com.google.bb.a.nr r1 = com.google.p4152bb.p4153a.C55311nr.f145714b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bb.a.nq r1 = (com.google.p4152bb.p4153a.C55310nq) r1
            java.util.Set r2 = r0.f295528h
            com.google.bp.h.a.r r3 = com.google.p4242bp.p4267h.p4268a.C56385r.CLEAR_INTERACTION_FOR_MODULAR_ANSWER
            boolean r2 = r2.contains(r3)
            com.google.bp.h.af r3 = r0.f295533c
            com.google.bp.h.aa r3 = r3.f150402b
            if (r3 != 0) goto L_0x0053
            com.google.bp.h.aa r3 = com.google.p4242bp.p4267h.C56389aa.f150386e
        L_0x0053:
            int r3 = r3.f150390c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.android.apps.gsa.staticplugins.offline.c.b.c r5 = r0.f295532b
            com.google.bp.h.af r6 = r0.f295533c
            com.google.bp.h.aa r6 = r6.f150402b
            if (r6 != 0) goto L_0x0064
            com.google.bp.h.aa r6 = com.google.p4242bp.p4267h.C56389aa.f150386e
        L_0x0064:
            int r6 = r6.f150389b
            com.google.bp.h.z r6 = com.google.p4242bp.p4267h.C56419z.m87986a(r6)
            if (r6 != 0) goto L_0x006e
            com.google.bp.h.z r6 = com.google.p4242bp.p4267h.C56419z.UNSPECIFIED
        L_0x006e:
            java.util.List r5 = r5.mo95143a(r6)
            if (r5 != 0) goto L_0x0078
        L_0x0074:
            r22 = r1
            goto L_0x02bd
        L_0x0078:
            java.util.Iterator r5 = r5.iterator()
        L_0x007c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0074
            java.lang.Object r6 = r5.next()
            com.google.bb.a.pr r6 = (com.google.p4152bb.p4153a.C55365pr) r6
            int r7 = r6.f145883f
            if (r7 != r3) goto L_0x007c
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.bb.a.po r6 = (com.google.p4152bb.p4153a.C55362po) r6
            r7 = 0
            if (r2 == 0) goto L_0x00a4
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.bb.a.pr r8 = (com.google.p4152bb.p4153a.C55365pr) r8
            int r9 = r8.f145878a
            r9 = r9 & -9
            r8.f145878a = r9
            r8.f145882e = r7
        L_0x00a4:
            boolean r8 = r0.mo95137d(r6)
            if (r8 == 0) goto L_0x007c
            com.google.protobuf.bv r8 = r6.instance
            com.google.bb.a.pr r8 = (com.google.p4152bb.p4153a.C55365pr) r8
            com.google.bb.a.he r8 = r8.f145880c
            if (r8 != 0) goto L_0x00b4
            com.google.bb.a.he r8 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x00b4:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.bb.a.hd r8 = (com.google.p4152bb.p4153a.C55135hd) r8
            com.google.protobuf.bv r9 = r6.instance
            com.google.bb.a.pr r9 = (com.google.p4152bb.p4153a.C55365pr) r9
            int r9 = r9.f145885h
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            com.google.protobuf.bv r11 = r8.instance
            com.google.bb.a.he r11 = (com.google.p4152bb.p4153a.C55136he) r11
            com.google.protobuf.cq r11 = r11.f145138g
            int r11 = r11.size()
            com.google.bp.h.v r12 = r0.f295531a
            com.google.protobuf.bn r12 = r12.toBuilder()
            com.google.bp.h.o r12 = (com.google.p4242bp.p4267h.C56408o) r12
            com.google.bp.h.af r13 = r0.f295533c
            com.google.protobuf.cq r13 = r13.f150403c
            java.util.Iterator r13 = r13.iterator()
        L_0x00df:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0268
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
        L_0x00ec:
            com.google.bp.h.v r7 = r0.f295531a
            com.google.protobuf.cq r7 = r7.f150457b
            int r7 = r7.size()
            if (r15 >= r7) goto L_0x0265
            com.google.bp.h.v r7 = r0.f295531a
            com.google.protobuf.cq r7 = r7.f150457b
            java.lang.Object r7 = r7.get(r15)
            com.google.bp.h.s r7 = (com.google.p4242bp.p4267h.C56412s) r7
            java.lang.String r7 = r7.f150444a
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L_0x0245
            com.google.bp.h.v r7 = r0.f295531a
            com.google.protobuf.cq r7 = r7.f150457b
            java.lang.Object r7 = r7.get(r15)
            com.google.bp.h.s r7 = (com.google.p4242bp.p4267h.C56412s) r7
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.bp.h.p r7 = (com.google.p4242bp.p4267h.C56409p) r7
            r16 = r2
            r17 = r3
            r2 = 0
        L_0x011d:
            com.google.protobuf.bv r3 = r7.instance
            com.google.bp.h.s r3 = (com.google.p4242bp.p4267h.C56412s) r3
            com.google.protobuf.cq r3 = r3.f150445b
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0217
            com.google.protobuf.bv r3 = r7.instance
            com.google.bp.h.s r3 = (com.google.p4242bp.p4267h.C56412s) r3
            com.google.protobuf.cq r3 = r3.f150445b
            java.lang.Object r3 = r3.get(r2)
            com.google.bp.h.r r3 = (com.google.p4242bp.p4267h.C56411r) r3
            r18 = r5
            int r5 = r3.f150438a
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0146
            int r5 = r3.f150439b
            if (r5 == r9) goto L_0x0146
            int r2 = r2 + 1
            r5 = r18
            goto L_0x011d
        L_0x0146:
            com.google.bb.a.he r5 = r3.f150440c
            if (r5 != 0) goto L_0x014c
            com.google.bb.a.he r5 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x014c:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.bb.a.hd r5 = (com.google.p4152bb.p4153a.C55135hd) r5
            boolean r19 = super.mo95136c(r5)
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.bp.h.q r3 = (com.google.p4242bp.p4267h.C56410q) r3
            r3.copyOnWrite()
            r20 = r9
            com.google.protobuf.bv r9 = r3.instance
            com.google.bp.h.r r9 = (com.google.p4242bp.p4267h.C56411r) r9
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.he r5 = (com.google.p4152bb.p4153a.C55136he) r5
            r5.getClass()
            r9.f150440c = r5
            int r5 = r9.f150438a
            r5 = r5 | 2
            r9.f150438a = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.bp.h.r r3 = (com.google.p4242bp.p4267h.C56411r) r3
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.bp.h.s r5 = (com.google.p4242bp.p4267h.C56412s) r5
            r3.getClass()
            com.google.protobuf.cq r9 = r5.f150445b
            boolean r21 = r9.mo58948c()
            if (r21 != 0) goto L_0x0194
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r5.f150445b = r9
        L_0x0194:
            com.google.protobuf.cq r5 = r5.f150445b
            r5.set(r2, r3)
            if (r19 != 0) goto L_0x019f
            r22 = r1
            goto L_0x021d
        L_0x019f:
            com.google.bb.a.he r2 = r3.f150440c
            if (r2 != 0) goto L_0x01a5
            com.google.bb.a.he r2 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x01a5:
            java.lang.String r5 = r2.f145133b
            if (r11 == 0) goto L_0x01f0
            com.google.protobuf.cq r9 = r2.f145138g
            int r9 = r9.size()
            if (r9 == 0) goto L_0x01f0
            com.google.protobuf.cq r2 = r2.f145138g
            int r2 = r2.size()
        L_0x01b7:
            if (r2 <= 0) goto L_0x01f0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r19 = r13
            java.lang.String r13 = "%"
            r9.<init>(r13)
            r9.append(r2)
            r21 = r14
            java.lang.String r14 = "$s"
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            r22 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            int r13 = r2 + r11
            r1.append(r13)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r5.replace(r9, r1)
            int r2 = r2 + -1
            r13 = r19
            r14 = r21
            r1 = r22
            goto L_0x01b7
        L_0x01f0:
            r22 = r1
            r19 = r13
            r21 = r14
            r10.append(r5)
            java.lang.String r1 = " "
            r10.append(r1)
            com.google.bb.a.he r1 = r3.f150440c
            if (r1 != 0) goto L_0x0204
            com.google.bb.a.he r1 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0204:
            com.google.protobuf.cq r1 = r1.f145138g
            int r1 = r1.size()
            int r11 = r11 + r1
            com.google.bb.a.he r1 = r3.f150440c
            if (r1 != 0) goto L_0x0211
            com.google.bb.a.he r1 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0211:
            com.google.protobuf.cq r1 = r1.f145138g
            r8.mo54199b(r1)
            goto L_0x0221
        L_0x0217:
            r22 = r1
            r18 = r5
            r20 = r9
        L_0x021d:
            r19 = r13
            r21 = r14
        L_0x0221:
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.bp.h.v r1 = (com.google.p4242bp.p4267h.C56415v) r1
            com.google.protobuf.bv r2 = r7.build()
            com.google.bp.h.s r2 = (com.google.p4242bp.p4267h.C56412s) r2
            r2.getClass()
            com.google.protobuf.cq r3 = r1.f150457b
            boolean r5 = r3.mo58948c()
            if (r5 != 0) goto L_0x023f
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r1.f150457b = r3
        L_0x023f:
            com.google.protobuf.cq r1 = r1.f150457b
            r1.set(r15, r2)
            goto L_0x0253
        L_0x0245:
            r22 = r1
            r16 = r2
            r17 = r3
            r18 = r5
            r20 = r9
            r19 = r13
            r21 = r14
        L_0x0253:
            int r15 = r15 + 1
            r2 = r16
            r3 = r17
            r5 = r18
            r13 = r19
            r9 = r20
            r14 = r21
            r1 = r22
            goto L_0x00ec
        L_0x0265:
            r7 = 0
            goto L_0x00df
        L_0x0268:
            r22 = r1
            r16 = r2
            r17 = r3
            r18 = r5
            com.google.protobuf.bv r1 = r12.build()
            com.google.bp.h.v r1 = (com.google.p4242bp.p4267h.C56415v) r1
            r0.f295531a = r1
            com.google.protobuf.bv r1 = r8.instance
            com.google.bb.a.he r1 = (com.google.p4152bb.p4153a.C55136he) r1
            java.lang.String r1 = r1.f145133b
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.bb.a.he r2 = (com.google.p4152bb.p4153a.C55136he) r2
            int r3 = r2.f145132a
            r3 = r3 | 1
            r2.f145132a = r3
            r2.f145133b = r1
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.bb.a.pr r1 = (com.google.p4152bb.p4153a.C55365pr) r1
            com.google.protobuf.bv r2 = r8.build()
            com.google.bb.a.he r2 = (com.google.p4152bb.p4153a.C55136he) r2
            r2.getClass()
            r1.f145880c = r2
            int r2 = r1.f145878a
            r2 = r2 | 2
            r1.f145878a = r2
            com.google.protobuf.bv r1 = r6.build()
            com.google.bb.a.pr r1 = (com.google.p4152bb.p4153a.C55365pr) r1
            r4.add(r1)
            r2 = r16
            r3 = r17
            r1 = r22
            goto L_0x007c
        L_0x02bd:
            r22.copyOnWrite()
            r1 = r22
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.nr r2 = (com.google.p4152bb.p4153a.C55311nr) r2
            com.google.protobuf.cq r3 = r2.f145716a
            boolean r5 = r3.mo58948c()
            if (r5 != 0) goto L_0x02d4
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r2.f145716a = r3
        L_0x02d4:
            com.google.protobuf.cq r2 = r2.f145716a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r2)
            r25.copyOnWrite()
            r2 = r25
            com.google.protobuf.bv r2 = r2.instance
            com.google.bb.a.od r2 = (com.google.p4152bb.p4153a.C55324od) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.bb.a.nr r1 = (com.google.p4152bb.p4153a.C55311nr) r1
            com.google.bb.a.od r3 = com.google.p4152bb.p4153a.C55324od.f145745j
            r1.getClass()
            r2.f145754g = r1
            int r1 = r2.f145748a
            r1 = r1 | 2
            r2.f145748a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a.C105886b.mo95139f(com.google.bp.h.af, com.google.bb.a.oc):void");
    }

    /* renamed from: g */
    public final boolean mo95140g(C62937bq bqVar, C62917ay ayVar) {
        int i = 0;
        while (true) {
            C62940bt r2 = C62942bv.checkIsLite(ayVar);
            bqVar.mo58887l(r2);
            if (i >= bqVar.f169962ag.mo58853k(r2.f169971d)) {
                return false;
            }
            C62940bt r22 = C62942bv.checkIsLite(ayVar);
            bqVar.mo58887l(r22);
            C62926bf bfVar = bqVar.f169962ag;
            C62939bs bsVar = r22.f169971d;
            if (bsVar.f169966d) {
                Object l = bfVar.mo58854l(bsVar);
                if (l != null) {
                    if (this.f295534d.contains((String) r22.mo58890d(((List) l).get(i)))) {
                        return true;
                    }
                    i++;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05f7, code lost:
        if (r0 != false) goto L_0x0678;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0678 A[EDGE_INSN: B:291:0x0678->B:249:0x0678 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95141h(com.google.p4242bp.p4267h.C56394af r14, com.google.p4152bb.p4153a.C55264ly r15) {
        /*
            r13 = this;
            com.google.protobuf.bv r0 = r15.build()
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            super.mo95142a(r14)
            com.google.protobuf.bt r1 = com.google.p4242bp.p4267h.p4268a.C56388u.f150376i
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r14.mo58887l(r1)
            com.google.protobuf.bf r14 = r14.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r14 = r14.mo58854l(r2)
            if (r14 != 0) goto L_0x001f
            java.lang.Object r14 = r1.f169969b
            goto L_0x0023
        L_0x001f:
            java.lang.Object r14 = r1.mo58889c(r14)
        L_0x0023:
            com.google.bp.h.a.u r14 = (com.google.p4242bp.p4267h.p4268a.C56388u) r14
            r13.f295527g = r14
            com.google.protobuf.dn r14 = r14.f150380d
            int r14 = r14.size()
            if (r14 != 0) goto L_0x006e
            com.google.bp.h.a.u r14 = r13.f295527g
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.bp.h.a.o r14 = (com.google.p4242bp.p4267h.p4268a.C56382o) r14
            com.google.protobuf.cq r1 = r0.f145559b
            java.util.Iterator r1 = r1.iterator()
        L_0x003d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0055
            java.lang.Object r2 = r1.next()
            com.google.bb.a.ka r2 = (com.google.p4152bb.p4153a.C55213ka) r2
            int r3 = r2.f145358a
            r3 = r3 & 16
            if (r3 == 0) goto L_0x003d
            int r3 = r2.f145362e
            r14.mo54360a(r3, r2)
            goto L_0x003d
        L_0x0055:
            int r1 = r0.f145558a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0066
            com.google.bb.a.ka r0 = r0.f145563f
            if (r0 != 0) goto L_0x0061
            com.google.bb.a.ka r0 = com.google.p4152bb.p4153a.C55213ka.f145356g
        L_0x0061:
            int r1 = r0.f145362e
            r14.mo54360a(r1, r0)
        L_0x0066:
            com.google.protobuf.bv r14 = r14.build()
            com.google.bp.h.a.u r14 = (com.google.p4242bp.p4267h.p4268a.C56388u) r14
            r13.f295527g = r14
        L_0x006e:
            com.google.bp.h.a.u r14 = r13.f295527g
            com.google.protobuf.cj r0 = new com.google.protobuf.cj
            com.google.protobuf.ch r14 = r14.f150379b
            com.google.protobuf.ci r1 = com.google.p4242bp.p4267h.p4268a.C56388u.f150374c
            r0.<init>(r14, r1)
            java.util.HashSet r14 = com.google.common.p4522b.C58758qx.m90648f(r0)
            r13.f295528h = r14
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            r13.f295525e = r14
            com.google.bp.h.a.u r14 = r13.f295527g
            com.google.protobuf.dn r14 = r14.f150380d
            java.util.Map r14 = java.util.Collections.unmodifiableMap(r14)
            java.util.Set r14 = r14.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0096:
            boolean r0 = r14.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r14.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            com.google.bb.a.ka r2 = (com.google.p4152bb.p4153a.C55213ka) r2
            int r3 = r2.f145358a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0096
            java.util.Map r1 = r13.f295525e
            java.lang.Object r0 = r0.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r2.f145359b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L_0x0096
        L_0x00c0:
            com.google.bp.h.v r14 = r13.f295531a
            com.google.protobuf.bt r0 = com.google.p4242bp.p4267h.p4268a.C56369b.f150329b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r14.mo58887l(r0)
            com.google.protobuf.bf r14 = r14.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r14 = r14.mo58857o(r0)
            if (r14 != 0) goto L_0x00d6
            return
        L_0x00d6:
            com.google.bp.h.v r14 = r13.f295531a
            com.google.protobuf.bt r0 = com.google.p4242bp.p4267h.p4268a.C56369b.f150329b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r14.mo58887l(r0)
            com.google.protobuf.bf r14 = r14.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r14 = r14.mo58854l(r2)
            if (r14 != 0) goto L_0x00ee
            java.lang.Object r14 = r0.f169969b
            goto L_0x00f2
        L_0x00ee:
            java.lang.Object r14 = r0.mo58889c(r14)
        L_0x00f2:
            com.google.bb.a.lz r14 = (com.google.p4152bb.p4153a.C55265lz) r14
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.bb.a.ly r14 = (com.google.p4152bb.p4153a.C55264ly) r14
            com.google.android.apps.gsa.staticplugins.offline.c.a.a r0 = r13.f295526f
            r2 = 0
            r3 = 2
            r4 = 0
            if (r14 != 0) goto L_0x0103
            goto L_0x0268
        L_0x0103:
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            com.google.protobuf.cq r5 = r5.f145559b
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0149
            com.google.bb.a.jz[] r6 = new com.google.p4152bb.p4153a.C55211jz[r5]
            r7 = 0
        L_0x0112:
            if (r7 >= r5) goto L_0x0123
            com.google.bb.a.ka r8 = r14.mo54222a(r7)
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.bb.a.jz r8 = (com.google.p4152bb.p4153a.C55211jz) r8
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0112
        L_0x0123:
            r14.copyOnWrite()
            com.google.protobuf.bv r7 = r14.instance
            com.google.bb.a.lz r7 = (com.google.p4152bb.p4153a.C55265lz) r7
            com.google.protobuf.cq r8 = com.google.p4152bb.p4153a.C55265lz.emptyProtobufList()
            r7.f145559b = r8
            r7 = 0
        L_0x0131:
            if (r7 >= r5) goto L_0x0149
            r8 = r6[r7]
            boolean r8 = r0.mo95129b(r8)
            if (r8 == 0) goto L_0x0146
            r8 = r6[r7]
            com.google.protobuf.bv r8 = r8.build()
            com.google.bb.a.ka r8 = (com.google.p4152bb.p4153a.C55213ka) r8
            r14.mo54224c(r8)
        L_0x0146:
            int r7 = r7 + 1
            goto L_0x0131
        L_0x0149:
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            com.google.protobuf.cq r5 = r5.f145560c
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x019e
            com.google.bb.a.ni[] r6 = new com.google.p4152bb.p4153a.C55302ni[r5]
            r7 = 0
        L_0x0158:
            if (r7 >= r5) goto L_0x0169
            com.google.bb.a.nl r8 = r14.mo54223b(r7)
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.bb.a.ni r8 = (com.google.p4152bb.p4153a.C55302ni) r8
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0158
        L_0x0169:
            r14.copyOnWrite()
            com.google.protobuf.bv r7 = r14.instance
            com.google.bb.a.lz r7 = (com.google.p4152bb.p4153a.C55265lz) r7
            com.google.protobuf.cq r8 = com.google.p4152bb.p4153a.C55265lz.emptyProtobufList()
            r7.f145560c = r8
            r7 = 0
        L_0x0177:
            if (r7 >= r5) goto L_0x019e
            r8 = r6[r7]
            boolean r8 = r0.mo95134g(r8)
            if (r8 == 0) goto L_0x019b
            r8 = r6[r7]
            com.google.protobuf.bv r8 = r8.build()
            com.google.bb.a.nl r8 = (com.google.p4152bb.p4153a.C55305nl) r8
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            com.google.bb.a.lz r9 = (com.google.p4152bb.p4153a.C55265lz) r9
            r8.getClass()
            r9.mo54227b()
            com.google.protobuf.cq r9 = r9.f145560c
            r9.add(r8)
        L_0x019b:
            int r7 = r7 + 1
            goto L_0x0177
        L_0x019e:
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            int r6 = r5.f145558a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x01e2
            com.google.bb.a.jq r5 = r5.f145564g
            if (r5 != 0) goto L_0x01ae
            com.google.bb.a.jq r5 = com.google.p4152bb.p4153a.C55202jq.f145289f
        L_0x01ae:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.bb.a.jp r5 = (com.google.p4152bb.p4153a.C55201jp) r5
            boolean r6 = r0.mo95128a(r5)
            if (r6 == 0) goto L_0x01d3
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.bb.a.lz r6 = (com.google.p4152bb.p4153a.C55265lz) r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.jq r5 = (com.google.p4152bb.p4153a.C55202jq) r5
            r5.getClass()
            r6.f145564g = r5
            int r5 = r6.f145558a
            r5 = r5 | 8
            r6.f145558a = r5
            goto L_0x01e2
        L_0x01d3:
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            r5.f145564g = r2
            int r6 = r5.f145558a
            r6 = r6 & -9
            r5.f145558a = r6
        L_0x01e2:
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            int r6 = r5.f145558a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0226
            com.google.bb.a.ka r5 = r5.f145563f
            if (r5 != 0) goto L_0x01f2
            com.google.bb.a.ka r5 = com.google.p4152bb.p4153a.C55213ka.f145356g
        L_0x01f2:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.bb.a.jz r5 = (com.google.p4152bb.p4153a.C55211jz) r5
            boolean r6 = r0.mo95129b(r5)
            if (r6 == 0) goto L_0x0217
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.bb.a.lz r6 = (com.google.p4152bb.p4153a.C55265lz) r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.ka r5 = (com.google.p4152bb.p4153a.C55213ka) r5
            r5.getClass()
            r6.f145563f = r5
            int r5 = r6.f145558a
            r5 = r5 | 4
            r6.f145558a = r5
            goto L_0x0226
        L_0x0217:
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            r5.f145563f = r2
            int r6 = r5.f145558a
            r6 = r6 & -5
            r5.f145558a = r6
        L_0x0226:
            com.google.protobuf.bv r5 = r14.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            int r6 = r5.f145558a
            r6 = r6 & r3
            if (r6 == 0) goto L_0x0268
            com.google.bb.a.nl r5 = r5.f145562e
            if (r5 != 0) goto L_0x0235
            com.google.bb.a.nl r5 = com.google.p4152bb.p4153a.C55305nl.f145689r
        L_0x0235:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.bb.a.ni r5 = (com.google.p4152bb.p4153a.C55302ni) r5
            boolean r0 = r0.mo95134g(r5)
            if (r0 == 0) goto L_0x0259
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.nl r5 = (com.google.p4152bb.p4153a.C55305nl) r5
            r5.getClass()
            r0.f145562e = r5
            int r5 = r0.f145558a
            r5 = r5 | r3
            r0.f145558a = r5
            goto L_0x0268
        L_0x0259:
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            r0.f145562e = r2
            int r5 = r0.f145558a
            r5 = r5 & -3
            r0.f145558a = r5
        L_0x0268:
            com.google.protobuf.bv r14 = r14.build()
            com.google.bb.a.lz r14 = (com.google.p4152bb.p4153a.C55265lz) r14
            if (r15 == 0) goto L_0x02b9
            if (r14 == 0) goto L_0x02b9
            r0 = 0
        L_0x0273:
            com.google.protobuf.bv r5 = r15.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            com.google.protobuf.cq r5 = r5.f145559b
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x02b9
            com.google.protobuf.cq r5 = r14.f145559b
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02b6
            java.lang.Object r5 = r5.next()
            com.google.bb.a.ka r5 = (com.google.p4152bb.p4153a.C55213ka) r5
            com.google.bb.a.ka r6 = r15.mo54222a(r0)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.bb.a.jz r6 = (com.google.p4152bb.p4153a.C55211jz) r6
            com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a.C105885a.m176392i(r6, r5)
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            com.google.protobuf.bv r6 = r6.build()
            com.google.bb.a.ka r6 = (com.google.p4152bb.p4153a.C55213ka) r6
            r6.getClass()
            r5.mo54226a()
            com.google.protobuf.cq r5 = r5.f145559b
            r5.set(r0, r6)
        L_0x02b6:
            int r0 = r0 + 1
            goto L_0x0273
        L_0x02b9:
            if (r15 == 0) goto L_0x02ef
            if (r14 == 0) goto L_0x02ef
            r0 = 0
        L_0x02be:
            com.google.protobuf.bv r5 = r15.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            com.google.protobuf.cq r5 = r5.f145560c
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x02ef
            com.google.protobuf.cq r5 = r14.f145560c
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02ec
            java.lang.Object r5 = r5.next()
            com.google.bb.a.nl r5 = (com.google.p4152bb.p4153a.C55305nl) r5
            com.google.bb.a.nl r6 = r15.mo54223b(r0)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.bb.a.ni r6 = (com.google.p4152bb.p4153a.C55302ni) r6
            com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a.C105885a.m176396m(r6, r5)
            r15.mo54225d(r0, r6)
        L_0x02ec:
            int r0 = r0 + 1
            goto L_0x02be
        L_0x02ef:
            if (r15 == 0) goto L_0x0311
            if (r14 == 0) goto L_0x0311
            int r0 = r14.f145558a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0311
            com.google.bb.a.jq r0 = r14.f145564g
            if (r0 != 0) goto L_0x02ff
            com.google.bb.a.jq r0 = com.google.p4152bb.p4153a.C55202jq.f145289f
        L_0x02ff:
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            r0.getClass()
            r5.f145564g = r0
            int r0 = r5.f145558a
            r0 = r0 | 8
            r5.f145558a = r0
        L_0x0311:
            if (r15 == 0) goto L_0x032c
            if (r14 == 0) goto L_0x032c
            int r0 = r14.f145558a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x032c
            int r0 = r14.f145565h
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            int r6 = r5.f145558a
            r6 = r6 | 16
            r5.f145558a = r6
            r5.f145565h = r0
        L_0x032c:
            if (r15 == 0) goto L_0x0367
            if (r14 == 0) goto L_0x0367
            int r0 = r14.f145558a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0367
            com.google.protobuf.bv r0 = r15.instance
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            com.google.bb.a.ka r0 = r0.f145563f
            if (r0 != 0) goto L_0x0340
            com.google.bb.a.ka r0 = com.google.p4152bb.p4153a.C55213ka.f145356g
        L_0x0340:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.bb.a.jz r0 = (com.google.p4152bb.p4153a.C55211jz) r0
            com.google.bb.a.ka r5 = r14.f145563f
            if (r5 != 0) goto L_0x034c
            com.google.bb.a.ka r5 = com.google.p4152bb.p4153a.C55213ka.f145356g
        L_0x034c:
            com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a.C105885a.m176392i(r0, r5)
            r15.copyOnWrite()
            com.google.protobuf.bv r5 = r15.instance
            com.google.bb.a.lz r5 = (com.google.p4152bb.p4153a.C55265lz) r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.bb.a.ka r0 = (com.google.p4152bb.p4153a.C55213ka) r0
            r0.getClass()
            r5.f145563f = r0
            int r0 = r5.f145558a
            r0 = r0 | 4
            r5.f145558a = r0
        L_0x0367:
            if (r15 == 0) goto L_0x03a0
            if (r14 == 0) goto L_0x03a0
            int r0 = r14.f145558a
            r0 = r0 & r3
            if (r0 == 0) goto L_0x03a0
            com.google.protobuf.bv r0 = r15.instance
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            com.google.bb.a.nl r0 = r0.f145562e
            if (r0 != 0) goto L_0x037a
            com.google.bb.a.nl r0 = com.google.p4152bb.p4153a.C55305nl.f145689r
        L_0x037a:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.bb.a.ni r0 = (com.google.p4152bb.p4153a.C55302ni) r0
            com.google.bb.a.nl r14 = r14.f145562e
            if (r14 != 0) goto L_0x0386
            com.google.bb.a.nl r14 = com.google.p4152bb.p4153a.C55305nl.f145689r
        L_0x0386:
            com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a.C105885a.m176396m(r0, r14)
            r15.copyOnWrite()
            com.google.protobuf.bv r14 = r15.instance
            com.google.bb.a.lz r14 = (com.google.p4152bb.p4153a.C55265lz) r14
            com.google.protobuf.bv r0 = r0.build()
            com.google.bb.a.nl r0 = (com.google.p4152bb.p4153a.C55305nl) r0
            r0.getClass()
            r14.f145562e = r0
            int r0 = r14.f145558a
            r0 = r0 | r3
            r14.f145558a = r0
        L_0x03a0:
            com.google.protobuf.bv r14 = r15.instance
            com.google.bb.a.lz r14 = (com.google.p4152bb.p4153a.C55265lz) r14
            com.google.bb.a.jq r14 = r14.f145564g
            if (r14 != 0) goto L_0x03aa
            com.google.bb.a.jq r14 = com.google.p4152bb.p4153a.C55202jq.f145289f
        L_0x03aa:
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.bb.a.jp r14 = (com.google.p4152bb.p4153a.C55201jp) r14
            com.google.protobuf.bv r0 = r15.build()
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            com.google.bp.h.af r5 = r13.f295533c
            com.google.bp.h.aa r5 = r5.f150402b
            if (r5 != 0) goto L_0x03be
            com.google.bp.h.aa r5 = com.google.p4242bp.p4267h.C56389aa.f150386e
        L_0x03be:
            com.google.bp.h.af r6 = r13.f295533c
            int r6 = r6.f150401a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x041b
            com.google.android.apps.gsa.staticplugins.offline.c.b.c r6 = r13.f295532b
            int r7 = r5.f150389b
            com.google.bp.h.z r7 = com.google.p4242bp.p4267h.C56419z.m87986a(r7)
            if (r7 != 0) goto L_0x03d2
            com.google.bp.h.z r7 = com.google.p4242bp.p4267h.C56419z.UNSPECIFIED
        L_0x03d2:
            java.util.List r6 = r6.mo95143a(r7)
            if (r6 != 0) goto L_0x03d9
            goto L_0x041b
        L_0x03d9:
            int r6 = r5.f150390c
            int r7 = r5.f150391d
            com.google.android.apps.gsa.staticplugins.offline.c.b.c r8 = r13.f295532b
            int r5 = r5.f150389b
            com.google.bp.h.z r5 = com.google.p4242bp.p4267h.C56419z.m87986a(r5)
            if (r5 != 0) goto L_0x03e9
            com.google.bp.h.z r5 = com.google.p4242bp.p4267h.C56419z.UNSPECIFIED
        L_0x03e9:
            java.util.List r5 = r8.mo95143a(r5)
            java.util.Iterator r5 = r5.iterator()
            r8 = r2
        L_0x03f2:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x041c
            java.lang.Object r9 = r5.next()
            com.google.bb.a.pr r9 = (com.google.p4152bb.p4153a.C55365pr) r9
            int r10 = r9.f145883f
            if (r10 != r6) goto L_0x03f2
            int r10 = r9.f145885h
            if (r10 > r7) goto L_0x03f2
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.bb.a.po r9 = (com.google.p4152bb.p4153a.C55362po) r9
            boolean r10 = r13.mo95137d(r9)
            if (r10 == 0) goto L_0x03f2
            com.google.protobuf.bv r8 = r9.build()
            com.google.bb.a.pr r8 = (com.google.p4152bb.p4153a.C55365pr) r8
            if (r7 > r1) goto L_0x03f2
            goto L_0x041c
        L_0x041b:
            r8 = r2
        L_0x041c:
            r13.f295529i = r8
            if (r8 == 0) goto L_0x04e8
            com.google.protobuf.bn r5 = r8.toBuilder()
            com.google.bb.a.po r5 = (com.google.p4152bb.p4153a.C55362po) r5
            com.google.protobuf.bv r6 = r5.instance
            com.google.bb.a.pr r6 = (com.google.p4152bb.p4153a.C55365pr) r6
            com.google.bb.a.he r6 = r6.f145879b
            if (r6 != 0) goto L_0x0430
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0430:
            com.google.protobuf.cq r6 = r6.f145138g
            int r6 = r6.size()
            if (r6 == 0) goto L_0x0483
            com.google.protobuf.bv r6 = r5.instance
            com.google.bb.a.pr r6 = (com.google.p4152bb.p4153a.C55365pr) r6
            com.google.bb.a.he r6 = r6.f145879b
            if (r6 != 0) goto L_0x0442
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0442:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.bb.a.hd r6 = (com.google.p4152bb.p4153a.C55135hd) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.bb.a.he r7 = (com.google.p4152bb.p4153a.C55136he) r7
            com.google.protobuf.cq r8 = com.google.p4152bb.p4153a.C55136he.emptyProtobufList()
            r7.f145138g = r8
            com.google.android.apps.gsa.staticplugins.offline.a.a r7 = r13.f295530j
            com.google.protobuf.bv r8 = r5.instance
            com.google.bb.a.pr r8 = (com.google.p4152bb.p4153a.C55365pr) r8
            com.google.bb.a.he r8 = r8.f145879b
            if (r8 != 0) goto L_0x0461
            com.google.bb.a.he r8 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0461:
            com.google.protobuf.cq r8 = r8.f145138g
            com.google.protobuf.cq r9 = r0.f145559b
            java.util.List r7 = r7.mo95110a(r8, r9, r4)
            r6.mo54199b(r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bb.a.pr r7 = (com.google.p4152bb.p4153a.C55365pr) r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.bb.a.he r6 = (com.google.p4152bb.p4153a.C55136he) r6
            r6.getClass()
            r7.f145879b = r6
            int r6 = r7.f145878a
            r6 = r6 | r1
            r7.f145878a = r6
        L_0x0483:
            com.google.protobuf.bv r6 = r5.instance
            com.google.bb.a.pr r6 = (com.google.p4152bb.p4153a.C55365pr) r6
            com.google.bb.a.he r6 = r6.f145880c
            if (r6 != 0) goto L_0x048d
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x048d:
            com.google.protobuf.cq r6 = r6.f145138g
            int r6 = r6.size()
            if (r6 == 0) goto L_0x04e0
            com.google.protobuf.bv r6 = r5.instance
            com.google.bb.a.pr r6 = (com.google.p4152bb.p4153a.C55365pr) r6
            com.google.bb.a.he r6 = r6.f145880c
            if (r6 != 0) goto L_0x049f
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x049f:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.bb.a.hd r6 = (com.google.p4152bb.p4153a.C55135hd) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.bb.a.he r7 = (com.google.p4152bb.p4153a.C55136he) r7
            com.google.protobuf.cq r8 = com.google.p4152bb.p4153a.C55136he.emptyProtobufList()
            r7.f145138g = r8
            com.google.android.apps.gsa.staticplugins.offline.a.a r7 = r13.f295530j
            com.google.protobuf.bv r8 = r5.instance
            com.google.bb.a.pr r8 = (com.google.p4152bb.p4153a.C55365pr) r8
            com.google.bb.a.he r8 = r8.f145880c
            if (r8 != 0) goto L_0x04be
            com.google.bb.a.he r8 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x04be:
            com.google.protobuf.cq r8 = r8.f145138g
            com.google.protobuf.cq r0 = r0.f145559b
            java.util.List r0 = r7.mo95110a(r8, r0, r1)
            r6.mo54199b(r0)
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.bb.a.pr r0 = (com.google.p4152bb.p4153a.C55365pr) r0
            com.google.protobuf.bv r6 = r6.build()
            com.google.bb.a.he r6 = (com.google.p4152bb.p4153a.C55136he) r6
            r6.getClass()
            r0.f145880c = r6
            int r6 = r0.f145878a
            r6 = r6 | r3
            r0.f145878a = r6
        L_0x04e0:
            com.google.protobuf.bv r0 = r5.build()
            com.google.bb.a.pr r0 = (com.google.p4152bb.p4153a.C55365pr) r0
            r13.f295529i = r0
        L_0x04e8:
            com.google.bp.h.a.u r0 = r13.f295527g
            int r5 = r0.f150382f
            int r5 = com.google.p4242bp.p4267h.p4268a.C56387t.m87984a(r5)
            if (r5 != 0) goto L_0x04f3
            r5 = 1
        L_0x04f3:
            boolean r0 = r0.f150383g
            com.google.bb.a.mt r6 = com.google.p4152bb.p4153a.C55286mt.f145628b
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.bb.a.ms r6 = (com.google.p4152bb.p4153a.C55285ms) r6
            com.google.bb.a.pr r7 = r13.f295529i
            if (r7 != 0) goto L_0x0504
            r5 = 3
            goto L_0x05bd
        L_0x0504:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.bb.a.po r7 = (com.google.p4152bb.p4153a.C55362po) r7
            com.google.bp.h.a.u r8 = r13.f295527g
            int r9 = r8.f150378a
            r9 = r9 & r1
            if (r9 == 0) goto L_0x0529
            com.google.z.c.v r8 = r8.f150381e
            if (r8 != 0) goto L_0x0517
            com.google.z.c.v r8 = com.google.p5277z.p5282c.C68032v.f184320b
        L_0x0517:
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.bb.a.pr r9 = (com.google.p4152bb.p4153a.C55365pr) r9
            r8.getClass()
            r9.f145881d = r8
            int r8 = r9.f145878a
            r8 = r8 | 4
            r9.f145878a = r8
        L_0x0529:
            java.util.Set r8 = r13.f295528h
            com.google.bp.h.a.r r9 = com.google.p4242bp.p4267h.p4268a.C56385r.INCLUDE_SERVER_SIDE_TIMEOUT_PROMPTS
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x058c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.android.apps.gsa.staticplugins.offline.c.b.c r9 = r13.f295532b
            com.google.bp.h.af r10 = r13.f295533c
            com.google.bp.h.aa r10 = r10.f150402b
            if (r10 != 0) goto L_0x0542
            com.google.bp.h.aa r10 = com.google.p4242bp.p4267h.C56389aa.f150386e
        L_0x0542:
            int r10 = r10.f150389b
            com.google.bp.h.z r10 = com.google.p4242bp.p4267h.C56419z.m87986a(r10)
            if (r10 != 0) goto L_0x054c
            com.google.bp.h.z r10 = com.google.p4242bp.p4267h.C56419z.UNSPECIFIED
        L_0x054c:
            java.util.List r9 = r9.mo95143a(r10)
            if (r9 == 0) goto L_0x057d
            java.util.Iterator r9 = r9.iterator()
        L_0x0556:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x057d
            java.lang.Object r10 = r9.next()
            com.google.bb.a.pr r10 = (com.google.p4152bb.p4153a.C55365pr) r10
            int r11 = r10.f145883f
            r12 = -1
            if (r11 != r12) goto L_0x0556
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.bb.a.po r10 = (com.google.p4152bb.p4153a.C55362po) r10
            boolean r11 = r13.mo95137d(r10)
            if (r11 == 0) goto L_0x0556
            com.google.protobuf.bv r10 = r10.build()
            com.google.bb.a.pr r10 = (com.google.p4152bb.p4153a.C55365pr) r10
            r8.add(r10)
            goto L_0x0556
        L_0x057d:
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.bb.a.mt r9 = (com.google.p4152bb.p4153a.C55286mt) r9
            r9.mo54231a()
            com.google.protobuf.cq r9 = r9.f145632a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r9)
        L_0x058c:
            if (r0 != 0) goto L_0x059d
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.bb.a.pr r8 = (com.google.p4152bb.p4153a.C55365pr) r8
            int r9 = r8.f145878a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r8.f145878a = r9
            r8.f145886i = r4
        L_0x059d:
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.bb.a.mt r4 = (com.google.p4152bb.p4153a.C55286mt) r4
            com.google.protobuf.bv r8 = r7.build()
            com.google.bb.a.pr r8 = (com.google.p4152bb.p4153a.C55365pr) r8
            r8.getClass()
            r4.mo54231a()
            com.google.protobuf.cq r4 = r4.f145632a
            r4.add(r8)
            com.google.protobuf.bv r4 = r7.build()
            com.google.bb.a.pr r4 = (com.google.p4152bb.p4153a.C55365pr) r4
            r13.f295529i = r4
        L_0x05bd:
            com.google.protobuf.bv r4 = r14.instance
            com.google.bb.a.jq r4 = (com.google.p4152bb.p4153a.C55202jq) r4
            com.google.protobuf.cq r4 = r4.f145292b
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            r14.copyOnWrite()
            com.google.protobuf.bv r7 = r14.instance
            com.google.bb.a.jq r7 = (com.google.p4152bb.p4153a.C55202jq) r7
            com.google.protobuf.cq r8 = com.google.p4152bb.p4153a.C55202jq.emptyProtobufList()
            r7.f145292b = r8
            if (r5 != r3) goto L_0x05fb
            com.google.bb.a.kc r5 = com.google.p4152bb.p4153a.C55215kc.f145365c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bb.a.kb r5 = (com.google.p4152bb.p4153a.C55214kb) r5
            if (r0 == 0) goto L_0x05e3
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55286mt.f145630d
            goto L_0x05e5
        L_0x05e3:
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55286mt.f145629c
        L_0x05e5:
            com.google.protobuf.bv r8 = r6.build()
            com.google.bb.a.mt r8 = (com.google.p4152bb.p4153a.C55286mt) r8
            r5.mo58885m(r7, r8)
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.kc r5 = (com.google.p4152bb.p4153a.C55215kc) r5
            r14.mo54206a(r5)
            if (r0 == 0) goto L_0x05fc
            goto L_0x0678
        L_0x05fb:
            r3 = r5
        L_0x05fc:
            java.util.Iterator r4 = r4.iterator()
        L_0x0600:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0678
            java.lang.Object r5 = r4.next()
            com.google.bb.a.kc r5 = (com.google.p4152bb.p4153a.C55215kc) r5
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55286mt.f145630d
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r5.mo58887l(r7)
            com.google.protobuf.bf r8 = r5.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x0640
            if (r0 == 0) goto L_0x0600
            if (r3 != r1) goto L_0x0600
            com.google.bb.a.kc r0 = com.google.p4152bb.p4153a.C55215kc.f145365c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.bb.a.kb r0 = (com.google.p4152bb.p4153a.C55214kb) r0
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55286mt.f145630d
            com.google.protobuf.bv r3 = r6.build()
            com.google.bb.a.mt r3 = (com.google.p4152bb.p4153a.C55286mt) r3
            r0.mo58885m(r1, r3)
            com.google.protobuf.bv r0 = r0.build()
            com.google.bb.a.kc r0 = (com.google.p4152bb.p4153a.C55215kc) r0
            r14.mo54206a(r0)
            goto L_0x0678
        L_0x0640:
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55286mt.f145629c
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r5.mo58887l(r7)
            com.google.protobuf.bf r8 = r5.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r7 = r8.mo58857o(r7)
            if (r7 == 0) goto L_0x0674
            if (r0 != 0) goto L_0x0600
            if (r3 != r1) goto L_0x0600
            com.google.bb.a.kc r5 = com.google.p4152bb.p4153a.C55215kc.f145365c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bb.a.kb r5 = (com.google.p4152bb.p4153a.C55214kb) r5
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55286mt.f145629c
            com.google.protobuf.bv r8 = r6.build()
            com.google.bb.a.mt r8 = (com.google.p4152bb.p4153a.C55286mt) r8
            r5.mo58885m(r7, r8)
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.kc r5 = (com.google.p4152bb.p4153a.C55215kc) r5
            r14.mo54206a(r5)
            goto L_0x0600
        L_0x0674:
            r14.mo54206a(r5)
            goto L_0x0600
        L_0x0678:
            com.google.protobuf.bv r0 = r15.instance
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            int r0 = r0.f145558a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x069a
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.bb.a.lz r0 = (com.google.p4152bb.p4153a.C55265lz) r0
            com.google.protobuf.bv r14 = r14.build()
            com.google.bb.a.jq r14 = (com.google.p4152bb.p4153a.C55202jq) r14
            r14.getClass()
            r0.f145564g = r14
            int r14 = r0.f145558a
            r14 = r14 | 8
            r0.f145558a = r14
        L_0x069a:
            java.util.Set r14 = r13.f295528h
            com.google.bp.h.a.r r0 = com.google.p4242bp.p4267h.p4268a.C56385r.CLEAR_ALL_PROMPTS
            boolean r14 = r14.contains(r0)
            if (r14 == 0) goto L_0x06b3
            r15.copyOnWrite()
            com.google.protobuf.bv r14 = r15.instance
            com.google.bb.a.lz r14 = (com.google.p4152bb.p4153a.C55265lz) r14
            r14.f145564g = r2
            int r15 = r14.f145558a
            r15 = r15 & -9
            r14.f145558a = r15
        L_0x06b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.p8169c.p8170a.C105886b.mo95141h(com.google.bp.h.af, com.google.bb.a.ly):void");
    }
}
