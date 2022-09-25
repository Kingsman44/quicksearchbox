package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;
import androidx.constraintlayout.widget.C1742a;
import androidx.constraintlayout.widget.C1751j;
import androidx.constraintlayout.widget.C1754m;
import androidx.constraintlayout.widget.C1755n;
import androidx.constraintlayout.widget.C1756o;
import java.util.LinkedHashMap;

/* renamed from: androidx.constraintlayout.motion.widget.p */
/* compiled from: PG */
final class C1731p implements Comparable {

    /* renamed from: a */
    public float f5111a = 1.0f;

    /* renamed from: b */
    int f5112b = 0;

    /* renamed from: c */
    int f5113c;

    /* renamed from: d */
    public float f5114d = 0.0f;

    /* renamed from: e */
    public float f5115e = 0.0f;

    /* renamed from: f */
    public float f5116f = 0.0f;

    /* renamed from: g */
    public float f5117g = 0.0f;

    /* renamed from: h */
    public float f5118h = 1.0f;

    /* renamed from: i */
    public float f5119i = 1.0f;

    /* renamed from: j */
    public float f5120j = Float.NaN;

    /* renamed from: k */
    public float f5121k = Float.NaN;

    /* renamed from: l */
    public float f5122l = 0.0f;

    /* renamed from: m */
    public float f5123m = 0.0f;

    /* renamed from: n */
    public float f5124n = 0.0f;

    /* renamed from: o */
    public float f5125o = Float.NaN;

    /* renamed from: p */
    public float f5126p = Float.NaN;

    /* renamed from: q */
    final LinkedHashMap f5127q = new LinkedHashMap();

    /* renamed from: r */
    private float f5128r;

