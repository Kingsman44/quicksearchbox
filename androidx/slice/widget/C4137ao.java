package androidx.slice.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.slice.SliceItem;
import androidx.slice.p195b.C4103a;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.slice.widget.ao */
/* compiled from: PG */
public final class C4137ao {

    /* renamed from: A */
    private final int f13283A;

    /* renamed from: B */
    private final int f13284B;

    /* renamed from: C */
    private final int f13285C;

    /* renamed from: D */
    private final int f13286D;

    /* renamed from: E */
    private final int f13287E;

    /* renamed from: F */
    private final int f13288F;

    /* renamed from: G */
    private final int f13289G;

    /* renamed from: H */
    private final int f13290H;

    /* renamed from: I */
    private final boolean f13291I;

    /* renamed from: J */
    private final int f13292J;

    /* renamed from: K */
    private final SparseArray f13293K = new SparseArray();

    /* renamed from: L */
    private final Context f13294L;

    /* renamed from: a */
    public int f13295a = -1;

    /* renamed from: b */
    public final int f13296b;

    /* renamed from: c */
    public final int f13297c;

    /* renamed from: d */
    public final int f13298d;

    /* renamed from: e */
    public final int f13299e;

    /* renamed from: f */
    public final int f13300f;

    /* renamed from: g */
    public final int f13301g;

    /* renamed from: h */
    public final int f13302h;

    /* renamed from: i */
    public final int f13303i;

    /* renamed from: j */
    public final int f13304j;

    /* renamed from: k */
    public final int f13305k;

    /* renamed from: l */
    public final int f13306l;

    /* renamed from: m */
    public final int f13307m;

    /* renamed from: n */
    public final int f13308n;

    /* renamed from: o */
    public final int f13309o;

    /* renamed from: p */
    public final int f13310p;

    /* renamed from: q */
    public final int f13311q;

    /* renamed from: r */
    public final boolean f13312r;

    /* renamed from: s */
    public final float f13313s;

    /* renamed from: t */
    private final int f13314t;

    /* renamed from: u */
    private final int f13315u;

    /* renamed from: v */
    private final int f13316v;

    /* renamed from: w */
    private final int f13317w;

    /* renamed from: x */
    private final int f13318x;

    /* renamed from: y */
    private final int f13319y;

    /* renamed from: z */
    private final int f13320z;

