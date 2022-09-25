package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79992cm;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80000cu;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80002cw;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80004cy;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54808aa;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54822ao;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54848bn;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54849bo;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54916g;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54930u;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bb */
/* compiled from: PG */
class C112196bb implements Function {
    /* renamed from: a */
    public final C54849bo apply(C80007da daVar) {
        C54848bn bnVar = (C54848bn) C54849bo.f144023C.createBuilder();
        if ((daVar.f219524a & 1) != 0) {
            String str = daVar.f219525b;
            bnVar.copyOnWrite();
            C54849bo boVar = (C54849bo) bnVar.instance;
            str.getClass();
            boVar.f144027a |= 1;
            boVar.f144028b = str;
        }
        if ((daVar.f219524a & 2) != 0) {
            mo99468b(daVar, bnVar);
        }
        if ((daVar.f219524a & 4) != 0) {
            boolean z = daVar.f219527d;
            bnVar.copyOnWrite();
            C54849bo boVar2 = (C54849bo) bnVar.instance;
            boVar2.f144027a |= 4;
            boVar2.f144030d = z;
        }
        if ((daVar.f219524a & 8) != 0) {
            int i = daVar.f219528e;
            bnVar.copyOnWrite();
            C54849bo boVar3 = (C54849bo) bnVar.instance;
            boVar3.f144027a |= 8;
            boVar3.f144031e = i;
        }
        if ((daVar.f219524a & 16) != 0) {
            float f = daVar.f219529f;
            bnVar.copyOnWrite();
            C54849bo boVar4 = (C54849bo) bnVar.instance;
            boVar4.f144027a |= 16;
            boVar4.f144032f = f;
        }
        if ((daVar.f219524a & 256) != 0) {
            boolean z2 = daVar.f219530g;
            bnVar.copyOnWrite();
            C54849bo boVar5 = (C54849bo) bnVar.instance;
            boVar5.f144027a |= 32;
            boVar5.f144033g = z2;
        }
        if ((daVar.f219524a & 512) != 0) {
            boolean z3 = daVar.f219531h;
            bnVar.copyOnWrite();
            C54849bo boVar6 = (C54849bo) bnVar.instance;
            boVar6.f144027a |= 64;
            boVar6.f144034h = z3;
        }
        if ((daVar.f219524a & 1024) != 0) {
            String str2 = daVar.f219532i;
            bnVar.copyOnWrite();
            C54849bo boVar7 = (C54849bo) bnVar.instance;
            str2.getClass();
            boVar7.f144027a |= 128;
            boVar7.f144035i = str2;
        }
        if ((daVar.f219524a & 4096) != 0) {
            Function function = C112291dw.f311629a;
            C80004cy cyVar = daVar.f219533j;
            if (cyVar == null) {
                cyVar = C80004cy.f219489x;
            }
            C54822ao a = ((C112660z) function).apply(cyVar);
            bnVar.copyOnWrite();
            C54849bo boVar8 = (C54849bo) bnVar.instance;
            a.getClass();
            boVar8.f144036j = a;
            boVar8.f144027a |= 256;
        }
        if ((daVar.f219524a & 8192) != 0) {
            int i2 = daVar.f219534k;
            bnVar.copyOnWrite();
            C54849bo boVar9 = (C54849bo) bnVar.instance;
            boVar9.f144027a |= 512;
            boVar9.f144037k = i2;
        }
        if ((daVar.f219524a & 16384) != 0) {
            int i3 = daVar.f219535l;
            bnVar.copyOnWrite();
            C54849bo boVar10 = (C54849bo) bnVar.instance;
            boVar10.f144027a |= 1024;
            boVar10.f144038l = i3;
        }
        if ((daVar.f219524a & 32768) != 0) {
            float f2 = daVar.f219536m;
            bnVar.copyOnWrite();
            C54849bo boVar11 = (C54849bo) bnVar.instance;
            boVar11.f144027a |= 2048;
            boVar11.f144039m = f2;
        }
        if ((daVar.f219524a & 65536) != 0) {
            boolean z4 = daVar.f219537n;
            bnVar.copyOnWrite();
            C54849bo boVar12 = (C54849bo) bnVar.instance;
            boVar12.f144027a |= 4096;
            boVar12.f144040n = z4;
        }
        if ((daVar.f219524a & C89885b.S3REQUEST_VALUE) != 0) {
            boolean z5 = daVar.f219538o;
            bnVar.copyOnWrite();
            C54849bo boVar13 = (C54849bo) bnVar.instance;
            boVar13.f144027a |= 8192;
            boVar13.f144041o = z5;
        }
        if ((daVar.f219524a & C89885b.HTTP_VALUE) != 0) {
            boolean z6 = daVar.f219539p;
            bnVar.copyOnWrite();
            C54849bo boVar14 = (C54849bo) bnVar.instance;
            boVar14.f144027a |= 16384;
            boVar14.f144042p = z6;
        }
        if ((daVar.f219524a & 524288) != 0) {
            boolean z7 = daVar.f219540q;
            bnVar.copyOnWrite();
            C54849bo boVar15 = (C54849bo) bnVar.instance;
            boVar15.f144027a = 32768 | boVar15.f144027a;
            boVar15.f144043q = z7;
        }
        if ((daVar.f219524a & 1048576) != 0) {
            boolean z8 = daVar.f219541r;
            bnVar.copyOnWrite();
            C54849bo boVar16 = (C54849bo) bnVar.instance;
            boVar16.f144027a = 65536 | boVar16.f144027a;
            boVar16.f144044r = z8;
        }
        if ((daVar.f219524a & C89885b.NOW_VALUE) != 0) {
            boolean z9 = daVar.f219542s;
            bnVar.copyOnWrite();
            C54849bo boVar17 = (C54849bo) bnVar.instance;
            boVar17.f144027a = 131072 | boVar17.f144027a;
            boVar17.f144045s = z9;
        }
        if ((daVar.f219524a & 4194304) != 0) {
            boolean z10 = daVar.f219543t;
            bnVar.copyOnWrite();
            C54849bo boVar18 = (C54849bo) bnVar.instance;
            boVar18.f144027a = 262144 | boVar18.f144027a;
            boVar18.f144046t = z10;
        }
        if ((daVar.f219524a & 8388608) != 0) {
            boolean z11 = daVar.f219544u;
            bnVar.copyOnWrite();
            C54849bo boVar19 = (C54849bo) bnVar.instance;
            boVar19.f144027a = 524288 | boVar19.f144027a;
            boVar19.f144047u = z11;
        }
        if ((daVar.f219524a & 16777216) != 0) {
            boolean z12 = daVar.f219545v;
            bnVar.copyOnWrite();
            C54849bo boVar20 = (C54849bo) bnVar.instance;
            boVar20.f144027a = 1048576 | boVar20.f144027a;
            boVar20.f144048v = z12;
        }
        if ((daVar.f219524a & 33554432) != 0) {
            int i4 = daVar.f219546w;
            bnVar.copyOnWrite();
            C54849bo boVar21 = (C54849bo) bnVar.instance;
            boVar21.f144027a = 2097152 | boVar21.f144027a;
            boVar21.f144049w = i4;
        }
        if ((daVar.f219524a & 67108864) != 0) {
            boolean z13 = daVar.f219547x;
            bnVar.copyOnWrite();
            C54849bo boVar22 = (C54849bo) bnVar.instance;
            boVar22.f144027a = 4194304 | boVar22.f144027a;
            boVar22.f144050x = z13;
        }
        if ((daVar.f219524a & 134217728) != 0) {
            Function function2 = C112291dw.f311630b;
            C80000cu cuVar = daVar.f219548y;
            if (cuVar == null) {
                cuVar = C80000cu.f219479e;
            }
            C54930u a2 = ((C112652r) function2).apply(cuVar);
            bnVar.copyOnWrite();
            C54849bo boVar23 = (C54849bo) bnVar.instance;
            a2.getClass();
            boVar23.f144051y = a2;
            boVar23.f144027a |= 8388608;
        }
        if ((daVar.f219524a & 268435456) != 0) {
            Function function3 = C112291dw.f311631c;
            C80002cw cwVar = daVar.f219549z;
            if (cwVar == null) {
                cwVar = C80002cw.f219485c;
            }
            C54808aa a3 = ((C112158ak) function3).apply(cwVar);
            bnVar.copyOnWrite();
            C54849bo boVar24 = (C54849bo) bnVar.instance;
            a3.getClass();
            boVar24.f144052z = a3;
            boVar24.f144027a |= 16777216;
        }
        if ((daVar.f219524a & 536870912) != 0) {
            Function function4 = C112291dw.f311632d;
            C79992cm cmVar = daVar.f219522A;
            if (cmVar == null) {
                cmVar = C79992cm.f219445d;
            }
            C54916g a4 = ((C112133a) function4).apply(cmVar);
            bnVar.copyOnWrite();
            C54849bo boVar25 = (C54849bo) bnVar.instance;
            a4.getClass();
            boVar25.f144025A = a4;
            boVar25.f144027a |= 33554432;
        }
        if ((daVar.f219524a & 1073741824) != 0) {
            int i5 = daVar.f219523B;
            bnVar.copyOnWrite();
            C54849bo boVar26 = (C54849bo) bnVar.instance;
            boVar26.f144027a |= 67108864;
            boVar26.f144026B = i5;
        }
        return (C54849bo) bnVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public void mo99468b(C80007da daVar, C54848bn bnVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
