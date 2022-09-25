package com.google.android.apps.gsa.staticplugins.nowcards.p8118h;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import com.google.android.apps.gsa.sidekick.shared.util.C91979bc;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.sidekick.shared.util.C91988g;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104307ai;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9144ag;
import com.google.android.apps.p489g.p494d.C9145ah;
import com.google.android.apps.p489g.p494d.C9146ai;
import com.google.android.apps.p489g.p494d.C9147aj;
import com.google.android.apps.p489g.p494d.C9156as;
import com.google.android.apps.p489g.p494d.C9157at;
import com.google.android.apps.p489g.p494d.C9216cy;
import com.google.android.apps.p489g.p494d.C9217cz;
import com.google.android.apps.p489g.p494d.C9234dp;
import com.google.android.apps.p489g.p494d.C9235dq;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7780jr;
import com.google.p375ai.p378b.C7781js;
import com.google.p375ai.p378b.C7782jt;
import com.google.p375ai.p378b.C7783ju;
import com.google.p375ai.p378b.C8117wd;
import com.google.p375ai.p378b.C8118we;
import com.google.p375ai.p378b.C8120wg;
import com.google.p375ai.p378b.C8124wk;
import com.google.p375ai.p378b.C8126wm;
import com.google.p375ai.p378b.C8131wr;
import com.google.p375ai.p378b.C8155xo;
import com.google.p375ai.p378b.C8156xp;
import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.h.f */
/* compiled from: PG */
public final class C104987f extends C104307ai {

    /* renamed from: i */
    public static final C59071e f292488i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.h.f");

    public C104987f(C7718hj hjVar, CardRenderingContext cardRenderingContext, C104308aj ajVar) {
        super(hjVar, cardRenderingContext, ajVar);
    }

