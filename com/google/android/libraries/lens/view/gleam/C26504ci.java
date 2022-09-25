package com.google.android.libraries.lens.view.gleam;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.view.p2069am.C25293aa;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2069am.C25348x;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2069am.C25350z;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.android.libraries.lens.view.utils.C28120i;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.android.libraries.lens.view.vision.C28180v;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62191ad;
import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62203ap;
import com.google.lens.p4699e.C62227h;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4700f.C62249d;
import com.google.lens.p4707j.C62443bt;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62447bx;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62493dp;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56300d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56308f;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56312j;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56314l;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56316n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56326x;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.gleam.ci */
/* compiled from: PG */
public final class C26504ci {

    /* renamed from: A */
    private static final C58974d f72196A = C58974d.m91135i("GleamPosition");

    /* renamed from: B */
    private static final C58528ij f72197B = C58528ij.m90015O(C56323u.GLEAM, C56323u.TEXT_GLEAM, C56323u.DOCUMENT_GLEAM, C56323u.PLANAR_GLEAM, C56323u.BARCODE_GLEAM, C56323u.OUTDOOR_GLEAM, C56323u.REGION_GLEAM, C56323u.MATH_GLEAM);

    /* renamed from: C */
    private static final Comparator f72198C = C26502cg.f72194a;

    /* renamed from: a */
    public static final C58839bc f72199a = C26496ca.f72188a;

    /* renamed from: b */
    public static final C58839bc f72200b = C26497cb.f72189a;

    /* renamed from: c */
    public static final C58839bc f72201c = C26498cc.f72190a;

    /* renamed from: d */
    public static final C58839bc f72202d = C26499cd.f72191a;

    /* renamed from: e */
    public static final C58839bc f72203e = C26500ce.f72192a;

    /* renamed from: f */
    public static final C58839bc f72204f = C26501cf.f72193a;

    /* renamed from: D */
    private final Object f72205D = new Object();

    /* renamed from: E */
    private final long f72206E;

    /* renamed from: F */
    private C58833ax f72207F;

    /* renamed from: G */
    private C58833ax f72208G;

    /* renamed from: H */
    private final C21370a f72209H;

    /* renamed from: I */
    private final boolean f72210I;

    /* renamed from: J */
    private final C58833ax f72211J;

    /* renamed from: K */
    private final boolean f72212K;

    /* renamed from: g */
    public boolean f72213g;

    /* renamed from: h */
    public final C28179u f72214h;

    /* renamed from: i */
    public C28179u f72215i;

    /* renamed from: j */
    public C56327y f72216j;

    /* renamed from: k */
    public C25349y f72217k = null;

    /* renamed from: l */
    public Size f72218l;

    /* renamed from: m */
    public C25333i f72219m;

    /* renamed from: n */
    public boolean f72220n = false;

    /* renamed from: o */
    public boolean f72221o = false;

    /* renamed from: p */
    public boolean f72222p = false;

    /* renamed from: q */
    public boolean f72223q = false;

    /* renamed from: r */
    public boolean f72224r;

    /* renamed from: s */
    public C58485gu f72225s = C58485gu.m89845m();

    /* renamed from: t */
    public C58485gu f72226t = C58485gu.m89845m();

    /* renamed from: u */
    public C58833ax f72227u;

    /* renamed from: v */
    public final boolean f72228v;

    /* renamed from: w */
    public C56235ap f72229w;

    /* renamed from: x */
    public final C58833ax f72230x;

    /* renamed from: y */
    public final C58833ax f72231y;

