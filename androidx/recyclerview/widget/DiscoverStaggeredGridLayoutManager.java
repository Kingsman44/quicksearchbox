package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0626eo;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0651fm;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0668gc;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public abstract class DiscoverStaggeredGridLayoutManager extends C0653fo implements C0668gc {

    /* renamed from: a */
    public static final int[] f12950a = {-1};

    /* renamed from: b */
    public int f12951b = -1;

    /* renamed from: c */
    public C4078p[] f12952c;

    /* renamed from: d */
    C0626eo f12953d;

    /* renamed from: e */
    C0626eo f12954e;

    /* renamed from: f */
    public int f12955f;

    /* renamed from: g */
    public boolean f12956g = false;

    /* renamed from: h */
    boolean f12957h = false;

    /* renamed from: i */
    public int f12958i = -1;

    /* renamed from: j */
    public int f12959j = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: k */
    public LazySpanLookup f12960k = new LazySpanLookup();

    /* renamed from: l */
    public SavedState f12961l;

    /* renamed from: m */
    public final C4074l f12962m = new C4074l(this);

    /* renamed from: n */
    private int f12963n = -1;

    /* renamed from: o */
    private int f12964o = -1;

    /* renamed from: p */
    private int f12965p;

    /* renamed from: q */
    private final C4079q f12966q;

    /* renamed from: r */
    private BitSet f12967r;

    /* renamed from: s */
    private boolean f12968s;

    /* renamed from: t */
    private boolean f12969t;

    /* renamed from: u */
    private int f12970u;

    /* renamed from: v */
    private final Rect f12971v = new Rect();

    /* renamed from: w */
    private boolean f12972w = false;

    /* renamed from: x */
    private boolean f12973x = true;

    /* renamed from: y */
    private int[] f12974y;

    /* renamed from: z */
    private final int f12975z;

    /* compiled from: PG */
    public final class LazySpanLookup {

        /* renamed from: a */
        public Map f12976a = new HashMap();

        /* renamed from: b */
        List f12977b;

        /* compiled from: PG */
        class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator CREATOR = new C4076n();

            /* renamed from: a */
            int f12978a;

            /* renamed from: b */
            int f12979b;

            /* renamed from: c */
            int[] f12980c;

            /* renamed from: d */
            boolean f12981d;

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.f12978a = parcel.readInt();
                this.f12979b = parcel.readInt();
                this.f12981d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f12980c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final int mo8525a(int i) {
                int[] iArr = this.f12980c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                int i = this.f12978a;
                int i2 = this.f12979b;
                boolean z = this.f12981d;
                String arrays = Arrays.toString(this.f12980c);
                return "FullSpanItem{mPosition=" + i + ", mGapDir=" + i2 + ", mHasUnwantedGapAfter=" + z + ", mGapPerSpan=" + arrays + "}";
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int length;
                parcel.writeInt(this.f12978a);
                parcel.writeInt(this.f12979b);
                parcel.writeInt(this.f12981d ? 1 : 0);
                int[] iArr = this.f12980c;
                if (iArr == null || (length = iArr.length) <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(length);
                parcel.writeIntArray(this.f12980c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo8521a(String str) {
            if (str == null || !this.f12976a.containsKey(str)) {
                return -1;
            }
            return ((Integer) this.f12976a.get(str)).intValue();
        }

        /* renamed from: b */
        public final FullSpanItem mo8522b(int i) {
            FullSpanItem fullSpanItem;
            List list = this.f12977b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            do {
                size--;
                if (size < 0) {
                    return null;
                }
                fullSpanItem = (FullSpanItem) this.f12977b.get(size);
            } while (fullSpanItem.f12978a != i);
            return fullSpanItem;
        }

        /* renamed from: c */
        public final void mo8523c(FullSpanItem fullSpanItem) {
            if (this.f12977b == null) {
                this.f12977b = new ArrayList();
            }
            int size = this.f12977b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f12977b.get(i);
                if (fullSpanItem2.f12978a == fullSpanItem.f12978a) {
                    this.f12977b.remove(i);
                }
                if (fullSpanItem2.f12978a >= fullSpanItem.f12978a) {
                    this.f12977b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f12977b.add(fullSpanItem);
        }

        /* renamed from: d */
        public final void mo8524d() {
            this.f12976a.clear();
            this.f12977b = null;
        }
    }

    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C4077o();

        /* renamed from: a */
        int f12982a;

        /* renamed from: b */
        int f12983b;

        /* renamed from: c */
        int f12984c;

        /* renamed from: d */
        int[] f12985d;

        /* renamed from: e */
        int f12986e;

        /* renamed from: f */
        Map f12987f;

        /* renamed from: g */
        List f12988g;

        /* renamed from: h */
        boolean f12989h;

        /* renamed from: i */
        boolean f12990i;

        /* renamed from: j */
        boolean f12991j;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f12982a = parcel.readInt();
            this.f12983b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f12984c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f12985d = iArr;
                parcel.readIntArray(iArr);
            }
            this.f12986e = parcel.readInt();
            this.f12987f = new HashMap();
            boolean z = false;
            if (this.f12986e > 0) {
                for (int i = 0; i < this.f12986e; i++) {
                    this.f12987f.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
            }
            this.f12989h = parcel.readInt() == 1;
            this.f12990i = parcel.readInt() == 1;
            this.f12991j = parcel.readInt() == 1 ? true : z;
            this.f12988g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f12984c = savedState.f12984c;
            this.f12982a = savedState.f12982a;
            this.f12983b = savedState.f12983b;
            this.f12985d = savedState.f12985d;
            this.f12986e = savedState.f12986e;
            this.f12987f = savedState.f12987f;
            this.f12989h = savedState.f12989h;
            this.f12990i = savedState.f12990i;
            this.f12991j = savedState.f12991j;
            this.f12988g = savedState.f12988g;
        }

        /* renamed from: a */
        public final void mo8529a() {
            this.f12985d = null;
            this.f12984c = 0;
            this.f12982a = -1;
            this.f12983b = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo8530b() {
            this.f12985d = null;
            this.f12984c = 0;
            this.f12986e = 0;
            this.f12987f = null;
            this.f12988g = null;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f12982a);
            parcel.writeInt(this.f12983b);
            parcel.writeInt(this.f12984c);
            if (this.f12984c > 0) {
                parcel.writeIntArray(this.f12985d);
            }
            parcel.writeInt(this.f12986e);
            for (Map.Entry entry : this.f12987f.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeInt(((Integer) entry.getValue()).intValue());
            }
            parcel.writeInt(this.f12989h ? 1 : 0);
            parcel.writeInt(this.f12990i ? 1 : 0);
            parcel.writeInt(this.f12991j ? 1 : 0);
            parcel.writeList(this.f12988g);
        }
    }

    public DiscoverStaggeredGridLayoutManager(int i, int i2, int i3) {
        this.f12963n = i;
        this.f12964o = i2;
        this.f12955f = 1;
        this.f12966q = new C4079q();
        this.f12953d = C0626eo.m2232p(this, 1);
        this.f12954e = C0626eo.m2232p(this, 1 - this.f12955f);
        this.f12975z = i3;
    }

    /* renamed from: A */
    private final void m11619A(C0661fw fwVar, C0670ge geVar, boolean z) {
        int j;
        int y = m11639y(Integer.MAX_VALUE);
        if (y != Integer.MAX_VALUE && (j = y - this.f12953d.mo2847j()) > 0) {
            int c = j - mo8505c(j, fwVar, geVar);
            if (z && c > 0) {
                this.f12953d.mo2851n(-c);
            }
        }
    }

    /* renamed from: B */
    private final void m11620B(int i, int i2, int i3) {
        int i4;
        int b = this.f12957h ? mo8504b() : mo8503a();
        if (i3 != 8) {
            i4 = i2 + i;
        } else if (i < i2) {
            i4 = i2 + 1;
        } else {
            int i5 = i2;
            i4 = i + 1;
            i = i5;
        }
        if (i4 > b) {
            if (i <= (this.f12957h ? mo8503a() : mo8504b())) {
                requestLayout();
            }
        }
    }

    /* renamed from: C */
    private final void m11621C(C0661fw fwVar, C4079q qVar) {
        int i;
        int i2;
        if (qVar.f13059a && !qVar.f13067i) {
            if (qVar.f13060b != 0) {
                int i3 = 1;
                if (qVar.f13063e == -1) {
                    int i4 = qVar.f13064f;
                    int h = this.f12952c[0].mo8562h(i4);
                    while (i3 < this.f12951b) {
                        int h2 = this.f12952c[i3].mo8562h(i4);
                        if (h2 > h) {
                            h = h2;
                        }
                        i3++;
                    }
                    int i5 = i4 - h;
                    if (i5 < 0) {
                        i2 = qVar.f13065g;
                    } else {
                        i2 = qVar.f13065g - Math.min(i5, qVar.f13060b);
                    }
                    m11622D(fwVar, i2);
                    return;
                }
                int i6 = qVar.f13065g;
                int f = this.f12952c[0].mo8560f(i6);
                while (i3 < this.f12951b) {
                    int f2 = this.f12952c[i3].mo8560f(i6);
                    if (f2 < f) {
                        f = f2;
                    }
                    i3++;
                }
                int i7 = f - qVar.f13065g;
                if (i7 < 0) {
                    i = qVar.f13064f;
                } else {
                    i = Math.min(i7, qVar.f13060b) + qVar.f13064f;
                }
                m11623E(fwVar, i);
            } else if (qVar.f13063e == -1) {
                m11622D(fwVar, qVar.f13065g);
            } else {
                m11623E(fwVar, qVar.f13064f);
            }
        }
    }

    /* renamed from: D */
    private final void m11622D(C0661fw fwVar, int i) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (this.f12953d.mo2841d(childAt) >= i && this.f12953d.mo2850m(childAt) >= i) {
                    C4075m mVar = (C4075m) childAt.getLayoutParams();
                    if (mVar.f13052b) {
                        int i2 = 0;
                        while (i2 < this.f12951b) {
                            if (this.f12952c[i2].f13053a.size() != 1) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                        for (int i3 = 0; i3 < this.f12951b; i3++) {
                            this.f12952c[i3].mo8569o();
                        }
                    } else if (mVar.f13051a.f13053a.size() != 1) {
                        mVar.f13051a.mo8569o();
                    } else {
                        return;
                    }
                    removeAndRecycleView(childAt, fwVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    private final void m11623E(C0661fw fwVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f12953d.mo2838a(childAt) <= i && this.f12953d.mo2849l(childAt) <= i) {
                C4075m mVar = (C4075m) childAt.getLayoutParams();
                if (mVar.f13052b) {
                    int i2 = 0;
                    while (i2 < this.f12951b) {
                        if (this.f12952c[i2].f13053a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f12951b; i3++) {
                        this.f12952c[i3].mo8570p();
                    }
                } else if (mVar.f13051a.f13053a.size() != 1) {
                    mVar.f13051a.mo8570p();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, fwVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    private final void m11624F() {
        this.f12957h = (this.f12955f == 1 || !mo8516n()) ? this.f12956g : !this.f12956g;
    }

    /* renamed from: G */
    private final void m11625G(int i) {
        C4079q qVar = this.f12966q;
        qVar.f13063e = i;
        int i2 = 1;
        if (this.f12957h != (i == -1)) {
            i2 = -1;
        }
        qVar.f13062d = i2;
    }

    /* renamed from: H */
    private final void m11626H(int i, int i2) {
        for (int i3 = 0; i3 < this.f12951b; i3++) {
            if (!this.f12952c[i3].f13053a.isEmpty()) {
                m11628J(this.f12952c[i3], i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11627I(int r5, android.support.p033v7.widget.C0670ge r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.q r0 = r4.f12966q
            r1 = 0
            r0.f13060b = r1
            r0.f13061c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L_0x002c
            int r6 = r6.f2456a
            r0 = -1
            if (r6 == r0) goto L_0x002c
            boolean r0 = r4.f12957h
            if (r6 < r5) goto L_0x0019
            r5 = 0
            goto L_0x001a
        L_0x0019:
            r5 = 1
        L_0x001a:
            if (r0 != r5) goto L_0x0023
            android.support.v7.widget.eo r5 = r4.f12953d
            int r5 = r5.mo2848k()
            goto L_0x002d
        L_0x0023:
            android.support.v7.widget.eo r5 = r4.f12953d
            int r5 = r5.mo2848k()
            r6 = r5
            r5 = 0
            goto L_0x002e
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = 0
        L_0x002e:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L_0x004b
            androidx.recyclerview.widget.q r0 = r4.f12966q
            android.support.v7.widget.eo r3 = r4.f12953d
            int r3 = r3.mo2847j()
            int r3 = r3 - r6
            r0.f13064f = r3
            androidx.recyclerview.widget.q r6 = r4.f12966q
            android.support.v7.widget.eo r0 = r4.f12953d
            int r0 = r0.mo2843f()
            int r0 = r0 + r5
            r6.f13065g = r0
            goto L_0x005b
        L_0x004b:
            androidx.recyclerview.widget.q r0 = r4.f12966q
            android.support.v7.widget.eo r3 = r4.f12953d
            int r3 = r3.mo2842e()
            int r3 = r3 + r5
            r0.f13065g = r3
            androidx.recyclerview.widget.q r5 = r4.f12966q
            int r6 = -r6
            r5.f13064f = r6
        L_0x005b:
            androidx.recyclerview.widget.q r5 = r4.f12966q
            r5.f13066h = r1
            r5.f13059a = r2
            android.support.v7.widget.eo r6 = r4.f12953d
            int r6 = r6.mo2845h()
            if (r6 != 0) goto L_0x0072
            android.support.v7.widget.eo r6 = r4.f12953d
            int r6 = r6.mo2842e()
            if (r6 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r5.f13067i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager.m11627I(int, android.support.v7.widget.ge):void");
    }

    /* renamed from: J */
    private final void m11628J(C4078p pVar, int i, int i2) {
        int i3 = pVar.f13056d;
        if (i == -1) {
            if (pVar.mo8561g() + i3 <= i2) {
                this.f12967r.set(pVar.f13057e, false);
            }
        } else if (pVar.mo8559e() - i3 >= i2) {
            this.f12967r.set(pVar.f13057e, false);
        }
    }

    /* renamed from: K */
    private static boolean m11629K(int i, int i2, int i3) {
        if (i3 > 0 && i != i3) {
            return false;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: L */
    private final boolean m11630L(int i) {
        if (this.f12955f == 0) {
            return (i == -1) != this.f12957h;
        }
        return ((i == -1) == this.f12957h) == mo8516n();
    }

    /* renamed from: M */
    private final void m11631M(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.f12971v);
        C4075m mVar = (C4075m) view.getLayoutParams();
        int N = m11632N(i, mVar.leftMargin + this.f12971v.left, mVar.rightMargin + this.f12971v.right);
        int N2 = m11632N(i2, mVar.topMargin + this.f12971v.top, mVar.bottomMargin + this.f12971v.bottom);
        if (view.isLayoutRequested() || !m11629K(view.getWidth(), N, mVar.width) || !m11629K(view.getHeight(), N2, mVar.height)) {
            view.measure(N, N2);
        }
    }

    /* renamed from: N */
    private static final int m11632N(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: s */
    private final int m11633s(int i) {
        if (getChildCount() == 0) {
            return this.f12957h ? 1 : -1;
        }
        return (i < mo8503a()) != this.f12957h ? -1 : 1;
    }

    /* renamed from: t */
    private final int m11634t(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        C0626eo eoVar = this.f12953d;
        View e = mo8507e(!this.f12973x);
        View d = mo8506d(!this.f12973x);
        boolean z = this.f12973x;
        if (getChildCount() == 0 || geVar.mo3052a() == 0 || e == null || d == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(getPosition(e) - getPosition(d)) + 1;
        }
        return Math.min(eoVar.mo2848k(), eoVar.mo2838a(d) - eoVar.mo2841d(e));
    }

    /* renamed from: u */
    private final int m11635u(C0670ge geVar) {
        int i;
        int i2 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        C0626eo eoVar = this.f12953d;
        View e = mo8507e(!this.f12973x);
        View d = mo8506d(!this.f12973x);
        boolean z = this.f12973x;
        boolean z2 = this.f12957h;
        if (!(getChildCount() == 0 || geVar.mo3052a() == 0 || e == null || d == null)) {
            int min = Math.min(getPosition(e), getPosition(d));
            int max = Math.max(getPosition(e), getPosition(d));
            if (z2) {
                i = Math.max(0, (geVar.mo3052a() - max) - 1);
            } else {
                i = Math.max(0, min);
            }
            i2 = i;
            if (z) {
                return Math.round((((float) i2) * (((float) Math.abs(eoVar.mo2838a(d) - eoVar.mo2841d(e))) / ((float) (Math.abs(getPosition(e) - getPosition(d)) + 1)))) + ((float) (eoVar.mo2847j() - eoVar.mo2841d(e))));
            }
        }
        return i2;
    }

    /* renamed from: v */
    private final int m11636v(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        C0626eo eoVar = this.f12953d;
        View e = mo8507e(!this.f12973x);
        View d = mo8506d(!this.f12973x);
        boolean z = this.f12973x;
        if (getChildCount() == 0 || geVar.mo3052a() == 0 || e == null || d == null) {
            return 0;
        }
        if (!z) {
            return geVar.mo3052a();
        }
        return (int) ((((float) (eoVar.mo2838a(d) - eoVar.mo2841d(e))) / ((float) (Math.abs(getPosition(e) - getPosition(d)) + 1))) * ((float) geVar.mo3052a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0304, code lost:
        r0 = true;
        r17 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x042f  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m11637w(android.support.p033v7.widget.C0661fw r22, androidx.recyclerview.widget.C4079q r23, android.support.p033v7.widget.C0670ge r24) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r23
            java.util.BitSet r0 = r6.f12967r
            int r1 = r6.f12951b
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.q r0 = r6.f12966q
            boolean r0 = r0.f13067i
            if (r0 == 0) goto L_0x0020
            int r0 = r8.f13063e
            if (r0 != r10) goto L_0x001d
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0030
        L_0x001d:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0030
        L_0x0020:
            int r0 = r8.f13063e
            if (r0 != r10) goto L_0x002a
            int r0 = r8.f13065g
            int r1 = r8.f13060b
            int r0 = r0 + r1
            goto L_0x002f
        L_0x002a:
            int r0 = r8.f13064f
            int r1 = r8.f13060b
            int r0 = r0 - r1
        L_0x002f:
            r13 = r0
        L_0x0030:
            int r0 = r8.f13063e
            r6.m11626H(r0, r13)
            boolean r0 = r6.f12957h
            if (r0 == 0) goto L_0x0040
            android.support.v7.widget.eo r0 = r6.f12953d
            int r0 = r0.mo2843f()
            goto L_0x0046
        L_0x0040:
            android.support.v7.widget.eo r0 = r6.f12953d
            int r0 = r0.mo2847j()
        L_0x0046:
            r14 = r0
            r0 = 0
            r1 = 0
        L_0x0049:
            boolean r2 = r23.mo8573a(r24)
            r3 = -1
            if (r2 == 0) goto L_0x0444
            androidx.recyclerview.widget.q r2 = r6.f12966q
            boolean r2 = r2.f13067i
            if (r2 != 0) goto L_0x005e
            java.util.BitSet r2 = r6.f12967r
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0444
        L_0x005e:
            int r2 = r8.f13061c
            android.view.View r5 = r7.mo3039p(r2)
            int r2 = r8.f13061c
            int r4 = r8.f13062d
            int r2 = r2 + r4
            r8.f13061c = r2
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            r4 = r2
            androidx.recyclerview.widget.m r4 = (androidx.recyclerview.widget.C4075m) r4
            android.support.v7.widget.gh r2 = r4.f2420c
            int r2 = r2.getAbsoluteAdapterPosition()
            android.support.v7.widget.gh r11 = r4.f2420c
            int r11 = r11.getLayoutPosition()
            java.lang.String r15 = r6.mo8508f(r2)
            if (r1 != 0) goto L_0x00a0
            int r12 = r8.f13062d
            int r12 = r2 - r12
            if (r12 < 0) goto L_0x00a0
            int r9 = r24.mo3052a()
            if (r12 >= r9) goto L_0x00a0
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r9 = r6.f12960k
            java.lang.String r12 = r6.mo8508f(r12)
            int r9 = r9.mo8521a(r12)
            if (r9 == r3) goto L_0x00a0
            androidx.recyclerview.widget.p[] r1 = r6.f12952c
            r1 = r1[r9]
        L_0x00a0:
            boolean r9 = r6.mo8515m(r2)
            if (r9 == 0) goto L_0x00a8
            r4.f13052b = r10
        L_0x00a8:
            if (r2 < 0) goto L_0x043f
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r0 = r6.f12960k
            int r0 = r0.mo8521a(r15)
            int r9 = r8.f13063e
            if (r9 == r3) goto L_0x00bd
            boolean r2 = r6.mo8514l(r2)
            if (r2 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r2 = 0
            goto L_0x00be
        L_0x00bd:
            r2 = 1
        L_0x00be:
            if (r0 != r3) goto L_0x00c2
            r9 = 1
            goto L_0x00c3
        L_0x00c2:
            r9 = 0
        L_0x00c3:
            if (r9 == 0) goto L_0x015c
            if (r1 == 0) goto L_0x00cf
            if (r2 == 0) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            r0 = r1
            r18 = r0
            goto L_0x014c
        L_0x00cf:
            boolean r0 = r4.f13052b
            if (r0 == 0) goto L_0x00dc
            androidx.recyclerview.widget.p[] r0 = r6.f12952c
            r2 = 0
            r0 = r0[r2]
            r18 = r1
            goto L_0x014c
        L_0x00dc:
            int r0 = r8.f13063e
            boolean r0 = r6.m11630L(r0)
            if (r0 == 0) goto L_0x00eb
            int r0 = r6.f12951b
            int r0 = r0 + r3
            r2 = r0
            r0 = -1
            r12 = -1
            goto L_0x00ef
        L_0x00eb:
            int r0 = r6.f12951b
            r2 = 0
            r12 = 1
        L_0x00ef:
            int r3 = r8.f13063e
            if (r3 != r10) goto L_0x0123
            android.support.v7.widget.eo r3 = r6.f12953d
            int r3 = r3.mo2847j()
            r18 = r1
            r10 = r2
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
        L_0x0100:
            if (r10 == r0) goto L_0x011e
            r19 = r2
            androidx.recyclerview.widget.p[] r2 = r6.f12952c
            r2 = r2[r10]
            int r7 = r2.mo8560f(r3)
            if (r7 >= r1) goto L_0x0111
            r20 = r7
            goto L_0x0113
        L_0x0111:
            r20 = r1
        L_0x0113:
            if (r7 >= r1) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r2 = r19
        L_0x0118:
            int r10 = r10 + r12
            r7 = r22
            r1 = r20
            goto L_0x0100
        L_0x011e:
            r19 = r2
            r0 = r19
            goto L_0x014c
        L_0x0123:
            r18 = r1
            android.support.v7.widget.eo r1 = r6.f12953d
            int r1 = r1.mo2843f()
            r3 = r2
            r2 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x012f:
            if (r3 == r0) goto L_0x014b
            androidx.recyclerview.widget.p[] r10 = r6.f12952c
            r10 = r10[r3]
            r19 = r0
            int r0 = r10.mo8562h(r1)
            if (r0 <= r7) goto L_0x0140
            r20 = r0
            goto L_0x0142
        L_0x0140:
            r20 = r7
        L_0x0142:
            if (r0 <= r7) goto L_0x0145
            r2 = r10
        L_0x0145:
            int r3 = r3 + r12
            r0 = r19
            r7 = r20
            goto L_0x012f
        L_0x014b:
            r0 = r2
        L_0x014c:
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r1 = r6.f12960k
            if (r15 == 0) goto L_0x0162
            java.util.Map r1 = r1.f12976a
            int r2 = r0.f13057e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r15, r2)
            goto L_0x0162
        L_0x015c:
            r18 = r1
            androidx.recyclerview.widget.p[] r1 = r6.f12952c
            r0 = r1[r0]
        L_0x0162:
            r7 = r0
            boolean r0 = r4.f13052b
            r1 = 1
            if (r1 == r0) goto L_0x016a
            r18 = r7
        L_0x016a:
            r4.f13051a = r7
            int r0 = r8.f13063e
            if (r0 != r1) goto L_0x0174
            r6.addView(r5)
            goto L_0x0178
        L_0x0174:
            r0 = 0
            r6.addView(r5, r0)
        L_0x0178:
            boolean r0 = r4.f13052b
            if (r0 != 0) goto L_0x01d5
            int r0 = r6.f12951b
            if (r0 != r1) goto L_0x0181
            goto L_0x01d5
        L_0x0181:
            int r0 = r6.f12955f
            if (r0 != r1) goto L_0x01ad
            int r0 = r6.f12965p
            int r2 = r21.getWidthMode()
            int r3 = r4.width
            r10 = 0
            int r0 = getChildMeasureSpec(r0, r2, r10, r3, r10)
            int r2 = r21.getHeight()
            int r3 = r21.getHeightMode()
            int r10 = r21.getPaddingTop()
            int r12 = r21.getPaddingBottom()
            int r10 = r10 + r12
            int r12 = r4.height
            int r2 = getChildMeasureSpec(r2, r3, r10, r12, r1)
            r6.m11631M(r5, r0, r2)
            goto L_0x0212
        L_0x01ad:
            int r0 = r21.getWidth()
            int r2 = r21.getWidthMode()
            int r3 = r21.getPaddingLeft()
            int r10 = r21.getPaddingRight()
            int r3 = r3 + r10
            int r10 = r4.width
            int r0 = getChildMeasureSpec(r0, r2, r3, r10, r1)
            int r2 = r6.f12965p
            int r3 = r21.getHeightMode()
            int r10 = r4.height
            r12 = 0
            int r2 = getChildMeasureSpec(r2, r3, r12, r10, r12)
            r6.m11631M(r5, r0, r2)
            goto L_0x0212
        L_0x01d5:
            int r0 = r6.f12955f
            if (r0 != r1) goto L_0x01f6
            int r0 = r6.f12970u
            int r2 = r21.getHeight()
            int r3 = r21.getHeightMode()
            int r10 = r21.getPaddingTop()
            int r12 = r21.getPaddingBottom()
            int r10 = r10 + r12
            int r12 = r4.height
            int r2 = getChildMeasureSpec(r2, r3, r10, r12, r1)
            r6.m11631M(r5, r0, r2)
            goto L_0x0212
        L_0x01f6:
            int r0 = r21.getWidth()
            int r2 = r21.getWidthMode()
            int r3 = r21.getPaddingLeft()
            int r10 = r21.getPaddingRight()
            int r3 = r3 + r10
            int r10 = r4.width
            int r0 = getChildMeasureSpec(r0, r2, r3, r10, r1)
            int r2 = r6.f12970u
            r6.m11631M(r5, r0, r2)
        L_0x0212:
            int r0 = r8.f13063e
            if (r0 != r1) goto L_0x0264
            boolean r0 = r4.f13052b
            if (r0 == 0) goto L_0x021f
            int r0 = r6.m11638x(r14)
            goto L_0x0223
        L_0x021f:
            int r0 = r7.mo8560f(r14)
        L_0x0223:
            android.support.v7.widget.eo r1 = r6.f12953d
            int r1 = r1.mo2839b(r5)
            int r1 = r1 + r0
            boolean r2 = r4.f13052b
            if (r2 == 0) goto L_0x0261
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r2 = r6.f12960k
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = r2.mo8522b(r11)
            if (r2 != 0) goto L_0x0261
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = new androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r2.<init>()
            int r3 = r6.f12951b
            int[] r3 = new int[r3]
            r2.f12980c = r3
            r3 = 0
        L_0x0242:
            int r10 = r6.f12951b
            if (r3 >= r10) goto L_0x0257
            int[] r10 = r2.f12980c
            androidx.recyclerview.widget.p[] r12 = r6.f12952c
            r12 = r12[r3]
            int r12 = r12.mo8560f(r0)
            int r12 = r0 - r12
            r10[r3] = r12
            int r3 = r3 + 1
            goto L_0x0242
        L_0x0257:
            r3 = -1
            r2.f12979b = r3
            r2.f12978a = r11
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r3 = r6.f12960k
            r3.mo8523c(r2)
        L_0x0261:
            r3 = r0
            r10 = r1
            goto L_0x02b1
        L_0x0264:
            boolean r0 = r4.f13052b
            if (r0 == 0) goto L_0x026d
            int r0 = r6.m11639y(r14)
            goto L_0x0271
        L_0x026d:
            int r0 = r7.mo8562h(r14)
        L_0x0271:
            android.support.v7.widget.eo r1 = r6.f12953d
            int r1 = r1.mo2839b(r5)
            int r1 = r0 - r1
            boolean r2 = r4.f13052b
            if (r2 == 0) goto L_0x02af
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r2 = r6.f12960k
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = r2.mo8522b(r11)
            if (r2 != 0) goto L_0x02af
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r2 = new androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r2.<init>()
            int r3 = r6.f12951b
            int[] r3 = new int[r3]
            r2.f12980c = r3
            r3 = 0
        L_0x0291:
            int r10 = r6.f12951b
            if (r3 >= r10) goto L_0x02a5
            int[] r10 = r2.f12980c
            androidx.recyclerview.widget.p[] r12 = r6.f12952c
            r12 = r12[r3]
            int r12 = r12.mo8562h(r0)
            int r12 = r12 - r0
            r10[r3] = r12
            int r3 = r3 + 1
            goto L_0x0291
        L_0x02a5:
            r3 = 1
            r2.f12979b = r3
            r2.f12978a = r11
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r3 = r6.f12960k
            r3.mo8523c(r2)
        L_0x02af:
            r10 = r0
            r3 = r1
        L_0x02b1:
            boolean r0 = r4.f13052b
            if (r0 == 0) goto L_0x0318
            int r0 = r8.f13062d
            r1 = -1
            if (r0 != r1) goto L_0x0318
            if (r9 == 0) goto L_0x02c0
            r0 = 1
            r6.f12972w = r0
            goto L_0x0319
        L_0x02c0:
            r0 = 1
            int r1 = r8.f13063e
            if (r1 != r0) goto L_0x02e3
            androidx.recyclerview.widget.p[] r0 = r6.f12952c
            r1 = 0
            r0 = r0[r1]
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r0.mo8560f(r9)
            r1 = 1
        L_0x02d1:
            int r2 = r6.f12951b
            if (r1 >= r2) goto L_0x0304
            androidx.recyclerview.widget.p[] r2 = r6.f12952c
            r2 = r2[r1]
            int r2 = r2.mo8560f(r9)
            if (r2 == r0) goto L_0x02e0
            goto L_0x02fd
        L_0x02e0:
            int r1 = r1 + 1
            goto L_0x02d1
        L_0x02e3:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.recyclerview.widget.p[] r0 = r6.f12952c
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.mo8562h(r9)
            r1 = 1
        L_0x02ef:
            int r2 = r6.f12951b
            if (r1 >= r2) goto L_0x0304
            androidx.recyclerview.widget.p[] r2 = r6.f12952c
            r2 = r2[r1]
            int r2 = r2.mo8562h(r9)
            if (r2 == r0) goto L_0x0301
        L_0x02fd:
            r0 = 1
            r17 = 0
            goto L_0x0307
        L_0x0301:
            int r1 = r1 + 1
            goto L_0x02ef
        L_0x0304:
            r0 = 1
            r17 = 1
        L_0x0307:
            r1 = r17 ^ 1
            if (r1 == 0) goto L_0x031b
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup r1 = r6.f12960k
            androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r1 = r1.mo8522b(r11)
            if (r1 == 0) goto L_0x0315
            r1.f12981d = r0
        L_0x0315:
            r6.f12972w = r0
            goto L_0x031b
        L_0x0318:
            r0 = 1
        L_0x0319:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x031b:
            int r1 = r8.f13063e
            if (r1 != r0) goto L_0x0339
            boolean r0 = r4.f13052b
            if (r0 == 0) goto L_0x0333
            int r0 = r6.f12951b
            r1 = -1
            int r0 = r0 + r1
        L_0x0327:
            if (r0 < 0) goto L_0x0352
            androidx.recyclerview.widget.p[] r1 = r6.f12952c
            r1 = r1[r0]
            r1.mo8564j(r5)
            int r0 = r0 + -1
            goto L_0x0327
        L_0x0333:
            androidx.recyclerview.widget.p r0 = r4.f13051a
            r0.mo8564j(r5)
            goto L_0x0352
        L_0x0339:
            boolean r0 = r4.f13052b
            if (r0 == 0) goto L_0x034d
            int r0 = r6.f12951b
            r1 = -1
            int r0 = r0 + r1
        L_0x0341:
            if (r0 < 0) goto L_0x0352
            androidx.recyclerview.widget.p[] r1 = r6.f12952c
            r1 = r1[r0]
            r1.mo8571q(r5)
            int r0 = r0 + -1
            goto L_0x0341
        L_0x034d:
            androidx.recyclerview.widget.p r0 = r4.f13051a
            r0.mo8571q(r5)
        L_0x0352:
            android.support.v7.widget.eo r0 = r6.f12954e
            int r0 = r0.mo2839b(r5)
            boolean r1 = r4.f13052b
            if (r1 != 0) goto L_0x036a
            int r1 = r6.f12951b
            r2 = 1
            if (r1 <= r2) goto L_0x036a
            int r1 = r6.f12965p
            int r2 = r6.f12975z
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
        L_0x036a:
            boolean r1 = r21.mo8516n()
            if (r1 == 0) goto L_0x03ab
            int r1 = r6.f12955f
            r2 = 1
            if (r1 != r2) goto L_0x03ab
            int r1 = r6.f12951b
            if (r1 == r2) goto L_0x03a0
            boolean r1 = r4.f13052b
            if (r1 == 0) goto L_0x037e
            goto L_0x03a0
        L_0x037e:
            android.support.v7.widget.eo r1 = r6.f12954e
            int r1 = r1.mo2843f()
            int r2 = r6.f12951b
            int r11 = r6.f12965p
            int r12 = r6.f12975z
            int r11 = r11 - r0
            int r11 = r11 * r2
            int r11 = r11 / 2
            int r1 = r1 - r11
            int r11 = r2 + -1
            int r11 = r11 * r12
            int r1 = r1 + r11
            int r11 = r7.f13057e
            int r2 = r2 - r11
            r11 = -1
            int r2 = r2 + r11
            int r12 = r12 + r12
            int r12 = r12 + r0
            int r2 = r2 * r12
            int r1 = r1 - r2
            goto L_0x03a6
        L_0x03a0:
            android.support.v7.widget.eo r1 = r6.f12954e
            int r1 = r1.mo2843f()
        L_0x03a6:
            int r0 = r1 - r0
            r11 = r0
            r12 = r1
            goto L_0x03dd
        L_0x03ab:
            int r1 = r6.f12951b
            r2 = 1
            if (r1 == r2) goto L_0x03d4
            boolean r1 = r4.f13052b
            if (r1 == 0) goto L_0x03b5
            goto L_0x03d4
        L_0x03b5:
            android.support.v7.widget.eo r1 = r6.f12954e
            int r1 = r1.mo2847j()
            int r2 = r6.f12951b
            int r11 = r6.f12965p
            int r12 = r6.f12975z
            int r11 = r11 - r0
            int r11 = r11 * r2
            int r11 = r11 / 2
            int r1 = r1 + r11
            r11 = -1
            int r2 = r2 + r11
            int r2 = r2 * r12
            int r1 = r1 - r2
            int r2 = r7.f13057e
            int r12 = r12 + r12
            int r12 = r12 + r0
            int r2 = r2 * r12
            int r1 = r1 + r2
            goto L_0x03da
        L_0x03d4:
            android.support.v7.widget.eo r1 = r6.f12954e
            int r1 = r1.mo2847j()
        L_0x03da:
            int r0 = r0 + r1
            r12 = r0
            r11 = r1
        L_0x03dd:
            int r0 = r6.f12955f
            r15 = 1
            if (r0 != r15) goto L_0x03f0
            r0 = r21
            r1 = r5
            r2 = r11
            r11 = r4
            r4 = r12
            r16 = r5
            r5 = r10
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            r10 = r11
            goto L_0x03ff
        L_0x03f0:
            r16 = r5
            r5 = r4
            r0 = r21
            r1 = r16
            r2 = r3
            r3 = r11
            r4 = r10
            r10 = r5
            r5 = r12
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
        L_0x03ff:
            boolean r0 = r10.f13052b
            if (r0 == 0) goto L_0x040b
            androidx.recyclerview.widget.q r0 = r6.f12966q
            int r0 = r0.f13063e
            r6.m11626H(r0, r13)
            goto L_0x0412
        L_0x040b:
            androidx.recyclerview.widget.q r0 = r6.f12966q
            int r0 = r0.f13063e
            r6.m11628J(r7, r0, r13)
        L_0x0412:
            androidx.recyclerview.widget.q r0 = r6.f12966q
            r1 = r22
            r6.m11621C(r1, r0)
            androidx.recyclerview.widget.q r0 = r6.f12966q
            boolean r0 = r0.f13066h
            if (r0 == 0) goto L_0x0437
            boolean r0 = r16.hasFocusable()
            if (r0 == 0) goto L_0x0437
            boolean r0 = r10.f13052b
            if (r0 == 0) goto L_0x042f
            java.util.BitSet r0 = r6.f12967r
            r0.clear()
            goto L_0x0437
        L_0x042f:
            java.util.BitSet r0 = r6.f12967r
            int r2 = r7.f13057e
            r3 = 0
            r0.set(r2, r3)
        L_0x0437:
            r7 = r1
            r1 = r18
            r0 = 1
            r9 = 0
            r10 = 1
            goto L_0x0049
        L_0x043f:
            r18 = r1
            r9 = 0
            goto L_0x0049
        L_0x0444:
            r1 = r7
            if (r0 != 0) goto L_0x044c
            androidx.recyclerview.widget.q r0 = r6.f12966q
            r6.m11621C(r1, r0)
        L_0x044c:
            androidx.recyclerview.widget.q r0 = r6.f12966q
            int r0 = r0.f13063e
            r1 = -1
            if (r0 != r1) goto L_0x0465
            android.support.v7.widget.eo r0 = r6.f12953d
            int r0 = r0.mo2847j()
            int r0 = r6.m11639y(r0)
            android.support.v7.widget.eo r1 = r6.f12953d
            int r1 = r1.mo2847j()
            int r1 = r1 - r0
            goto L_0x0477
        L_0x0465:
            android.support.v7.widget.eo r0 = r6.f12953d
            int r0 = r0.mo2843f()
            int r0 = r6.m11638x(r0)
            android.support.v7.widget.eo r1 = r6.f12953d
            int r1 = r1.mo2843f()
            int r1 = r0 - r1
        L_0x0477:
            if (r1 <= 0) goto L_0x0480
            int r0 = r8.f13060b
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x0480:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager.m11637w(android.support.v7.widget.fw, androidx.recyclerview.widget.q, android.support.v7.widget.ge):int");
    }

    /* renamed from: x */
    private final int m11638x(int i) {
        int f = this.f12952c[0].mo8560f(i);
        for (int i2 = 1; i2 < this.f12951b; i2++) {
            int f2 = this.f12952c[i2].mo8560f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    /* renamed from: y */
    private final int m11639y(int i) {
        int h = this.f12952c[0].mo8562h(i);
        for (int i2 = 1; i2 < this.f12951b; i2++) {
            int h2 = this.f12952c[i2].mo8562h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    /* renamed from: z */
    private final void m11640z(C0661fw fwVar, C0670ge geVar, boolean z) {
        int f;
        int x = m11638x(LinearLayoutManager.INVALID_OFFSET);
        if (x != Integer.MIN_VALUE && (f = this.f12953d.mo2843f() - x) > 0) {
            int i = f - (-mo8505c(-f, fwVar, geVar));
            if (z && i > 0) {
                this.f12953d.mo2851n(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo8503a() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f12961l == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo8504b() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo8505c(int i, C0661fw fwVar, C0670ge geVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo8510h(i, geVar);
        int w = m11637w(fwVar, this.f12966q, geVar);
        if (this.f12966q.f13060b >= w) {
            i = i < 0 ? -w : w;
        }
        this.f12953d.mo2851n(-i);
        this.f12968s = this.f12957h;
        C4079q qVar = this.f12966q;
        qVar.f13060b = 0;
        m11621C(fwVar, qVar);
        return i;
    }

    public final boolean canScrollHorizontally() {
        return this.f12955f == 0;
    }

    public final boolean canScrollVertically() {
        return this.f12955f == 1;
    }

    public final boolean checkLayoutParams(C0654fp fpVar) {
        return fpVar instanceof C4075m;
    }

    public final void collectAdjacentPrefetchPositions(int i, int i2, C0670ge geVar, C0651fm fmVar) {
        int i3;
        int i4;
        if (1 == this.f12955f) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            mo8510h(i, geVar);
            int[] iArr = this.f12974y;
            if (iArr == null || iArr.length < this.f12951b) {
                this.f12974y = new int[this.f12951b];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f12951b; i6++) {
                C4079q qVar = this.f12966q;
                if (qVar.f13062d == -1) {
                    i4 = qVar.f13064f;
                    i3 = this.f12952c[i6].mo8562h(i4);
                } else {
                    i4 = this.f12952c[i6].mo8560f(qVar.f13065g);
                    i3 = this.f12966q.f13065g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f12974y[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f12974y, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f12966q.mo8573a(geVar); i8++) {
                fmVar.mo2729a(this.f12966q.f13061c, this.f12974y[i8]);
                C4079q qVar2 = this.f12966q;
                qVar2.f13061c += qVar2.f13062d;
            }
        }
    }

    public final int computeHorizontalScrollExtent(C0670ge geVar) {
        return m11634t(geVar);
    }

    public final int computeHorizontalScrollOffset(C0670ge geVar) {
        return m11635u(geVar);
    }

    public final int computeHorizontalScrollRange(C0670ge geVar) {
        return m11636v(geVar);
    }

    public final PointF computeScrollVectorForPosition(int i) {
        int s = m11633s(i);
        PointF pointF = new PointF();
        if (s == 0) {
            return null;
        }
        if (this.f12955f == 0) {
            pointF.x = (float) s;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) s;
        }
        return pointF;
    }

    public final int computeVerticalScrollExtent(C0670ge geVar) {
        return m11634t(geVar);
    }

    public final int computeVerticalScrollOffset(C0670ge geVar) {
        return m11635u(geVar);
    }

    public final int computeVerticalScrollRange(C0670ge geVar) {
        return m11636v(geVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final View mo8506d(boolean z) {
        int j = this.f12953d.mo2847j();
        int f = this.f12953d.mo2843f();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int d = this.f12953d.mo2841d(childAt);
            int a = this.f12953d.mo2838a(childAt);
            if (a > j && d < f) {
                if (a <= f || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final View mo8507e(boolean z) {
        int j = this.f12953d.mo2847j();
        int f = this.f12953d.mo2843f();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int d = this.f12953d.mo2841d(childAt);
            if (this.f12953d.mo2838a(childAt) > j && d < f) {
                if (d >= j || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo8508f(int i);

    /* renamed from: g */
    public final void mo8509g() {
        this.f12960k.mo8524d();
        requestLayout();
    }

    public final C0654fp generateDefaultLayoutParams() {
        if (this.f12955f == 0) {
            return new C4075m(-2, -1);
        }
        return new C4075m(-1, -2);
    }

    public final C0654fp generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C4075m(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo8510h(int i, C0670ge geVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo8504b();
            i2 = 1;
        } else {
            i3 = mo8503a();
            i2 = -1;
        }
        this.f12966q.f13059a = true;
        m11627I(i3, geVar);
        m11625G(i2);
        C4079q qVar = this.f12966q;
        qVar.f13061c = i3 + qVar.f13062d;
        qVar.f13060b = Math.abs(i);
    }

    /* renamed from: i */
    public final void mo8511i(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        SavedState savedState = this.f12961l;
        if (!(savedState == null || savedState.f12989h == z)) {
            savedState.f12989h = z;
        }
        this.f12956g = z;
        requestLayout();
    }

    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    /* renamed from: j */
    public final void mo8512j(int i) {
        assertNotInLayoutOrScroll((String) null);
        if (i != this.f12951b) {
            mo8509g();
            this.f12951b = i;
            this.f12967r = new BitSet(i);
            this.f12952c = new C4078p[this.f12951b];
            for (int i2 = 0; i2 < this.f12951b; i2++) {
                this.f12952c[i2] = new C4078p(this, i2);
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo8513k(int i) {
        this.f12965p = i / this.f12951b;
        this.f12970u = View.MeasureSpec.makeMeasureSpec(i, this.f12954e.mo2845h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo8514l(int i);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo8515m(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo8516n() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: o */
    public int[] mo8517o(int[] iArr) {
        int i = this.f12951b;
        if (i <= 0) {
            return f12950a;
        }
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        for (int i2 = 0; i2 < this.f12951b; i2++) {
            C4078p pVar = this.f12952c[i2];
            iArr[i2] = pVar.f13058f.f12956g ? pVar.mo8558d(pVar.f13053a.size() - 1, -1, false) : pVar.mo8558d(0, pVar.f13053a.size(), false);
        }
        return iArr;
    }

    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f12951b; i2++) {
            this.f12952c[i2].mo8568n(i);
        }
    }

    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f12951b; i2++) {
            this.f12952c[i2].mo8568n(i);
        }
    }

    public final void onAdapterChanged(C0640fb fbVar, C0640fb fbVar2) {
        this.f12960k.mo8524d();
        for (int i = 0; i < this.f12951b; i++) {
            this.f12952c[i].mo8567m();
        }
    }

    public final void onAttachedToWindow(RecyclerView recyclerView) {
        if (recyclerView.getResources().getConfiguration().orientation == 2) {
            mo8512j(this.f12963n);
        } else {
            mo8512j(this.f12964o);
        }
    }

    public final void onDetachedFromWindow(RecyclerView recyclerView, C0661fw fwVar) {
        super.onDetachedFromWindow(recyclerView, fwVar);
        for (int i = 0; i < this.f12951b; i++) {
            this.f12952c[i].mo8567m();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r9.f12955f == 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r9.f12955f == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (mo8516n() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (mo8516n() == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onFocusSearchFailed(android.view.View r10, int r11, android.support.p033v7.widget.C0661fw r12, android.support.p033v7.widget.C0670ge r13) {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.findContainingItemView(r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.m11624F()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r11 == r3) goto L_0x004f
            r4 = 2
            if (r11 == r4) goto L_0x0042
            r4 = 17
            if (r11 == r4) goto L_0x003d
            r4 = 33
            if (r11 == r4) goto L_0x0038
            r4 = 66
            if (r11 == r4) goto L_0x0033
            r4 = 130(0x82, float:1.82E-43)
            if (r11 == r4) goto L_0x002e
        L_0x002b:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005c
        L_0x002e:
            int r11 = r9.f12955f
            if (r11 != r3) goto L_0x002b
            goto L_0x0046
        L_0x0033:
            int r11 = r9.f12955f
            if (r11 != 0) goto L_0x002b
            goto L_0x0046
        L_0x0038:
            int r11 = r9.f12955f
            if (r11 != r3) goto L_0x002b
            goto L_0x0053
        L_0x003d:
            int r11 = r9.f12955f
            if (r11 != 0) goto L_0x002b
            goto L_0x0053
        L_0x0042:
            int r11 = r9.f12955f
            if (r11 != r3) goto L_0x0048
        L_0x0046:
            r11 = 1
            goto L_0x005c
        L_0x0048:
            boolean r11 = r9.mo8516n()
            if (r11 == 0) goto L_0x0046
            goto L_0x0053
        L_0x004f:
            int r11 = r9.f12955f
            if (r11 != r3) goto L_0x0055
        L_0x0053:
            r11 = -1
            goto L_0x005c
        L_0x0055:
            boolean r11 = r9.mo8516n()
            if (r11 == 0) goto L_0x0053
            goto L_0x0046
        L_0x005c:
            if (r11 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.m r0 = (androidx.recyclerview.widget.C4075m) r0
            boolean r4 = r0.f13052b
            androidx.recyclerview.widget.p r0 = r0.f13051a
            if (r11 != r3) goto L_0x0070
            int r5 = r9.mo8504b()
            goto L_0x0074
        L_0x0070:
            int r5 = r9.mo8503a()
        L_0x0074:
            r9.m11627I(r5, r13)
            r9.m11625G(r11)
            androidx.recyclerview.widget.q r6 = r9.f12966q
            int r7 = r6.f13062d
            int r7 = r7 + r5
            r6.f13061c = r7
            android.support.v7.widget.eo r7 = r9.f12953d
            int r7 = r7.mo2848k()
            float r7 = (float) r7
            r8 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r7 = r7 * r8
            int r7 = (int) r7
            r6.f13060b = r7
            androidx.recyclerview.widget.q r6 = r9.f12966q
            r6.f13066h = r3
            r7 = 0
            r6.f13059a = r7
            r9.m11637w(r12, r6, r13)
            boolean r12 = r9.f12957h
            r9.f12968s = r12
            if (r4 != 0) goto L_0x00aa
            android.view.View r12 = r0.mo8563i(r5, r11)
            if (r12 == 0) goto L_0x00aa
            if (r12 != r10) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            return r12
        L_0x00aa:
            boolean r12 = r9.m11630L(r11)
            if (r12 == 0) goto L_0x00c6
            int r12 = r9.f12951b
            int r12 = r12 + r2
        L_0x00b3:
            if (r12 < 0) goto L_0x00dc
            androidx.recyclerview.widget.p[] r13 = r9.f12952c
            r13 = r13[r12]
            android.view.View r13 = r13.mo8563i(r5, r11)
            if (r13 == 0) goto L_0x00c3
            if (r13 != r10) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            return r13
        L_0x00c3:
            int r12 = r12 + -1
            goto L_0x00b3
        L_0x00c6:
            r12 = 0
        L_0x00c7:
            int r13 = r9.f12951b
            if (r12 >= r13) goto L_0x00dc
            androidx.recyclerview.widget.p[] r13 = r9.f12952c
            r13 = r13[r12]
            android.view.View r13 = r13.mo8563i(r5, r11)
            if (r13 == 0) goto L_0x00d9
            if (r13 != r10) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            return r13
        L_0x00d9:
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00dc:
            boolean r12 = r9.f12956g
            r12 = r12 ^ r3
            if (r11 == r2) goto L_0x00e3
            r13 = 0
            goto L_0x00e4
        L_0x00e3:
            r13 = 1
        L_0x00e4:
            if (r12 != r13) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            if (r4 != 0) goto L_0x00ff
            if (r3 == 0) goto L_0x00f1
            int r12 = r0.mo8555a()
            goto L_0x00f5
        L_0x00f1:
            int r12 = r0.mo8556b()
        L_0x00f5:
            android.view.View r12 = r9.findViewByPosition(r12)
            if (r12 == 0) goto L_0x00ff
            if (r12 != r10) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            return r12
        L_0x00ff:
            boolean r11 = r9.m11630L(r11)
            if (r11 == 0) goto L_0x012e
            int r11 = r9.f12951b
            int r11 = r11 + r2
        L_0x0108:
            if (r11 < 0) goto L_0x0152
            int r12 = r0.f13057e
            if (r11 != r12) goto L_0x010f
            goto L_0x012b
        L_0x010f:
            if (r3 == 0) goto L_0x011a
            androidx.recyclerview.widget.p[] r12 = r9.f12952c
            r12 = r12[r11]
            int r12 = r12.mo8555a()
            goto L_0x0122
        L_0x011a:
            androidx.recyclerview.widget.p[] r12 = r9.f12952c
            r12 = r12[r11]
            int r12 = r12.mo8556b()
        L_0x0122:
            android.view.View r12 = r9.findViewByPosition(r12)
            if (r12 == 0) goto L_0x012b
            if (r12 == r10) goto L_0x012b
            return r12
        L_0x012b:
            int r11 = r11 + -1
            goto L_0x0108
        L_0x012e:
            int r11 = r9.f12951b
            if (r7 >= r11) goto L_0x0152
            if (r3 == 0) goto L_0x013d
            androidx.recyclerview.widget.p[] r11 = r9.f12952c
            r11 = r11[r7]
            int r11 = r11.mo8555a()
            goto L_0x0145
        L_0x013d:
            androidx.recyclerview.widget.p[] r11 = r9.f12952c
            r11 = r11[r7]
            int r11 = r11.mo8556b()
        L_0x0145:
            android.view.View r11 = r9.findViewByPosition(r11)
            if (r11 == 0) goto L_0x014f
            if (r11 != r10) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            return r11
        L_0x014f:
            int r7 = r7 + 1
            goto L_0x012e
        L_0x0152:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.fw, android.support.v7.widget.ge):android.view.View");
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View e = mo8507e(false);
            View d = mo8506d(false);
            if (e != null && d != null) {
                int position = getPosition(e);
                int position2 = getPosition(d);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m11620B(i, i2, 1);
    }

    public final void onItemsChanged(RecyclerView recyclerView) {
        requestLayout();
    }

    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m11620B(i, i2, 8);
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m11620B(i, i2, 2);
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m11620B(i, i2, 4);
    }

    public final void onLayoutChildren(C0661fw fwVar, C0670ge geVar) {
        SavedState savedState;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C4074l lVar = this.f12962m;
        if (!(this.f12961l == null && this.f12958i == -1) && geVar.mo3052a() == 0) {
            removeAndRecycleAllViews(fwVar);
            lVar.mo8550a();
            return;
        }
        boolean z = (lVar.f13048e && this.f12958i == -1 && this.f12961l == null) ? false : true;
        if (z) {
            lVar.mo8550a();
            SavedState savedState2 = this.f12961l;
            if (savedState2 != null) {
                int i6 = savedState2.f12984c;
                if (i6 > 0) {
                    if (i6 == this.f12951b) {
                        for (int i7 = 0; i7 < this.f12951b; i7++) {
                            this.f12952c[i7].mo8567m();
                            SavedState savedState3 = this.f12961l;
                            int i8 = savedState3.f12985d[i7];
                            if (i8 != Integer.MIN_VALUE) {
                                if (savedState3.f12990i) {
                                    i5 = this.f12953d.mo2843f();
                                } else {
                                    i5 = this.f12953d.mo2847j();
                                }
                                i8 += i5;
                            }
                            C4078p pVar = this.f12952c[i7];
                            pVar.f13054b = i8;
                            pVar.f13055c = i8;
                        }
                    } else {
                        savedState2.mo8530b();
                        SavedState savedState4 = this.f12961l;
                        savedState4.f12982a = savedState4.f12983b;
                    }
                }
                SavedState savedState5 = this.f12961l;
                this.f12969t = savedState5.f12991j;
                mo8511i(savedState5.f12989h);
                m11624F();
                SavedState savedState6 = this.f12961l;
                int i9 = savedState6.f12982a;
                if (i9 != -1) {
                    this.f12958i = i9;
                    lVar.f13046c = savedState6.f12990i;
                } else {
                    lVar.f13046c = this.f12957h;
                }
                if (savedState6.f12986e > 1) {
                    LazySpanLookup lazySpanLookup = this.f12960k;
                    lazySpanLookup.f12976a = savedState6.f12987f;
                    lazySpanLookup.f12977b = savedState6.f12988g;
                }
            } else {
                m11624F();
                lVar.f13046c = this.f12957h;
            }
            if (!geVar.f2462g && (i2 = this.f12958i) != -1) {
                if (i2 < 0 || i2 >= geVar.mo3052a()) {
                    this.f12958i = -1;
                    this.f12959j = LinearLayoutManager.INVALID_OFFSET;
                } else {
                    SavedState savedState7 = this.f12961l;
                    if (savedState7 == null || savedState7.f12982a == -1 || savedState7.f12984c <= 0) {
                        View findViewByPosition = findViewByPosition(this.f12958i);
                        if (findViewByPosition != null) {
                            lVar.f13044a = this.f12957h ? mo8504b() : mo8503a();
                            if (this.f12959j != Integer.MIN_VALUE) {
                                if (lVar.f13046c) {
                                    lVar.f13045b = (this.f12953d.mo2843f() - this.f12959j) - this.f12953d.mo2838a(findViewByPosition);
                                } else {
                                    lVar.f13045b = (this.f12953d.mo2847j() + this.f12959j) - this.f12953d.mo2841d(findViewByPosition);
                                }
                            } else if (this.f12953d.mo2839b(findViewByPosition) > this.f12953d.mo2848k()) {
                                if (lVar.f13046c) {
                                    i4 = this.f12953d.mo2843f();
                                } else {
                                    i4 = this.f12953d.mo2847j();
                                }
                                lVar.f13045b = i4;
                            } else {
                                int d = this.f12953d.mo2841d(findViewByPosition) - this.f12953d.mo2847j();
                                if (d < 0) {
                                    lVar.f13045b = -d;
                                } else {
                                    int f = this.f12953d.mo2843f() - this.f12953d.mo2838a(findViewByPosition);
                                    if (f < 0) {
                                        lVar.f13045b = f;
                                    } else {
                                        lVar.f13045b = LinearLayoutManager.INVALID_OFFSET;
                                    }
                                }
                            }
                        } else {
                            int i10 = this.f12958i;
                            lVar.f13044a = i10;
                            int i11 = this.f12959j;
                            if (i11 == Integer.MIN_VALUE) {
                                boolean z2 = m11633s(i10) == 1;
                                lVar.f13046c = z2;
                                if (z2) {
                                    i3 = lVar.f13050g.f12953d.mo2843f();
                                } else {
                                    i3 = lVar.f13050g.f12953d.mo2847j();
                                }
                                lVar.f13045b = i3;
                            } else if (lVar.f13046c) {
                                lVar.f13045b = lVar.f13050g.f12953d.mo2843f() - i11;
                            } else {
                                lVar.f13045b = lVar.f13050g.f12953d.mo2847j() + i11;
                            }
                            lVar.f13047d = true;
                        }
                        lVar.f13048e = true;
                    } else {
                        lVar.f13045b = LinearLayoutManager.INVALID_OFFSET;
                        lVar.f13044a = this.f12958i;
                        lVar.f13048e = true;
                    }
                }
            }
            if (!this.f12968s) {
                int a = geVar.mo3052a();
                int childCount = getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 < childCount) {
                        int position = getPosition(getChildAt(i12));
                        if (position >= 0 && position < a) {
                            i = position;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            } else {
                int a2 = geVar.mo3052a();
                int childCount2 = getChildCount() - 1;
                while (true) {
                    if (childCount2 >= 0) {
                        i = getPosition(getChildAt(childCount2));
                        if (i >= 0 && i < a2) {
                            break;
                        }
                        childCount2--;
                    } else {
                        break;
                    }
                }
            }
            i = 0;
            lVar.f13044a = i;
            lVar.f13045b = LinearLayoutManager.INVALID_OFFSET;
            lVar.f13048e = true;
        }
        if (this.f12961l == null && this.f12958i == -1 && !(lVar.f13046c == this.f12968s && mo8516n() == this.f12969t)) {
            this.f12960k.mo8524d();
            lVar.f13047d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.f12961l) == null || savedState.f12984c <= 0)) {
            if (lVar.f13047d) {
                for (int i13 = 0; i13 < this.f12951b; i13++) {
                    this.f12952c[i13].mo8567m();
                    int i14 = lVar.f13045b;
                    if (i14 != Integer.MIN_VALUE) {
                        C4078p pVar2 = this.f12952c[i13];
                        pVar2.f13054b = i14;
                        pVar2.f13055c = i14;
                    }
                }
            } else if (z || this.f12962m.f13049f == null) {
                for (int i15 = 0; i15 < this.f12951b; i15++) {
                    C4078p pVar3 = this.f12952c[i15];
                    boolean z3 = this.f12957h;
                    int i16 = lVar.f13045b;
                    int f2 = z3 ? pVar3.mo8560f(LinearLayoutManager.INVALID_OFFSET) : pVar3.mo8562h(LinearLayoutManager.INVALID_OFFSET);
                    pVar3.mo8567m();
                    if (f2 != Integer.MIN_VALUE && ((!z3 || f2 >= pVar3.f13058f.f12953d.mo2843f()) && (z3 || f2 <= pVar3.f13058f.f12953d.mo2847j()))) {
                        if (i16 != Integer.MIN_VALUE) {
                            f2 += i16;
                        }
                        pVar3.f13055c = f2;
                        pVar3.f13054b = f2;
                    }
                }
                C4074l lVar2 = this.f12962m;
                C4078p[] pVarArr = this.f12952c;
                int length = pVarArr.length;
                int[] iArr = lVar2.f13049f;
                if (iArr == null || iArr.length < length) {
                    lVar2.f13049f = new int[lVar2.f13050g.f12952c.length];
                }
                for (int i17 = 0; i17 < length; i17++) {
                    lVar2.f13049f[i17] = pVarArr[i17].mo8562h(LinearLayoutManager.INVALID_OFFSET);
                }
            } else {
                for (int i18 = 0; i18 < this.f12951b; i18++) {
                    C4078p pVar4 = this.f12952c[i18];
                    pVar4.mo8567m();
                    int i19 = this.f12962m.f13049f[i18];
                    pVar4.f13054b = i19;
                    pVar4.f13055c = i19;
                }
            }
        }
        detachAndScrapAttachedViews(fwVar);
        this.f12966q.f13059a = false;
        this.f12972w = false;
        mo8513k(this.f12954e.mo2848k());
        m11627I(lVar.f13044a, geVar);
        if (lVar.f13046c) {
            m11625G(-1);
            m11637w(fwVar, this.f12966q, geVar);
            m11625G(1);
            C4079q qVar = this.f12966q;
            qVar.f13061c = lVar.f13044a + qVar.f13062d;
            m11637w(fwVar, qVar, geVar);
        } else {
            m11625G(1);
            m11637w(fwVar, this.f12966q, geVar);
            m11625G(-1);
            C4079q qVar2 = this.f12966q;
            qVar2.f13061c = lVar.f13044a + qVar2.f13062d;
            m11637w(fwVar, qVar2, geVar);
        }
        if (this.f12954e.mo2845h() != 1073741824) {
            int childCount3 = getChildCount();
            float f3 = 0.0f;
            for (int i20 = 0; i20 < childCount3; i20++) {
                View childAt = getChildAt(i20);
                float b = (float) this.f12954e.mo2839b(childAt);
                if (b >= f3) {
                    if (((C4075m) childAt.getLayoutParams()).f13052b) {
                        b /= (float) this.f12951b;
                    }
                    f3 = Math.max(f3, b);
                }
            }
            int i21 = this.f12965p;
            int round = Math.round(f3 * ((float) this.f12951b));
            if (this.f12954e.mo2845h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f12954e.mo2848k());
            }
            mo8513k(round);
            if (this.f12965p != i21) {
                for (int i22 = 0; i22 < childCount3; i22++) {
                    View childAt2 = getChildAt(i22);
                    C4075m mVar = (C4075m) childAt2.getLayoutParams();
                    if (!mVar.f13052b) {
                        if (!mo8516n() || this.f12955f != 1) {
                            int i23 = mVar.f13051a.f13057e;
                            int i24 = this.f12965p * i23;
                            int i25 = i23 * i21;
                            if (this.f12955f == 1) {
                                childAt2.offsetLeftAndRight(i24 - i25);
                            } else {
                                childAt2.offsetTopAndBottom(i24 - i25);
                            }
                        } else {
                            int i26 = -((this.f12951b - 1) - mVar.f13051a.f13057e);
                            childAt2.offsetLeftAndRight((this.f12965p * i26) - (i26 * i21));
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f12957h) {
                m11640z(fwVar, geVar, true);
                m11619A(fwVar, geVar, false);
            } else {
                m11619A(fwVar, geVar, true);
                m11640z(fwVar, geVar, false);
            }
        }
        if (geVar.f2462g) {
            this.f12962m.mo8550a();
        }
        this.f12968s = lVar.f13046c;
        this.f12969t = mo8516n();
    }

    public void onLayoutCompleted(C0670ge geVar) {
        this.f12958i = -1;
        this.f12959j = LinearLayoutManager.INVALID_OFFSET;
        this.f12961l = null;
        this.f12962m.mo8550a();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f12961l = savedState;
            if (this.f12958i != -1) {
                savedState.mo8529a();
                this.f12961l.mo8530b();
            }
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState() {
        View view;
        int i;
        int i2;
        Map map;
        SavedState savedState = this.f12961l;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f12989h = this.f12956g;
        savedState2.f12990i = this.f12968s;
        savedState2.f12991j = this.f12969t;
        LazySpanLookup lazySpanLookup = this.f12960k;
        if (lazySpanLookup == null || (map = lazySpanLookup.f12976a) == null) {
            savedState2.f12986e = 0;
        } else {
            savedState2.f12987f = map;
            savedState2.f12986e = savedState2.f12987f.size();
            savedState2.f12988g = this.f12960k.f12977b;
        }
        int i3 = -1;
        if (getChildCount() > 0) {
            savedState2.f12982a = this.f12968s ? mo8504b() : mo8503a();
            if (this.f12957h) {
                view = mo8506d(true);
            } else {
                view = mo8507e(true);
            }
            if (view != null) {
                i3 = getPosition(view);
            }
            savedState2.f12983b = i3;
            int i4 = this.f12951b;
            savedState2.f12984c = i4;
            savedState2.f12985d = new int[i4];
            for (int i5 = 0; i5 < this.f12951b; i5++) {
                if (this.f12968s) {
                    i = this.f12952c[i5].mo8560f(LinearLayoutManager.INVALID_OFFSET);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f12953d.mo2843f();
                    } else {
                        savedState2.f12985d[i5] = i;
                    }
                } else {
                    i = this.f12952c[i5].mo8562h(LinearLayoutManager.INVALID_OFFSET);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f12953d.mo2847j();
                    } else {
                        savedState2.f12985d[i5] = i;
                    }
                }
                i -= i2;
                savedState2.f12985d[i5] = i;
            }
        } else {
            savedState2.f12982a = -1;
            savedState2.f12983b = -1;
            savedState2.f12984c = 0;
        }
        return savedState2;
    }

    public final void onScrollStateChanged(int i) {
        int i2;
        int i3;
        LazySpanLookup.FullSpanItem fullSpanItem;
        int i4;
        View view;
        int i5;
        if (i == 0 && getChildCount() != 0 && isAttachedToWindow()) {
            if (this.f12957h) {
                i2 = mo8504b();
                i3 = mo8503a();
            } else {
                i2 = mo8503a();
                i3 = mo8504b();
            }
            LazySpanLookup.FullSpanItem fullSpanItem2 = null;
            int i6 = -1;
            if (i2 == 0) {
                if (this.f12955f == 1 && !this.f12956g) {
                    SparseIntArray sparseIntArray = new SparseIntArray(this.f12951b);
                    int i7 = Integer.MAX_VALUE;
                    for (int i8 = 0; i8 < getChildCount() && sparseIntArray.size() < this.f12951b; i8++) {
                        View childAt = getChildAt(i8);
                        C4075m mVar = (C4075m) childAt.getLayoutParams();
                        if (!mVar.f13052b && sparseIntArray.indexOfKey(mVar.f13051a.f13057e) < 0) {
                            i7 = Math.min(i7, childAt.getTop());
                            sparseIntArray.append(mVar.f13051a.f13057e, childAt.getTop());
                        }
                    }
                    for (int i9 = 0; i9 < this.f12951b; i9++) {
                        if (sparseIntArray.get(i9, i7) != i7) {
                            mo8509g();
                            return;
                        }
                    }
                }
                int childCount = getChildCount() - 1;
                BitSet bitSet = new BitSet(this.f12951b);
                bitSet.set(0, this.f12951b, true);
                char c = (this.f12955f != 1 || !mo8516n()) ? (char) 65535 : 1;
                if (this.f12957h) {
                    i4 = -1;
                } else {
                    i4 = childCount + 1;
                    childCount = 0;
                }
                int i10 = childCount < i4 ? 1 : -1;
                while (true) {
                    if (childCount == i4) {
                        view = null;
                        break;
                    }
                    view = getChildAt(childCount);
                    C4075m mVar2 = (C4075m) view.getLayoutParams();
                    if (bitSet.get(mVar2.f13051a.f13057e)) {
                        C4078p pVar = mVar2.f13051a;
                        if (!this.f12957h) {
                            if (pVar.mo8561g() > this.f12953d.mo2847j() && !((C4075m) ((View) pVar.f13053a.get(0)).getLayoutParams()).f13052b) {
                                break;
                            }
                        } else if (pVar.mo8559e() < this.f12953d.mo2843f()) {
                            ArrayList arrayList = pVar.f13053a;
                            if (!((C4075m) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).f13052b) {
                                break;
                            }
                        }
                        bitSet.clear(mVar2.f13051a.f13057e);
                    }
                    if (!mVar2.f13052b && (i5 = childCount + i10) != i4) {
                        View childAt2 = getChildAt(i5);
                        if (!this.f12957h) {
                            int d = this.f12953d.mo2841d(view);
                            int d2 = this.f12953d.mo2841d(childAt2);
                            if (d > d2) {
                                break;
                            } else if (d != d2) {
                                continue;
                            }
                        } else {
                            int a = this.f12953d.mo2838a(view);
                            int a2 = this.f12953d.mo2838a(childAt2);
                            if (a < a2) {
                                break;
                            } else if (a != a2) {
                                continue;
                            }
                        }
                        if ((mVar2.f13051a.f13057e - ((C4075m) childAt2.getLayoutParams()).f13051a.f13057e < 0) != (c < 0)) {
                            break;
                        }
                    }
                    childCount += i10;
                }
                if (view == null) {
                    i2 = 0;
                } else {
                    requestSimpleAnimationsInNextLayout();
                    requestLayout();
                    return;
                }
            }
            if (this.f12972w) {
                if (true != this.f12957h) {
                    i6 = 1;
                }
                LazySpanLookup lazySpanLookup = this.f12960k;
                int i11 = i3 + 1;
                List list = lazySpanLookup.f12977b;
                if (list != null) {
                    int size = list.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            fullSpanItem = (LazySpanLookup.FullSpanItem) lazySpanLookup.f12977b.get(i12);
                            int i13 = fullSpanItem.f12978a;
                            if (i13 >= i11) {
                                break;
                            } else if (i13 < i2 || (fullSpanItem.f12979b != i6 && !fullSpanItem.f12981d)) {
                                i12++;
                            }
                        } else {
                            break;
                        }
                    }
                    fullSpanItem2 = fullSpanItem;
                }
                if (fullSpanItem2 == null) {
                    this.f12972w = false;
                    return;
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
            }
        }
    }

    /* renamed from: p */
    public int[] mo8518p(int[] iArr) {
        int i = this.f12951b;
        if (i <= 0) {
            return f12950a;
        }
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        for (int i2 = 0; i2 < this.f12951b; i2++) {
            C4078p pVar = this.f12952c[i2];
            iArr[i2] = pVar.f13058f.f12956g ? pVar.mo8558d(0, pVar.f13053a.size(), true) : pVar.mo8558d(pVar.f13053a.size() - 1, -1, true);
        }
        return iArr;
    }

    /* renamed from: q */
    public int[] mo8519q() {
        throw null;
    }

    /* renamed from: r */
    public int[] mo8520r() {
        throw null;
    }

    public final int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return mo8505c(i, fwVar, geVar);
    }

    public final void scrollToPosition(int i) {
        SavedState savedState = this.f12961l;
        if (!(savedState == null || savedState.f12982a == i)) {
            savedState.mo8529a();
        }
        this.f12958i = i;
        this.f12959j = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return mo8505c(i, fwVar, geVar);
    }

    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f12955f == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = chooseSize(i, (this.f12965p * this.f12951b) + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = chooseSize(i2, (this.f12965p * this.f12951b) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C0602dr drVar = new C0602dr(recyclerView.getContext());
        drVar.f2449g = i;
        startSmoothScroll(drVar);
    }

    public final boolean supportsPredictiveItemAnimations() {
        return this.f12961l == null;
    }

    public C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4075m((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4075m(layoutParams);
    }
}