    /* renamed from: A */
    private static C7783ju m174069A(int i) {
        C7780jr jrVar = (C7780jr) C7783ju.f27241c.createBuilder();
        C7781js jsVar = (C7781js) C7782jt.f27238b.createBuilder();
        C7781js jsVar2 = (C7781js) C7782jt.f27238b.createBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            C8156xp xpVar = C8156xp.f28669f;
            jrVar.copyOnWrite();
            C7783ju juVar = (C7783ju) jrVar.instance;
            xpVar.getClass();
            juVar.mo16965a();
            juVar.f27243a.add(xpVar);
            jsVar.mo16962a(C8156xp.f28669f);
            jsVar2.mo16962a(C8156xp.f28669f);
        }
        jrVar.mo16960b(jsVar);
        jrVar.mo16960b(jsVar2);
        return (C7783ju) jrVar.build();
    }

    /* renamed from: B */
    private final C8124wk m174070B() {
        C8131wr wrVar = this.f290132c.f26978s;
        if (wrVar == null) {
            wrVar = C8131wr.f28584p;
        }
        if (wrVar.f28592g.size() <= 0) {
            return null;
        }
        C8131wr wrVar2 = this.f290132c.f26978s;
        if (wrVar2 == null) {
            wrVar2 = C8131wr.f28584p;
        }
        return (C8124wk) wrVar2.f28592g.get(0);
    }

    /* renamed from: C */
    private final C8124wk m174071C() {
        C8131wr wrVar = this.f290132c.f26978s;
        if (wrVar == null) {
            wrVar = C8131wr.f28584p;
        }
        if (wrVar.f28592g.size() <= 1) {
            return null;
        }
        C8131wr wrVar2 = this.f290132c.f26978s;
        if (wrVar2 == null) {
            wrVar2 = C8131wr.f28584p;
        }
        return (C8124wk) wrVar2.f28592g.get(1);
    }

    /* renamed from: D */
    private static C8156xp m174072D(String str, boolean z) {
        C8155xo xoVar = (C8155xo) C8156xp.f28669f.createBuilder();
        xoVar.copyOnWrite();
        C8156xp xpVar = (C8156xp) xoVar.instance;
        str.getClass();
        xpVar.f28671a |= 1;
        xpVar.f28672b = str;
        xoVar.copyOnWrite();
        C8156xp xpVar2 = (C8156xp) xoVar.instance;
        xpVar2.f28671a |= 8;
        xpVar2.f28674d = z;
        if (!z) {
            xoVar.copyOnWrite();
            C8156xp xpVar3 = (C8156xp) xoVar.instance;
            xpVar3.f28675e = 1;
            xpVar3.f28671a |= 16;
        }
        return (C8156xp) xoVar.build();
    }

    /* renamed from: L */
    private static void m174073L(Context context, int i, C7780jr jrVar, String str, String str2, String str3, boolean z) {
        if (str == null) {
            str = context.getString(R.string.no_info);
        }
        if (str2 == null) {
            str2 = context.getString(R.string.no_info);
        }
        if (str3 == null) {
            str3 = context.getString(R.string.no_info);
        }
        C8156xp D = m174072D(str, z);
        jrVar.copyOnWrite();
        C7783ju juVar = (C7783ju) jrVar.instance;
        C7783ju juVar2 = C7783ju.f27241c;
        D.getClass();
        juVar.mo16965a();
        juVar.f27243a.set(i, D);
        C7781js jsVar = (C7781js) jrVar.mo16959a(0).toBuilder();
        jsVar.mo16963b(i, m174072D(str2, z));
        jrVar.mo16961c(0, (C7782jt) jsVar.build());
        C7781js jsVar2 = (C7781js) jrVar.mo16959a(1).toBuilder();
        jsVar2.mo16963b(i, m174072D(str3, z));
        jrVar.mo16961c(1, (C7782jt) jsVar2.build());
    }

    /* renamed from: x */
    static C9235dq m174074x(C8124wk wkVar) {
        C9234dp dpVar = (C9234dp) C9235dq.f31914g.createBuilder();
        if ((wkVar.f28550a & 16) != 0) {
            String str = wkVar.f28555f;
            dpVar.copyOnWrite();
            C9235dq dqVar = (C9235dq) dpVar.instance;
            str.getClass();
            dqVar.f31916a |= 1;
            dqVar.f31917b = str;
        }
        int i = wkVar.f28550a;
        if ((i & 4) != 0 && (i & 8) != 0) {
            String str2 = wkVar.f28553d;
            dpVar.copyOnWrite();
            C9235dq dqVar2 = (C9235dq) dpVar.instance;
            str2.getClass();
            dqVar2.f31916a |= 2;
            dqVar2.f31918c = str2;
            String str3 = wkVar.f28554e;
            dpVar.copyOnWrite();
            C9235dq dqVar3 = (C9235dq) dpVar.instance;
            str3.getClass();
            dqVar3.f31916a |= 4;
            dqVar3.f31919d = str3;
        } else if ((i & 1) != 0) {
            String str4 = wkVar.f28551b;
            dpVar.copyOnWrite();
            C9235dq dqVar4 = (C9235dq) dpVar.instance;
            str4.getClass();
            dqVar4.f31916a |= 4;
            dqVar4.f31919d = str4;
        }
        if ((wkVar.f28550a & 32) != 0) {
            String str5 = wkVar.f28556g;
            dpVar.copyOnWrite();
            C9235dq dqVar5 = (C9235dq) dpVar.instance;
            str5.getClass();
            dqVar5.f31916a |= 8;
            dqVar5.f31920e = str5;
        }
        return (C9235dq) dpVar.build();
    }

    /* renamed from: y */
    private static C9141ad m174075y(C8131wr wrVar) {
        if ((wrVar.f28586a & 4096) == 0) {
            return null;
        }
        C7681g gVar = C7681g.DETAILS;
        C7526an anVar = wrVar.f28599n;
        if (anVar == null) {
            anVar = C7526an.f26049l;
        }
        return C91988g.m150966c(anVar, gVar, 0);
    }

    /* renamed from: z */
    private static C9157at m174076z(C7783ju juVar, int i, int i2) {
        C9156as asVar = (C9156as) C9157at.f31606f.createBuilder();
        asVar.copyOnWrite();
        C9157at atVar = (C9157at) asVar.instance;
        atVar.f31608a |= 2;
        atVar.f31610c = i;
        asVar.copyOnWrite();
        C9157at atVar2 = (C9157at) asVar.instance;
        atVar2.f31608a |= 4;
        atVar2.f31611d = i2;
        asVar.copyOnWrite();
        C9157at atVar3 = (C9157at) asVar.instance;
        juVar.getClass();
        atVar3.f31609b = juVar;
        atVar3.f31608a |= 1;
        return (C9157at) asVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r1 != 3) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0809  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0886  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x08c7  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x045f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9270n mo94024a(android.content.Context r34) {
        /*
            r33 = this;
            r0 = r33
            r8 = r34
            com.google.ai.b.hj r1 = r0.f290132c
            com.google.ai.b.wr r1 = r1.f26978s
            if (r1 != 0) goto L_0x000c
            com.google.ai.b.wr r1 = com.google.p375ai.p378b.C8131wr.f28584p
        L_0x000c:
            r9 = r1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.google.protobuf.cq r1 = r9.f28592g
            java.util.Iterator r1 = r1.iterator()
        L_0x0018:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r1.next()
            com.google.ai.b.wk r2 = (com.google.p375ai.p378b.C8124wk) r2
            boolean r3 = r2.f28558i
            if (r3 == 0) goto L_0x0018
            int r3 = r2.f28550a
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0018
            int r1 = r2.f28560k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12 = r1
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            com.google.ai.b.hj r1 = r0.f290132c
            com.google.ai.b.af r1 = r1.f26983x
            if (r1 != 0) goto L_0x003f
            com.google.ai.b.af r1 = com.google.p375ai.p378b.C7518af.f26025j
        L_0x003f:
            int r1 = r1.f26027a
            r13 = 2
            r1 = r1 & r13
            r14 = 3
            r15 = 0
            r7 = 1
            if (r1 == 0) goto L_0x005b
            com.google.ai.b.hj r1 = r0.f290132c
            com.google.ai.b.af r1 = r1.f26983x
            if (r1 != 0) goto L_0x0050
            com.google.ai.b.af r1 = com.google.p375ai.p378b.C7518af.f26025j
        L_0x0050:
            int r1 = r1.f26031e
            int r1 = com.google.p375ai.p378b.C7515ac.m22774a(r1)
            if (r1 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            if (r1 == r14) goto L_0x00a6
        L_0x005b:
            com.google.android.apps.gsa.staticplugins.nowcards.i.a.a r1 = new com.google.android.apps.gsa.staticplugins.nowcards.i.a.a
            com.google.ai.b.wk r2 = r33.m174070B()
            com.google.ai.b.wk r3 = r33.m174071C()
            if (r2 == 0) goto L_0x0083
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r2 = r2.f28551b
            java.lang.String r2 = com.google.android.apps.gsa.shared.util.C91035f.m148708d(r2)
            r4[r15] = r2
            java.lang.String r2 = r3.f28551b
            java.lang.String r2 = com.google.android.apps.gsa.shared.util.C91035f.m148708d(r2)
            r4[r7] = r2
            r2 = 2132092604(0x7f1526bc, float:1.982561E38)
            java.lang.String r2 = r8.getString(r2, r4)
            goto L_0x0091
        L_0x0083:
            if (r2 != 0) goto L_0x008a
            if (r3 == 0) goto L_0x008a
            java.lang.String r2 = r3.f28551b
            goto L_0x0091
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            java.lang.String r2 = r2.f28551b
            goto L_0x0091
        L_0x008f:
            java.lang.String r2 = ""
        L_0x0091:
            r1.<init>(r8, r2)
            com.google.android.apps.g.d.ad r2 = m174075y(r9)
            if (r2 == 0) goto L_0x009f
            com.google.ai.b.hj r3 = r0.f290132c
            r1.mo94436b(r2, r3)
        L_0x009f:
            com.google.android.apps.g.d.v r1 = r1.mo94435a()
            r10.add(r1)
        L_0x00a6:
            int r1 = r9.f28587b
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.m22949a(r1)
            if (r1 != 0) goto L_0x00b0
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x00b0:
            com.google.ai.b.vx r2 = com.google.p375ai.p378b.C8110vx.CRICKET
            if (r1 != r2) goto L_0x00c4
            if (r12 != 0) goto L_0x00b7
            r15 = 1
        L_0x00b7:
            com.google.android.apps.g.d.v r1 = r0.mo94433w(r8, r9, r15)
            r10.add(r1)
            r2 = r0
            r20 = r9
            r1 = r10
            goto L_0x08c9
        L_0x00c4:
            if (r12 != 0) goto L_0x00c8
            r1 = 1
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            com.google.android.apps.g.d.dr r2 = com.google.android.apps.p489g.p494d.C9236dr.f31922l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.g.d.do r2 = (com.google.android.apps.p489g.p494d.C9233do) r2
            int[] r3 = com.google.android.apps.gsa.sidekick.shared.util.C91979bc.f256480a
            int r3 = r9.f28588c
            int r3 = com.google.p375ai.p378b.C8126wm.m22953a(r3)
            if (r3 != 0) goto L_0x00dc
            r3 = 1
        L_0x00dc:
            int r3 = r3 + -1
            if (r3 == 0) goto L_0x00f1
            if (r3 == r7) goto L_0x00e9
            long r3 = r9.f28589d
            java.lang.String r3 = com.google.android.apps.gsa.sidekick.shared.util.C91979bc.m150945c(r8, r3)
            goto L_0x00f7
        L_0x00e9:
            r3 = 2132091742(0x7f15235e, float:1.982386E38)
            java.lang.String r3 = r8.getString(r3)
            goto L_0x00f7
        L_0x00f1:
            long r3 = r9.f28589d
            java.lang.String r3 = com.google.android.apps.gsa.sidekick.shared.util.C91979bc.m150944b(r8, r3)
        L_0x00f7:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.dr r4 = (com.google.android.apps.p489g.p494d.C9236dr) r4
            r3.getClass()
            int r5 = r4.f31924a
            r5 = r5 | r7
            r4.f31924a = r5
            r4.f31925b = r3
            java.lang.String r3 = com.google.android.apps.gsa.sidekick.shared.util.C91979bc.m150946d(r8, r9)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 2131103437(0x7f060ecd, float:1.781934E38)
            r11 = 4
            if (r4 != 0) goto L_0x0154
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.dr r4 = (com.google.android.apps.p489g.p494d.C9236dr) r4
            r3.getClass()
            int r6 = r4.f31924a
            r6 = r6 | r13
            r4.f31924a = r6
            r4.f31926c = r3
            int r3 = r9.f28588c
            int r3 = com.google.p375ai.p378b.C8126wm.m22953a(r3)
            if (r3 != 0) goto L_0x0130
            goto L_0x013e
        L_0x0130:
            if (r3 != r13) goto L_0x013e
            android.content.res.Resources r3 = r34.getResources()
            r4 = 2131103436(0x7f060ecc, float:1.7819338E38)
            int r3 = r3.getColor(r4)
            goto L_0x0146
        L_0x013e:
            android.content.res.Resources r3 = r34.getResources()
            int r3 = r3.getColor(r5)
        L_0x0146:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.dr r4 = (com.google.android.apps.p489g.p494d.C9236dr) r4
            int r6 = r4.f31924a
            r6 = r6 | r11
            r4.f31924a = r6
            r4.f31927d = r3
        L_0x0154:
            com.google.ai.b.wk r3 = r33.m174070B()
            com.google.ai.b.wk r4 = r33.m174071C()
            if (r3 == 0) goto L_0x0196
            com.google.android.apps.g.d.dq r6 = m174074x(r3)
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.android.apps.g.d.dp r6 = (com.google.android.apps.p489g.p494d.C9234dp) r6
            if (r1 == 0) goto L_0x017e
            boolean r3 = r3.f28558i
            if (r3 == 0) goto L_0x017e
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.android.apps.g.d.dq r1 = (com.google.android.apps.p489g.p494d.C9235dq) r1
            int r3 = r1.f31916a
            r3 = r3 | 16
            r1.f31916a = r3
            r1.f31921f = r7
            r1 = 0
        L_0x017e:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.g.d.dr r3 = (com.google.android.apps.p489g.p494d.C9236dr) r3
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.g.d.dq r6 = (com.google.android.apps.p489g.p494d.C9235dq) r6
            r6.getClass()
            r3.f31928e = r6
            int r6 = r3.f31924a
            r6 = r6 | 8
            r3.f31924a = r6
        L_0x0196:
            if (r4 == 0) goto L_0x01c9
            com.google.android.apps.g.d.dq r3 = m174074x(r4)
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.apps.g.d.dp r3 = (com.google.android.apps.p489g.p494d.C9234dp) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.g.d.dq r4 = (com.google.android.apps.p489g.p494d.C9235dq) r4
            int r6 = r4.f31916a
            r6 = r6 | 16
            r4.f31916a = r6
            r4.f31921f = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.g.d.dr r1 = (com.google.android.apps.p489g.p494d.C9236dr) r1
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.g.d.dq r3 = (com.google.android.apps.p489g.p494d.C9235dq) r3
            r3.getClass()
            r1.f31929f = r3
            int r3 = r1.f31924a
            r3 = r3 | 16
            r1.f31924a = r3
        L_0x01c9:
            int r1 = r9.f28587b
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.m22949a(r1)
            if (r1 != 0) goto L_0x01d3
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x01d3:
            int r3 = com.google.android.apps.gsa.sidekick.shared.util.C91980bd.m150950a(r1)
            if (r3 == 0) goto L_0x01e8
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.dr r4 = (com.google.android.apps.p489g.p494d.C9236dr) r4
            int r6 = r4.f31924a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r4.f31924a = r6
            r4.f31934k = r3
        L_0x01e8:
            com.google.android.apps.g.d.v r3 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.g.d.q r3 = (com.google.android.apps.p489g.p494d.C9273q) r3
            com.google.ai.b.hj r4 = r0.f290132c
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.g.d.v r6 = (com.google.android.apps.p489g.p494d.C9278v) r6
            r4.getClass()
            r6.f32174H = r4
            int r4 = r6.f32192a
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r17
            r6.f32192a = r4
            com.google.ai.b.vx r4 = com.google.p375ai.p378b.C8110vx.SOCCER
            if (r1 != r4) goto L_0x020d
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.SPORT_VERSUS_SIDE_BY_SIDE
            goto L_0x020f
        L_0x020d:
            com.google.android.apps.g.d.u r1 = com.google.android.apps.p489g.p494d.C9277u.SPORT_VERSUS_STACKED
        L_0x020f:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            int r1 = r1.f32164ay
            r4.f32196c = r1
            int r1 = r4.f32192a
            r1 = r1 | r7
            r4.f32192a = r1
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.apps.g.d.v r1 = (com.google.android.apps.p489g.p494d.C9278v) r1
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.g.d.dr r2 = (com.google.android.apps.p489g.p494d.C9236dr) r2
            r2.getClass()
            r1.f32203j = r2
            int r2 = r1.f32192a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r1.f32192a = r2
            com.google.android.apps.g.d.ad r1 = m174075y(r9)
            if (r1 == 0) goto L_0x024d
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.g.d.v r2 = (com.google.android.apps.p489g.p494d.C9278v) r2
            r2.f32169C = r1
            int r1 = r2.f32192a
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r4
            r2.f32192a = r1
        L_0x024d:
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.g.d.v r1 = (com.google.android.apps.p489g.p494d.C9278v) r1
            r10.add(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r1 = r9.f28588c
            int r1 = com.google.p375ai.p378b.C8126wm.m22953a(r1)
            java.lang.String r3 = ". "
            java.lang.String r2 = " "
            java.lang.String r11 = ", "
            if (r1 != 0) goto L_0x0273
        L_0x0269:
            r13 = r3
            r15 = r6
            r16 = r10
            r18 = r12
            r0 = 6
            r10 = r2
            goto L_0x05cf
        L_0x0273:
            if (r1 != r13) goto L_0x0269
            com.google.protobuf.cq r1 = r9.f28592g
            int r1 = r1.size()
            if (r1 != r13) goto L_0x05c4
            com.google.protobuf.cq r1 = r9.f28591f
            int r1 = r1.size()
            if (r1 != 0) goto L_0x028f
            r2 = r0
            r20 = r9
            r16 = r10
            r18 = r12
            r11 = 0
            goto L_0x0884
        L_0x028f:
            com.google.protobuf.cq r1 = r9.f28592g
            int r1 = r1.size()
            if (r1 == r13) goto L_0x02b6
            com.google.common.f.e r1 = f292488i
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "QpSportScoreEntryAdapte"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Server sent a different number of participants than the required 2"
            r3 = 22084(0x5644, float:3.0946E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            int r1 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            r15 = r6
            r20 = r9
            r16 = r10
            r18 = r12
            goto L_0x05f0
        L_0x02b6:
            com.google.protobuf.cq r1 = r9.f28592g
            java.lang.Object r1 = r1.get(r15)
            com.google.ai.b.wk r1 = (com.google.p375ai.p378b.C8124wk) r1
            com.google.protobuf.cq r4 = r9.f28592g
            java.lang.Object r4 = r4.get(r7)
            com.google.ai.b.wk r4 = (com.google.p375ai.p378b.C8124wk) r4
            com.google.protobuf.cq r5 = r9.f28591f
            int r5 = r5.size()
            r13 = 9
            int r13 = java.lang.Math.min(r5, r13)
            int r15 = r9.f28587b
            com.google.ai.b.vx r15 = com.google.p375ai.p378b.C8110vx.m22949a(r15)
            if (r15 != 0) goto L_0x02dc
            com.google.ai.b.vx r15 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x02dc:
            com.google.ai.b.vx r7 = com.google.p375ai.p378b.C8110vx.BASEBALL
            if (r15 != r7) goto L_0x02ee
            int r7 = r1.f28550a
            r7 = r7 & 64
            if (r7 == 0) goto L_0x02ee
            int r7 = r4.f28550a
            r7 = r7 & 64
            if (r7 == 0) goto L_0x02ee
            r15 = 1
            goto L_0x02ef
        L_0x02ee:
            r15 = 0
        L_0x02ef:
            int r7 = r13 + 1
            if (r15 == 0) goto L_0x02f7
            int r7 = r7 + r14
            r22 = 1
            goto L_0x02fb
        L_0x02f7:
            r22 = 1
            int r7 = r7 + 1
        L_0x02fb:
            com.google.ai.b.ju r23 = m174069A(r7)
            com.google.protobuf.bn r23 = r23.toBuilder()
            com.google.ai.b.jr r23 = (com.google.p375ai.p378b.C7780jr) r23
            r24 = 0
            r14 = 2132092598(0x7f1526b6, float:1.9825597E38)
            java.lang.String r14 = r8.getString(r14)
            r25 = r2
            java.lang.String r2 = r1.f28551b
            r26 = r2
            java.lang.String r2 = r4.f28551b
            r27 = 1
            r28 = r1
            r1 = r34
            r29 = r25
            r25 = r26
            r26 = r2
            r2 = r24
            r30 = r3
            r3 = r23
            r31 = r4
            r4 = r14
            r14 = r5
            r5 = r25
            r32 = r6
            r6 = r26
            r16 = r10
            r18 = r12
            r12 = 1
            r10 = r7
            r7 = r27
            m174073L(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2132092598(0x7f1526b6, float:1.9825597E38)
            java.lang.String r1 = r8.getString(r1)
            r7 = r32
            r7.append(r1)
            r7.append(r11)
            r6 = r28
            java.lang.String r1 = r6.f28551b
            r7.append(r1)
            r5 = r29
            r7.append(r5)
            r4 = r31
            java.lang.String r1 = r4.f28551b
            r7.append(r1)
            r3 = r30
            r7.append(r3)
            int r14 = r14 - r13
            r1 = 0
        L_0x0366:
            if (r1 >= r13) goto L_0x0496
            int r2 = r14 + r1
            com.google.protobuf.cq r12 = r9.f28591f
            java.lang.Object r12 = r12.get(r2)
            com.google.ai.b.wg r12 = (com.google.p375ai.p378b.C8120wg) r12
            r30 = r3
            int r3 = r12.f28542a
            r17 = 4
            r3 = r3 & 4
            if (r3 == 0) goto L_0x037f
            int r2 = r12.f28546e
            goto L_0x0381
        L_0x037f:
            int r2 = r2 + 1
        L_0x0381:
            com.google.protobuf.cq r3 = r12.f28543b
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0396
            com.google.protobuf.cq r3 = r12.f28543b
            r31 = r4
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = r3
            goto L_0x0399
        L_0x0396:
            r31 = r4
            r4 = 0
        L_0x0399:
            com.google.protobuf.cq r3 = r12.f28543b
            int r3 = r3.size()
            r19 = r4
            r4 = 1
            if (r3 <= r4) goto L_0x03ae
            com.google.protobuf.cq r3 = r12.f28543b
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = r3
            goto L_0x03af
        L_0x03ae:
            r4 = 0
        L_0x03af:
            int r24 = r1 + 1
            int r1 = r9.f28587b
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.m22949a(r1)
            if (r1 != 0) goto L_0x03bb
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x03bb:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0404
            r3 = 1
            if (r1 == r3) goto L_0x03fe
            r3 = 3
            if (r1 == r3) goto L_0x03f9
            r3 = 4
            if (r1 == r3) goto L_0x03f3
            r3 = 5
            r32 = r7
            r7 = 6
            if (r1 == r3) goto L_0x03f7
            if (r1 == r7) goto L_0x03da
            java.lang.String r1 = java.lang.Integer.toString(r2)
        L_0x03d6:
            r7 = r1
            r25 = r2
            goto L_0x0431
        L_0x03da:
            r1 = 1
            if (r2 != r1) goto L_0x03e5
            r1 = 2132086040(0x7f150d18, float:1.9812296E38)
            java.lang.String r1 = r8.getString(r1)
            goto L_0x03d6
        L_0x03e5:
            r1 = 2
            if (r2 != r1) goto L_0x03f7
            r1 = 2132086043(0x7f150d1b, float:1.9812302E38)
            java.lang.String r1 = r8.getString(r1)
            r7 = r1
            r25 = 2
            goto L_0x0431
        L_0x03f3:
            r32 = r7
            r3 = 5
            r7 = 6
        L_0x03f7:
            r1 = 2
            goto L_0x0402
        L_0x03f9:
            r32 = r7
            r7 = 6
            r1 = 3
            goto L_0x0402
        L_0x03fe:
            r32 = r7
            r7 = 6
            r1 = 4
        L_0x0402:
            r3 = 1
            goto L_0x0410
        L_0x0404:
            r32 = r7
            r3 = 5
            r7 = 6
            boolean r1 = r9.f28598m
            r3 = 1
            if (r3 == r1) goto L_0x040f
            r1 = 4
            goto L_0x0410
        L_0x040f:
            r1 = 2
        L_0x0410:
            if (r2 > r1) goto L_0x0417
            java.lang.String r1 = java.lang.Integer.toString(r2)
            goto L_0x03d6
        L_0x0417:
            int r1 = r2 - r1
            android.content.res.Resources r7 = r34.getResources()
            r25 = r2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r21 = 0
            r2[r21] = r3
            r3 = 2131951728(0x7f130070, float:1.9539879E38)
            java.lang.String r1 = r7.getQuantityString(r3, r1, r2)
            r7 = r1
        L_0x0431:
            r26 = 0
            r1 = r34
            r2 = r24
            r27 = r13
            r28 = r14
            r13 = r30
            r14 = 5
            r3 = r23
            r29 = r4
            r14 = r31
            r4 = r7
            r7 = r5
            r5 = r19
            r0 = r6
            r6 = r29
            r30 = r10
            r8 = r32
            r10 = r7
            r7 = r26
            m174073L(r1, r2, r3, r4, r5, r6, r7)
            int r1 = r9.f28587b
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.m22949a(r1)
            if (r1 != 0) goto L_0x045f
            com.google.ai.b.vx r1 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x045f:
            r2 = r1
            boolean r5 = r9.f28598m
            r6 = 1
            r1 = r34
            r3 = r25
            r4 = r12
            java.lang.String r1 = com.google.android.apps.gsa.sidekick.shared.util.C91979bc.m150947e(r1, r2, r3, r4, r5, r6)
            r8.append(r1)
            r8.append(r11)
            r3 = r19
            r8.append(r3)
            r8.append(r10)
            r3 = r29
            r8.append(r3)
            r8.append(r13)
            r6 = r0
            r7 = r8
            r5 = r10
            r3 = r13
            r4 = r14
            r1 = r24
            r13 = r27
            r14 = r28
            r10 = r30
            r12 = 1
            r0 = r33
            r8 = r34
            goto L_0x0366
        L_0x0496:
            r13 = r3
            r14 = r4
            r0 = r6
            r8 = r7
            r30 = r10
            r10 = r5
            if (r15 == 0) goto L_0x0564
            com.google.ai.b.vz r0 = r0.f28557h
            if (r0 != 0) goto L_0x04a5
            com.google.ai.b.vz r0 = com.google.p375ai.p378b.C8112vz.f28525d
        L_0x04a5:
            com.google.ai.b.vz r1 = r14.f28557h
            if (r1 != 0) goto L_0x04ab
            com.google.ai.b.vz r1 = com.google.p375ai.p378b.C8112vz.f28525d
        L_0x04ab:
            r12 = r1
            int r2 = r30 + -3
            r1 = 2132092020(0x7f152474, float:1.9824425E38)
            r15 = r8
            r8 = r34
            java.lang.String r4 = r8.getString(r1)
            int r1 = r0.f28527a
            java.lang.String r5 = java.lang.Integer.toString(r1)
            int r1 = r12.f28527a
            java.lang.String r6 = java.lang.Integer.toString(r1)
            r7 = 0
            r1 = r34
            r3 = r23
            m174073L(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2132092021(0x7f152475, float:1.9824427E38)
            java.lang.String r1 = r8.getString(r1)
            r15.append(r1)
            r15.append(r11)
            int r1 = r0.f28527a
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r15.append(r1)
            r15.append(r10)
            int r1 = r12.f28527a
            r15.append(r1)
            r15.append(r13)
            int r2 = r30 + -2
            r1 = 2132087998(0x7f1514be, float:1.9816267E38)
            java.lang.String r4 = r8.getString(r1)
            int r1 = r0.f28528b
            java.lang.String r5 = java.lang.Integer.toString(r1)
            int r1 = r12.f28528b
            java.lang.String r6 = java.lang.Integer.toString(r1)
            r1 = r34
            m174073L(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2132087999(0x7f1514bf, float:1.981627E38)
            java.lang.String r1 = r8.getString(r1)
            r15.append(r1)
            r15.append(r11)
            int r1 = r0.f28528b
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r15.append(r1)
            r15.append(r10)
            int r1 = r12.f28528b
            r15.append(r1)
            r15.append(r13)
            int r2 = r30 + -1
            r1 = 2132086530(0x7f150f02, float:1.981329E38)
            java.lang.String r4 = r8.getString(r1)
            int r1 = r0.f28529c
            java.lang.String r5 = java.lang.Integer.toString(r1)
            int r1 = r12.f28529c
            java.lang.String r6 = java.lang.Integer.toString(r1)
            r1 = r34
            m174073L(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2132086531(0x7f150f03, float:1.9813292E38)
            java.lang.String r1 = r8.getString(r1)
            r15.append(r1)
            r15.append(r11)
            int r0 = r0.f28529c
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r15.append(r0)
            r15.append(r10)
            int r0 = r12.f28529c
            r15.append(r0)
            r15.append(r13)
            goto L_0x0599
        L_0x0564:
            r15 = r8
            r8 = r34
            int r2 = r30 + -1
            r1 = 2132093032(0x7f152868, float:1.9826477E38)
            java.lang.String r4 = r8.getString(r1)
            java.lang.String r5 = r0.f28556g
            java.lang.String r6 = r14.f28556g
            r7 = 0
            r1 = r34
            r3 = r23
            m174073L(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2132093033(0x7f152869, float:1.982648E38)
            java.lang.String r1 = r8.getString(r1)
            r15.append(r1)
            r15.append(r11)
            java.lang.String r0 = r0.f28556g
            r15.append(r0)
            r15.append(r10)
            java.lang.String r0 = r14.f28556g
            r15.append(r0)
            r15.append(r13)
        L_0x0599:
            r7 = r30
            r0 = 6
            if (r7 <= r0) goto L_0x05aa
            android.content.res.Resources r0 = r34.getResources()
            r1 = 2131171609(0x7f071919, float:1.795761E38)
            int r0 = r0.getDimensionPixelSize(r1)
            goto L_0x05b5
        L_0x05aa:
            android.content.res.Resources r0 = r34.getResources()
            r1 = 2131171610(0x7f07191a, float:1.7957611E38)
            int r0 = r0.getDimensionPixelSize(r1)
        L_0x05b5:
            com.google.protobuf.bv r1 = r23.build()
            com.google.ai.b.ju r1 = (com.google.p375ai.p378b.C7783ju) r1
            r2 = 0
            com.google.android.apps.g.d.at r0 = m174076z(r1, r0, r2)
            r20 = r9
            goto L_0x0807
        L_0x05c4:
            r16 = r10
            r18 = r12
            r11 = 0
            r2 = r33
            r20 = r9
            goto L_0x0884
        L_0x05cf:
            com.google.protobuf.cq r1 = r9.f28592g
            int r1 = r1.size()
            r2 = 2
            if (r1 == r2) goto L_0x05f3
            com.google.common.f.e r0 = f292488i
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "QpSportScoreEntryAdapte"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Server sent a different number of participants than the required 2"
            r2 = 22085(0x5645, float:3.0948E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x05ee:
            r20 = r9
        L_0x05f0:
            r0 = 0
            goto L_0x0807
        L_0x05f3:
            com.google.protobuf.cq r1 = r9.f28592g
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            r12 = r1
            com.google.ai.b.wk r12 = (com.google.p375ai.p378b.C8124wk) r12
            com.google.protobuf.cq r1 = r9.f28592g
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            r14 = r1
            com.google.ai.b.wk r14 = (com.google.p375ai.p378b.C8124wk) r14
            int r1 = r12.f28550a
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x05ee
            int r1 = r14.f28550a
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x05ee
            boolean r1 = r9.f28598m
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r3 = r9.f28587b
            com.google.ai.b.vx r3 = com.google.p375ai.p378b.C8110vx.m22949a(r3)
            if (r3 != 0) goto L_0x0624
            com.google.ai.b.vx r3 = com.google.p375ai.p378b.C8110vx.BASKETBALL
        L_0x0624:
            int r3 = r3.ordinal()
            r5 = 15
            r7 = 11
            if (r3 == 0) goto L_0x0732
            r6 = 13
            r4 = 1
            if (r3 == r4) goto L_0x06ff
            r4 = 2
            if (r3 == r4) goto L_0x06d7
            r1 = 3
            if (r3 == r1) goto L_0x06a7
            r4 = 4
            if (r3 == r4) goto L_0x0677
            r0 = 5
            if (r3 == r0) goto L_0x0641
            goto L_0x0764
        L_0x0641:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.add(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.add(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.add(r0)
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            goto L_0x0764
        L_0x0677:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.add(r0)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.add(r0)
            r1 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.add(r0)
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            goto L_0x0764
        L_0x06a7:
            r1 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.add(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.add(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.add(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            goto L_0x0764
        L_0x06d7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.add(r0)
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.add(r1)
            r1 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.add(r1)
            goto L_0x0764
        L_0x06ff:
            r0 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.add(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.add(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.add(r3)
            if (r1 != 0) goto L_0x071e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.add(r0)
        L_0x071e:
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            if (r1 == 0) goto L_0x0764
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.add(r1)
            goto L_0x0764
        L_0x0732:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.add(r0)
            r0 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.add(r3)
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            if (r1 == 0) goto L_0x0764
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2.add(r1)
        L_0x0764:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x076f
            r20 = r9
            r0 = 0
            goto L_0x07e9
        L_0x076f:
            int r0 = r2.size()
            com.google.ai.b.ju r0 = m174069A(r0)
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.ai.b.jr r0 = (com.google.p375ai.p378b.C7780jr) r0
            java.util.Iterator r17 = r2.iterator()
            r2 = 0
        L_0x0782:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x07e1
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            int r19 = r2 + 1
            r5 = 0
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104986e.m174068b(r6, r8, r5)
            java.lang.String r20 = com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104986e.m174067a(r6, r12, r8, r5)
            java.lang.String r21 = com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104986e.m174067a(r6, r14, r8, r5)
            if (r6 != r7) goto L_0x07a6
            r23 = 1
            goto L_0x07a8
        L_0x07a6:
            r23 = 0
        L_0x07a8:
            r1 = r34
            r3 = r0
            r24 = 0
            r5 = r20
            r20 = r9
            r9 = r6
            r6 = r21
            r21 = 11
            r7 = r23
            m174073L(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104986e.m174068b(r9, r8, r1)
            r15.append(r2)
            r15.append(r11)
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104986e.m174067a(r9, r12, r8, r1)
            r15.append(r2)
            r15.append(r10)
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104986e.m174067a(r9, r14, r8, r1)
            r15.append(r2)
            r15.append(r13)
            r2 = r19
            r9 = r20
            r7 = 11
            goto L_0x0782
        L_0x07e1:
            r20 = r9
            com.google.protobuf.bv r0 = r0.build()
            com.google.ai.b.ju r0 = (com.google.p375ai.p378b.C7783ju) r0
        L_0x07e9:
            if (r0 != 0) goto L_0x07ed
            goto L_0x05f0
        L_0x07ed:
            android.content.res.Resources r1 = r34.getResources()
            r2 = 2131171610(0x7f07191a, float:1.7957611E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r34.getResources()
            r3 = 2131171546(0x7f0718da, float:1.7957482E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            com.google.android.apps.g.d.at r0 = m174076z(r0, r1, r2)
        L_0x0807:
            if (r0 != 0) goto L_0x080d
            r11 = 0
            r2 = r33
            goto L_0x0884
        L_0x080d:
            com.google.android.apps.g.d.v r1 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.g.d.q r1 = (com.google.android.apps.p489g.p494d.C9273q) r1
            r2 = r33
            com.google.ai.b.hj r3 = r2.f290132c
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            r3.getClass()
            r4.f32174H = r3
            int r3 = r4.f32192a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 | r5
            r4.f32192a = r3
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.GENERIC_TABLE
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            int r3 = r3.f32164ay
            r4.f32196c = r3
            int r3 = r4.f32192a
            r5 = 1
            r3 = r3 | r5
            r4.f32192a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            r3.f32206m = r0
            int r0 = r3.f32192a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r3.f32192a = r0
            int r0 = r15.length()
            if (r0 <= 0) goto L_0x0867
            java.lang.String r0 = r15.toString()
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r4 = r3.f32195b
            r4 = r4 | 32
            r3.f32195b = r4
            r3.f32180N = r0
        L_0x0867:
            com.google.android.apps.g.d.ad r0 = m174075y(r20)
            if (r0 == 0) goto L_0x087d
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            r3.f32169C = r0
            int r0 = r3.f32192a
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 | r4
            r3.f32192a = r0
        L_0x087d:
            com.google.protobuf.bv r0 = r1.build()
            r11 = r0
            com.google.android.apps.g.d.v r11 = (com.google.android.apps.p489g.p494d.C9278v) r11
        L_0x0884:
            if (r11 == 0) goto L_0x08c7
            if (r18 != 0) goto L_0x0898
            android.content.res.Resources r0 = r34.getResources()
            r1 = 2131103437(0x7f060ecd, float:1.781934E38)
            int r0 = r0.getColor(r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            goto L_0x089a
        L_0x0898:
            r12 = r18
        L_0x089a:
            com.google.protobuf.bn r0 = r11.toBuilder()
            com.google.android.apps.g.d.q r0 = (com.google.android.apps.p489g.p494d.C9273q) r0
            int r1 = r12.intValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r4 = r3.f32192a
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 | r5
            r3.f32192a = r4
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r4
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            r1 = r1 | r4
            r3.f32168B = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.g.d.v r0 = (com.google.android.apps.p489g.p494d.C9278v) r0
            r1 = r16
            r1.add(r0)
            goto L_0x08c9
        L_0x08c7:
            r1 = r16
        L_0x08c9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 5
            r0.<init>(r3)
            r3 = r20
            int r4 = r3.f28586a
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x08e9
            r4 = 2132092588(0x7f1526ac, float:1.9825577E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = r3.f28597l
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.SPORT_SCORE_PREVIEW
            com.google.android.apps.g.d.v r4 = r2.mo94432v(r4, r5, r6)
            r0.add(r4)
        L_0x08e9:
            int r4 = r3.f28586a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0901
            r4 = 2132092597(0x7f1526b5, float:1.9825595E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = r3.f28596k
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.SPORT_SCORE_STREAM
            com.google.android.apps.g.d.v r4 = r2.mo94432v(r4, r5, r6)
            r0.add(r4)
        L_0x0901:
            int r4 = r3.f28586a
            r4 = r4 & 64
            if (r4 == 0) goto L_0x0919
            r4 = 2132091296(0x7f1521a0, float:1.9822956E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = r3.f28595j
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.SPORT_SCORE_PLAY_BY_PLAY
            com.google.android.apps.g.d.v r4 = r2.mo94432v(r4, r5, r6)
            r0.add(r4)
        L_0x0919:
            int r4 = r3.f28586a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0931
            r4 = 2132092591(0x7f1526af, float:1.9825583E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = r3.f28593h
            com.google.ai.b.g r6 = com.google.p375ai.p378b.C7681g.SPORT_SCORE_RECAP
            com.google.android.apps.g.d.v r4 = r2.mo94432v(r4, r5, r6)
            r0.add(r4)
        L_0x0931:
            int r4 = r3.f28586a
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0949
            r4 = 2132085484(0x7f150aec, float:1.9811168E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r3 = r3.f28594i
            com.google.ai.b.g r5 = com.google.p375ai.p378b.C7681g.SPORT_SCORE_BOX_SCORE
            com.google.android.apps.g.d.v r3 = r2.mo94432v(r4, r3, r5)
            r0.add(r3)
        L_0x0949:
            r1.addAll(r0)
            com.google.android.apps.g.d.n r0 = com.google.android.apps.p489g.p494d.C9270n.f32072e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.g.d.m r0 = (com.google.android.apps.p489g.p494d.C9269m) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.g.d.n r3 = (com.google.android.apps.p489g.p494d.C9270n) r3
            int r4 = r3.f32074a
            r5 = 1
            r4 = r4 | r5
            r3.f32074a = r4
            r3.f32076c = r5
            r0.mo17460a(r1)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.g.d.n r0 = (com.google.android.apps.p489g.p494d.C9270n) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8118h.C104987f.mo94024a(android.content.Context):com.google.android.apps.g.d.n");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C9278v mo94432v(String str, String str2, C7681g gVar) {
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.PRIMARY_ACTION;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        C7718hj hjVar = this.f290132c;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar2.f32174H = hjVar;
        vVar2.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        C9216cy cyVar = (C9216cy) C9217cz.f31853i.createBuilder();
        cyVar.copyOnWrite();
        C9217cz czVar = (C9217cz) cyVar.instance;
        str.getClass();
        czVar.f31855a |= 1;
        czVar.f31856b = str;
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        C9217cz czVar2 = (C9217cz) cyVar.build();
        czVar2.getClass();
        vVar3.f32198e = czVar2;
        vVar3.f32192a |= 4;
        C9141ad d = C91988g.m150967d(str2, (String) null, gVar, R.drawable.quantum_ic_arrow_forward_white_24);
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        d.getClass();
        vVar4.f32169C = d;
        vVar4.f32192a |= 67108864;
        return (C9278v) qVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final C9278v mo94433w(Context context, C8131wr wrVar, boolean z) {
        int i;
        C8118we weVar = wrVar.f28600o;
        if (weVar == null) {
            weVar = C8118we.f28532g;
        }
        C9144ag agVar = (C9144ag) C9147aj.f31573j.createBuilder();
        String c = C91979bc.m150945c(context, wrVar.f28589d);
        agVar.copyOnWrite();
        C9147aj ajVar = (C9147aj) agVar.instance;
        c.getClass();
        ajVar.f31575a |= 1;
        ajVar.f31576b = c;
        int a = C8117wd.m22951a(weVar.f28535b);
        if (a != 0 && a == 2) {
            String d = C91979bc.m150946d(context, wrVar);
            if (!TextUtils.isEmpty(d)) {
                agVar.copyOnWrite();
                C9147aj ajVar2 = (C9147aj) agVar.instance;
                d.getClass();
                ajVar2.f31575a |= 2;
                ajVar2.f31577c = d;
                int a2 = C8126wm.m22953a(wrVar.f28588c);
                if (a2 != 0 && a2 == 2) {
                    i = context.getResources().getColor(R.color.qp_status_green);
                } else {
                    i = context.getResources().getColor(R.color.qp_status_none);
                }
                agVar.copyOnWrite();
                C9147aj ajVar3 = (C9147aj) agVar.instance;
                ajVar3.f31575a |= 4;
                ajVar3.f31578d = i;
            }
        }
        if ((wrVar.f28586a & 8) != 0) {
            CharSequence[] charSequenceArr = new CharSequence[2];
            C8118we weVar2 = wrVar.f28600o;
            if (weVar2 == null) {
                weVar2 = C8118we.f28532g;
            }
            charSequenceArr[0] = weVar2.f28538e;
            charSequenceArr[1] = wrVar.f28590e;
            String obj = C91985d.m150956c(" - ", Arrays.asList(charSequenceArr)).toString();
            agVar.copyOnWrite();
            C9147aj ajVar4 = (C9147aj) agVar.instance;
            obj.getClass();
            ajVar4.f31575a |= 8;
            ajVar4.f31579e = obj;
        } else {
            C8118we weVar3 = wrVar.f28600o;
            if (weVar3 == null) {
                weVar3 = C8118we.f28532g;
            }
            String str = weVar3.f28538e;
            agVar.copyOnWrite();
            C9147aj ajVar5 = (C9147aj) agVar.instance;
            str.getClass();
            ajVar5.f31575a |= 8;
            ajVar5.f31579e = str;
        }
        C8124wk B = m174070B();
        if (B != null) {
            C9145ah ahVar = (C9145ah) C9146ai.f31566f.createBuilder();
            String str2 = B.f28551b;
            ahVar.copyOnWrite();
            C9146ai aiVar = (C9146ai) ahVar.instance;
            str2.getClass();
            aiVar.f31568a |= 2;
            aiVar.f31570c = str2;
            if ((B.f28550a & 16) != 0) {
                String str3 = B.f28555f;
                ahVar.copyOnWrite();
                C9146ai aiVar2 = (C9146ai) ahVar.instance;
                str3.getClass();
                aiVar2.f31568a |= 1;
                aiVar2.f31569b = str3;
                if (z && B.f28558i) {
                    ahVar.copyOnWrite();
                    C9146ai aiVar3 = (C9146ai) ahVar.instance;
                    aiVar3.f31568a |= 4;
                    aiVar3.f31572e = true;
                    z = false;
                }
            }
            agVar.copyOnWrite();
            C9147aj ajVar6 = (C9147aj) agVar.instance;
            C9146ai aiVar4 = (C9146ai) ahVar.build();
            aiVar4.getClass();
            ajVar6.f31580f = aiVar4;
            ajVar6.f31575a |= 16;
        }
        C8124wk C = m174071C();
        if (C != null) {
            C9145ah ahVar2 = (C9145ah) C9146ai.f31566f.createBuilder();
            String str4 = C.f28551b;
            ahVar2.copyOnWrite();
            C9146ai aiVar5 = (C9146ai) ahVar2.instance;
            str4.getClass();
            aiVar5.f31568a = 2 | aiVar5.f31568a;
            aiVar5.f31570c = str4;
            ahVar2.copyOnWrite();
            C9146ai aiVar6 = (C9146ai) ahVar2.instance;
            aiVar6.f31568a |= 4;
            aiVar6.f31572e = z;
            if ((C.f28550a & 16) != 0) {
                String str5 = C.f28555f;
                ahVar2.copyOnWrite();
                C9146ai aiVar7 = (C9146ai) ahVar2.instance;
                str5.getClass();
                aiVar7.f31568a |= 1;
                aiVar7.f31569b = str5;
            }
            agVar.copyOnWrite();
            C9147aj ajVar7 = (C9147aj) agVar.instance;
            C9146ai aiVar8 = (C9146ai) ahVar2.build();
            aiVar8.getClass();
            ajVar7.f31581g = aiVar8;
            ajVar7.f31575a |= 32;
        }
        if ((weVar.f28534a & 4) != 0) {
            String str6 = weVar.f28537d;
            agVar.copyOnWrite();
            C9147aj ajVar8 = (C9147aj) agVar.instance;
            str6.getClass();
            ajVar8.f31575a |= 64;
            ajVar8.f31582h = str6;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (C8120wg wgVar : wrVar.f28591f) {
            if (wgVar.f28543b.size() > 0) {
                linkedList.add((String) wgVar.f28543b.get(0));
            }
            if (wgVar.f28543b.size() > 1) {
                linkedList2.add((String) wgVar.f28543b.get(1));
            }
        }
        C9146ai aiVar9 = ((C9147aj) agVar.instance).f31580f;
        if (aiVar9 == null) {
            aiVar9 = C9146ai.f31566f;
        }
        C9145ah ahVar3 = (C9145ah) aiVar9.toBuilder();
        ahVar3.mo17448a(linkedList);
        agVar.copyOnWrite();
        C9147aj ajVar9 = (C9147aj) agVar.instance;
        C9146ai aiVar10 = (C9146ai) ahVar3.build();
        aiVar10.getClass();
        ajVar9.f31580f = aiVar10;
        ajVar9.f31575a |= 16;
        C9146ai aiVar11 = ((C9147aj) agVar.instance).f31581g;
        if (aiVar11 == null) {
            aiVar11 = C9146ai.f31566f;
        }
        C9145ah ahVar4 = (C9145ah) aiVar11.toBuilder();
        ahVar4.mo17448a(linkedList2);
        agVar.copyOnWrite();
        C9147aj ajVar10 = (C9147aj) agVar.instance;
        C9146ai aiVar12 = (C9146ai) ahVar4.build();
        aiVar12.getClass();
        ajVar10.f31581g = aiVar12;
        ajVar10.f31575a |= 32;
        if ((weVar.f28534a & 16) != 0) {
            String str7 = weVar.f28539f;
            agVar.copyOnWrite();
            C9147aj ajVar11 = (C9147aj) agVar.instance;
            str7.getClass();
            ajVar11.f31575a |= 128;
            ajVar11.f31583i = str7;
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C7718hj hjVar = this.f290132c;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar.f32174H = hjVar;
        vVar.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        C9141ad y = m174075y(wrVar);
        if (y != null) {
            qVar.copyOnWrite();
            C9278v vVar2 = (C9278v) qVar.instance;
            vVar2.f32169C = y;
            vVar2.f32192a |= 67108864;
        }
        C9277u uVar = C9277u.CRICKET_MATCH;
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        vVar3.f32196c = uVar.f32164ay;
        vVar3.f32192a |= 1;
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        C9147aj ajVar12 = (C9147aj) agVar.build();
        ajVar12.getClass();
        vVar4.f32208o = ajVar12;
        vVar4.f32192a |= 4096;
        return (C9278v) qVar.build();
    }
}
