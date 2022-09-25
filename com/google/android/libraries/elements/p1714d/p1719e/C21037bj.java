package com.google.android.libraries.elements.p1714d.p1719e;

import android.util.Pair;
import com.facebook.litho.C6405o;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21271bn;
import com.google.android.libraries.elements.interfaces.C21283bz;
import com.google.android.libraries.elements.p1714d.C20834br;
import com.google.android.libraries.elements.p1714d.p1719e.p1723b.C21022a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68072bh;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.e.bj */
/* compiled from: PG */
public final class C21037bj implements C21271bn {

    /* renamed from: a */
    private final C21259bb f58948a;

    /* renamed from: b */
    private final Map f58949b;

    /* renamed from: c */
    private final Map f58950c;

    /* renamed from: d */
    private final boolean f58951d;

    public C21037bj(Map map, Map map2, C58833ax axVar, C21259bb bbVar) {
        this.f58948a = bbVar;
        this.f58951d = ((Boolean) axVar.mo56109e(false)).booleanValue();
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            C21022a aVar = (C21022a) entry.getValue();
            gzVar.mo55429h(189078944, (C21022a) entry.getValue());
        }
        C58490gz gzVar2 = new C58490gz(4);
        for (Map.Entry entry2 : map2.entrySet()) {
            gzVar2.mo55429h(Integer.valueOf(((C21283bz) ((Pair) entry2.getValue()).first).mo25834a().mo58810a()), (Pair) entry2.getValue());
        }
        this.f58949b = gzVar.mo55427f(true);
        this.f58950c = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public final int mo26066a() {
        return 168774549;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0203  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo25838b(com.facebook.litho.C6411u r22, com.google.android.libraries.elements.interfaces.C21319z r23, java.lang.String r24, java.lang.Object r25, com.google.android.libraries.elements.interfaces.C21248ar r26, com.google.android.libraries.elements.interfaces.C21310q r27) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r0 = r26
            r4 = r25
            com.youtube.a.a.bh r4 = (com.youtube.p5283a.p5284a.C68072bh) r4
            com.google.android.libraries.elements.a.a.p r5 = new com.google.android.libraries.elements.a.a.p
            r5.<init>(r4)
            com.facebook.litho.o r6 = r26.mo25928E()
            android.content.Context r7 = r2.f19009b
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            com.youtube.a.a.bh r8 = r5.f57977a
            long r8 = r8.mo60174m()
            int r9 = (int) r8
            com.youtube.a.a.bh r8 = r5.f57977a
            float r8 = r8.mo60169h()
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r13 <= 0) goto L_0x0043
            com.youtube.a.a.bh r13 = r5.f57977a
            float r13 = r13.mo60168g()
            float r14 = r8 / r10
            float r13 = r13 - r14
            float r13 = java.lang.Math.max(r11, r13)
            goto L_0x0049
        L_0x0043:
            com.youtube.a.a.bh r13 = r5.f57977a
            float r13 = r13.mo60168g()
        L_0x0049:
            com.google.android.libraries.elements.interfaces.RectCornersProxy r14 = r5.f57978b
            android.content.Context r15 = r2.f19009b
            boolean r15 = com.google.android.libraries.elements.internal.C21327ag.m40334a(r15)
            com.google.android.libraries.elements.interfaces.by r10 = new com.google.android.libraries.elements.interfaces.by
            r10.<init>()
            if (r9 != 0) goto L_0x0065
            int r9 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0064
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r3 = 0
            goto L_0x015b
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.facebook.litho.d r12 = new com.facebook.litho.d
            r12.<init>(r2)
            r11 = 9
            if (r9 == 0) goto L_0x007a
            r12.mo13153c(r11, r9)
            r10.f59599b = r9
            com.facebook.litho.d r3 = r10.f59600c
            if (r3 == 0) goto L_0x007a
            r3.mo13153c(r11, r9)
        L_0x007a:
            r3 = 0
            int r9 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x00ae
            r12.mo13151a()
            com.facebook.litho.fk r3 = r12.f18232b
            int r3 = r3.mo13257a(r8)
            r12.mo13151a()
            com.facebook.litho.e r9 = r12.f18231a
            if (r3 < 0) goto L_0x0095
            int[] r9 = r9.f18353b
            com.facebook.litho.C6207e.m16463c(r9, r11, r3)
            goto L_0x00ae
        L_0x0095:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Given negative border width value: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = " for edge ALL"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00ae:
            r3 = 0
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0158
            if (r14 != 0) goto L_0x00d1
            r12.mo13151a()
            com.facebook.litho.fk r3 = r12.f18232b
            int r3 = r3.mo13257a(r13)
            r12.mo13151a()
            r9 = 0
        L_0x00c2:
            r11 = 4
            if (r9 >= r11) goto L_0x0158
            com.facebook.litho.e r11 = r12.f18231a
            float[] r11 = r11.f18352a
            float r2 = (float) r3
            r11[r9] = r2
            int r9 = r9 + 1
            r2 = r22
            goto L_0x00c2
        L_0x00d1:
            r2 = r14
            com.google.android.libraries.elements.a.a.o r2 = (com.google.android.libraries.elements.p1705a.p1706a.C20691o) r2
            com.youtube.a.a.bc r3 = r2.f57976a
            boolean r3 = r3.mo60158l()
            if (r3 != 0) goto L_0x00f3
            if (r15 != 0) goto L_0x00e6
            com.youtube.a.a.bc r3 = r2.f57976a
            boolean r3 = r3.mo60160n()
            if (r3 != 0) goto L_0x00f3
        L_0x00e6:
            if (r15 == 0) goto L_0x00f1
            com.youtube.a.a.bc r3 = r2.f57976a
            boolean r3 = r3.mo60157k()
            if (r3 == 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r3 = 0
            goto L_0x00f7
        L_0x00f3:
            r3 = 0
            r12.mo13152b(r3, r13)
        L_0x00f7:
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60159m()
            if (r9 != 0) goto L_0x0113
            if (r15 != 0) goto L_0x0109
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60157k()
            if (r9 != 0) goto L_0x0113
        L_0x0109:
            if (r15 == 0) goto L_0x0117
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60160n()
            if (r9 == 0) goto L_0x0117
        L_0x0113:
            r9 = 1
            r12.mo13152b(r9, r13)
        L_0x0117:
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60154h()
            if (r9 != 0) goto L_0x0133
            if (r15 != 0) goto L_0x0129
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60156j()
            if (r9 != 0) goto L_0x0133
        L_0x0129:
            if (r15 == 0) goto L_0x0137
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60153g()
            if (r9 == 0) goto L_0x0137
        L_0x0133:
            r9 = 3
            r12.mo13152b(r9, r13)
        L_0x0137:
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60155i()
            if (r9 != 0) goto L_0x0153
            if (r15 != 0) goto L_0x0149
            com.youtube.a.a.bc r9 = r2.f57976a
            boolean r9 = r9.mo60153g()
            if (r9 != 0) goto L_0x0153
        L_0x0149:
            if (r15 == 0) goto L_0x0159
            com.youtube.a.a.bc r2 = r2.f57976a
            boolean r2 = r2.mo60156j()
            if (r2 == 0) goto L_0x0159
        L_0x0153:
            r2 = 2
            r12.mo13152b(r2, r13)
            goto L_0x0159
        L_0x0158:
            r3 = 0
        L_0x0159:
            r10.f59600c = r12
        L_0x015b:
            com.youtube.a.a.bh r2 = r5.f57977a
            float r2 = r2.mo60170i()
            double r11 = (double) r2
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 0
            int r9 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r9 < 0) goto L_0x017f
            int r9 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x017f
            com.facebook.litho.bs r9 = new com.facebook.litho.bs
            java.lang.Float r11 = java.lang.Float.valueOf(r2)
            r9.<init>(r11)
            com.google.protos.youtube.elements.ca r11 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_ALPHA
            r0.mo25934h(r11, r9)
            r6.mo13441n(r2)
        L_0x017f:
            com.youtube.a.a.bh r2 = r5.f57977a
            float r2 = r2.mo60172k()
            double r11 = (double) r2
            int r9 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r9 == 0) goto L_0x01c1
            int r9 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x01c1
            com.facebook.litho.bs r9 = new com.facebook.litho.bs
            java.lang.Float r11 = java.lang.Float.valueOf(r2)
            r9.<init>(r11)
            com.google.protos.youtube.elements.ca r11 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_SCALE
            r0.mo25934h(r11, r9)
            com.facebook.litho.q r9 = r6.f18980c
            com.facebook.litho.l r9 = r9.mo13456J()
            com.facebook.litho.ev r11 = r9.mo13411E()
            r11.mo13059aa(r2)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x01b7
            byte r2 = r9.f18967a
            r2 = r2 & -5
            byte r2 = (byte) r2
            r9.f18967a = r2
            goto L_0x01be
        L_0x01b7:
            byte r2 = r9.f18967a
            r11 = 4
            r2 = r2 | r11
            byte r2 = (byte) r2
            r9.f18967a = r2
        L_0x01be:
            r6.mo13268k()
        L_0x01c1:
            com.youtube.a.a.bh r2 = r5.f57977a
            float r2 = r2.mo60171j()
            double r11 = (double) r2
            r9 = 16
            int r16 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r16 == 0) goto L_0x01ff
            com.facebook.litho.bs r11 = new com.facebook.litho.bs
            java.lang.Float r12 = java.lang.Float.valueOf(r2)
            r11.<init>(r12)
            com.google.protos.youtube.elements.ca r12 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_ROTATION
            r0.mo25934h(r12, r11)
            com.facebook.litho.q r11 = r6.f18980c
            com.facebook.litho.l r11 = r11.mo13456J()
            com.facebook.litho.ev r12 = r11.mo13411E()
            r12.mo13056Z(r2)
            r12 = 0
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x01f6
            byte r2 = r11.f18967a
            r2 = r2 & -17
            byte r2 = (byte) r2
            r11.f18967a = r2
            goto L_0x01fc
        L_0x01f6:
            byte r2 = r11.f18967a
            r2 = r2 | r9
            byte r2 = (byte) r2
            r11.f18967a = r2
        L_0x01fc:
            r6.mo13268k()
        L_0x01ff:
            com.google.android.libraries.elements.interfaces.PointProxy r2 = r5.f57979c
            if (r2 == 0) goto L_0x0254
            com.google.android.libraries.elements.a.a.l r2 = (com.google.android.libraries.elements.p1705a.p1706a.C20688l) r2
            com.youtube.a.a.az r11 = r2.f57973a
            float r11 = r11.mo60145b()
            com.youtube.a.a.az r2 = r2.f57973a
            float r2 = r2.mo60146c()
            r12 = 0
            int r16 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r16 < 0) goto L_0x021a
            int r16 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x0230
        L_0x021a:
            com.facebook.litho.bs r12 = new com.facebook.litho.bs
            r3 = 1
            float r11 = android.util.TypedValue.applyDimension(r3, r11, r7)
            java.lang.Float r3 = java.lang.Float.valueOf(r11)
            r12.<init>(r3)
            com.google.protos.youtube.elements.ca r3 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_X
            r0.mo25934h(r3, r12)
            r6.mo13422F(r12)
        L_0x0230:
            r3 = 0
            int r11 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x023d
            int r11 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x023a
            goto L_0x023d
        L_0x023a:
            r0 = 0
            r11 = 1
            goto L_0x0256
        L_0x023d:
            com.facebook.litho.bs r3 = new com.facebook.litho.bs
            r11 = 1
            float r2 = android.util.TypedValue.applyDimension(r11, r2, r7)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.<init>(r2)
            com.google.protos.youtube.elements.ca r2 = com.google.protos.youtube.elements.C66156ca.DYNAMIC_PROP_TYPE_TRANSLATION_Y
            r0.mo25934h(r2, r3)
            r6.mo13423G(r3)
            goto L_0x0255
        L_0x0254:
            r11 = 1
        L_0x0255:
            r0 = 0
        L_0x0256:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0260
            float r0 = android.util.TypedValue.applyDimension(r11, r13, r7)
            r10.f59598a = r0
        L_0x0260:
            if (r14 == 0) goto L_0x0264
            r10.f59601d = r14
        L_0x0264:
            java.lang.String r0 = "deprecated_option_force_clip_bounds"
            r2 = r24
            boolean r0 = r0.equals(r2)
            boolean r2 = r1.f58951d
            if (r2 != 0) goto L_0x0272
            if (r0 == 0) goto L_0x02bf
        L_0x0272:
            boolean r0 = com.google.p370af.C7490c.m22726p(r4, r9)
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r4.mo60178r()
            r6.mo13316s(r0)
            boolean r0 = r4.mo60178r()
            if (r0 == 0) goto L_0x02bf
            float r0 = r10.f59598a
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x02bf
            r2 = 1
            float r0 = android.util.TypedValue.applyDimension(r2, r8, r7)
            float r2 = r10.f59598a
            com.google.android.libraries.elements.d.e.bi r3 = new com.google.android.libraries.elements.d.e.bi
            int r2 = (int) r2
            r7 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r7
            int r0 = (int) r0
            int r2 = r2 + r0
            r3.<init>(r2)
            com.facebook.litho.q r0 = r6.f18980c
            com.facebook.litho.l r0 = r0.mo13456J()
            com.facebook.litho.ev r0 = r0.mo13411E()
            r0.mo13055Y(r3)
            r6.mo13268k()
            com.facebook.litho.q r0 = r6.f18980c
            com.facebook.litho.l r0 = r0.mo13456J()
            com.facebook.litho.ev r0 = r0.mo13411E()
            r2 = 1
            r0.mo13046P(r2)
            r6.mo13268k()
        L_0x02bf:
            com.youtube.a.a.bh r0 = r5.f57977a
            long r2 = r0.mo60173l()
            int r0 = (int) r2
            if (r0 == 0) goto L_0x02db
            com.google.android.libraries.elements.d.e.b.d r2 = new com.google.android.libraries.elements.d.e.b.d
            r2.<init>()
            r2.f58925c = r0
            float r0 = r10.f59598a
            r2.f58926d = r0
            com.google.android.libraries.elements.interfaces.RectCornersProxy r0 = r10.f59601d
            r2.f58927e = r0
            r2.f58928f = r15
            r10.f59602e = r2
        L_0x02db:
            com.youtube.a.a.ah r0 = r4.mo60175n()
            r2 = 0
            if (r0 != 0) goto L_0x02e4
            goto L_0x0429
        L_0x02e4:
            com.youtube.a.a.ah r3 = r4.mo60175n()
            r4 = 0
        L_0x02e9:
            int r0 = r3.mo60108g()
            if (r4 >= r0) goto L_0x0429
            com.youtube.a.a.ag r5 = r3.mo60109h(r4)
            int r0 = r5.mo60107j()
            r7 = 6
            r8 = 1
            if (r0 != r8) goto L_0x03ae
            java.util.Map r0 = r1.f58949b
            int r9 = r5.mo60106i()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r9)
            com.google.android.libraries.elements.d.e.b.a r0 = (com.google.android.libraries.elements.p1714d.p1719e.p1723b.C21022a) r0
            if (r0 == 0) goto L_0x0396
            java.nio.ByteBuffer r0 = r5.mo16918f(r7)
            com.youtube.a.a.h r5 = new com.youtube.a.a.h
            r5.<init>()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r9)
            int r9 = r0.position()
            int r9 = r0.getInt(r9)
            int r11 = r0.position()
            int r9 = r9 + r11
            r5.mo16917e(r9, r0)
            r9 = 4
            int r0 = r5.mo16913a(r9)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 == 0) goto L_0x0343
            java.nio.ByteBuffer r15 = r5.f24704b
            int r8 = r5.f24703a
            int r0 = r0 + r8
            int r0 = r15.getInt(r0)
            long r13 = (long) r0
            long r13 = r13 & r11
            goto L_0x0345
        L_0x0343:
            r13 = 0
        L_0x0345:
            int r0 = (int) r13
            int r7 = r5.mo16913a(r7)
            if (r7 == 0) goto L_0x0359
            java.nio.ByteBuffer r8 = r5.f24704b
            int r5 = r5.f24703a
            int r7 = r7 + r5
            int r5 = r8.getInt(r7)
            long r7 = (long) r5
            long r13 = r7 & r11
            goto L_0x035b
        L_0x0359:
            r13 = 0
        L_0x035b:
            int r5 = (int) r13
            if (r0 != 0) goto L_0x0368
            if (r5 != 0) goto L_0x0367
        L_0x0360:
            r7 = r22
            r13 = r23
            r8 = 2
            goto L_0x0425
        L_0x0367:
            r0 = 0
        L_0x0368:
            android.graphics.drawable.Drawable r7 = r10.f59602e
            if (r7 != 0) goto L_0x0380
            com.google.android.libraries.elements.d.e.b.d r7 = new com.google.android.libraries.elements.d.e.b.d
            r7.<init>()
            r7.f58923a = r5
            r7.f58924b = r0
            float r0 = r10.f59598a
            r7.f58926d = r0
            com.google.android.libraries.elements.interfaces.RectCornersProxy r0 = r10.f59601d
            r7.f58927e = r0
            r10.f59602e = r7
            goto L_0x0360
        L_0x0380:
            boolean r8 = r7 instanceof com.google.android.libraries.elements.p1714d.p1719e.p1723b.C21025d
            java.lang.Class r11 = r7.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "Alien Drawable in Style: %s"
            com.google.common.base.C58838bb.m90873h(r8, r12, r11)
            com.google.android.libraries.elements.d.e.b.d r7 = (com.google.android.libraries.elements.p1714d.p1719e.p1723b.C21025d) r7
            r7.f58923a = r5
            r7.f58924b = r0
            goto L_0x0360
        L_0x0396:
            com.google.android.libraries.elements.interfaces.bc r0 = new com.google.android.libraries.elements.interfaces.bc
            int r2 = r5.mo60106i()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown Flatbuffer extension: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x03ae:
            r9 = 4
            int r0 = r5.mo60107j()
            r8 = 2
            if (r0 != r8) goto L_0x0408
            java.util.Map r0 = r1.f58950c
            int r11 = r5.mo60106i()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.get(r11)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0403
            java.lang.Object r11 = r0.first     // Catch:{ ct -> 0x03e4 }
            com.google.android.libraries.elements.interfaces.bz r11 = (com.google.android.libraries.elements.interfaces.C21283bz) r11     // Catch:{ ct -> 0x03e4 }
            java.nio.ByteBuffer r7 = r5.mo16918f(r7)     // Catch:{ ct -> 0x03e4 }
            java.lang.Object r0 = r0.second     // Catch:{ ct -> 0x03e4 }
            com.google.protobuf.eb r0 = (com.google.protobuf.C63010eb) r0     // Catch:{ ct -> 0x03e4 }
            com.google.protobuf.ba r12 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x03e4 }
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.elements.internal.C21322ab.m40329a(r7, r0, r12)     // Catch:{ ct -> 0x03e4 }
            r7 = r22
            r11.mo25835b(r7, r0, r10)     // Catch:{ ct -> 0x03e2 }
            goto L_0x0405
        L_0x03e2:
            r0 = move-exception
            goto L_0x03e7
        L_0x03e4:
            r0 = move-exception
            r7 = r22
        L_0x03e7:
            com.google.android.libraries.elements.interfaces.bb r11 = r1.f58948a
            com.google.protos.youtube.elements.r r12 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_WIRE_FORMAT_ERROR
            int r5 = r5.mo60106i()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Failed to set PB Style Property Extension in StylePropertiesConverterFlat. Extension id: "
            r13.<init>(r14)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            r13 = r23
            r11.mo25782a(r12, r5, r13, r0)
            goto L_0x0425
        L_0x0403:
            r7 = r22
        L_0x0405:
            r13 = r23
            goto L_0x0425
        L_0x0408:
            r7 = r22
            r13 = r23
            com.google.android.libraries.elements.interfaces.bb r0 = r1.f58948a
            com.google.protos.youtube.elements.r r11 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INVALID_FIELD
            int r5 = r5.mo60106i()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "StylePropertiesExtensionConverterFlat: extension with unknown format: "
            r12.<init>(r14)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r0.mo25782a(r11, r5, r13, r2)
        L_0x0425:
            int r4 = r4 + 1
            goto L_0x02e9
        L_0x0429:
            android.graphics.drawable.Drawable r0 = r10.f59602e
            boolean r3 = r6 instanceof com.google.android.libraries.elements.p1714d.C20800am
            if (r3 == 0) goto L_0x043d
            r3 = r6
            com.google.android.libraries.elements.d.am r3 = (com.google.android.libraries.elements.p1714d.C20800am) r3
            float r4 = r10.f59598a
            com.google.android.libraries.elements.d.an r3 = r3.f58233a
            r3.f58250g = r4
            if (r0 == 0) goto L_0x0442
            r3.f58247d = r0
            goto L_0x0442
        L_0x043d:
            if (r0 == 0) goto L_0x0442
            r6.mo13444q(r0)
        L_0x0442:
            com.facebook.litho.d r0 = r10.f59600c
            if (r0 == 0) goto L_0x0462
            r0.mo13151a()
            r0.f18232b = r2
            com.facebook.litho.e r0 = r0.f18231a
            com.facebook.litho.q r2 = r6.f18980c
            com.facebook.litho.l r2 = r2.mo13456J()
            com.facebook.litho.k r2 = r2.mo13412d()
            int r3 = r2.f18954a
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r2.f18954a = r3
            r2.f18964k = r0
            r6.mo13268k()
        L_0x0462:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1719e.C21037bj.mo25838b(com.facebook.litho.u, com.google.android.libraries.elements.interfaces.z, java.lang.String, java.lang.Object, com.google.android.libraries.elements.interfaces.ar, com.google.android.libraries.elements.interfaces.q):void");
    }

    /* renamed from: d */
    public final /* synthetic */ C7492e mo26067d(ByteBuffer byteBuffer) {
        return C68072bh.m98336q(byteBuffer);
    }

    /* renamed from: c */
    public final void mo25839c(C21248ar arVar) {
        C6405o oVar = ((C20834br) arVar).f58369a;
        oVar.getClass();
        oVar.mo13441n(1.0f);
        oVar.mo13316s(true);
    }
}
