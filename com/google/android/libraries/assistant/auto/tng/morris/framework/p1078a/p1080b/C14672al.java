package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14076d;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14217ba;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14242bz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14300ec;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14302ee;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14310em;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14311en;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14488lb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14623qb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14624qc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p001a.p007b.p011b.p012a.C0025a;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.al */
/* compiled from: PG */
public final class C14672al implements C14653a {

    /* renamed from: a */
    public C14416ik f44313a = C14416ik.UNKNOWN;

    /* renamed from: b */
    public final C86124t f44314b;

    /* renamed from: c */
    public boolean f44315c = true;

    /* renamed from: d */
    public boolean f44316d = true;

    /* renamed from: e */
    public int f44317e = 2;

    /* renamed from: f */
    public int f44318f = 2;

    /* renamed from: g */
    private final C14152v f44319g;

    public C14672al(C14152v vVar, C86124t tVar) {
        this.f44319g = vVar;
        this.f44314b = tVar;
    }

    /* renamed from: m */
    private final boolean m30776m() {
        return this.f44313a == C14416ik.ACTIVE_SESSION;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final void mo21503c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44315c = true;
        this.f44316d = true ^ this.f44314b.mo79746e(C90051dc.f248853bH);
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44313a = C14416ik.UNKNOWN;
        this.f44318f = 2;
        this.f44317e = 2;
        this.f44319g.f42891m = C0027c.OFF;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final int mo21647f() {
        if (this.f44314b.mo79746e(C90051dc.f248853bH)) {
            if (!m30776m()) {
                if (this.f44316d) {
                    return 6;
                }
                return 3;
            } else if (!this.f44315c && !this.f44316d) {
                return 4;
            } else {
                this.f44315c = true;
                this.f44316d = true;
                return 5;
            }
        } else if (!m30776m()) {
            return 3;
        } else {
            return this.f44316d ? 5 : 4;
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        r0.f44315c = false;
        r0.f44316d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097 A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21623h(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf r17, com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f r18, com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e r19, com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            int r4 = r1.f43800c
            r5 = 6
            if (r4 != r5) goto L_0x0012
            java.lang.Object r1 = r1.f43801d
            com.google.android.libraries.assistant.auto.tng.morris.e.il r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14417il) r1
            goto L_0x0014
        L_0x0012:
            com.google.android.libraries.assistant.auto.tng.morris.e.il r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14417il.f43604g
        L_0x0014:
            int r4 = r1.f43606a
            r6 = 13
            r7 = 11
            r8 = 9
            r10 = 2
            r11 = 12
            r12 = 5
            r13 = 4
            r14 = 3
            r15 = 0
            switch(r4) {
                case 0: goto L_0x005f;
                case 1: goto L_0x005d;
                case 2: goto L_0x005b;
                case 3: goto L_0x0059;
                case 4: goto L_0x0057;
                case 5: goto L_0x0055;
                case 6: goto L_0x0052;
                case 7: goto L_0x004f;
                case 8: goto L_0x0026;
                case 9: goto L_0x004c;
                case 10: goto L_0x0049;
                case 11: goto L_0x0046;
                case 12: goto L_0x0043;
                case 13: goto L_0x0040;
                case 14: goto L_0x003d;
                case 15: goto L_0x003a;
                case 16: goto L_0x0037;
                case 17: goto L_0x0034;
                case 18: goto L_0x0031;
                case 19: goto L_0x002e;
                case 20: goto L_0x002b;
                case 21: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r4 = 0
            goto L_0x0060
        L_0x0028:
            r4 = 23
            goto L_0x0060
        L_0x002b:
            r4 = 22
            goto L_0x0060
        L_0x002e:
            r4 = 21
            goto L_0x0060
        L_0x0031:
            r4 = 20
            goto L_0x0060
        L_0x0034:
            r4 = 19
            goto L_0x0060
        L_0x0037:
            r4 = 18
            goto L_0x0060
        L_0x003a:
            r4 = 17
            goto L_0x0060
        L_0x003d:
            r4 = 16
            goto L_0x0060
        L_0x0040:
            r4 = 15
            goto L_0x0060
        L_0x0043:
            r4 = 14
            goto L_0x0060
        L_0x0046:
            r4 = 13
            goto L_0x0060
        L_0x0049:
            r4 = 12
            goto L_0x0060
        L_0x004c:
            r4 = 11
            goto L_0x0060
        L_0x004f:
            r4 = 9
            goto L_0x0060
        L_0x0052:
            r4 = 8
            goto L_0x0060
        L_0x0055:
            r4 = 7
            goto L_0x0060
        L_0x0057:
            r4 = 6
            goto L_0x0060
        L_0x0059:
            r4 = 5
            goto L_0x0060
        L_0x005b:
            r4 = 4
            goto L_0x0060
        L_0x005d:
            r4 = 3
            goto L_0x0060
        L_0x005f:
            r4 = 2
        L_0x0060:
            r9 = 1
            if (r4 != 0) goto L_0x0064
            r4 = 1
        L_0x0064:
            int r4 = r4 + -2
            switch(r4) {
                case -1: goto L_0x01f9;
                case 0: goto L_0x01f9;
                case 1: goto L_0x01f2;
                case 2: goto L_0x01ea;
                case 3: goto L_0x01e1;
                case 4: goto L_0x01d9;
                case 5: goto L_0x01d1;
                case 6: goto L_0x01c9;
                case 7: goto L_0x0187;
                case 8: goto L_0x0069;
                case 9: goto L_0x017d;
                case 10: goto L_0x0175;
                case 11: goto L_0x0121;
                case 12: goto L_0x00f8;
                case 13: goto L_0x00ec;
                case 14: goto L_0x00e8;
                case 15: goto L_0x00f8;
                case 16: goto L_0x00a3;
                case 17: goto L_0x009b;
                case 18: goto L_0x0086;
                case 19: goto L_0x007d;
                case 20: goto L_0x0077;
                case 21: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            return r15
        L_0x006a:
            int r1 = r16.mo21647f()
            if (r1 == r5) goto L_0x0072
            goto L_0x01f9
        L_0x0072:
            r0.f44315c = r15
            r0.f44316d = r15
            return r9
        L_0x0077:
            boolean r1 = r0.f44316d
            if (r1 != 0) goto L_0x0072
            goto L_0x01f9
        L_0x007d:
            boolean r1 = r0.f44316d
            if (r1 == 0) goto L_0x0083
            goto L_0x01f9
        L_0x0083:
            r0.f44316d = r9
            return r9
        L_0x0086:
            int r1 = r1.f43609d
            int r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14330ff.m30608b(r1)
            if (r1 != 0) goto L_0x008f
            r1 = 1
        L_0x008f:
            r0.f44317e = r1
            boolean r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31500b(r18)
            if (r1 == 0) goto L_0x009a
        L_0x0097:
            r15 = 1
            goto L_0x01f9
        L_0x009a:
            return r15
        L_0x009b:
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r12)
            r3.mo21716c(r1)
            return r15
        L_0x00a3:
            java.lang.String r1 = r1.f43610e
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft.f43402d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.fs r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14343fs) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft) r4
            r4.f43404a = r11
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft) r4
            r1.getClass()
            r4.f43406c = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft) r1
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc.f43036c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.ba r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14217ba) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc) r4
            r1.getClass()
            r4.f43039b = r1
            r4.f43038a = r14
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc) r1
            r3.mo21716c(r1)
            return r15
        L_0x00e8:
            r0.mo21649l(r13, r3)
            return r9
        L_0x00ec:
            boolean r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31500b(r18)
            if (r1 == 0) goto L_0x00f4
            goto L_0x01f9
        L_0x00f4:
            r0.mo21649l(r14, r3)
            return r9
        L_0x00f8:
            int r1 = r2.f43332a
            a.b.b.a.c r1 = p001a.p007b.p011b.p012a.C0027c.m9a(r1)
            if (r1 != 0) goto L_0x0102
            a.b.b.a.c r1 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED
        L_0x0102:
            a.b.b.a.c r3 = p001a.p007b.p011b.p012a.C0027c.MINI
            if (r1 != r3) goto L_0x0112
            boolean r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31501c(r18)
            if (r1 != 0) goto L_0x0112
            int r1 = r0.f44318f
            if (r1 != r14) goto L_0x0112
            goto L_0x01f9
        L_0x0112:
            boolean r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31501c(r18)
            if (r1 == 0) goto L_0x0097
            boolean r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31499a(r18)
            if (r1 == 0) goto L_0x0120
            goto L_0x0097
        L_0x0120:
            return r15
        L_0x0121:
            int r3 = r1.f43608c
            com.google.android.libraries.assistant.auto.tng.morris.e.ik r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik.m30617a(r3)
            if (r3 != 0) goto L_0x012b
            com.google.android.libraries.assistant.auto.tng.morris.e.ik r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik.UNRECOGNIZED
        L_0x012b:
            r0.f44313a = r3
            int r3 = r1.f43611f
            int r3 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14076d.m30361b(r3)
            if (r3 != 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            if (r3 == r10) goto L_0x0143
        L_0x0138:
            int r1 = r1.f43611f
            int r1 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14076d.m30361b(r1)
            if (r1 != 0) goto L_0x0141
            r1 = 1
        L_0x0141:
            r0.f44318f = r1
        L_0x0143:
            com.google.android.libraries.assistant.auto.tng.morris.e.ik r1 = r0.f44313a
            com.google.android.libraries.assistant.auto.tng.morris.e.ik r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik.ACTIVE_SESSION
            if (r1 == r3) goto L_0x0166
            r0.f44315c = r9
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f44314b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248853bH
            boolean r1 = r1.mo79746e(r3)
            r1 = r1 ^ r9
            r0.f44316d = r1
            int r1 = r2.f43333b
            int r1 = p001a.p007b.p011b.p012a.C0025a.m8c(r1)
            if (r1 != 0) goto L_0x015f
            goto L_0x0166
        L_0x015f:
            if (r1 != r12) goto L_0x0166
            r1 = r19
            r1.mo21860b(r8)
        L_0x0166:
            boolean r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31501c(r18)
            if (r1 == 0) goto L_0x0097
            boolean r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31499a(r18)
            if (r1 == 0) goto L_0x0174
            goto L_0x0097
        L_0x0174:
            return r15
        L_0x0175:
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r7)
            r3.mo21716c(r1)
            return r15
        L_0x017d:
            r1 = 10
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r1)
            r3.mo21716c(r1)
            return r15
        L_0x0187:
            long r1 = r1.f43607b
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r4 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft.f43402d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.fs r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14343fs) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r6 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft) r6
            r6.f43404a = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r5 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft) r5
            r5.f43405b = r1
            com.google.protobuf.bv r1 = r4.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ft r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14344ft) r1
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc.f43036c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.ba r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14217ba) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r4 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc) r4
            r1.getClass()
            r4.f43039b = r1
            r4.f43038a = r14
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc) r1
            r3.mo21716c(r1)
            return r15
        L_0x01c9:
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r11)
            r3.mo21716c(r1)
            return r15
        L_0x01d1:
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r5)
            r3.mo21716c(r1)
            return r15
        L_0x01d9:
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r6)
            r3.mo21716c(r1)
            return r15
        L_0x01e1:
            r1 = 7
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r1)
            r3.mo21716c(r1)
            return r15
        L_0x01ea:
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r13)
            r3.mo21716c(r1)
            return r15
        L_0x01f2:
            com.google.android.libraries.assistant.auto.tng.morris.e.bc r1 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b.m31521s(r14)
            r3.mo21716c(r1)
        L_0x01f9:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14672al.mo21623h(com.google.android.libraries.assistant.auto.tng.morris.e.lf, com.google.android.libraries.assistant.auto.tng.morris.e.f, com.google.android.libraries.assistant.auto.tng.morris.framework.e, com.google.android.libraries.assistant.auto.tng.morris.framework.d):boolean");
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        if (aVar.mo21708b()) {
            C14152v vVar = this.f44319g;
            C0027c a = C0027c.m9a(fVar.f43332a);
            if (a == null) {
                a = C0027c.UNRECOGNIZED;
            }
            vVar.f42891m = a;
        }
        C0027c a2 = C0027c.m9a(fVar.f43332a);
        if (a2 == null) {
            a2 = C0027c.UNRECOGNIZED;
        }
        if (!a2.equals(C0027c.DRIVING_SCREEN)) {
            C0027c a3 = C0027c.m9a(fVar.f43332a);
            if (a3 == null) {
                a3 = C0027c.UNRECOGNIZED;
            }
            if (!a3.equals(C0027c.MICRO)) {
                C14488lb a4 = C14488lb.m30624a(fVar.f43335d);
                if (a4 == null) {
                    a4 = C14488lb.UNRECOGNIZED;
                }
                if (a4.getNumber() >= 20) {
                    C58976aa aaVar = C58975e.f156826a;
                    int i = fVar.f43335d;
                } else if (C14983a.m31501c(fVar)) {
                    int c = C0025a.m8c(fVar.f43333b);
                    if (c != 0 && c == 5 && aVar.mo21707a()) {
                        Optional k = mo21648k(6, dVar);
                        if (!k.isEmpty() && !((C14342fr) k.get()).f43391a.isEmpty()) {
                            C58976aa aaVar2 = C58975e.f156826a;
                            String str = ((C14342fr) k.get()).f43391a;
                            String str2 = ((C14342fr) k.get()).f43391a;
                            C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
                            C14310em emVar = (C14310em) C14311en.f43296b.createBuilder();
                            C14300ec ecVar = (C14300ec) C14302ee.f43267d.createBuilder();
                            ecVar.copyOnWrite();
                            str2.getClass();
                            ((C14302ee) ecVar.instance).f43270b = str2;
                            emVar.copyOnWrite();
                            C14302ee eeVar = (C14302ee) ecVar.build();
                            eeVar.getClass();
                            ((C14311en) emVar.instance).f43298a = eeVar;
                            baVar.copyOnWrite();
                            C14219bc bcVar = (C14219bc) baVar.instance;
                            C14311en enVar = (C14311en) emVar.build();
                            enVar.getClass();
                            bcVar.f43039b = enVar;
                            bcVar.f43038a = 20;
                            dVar.mo21716c((C14219bc) baVar.build());
                        }
                    }
                } else if (this.f44313a == C14416ik.ACTIVE_SESSION) {
                    int i2 = this.f44318f;
                    if (i2 == 3) {
                        dbVar.mo21541a(C14242bz.MEDIA_ICON);
                    } else if (i2 == 4) {
                        dbVar.mo21542b(C14496lj.MEDIA_TASK);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
    }

    /* renamed from: k */
    public final Optional mo21648k(int i, C14749d dVar) {
        C14342fr frVar;
        if (!m30776m()) {
            return Optional.empty();
        }
        Optional a = dVar.mo21714a(C14984b.m31520r(i));
        if (!a.isPresent()) {
            return Optional.empty();
        }
        C14221be beVar = (C14221be) a.get();
        if (beVar.f43043a == 2) {
            frVar = (C14342fr) beVar.f43044b;
        } else {
            frVar = C14342fr.f43389l;
        }
        return Optional.m71637of(frVar);
    }

    /* renamed from: l */
    public final void mo21649l(int i, C14749d dVar) {
        this.f44318f = i;
        C14623qb qbVar = (C14623qb) C14624qc.f44197b.createBuilder();
        qbVar.copyOnWrite();
        ((C14624qc) qbVar.instance).f44199a = C14076d.m30360a(i);
        C14624qc qcVar = (C14624qc) qbVar.build();
        C14217ba baVar = (C14217ba) C14219bc.f43036c.createBuilder();
        baVar.copyOnWrite();
        C14219bc bcVar = (C14219bc) baVar.instance;
        qcVar.getClass();
        bcVar.f43039b = qcVar;
        bcVar.f43038a = 10;
        dVar.mo21716c((C14219bc) baVar.build());
    }
}
