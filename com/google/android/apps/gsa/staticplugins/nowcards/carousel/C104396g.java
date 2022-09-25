package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.carousel.g */
/* compiled from: PG */
public final class C104396g {
    /* renamed from: a */
    public static Rect m172605a(Context context, boolean z, boolean z2, boolean z3) {
        Rect rect = new Rect();
        if (z) {
            return rect;
        }
        Resources resources = context.getResources();
        if (z2) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.carousel_gestalt_padding_offset_hero);
            rect.set(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.carousel_gestalt_padding_offset);
            rect.set(dimensionPixelSize2, z3 ? resources.getDimensionPixelSize(R.dimen.carousel_gestalt_padding_offset_noheaders_top) : dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        }
        return rect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        if (r3 == com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104395f m172606b(android.content.Context r13, com.google.android.apps.p489g.p494d.C9280x r14, int r15, com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a r16, boolean r17) {
        /*
            r0 = r14
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x004d
            com.google.protobuf.cq r3 = r0.f32223b
            int r3 = r3.size()
            if (r3 == 0) goto L_0x004d
            com.google.protobuf.cq r3 = r0.f32223b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r3 = r3.f32192a
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x004d
            com.google.protobuf.cq r3 = r0.f32223b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            com.google.ai.b.hj r3 = r3.f32174H
            if (r3 != 0) goto L_0x002a
            com.google.ai.b.hj r3 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x002a:
            int r3 = r3.f26961b
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x004d
            com.google.protobuf.cq r3 = r0.f32223b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            com.google.ai.b.hj r3 = r3.f32174H
            if (r3 != 0) goto L_0x003f
            com.google.ai.b.hj r3 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x003f:
            int r3 = r3.f26952X
            int r3 = com.google.p375ai.p378b.C7650ew.m22795a(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            r4 = 4
            if (r3 != r4) goto L_0x004d
            r9 = 1
            goto L_0x004e
        L_0x004d:
            r9 = 0
        L_0x004e:
            if (r0 == 0) goto L_0x0096
            com.google.protobuf.cq r3 = r0.f32223b
            int r3 = r3.size()
            if (r3 == 0) goto L_0x0096
            com.google.protobuf.cq r3 = r0.f32223b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r3 = r3.f32192a
            r3 = r3 & r1
            if (r3 == 0) goto L_0x0096
            com.google.protobuf.cq r3 = r0.f32223b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r3 = r3.f32196c
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r3)
            if (r3 != 0) goto L_0x0077
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x0077:
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE
            if (r3 == r4) goto L_0x0091
            com.google.protobuf.cq r3 = r0.f32223b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.apps.g.d.v r3 = (com.google.android.apps.p489g.p494d.C9278v) r3
            int r3 = r3.f32196c
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.m23705a(r3)
            if (r3 != 0) goto L_0x008d
            com.google.android.apps.g.d.u r3 = com.google.android.apps.p489g.p494d.C9277u.UNKNOWN
        L_0x008d:
            com.google.android.apps.g.d.u r4 = com.google.android.apps.p489g.p494d.C9277u.METADATA_CARD_SMALL_CAROUSEL_TWO_TONE_ICON
            if (r3 != r4) goto L_0x0096
        L_0x0091:
            r2 = r13
            r3 = r17
            r10 = 1
            goto L_0x009a
        L_0x0096:
            r2 = r13
            r3 = r17
            r10 = 0
        L_0x009a:
            android.graphics.Rect r4 = m172605a(r13, r10, r9, r3)
            if (r0 != 0) goto L_0x00d9
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r0 = new com.google.android.apps.gsa.staticplugins.nowcards.carousel.f
            r0.<init>()
            android.content.res.Resources r1 = r13.getResources()
            int r3 = r4.left
            int r5 = r4.right
            r6 = 2131171578(0x7f0718fa, float:1.7957547E38)
            int r1 = r1.getDimensionPixelSize(r6)
            int r3 = r3 + r5
            int r1 = r1 + r3
            r0.f290482b = r1
            android.content.res.Resources r1 = r13.getResources()
            int r3 = r4.top
            int r4 = r4.bottom
            r5 = 2131171573(0x7f0718f5, float:1.7957536E38)
            int r1 = r1.getDimensionPixelSize(r5)
            int r3 = r3 + r4
            int r1 = r1 + r3
            r0.f290483c = r1
            android.content.res.Resources r1 = r13.getResources()
            r2 = 2131171572(0x7f0718f4, float:1.7957534E38)
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.f290481a = r1
            return r0
        L_0x00d9:
            int r4 = r0.f32222a
            r1 = r1 & r4
            if (r1 == 0) goto L_0x00e5
            com.google.ai.b.rt r1 = r0.f32224c
            if (r1 != 0) goto L_0x00e6
            com.google.ai.b.rt r1 = com.google.p375ai.p378b.C7998rt.f28087v
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            r6 = r1
            com.google.protobuf.cq r0 = r0.f32223b
            int r7 = r0.size()
            r5 = r13
            r8 = r15
            r11 = r16
            r12 = r17
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r0 = m172607c(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104396g.m172606b(android.content.Context, com.google.android.apps.g.d.x, int, com.google.android.apps.gsa.sidekick.shared.monet.d.a, boolean):com.google.android.apps.gsa.staticplugins.nowcards.carousel.f");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0191  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104395f m172607c(android.content.Context r7, com.google.p375ai.p378b.C7998rt r8, int r9, int r10, boolean r11, boolean r12, com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a r13, boolean r14) {
        /*
            com.google.android.apps.gsa.staticplugins.nowcards.carousel.f r0 = new com.google.android.apps.gsa.staticplugins.nowcards.carousel.f
            r0.<init>()
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131169622(0x7f071156, float:1.795358E38)
            int r2 = r1.getDimensionPixelSize(r2)
            android.graphics.Rect r11 = m172605a(r7, r12, r11, r14)
            r14 = 0
            if (r12 != 0) goto L_0x002e
            boolean r12 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b.m148053a(r7)
            if (r12 == 0) goto L_0x002e
            if (r13 == 0) goto L_0x002e
            int r12 = r13.mo86288l()
            r13 = 4
            int r13 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c.m148055a(r7, r13)
            int r12 = r12 - r13
            int r2 = r2 + r2
            int r12 = r12 - r2
            int r12 = r12 / 2
            goto L_0x002f
        L_0x002e:
            r12 = 0
        L_0x002f:
            int r13 = r11.left
            int r2 = r11.right
            r3 = 2131171578(0x7f0718fa, float:1.7957547E38)
            int r3 = r1.getDimensionPixelSize(r3)
            int r13 = r13 + r2
            int r3 = r3 + r13
            int r13 = r11.top
            int r2 = r11.bottom
            r4 = 2131171573(0x7f0718f5, float:1.7957536E38)
            int r4 = r1.getDimensionPixelSize(r4)
            int r13 = r13 + r2
            int r4 = r4 + r13
            android.content.res.Resources r13 = r7.getResources()
            r2 = 2131171572(0x7f0718f4, float:1.7957534E38)
            int r13 = r13.getDimensionPixelOffset(r2)
            r0.f290481a = r13
            r13 = 1
            if (r8 == 0) goto L_0x0131
            int r2 = r8.f28089a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0073
            int r2 = r8.f28093e
            float r2 = (float) r2
            android.util.DisplayMetrics r5 = r1.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r13, r2, r5)
            int r2 = (int) r2
            int r5 = r11.left
            int r6 = r11.right
            int r5 = r5 + r6
            int r2 = r2 - r5
            r0.f290481a = r2
        L_0x0073:
            int r2 = r8.f28089a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x008b
            int r2 = r8.f28094f
            float r2 = (float) r2
            android.util.DisplayMetrics r5 = r1.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r13, r2, r5)
            int r2 = (int) r2
            int r5 = r11.left
            int r2 = r2 - r5
            int r2 = r2 + r12
            r0.f290485e = r2
        L_0x008b:
            int r2 = r8.f28089a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00a3
            int r2 = r8.f28095g
            float r2 = (float) r2
            android.util.DisplayMetrics r5 = r1.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r13, r2, r5)
            int r2 = (int) r2
            int r5 = r11.right
            int r2 = r2 - r5
            int r2 = r2 + r12
            r0.f290486f = r2
        L_0x00a3:
            int r12 = r8.f28089a
            r12 = r12 & 64
            if (r12 == 0) goto L_0x00ba
            int r12 = r8.f28096h
            float r12 = (float) r12
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            float r12 = android.util.TypedValue.applyDimension(r13, r12, r2)
            int r12 = (int) r12
            int r2 = r11.bottom
            int r12 = r12 - r2
            r0.f290487g = r12
        L_0x00ba:
            int r12 = r8.f28089a
            r12 = r12 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x00ce
            int r12 = r8.f28097i
            float r12 = (float) r12
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            float r12 = android.util.TypedValue.applyDimension(r13, r12, r2)
            int r12 = (int) r12
            r0.f290488h = r12
        L_0x00ce:
            int r12 = r8.f28089a
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x00e2
            int r12 = r8.f28098j
            float r12 = (float) r12
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            float r12 = android.util.TypedValue.applyDimension(r13, r12, r2)
            int r12 = (int) r12
            r0.f290489i = r12
        L_0x00e2:
            int r12 = r8.f28090b
            if (r12 <= 0) goto L_0x00f1
            float r12 = (float) r12
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            float r12 = android.util.TypedValue.applyDimension(r13, r12, r2)
            int r12 = (int) r12
            goto L_0x00f2
        L_0x00f1:
            r12 = r3
        L_0x00f2:
            int r2 = r8.f28100l
            if (r2 <= 0) goto L_0x0106
            float r12 = (float) r2
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            float r12 = android.util.TypedValue.applyDimension(r13, r12, r2)
            int r12 = (int) r12
            int r2 = r11.left
            int r5 = r11.right
            int r2 = r2 + r5
            int r12 = r12 + r2
        L_0x0106:
            int r2 = r8.f28091c
            if (r2 < 0) goto L_0x0115
            float r2 = (float) r2
            android.util.DisplayMetrics r5 = r1.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r13, r2, r5)
            int r2 = (int) r2
            goto L_0x0116
        L_0x0115:
            r2 = r4
        L_0x0116:
            int r5 = r8.f28101m
            if (r5 <= 0) goto L_0x012c
            float r5 = (float) r5
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r13, r5, r1)
            int r1 = (int) r1
            int r5 = r11.top
            int r11 = r11.bottom
            int r5 = r5 + r11
            int r1 = r1 + r5
            r0.f290483c = r1
        L_0x012c:
            boolean r11 = r8.f28099k
            r0.f290490j = r11
            goto L_0x0133
        L_0x0131:
            r12 = r3
            r2 = r4
        L_0x0133:
            if (r8 == 0) goto L_0x013a
            int r11 = r8.f28100l
            if (r11 <= 0) goto L_0x013a
            goto L_0x0149
        L_0x013a:
            int r11 = r0.f290481a
            int r1 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c.m148055a(r7, r10)
            int r5 = r9 + -1
            int r5 = r5 * r11
            int r11 = r12 * r9
            int r11 = r11 + r5
            if (r11 <= r1) goto L_0x014b
        L_0x0149:
            r1 = r12
            goto L_0x014d
        L_0x014b:
            int r1 = r1 - r5
            int r1 = r1 / r9
        L_0x014d:
            r0.f290482b = r1
            if (r8 == 0) goto L_0x0168
            boolean r8 = r8.f28106r
            if (r8 == 0) goto L_0x0168
            int r8 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c.m148055a(r7, r10)
            android.content.res.Resources r9 = r7.getResources()
            r10 = 2131168023(0x7f070b17, float:1.7950336E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r1 = r8 - r9
            r0.f290482b = r1
        L_0x0168:
            if (r2 != 0) goto L_0x016c
            r8 = 1
            goto L_0x016d
        L_0x016c:
            r8 = 0
        L_0x016d:
            if (r1 != r3) goto L_0x0176
            if (r2 == r4) goto L_0x0174
            if (r8 != 0) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            r9 = 0
            goto L_0x0177
        L_0x0176:
            r9 = 1
        L_0x0177:
            r0.f290491k = r9
            float r9 = (float) r1
            float r10 = (float) r12
            float r9 = r9 / r10
            if (r13 == r8) goto L_0x017f
            r4 = r2
        L_0x017f:
            float r10 = (float) r4
            float r10 = r10 * r9
            int r9 = (int) r10
            r0.f290484d = r9
            int r10 = r0.f290483c
            if (r13 != r8) goto L_0x018a
            r9 = 0
        L_0x018a:
            int r10 = r10 - r9
            float r9 = (float) r10
            r10 = 0
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b6
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            float r7 = r7.fontScale
            double r10 = (double) r7
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x01a5
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01aa
        L_0x01a5:
            r10 = 1066192077(0x3f8ccccd, float:1.1)
            float r7 = r7 * r10
        L_0x01aa:
            float r9 = r9 * r7
            if (r8 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            int r14 = r0.f290484d
        L_0x01b1:
            float r7 = (float) r14
            float r9 = r9 + r7
            int r7 = (int) r9
            r0.f290483c = r7
        L_0x01b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104396g.m172607c(android.content.Context, com.google.ai.b.rt, int, int, boolean, boolean, com.google.android.apps.gsa.sidekick.shared.monet.d.a, boolean):com.google.android.apps.gsa.staticplugins.nowcards.carousel.f");
    }
}