    /* renamed from: d */
    public static final boolean m4700d(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4801a(java.util.HashMap r9, int r10) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x022a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.get(r1)
            androidx.constraintlayout.motion.a.af r2 = (androidx.constraintlayout.motion.p084a.C1661af) r2
            int r3 = r1.hashCode()
            r4 = 1
            switch(r3) {
                case -1249320806: goto L_0x00b0;
                case -1249320805: goto L_0x00a6;
                case -1225497657: goto L_0x009b;
                case -1225497656: goto L_0x0090;
                case -1225497655: goto L_0x0085;
                case -1001078227: goto L_0x007a;
                case -908189618: goto L_0x006f;
                case -908189617: goto L_0x0064;
                case -760884510: goto L_0x005a;
                case -760884509: goto L_0x0050;
                case -40300674: goto L_0x0045;
                case -4379043: goto L_0x003a;
                case 37232917: goto L_0x002f;
                case 92909918: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x00ba
        L_0x0024:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 0
            goto L_0x00bb
        L_0x002f:
            java.lang.String r3 = "transitionPathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 7
            goto L_0x00bb
        L_0x003a:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 1
            goto L_0x00bb
        L_0x0045:
            java.lang.String r3 = "rotation"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 2
            goto L_0x00bb
        L_0x0050:
            java.lang.String r3 = "transformPivotY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 6
            goto L_0x00bb
        L_0x005a:
            java.lang.String r3 = "transformPivotX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 5
            goto L_0x00bb
        L_0x0064:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 10
            goto L_0x00bb
        L_0x006f:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 9
            goto L_0x00bb
        L_0x007a:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 8
            goto L_0x00bb
        L_0x0085:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 13
            goto L_0x00bb
        L_0x0090:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 12
            goto L_0x00bb
        L_0x009b:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 11
            goto L_0x00bb
        L_0x00a6:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 4
            goto L_0x00bb
        L_0x00b0:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ba
            r3 = 3
            goto L_0x00bb
        L_0x00ba:
            r3 = -1
        L_0x00bb:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01b0;
                case 2: goto L_0x01a0;
                case 3: goto L_0x0190;
                case 4: goto L_0x0180;
                case 5: goto L_0x0170;
                case 6: goto L_0x0160;
                case 7: goto L_0x0150;
                case 8: goto L_0x0140;
                case 9: goto L_0x0130;
                case 10: goto L_0x0120;
                case 11: goto L_0x0110;
                case 12: goto L_0x0100;
                case 13: goto L_0x00f0;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r5 = "MotionPaths"
            if (r3 == 0) goto L_0x020f
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r4]
            java.util.LinkedHashMap r4 = r8.f5127q
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0008
            java.util.LinkedHashMap r4 = r8.f5127q
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.C1742a) r3
            boolean r4 = r2 instanceof androidx.constraintlayout.motion.p084a.C1692r
            if (r4 == 0) goto L_0x01d0
            androidx.constraintlayout.motion.a.r r2 = (androidx.constraintlayout.motion.p084a.C1692r) r2
            android.util.SparseArray r1 = r2.f4814e
            r1.append(r10, r3)
            goto L_0x0008
        L_0x00f0:
            float r1 = r8.f5124n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            float r6 = r8.f5124n
        L_0x00fb:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0100:
            float r1 = r8.f5123m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            float r6 = r8.f5123m
        L_0x010b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0110:
            float r1 = r8.f5122l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            float r6 = r8.f5122l
        L_0x011b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0120:
            float r1 = r8.f5119i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            float r5 = r8.f5119i
        L_0x012b:
            r2.mo4535b(r10, r5)
            goto L_0x0008
        L_0x0130:
            float r1 = r8.f5118h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            float r5 = r8.f5118h
        L_0x013b:
            r2.mo4535b(r10, r5)
            goto L_0x0008
        L_0x0140:
            float r1 = r8.f5126p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            float r6 = r8.f5126p
        L_0x014b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0150:
            float r1 = r8.f5125o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            float r6 = r8.f5125o
        L_0x015b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0160:
            float r1 = r8.f5121k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            float r6 = r8.f5121k
        L_0x016b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0170:
            float r1 = r8.f5120j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            float r6 = r8.f5120j
        L_0x017b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0180:
            float r1 = r8.f5117g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            float r6 = r8.f5117g
        L_0x018b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x0190:
            float r1 = r8.f5116f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0199
            goto L_0x019b
        L_0x0199:
            float r6 = r8.f5116f
        L_0x019b:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x01a0:
            float r1 = r8.f5115e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            float r6 = r8.f5115e
        L_0x01ab:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x01b0:
            float r1 = r8.f5114d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            float r6 = r8.f5114d
        L_0x01bb:
            r2.mo4535b(r10, r6)
            goto L_0x0008
        L_0x01c0:
            float r1 = r8.f5111a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            float r5 = r8.f5111a
        L_0x01cb:
            r2.mo4535b(r10, r5)
            goto L_0x0008
        L_0x01d0:
            float r3 = r3.mo4848a()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 69
            int r4 = r4 + r6
            r7.<init>(r4)
            r7.append(r1)
            java.lang.String r1 = " ViewSpline not a CustomSet frame = "
            r7.append(r1)
            r7.append(r10)
            java.lang.String r1 = ", value"
            r7.append(r1)
            r7.append(r3)
            r7.append(r2)
            java.lang.String r1 = r7.toString()
            android.util.Log.e(r5, r1)
            goto L_0x0008
        L_0x020f:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            java.lang.String r3 = "UNKNOWN spline "
            if (r2 == 0) goto L_0x0220
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0225
        L_0x0220:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0225:
            android.util.Log.e(r5, r1)
            goto L_0x0008
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1731p.mo4801a(java.util.HashMap, int):void");
    }

    /* renamed from: b */
    public final void mo4802b(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.f5113c = view.getVisibility();
        this.f5111a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f5114d = view.getElevation();
        this.f5115e = view.getRotation();
        this.f5116f = view.getRotationX();
        this.f5117g = view.getRotationY();
        this.f5118h = view.getScaleX();
        this.f5119i = view.getScaleY();
        this.f5120j = view.getPivotX();
        this.f5121k = view.getPivotY();
        this.f5122l = view.getTranslationX();
        this.f5123m = view.getTranslationY();
        this.f5124n = view.getTranslationZ();
    }

    /* renamed from: c */
    public final void mo4803c(Rect rect, C1756o oVar, int i, int i2) {
        float f;
        float f2;
        float f3;
        int i3 = rect.left;
        int i4 = rect.top;
        rect.width();
        rect.height();
        C1751j e = oVar.mo4885e(i2);
        C1754m mVar = e.f5340c;
        int i5 = mVar.f5432c;
        this.f5112b = i5;
        this.f5113c = mVar.f5431b;
        if (mVar.f5431b == 0 || i5 != 0) {
            f = mVar.f5433d;
        } else {
            f = 0.0f;
        }
        this.f5111a = f;
        C1755n nVar = e.f5343f;
        this.f5114d = nVar.f5449o;
        this.f5115e = nVar.f5437c;
        this.f5116f = nVar.f5438d;
        this.f5117g = nVar.f5439e;
        this.f5118h = nVar.f5440f;
        this.f5119i = nVar.f5441g;
        this.f5120j = nVar.f5442h;
        this.f5121k = nVar.f5443i;
        this.f5122l = nVar.f5445k;
        this.f5123m = nVar.f5446l;
        this.f5124n = nVar.f5447m;
        C1596f.m4246c(e.f5341d.f5419e);
        this.f5125o = e.f5341d.f5424j;
        this.f5126p = e.f5340c.f5434e;
        for (String str : e.f5344g.keySet()) {
            C1742a aVar = (C1742a) e.f5344g.get(str);
            if (aVar.mo4852g()) {
                this.f5127q.put(str, aVar);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            f2 = this.f5115e + 90.0f;
            this.f5115e = f2;
            if (f2 > 180.0f) {
                f3 = -360.0f;
                this.f5115e = f2 + f3;
            }
            return;
        }
        f2 = this.f5115e;
        f3 = -90.0f;
        this.f5115e = f2 + f3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        float f = ((C1731p) obj).f5128r;
        return Float.compare(0.0f, 0.0f);
    }
}
