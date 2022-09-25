package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0624em;
import android.support.p033v7.widget.C0625en;
import android.support.p033v7.widget.C0626eo;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0652fn;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0668gc;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class FlexboxLayoutManager extends C0653fo implements C142636a, C0668gc {

    /* renamed from: g */
    private static final Rect f387001g = new Rect();

    /* renamed from: a */
    public int f387002a;

    /* renamed from: b */
    public int f387003b;

    /* renamed from: c */
    public boolean f387004c;

    /* renamed from: d */
    public List f387005d = new ArrayList();

    /* renamed from: e */
    public final C142640e f387006e = new C142640e(this);

    /* renamed from: f */
    public C0626eo f387007f;

    /* renamed from: h */
    private int f387008h;

    /* renamed from: i */
    private int f387009i = -1;

    /* renamed from: j */
    private boolean f387010j;

    /* renamed from: k */
    private C0661fw f387011k;

    /* renamed from: l */
    private C0670ge f387012l;

    /* renamed from: m */
    private C142644i f387013m;

    /* renamed from: n */
    private C142642g f387014n = new C142642g(this);

    /* renamed from: o */
    private C0626eo f387015o;

    /* renamed from: p */
    private SavedState f387016p;

    /* renamed from: q */
    private int f387017q = -1;

    /* renamed from: r */
    private int f387018r = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: s */
    private int f387019s = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: t */
    private int f387020t = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: u */
    private SparseArray f387021u = new SparseArray();

    /* renamed from: v */
    private final Context f387022v;

    /* renamed from: w */
    private View f387023w;

    /* renamed from: x */
    private int f387024x = -1;

    /* renamed from: y */
    private C142638c f387025y = new C142638c();

    /* compiled from: PG */
    public class LayoutParams extends C0654fp implements FlexItem {
        public static final Parcelable.Creator CREATOR = new C142643h();

        /* renamed from: a */
        private float f387026a = 0.0f;

        /* renamed from: b */
        private float f387027b = 1.0f;

        /* renamed from: g */
        private int f387028g = -1;

        /* renamed from: h */
        private float f387029h = -1.0f;

        /* renamed from: i */
        private int f387030i;

        /* renamed from: j */
        private int f387031j;

        /* renamed from: k */
        private int f387032k = 16777215;

        /* renamed from: l */
        private int f387033l = 16777215;

        /* renamed from: m */
        private boolean f387034m;

        public LayoutParams() {
            super(-2, -2);
        }

        /* renamed from: a */
        public final float mo117337a() {
            return this.f387029h;
        }

        /* renamed from: b */
        public final float mo117338b() {
            return this.f387026a;
        }

        /* renamed from: c */
        public final float mo117339c() {
            return this.f387027b;
        }

        /* renamed from: d */
        public final int mo117340d() {
            return this.f387028g;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final int mo117341e() {
            return this.height;
        }

        /* renamed from: f */
        public final int mo117342f() {
            return this.bottomMargin;
        }

        /* renamed from: g */
        public final int mo117343g() {
            return this.leftMargin;
        }

        /* renamed from: h */
        public final int mo117344h() {
            return this.rightMargin;
        }

        /* renamed from: i */
        public final int mo117345i() {
            return this.topMargin;
        }

        /* renamed from: j */
        public final int mo117346j() {
            return this.f387033l;
        }

        /* renamed from: k */
        public final int mo117347k() {
            return this.f387032k;
        }

        /* renamed from: l */
        public final int mo117348l() {
            return this.f387031j;
        }

        /* renamed from: m */
        public final int mo117349m() {
            return this.f387030i;
        }

        /* renamed from: n */
        public final int mo117350n() {
            return 1;
        }

        /* renamed from: o */
        public final int mo117351o() {
            return this.width;
        }

        /* renamed from: p */
        public final boolean mo117352p() {
            return this.f387034m;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f387026a);
            parcel.writeFloat(this.f387027b);
            parcel.writeInt(this.f387028g);
            parcel.writeFloat(this.f387029h);
            parcel.writeInt(this.f387030i);
            parcel.writeInt(this.f387031j);
            parcel.writeInt(this.f387032k);
            parcel.writeInt(this.f387033l);
            parcel.writeByte(this.f387034m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f387026a = parcel.readFloat();
            this.f387027b = parcel.readFloat();
            this.f387028g = parcel.readInt();
            this.f387029h = parcel.readFloat();
            this.f387030i = parcel.readInt();
            this.f387031j = parcel.readInt();
            this.f387032k = parcel.readInt();
            this.f387033l = parcel.readInt();
            this.f387034m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    /* compiled from: PG */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C142645j();

        /* renamed from: a */
        public int f387035a;

        /* renamed from: b */
        public int f387036b;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f387035a = parcel.readInt();
            this.f387036b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f387035a = savedState.f387035a;
            this.f387036b = savedState.f387036b;
        }

        /* renamed from: a */
        public final boolean mo117391a(int i) {
            int i2 = this.f387035a;
            return i2 >= 0 && i2 < i;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "SavedState{mAnchorPosition=" + this.f387035a + ", mAnchorOffset=" + this.f387036b + '}';
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f387035a);
            parcel.writeInt(this.f387036b);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0652fn properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.f2416a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.f2418c) {
                    mo117388w(3);
                } else {
                    mo117388w(2);
                }
            }
        } else if (properties.f2418c) {
            mo117388w(1);
        } else {
            mo117388w(0);
        }
        if (this.f387003b != 1) {
            removeAllViews();
            m231327K();
            this.f387003b = 1;
            this.f387007f = null;
            this.f387015o = null;
            requestLayout();
        }
        if (this.f387008h != 4) {
            removeAllViews();
            m231327K();
            this.f387008h = 4;
            requestLayout();
        }
        setAutoMeasureEnabled(true);
        this.f387022v = context;
    }

    /* renamed from: A */
    private final int m231317A(C0661fw fwVar, C0670ge geVar, C142644i iVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        View view;
        int i9;
        int i10;
        View view2;
        int i11;
        int i12;
        C0661fw fwVar2 = fwVar;
        C142644i iVar2 = iVar;
        int i13 = iVar2.f387075f;
        if (i13 != Integer.MIN_VALUE) {
            int i14 = iVar2.f387070a;
            if (i14 < 0) {
                iVar2.f387075f = i13 + i14;
            }
            m231330N(fwVar2, iVar2);
        }
        int i15 = iVar2.f387070a;
        boolean v = mo117379v();
        int i16 = i15;
        int i17 = 0;
        while (true) {
            if (i16 <= 0 && !this.f387013m.f387071b) {
                break;
            }
            List list = this.f387005d;
            int i18 = iVar2.f387073d;
            if (i18 < 0 || i18 >= geVar.mo3052a() || (i = iVar2.f387072c) < 0 || i >= list.size()) {
                break;
            }
            C142637b bVar = (C142637b) this.f387005d.get(iVar2.f387072c);
            iVar2.f387073d = bVar.f387051o;
            if (mo117379v()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i19 = iVar2.f387074e;
                if (iVar2.f387078i == -1) {
                    i19 -= bVar.f387043g;
                }
                int i20 = iVar2.f387073d;
                float f = (float) this.f387014n.f387065d;
                float f2 = ((float) paddingLeft) - f;
                float f3 = ((float) (width - paddingRight)) - f;
                float max = Math.max(0.0f, 0.0f);
                int i21 = bVar.f387044h;
                int i22 = i20;
                int i23 = 0;
                while (i22 < i20 + i21) {
                    View o = mo117369o(i22);
                    int i24 = i20;
                    int i25 = i15;
                    if (iVar2.f387078i == 1) {
                        calculateItemDecorationsForChild(o, f387001g);
                        addView(o);
                    } else {
                        calculateItemDecorationsForChild(o, f387001g);
                        addView(o, i23);
                        i23++;
                    }
                    int i26 = i23;
                    long j = this.f387006e.f387059c[i22];
                    int i27 = (int) j;
                    int i28 = (int) (j >> 32);
                    LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                    if (m231337U(o, i27, i28, layoutParams)) {
                        o.measure(i27, i28);
                    }
                    float leftDecorationWidth = ((float) (layoutParams.leftMargin + getLeftDecorationWidth(o))) + f2;
                    float rightDecorationWidth = f3 - ((float) (layoutParams.rightMargin + getRightDecorationWidth(o)));
                    int topDecorationHeight = i19 + getTopDecorationHeight(o);
                    if (this.f387004c) {
                        i12 = i22;
                        i11 = i21;
                        i10 = i19;
                        view2 = o;
                        this.f387006e.mo117413i(o, bVar, Math.round(rightDecorationWidth) - o.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + o.getMeasuredHeight());
                    } else {
                        i10 = i19;
                        i12 = i22;
                        i11 = i21;
                        view2 = o;
                        this.f387006e.mo117413i(view2, bVar, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + view2.getMeasuredWidth(), topDecorationHeight + view2.getMeasuredHeight());
                    }
                    View view3 = view2;
                    f2 = ((float) (view2.getMeasuredWidth() + layoutParams.rightMargin + getRightDecorationWidth(view3))) + max + leftDecorationWidth;
                    f3 = rightDecorationWidth - (((float) ((view3.getMeasuredWidth() + layoutParams.leftMargin) + getLeftDecorationWidth(view3))) + max);
                    i22 = i12 + 1;
                    i20 = i24;
                    i15 = i25;
                    i23 = i26;
                    i21 = i11;
                    i19 = i10;
                }
                i3 = i15;
                iVar2.f387072c += this.f387013m.f387078i;
                i4 = bVar.f387043g;
                i2 = i16;
            } else {
                i3 = i15;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i29 = iVar2.f387074e;
                if (iVar2.f387078i == -1) {
                    int i30 = bVar.f387043g;
                    i5 = i29 + i30;
                    i6 = i29 - i30;
                } else {
                    i6 = i29;
                    i5 = i6;
                }
                int i31 = iVar2.f387073d;
                float f4 = (float) this.f387014n.f387065d;
                float f5 = ((float) paddingTop) - f4;
                float f6 = ((float) (height - paddingBottom)) - f4;
                float max2 = Math.max(0.0f, 0.0f);
                int i32 = bVar.f387044h;
                int i33 = i31;
                int i34 = 0;
                while (i33 < i31 + i32) {
                    View o2 = mo117369o(i33);
                    int i35 = i16;
                    long j2 = this.f387006e.f387059c[i33];
                    int i36 = (int) j2;
                    int i37 = (int) (j2 >> 32);
                    LayoutParams layoutParams2 = (LayoutParams) o2.getLayoutParams();
                    if (m231337U(o2, i36, i37, layoutParams2)) {
                        o2.measure(i36, i37);
                    }
                    float topDecorationHeight2 = f5 + ((float) (layoutParams2.topMargin + getTopDecorationHeight(o2)));
                    float bottomDecorationHeight = f6 - ((float) (layoutParams2.rightMargin + getBottomDecorationHeight(o2)));
                    if (iVar2.f387078i == 1) {
                        calculateItemDecorationsForChild(o2, f387001g);
                        addView(o2);
                    } else {
                        calculateItemDecorationsForChild(o2, f387001g);
                        addView(o2, i34);
                        i34++;
                    }
                    int i38 = i34;
                    int leftDecorationWidth2 = i6 + getLeftDecorationWidth(o2);
                    int rightDecorationWidth2 = i5 - getRightDecorationWidth(o2);
                    if (!this.f387004c) {
                        view = o2;
                        i8 = i33;
                        i7 = i32;
                        i9 = i31;
                        if (this.f387010j) {
                            this.f387006e.mo117414j(view, bVar, false, leftDecorationWidth2, Math.round(bottomDecorationHeight) - view.getMeasuredHeight(), leftDecorationWidth2 + view.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                        } else {
                            this.f387006e.mo117414j(view, bVar, false, leftDecorationWidth2, Math.round(topDecorationHeight2), leftDecorationWidth2 + view.getMeasuredWidth(), Math.round(topDecorationHeight2) + view.getMeasuredHeight());
                        }
                    } else if (this.f387010j) {
                        view = o2;
                        i8 = i33;
                        i7 = i32;
                        i9 = i31;
                        this.f387006e.mo117414j(o2, bVar, true, rightDecorationWidth2 - o2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - o2.getMeasuredHeight(), rightDecorationWidth2, Math.round(bottomDecorationHeight));
                    } else {
                        view = o2;
                        i8 = i33;
                        i7 = i32;
                        i9 = i31;
                        this.f387006e.mo117414j(view, bVar, true, rightDecorationWidth2 - view.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth2, Math.round(topDecorationHeight2) + view.getMeasuredHeight());
                    }
                    View view4 = view;
                    f5 = topDecorationHeight2 + ((float) (view.getMeasuredHeight() + layoutParams2.topMargin + getBottomDecorationHeight(view4))) + max2;
                    f6 = bottomDecorationHeight - (((float) ((view4.getMeasuredHeight() + layoutParams2.bottomMargin) + getTopDecorationHeight(view4))) + max2);
                    i33 = i8 + 1;
                    i34 = i38;
                    i16 = i35;
                    i31 = i9;
                    i32 = i7;
                }
                i2 = i16;
                iVar2.f387072c += this.f387013m.f387078i;
                i4 = bVar.f387043g;
            }
            i17 += i4;
            if (v || !this.f387004c) {
                iVar2.f387074e += bVar.f387043g * iVar2.f387078i;
            } else {
                iVar2.f387074e -= bVar.f387043g * iVar2.f387078i;
            }
            i16 = i2 - bVar.f387043g;
            i15 = i3;
        }
        int i39 = i15;
        int i40 = iVar2.f387070a - i17;
        iVar2.f387070a = i40;
        int i41 = iVar2.f387075f;
        if (i41 != Integer.MIN_VALUE) {
            int i42 = i41 + i17;
            iVar2.f387075f = i42;
            if (i40 < 0) {
                iVar2.f387075f = i42 + i40;
            }
            m231330N(fwVar2, iVar2);
        }
        return i39 - iVar2.f387070a;
    }

    /* renamed from: D */
    private final int m231320D(int i, C0661fw fwVar, C0670ge geVar) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m231329M();
        this.f387013m.f387079j = true;
        boolean z = !mo117379v() && this.f387004c;
        int i3 = (!z ? i <= 0 : i >= 0) ? -1 : 1;
        int abs = Math.abs(i);
        this.f387013m.f387078i = i3;
        boolean v = mo117379v();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z2 = !v && this.f387004c;
        if (i3 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.f387013m.f387074e = this.f387007f.mo2838a(childAt);
            int position = getPosition(childAt);
            View I = m231325I(childAt, (C142637b) this.f387005d.get(this.f387006e.f387058b[position]));
            C142644i iVar = this.f387013m;
            iVar.f387077h = 1;
            int i4 = position + 1;
            iVar.f387073d = i4;
            int[] iArr = this.f387006e.f387058b;
            if (iArr.length <= i4) {
                iVar.f387072c = -1;
            } else {
                iVar.f387072c = iArr[i4];
            }
            if (z2) {
                iVar.f387074e = this.f387007f.mo2841d(I);
                this.f387013m.f387075f = (-this.f387007f.mo2841d(I)) + this.f387007f.mo2847j();
                C142644i iVar2 = this.f387013m;
                int i5 = iVar2.f387075f;
                if (i5 < 0) {
                    i5 = 0;
                }
                iVar2.f387075f = i5;
            } else {
                iVar.f387074e = this.f387007f.mo2838a(I);
                this.f387013m.f387075f = this.f387007f.mo2838a(I) - this.f387007f.mo2843f();
            }
            int i6 = this.f387013m.f387072c;
            if ((i6 == -1 || i6 > this.f387005d.size() - 1) && this.f387013m.f387073d <= this.f387012l.mo3052a()) {
                int i7 = abs - this.f387013m.f387075f;
                this.f387025y.mo117402a();
                if (i7 > 0) {
                    if (v) {
                        this.f387006e.mo117406b(this.f387025y, makeMeasureSpec, makeMeasureSpec2, i7, this.f387013m.f387073d, -1, this.f387005d);
                    } else {
                        this.f387006e.mo117406b(this.f387025y, makeMeasureSpec2, makeMeasureSpec, i7, this.f387013m.f387073d, -1, this.f387005d);
                    }
                    this.f387006e.mo117409e(makeMeasureSpec, makeMeasureSpec2, this.f387013m.f387073d);
                    this.f387006e.mo117415k(this.f387013m.f387073d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.f387013m.f387074e = this.f387007f.mo2841d(childAt2);
            int position2 = getPosition(childAt2);
            View G = m231323G(childAt2, (C142637b) this.f387005d.get(this.f387006e.f387058b[position2]));
            C142644i iVar3 = this.f387013m;
            iVar3.f387077h = 1;
            int i8 = this.f387006e.f387058b[position2];
            if (i8 == -1) {
                i8 = 0;
            }
            if (i8 > 0) {
                this.f387013m.f387073d = position2 - ((C142637b) this.f387005d.get(i8 - 1)).f387044h;
            } else {
                iVar3.f387073d = -1;
            }
            C142644i iVar4 = this.f387013m;
            iVar4.f387072c = i8 > 0 ? i8 - 1 : 0;
            if (z2) {
                iVar4.f387074e = this.f387007f.mo2838a(G);
                this.f387013m.f387075f = this.f387007f.mo2838a(G) - this.f387007f.mo2843f();
                C142644i iVar5 = this.f387013m;
                int i9 = iVar5.f387075f;
                if (i9 < 0) {
                    i9 = 0;
                }
                iVar5.f387075f = i9;
            } else {
                iVar4.f387074e = this.f387007f.mo2841d(G);
                this.f387013m.f387075f = (-this.f387007f.mo2841d(G)) + this.f387007f.mo2847j();
            }
        }
        C142644i iVar6 = this.f387013m;
        int i10 = iVar6.f387075f;
        iVar6.f387070a = abs - i10;
        int A = i10 + m231317A(fwVar, geVar, iVar6);
        if (A < 0) {
            return 0;
        }
        if (z) {
            if (abs > A) {
                i2 = (-i3) * A;
                this.f387007f.mo2851n(-i2);
                this.f387013m.f387076g = i2;
                return i2;
            }
        } else if (abs > A) {
            i2 = i3 * A;
            this.f387007f.mo2851n(-i2);
            this.f387013m.f387076g = i2;
            return i2;
        }
        i2 = i;
        this.f387007f.mo2851n(-i2);
        this.f387013m.f387076g = i2;
        return i2;
    }

    /* renamed from: E */
    private final int m231321E(int i) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m231329M();
        boolean v = mo117379v();
        int width = v ? this.f387023w.getWidth() : this.f387023w.getHeight();
        int width2 = v ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + this.f387014n.f387065d) - width, abs);
            }
            i2 = this.f387014n.f387065d;
            if (i2 + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((width2 - this.f387014n.f387065d) - width, i);
        } else {
            i2 = this.f387014n.f387065d;
            if (i2 + i >= 0) {
                return i;
            }
        }
        return -i2;
    }

    /* renamed from: F */
    private final View m231322F(int i) {
        int i2;
        View J = m231326J(0, getChildCount(), i);
        if (J == null || (i2 = this.f387006e.f387058b[getPosition(J)]) == -1) {
            return null;
        }
        return m231323G(J, (C142637b) this.f387005d.get(i2));
    }

    /* renamed from: G */
    private final View m231323G(View view, C142637b bVar) {
        boolean v = mo117379v();
        int i = bVar.f387044h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f387004c || v) {
                    if (this.f387007f.mo2841d(view) <= this.f387007f.mo2841d(childAt)) {
                    }
                } else if (this.f387007f.mo2838a(view) >= this.f387007f.mo2838a(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: H */
    private final View m231324H(int i) {
        View J = m231326J(getChildCount() - 1, -1, i);
        if (J == null) {
            return null;
        }
        return m231325I(J, (C142637b) this.f387005d.get(this.f387006e.f387058b[getPosition(J)]));
    }

    /* renamed from: I */
    private final View m231325I(View view, C142637b bVar) {
        boolean v = mo117379v();
        int childCount = (getChildCount() - bVar.f387044h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f387004c || v) {
                    if (this.f387007f.mo2838a(view) >= this.f387007f.mo2838a(childAt)) {
                    }
                } else if (this.f387007f.mo2841d(view) <= this.f387007f.mo2841d(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: J */
    private final View m231326J(int i, int i2, int i3) {
        m231329M();
        m231328L();
        int j = this.f387007f.mo2847j();
        int f = this.f387007f.mo2843f();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((C0654fp) childAt.getLayoutParams()).f2420c.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f387007f.mo2841d(childAt) >= j && this.f387007f.mo2838a(childAt) <= f) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: K */
    private final void m231327K() {
        this.f387005d.clear();
        this.f387014n.mo117419b();
        this.f387014n.f387065d = 0;
    }

    /* renamed from: L */
    private final void m231328L() {
        if (this.f387013m == null) {
            this.f387013m = new C142644i();
        }
    }

    /* renamed from: N */
    private final void m231330N(C0661fw fwVar, C142644i iVar) {
        int childCount;
        if (!iVar.f387079j) {
            return;
        }
        if (iVar.f387078i == -1) {
            if (iVar.f387075f >= 0) {
                this.f387007f.mo2842e();
                int i = iVar.f387075f;
                int childCount2 = getChildCount();
                if (childCount2 != 0) {
                    int i2 = childCount2 - 1;
                    int i3 = this.f387006e.f387058b[getPosition(getChildAt(i2))];
                    if (i3 != -1) {
                        C142637b bVar = (C142637b) this.f387005d.get(i3);
                        int i4 = i2;
                        while (true) {
                            if (i4 < 0) {
                                break;
                            }
                            View childAt = getChildAt(i4);
                            int i5 = iVar.f387075f;
                            if (!mo117379v() && this.f387004c) {
                                if (this.f387007f.mo2838a(childAt) > i5) {
                                    break;
                                }
                            } else if (this.f387007f.mo2841d(childAt) < this.f387007f.mo2842e() - i5) {
                                break;
                            }
                            if (bVar.f387051o == getPosition(childAt)) {
                                if (i3 <= 0) {
                                    childCount2 = i4;
                                    break;
                                }
                                i3 += iVar.f387078i;
                                bVar = (C142637b) this.f387005d.get(i3);
                                childCount2 = i4;
                            }
                            i4--;
                        }
                        m231331O(fwVar, childCount2, i2);
                    }
                }
            }
        } else if (iVar.f387075f >= 0 && (childCount = getChildCount()) != 0) {
            int i6 = this.f387006e.f387058b[getPosition(getChildAt(0))];
            if (i6 != -1) {
                C142637b bVar2 = (C142637b) this.f387005d.get(i6);
                int i7 = 0;
                int i8 = -1;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt2 = getChildAt(i7);
                    int i9 = iVar.f387075f;
                    if (!mo117379v() && this.f387004c) {
                        if (this.f387007f.mo2842e() - this.f387007f.mo2841d(childAt2) > i9) {
                            break;
                        }
                    } else if (this.f387007f.mo2838a(childAt2) > i9) {
                        break;
                    }
                    if (bVar2.f387052p == getPosition(childAt2)) {
                        if (i6 >= this.f387005d.size() - 1) {
                            break;
                        }
                        i6 += iVar.f387078i;
                        bVar2 = (C142637b) this.f387005d.get(i6);
                        i8 = i7;
                    }
                    i7++;
                }
                i7 = i8;
                m231331O(fwVar, 0, i7);
            }
        }
    }

    /* renamed from: O */
    private final void m231331O(C0661fw fwVar, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, fwVar);
            i2--;
        }
    }

    /* renamed from: P */
    private final void m231332P() {
        int i;
        if (mo117379v()) {
            i = getHeightMode();
        } else {
            i = getWidthMode();
        }
        C142644i iVar = this.f387013m;
        boolean z = true;
        if (!(i == 0 || i == Integer.MIN_VALUE)) {
            z = false;
        }
        iVar.f387071b = z;
    }

    /* renamed from: Q */
    private final void m231333Q(int i) {
        int a = mo117386a();
        int b = mo117387b();
        if (i < b) {
            int childCount = getChildCount();
            this.f387006e.mo117411g(childCount);
            this.f387006e.mo117412h(childCount);
            this.f387006e.mo117410f(childCount);
            if (i < this.f387006e.f387058b.length) {
                this.f387024x = i;
                View childAt = getChildAt(0);
                if (childAt != null) {
                    if (a > i || i > b) {
                        this.f387017q = getPosition(childAt);
                        if (mo117379v() || !this.f387004c) {
                            this.f387018r = this.f387007f.mo2841d(childAt) - this.f387007f.mo2847j();
                        } else {
                            this.f387018r = this.f387007f.mo2838a(childAt) + this.f387007f.mo2844g();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: R */
    private final void m231334R(C142642g gVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            m231332P();
        } else {
            this.f387013m.f387071b = false;
        }
        if (mo117379v() || !this.f387004c) {
            this.f387013m.f387070a = this.f387007f.mo2843f() - gVar.f387064c;
        } else {
            this.f387013m.f387070a = gVar.f387064c - getPaddingRight();
        }
        C142644i iVar = this.f387013m;
        iVar.f387073d = gVar.f387062a;
        iVar.f387077h = 1;
        iVar.f387078i = 1;
        iVar.f387074e = gVar.f387064c;
        iVar.f387075f = LinearLayoutManager.INVALID_OFFSET;
        iVar.f387072c = gVar.f387063b;
        if (z && this.f387005d.size() > 1 && (i = gVar.f387063b) >= 0 && i < this.f387005d.size() - 1) {
            C142644i iVar2 = this.f387013m;
            iVar2.f387072c++;
            iVar2.f387073d += ((C142637b) this.f387005d.get(gVar.f387063b)).f387044h;
        }
    }

    /* renamed from: S */
    private final void m231335S(C142642g gVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            m231332P();
        } else {
            this.f387013m.f387071b = false;
        }
        if (mo117379v() || !this.f387004c) {
            this.f387013m.f387070a = gVar.f387064c - this.f387007f.mo2847j();
        } else {
            this.f387013m.f387070a = (this.f387023w.getWidth() - gVar.f387064c) - this.f387007f.mo2847j();
        }
        C142644i iVar = this.f387013m;
        iVar.f387073d = gVar.f387062a;
        iVar.f387077h = 1;
        iVar.f387078i = -1;
        iVar.f387074e = gVar.f387064c;
        iVar.f387075f = LinearLayoutManager.INVALID_OFFSET;
        iVar.f387072c = gVar.f387063b;
        if (z && gVar.f387063b > 0 && this.f387005d.size() > (i = gVar.f387063b)) {
            C142644i iVar2 = this.f387013m;
            iVar2.f387072c--;
            iVar2.f387073d -= ((C142637b) this.f387005d.get(i)).f387044h;
        }
    }

    /* renamed from: T */
    private static boolean m231336T(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: U */
    private final boolean m231337U(View view, int i, int i2, C0654fp fpVar) {
        return view.isLayoutRequested() || !isMeasurementCacheEnabled() || !m231336T(view.getWidth(), i, fpVar.width) || !m231336T(view.getHeight(), i2, fpVar.height);
    }

    /* renamed from: V */
    private final View m231338V(int i, int i2) {
        int i3 = i2;
        int i4 = i;
        int i5 = i3 > i4 ? 1 : -1;
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt);
            int i6 = ((C0654fp) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((C0654fp) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((C0654fp) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((C0654fp) childAt.getLayoutParams()).bottomMargin;
            int i7 = width - paddingRight;
            boolean z = false;
            boolean z2 = decoratedLeft - i6 >= i7 || decoratedRight >= paddingLeft;
            if (decoratedTop >= height || decoratedBottom >= paddingTop) {
                z = true;
            }
            if (z2 && z) {
                return childAt;
            }
            i4 += i5;
        }
        return null;
    }

    /* renamed from: x */
    private final int m231339x(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int a = geVar.mo3052a();
        m231329M();
        View F = m231322F(a);
        View H = m231324H(a);
        if (geVar.mo3052a() == 0 || F == null || H == null) {
            return 0;
        }
        return Math.min(this.f387007f.mo2848k(), this.f387007f.mo2838a(H) - this.f387007f.mo2841d(F));
    }

    /* renamed from: y */
    private final int m231340y(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int a = geVar.mo3052a();
        View F = m231322F(a);
        View H = m231324H(a);
        if (!(geVar.mo3052a() == 0 || F == null || H == null)) {
            int position = getPosition(F);
            int position2 = getPosition(H);
            int abs = Math.abs(this.f387007f.mo2838a(H) - this.f387007f.mo2841d(F));
            int[] iArr = this.f387006e.f387058b;
            int i = iArr[position];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[position2] - i) + 1)))) + ((float) (this.f387007f.mo2847j() - this.f387007f.mo2841d(F))));
            }
        }
        return 0;
    }

    /* renamed from: z */
    private final int m231341z(C0670ge geVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int a = geVar.mo3052a();
        View F = m231322F(a);
        View H = m231324H(a);
        if (geVar.mo3052a() == 0 || F == null || H == null) {
            return 0;
        }
        int a2 = mo117386a();
        return (int) ((((float) Math.abs(this.f387007f.mo2838a(H) - this.f387007f.mo2841d(F))) / ((float) ((mo117387b() - a2) + 1))) * ((float) geVar.mo3052a()));
    }

    /* renamed from: a */
    public final int mo117386a() {
        View V = m231338V(0, getChildCount());
        if (V == null) {
            return -1;
        }
        return getPosition(V);
    }

    /* renamed from: b */
    public final int mo117387b() {
        View V = m231338V(getChildCount() - 1, -1);
        if (V == null) {
            return -1;
        }
        return getPosition(V);
    }

    /* renamed from: c */
    public final int mo117354c() {
        return 5;
    }

    public final boolean canScrollHorizontally() {
        return !mo117379v() || getWidth() > this.f387023w.getWidth();
    }

    public final boolean canScrollVertically() {
        return mo117379v() || getHeight() > this.f387023w.getHeight();
    }

    public final boolean checkLayoutParams(C0654fp fpVar) {
        return fpVar instanceof LayoutParams;
    }

    public final int computeHorizontalScrollExtent(C0670ge geVar) {
        return m231339x(geVar);
    }

    public final int computeHorizontalScrollOffset(C0670ge geVar) {
        m231340y(geVar);
        return m231340y(geVar);
    }

    public final int computeHorizontalScrollRange(C0670ge geVar) {
        return m231341z(geVar);
    }

    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = i < getPosition(getChildAt(0)) ? -1 : 1;
        if (mo117379v()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    public final int computeVerticalScrollExtent(C0670ge geVar) {
        return m231339x(geVar);
    }

    public final int computeVerticalScrollOffset(C0670ge geVar) {
        return m231340y(geVar);
    }

    public final int computeVerticalScrollRange(C0670ge geVar) {
        return m231341z(geVar);
    }

    /* renamed from: d */
    public final int mo117356d() {
        return this.f387008h;
    }

    /* renamed from: e */
    public final int mo117357e(int i, int i2, int i3) {
        return getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    /* renamed from: f */
    public final int mo117358f(int i, int i2, int i3) {
        return getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    /* renamed from: g */
    public final int mo117359g(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (mo117379v()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    public final C0654fp generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final C0654fp generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: h */
    public final int mo117362h(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (mo117379v()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    /* renamed from: i */
    public final int mo117363i() {
        return this.f387002a;
    }

    /* renamed from: j */
    public final int mo117364j() {
        return this.f387012l.mo3052a();
    }

    /* renamed from: k */
    public final int mo117365k() {
        return this.f387003b;
    }

    /* renamed from: l */
    public final int mo117366l() {
        if (this.f387005d.size() == 0) {
            return 0;
        }
        int size = this.f387005d.size();
        int i = LinearLayoutManager.INVALID_OFFSET;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((C142637b) this.f387005d.get(i2)).f387041e);
        }
        return i;
    }

    /* renamed from: m */
    public final int mo117367m() {
        return this.f387009i;
    }

    /* renamed from: n */
    public final int mo117368n() {
        int size = this.f387005d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C142637b) this.f387005d.get(i2)).f387043g;
        }
        return i;
    }

    /* renamed from: o */
    public final View mo117369o(int i) {
        View view = (View) this.f387021u.get(i);
        if (view != null) {
            return view;
        }
        return this.f387011k.mo3039p(i);
    }

    public final void onAdapterChanged(C0640fb fbVar, C0640fb fbVar2) {
        removeAllViews();
    }

    public final void onAttachedToWindow(RecyclerView recyclerView) {
        this.f387023w = (View) recyclerView.getParent();
    }

    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m231333Q(i);
    }

    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m231333Q(Math.min(i, i2));
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m231333Q(i);
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        m231333Q(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r5 == 1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r5 != 1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r5 == 1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChildren(android.support.p033v7.widget.C0661fw r20, android.support.p033v7.widget.C0670ge r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r0.f387011k = r1
            r0.f387012l = r2
            int r3 = r21.mo3052a()
            r4 = 0
            if (r3 != 0) goto L_0x0018
            boolean r3 = r2.f2462g
            if (r3 != 0) goto L_0x0017
            r3 = 0
            goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            int r5 = r19.getLayoutDirection()
            int r6 = r0.f387002a
            r7 = 1
            if (r6 == 0) goto L_0x0036
            if (r6 == r7) goto L_0x0033
            r8 = 2
            if (r6 == r8) goto L_0x0030
            if (r5 != r7) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r0.f387004c = r5
            r0.f387010j = r7
            goto L_0x003f
        L_0x0030:
            if (r5 != r7) goto L_0x003a
            goto L_0x0038
        L_0x0033:
            if (r5 == r7) goto L_0x003a
            goto L_0x0038
        L_0x0036:
            if (r5 != r7) goto L_0x003a
        L_0x0038:
            r5 = 1
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            r0.f387004c = r5
            r0.f387010j = r4
        L_0x003f:
            r19.m231329M()
            r19.m231328L()
            com.google.android.flexbox.e r5 = r0.f387006e
            r5.mo117411g(r3)
            com.google.android.flexbox.e r5 = r0.f387006e
            r5.mo117412h(r3)
            com.google.android.flexbox.e r5 = r0.f387006e
            r5.mo117410f(r3)
            com.google.android.flexbox.i r5 = r0.f387013m
            r5.f387079j = r4
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r5 = r0.f387016p
            if (r5 == 0) goto L_0x0066
            boolean r6 = r5.mo117391a(r3)
            if (r6 == 0) goto L_0x0066
            int r6 = r5.f387035a
            r0.f387017q = r6
        L_0x0066:
            com.google.android.flexbox.g r6 = r0.f387014n
            boolean r8 = r6.f387067f
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = -1
            if (r8 == 0) goto L_0x0075
            int r8 = r0.f387017q
            if (r8 != r10) goto L_0x0075
            if (r5 == 0) goto L_0x024d
        L_0x0075:
            r6.mo117419b()
            com.google.android.flexbox.g r5 = r0.f387014n
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r6 = r0.f387016p
            boolean r8 = r2.f2462g
            if (r8 != 0) goto L_0x016e
            int r8 = r0.f387017q
            if (r8 != r10) goto L_0x0086
            goto L_0x016e
        L_0x0086:
            if (r8 < 0) goto L_0x016a
            int r11 = r21.mo3052a()
            if (r8 < r11) goto L_0x0090
            goto L_0x016a
        L_0x0090:
            int r8 = r0.f387017q
            r5.f387062a = r8
            com.google.android.flexbox.e r11 = r0.f387006e
            int[] r11 = r11.f387058b
            r8 = r11[r8]
            r5.f387063b = r8
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r8 = r0.f387016p
            if (r8 == 0) goto L_0x00bb
            int r11 = r21.mo3052a()
            boolean r8 = r8.mo117391a(r11)
            if (r8 == 0) goto L_0x00bb
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2847j()
            int r6 = r6.f387036b
            int r8 = r8 + r6
            r5.f387064c = r8
            r5.f387068g = r7
            r5.f387063b = r10
            goto L_0x0249
        L_0x00bb:
            int r6 = r0.f387018r
            if (r6 != r9) goto L_0x0148
            int r6 = r0.f387017q
            android.view.View r6 = r0.findViewByPosition(r6)
            if (r6 == 0) goto L_0x012c
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2839b(r6)
            android.support.v7.widget.eo r11 = r0.f387007f
            int r11 = r11.mo2848k()
            if (r8 <= r11) goto L_0x00da
            r5.mo117418a()
            goto L_0x0249
        L_0x00da:
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2841d(r6)
            android.support.v7.widget.eo r11 = r0.f387007f
            int r11 = r11.mo2847j()
            int r8 = r8 - r11
            if (r8 >= 0) goto L_0x00f5
            android.support.v7.widget.eo r6 = r0.f387007f
            int r6 = r6.mo2847j()
            r5.f387064c = r6
            r5.f387066e = r4
            goto L_0x0249
        L_0x00f5:
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2843f()
            android.support.v7.widget.eo r11 = r0.f387007f
            int r11 = r11.mo2838a(r6)
            int r8 = r8 - r11
            if (r8 >= 0) goto L_0x0110
            android.support.v7.widget.eo r6 = r0.f387007f
            int r6 = r6.mo2843f()
            r5.f387064c = r6
            r5.f387066e = r7
            goto L_0x0249
        L_0x0110:
            boolean r8 = r5.f387066e
            if (r8 == 0) goto L_0x0122
            android.support.v7.widget.eo r8 = r0.f387007f
            int r6 = r8.mo2838a(r6)
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2852o()
            int r6 = r6 + r8
            goto L_0x0128
        L_0x0122:
            android.support.v7.widget.eo r8 = r0.f387007f
            int r6 = r8.mo2841d(r6)
        L_0x0128:
            r5.f387064c = r6
            goto L_0x0249
        L_0x012c:
            int r6 = r19.getChildCount()
            if (r6 <= 0) goto L_0x0143
            android.view.View r6 = r0.getChildAt(r4)
            int r6 = r0.getPosition(r6)
            int r8 = r0.f387017q
            if (r8 >= r6) goto L_0x0140
            r6 = 1
            goto L_0x0141
        L_0x0140:
            r6 = 0
        L_0x0141:
            r5.f387066e = r6
        L_0x0143:
            r5.mo117418a()
            goto L_0x0249
        L_0x0148:
            boolean r8 = r19.mo117379v()
            if (r8 != 0) goto L_0x015d
            boolean r8 = r0.f387004c
            if (r8 == 0) goto L_0x015d
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2844g()
            int r6 = r6 - r8
            r5.f387064c = r6
            goto L_0x0249
        L_0x015d:
            android.support.v7.widget.eo r6 = r0.f387007f
            int r6 = r6.mo2847j()
            int r8 = r0.f387018r
            int r6 = r6 + r8
            r5.f387064c = r6
            goto L_0x0249
        L_0x016a:
            r0.f387017q = r10
            r0.f387018r = r9
        L_0x016e:
            int r6 = r19.getChildCount()
            if (r6 != 0) goto L_0x0176
            goto L_0x0242
        L_0x0176:
            boolean r6 = r5.f387066e
            if (r6 == 0) goto L_0x0183
            int r6 = r21.mo3052a()
            android.view.View r6 = r0.m231324H(r6)
            goto L_0x018b
        L_0x0183:
            int r6 = r21.mo3052a()
            android.view.View r6 = r0.m231322F(r6)
        L_0x018b:
            if (r6 == 0) goto L_0x0242
            com.google.android.flexbox.FlexboxLayoutManager r8 = r5.f387069h
            boolean r11 = r8.mo117379v()
            if (r11 != 0) goto L_0x01b8
            boolean r11 = r8.f387004c
            if (r11 == 0) goto L_0x01b8
            boolean r11 = r5.f387066e
            if (r11 == 0) goto L_0x01af
            android.support.v7.widget.eo r8 = r8.f387007f
            int r8 = r8.mo2841d(r6)
            com.google.android.flexbox.FlexboxLayoutManager r11 = r5.f387069h
            android.support.v7.widget.eo r11 = r11.f387007f
            int r11 = r11.mo2852o()
            int r8 = r8 + r11
            r5.f387064c = r8
            goto L_0x01d6
        L_0x01af:
            android.support.v7.widget.eo r8 = r8.f387007f
            int r8 = r8.mo2838a(r6)
            r5.f387064c = r8
            goto L_0x01d6
        L_0x01b8:
            boolean r11 = r5.f387066e
            if (r11 == 0) goto L_0x01ce
            android.support.v7.widget.eo r8 = r8.f387007f
            int r8 = r8.mo2838a(r6)
            com.google.android.flexbox.FlexboxLayoutManager r11 = r5.f387069h
            android.support.v7.widget.eo r11 = r11.f387007f
            int r11 = r11.mo2852o()
            int r8 = r8 + r11
            r5.f387064c = r8
            goto L_0x01d6
        L_0x01ce:
            android.support.v7.widget.eo r8 = r8.f387007f
            int r8 = r8.mo2841d(r6)
            r5.f387064c = r8
        L_0x01d6:
            com.google.android.flexbox.FlexboxLayoutManager r8 = r5.f387069h
            int r8 = r8.getPosition(r6)
            r5.f387062a = r8
            r5.f387068g = r4
            com.google.android.flexbox.FlexboxLayoutManager r11 = r5.f387069h
            com.google.android.flexbox.e r12 = r11.f387006e
            int[] r12 = r12.f387058b
            if (r8 != r10) goto L_0x01e9
            r8 = 0
        L_0x01e9:
            r8 = r12[r8]
            if (r8 != r10) goto L_0x01ee
            r8 = 0
        L_0x01ee:
            r5.f387063b = r8
            java.util.List r8 = r11.f387005d
            int r8 = r8.size()
            int r11 = r5.f387063b
            if (r8 <= r11) goto L_0x0208
            com.google.android.flexbox.FlexboxLayoutManager r8 = r5.f387069h
            java.util.List r8 = r8.f387005d
            java.lang.Object r8 = r8.get(r11)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.C142637b) r8
            int r8 = r8.f387051o
            r5.f387062a = r8
        L_0x0208:
            boolean r8 = r2.f2462g
            if (r8 != 0) goto L_0x0249
            boolean r8 = r19.supportsPredictiveItemAnimations()
            if (r8 == 0) goto L_0x0249
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2841d(r6)
            android.support.v7.widget.eo r11 = r0.f387007f
            int r11 = r11.mo2843f()
            if (r8 >= r11) goto L_0x022e
            android.support.v7.widget.eo r8 = r0.f387007f
            int r6 = r8.mo2838a(r6)
            android.support.v7.widget.eo r8 = r0.f387007f
            int r8 = r8.mo2847j()
            if (r6 >= r8) goto L_0x0249
        L_0x022e:
            boolean r6 = r5.f387066e
            if (r6 == 0) goto L_0x0239
            android.support.v7.widget.eo r6 = r0.f387007f
            int r6 = r6.mo2843f()
            goto L_0x023f
        L_0x0239:
            android.support.v7.widget.eo r6 = r0.f387007f
            int r6 = r6.mo2847j()
        L_0x023f:
            r5.f387064c = r6
            goto L_0x0249
        L_0x0242:
            r5.mo117418a()
            r5.f387062a = r4
            r5.f387063b = r4
        L_0x0249:
            com.google.android.flexbox.g r5 = r0.f387014n
            r5.f387067f = r7
        L_0x024d:
            r19.detachAndScrapAttachedViews(r20)
            com.google.android.flexbox.g r5 = r0.f387014n
            boolean r6 = r5.f387066e
            if (r6 == 0) goto L_0x025a
            r0.m231335S(r5, r4, r7)
            goto L_0x025d
        L_0x025a:
            r0.m231334R(r5, r4, r7)
        L_0x025d:
            int r5 = r19.getWidth()
            int r6 = r19.getWidthMode()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            int r6 = r19.getHeight()
            int r8 = r19.getHeightMode()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r8 = r19.getWidth()
            int r11 = r19.getHeight()
            boolean r12 = r19.mo117379v()
            if (r12 == 0) goto L_0x02a2
            int r12 = r0.f387019s
            if (r12 == r9) goto L_0x028b
            if (r12 == r8) goto L_0x028b
            r9 = 1
            goto L_0x028c
        L_0x028b:
            r9 = 0
        L_0x028c:
            com.google.android.flexbox.i r12 = r0.f387013m
            boolean r13 = r12.f387071b
            if (r13 == 0) goto L_0x029f
            android.content.Context r12 = r0.f387022v
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.heightPixels
            goto L_0x02c0
        L_0x029f:
            int r12 = r12.f387070a
            goto L_0x02c0
        L_0x02a2:
            int r12 = r0.f387020t
            if (r12 == r9) goto L_0x02aa
            if (r12 == r11) goto L_0x02aa
            r9 = 1
            goto L_0x02ab
        L_0x02aa:
            r9 = 0
        L_0x02ab:
            com.google.android.flexbox.i r12 = r0.f387013m
            boolean r13 = r12.f387071b
            if (r13 == 0) goto L_0x02be
            android.content.Context r12 = r0.f387022v
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.widthPixels
            goto L_0x02c0
        L_0x02be:
            int r12 = r12.f387070a
        L_0x02c0:
            r15 = r12
            r0.f387019s = r8
            r0.f387020t = r11
            int r8 = r0.f387024x
            if (r8 != r10) goto L_0x0337
            int r8 = r0.f387017q
            if (r8 != r10) goto L_0x02d2
            if (r9 == 0) goto L_0x02d0
            goto L_0x02d2
        L_0x02d0:
            r8 = -1
            goto L_0x0337
        L_0x02d2:
            com.google.android.flexbox.g r3 = r0.f387014n
            boolean r3 = r3.f387066e
            if (r3 == 0) goto L_0x02da
            goto L_0x03d8
        L_0x02da:
            java.util.List r3 = r0.f387005d
            r3.clear()
            com.google.android.flexbox.c r3 = r0.f387025y
            r3.mo117402a()
            boolean r3 = r19.mo117379v()
            if (r3 == 0) goto L_0x0300
            com.google.android.flexbox.e r11 = r0.f387006e
            com.google.android.flexbox.c r12 = r0.f387025y
            r16 = 0
            com.google.android.flexbox.g r3 = r0.f387014n
            int r3 = r3.f387062a
            java.util.List r8 = r0.f387005d
            r13 = r5
            r14 = r6
            r17 = r3
            r18 = r8
            r11.mo117406b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0315
        L_0x0300:
            com.google.android.flexbox.e r11 = r0.f387006e
            com.google.android.flexbox.c r12 = r0.f387025y
            r16 = 0
            com.google.android.flexbox.g r3 = r0.f387014n
            int r3 = r3.f387062a
            java.util.List r8 = r0.f387005d
            r13 = r6
            r14 = r5
            r17 = r3
            r18 = r8
            r11.mo117406b(r12, r13, r14, r15, r16, r17, r18)
        L_0x0315:
            com.google.android.flexbox.c r3 = r0.f387025y
            java.util.List r3 = r3.f387053a
            r0.f387005d = r3
            com.google.android.flexbox.e r3 = r0.f387006e
            r3.mo117409e(r5, r6, r4)
            com.google.android.flexbox.e r3 = r0.f387006e
            r3.mo117415k(r4)
            com.google.android.flexbox.g r3 = r0.f387014n
            com.google.android.flexbox.e r5 = r0.f387006e
            int[] r5 = r5.f387058b
            int r6 = r3.f387062a
            r5 = r5[r6]
            r3.f387063b = r5
            com.google.android.flexbox.i r3 = r0.f387013m
            r3.f387072c = r5
            goto L_0x03d8
        L_0x0337:
            if (r8 == r10) goto L_0x0342
            com.google.android.flexbox.g r9 = r0.f387014n
            int r9 = r9.f387062a
            int r8 = java.lang.Math.min(r8, r9)
            goto L_0x0346
        L_0x0342:
            com.google.android.flexbox.g r8 = r0.f387014n
            int r8 = r8.f387062a
        L_0x0346:
            com.google.android.flexbox.c r9 = r0.f387025y
            r9.mo117402a()
            boolean r9 = r19.mo117379v()
            if (r9 == 0) goto L_0x038d
            java.util.List r9 = r0.f387005d
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x0376
            com.google.android.flexbox.e r3 = r0.f387006e
            java.util.List r9 = r0.f387005d
            r3.mo117407c(r9, r8)
            com.google.android.flexbox.e r11 = r0.f387006e
            com.google.android.flexbox.c r12 = r0.f387025y
            com.google.android.flexbox.g r3 = r0.f387014n
            int r3 = r3.f387062a
            java.util.List r9 = r0.f387005d
            r13 = r5
            r14 = r6
            r16 = r8
            r17 = r3
            r18 = r9
            r11.mo117406b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03c8
        L_0x0376:
            com.google.android.flexbox.e r9 = r0.f387006e
            r9.mo117410f(r3)
            com.google.android.flexbox.e r11 = r0.f387006e
            com.google.android.flexbox.c r12 = r0.f387025y
            r16 = 0
            r17 = -1
            java.util.List r3 = r0.f387005d
            r13 = r5
            r14 = r6
            r18 = r3
            r11.mo117406b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03c8
        L_0x038d:
            java.util.List r9 = r0.f387005d
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x03b2
            com.google.android.flexbox.e r3 = r0.f387006e
            java.util.List r9 = r0.f387005d
            r3.mo117407c(r9, r8)
            com.google.android.flexbox.e r11 = r0.f387006e
            com.google.android.flexbox.c r12 = r0.f387025y
            com.google.android.flexbox.g r3 = r0.f387014n
            int r3 = r3.f387062a
            java.util.List r9 = r0.f387005d
            r13 = r6
            r14 = r5
            r16 = r8
            r17 = r3
            r18 = r9
            r11.mo117406b(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03c8
        L_0x03b2:
            com.google.android.flexbox.e r9 = r0.f387006e
            r9.mo117410f(r3)
            com.google.android.flexbox.e r11 = r0.f387006e
            com.google.android.flexbox.c r12 = r0.f387025y
            r16 = 0
            r17 = -1
            java.util.List r3 = r0.f387005d
            r13 = r6
            r14 = r5
            r18 = r3
            r11.mo117406b(r12, r13, r14, r15, r16, r17, r18)
        L_0x03c8:
            com.google.android.flexbox.c r3 = r0.f387025y
            java.util.List r3 = r3.f387053a
            r0.f387005d = r3
            com.google.android.flexbox.e r3 = r0.f387006e
            r3.mo117409e(r5, r6, r8)
            com.google.android.flexbox.e r3 = r0.f387006e
            r3.mo117415k(r8)
        L_0x03d8:
            com.google.android.flexbox.g r3 = r0.f387014n
            boolean r3 = r3.f387066e
            if (r3 == 0) goto L_0x03f6
            com.google.android.flexbox.i r3 = r0.f387013m
            r0.m231317A(r1, r2, r3)
            com.google.android.flexbox.i r3 = r0.f387013m
            int r3 = r3.f387074e
            com.google.android.flexbox.g r5 = r0.f387014n
            r0.m231334R(r5, r7, r4)
            com.google.android.flexbox.i r5 = r0.f387013m
            r0.m231317A(r1, r2, r5)
            com.google.android.flexbox.i r5 = r0.f387013m
            int r5 = r5.f387074e
            goto L_0x040d
        L_0x03f6:
            com.google.android.flexbox.i r3 = r0.f387013m
            r0.m231317A(r1, r2, r3)
            com.google.android.flexbox.i r3 = r0.f387013m
            int r5 = r3.f387074e
            com.google.android.flexbox.g r3 = r0.f387014n
            r0.m231335S(r3, r7, r4)
            com.google.android.flexbox.i r3 = r0.f387013m
            r0.m231317A(r1, r2, r3)
            com.google.android.flexbox.i r3 = r0.f387013m
            int r3 = r3.f387074e
        L_0x040d:
            int r6 = r19.getChildCount()
            if (r6 <= 0) goto L_0x042a
            com.google.android.flexbox.g r6 = r0.f387014n
            boolean r6 = r6.f387066e
            if (r6 == 0) goto L_0x0422
            int r5 = r0.m231318B(r5, r1, r2, r7)
            int r3 = r3 + r5
            r0.m231319C(r3, r1, r2, r4)
            return
        L_0x0422:
            int r3 = r0.m231319C(r3, r1, r2, r7)
            int r5 = r5 + r3
            r0.m231318B(r5, r1, r2, r4)
        L_0x042a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(android.support.v7.widget.fw, android.support.v7.widget.ge):void");
    }

    public final void onLayoutCompleted(C0670ge geVar) {
        this.f387016p = null;
        this.f387017q = -1;
        this.f387018r = LinearLayoutManager.INVALID_OFFSET;
        this.f387024x = -1;
        this.f387014n.mo117419b();
        this.f387021u.clear();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f387016p = (SavedState) parcelable;
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f387016p;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            savedState2.f387035a = getPosition(childAt);
            savedState2.f387036b = this.f387007f.mo2841d(childAt) - this.f387007f.mo2847j();
        } else {
            savedState2.f387035a = -1;
        }
        return savedState2;
    }

    /* renamed from: p */
    public final View mo117373p(int i) {
        return mo117369o(i);
    }

    /* renamed from: q */
    public final List mo117374q() {
        return this.f387005d;
    }

    /* renamed from: r */
    public final void mo117375r(View view, int i, int i2, C142637b bVar) {
        calculateItemDecorationsForChild(view, f387001g);
        if (mo117379v()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            bVar.f387041e += leftDecorationWidth;
            bVar.f387042f += leftDecorationWidth;
            return;
        }
        int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
        bVar.f387041e += topDecorationHeight;
        bVar.f387042f += topDecorationHeight;
    }

    /* renamed from: s */
    public final void mo117376s(C142637b bVar) {
    }

    public final int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        if (!mo117379v()) {
            int D = m231320D(i, fwVar, geVar);
            this.f387021u.clear();
            return D;
        }
        int E = m231321E(i);
        this.f387014n.f387065d += E;
        this.f387015o.mo2851n(-E);
        return E;
    }

    public final void scrollToPosition(int i) {
        this.f387017q = i;
        this.f387018r = LinearLayoutManager.INVALID_OFFSET;
        SavedState savedState = this.f387016p;
        if (savedState != null) {
            savedState.f387035a = -1;
        }
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        if (mo117379v()) {
            int D = m231320D(i, fwVar, geVar);
            this.f387021u.clear();
            return D;
        }
        int E = m231321E(i);
        this.f387014n.f387065d += E;
        this.f387015o.mo2851n(-E);
        return E;
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C0602dr drVar = new C0602dr(recyclerView.getContext());
        drVar.f2449g = i;
        startSmoothScroll(drVar);
    }

    /* renamed from: t */
    public final void mo117377t(List list) {
        this.f387005d = list;
    }

    /* renamed from: u */
    public final void mo117378u(int i, View view) {
        this.f387021u.put(i, view);
    }

    /* renamed from: v */
    public final boolean mo117379v() {
        int i = this.f387002a;
        return i == 0 || i == 1;
    }

    /* renamed from: w */
    public final void mo117388w(int i) {
        if (this.f387002a != i) {
            removeAllViews();
            this.f387002a = i;
            this.f387007f = null;
            this.f387015o = null;
            m231327K();
            requestLayout();
        }
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        m231333Q(i);
    }

    /* renamed from: B */
    private final int m231318B(int i, C0661fw fwVar, C0670ge geVar, boolean z) {
        int i2;
        int f;
        if (mo117379v() || !this.f387004c) {
            int f2 = this.f387007f.mo2843f() - i;
            if (f2 <= 0) {
                return 0;
            }
            i2 = -m231320D(-f2, fwVar, geVar);
        } else {
            int j = i - this.f387007f.mo2847j();
            if (j <= 0) {
                return 0;
            }
            i2 = m231320D(j, fwVar, geVar);
        }
        int i3 = i + i2;
        if (!z || (f = this.f387007f.mo2843f() - i3) <= 0) {
            return i2;
        }
        this.f387007f.mo2851n(f);
        return f + i2;
    }

    /* renamed from: C */
    private final int m231319C(int i, C0661fw fwVar, C0670ge geVar, boolean z) {
        int i2;
        int j;
        if (mo117379v() || !this.f387004c) {
            int j2 = i - this.f387007f.mo2847j();
            if (j2 <= 0) {
                return 0;
            }
            i2 = -m231320D(j2, fwVar, geVar);
        } else {
            int f = this.f387007f.mo2843f() - i;
            if (f <= 0) {
                return 0;
            }
            i2 = m231320D(-f, fwVar, geVar);
        }
        int i3 = i + i2;
        if (!z || (j = i3 - this.f387007f.mo2847j()) <= 0) {
            return i2;
        }
        this.f387007f.mo2851n(-j);
        return i2 - j;
    }

    /* renamed from: M */
    private final void m231329M() {
        if (this.f387007f == null) {
            if (mo117379v()) {
                if (this.f387003b == 0) {
                    this.f387007f = new C0624em(this);
                    this.f387015o = new C0625en(this);
                    return;
                }
                this.f387007f = new C0625en(this);
                this.f387015o = new C0624em(this);
            } else if (this.f387003b == 0) {
                this.f387007f = new C0625en(this);
                this.f387015o = new C0624em(this);
            } else {
                this.f387007f = new C0624em(this);
                this.f387015o = new C0625en(this);
            }
        }
    }
}