    /* JADX INFO: finally extract failed */
    public C4137ao(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C4103a.f13133b, i, i2);
        try {
            int color = obtainStyledAttributes.getColor(20, -1);
            this.f13295a = color == -1 ? this.f13295a : color;
            this.f13296b = obtainStyledAttributes.getColor(21, 0);
            this.f13297c = obtainStyledAttributes.getColor(17, 0);
            this.f13298d = (int) obtainStyledAttributes.getDimension(8, 0.0f);
            this.f13299e = (int) obtainStyledAttributes.getDimension(6, 0.0f);
            this.f13300f = (int) obtainStyledAttributes.getDimension(7, 0.0f);
            this.f13301g = (int) obtainStyledAttributes.getDimension(22, 0.0f);
            this.f13302h = (int) obtainStyledAttributes.getDimension(18, 0.0f);
            this.f13303i = (int) obtainStyledAttributes.getDimension(19, 0.0f);
            this.f13304j = (int) obtainStyledAttributes.getDimension(4, 0.0f);
            this.f13305k = (int) obtainStyledAttributes.getDimension(2, 0.0f);
            this.f13306l = (int) obtainStyledAttributes.getDimension(3, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_slice_grid_text_inner_padding));
            this.f13307m = (int) obtainStyledAttributes.getDimension(5, 0.0f);
            this.f13308n = (int) obtainStyledAttributes.getDimension(1, 0.0f);
            this.f13292J = obtainStyledAttributes.getResourceId(16, 0);
            this.f13316v = (int) obtainStyledAttributes.getDimension(13, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_slice_row_min_height));
            this.f13309o = (int) obtainStyledAttributes.getDimension(12, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_slice_row_max_height));
            this.f13310p = (int) obtainStyledAttributes.getDimension(14, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_slice_row_range_height));
            this.f13315u = (int) obtainStyledAttributes.getDimension(15, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_slice_row_range_single_text_height));
            this.f13319y = (int) obtainStyledAttributes.getDimension(11, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_slice_row_range_inline_height));
            this.f13312r = obtainStyledAttributes.getBoolean(0, false);
            this.f13291I = obtainStyledAttributes.getBoolean(9, false);
            this.f13294L = context;
            this.f13313s = obtainStyledAttributes.getDimension(10, 0.0f);
            obtainStyledAttributes.recycle();
            Resources resources = context.getResources();
            this.f13314t = resources.getDimensionPixelSize(R.dimen.abc_slice_row_range_multi_text_height);
            this.f13311q = resources.getDimensionPixelSize(R.dimen.abc_slice_row_selection_height);
            this.f13317w = resources.getDimensionPixelSize(R.dimen.abc_slice_row_selection_multi_text_height);
            this.f13318x = resources.getDimensionPixelSize(R.dimen.abc_slice_row_selection_single_text_height);
            this.f13320z = resources.getDimensionPixelSize(R.dimen.abc_slice_big_pic_min_height);
            this.f13283A = resources.getDimensionPixelSize(R.dimen.abc_slice_big_pic_max_height);
            this.f13284B = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_only_height);
            this.f13285C = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_text_height);
            this.f13286D = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_raw_image_text_offset);
            this.f13288F = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_min_height);
            this.f13287E = resources.getDimensionPixelSize(R.dimen.abc_slice_grid_max_height);
            this.f13289G = resources.getDimensionPixelSize(R.dimen.abc_slice_row_min_height);
            this.f13290H = resources.getDimensionPixelSize(R.dimen.abc_slice_large_height);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8715a(androidx.slice.widget.C4149e r8, androidx.slice.widget.C4143au r9) {
        /*
            r7 = this;
            int r9 = r9.f13326d
            boolean r0 = r8.mo8711d()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            int r0 = r8.f13361f
            boolean r2 = r8.f13356a
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L_0x0034
            java.util.ArrayList r2 = r8.f13358c
            int r2 = r2.size()
            if (r2 != r4) goto L_0x0021
            if (r9 != r4) goto L_0x001e
            int r9 = r7.f13320z
            goto L_0x0067
        L_0x001e:
            int r9 = r7.f13283A
            goto L_0x0067
        L_0x0021:
            if (r0 != 0) goto L_0x0026
            int r9 = r7.f13288F
            goto L_0x0067
        L_0x0026:
            if (r0 != r3) goto L_0x0031
            android.content.Context r9 = r7.f13294L
            android.graphics.Point r9 = r8.mo8738b(r9)
            int r9 = r9.y
            goto L_0x0067
        L_0x0031:
            int r9 = r7.f13284B
            goto L_0x0067
        L_0x0034:
            int r2 = r8.f13360e
            boolean r5 = r8.mo8739c()
            if (r0 == 0) goto L_0x0043
            r6 = 5
            if (r0 != r6) goto L_0x0041
            r0 = 5
            goto L_0x0043
        L_0x0041:
            r6 = 0
            goto L_0x0044
        L_0x0043:
            r6 = 1
        L_0x0044:
            if (r0 != r3) goto L_0x0057
            android.content.Context r9 = r7.f13294L
            android.graphics.Point r9 = r8.mo8738b(r9)
            int r9 = r9.y
            if (r2 <= r4) goto L_0x0051
            r4 = 2
        L_0x0051:
            int r0 = r7.f13286D
            int r4 = r4 * r0
            int r9 = r9 + r4
            goto L_0x0067
        L_0x0057:
            if (r2 <= r4) goto L_0x0060
            if (r9 == r4) goto L_0x0060
            if (r5 == 0) goto L_0x0062
            int r9 = r7.f13287E
            goto L_0x0067
        L_0x0060:
            if (r6 == 0) goto L_0x0065
        L_0x0062:
            int r9 = r7.f13288F
            goto L_0x0067
        L_0x0065:
            int r9 = r7.f13285C
        L_0x0067:
            boolean r0 = r8.f13356a
            if (r0 == 0) goto L_0x0072
            int r2 = r8.f13272q
            if (r2 != 0) goto L_0x0072
            int r2 = r7.f13307m
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x007b
            boolean r8 = r8.f13362g
            if (r8 == 0) goto L_0x007b
            int r1 = r7.f13308n
        L_0x007b:
            int r9 = r9 + r2
            int r9 = r9 + r1
            return r9
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4137ao.mo8715a(androidx.slice.widget.e, androidx.slice.widget.au):int");
    }

    /* renamed from: b */
    public final int mo8716b(C4154j jVar, C4143au auVar) {
        int i;
        if (auVar.f13326d == 1) {
            return mo8718d(jVar.f13378a, auVar);
        }
        int i2 = auVar.f13323a;
        boolean z = auVar.f13325c;
        int c = mo8717c(jVar.f13380c, auVar);
        if (i2 > 0) {
            i2 = Math.max(mo8718d(jVar.f13378a, auVar), i2);
        }
        if (i2 > 0) {
            i = i2;
        } else {
            i = this.f13290H;
        }
        if (c - i >= this.f13289G && !this.f13312r) {
            c = i;
        } else if (i2 > 0) {
            c = Math.min(i, c);
        }
        return !z ? mo8717c(mo8719e(jVar, c, auVar).f13336a, auVar) : c;
    }

    /* renamed from: c */
    public final int mo8717c(List list, C4143au auVar) {
        if (list == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            C4130ah ahVar = (C4130ah) list.get(i);
            if (i == 0) {
                if (mo8721g(list)) {
                    i = 0;
                    i++;
                } else {
                    i = 0;
                }
            }
            i2 += ahVar.mo8710a(this, auVar);
            i++;
        }
        return i2;
    }

    /* renamed from: d */
    public final int mo8718d(C4160p pVar, C4143au auVar) {
        int i;
        int i2;
        int i3 = auVar.f13324b;
        if (i3 <= 0) {
            i3 = this.f13309o;
        }
        SliceItem sliceItem = pVar.f13394f;
        if (sliceItem == null && pVar.f13395g == null && auVar.f13326d != 2) {
            return i3;
        }
        if (sliceItem != null) {
            if (pVar.mo8750c() != null) {
                return this.f13319y;
            }
            int i4 = pVar.f13397i;
            i = i4 == 0 ? 0 : i4 > 1 ? this.f13314t : this.f13315u;
            i2 = this.f13310p;
        } else if (pVar.f13395g == null) {
            return (pVar.f13397i > 1 || pVar.f13396h) ? i3 : this.f13316v;
        } else {
            i = pVar.f13397i > 1 ? this.f13317w : this.f13318x;
            i2 = this.f13311q;
        }
        return i + i2;
    }

    /* renamed from: e */
    public final C4146b mo8719e(C4154j jVar, int i, C4143au auVar) {
        int i2;
        int i3;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = jVar.f13380c;
        if (arrayList2 == null || arrayList2.size() == 0) {
            return new C4146b(arrayList);
        }
        boolean g = mo8721g(jVar.f13380c);
        int size = jVar.f13380c.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= size) {
                i3 = 0;
                break;
            }
            C4130ah ahVar = (C4130ah) jVar.f13380c.get(i4);
            if (i4 == 0) {
                i4 = 0;
                if (g) {
                    continue;
                    i4++;
                } else {
                    z = false;
                }
            } else {
                z = g;
            }
            int a = ahVar.mo8710a(this, auVar);
            if (i > 0 && i5 + a > i) {
                i3 = size - i4;
                g = z;
                break;
            }
            i5 += a;
            arrayList.add(ahVar);
            i4++;
        }
        if (true != g) {
            i2 = 2;
        }
        if (jVar.f13379b != null && arrayList.size() >= i2 && i3 > 0) {
            int d = i5 + mo8718d(jVar.f13379b, auVar);
            while (d > i && arrayList.size() >= i2) {
                int size2 = arrayList.size() - 1;
                d -= ((C4130ah) arrayList.get(size2)).mo8710a(this, auVar);
                arrayList.remove(size2);
            }
            if (arrayList.size() >= i2) {
                arrayList.add(jVar.f13379b);
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add((C4130ah) jVar.f13380c.get(0));
        }
        return new C4146b(arrayList);
    }

    /* renamed from: f */
    public final boolean mo8720f() {
        return this.f13313s > 0.0f;
    }

    /* renamed from: g */
    public final boolean mo8721g(List list) {
        return this.f13291I && list.size() > 1 && (list.get(0) instanceof C4160p) && ((C4160p) list.get(0)).f13396h;
    }

    /* renamed from: h */
    public final C4161q mo8722h() {
        int i = this.f13292J;
        if (i == 0) {
            return new C4161q(this.f13294L, this);
        }
        C4161q qVar = (C4161q) this.f13293K.get(i);
        if (qVar != null) {
            return qVar;
        }
        C4161q qVar2 = new C4161q(this.f13294L, i, this);
        this.f13293K.put(i, qVar2);
        return qVar2;
    }
}
