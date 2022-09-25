package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.componentview.components.base.p1687a.C19924ay;
import com.google.android.libraries.componentview.components.base.p1688b.C20034d;
import com.google.android.libraries.componentview.p1697d.C20475f;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56425d;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.base.c */
/* compiled from: PG */
public class C20069c extends C20061bs implements C20475f {

    /* renamed from: a */
    private final C20537f f56281a;

    /* renamed from: b */
    private C19924ay f56282b;

    /* renamed from: c */
    private C58485gu f56283c;

    /* renamed from: d */
    private boolean f56284d = false;

    /* renamed from: e */
    private int f56285e = 0;

    public C20069c(Context context, C56425d dVar, C20537f fVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f56281a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new C20034d(context);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0263  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25111g(com.google.p4271bq.C56425d r12) {
        /*
            r11 = this;
            com.google.protobuf.bt r0 = com.google.android.libraries.componentview.components.base.p1687a.C19924ay.f55729x
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r12 = r12.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r1)
            if (r12 != 0) goto L_0x0016
            java.lang.Object r12 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r12 = r0.mo58889c(r12)
        L_0x001a:
            com.google.android.libraries.componentview.components.base.a.ay r12 = (com.google.android.libraries.componentview.components.base.p1687a.C19924ay) r12
            r11.f56282b = r12
            android.view.View r12 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r12 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r12
            r0 = 1
            r12.setMaxLines(r0)
            android.view.View r12 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r12 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r12
            r1 = -1
            r12.setTextColor(r1)
            com.google.android.libraries.componentview.components.base.a.ay r12 = r11.f56282b
            int r2 = r12.f55731a
            r2 = r2 & 64
            if (r2 == 0) goto L_0x003f
            com.google.android.libraries.componentview.components.base.a.aq r2 = r12.f55738h
            if (r2 != 0) goto L_0x003c
            com.google.android.libraries.componentview.components.base.a.aq r2 = com.google.android.libraries.componentview.components.base.p1687a.C19916aq.f55703s
        L_0x003c:
            r11.mo25249w(r2)
        L_0x003f:
            java.lang.String r2 = r12.f55732b
            boolean r2 = com.google.android.libraries.componentview.p1697d.C20482m.m38447o(r2)
            if (r2 != 0) goto L_0x0050
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            java.lang.String r3 = r12.f55732b
            r2.setText(r3)
        L_0x0050:
            int r2 = r12.f55731a
            r3 = 2
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0067
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            com.google.android.libraries.componentview.components.base.a.r r4 = r12.f55733c
            if (r4 != 0) goto L_0x0060
            com.google.android.libraries.componentview.components.base.a.r r4 = com.google.android.libraries.componentview.components.base.p1687a.C19995r.f56032g
        L_0x0060:
            int r4 = com.google.android.libraries.componentview.services.application.C20566at.m38590a(r4)
            r2.setTextColor(r4)
        L_0x0067:
            float r2 = r12.f55735e
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0075
            android.view.View r4 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r4 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r4
            r4.setTextSize(r2)
        L_0x0075:
            boolean r2 = r12.f55743m
            boolean r4 = r12.f55744n
            if (r4 == 0) goto L_0x007d
            r2 = r2 | 2
        L_0x007d:
            java.lang.String r4 = r12.f55734d
            boolean r4 = com.google.android.libraries.componentview.p1697d.C20482m.m38447o(r4)
            java.lang.String r5 = "BaselineTextViewCompone"
            r6 = 0
            if (r4 != 0) goto L_0x00d9
            android.view.View r4 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r4 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r4
            java.lang.String r7 = r12.f55734d
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r2)
            r4.setTypeface(r7)
            java.lang.String r4 = r12.f55734d
            java.lang.String r7 = "google"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L_0x00e8
            java.lang.String r4 = r12.f55734d
            r7 = 45
            r8 = 95
            java.lang.String r4 = r4.replace(r7, r8)
            android.content.Context r7 = r11.f56304o
            android.content.res.Resources r7 = r7.getResources()
            android.content.Context r8 = r11.f56304o
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r9 = "font"
            int r7 = r7.getIdentifier(r4, r9, r8)
            if (r7 <= 0) goto L_0x00e8
            android.content.Context r8 = r11.f56304o     // Catch:{ RuntimeException -> 0x00cd }
            android.graphics.Typeface r7 = androidx.core.content.p091b.C1874w.m5107d(r8, r7)     // Catch:{ RuntimeException -> 0x00cd }
            if (r7 == 0) goto L_0x00e8
            android.view.View r8 = r11.f56305p     // Catch:{ RuntimeException -> 0x00cd }
            com.google.android.libraries.componentview.components.base.b.d r8 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r8     // Catch:{ RuntimeException -> 0x00cd }
            r8.setTypeface(r7, r2)     // Catch:{ RuntimeException -> 0x00cd }
            goto L_0x00e8
        L_0x00cd:
            r2 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r6] = r4
            r4 = 5
            java.lang.String r8 = "failed to get font %s"
            com.google.android.libraries.componentview.p1699f.C20520h.m38497b(r4, r5, r2, r8, r7)
            goto L_0x00e8
        L_0x00d9:
            if (r2 == 0) goto L_0x00e8
            android.view.View r4 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r4 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r4
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r7, r2)
            r4.setTypeface(r2)
        L_0x00e8:
            boolean r2 = r12.f55750t
            if (r2 == 0) goto L_0x00f3
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            r2.setAllCaps(r0)
        L_0x00f3:
            int r2 = r12.f55736f
            if (r2 == 0) goto L_0x00ff
            android.view.View r4 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r4 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r4
            r4.setMaxLines(r2)
            goto L_0x0109
        L_0x00ff:
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            r4 = 2147483647(0x7fffffff, float:NaN)
            r2.setMaxLines(r4)
        L_0x0109:
            boolean r2 = r12.f55745o
            if (r2 == 0) goto L_0x0113
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            r2.f56166f = r0
        L_0x0113:
            boolean r2 = r12.f55748r
            if (r2 == 0) goto L_0x0119
            r11.f56284d = r0
        L_0x0119:
            com.google.android.libraries.componentview.components.base.a.au r2 = r12.f55752v
            if (r2 != 0) goto L_0x011f
            com.google.android.libraries.componentview.components.base.a.au r2 = com.google.android.libraries.componentview.components.base.p1687a.C19920au.f55724b
        L_0x011f:
            boolean r2 = com.google.android.libraries.componentview.p1697d.C20482m.m38445m(r2)
            if (r2 == 0) goto L_0x0130
            com.google.android.libraries.componentview.components.base.a.au r1 = r12.f55752v
            if (r1 != 0) goto L_0x012b
            com.google.android.libraries.componentview.components.base.a.au r1 = com.google.android.libraries.componentview.components.base.p1687a.C19920au.f55724b
        L_0x012b:
            int r1 = com.google.android.libraries.componentview.p1697d.C20482m.m38436d(r1)
            goto L_0x0148
        L_0x0130:
            int r2 = r12.f55737g
            int r2 = com.google.android.libraries.componentview.components.base.p1687a.C19923ax.m37780a(r2)
            if (r2 != 0) goto L_0x0139
            r2 = 1
        L_0x0139:
            int r2 = r2 + r1
            if (r2 == r0) goto L_0x0146
            if (r2 == r3) goto L_0x0142
            r1 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0148
        L_0x0142:
            r1 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x0148
        L_0x0146:
            r1 = 17
        L_0x0148:
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            r2.setGravity(r1)
            boolean r1 = r12.f55746p
            if (r1 != 0) goto L_0x015a
            android.view.View r1 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r1 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r1
            r1.setIncludeFontPadding(r6)
        L_0x015a:
            int r1 = r12.f55740j
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0180
            android.view.View r3 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r3 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r3
            android.content.Context r4 = r11.f56304o
            float r4 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r4)
            float r1 = (float) r1
            float r4 = r4 * r1
            int r1 = (int) r4
            android.text.TextPaint r4 = r3.getPaint()
            r7 = 0
            int r4 = r4.getFontMetricsInt(r7)
            if (r1 < 0) goto L_0x0180
            if (r1 == r4) goto L_0x0180
            int r1 = r1 - r4
            float r1 = (float) r1
            r3.setLineSpacing(r1, r2)
        L_0x0180:
            int r1 = r12.f55741k
            if (r1 != 0) goto L_0x0189
            int r1 = r12.f55742l
            if (r1 == 0) goto L_0x022a
            r1 = 0
        L_0x0189:
            android.view.View r3 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r3 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r3
            android.content.Context r4 = r11.f56304o
            float r4 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r4)
            float r1 = (float) r1
            float r4 = r4 * r1
            int r1 = (int) r4
            android.content.Context r4 = r11.f56304o
            int r7 = r12.f55742l
            float r4 = com.google.android.libraries.componentview.p1697d.C20482m.m38433a(r4)
            float r7 = (float) r7
            float r4 = r4 * r7
            int r4 = (int) r4
            android.text.TextPaint r7 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r7 = r7.getFontMetricsInt()
            int r7 = r7.top
            android.text.TextPaint r8 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r8 = r8.getFontMetricsInt()
            int r8 = r8.bottom
            boolean r9 = r3.getIncludeFontPadding()
            if (r9 != 0) goto L_0x01d1
            android.text.TextPaint r7 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r7 = r7.getFontMetricsInt()
            int r7 = r7.ascent
            android.text.TextPaint r8 = r3.getPaint()
            android.graphics.Paint$FontMetricsInt r8 = r8.getFontMetricsInt()
            int r8 = r8.descent
        L_0x01d1:
            android.content.Context r9 = r3.getContext()
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            android.content.Context r10 = r3.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.scaledDensity
            float r9 = r9 / r10
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0200
            float r2 = (float) r7
            float r2 = r2 * r9
            int r7 = java.lang.Math.round(r2)
            float r2 = (float) r8
            float r2 = r2 * r9
            int r8 = java.lang.Math.round(r2)
        L_0x0200:
            int r2 = r3.getPaddingTop()
            int r9 = r3.getPaddingBottom()
            int r10 = java.lang.Math.abs(r7)
            if (r1 == r10) goto L_0x0213
            int r7 = -r7
            int r1 = r1 - r7
            int r2 = r2 + r1
            r1 = 1
            goto L_0x0214
        L_0x0213:
            r1 = 0
        L_0x0214:
            int r7 = java.lang.Math.abs(r8)
            if (r4 == r7) goto L_0x021d
            int r4 = r4 - r8
            int r9 = r9 + r4
            r1 = 1
        L_0x021d:
            if (r1 == 0) goto L_0x022a
            int r1 = r3.getPaddingLeft()
            int r4 = r3.getPaddingRight()
            androidx.core.p098j.C2043bi.m5556aj(r3, r1, r2, r4, r9)
        L_0x022a:
            boolean r1 = r12.f55747q
            if (r1 == 0) goto L_0x0235
            android.view.View r1 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r1 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r1
            r1.setTextIsSelectable(r0)
        L_0x0235:
            int r1 = r12.f55731a
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0248
            com.google.android.libraries.componentview.components.base.a.r r1 = r12.f55749s
            if (r1 != 0) goto L_0x0242
            com.google.android.libraries.componentview.components.base.a.r r1 = com.google.android.libraries.componentview.components.base.p1687a.C19995r.f56032g
        L_0x0242:
            int r1 = com.google.android.libraries.componentview.services.application.C20566at.m38590a(r1)
            r11.f56285e = r1
        L_0x0248:
            boolean r1 = r12.f55751u
            if (r1 == 0) goto L_0x0252
            android.view.View r1 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r1 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r1
            r1.f56163c = r0
        L_0x0252:
            com.google.protobuf.cq r12 = r12.f55739i
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r12 = r12.iterator()
            r2 = 0
        L_0x025d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x02e8
            java.lang.Object r3 = r12.next()
            com.google.bq.d r3 = (com.google.p4271bq.C56425d) r3
            com.google.android.libraries.componentview.services.a.f r4 = r11.f56281a
            com.google.android.libraries.componentview.d.a r3 = r4.mo25450a(r11, r3)
            if (r3 == 0) goto L_0x02bc
            boolean r4 = r3 instanceof com.google.android.libraries.componentview.components.base.C20058bp
            if (r4 != 0) goto L_0x0276
            goto L_0x02bc
        L_0x0276:
            r1.mo55395g(r3)
            com.google.android.libraries.componentview.components.base.bp r3 = (com.google.android.libraries.componentview.components.base.C20058bp) r3
            android.text.SpannableString r4 = r3.f56239f
            boolean r7 = r3.f56242i
            if (r7 == 0) goto L_0x0288
            android.view.View r7 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r7 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r7
            r7.f56165e = r4
            goto L_0x0293
        L_0x0288:
            android.view.View r7 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r7 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r7
            boolean r8 = r3.f56241h
            boolean r9 = r3.f56243j
            r7.mo25208a(r4, r8, r9)
        L_0x0293:
            boolean r3 = r3.f56240g
            if (r3 == 0) goto L_0x025d
            if (r2 != 0) goto L_0x025d
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            boolean r2 = r2.isTextSelectable()
            if (r2 == 0) goto L_0x02aa
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            r2.setTextIsSelectable(r6)
        L_0x02aa:
            android.view.View r2 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r2 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r2
            com.google.android.libraries.componentview.components.base.b.c r3 = new com.google.android.libraries.componentview.components.base.b.c
            int r4 = r11.f56285e
            boolean r7 = r11.f56284d
            r3.<init>(r4, r7)
            r2.setMovementMethod(r3)
            r2 = 1
            goto L_0x025d
        L_0x02bc:
            com.google.android.libraries.componentview.services.application.by r3 = r11.mo25418G()
            com.google.android.libraries.componentview.a.b.a r4 = com.google.android.libraries.componentview.p1675a.p1677b.C19742a.INVALID_CHILD
            r3.mo25535e(r4)
            java.lang.String r4 = "TextView has a null span or non-span child"
            r3.mo25536f(r4)
            com.google.android.libraries.componentview.components.base.a.ay r4 = r11.f56282b
            java.lang.String r4 = r4.f55732b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = "BaselineTextView Component with text : "
            java.lang.String r4 = r7.concat(r4)
            r3.mo25534d(r4)
            com.google.android.libraries.componentview.services.application.bz r3 = r3.mo25531a()
            com.google.android.libraries.componentview.services.application.ca r4 = r11.f56308s
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.android.libraries.componentview.p1699f.C20520h.m38498c(r5, r3, r4, r7)
            goto L_0x025d
        L_0x02e8:
            android.view.View r12 = r11.f56305p
            com.google.android.libraries.componentview.components.base.b.d r12 = (com.google.android.libraries.componentview.components.base.p1688b.C20034d) r12
            r12.mo25209b()
            com.google.common.b.gu r12 = r1.mo55394f()
            r11.f56283c = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.base.C20069c.mo25111g(com.google.bq.d):void");
    }

    /* renamed from: kA */
    public final /* synthetic */ List mo25239kA() {
        return this.f56283c;
    }

    /* renamed from: kB */
    public final void mo25240kB() {
    }

    /* renamed from: m */
    public final void mo25244m(String str) {
        ((C20034d) this.f56305p).setText(str);
    }
}