    /* renamed from: z */
    public final C58833ax f72232z;

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02cd, code lost:
        if ((r14 / 2.0d) > com.google.common.p4535g.C59203do.f157270a) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0340, code lost:
        if (com.google.common.p4522b.C58557jl.m90138s((java.lang.Iterable) r9.mo56107c(), com.google.android.libraries.lens.view.gleam.C26494bz.f72184a) != false) goto L_0x0321;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02e1 A[LOOP:7: B:152:0x02db->B:154:0x02e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0407 A[SYNTHETIC, Splitter:B:186:0x0407] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0488 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0176 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x01a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26504ci(com.google.android.libraries.p1730f.C21370a r17, boolean r18, boolean r19, com.google.android.libraries.lens.view.p2113h.p2121d.C26752d r20, boolean r21, com.google.p4242bp.p4257f.p4260b.p4261a.C56327y r22, long r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r22
            r2 = r23
            r16.<init>()
            r4 = 0
            r1.f72217k = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r1.f72205D = r4
            r4 = 0
            r1.f72220n = r4
            r1.f72221o = r4
            r1.f72222p = r4
            r1.f72223q = r4
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            r1.f72225s = r5
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89845m()
            r1.f72226t = r5
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
            r1.f72227u = r5
            r1.f72207F = r5
            r1.f72208G = r5
            r5 = r18
            r1.f72228v = r5
            r5 = r19
            r1.f72210I = r5
            r5 = r21
            r1.f72212K = r5
            r1.f72216j = r0
            r5 = r17
            r1.f72209H = r5
            r6 = r20
            com.google.android.libraries.lens.view.h.d.c r6 = r6.f72881b
            android.util.Size r6 = r6.f72878a
            r1.f72218l = r6
            com.google.android.libraries.lens.view.am.i r6 = com.google.android.libraries.lens.view.p2069am.C25333i.f68945c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.lens.view.am.h r6 = (com.google.android.libraries.lens.view.p2069am.C25332h) r6
            android.util.Size r7 = r1.f72218l
            int r7 = r7.getWidth()
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.lens.view.am.i r8 = (com.google.android.libraries.lens.view.p2069am.C25333i) r8
            r8.f68947a = r7
            android.util.Size r7 = r1.f72218l
            int r7 = r7.getHeight()
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.lens.view.am.i r8 = (com.google.android.libraries.lens.view.p2069am.C25333i) r8
            r8.f68948b = r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.libraries.lens.view.am.i r6 = (com.google.android.libraries.lens.view.p2069am.C25333i) r6
            r1.f72219m = r6
            com.google.bp.f.b.a.ap r6 = com.google.android.libraries.lens.view.utils.C28120i.m52399c(r22)
            r1.f72229w = r6
            com.google.protobuf.cq r6 = r6.f149783b
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0098
            com.google.bp.f.b.a.ap r6 = r1.f72229w
            com.google.android.libraries.lens.view.am.i r7 = r1.f72219m
            com.google.common.b.gu r6 = com.google.android.libraries.lens.view.utils.C28120i.m52398b(r6, r7)
            r1.f72225s = r6
            com.google.android.libraries.lens.view.am.i r6 = r1.f72219m
            com.google.common.b.gu r6 = com.google.android.libraries.lens.view.utils.C28120i.m52400d(r0, r6)
            r1.f72226t = r6
        L_0x0098:
            boolean r6 = com.google.android.libraries.lens.view.gleam.C26551eb.m49038c(r22)
            if (r6 == 0) goto L_0x00d1
            com.google.protobuf.cq r6 = r0.f150143f
            java.util.Iterator r6 = r6.iterator()
        L_0x00a4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r6.next()
            com.google.bp.f.b.a.r r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r7
            com.google.bp.f.b.a.h r8 = r7.f150100g
            if (r8 != 0) goto L_0x00b6
            com.google.bp.f.b.a.h r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x00b6:
            int r8 = r8.f150075b
            r9 = 5
            if (r8 != r9) goto L_0x00a4
            com.google.bp.f.b.a.h r6 = r7.f150100g
            if (r6 != 0) goto L_0x00c1
            com.google.bp.f.b.a.h r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x00c1:
            int r7 = r6.f150075b
            if (r7 != r9) goto L_0x00ca
            java.lang.Object r6 = r6.f150076c
            com.google.lens.e.l r6 = (com.google.lens.p4699e.C62231l) r6
            goto L_0x00cc
        L_0x00ca:
            com.google.lens.e.l r6 = com.google.lens.p4699e.C62231l.f168023e
        L_0x00cc:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x00d3
        L_0x00d1:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
        L_0x00d3:
            r1.f72211J = r6
            boolean r6 = com.google.android.libraries.lens.view.gleam.C26551eb.m49037b(r22)
            if (r6 == 0) goto L_0x010f
            com.google.protobuf.cq r6 = r0.f150143f
            java.util.Iterator r6 = r6.iterator()
        L_0x00e1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x010f
            java.lang.Object r7 = r6.next()
            com.google.bp.f.b.a.r r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r7
            com.google.bp.f.b.a.h r8 = r7.f150100g
            if (r8 != 0) goto L_0x00f3
            com.google.bp.f.b.a.h r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x00f3:
            int r8 = r8.f150075b
            r9 = 8
            if (r8 != r9) goto L_0x00e1
            com.google.bp.f.b.a.h r6 = r7.f150100g
            if (r6 != 0) goto L_0x00ff
            com.google.bp.f.b.a.h r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x00ff:
            int r7 = r6.f150075b
            if (r7 != r9) goto L_0x0108
            java.lang.Object r6 = r6.f150076c
            com.google.lens.e.h r6 = (com.google.lens.p4699e.C62227h) r6
            goto L_0x010a
        L_0x0108:
            com.google.lens.e.h r6 = com.google.lens.p4699e.C62227h.f168014f
        L_0x010a:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x0111
        L_0x010f:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
        L_0x0111:
            r1.f72230x = r6
            boolean r6 = com.google.android.libraries.lens.view.gleam.C26551eb.m49043h(r22)
            if (r6 == 0) goto L_0x014d
            com.google.protobuf.cq r6 = r0.f150143f
            java.util.Iterator r6 = r6.iterator()
        L_0x011f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x014d
            java.lang.Object r7 = r6.next()
            com.google.bp.f.b.a.r r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r7
            com.google.bp.f.b.a.h r8 = r7.f150100g
            if (r8 != 0) goto L_0x0131
            com.google.bp.f.b.a.h r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x0131:
            int r8 = r8.f150075b
            r9 = 9
            if (r8 != r9) goto L_0x011f
            com.google.bp.f.b.a.h r6 = r7.f150100g
            if (r6 != 0) goto L_0x013d
            com.google.bp.f.b.a.h r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x013d:
            int r7 = r6.f150075b
            if (r7 != r9) goto L_0x0146
            java.lang.Object r6 = r6.f150076c
            com.google.lens.e.ad r6 = (com.google.lens.p4699e.C62191ad) r6
            goto L_0x0148
        L_0x0146:
            com.google.lens.e.ad r6 = com.google.lens.p4699e.C62191ad.f167916k
        L_0x0148:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x014f
        L_0x014d:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
        L_0x014f:
            r1.f72231y = r6
            com.google.protobuf.cq r6 = r0.f150143f
            java.util.Iterator r6 = r6.iterator()
        L_0x0157:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0176
            java.lang.Object r7 = r6.next()
            com.google.bp.f.b.a.r r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r7
            int r8 = r7.f150094a
            r8 = r8 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0157
            com.google.bp.f.b.a.l r6 = r7.f150105l
            if (r6 != 0) goto L_0x016f
            com.google.bp.f.b.a.l r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56314l.f150081b
        L_0x016f:
            com.google.protobuf.cq r6 = r6.f150083a
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x0178
        L_0x0176:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
        L_0x0178:
            r1.f72207F = r6
            com.google.protobuf.cq r6 = r0.f150143f
            java.util.Iterator r6 = r6.iterator()
        L_0x0180:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01a9
            java.lang.Object r7 = r6.next()
            com.google.bp.f.b.a.r r7 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r7
            com.google.bp.f.b.a.h r8 = r7.f150100g
            if (r8 != 0) goto L_0x0192
            com.google.bp.f.b.a.h r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x0192:
            int r8 = r8.f150074a
            r8 = r8 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0180
            com.google.bp.f.b.a.h r6 = r7.f150100g
            if (r6 != 0) goto L_0x019e
            com.google.bp.f.b.a.h r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x019e:
            com.google.lens.f.d r6 = r6.f150079f
            if (r6 != 0) goto L_0x01a4
            com.google.lens.f.d r6 = com.google.lens.p4700f.C62249d.f168055c
        L_0x01a4:
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x01ab
        L_0x01a9:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
        L_0x01ab:
            r1.f72208G = r6
            boolean r6 = com.google.android.libraries.lens.view.gleam.C26551eb.m49042g(r22)
            if (r6 == 0) goto L_0x01e7
            com.google.protobuf.cq r0 = r0.f150143f
            java.util.Iterator r0 = r0.iterator()
        L_0x01b9:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01e7
            java.lang.Object r6 = r0.next()
            com.google.bp.f.b.a.r r6 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56320r) r6
            com.google.bp.f.b.a.h r7 = r6.f150100g
            if (r7 != 0) goto L_0x01cb
            com.google.bp.f.b.a.h r7 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x01cb:
            int r7 = r7.f150075b
            r8 = 15
            if (r7 != r8) goto L_0x01b9
            com.google.bp.f.b.a.h r0 = r6.f150100g
            if (r0 != 0) goto L_0x01d7
            com.google.bp.f.b.a.h r0 = com.google.p4242bp.p4257f.p4260b.p4261a.C56310h.f150072g
        L_0x01d7:
            int r6 = r0.f150075b
            if (r6 != r8) goto L_0x01e0
            java.lang.Object r0 = r0.f150076c
            com.google.lens.e.z r0 = (com.google.lens.p4699e.C62245z) r0
            goto L_0x01e2
        L_0x01e0:
            com.google.lens.e.z r0 = com.google.lens.p4699e.C62245z.f168048c
        L_0x01e2:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x01e9
        L_0x01e7:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x01e9:
            r1.f72232z = r0
            r6 = 0
            r0 = 7
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x044e
            boolean r6 = r1.f72212K
            if (r6 == 0) goto L_0x044c
            com.google.bp.f.b.a.y r6 = r1.f72216j
            int r7 = r6.f150139b
            if (r7 != r0) goto L_0x0201
            java.lang.Object r6 = r6.f150140c
            com.google.lens.j.bv r6 = (com.google.lens.p4707j.C62445bv) r6
            goto L_0x0203
        L_0x0201:
            com.google.lens.j.bv r6 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x0203:
            int r6 = r6.f168620a
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto L_0x044c
            com.google.bp.f.b.a.y r6 = r1.f72216j
            int r9 = r6.f150139b
            if (r9 != r0) goto L_0x0214
            java.lang.Object r9 = r6.f150140c
            com.google.lens.j.bv r9 = (com.google.lens.p4707j.C62445bv) r9
            goto L_0x0216
        L_0x0214:
            com.google.lens.j.bv r9 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x0216:
            int r9 = r9.f168620a
            r9 = r9 & 4
            if (r9 == 0) goto L_0x044c
            boolean r6 = com.google.android.libraries.lens.view.gleam.C26551eb.m49037b(r6)
            if (r6 == 0) goto L_0x023a
            com.google.common.base.ax r6 = r1.f72230x
            com.google.android.libraries.lens.view.gleam.ch r9 = com.google.android.libraries.lens.view.gleam.C26503ch.f72195a
            com.google.common.base.ax r6 = r6.mo56106b(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r6 = r6.mo56109e(r9)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0242
        L_0x023a:
            com.google.bp.f.b.a.y r6 = r1.f72216j
            boolean r6 = com.google.android.libraries.lens.view.gleam.C26551eb.m49043h(r6)
            if (r6 == 0) goto L_0x044c
        L_0x0242:
            com.google.android.libraries.lens.view.am.y r6 = r16.mo31760d()
            com.google.bp.f.b.a.y r9 = r1.f72216j
            int r10 = r9.f150139b
            if (r10 != r0) goto L_0x0251
            java.lang.Object r0 = r9.f150140c
            com.google.lens.j.bv r0 = (com.google.lens.p4707j.C62445bv) r0
            goto L_0x0253
        L_0x0251:
            com.google.lens.j.bv r0 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x0253:
            com.google.lens.j.dn r9 = r0.f168622c
            if (r9 != 0) goto L_0x0259
            com.google.lens.j.dn r9 = com.google.lens.p4707j.C62491dn.f168710e
        L_0x0259:
            com.google.protobuf.cq r10 = r9.f168713b
            int r11 = r9.f168714c
            com.google.lens.j.dm r11 = com.google.lens.p4707j.C62490dm.m94786a(r11)
            if (r11 != 0) goto L_0x0265
            com.google.lens.j.dm r11 = com.google.lens.p4707j.C62490dm.VERTEX_ORDERING_UNSPECIFIED
        L_0x0265:
            com.google.lens.j.dm r12 = com.google.lens.p4707j.C62490dm.CLOCKWISE
            if (r11 == r12) goto L_0x02cf
            int r11 = r9.f168714c
            com.google.lens.j.dm r11 = com.google.lens.p4707j.C62490dm.m94786a(r11)
            if (r11 != 0) goto L_0x0273
            com.google.lens.j.dm r11 = com.google.lens.p4707j.C62490dm.VERTEX_ORDERING_UNSPECIFIED
        L_0x0273:
            com.google.lens.j.dm r12 = com.google.lens.p4707j.C62490dm.VERTEX_ORDERING_UNSPECIFIED
            if (r11 != r12) goto L_0x02d3
            r13 = 0
            r14 = 0
        L_0x027a:
            com.google.protobuf.cq r8 = r9.f168713b
            int r8 = r8.size()
            if (r13 >= r8) goto L_0x02c6
            int r8 = r13 + 1
            com.google.protobuf.cq r4 = r9.f168713b
            int r4 = r4.size()
            int r4 = r8 % r4
            com.google.protobuf.cq r7 = r9.f168713b
            java.lang.Object r7 = r7.get(r13)
            com.google.lens.j.dk r7 = (com.google.lens.p4707j.C62488dk) r7
            float r7 = r7.f168702b
            com.google.protobuf.cq r11 = r9.f168713b
            java.lang.Object r11 = r11.get(r4)
            com.google.lens.j.dk r11 = (com.google.lens.p4707j.C62488dk) r11
            float r11 = r11.f168703c
            float r7 = r7 * r11
            double r11 = (double) r7
            java.lang.Double.isNaN(r11)
            double r14 = r14 + r11
            com.google.protobuf.cq r7 = r9.f168713b
            java.lang.Object r4 = r7.get(r4)
            com.google.lens.j.dk r4 = (com.google.lens.p4707j.C62488dk) r4
            float r4 = r4.f168702b
            com.google.protobuf.cq r7 = r9.f168713b
            java.lang.Object r7 = r7.get(r13)
            com.google.lens.j.dk r7 = (com.google.lens.p4707j.C62488dk) r7
            float r7 = r7.f168703c
            float r4 = r4 * r7
            double r11 = (double) r4
            java.lang.Double.isNaN(r11)
            double r14 = r14 - r11
            r13 = r8
            r4 = 0
            r7 = 2
            goto L_0x027a
        L_0x02c6:
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 / r7
            r7 = 0
            int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x02d3
        L_0x02cf:
            java.util.List r10 = com.google.common.p4522b.C58597ky.m90216g(r10)
        L_0x02d3:
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r7 = r10.iterator()
        L_0x02db:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0300
            java.lang.Object r8 = r7.next()
            com.google.lens.j.dk r8 = (com.google.lens.p4707j.C62488dk) r8
            r9 = 2
            java.lang.Float[] r10 = new java.lang.Float[r9]
            float r11 = r8.f168702b
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r12 = 0
            r10[r12] = r11
            float r8 = r8.f168703c
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r11 = 1
            r10[r11] = r8
            r4.mo55371a(r10, r9)
            goto L_0x02db
        L_0x0300:
            r11 = 1
            r12 = 0
            com.google.common.b.gu r4 = r4.mo55394f()
            com.google.lens.j.dn r7 = com.google.android.libraries.lens.common.p1998a.C24095c.m44766k(r4)
            android.graphics.PointF r7 = com.google.android.libraries.lens.common.p1998a.C24101i.m44774a(r7)
            com.google.common.base.ax r8 = r1.f72231y
            boolean r9 = r8.mo56113h()
            if (r9 == 0) goto L_0x0323
            java.lang.Object r8 = r8.mo56107c()
            com.google.lens.e.ad r8 = (com.google.lens.p4699e.C62191ad) r8
            boolean r8 = r8.f167927j
            if (r8 != 0) goto L_0x0321
            goto L_0x0323
        L_0x0321:
            r12 = 1
            goto L_0x0343
        L_0x0323:
            com.google.common.base.ax r8 = r1.f72231y
            com.google.common.base.ax r9 = r1.f72207F
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x0343
            boolean r8 = r9.mo56113h()
            if (r8 != 0) goto L_0x0334
            goto L_0x0343
        L_0x0334:
            java.lang.Object r8 = r9.mo56107c()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.google.android.libraries.lens.view.gleam.bz r9 = com.google.android.libraries.lens.view.gleam.C26494bz.f72184a
            boolean r8 = com.google.common.p4522b.C58557jl.m90138s(r8, r9)
            if (r8 == 0) goto L_0x0343
            goto L_0x0321
        L_0x0343:
            com.google.android.libraries.lens.view.vision.t r8 = com.google.android.libraries.lens.view.vision.C28179u.m52643D()
            com.google.common.base.ax r9 = r1.f72231y
            boolean r9 = m48939h(r9)
            r8.mo33645i(r9)
            float r9 = r7.x
            android.util.Size r10 = r1.f72218l
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r9 = r9 * r10
            r8.mo33652p(r9)
            float r7 = r7.y
            android.util.Size r9 = r1.f72218l
            int r9 = r9.getHeight()
            float r9 = (float) r9
            float r7 = r7 * r9
            r8.mo33653q(r7)
            r7 = 0
            r8.mo33647k(r7)
            r8.mo33648l(r7)
            r8.mo33646j(r7)
            r8.mo33644h(r4)
            r8.mo33650n(r2)
            int r2 = r0.f168620a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x038d
            float r0 = r0.f168623d
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x038f
        L_0x038d:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x038f:
            r2 = r8
            com.google.android.libraries.lens.view.vision.f r2 = (com.google.android.libraries.lens.view.vision.C28164f) r2
            r2.f76634b = r0
            com.google.common.base.ax r0 = r1.f72231y
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x03bb
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.e.ad r0 = (com.google.lens.p4699e.C62191ad) r0
            int r0 = r0.f167918a
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03bb
            com.google.common.base.ax r0 = r1.f72231y
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.e.ad r0 = (com.google.lens.p4699e.C62191ad) r0
            float r0 = r0.f167926i
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x03bd
        L_0x03bb:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x03bd:
            r2.f76635c = r0
            r8.mo33641e(r6)
            boolean r0 = r16.m48940n()
            r8.mo33642f(r0)
            com.google.common.base.ax r0 = r1.f72231y
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x03ec
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.e.ad r0 = (com.google.lens.p4699e.C62191ad) r0
            int r0 = r0.f167918a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x03ec
            com.google.common.base.ax r0 = r1.f72231y
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.e.ad r0 = (com.google.lens.p4699e.C62191ad) r0
            java.lang.String r0 = r0.f167924g
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x03ee
        L_0x03ec:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x03ee:
            r2.f76637e = r0
            r8.mo33638b(r12)
            com.google.common.base.ax r0 = r1.f72231y
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0442
            java.lang.Object r0 = r0.mo56107c()
            com.google.lens.e.ad r0 = (com.google.lens.p4699e.C62191ad) r0
            int r0 = r0.f167918a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0442
            com.google.common.base.ax r0 = r1.f72231y     // Catch:{ IOException -> 0x042e }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ IOException -> 0x042e }
            com.google.lens.e.ad r0 = (com.google.lens.p4699e.C62191ad) r0     // Catch:{ IOException -> 0x042e }
            com.google.protos.e.b r0 = r0.f167925h     // Catch:{ IOException -> 0x042e }
            if (r0 != 0) goto L_0x0415
            com.google.protos.e.b r0 = com.google.protos.p4984e.C64643b.f175228a     // Catch:{ IOException -> 0x042e }
        L_0x0415:
            int r2 = r0.getSerializedSize()     // Catch:{ IOException -> 0x042e }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)     // Catch:{ IOException -> 0x042e }
            com.google.protobuf.an r3 = com.google.protobuf.C62906an.m95323P(r2)     // Catch:{ IOException -> 0x042e }
            r0.writeTo((com.google.protobuf.C62906an) r3)     // Catch:{ IOException -> 0x042e }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ IOException -> 0x042e }
            r2 = r8
            com.google.android.libraries.lens.view.vision.f r2 = (com.google.android.libraries.lens.view.vision.C28164f) r2     // Catch:{ IOException -> 0x042e }
            r2.f76638f = r0     // Catch:{ IOException -> 0x042e }
            goto L_0x0446
        L_0x042e:
            r0 = move-exception
            com.google.common.f.a.d r2 = f72196A
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r0 = r0.getMessage()
            r3 = 49430(0xc116, float:6.9266E-41)
            java.lang.String r4 = "Ignored setting features database due to the exception: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r3)).mo56389s(r4, r0)
            goto L_0x0446
        L_0x0442:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r2.f76638f = r0
        L_0x0446:
            com.google.android.libraries.lens.view.vision.u r0 = r8.mo33696r()
            goto L_0x04cd
        L_0x044c:
            r11 = 1
            goto L_0x0450
        L_0x044e:
            r11 = 1
            r2 = r6
        L_0x0450:
            com.google.android.libraries.lens.view.am.y r4 = r16.mo31760d()
            com.google.bp.f.b.a.y r6 = r1.f72216j
            int r7 = r6.f150139b
            if (r7 != r0) goto L_0x045f
            java.lang.Object r0 = r6.f150140c
            com.google.lens.j.bv r0 = (com.google.lens.p4707j.C62445bv) r0
            goto L_0x0461
        L_0x045f:
            com.google.lens.j.bv r0 = com.google.lens.p4707j.C62445bv.f168618e
        L_0x0461:
            com.google.lens.j.br r0 = r0.f168621b
            if (r0 != 0) goto L_0x0467
            com.google.lens.j.br r0 = com.google.lens.p4707j.C62441br.f168608h
        L_0x0467:
            com.google.android.libraries.lens.view.vision.t r6 = com.google.android.libraries.lens.view.vision.C28179u.m52643D()
            android.util.Size r7 = r1.f72218l
            int r8 = r0.f168616g
            int r8 = com.google.lens.p4707j.C62580n.m94802a(r8)
            r9 = 3
            if (r8 != 0) goto L_0x0477
            goto L_0x047b
        L_0x0477:
            if (r8 != r9) goto L_0x047b
            r8 = 1
            goto L_0x047f
        L_0x047b:
            int r8 = r7.getWidth()
        L_0x047f:
            int r10 = r0.f168616g
            int r10 = com.google.lens.p4707j.C62580n.m94802a(r10)
            if (r10 != 0) goto L_0x0488
            goto L_0x048c
        L_0x0488:
            if (r10 != r9) goto L_0x048c
            r7 = 1
            goto L_0x0490
        L_0x048c:
            int r7 = r7.getHeight()
        L_0x0490:
            float r8 = (float) r8
            float r9 = r0.f168611b
            float r9 = r9 * r8
            r6.mo33652p(r9)
            float r7 = (float) r7
            float r9 = r0.f168612c
            float r9 = r9 * r7
            r6.mo33653q(r9)
            float r9 = r0.f168613d
            float r9 = r9 * r8
            r6.mo33647k(r9)
            float r8 = r0.f168614e
            float r8 = r8 * r7
            r6.mo33648l(r8)
            float r0 = r0.f168615f
            r6.mo33646j(r0)
            com.google.common.base.ax r0 = r1.f72231y
            boolean r0 = m48939h(r0)
            r6.mo33645i(r0)
            r6.mo33650n(r2)
            r6.mo33641e(r4)
            boolean r0 = r16.m48940n()
            r6.mo33642f(r0)
            com.google.android.libraries.lens.view.vision.u r0 = r6.mo33696r()
        L_0x04cd:
            r1.f72214h = r0
            r1.f72215i = r0
            long r2 = r17.mo26871c()
            r1.f72206E = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.C26504ci.<init>(com.google.android.libraries.f.a, boolean, boolean, com.google.android.libraries.lens.view.h.d.d, boolean, com.google.bp.f.b.a.y, long):void");
    }

    /* renamed from: h */
    public static boolean m48939h(C58833ax axVar) {
        return axVar.mo56113h() && ((C62191ad) axVar.mo56107c()).f167919b == 2;
    }

    /* renamed from: n */
    private final boolean m48940n() {
        return this.f72212K && mo31766k();
    }

    /* renamed from: a */
    public final float mo31757a() {
        if (this.f72216j.f150143f.isEmpty()) {
            return 0.0f;
        }
        return ((C56320r) Collections.min(this.f72216j.f150143f, f72198C)).f150099f;
    }

    /* renamed from: b */
    public final long mo31758b() {
        return this.f72209H.mo26871c() - this.f72206E;
    }

    /* renamed from: c */
    public final RectF mo31759c() {
        C28179u uVar = this.f72215i;
        return C28185a.m52687e(C24093a.m44751g(new PointF(uVar.mo33662f(), uVar.mo33663g()), new SizeF(uVar.mo33659d(), uVar.mo33660e()), uVar.mo33658c(), 2, 0.0f), 1.0f / ((float) this.f72218l.getWidth()), 1.0f / ((float) this.f72218l.getHeight()));
    }

    /* renamed from: d */
    public final C25349y mo31760d() {
        if (this.f72217k == null) {
            synchronized (this.f72205D) {
                C56327y yVar = this.f72216j;
                yVar.getClass();
                this.f72217k = C26551eb.m49036a(yVar);
            }
        }
        return this.f72217k;
    }

    /* renamed from: e */
    public final C25308ap mo31761e() {
        C28179u uVar = this.f72215i;
        C25348x xVar = (C25348x) C25308ap.f68839y.createBuilder();
        int h = this.f72214h.mo33664h();
        xVar.copyOnWrite();
        ((C25308ap) xVar.instance).f68845f = h;
        boolean isEmpty = this.f72216j.f150143f.isEmpty();
        String str = BuildConfig.FLAVOR;
        if (!isEmpty) {
            C56320r rVar = (C56320r) Collections.min(this.f72216j.f150143f, f72198C);
            String str2 = rVar.f150098e;
            C56314l lVar = rVar.f150105l;
            if (lVar == null) {
                lVar = C56314l.f150081b;
            }
            Iterator it = lVar.f150083a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C62195ah ahVar = (C62195ah) it.next();
                if (ahVar.f167933a == 3) {
                    str2 = ((C62203ap) ahVar.f167934b).f167952b;
                    break;
                }
            }
            if (this.f72210I) {
                for (C56320r rVar2 : this.f72216j.f150143f) {
                    str = str.concat("|");
                    C56308f fVar = rVar2.f150104k;
                    if (fVar == null) {
                        fVar = C56308f.f150069b;
                    }
                    for (String str3 : fVar.f150071a) {
                        str = str + ":" + str3;
                    }
                }
                str = String.valueOf(str2).concat(str);
            } else {
                str = str2;
            }
        }
        xVar.copyOnWrite();
        str.getClass();
        ((C25308ap) xVar.instance).f68849j = str;
        float a = mo31757a();
        xVar.copyOnWrite();
        ((C25308ap) xVar.instance).f68850k = a;
        C25349y d = mo31760d();
        xVar.copyOnWrite();
        ((C25308ap) xVar.instance).f68848i = d.getNumber();
        boolean z = this.f72220n;
        xVar.copyOnWrite();
        ((C25308ap) xVar.instance).f68851l = z;
        boolean j = mo31765j();
        xVar.copyOnWrite();
        ((C25308ap) xVar.instance).f68852m = j;
        boolean z2 = this.f72224r;
        xVar.copyOnWrite();
        ((C25308ap) xVar.instance).f68853n = z2;
        C62445bv b = C28180v.m52674b(uVar, this.f72218l);
        xVar.copyOnWrite();
        b.getClass();
        ((C25308ap) xVar.instance).f68847h = b;
        C56327y yVar = this.f72216j;
        if ((yVar.f150138a & 16) != 0) {
            C62488dk dkVar = yVar.f150142e;
            if (dkVar == null) {
                dkVar = C62488dk.f168699d;
            }
            xVar.copyOnWrite();
            dkVar.getClass();
            ((C25308ap) xVar.instance).f68846g = dkVar;
        }
        C58833ax axVar = this.f72211J;
        if (axVar.mo56113h()) {
            C62231l lVar2 = (C62231l) axVar.mo56107c();
            xVar.copyOnWrite();
            C25308ap apVar = (C25308ap) xVar.instance;
            lVar2.getClass();
            apVar.f68844e = lVar2;
            apVar.f68843d = 13;
        }
        C58833ax axVar2 = this.f72230x;
        if (axVar2.mo56113h()) {
            C62227h hVar = (C62227h) axVar2.mo56107c();
            xVar.copyOnWrite();
            C25308ap apVar2 = (C25308ap) xVar.instance;
            hVar.getClass();
            apVar2.f68844e = hVar;
            apVar2.f68843d = 19;
        }
        C58833ax axVar3 = this.f72231y;
        if (axVar3.mo56113h()) {
            C62191ad adVar = (C62191ad) axVar3.mo56107c();
            xVar.copyOnWrite();
            C25308ap apVar3 = (C25308ap) xVar.instance;
            adVar.getClass();
            apVar3.f68844e = adVar;
            apVar3.f68843d = 21;
        }
        if (this.f72207F.mo56113h()) {
            Iterable iterable = (Iterable) this.f72207F.mo56107c();
            xVar.copyOnWrite();
            C25308ap apVar4 = (C25308ap) xVar.instance;
            C62971cq cqVar = apVar4.f68862w;
            if (!cqVar.mo58948c()) {
                apVar4.f68862w = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) apVar4.f68862w);
        }
        C58833ax a2 = C28120i.m52397a(this.f72216j);
        if (a2.mo56113h()) {
            C25350z zVar = (C25350z) C25293aa.f68800c.createBuilder();
            String str4 = (String) a2.mo56107c();
            zVar.copyOnWrite();
            str4.getClass();
            ((C25293aa) zVar.instance).f68802a = str4;
            long i = this.f72214h.mo33666i();
            zVar.copyOnWrite();
            ((C25293aa) zVar.instance).f68803b = i;
            C25293aa aaVar = (C25293aa) zVar.build();
            xVar.copyOnWrite();
            aaVar.getClass();
            ((C25308ap) xVar.instance).f68855p = aaVar;
        }
        if (this.f72208G.mo56113h()) {
            C62249d dVar = (C62249d) this.f72208G.mo56107c();
            xVar.copyOnWrite();
            dVar.getClass();
            ((C25308ap) xVar.instance).f68856q = dVar;
        }
        boolean z3 = true;
        if (uVar.mo33674q().mo56113h() && uVar.mo33669l().mo56113h() && uVar.mo33670m().mo56113h()) {
            C62493dp dpVar = (C62493dp) uVar.mo33674q().mo56107c();
            xVar.copyOnWrite();
            C25308ap apVar5 = (C25308ap) xVar.instance;
            dpVar.getClass();
            apVar5.f68859t = dpVar;
            apVar5.f68840a |= 1;
            float a3 = uVar.mo33656a();
            xVar.copyOnWrite();
            ((C25308ap) xVar.instance).f68857r = a3;
            float b2 = uVar.mo33657b();
            xVar.copyOnWrite();
            ((C25308ap) xVar.instance).f68858s = b2;
            C62447bx bxVar = (C62447bx) uVar.mo33669l().mo56107c();
            xVar.copyOnWrite();
            C25308ap apVar6 = (C25308ap) xVar.instance;
            bxVar.getClass();
            apVar6.f68860u = bxVar;
            apVar6.f68840a |= 2;
            C62447bx bxVar2 = (C62447bx) uVar.mo33670m().mo56107c();
            xVar.copyOnWrite();
            C25308ap apVar7 = (C25308ap) xVar.instance;
            bxVar2.getClass();
            apVar7.f68861v = bxVar2;
            apVar7.f68840a |= 4;
        }
        C56327y yVar2 = this.f72216j;
        if ((yVar2.f150138a & 256) != 0) {
            int a4 = C62443bt.m94776a(yVar2.f150145h);
            if (a4 == 0 || a4 != 4) {
                z3 = false;
            }
            xVar.copyOnWrite();
            C25308ap apVar8 = (C25308ap) xVar.instance;
            apVar8.f68840a |= 8;
            apVar8.f68863x = z3;
        }
        return (C25308ap) xVar.build();
    }

    /* renamed from: f */
    public final void mo31762f(C28179u uVar) {
        C58838bb.m90868c(uVar.mo33664h() == this.f72214h.mo33664h());
        this.f72215i = uVar;
    }

    /* renamed from: g */
    public final boolean mo31763g() {
        return mo31760d() == C25349y.BARCODE_GLEAM || this.f72230x.mo56113h();
    }

    /* renamed from: i */
    public final boolean mo31764i() {
        return C25349y.MATH_GLEAM.equals(mo31760d());
    }

    /* renamed from: j */
    public final boolean mo31765j() {
        for (C56320r rVar : this.f72216j.f150143f) {
            int a = C56312j.m87967a(rVar.f150095b);
            if (a != 0 && a == 6) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo31766k() {
        return C25349y.TEXT_GLEAM.equals(mo31760d());
    }

    /* renamed from: l */
    public final boolean mo31767l() {
        C58528ij ijVar = f72197B;
        C56324v vVar = this.f72216j.f150144g;
        if (vVar == null) {
            vVar = C56324v.f150122c;
        }
        C56323u a = C56323u.m87968a(vVar.f150125b);
        if (a == null) {
            a = C56323u.GLEAM;
        }
        return ijVar.contains(a) && !this.f72220n && !this.f72221o;
    }

    /* renamed from: m */
    public final List mo31768m() {
        ArrayList arrayList = new ArrayList(this.f72216j.f150143f.size());
        for (C56320r rVar : this.f72216j.f150143f) {
            C56300d dVar = (C56300d) C56320r.f150092n.createBuilder();
            int a = C56312j.m87967a(rVar.f150095b);
            if (a == 0) {
                a = 1;
            }
            dVar.copyOnWrite();
            C56320r rVar2 = (C56320r) dVar.instance;
            rVar2.f150095b = a - 1;
            rVar2.f150094a |= 1;
            String str = rVar.f150096c;
            dVar.copyOnWrite();
            C56320r rVar3 = (C56320r) dVar.instance;
            str.getClass();
            rVar3.f150094a |= 2;
            rVar3.f150096c = str;
            float f = rVar.f150099f;
            dVar.copyOnWrite();
            C56320r rVar4 = (C56320r) dVar.instance;
            rVar4.f150094a |= 16;
            rVar4.f150099f = f;
            String str2 = rVar.f150097d;
            dVar.copyOnWrite();
            C56320r rVar5 = (C56320r) dVar.instance;
            str2.getClass();
            rVar5.f150094a |= 4;
            rVar5.f150097d = str2;
            C56318p pVar = rVar.f150101h;
            if (pVar == null) {
                pVar = C56318p.f150087c;
            }
            dVar.copyOnWrite();
            C56320r rVar6 = (C56320r) dVar.instance;
            pVar.getClass();
            rVar6.f150101h = pVar;
            rVar6.f150094a |= 128;
            C56326x a2 = C56326x.m87970a(rVar.f150103j);
            if (a2 == null) {
                a2 = C56326x.UNKNOWN;
            }
            dVar.copyOnWrite();
            C56320r rVar7 = (C56320r) dVar.instance;
            rVar7.f150103j = a2.f150135h;
            rVar7.f150094a |= 256;
            C56316n nVar = rVar.f150106m;
            if (nVar == null) {
                nVar = C56316n.f150085a;
            }
            dVar.copyOnWrite();
            C56320r rVar8 = (C56320r) dVar.instance;
            nVar.getClass();
            rVar8.f150106m = nVar;
            rVar8.f150094a |= 4096;
            arrayList.add((C56320r) dVar.build());
        }
        Collections.sort(arrayList, f72198C);
        return arrayList;
    }
}
