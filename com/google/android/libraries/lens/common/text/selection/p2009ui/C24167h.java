package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.libraries.lens.common.p1998a.C24098f;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24151a;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24152b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.h */
/* compiled from: PG */
public final class C24167h {

    /* renamed from: c */
    private static final Comparator f66034c = new C24164e();

    /* renamed from: d */
    private static final Comparator f66035d = new C24165f();

    /* renamed from: e */
    private static final Comparator f66036e = new C24166g();

    /* renamed from: a */
    public final C24146d f66037a;

    /* renamed from: b */
    public float f66038b = -1.0f;

    /* renamed from: f */
    private final Point f66039f;

    /* renamed from: g */
    private float f66040g = -1.0f;

    /* renamed from: h */
    private float f66041h = -1.0f;

    /* renamed from: i */
    private float f66042i = -1.0f;

    /* renamed from: j */
    private Rect f66043j;

    static {
        C58974d.m91135i("Hit");
    }

    public C24167h(C24146d dVar, Point point) {
        this.f66037a = dVar;
        this.f66039f = point;
    }

    /* renamed from: d */
    static Point m44913d(C24146d dVar, int i, int i2) {
        return m44918j(-dVar.mo29548a(), dVar.mo29552e().exactCenterX(), dVar.mo29552e().exactCenterY(), i, i2);
    }

