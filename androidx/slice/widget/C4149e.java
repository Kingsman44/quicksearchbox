package androidx.slice.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import java.util.ArrayList;

/* renamed from: androidx.slice.widget.e */
/* compiled from: PG */
public final class C4149e extends C4130ah {

    /* renamed from: a */
    public boolean f13356a;

    /* renamed from: b */
    public SliceItem f13357b;

    /* renamed from: c */
    public final ArrayList f13358c = new ArrayList();

    /* renamed from: d */
    public SliceItem f13359d;

    /* renamed from: e */
    public int f13360e;

    /* renamed from: f */
    public int f13361f = 5;

    /* renamed from: g */
    public boolean f13362g;

    /* renamed from: h */
    private IconCompat f13363h = null;

    /* renamed from: i */
    private Point f13364i = null;

    /* renamed from: j */
    private SliceItem f13365j;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4149e(androidx.slice.SliceItem r14, int r15) {
        /*
            r13 = this;
            r13.<init>(r14, r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r13.f13358c = r15
            r15 = 5
            r13.f13361f = r15
            r0 = 0
            r13.f13363h = r0
            r13.f13364i = r0
            java.lang.String r1 = "see_more"
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11759l(r14, r0, r1)
            r13.f13359d = r2
            java.lang.String r3 = "slice"
            r4 = 0
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r2.f13092b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0043
            androidx.slice.SliceItem r2 = r13.f13359d
            androidx.slice.Slice r2 = r2.mo8596d()
            androidx.slice.SliceItem[] r2 = r2.f13088d
            java.util.List r2 = java.util.Arrays.asList(r2)
            if (r2 == 0) goto L_0x0043
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x0043
            java.lang.Object r2 = r2.get(r4)
            androidx.slice.SliceItem r2 = (androidx.slice.SliceItem) r2
            r13.f13359d = r2
        L_0x0043:
            r2 = 2
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r6 = "shortcut"
            r5[r4] = r6
            java.lang.String r7 = "title"
            r8 = 1
            r5[r8] = r7
            java.lang.String[] r7 = new java.lang.String[r8]
            java.lang.String r9 = "actions"
            r7[r4] = r9
            androidx.slice.SliceItem r5 = androidx.slice.p194a.C4101h.m11749b(r14, r3, r5, r7)
            r13.f13357b = r5
            r13.f13356a = r8
            java.lang.String r5 = r14.f13092b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00de
            androidx.slice.Slice r14 = r14.mo8596d()
            androidx.slice.SliceItem[] r14 = r14.f13088d
            java.util.List r14 = java.util.Arrays.asList(r14)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
        L_0x0075:
            int r7 = r14.size()
            java.lang.String r9 = "content_description"
            if (r5 >= r7) goto L_0x00bf
            java.lang.Object r7 = r14.get(r5)
            androidx.slice.SliceItem r7 = (androidx.slice.SliceItem) r7
            androidx.slice.SliceItem r10 = androidx.slice.p194a.C4101h.m11759l(r7, r0, r1)
            if (r10 == 0) goto L_0x008b
        L_0x0089:
            r10 = 1
            goto L_0x00ac
        L_0x008b:
            r10 = 6
            java.lang.String[] r10 = new java.lang.String[r10]
            r10[r4] = r6
            r10[r8] = r1
            java.lang.String r11 = "keywords"
            r10[r2] = r11
            r11 = 3
            java.lang.String r12 = "ttl"
            r10[r11] = r12
            r11 = 4
            java.lang.String r12 = "last_updated"
            r10[r11] = r12
            java.lang.String r11 = "overlay"
            r10[r15] = r11
            boolean r10 = r7.mo8600h(r10)
            if (r10 == 0) goto L_0x00ab
            goto L_0x0089
        L_0x00ab:
            r10 = 0
        L_0x00ac:
            java.lang.String r11 = r7.f13093c
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x00b7
            r13.f13271p = r7
            goto L_0x00bc
        L_0x00b7:
            if (r10 != 0) goto L_0x00bc
            r3.add(r7)
        L_0x00bc:
            int r5 = r5 + 1
            goto L_0x0075
        L_0x00bf:
            int r14 = r3.size()
            if (r4 >= r14) goto L_0x00e6
            java.lang.Object r14 = r3.get(r4)
            androidx.slice.SliceItem r14 = (androidx.slice.SliceItem) r14
            java.lang.String r15 = r14.f13093c
            boolean r15 = r9.equals(r15)
            if (r15 != 0) goto L_0x00db
            androidx.slice.widget.d r15 = new androidx.slice.widget.d
            r15.<init>(r14)
            r13.m11909e(r15)
        L_0x00db:
            int r4 = r4 + 1
            goto L_0x00bf
        L_0x00de:
            androidx.slice.widget.d r15 = new androidx.slice.widget.d
            r15.<init>(r14)
            r13.m11909e(r15)
        L_0x00e6:
            r13.mo8711d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4149e.<init>(androidx.slice.SliceItem, int):void");
    }

    /* renamed from: e */
    private final void m11909e(C4148d dVar) {
        IconCompat iconCompat;
        SliceItem sliceItem;
        if (dVar.mo8737a()) {
            if (this.f13365j == null && (sliceItem = dVar.f13353i) != null) {
                this.f13365j = sliceItem;
            }
            this.f13358c.add(dVar);
            if (dVar.f13347c.size() != 1 || !"image".equals(((SliceItem) dVar.f13347c.get(0)).f13092b)) {
                this.f13356a = false;
            }
            this.f13360e = Math.max(this.f13360e, dVar.f13349e);
            if (this.f13363h == null && (iconCompat = dVar.f13350f) != null) {
                this.f13363h = iconCompat;
            }
            int i = this.f13361f;
            int i2 = dVar.f13352h;
            if (i != 5) {
                i2 = Math.max(i, i2);
            }
            this.f13361f = i2;
        }
    }

    /* renamed from: a */
    public final int mo8710a(C4137ao aoVar, C4143au auVar) {
        return aoVar.mo8715a(this, auVar);
    }

    /* renamed from: b */
    public final Point mo8738b(Context context) {
        IconCompat iconCompat = this.f13363h;
        if (iconCompat == null) {
            return new Point(-1, -1);
        }
        if (this.f13364i == null) {
            Drawable d = iconCompat.mo5075d(context);
            this.f13364i = new Point(d.getIntrinsicWidth(), d.getIntrinsicHeight());
        }
        return this.f13364i;
    }

    /* renamed from: c */
    public final boolean mo8739c() {
        return this.f13363h != null;
    }

    /* renamed from: d */
    public final boolean mo8711d() {
        return super.mo8711d() && this.f13358c.size() > 0;
    }
}