    /* renamed from: f */
    public static C24167h m44914f(SparseArray sparseArray, int i, int i2) {
        if (sparseArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            C24146d dVar = (C24146d) sparseArray.valueAt(i3);
            Point d = m44913d(dVar, i, i2);
            Rect rect = new Rect();
            m44915g(dVar, rect);
            C24167h hVar = rect.contains(d.x, d.y) ? new C24167h(dVar, d) : null;
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        m44919k(arrayList);
        return (C24167h) arrayList.get(0);
    }

    /* renamed from: g */
    public static void m44915g(C24146d dVar, Rect rect) {
        rect.set(dVar.mo29552e());
        rect.inset(-15, -15);
    }

    /* renamed from: h */
    public static boolean m44916h(C24146d dVar, int i, int i2, SparseArray sparseArray) {
        Point d = m44913d(dVar, i, i2);
        Rect e = dVar.mo29552e();
        e.sort();
        Point j = m44918j(dVar.mo29548a(), dVar.mo29552e().exactCenterX(), dVar.mo29552e().exactCenterY(), C60757n.m92742c(d.x, e.left, e.right), C60757n.m92742c(d.y, e.top, e.bottom));
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            C24146d dVar2 = (C24146d) sparseArray.get(i3);
            if (dVar != dVar2) {
                Rect rect = new Rect(dVar2.mo29552e());
                rect.inset(1, 1);
                if (rect.width() > 0 && rect.height() > 0) {
                    PointF pointF = new PointF(m44913d(dVar2, i, i2));
                    PointF pointF2 = new PointF(m44913d(dVar2, j.x, j.y));
                    PointF[] pointFArr = {new PointF((float) rect.left, (float) rect.top), new PointF((float) rect.right, (float) rect.top), new PointF((float) rect.right, (float) rect.bottom), new PointF((float) rect.left, (float) rect.bottom)};
                    int i4 = 0;
                    while (i4 < 4) {
                        int i5 = i4 + 1;
                        if (C24098f.m44769a(pointFArr[i4], pointFArr[i5 % 4], pointF, pointF2)) {
                            return true;
                        }
                        i4 = i5;
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.google.android.libraries.lens.common.text.selection.a.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h m44917i(android.util.SparseArray r16, int r17, int r18, int r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r16.size()
            r5 = 0
            if (r4 == 0) goto L_0x01cf
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = 0
        L_0x0015:
            int r8 = r16.size()
            r9 = -1
            r10 = 2
            r11 = 3
            r12 = 1
            if (r7 >= r8) goto L_0x0081
            java.lang.Object r8 = r0.valueAt(r7)
            com.google.android.libraries.lens.common.text.selection.a.d r8 = (com.google.android.libraries.lens.common.text.selection.p2006a.C24146d) r8
            android.graphics.Point r13 = m44913d(r8, r1, r2)
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            m44915g(r8, r14)
            int r15 = r13.x
            int r6 = r13.y
            boolean r6 = r14.contains(r15, r6)
            if (r6 == 0) goto L_0x0041
            com.google.android.libraries.lens.common.text.selection.ui.h r6 = new com.google.android.libraries.lens.common.text.selection.ui.h
            r6.<init>(r8, r13)
            goto L_0x0078
        L_0x0041:
            int r6 = r8.mo29558i()
            int r15 = r6 + -2
            if (r6 == 0) goto L_0x0080
            if (r15 == r9) goto L_0x0061
            if (r15 == 0) goto L_0x0061
            if (r15 == r12) goto L_0x0061
            if (r15 == r10) goto L_0x0053
        L_0x0051:
            r6 = r5
            goto L_0x0078
        L_0x0053:
            boolean r6 = m44921m(r13, r14, r11)
            if (r6 != 0) goto L_0x006d
            r6 = 4
            boolean r6 = m44921m(r13, r14, r6)
            if (r6 != 0) goto L_0x006d
            goto L_0x0051
        L_0x0061:
            boolean r6 = m44921m(r13, r14, r12)
            if (r6 != 0) goto L_0x006d
            boolean r6 = m44921m(r13, r14, r10)
            if (r6 == 0) goto L_0x0051
        L_0x006d:
            boolean r6 = m44916h(r8, r1, r2, r0)
            if (r6 != 0) goto L_0x0051
            com.google.android.libraries.lens.common.text.selection.ui.h r6 = new com.google.android.libraries.lens.common.text.selection.ui.h
            r6.<init>(r8, r13)
        L_0x0078:
            if (r6 == 0) goto L_0x007d
            r4.add(r6)
        L_0x007d:
            int r7 = r7 + 1
            goto L_0x0015
        L_0x0080:
            throw r5
        L_0x0081:
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0095
            m44919k(r4)
            r6 = 0
            r4.get(r6)
            java.lang.Object r4 = r4.get(r6)
            com.google.android.libraries.lens.common.text.selection.ui.h r4 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r4
            goto L_0x0096
        L_0x0095:
            r4 = r5
        L_0x0096:
            if (r4 == 0) goto L_0x0119
            if (r3 == r10) goto L_0x009d
            if (r3 != r11) goto L_0x0118
            r3 = 3
        L_0x009d:
            com.google.android.libraries.lens.common.text.selection.a.d r5 = r4.f66037a
            android.graphics.Point r1 = m44913d(r5, r1, r2)
            android.graphics.Rect r2 = new android.graphics.Rect
            android.graphics.Rect r5 = r4.mo29607e()
            r2.<init>(r5)
            if (r3 != r11) goto L_0x00b9
            com.google.android.libraries.lens.common.text.selection.a.d r5 = r4.f66037a
            int r5 = r5.mo29558i()
            int r5 = m44922n(r5)
            goto L_0x00c7
        L_0x00b9:
            com.google.android.libraries.lens.common.text.selection.a.d r5 = r4.f66037a
            int r5 = r5.mo29558i()
            int r5 = m44922n(r5)
            int r5 = m44920l(r5)
        L_0x00c7:
            if (r3 != r11) goto L_0x00ca
            r10 = 1
        L_0x00ca:
            boolean r3 = m44921m(r1, r2, r5)
            if (r3 == 0) goto L_0x00d1
            goto L_0x0118
        L_0x00d1:
            com.google.android.libraries.lens.common.text.selection.a.d r3 = r4.f66037a
            int r6 = r0.indexOfValue(r3)
            if (r6 >= 0) goto L_0x00da
            goto L_0x00f0
        L_0x00da:
            int r10 = r10 + r9
            if (r10 == r12) goto L_0x00df
            int r6 = r6 + r9
            goto L_0x00e0
        L_0x00df:
            int r6 = r6 + r12
        L_0x00e0:
            if (r6 < 0) goto L_0x00f0
            int r7 = r16.size()
            if (r6 < r7) goto L_0x00e9
            goto L_0x00f0
        L_0x00e9:
            java.lang.Object r0 = r0.valueAt(r6)
            r3 = r0
            com.google.android.libraries.lens.common.text.selection.a.d r3 = (com.google.android.libraries.lens.common.text.selection.p2006a.C24146d) r3
        L_0x00f0:
            com.google.android.libraries.lens.common.text.selection.a.d r0 = r4.f66037a
            if (r3 == r0) goto L_0x0118
            android.graphics.Rect r6 = r3.mo29552e()
            int r6 = r6.centerX()
            android.graphics.Rect r7 = r3.mo29552e()
            int r7 = r7.centerY()
            android.graphics.Point r0 = m44913d(r0, r6, r7)
            int r5 = m44920l(r5)
            boolean r0 = m44921m(r0, r2, r5)
            if (r0 == 0) goto L_0x0118
            com.google.android.libraries.lens.common.text.selection.ui.h r0 = new com.google.android.libraries.lens.common.text.selection.ui.h
            r0.<init>(r3, r1)
            return r0
        L_0x0118:
            return r4
        L_0x0119:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L_0x011f:
            int r6 = r16.size()
            if (r4 >= r6) goto L_0x013a
            java.lang.Object r6 = r0.valueAt(r4)
            com.google.android.libraries.lens.common.text.selection.a.d r6 = (com.google.android.libraries.lens.common.text.selection.p2006a.C24146d) r6
            android.graphics.Point r7 = m44913d(r6, r1, r2)
            com.google.android.libraries.lens.common.text.selection.ui.h r8 = new com.google.android.libraries.lens.common.text.selection.ui.h
            r8.<init>(r6, r7)
            r3.add(r8)
            int r4 = r4 + 1
            goto L_0x011f
        L_0x013a:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0142
            goto L_0x01cf
        L_0x0142:
            int r4 = r3.size()
            if (r4 != r12) goto L_0x0152
            r4 = 0
            java.lang.Object r0 = r3.get(r4)
            r5 = r0
            com.google.android.libraries.lens.common.text.selection.ui.h r5 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r5
            goto L_0x01cf
        L_0x0152:
            r4 = 0
            java.util.Comparator r6 = f66036e
            java.util.Collections.sort(r3, r6)
        L_0x0158:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L_0x0170
            java.lang.Object r6 = r3.get(r4)
            com.google.android.libraries.lens.common.text.selection.ui.h r6 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r6
            com.google.android.libraries.lens.common.text.selection.a.d r6 = r6.f66037a
            boolean r6 = m44916h(r6, r1, r2, r0)
            if (r6 == 0) goto L_0x0170
            r3.remove(r4)
            goto L_0x0158
        L_0x0170:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x0177
            goto L_0x01cf
        L_0x0177:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r6 = r3.get(r4)
            com.google.android.libraries.lens.common.text.selection.ui.h r6 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r6
            r5.add(r6)
        L_0x0185:
            int r6 = r3.size()
            if (r12 >= r6) goto L_0x01c1
            java.lang.Object r6 = r3.get(r12)
            com.google.android.libraries.lens.common.text.selection.ui.h r6 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r6
            float r6 = r6.mo29605b()
            java.lang.Object r7 = r3.get(r4)
            com.google.android.libraries.lens.common.text.selection.ui.h r7 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r7
            float r4 = r7.mo29605b()
            float r6 = r6 - r4
            r4 = 1097859072(0x41700000, float:15.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x01bd
            java.lang.Object r4 = r3.get(r12)
            com.google.android.libraries.lens.common.text.selection.ui.h r4 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r4
            com.google.android.libraries.lens.common.text.selection.a.d r4 = r4.f66037a
            boolean r4 = m44916h(r4, r1, r2, r0)
            if (r4 != 0) goto L_0x01bd
            java.lang.Object r4 = r3.get(r12)
            com.google.android.libraries.lens.common.text.selection.ui.h r4 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r4
            r5.add(r4)
        L_0x01bd:
            int r12 = r12 + 1
            r4 = 0
            goto L_0x0185
        L_0x01c1:
            m44919k(r5)
            r0 = 0
            r5.get(r0)
            java.lang.Object r0 = r5.get(r0)
            r5 = r0
            com.google.android.libraries.lens.common.text.selection.ui.h r5 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h) r5
        L_0x01cf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.common.text.selection.p2009ui.C24167h.m44917i(android.util.SparseArray, int, int, int):com.google.android.libraries.lens.common.text.selection.ui.h");
    }

    /* renamed from: j */
    private static Point m44918j(float f, float f2, float f3, int i, int i2) {
        if (C24151a.m44878b(f, 0.0f)) {
            return new Point(i, i2);
        }
        Matrix matrix = new Matrix();
        matrix.setTranslate(-f2, -f3);
        matrix.postRotate(f);
        matrix.postTranslate(f2, f3);
        float[] fArr = {(float) i, (float) i2};
        matrix.mapPoints(fArr);
        return new Point(Math.round(fArr[0]), Math.round(fArr[1]));
    }

    /* renamed from: k */
    private static void m44919k(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, f66034c);
            int size = arrayList.size() - 1;
            while (size >= 0) {
                C24167h hVar = (C24167h) arrayList.get(size);
                if (hVar.f66038b == -1.0f) {
                    hVar.f66038b = 0.0f;
                }
                size--;
                for (int i = size; i >= 0; i--) {
                    C24167h hVar2 = (C24167h) arrayList.get(i);
                    if (hVar.mo29607e().contains(hVar2.mo29607e())) {
                        float f = hVar2.f66038b;
                        float f2 = hVar.f66038b;
                        if (f <= f2) {
                            hVar2.f66038b = f2 + 1.0f;
                        }
                    }
                }
            }
            Collections.sort(arrayList, f66035d);
        }
    }

    /* renamed from: l */
    private static int m44920l(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 2;
        }
        if (i2 != 1) {
            return i2 != 2 ? 3 : 4;
        }
        return 1;
    }

    /* renamed from: m */
    private static boolean m44921m(Point point, Rect rect, int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? point.x > rect.left && point.x < rect.right && point.y >= rect.centerY() : point.x > rect.left && point.x < rect.right && point.y <= rect.centerY() : point.y > rect.top && point.y < rect.bottom && point.x >= rect.centerX() : point.y > rect.top && point.y < rect.bottom && point.x <= rect.centerX();
    }

    /* renamed from: n */
    private static int m44922n(int i) {
        int i2 = i - 2;
        if (i == 0) {
            throw null;
        } else if (i2 == -1 || i2 == 0) {
            return 2;
        } else {
            return i2 != 2 ? 1 : 4;
        }
    }

    /* renamed from: a */
    public final float mo29604a() {
        float f = this.f66042i;
        if (f != -1.0f) {
            return f;
        }
        Rect e = mo29607e();
        float width = (float) (e.width() * e.height());
        this.f66042i = width;
        return width;
    }

    /* renamed from: b */
    public final float mo29605b() {
        float f = this.f66041h;
        if (f != -1.0f) {
            return f;
        }
        Rect e = this.f66037a.mo29552e();
        float max = Math.max(Math.abs(e.exactCenterX() - ((float) this.f66039f.x)) - (((float) e.width()) / 2.0f), 0.0f);
        float max2 = Math.max(Math.abs(e.exactCenterY() - ((float) this.f66039f.y)) - (((float) e.height()) / 2.0f), 0.0f);
        if (true != C24152b.m44879a(this.f66037a.mo29558i())) {
            max = max2;
        }
        this.f66041h = max;
        return max;
    }

    /* renamed from: c */
    public final float mo29606c() {
        float f = this.f66040g;
        if (f != -1.0f) {
            return f;
        }
        Rect e = this.f66037a.mo29552e();
        float max = Math.max(Math.abs(e.exactCenterX() - ((float) this.f66039f.x)) - (((float) e.width()) / 2.0f), 0.0f);
        float max2 = Math.max(Math.abs(e.exactCenterY() - ((float) this.f66039f.y)) - (((float) e.height()) / 2.0f), 0.0f);
        float f2 = (max * max) + (max2 * max2);
        this.f66040g = f2;
        return f2;
    }

    /* renamed from: e */
    public final Rect mo29607e() {
        if (this.f66043j == null) {
            Rect rect = new Rect();
            this.f66043j = rect;
            m44915g(this.f66037a, rect);
        }
        return this.f66043j;
    }

    public final String toString() {
        String g = this.f66037a.mo29555g();
        float c = mo29606c();
        float f = this.f66038b;
        float a = mo29604a();
        return "text: " + g + ", distance squared: " + c + ", z: " + f + ", area: " + a;
    }
}
