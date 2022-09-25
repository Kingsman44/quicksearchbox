package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.C0628eq;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.C2043bi;
import androidx.viewpager2.C4283a;
import androidx.viewpager2.adapter.C4297l;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* compiled from: PG */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a */
    static boolean f13891a = true;

    /* renamed from: b */
    public C4300c f13892b = new C4300c();

    /* renamed from: c */
    public int f13893c;

    /* renamed from: d */
    boolean f13894d = false;

    /* renamed from: e */
    LinearLayoutManager f13895e;

    /* renamed from: f */
    public RecyclerView f13896f;

    /* renamed from: g */
    public C4304g f13897g;

    /* renamed from: h */
    public C4301d f13898h;

    /* renamed from: i */
    public boolean f13899i = true;

    /* renamed from: j */
    public int f13900j = -1;

    /* renamed from: k */
    C4309l f13901k;

    /* renamed from: l */
    private final Rect f13902l = new Rect();

    /* renamed from: m */
    private final Rect f13903m = new Rect();

    /* renamed from: n */
    private C0642fd f13904n = new C4305h(this);

    /* renamed from: o */
    private int f13905o = -1;

    /* renamed from: p */
    private Parcelable f13906p;

    /* renamed from: q */
    private C0628eq f13907q;

    /* renamed from: r */
    private C4300c f13908r;

    /* renamed from: s */
    private C4302e f13909s;

    public ViewPager2(Context context) {
        super(context);
        m12332j(context, (AttributeSet) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    private final void m12332j(Context context, AttributeSet attributeSet) {
        C4309l lVar;
        if (f13891a) {
            lVar = new C4317t(this);
        } else {
            lVar = new C4310m(this);
        }
        this.f13901k = lVar;
        C4319v vVar = new C4319v(this, context);
        this.f13896f = vVar;
        vVar.setId(C2043bi.m5574c());
        this.f13896f.setDescendantFocusability(C89885b.S3REQUEST_VALUE);
        C4312o oVar = new C4312o(this, context);
        this.f13895e = oVar;
        this.f13896f.setLayoutManager(oVar);
        RecyclerView recyclerView = this.f13896f;
        recyclerView.mTouchSlop = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4283a.f13861a);
        C2043bi.m5525S(this, context, C4283a.f13861a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            mo9217f(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f13896f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f13896f.addOnChildAttachStateChangeListener(new C4308k());
            this.f13897g = new C4304g(this);
            C4304g gVar = this.f13897g;
            RecyclerView recyclerView2 = this.f13896f;
            this.f13898h = new C4301d(gVar);
            C4318u uVar = new C4318u(this);
            this.f13907q = uVar;
            uVar.mo3197g(recyclerView2);
            this.f13896f.addOnScrollListener(this.f13897g);
            C4300c cVar = new C4300c();
            this.f13908r = cVar;
            this.f13897g.f13919a = cVar;
            C4306i iVar = new C4306i(this);
            C4307j jVar = new C4307j(this);
            cVar.mo9232c(iVar);
            this.f13908r.mo9232c(jVar);
            this.f13901k.mo9258s(this.f13896f);
            this.f13908r.mo9232c(this.f13892b);
            C4302e eVar = new C4302e();
            this.f13909s = eVar;
            this.f13908r.mo9232c(eVar);
            RecyclerView recyclerView3 = this.f13896f;
            attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: k */
    private final void m12333k() {
        C0640fb fbVar;
        if (this.f13905o != -1 && (fbVar = this.f13896f.mAdapter) != null) {
            Parcelable parcelable = this.f13906p;
            if (parcelable != null) {
                if (fbVar instanceof C4297l) {
                    ((C4297l) fbVar).mo9195e(parcelable);
                }
                this.f13906p = null;
            }
            int max = Math.max(0, Math.min(this.f13905o, fbVar.getItemCount() - 1));
            this.f13893c = max;
            this.f13905o = -1;
            this.f13896f.scrollToPosition(max);
            this.f13901k.mo9247h();
        }
    }

    /* renamed from: a */
    public final int mo9209a() {
        return this.f13895e.getOrientation() == 1 ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo9210b(C0640fb fbVar) {
        C0640fb fbVar2 = this.f13896f.mAdapter;
        this.f13901k.mo9243d(fbVar2);
        if (fbVar2 != null) {
            fbVar2.mObservable.unregisterObserver(this.f13904n);
        }
        this.f13896f.setAdapter(fbVar);
        this.f13893c = 0;
        m12333k();
        this.f13901k.mo9242c(fbVar);
        if (fbVar != null) {
            fbVar.mObservable.registerObserver(this.f13904n);
        }
    }

    /* renamed from: c */
    public final void mo9211c(int i, boolean z) {
        C4304g gVar = this.f13898h.f13915a;
        mo9214d(i, z);
    }

    public final boolean canScrollHorizontally(int i) {
        return this.f13896f.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.f13896f.canScrollVertically(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9214d(int i, boolean z) {
        C0640fb fbVar = this.f13896f.mAdapter;
        if (fbVar == null) {
            if (this.f13905o != -1) {
                this.f13905o = Math.max(i, 0);
            }
        } else if (fbVar.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), fbVar.getItemCount() - 1);
            if (min != this.f13893c || !this.f13897g.mo9239d()) {
                int i2 = this.f13893c;
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.f13893c = min;
                    this.f13901k.mo9250k();
                    if (!this.f13897g.mo9239d()) {
                        C4304g gVar = this.f13897g;
                        gVar.mo9238c();
                        C4303f fVar = gVar.f13922d;
                        double d2 = (double) fVar.f13916a;
                        double d3 = (double) fVar.f13917b;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        d = d2 + d3;
                    }
                    C4304g gVar2 = this.f13897g;
                    gVar2.f13920b = true != z ? 3 : 2;
                    int i3 = gVar2.f13923e;
                    gVar2.f13923e = min;
                    gVar2.mo9237b(2);
                    if (i3 != min) {
                        gVar2.mo9236a(min);
                    }
                    if (!z) {
                        this.f13896f.scrollToPosition(min);
                        return;
                    }
                    double d4 = (double) min;
                    Double.isNaN(d4);
                    if (Math.abs(d4 - d) > 3.0d) {
                        this.f13896f.scrollToPosition(d4 > d ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.f13896f;
                        recyclerView.post(new C4321x(min, recyclerView));
                        return;
                    }
                    this.f13896f.smoothScrollToPosition(min);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f13910a;
            sparseArray.put(this.f13896f.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m12333k();
    }

    /* renamed from: f */
    public final void mo9217f(int i) {
        this.f13895e.setOrientation(i);
        this.f13901k.mo9251l();
    }

    /* renamed from: g */
    public final void mo9218g(boolean z) {
        this.f13899i = z;
        this.f13901k.mo9252m();
    }

    public final CharSequence getAccessibilityClassName() {
        if (this.f13901k.mo9253n()) {
            return this.f13901k.mo9241b();
        }
        return super.getAccessibilityClassName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo9220h() {
        C0628eq eqVar = this.f13907q;
        if (eqVar != null) {
            View b = eqVar.mo2803b(this.f13895e);
            if (b != null) {
                int position = this.f13895e.getPosition(b);
                if (position != this.f13893c && this.f13897g.f13921c == 0) {
                    this.f13908r.mo9202b(position);
                }
                this.f13894d = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo9221i() {
        return this.f13895e.getLayoutDirection() == 1;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f13901k.mo9244e(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f13896f.getMeasuredWidth();
        int measuredHeight = this.f13896f.getMeasuredHeight();
        this.f13902l.left = getPaddingLeft();
        this.f13902l.right = (i3 - i) - getPaddingRight();
        this.f13902l.top = getPaddingTop();
        this.f13902l.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f13902l, this.f13903m);
        this.f13896f.layout(this.f13903m.left, this.f13903m.top, this.f13903m.right, this.f13903m.bottom);
        if (this.f13894d) {
            mo9220h();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        measureChild(this.f13896f, i, i2);
        int measuredWidth = this.f13896f.getMeasuredWidth();
        int measuredHeight = this.f13896f.getMeasuredHeight();
        int measuredState = this.f13896f.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(measuredHeight + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f13905o = savedState.f13911b;
        this.f13906p = savedState.f13912c;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13910a = this.f13896f.getId();
        int i = this.f13905o;
        if (i == -1) {
            i = this.f13893c;
        }
        savedState.f13911b = i;
        Parcelable parcelable = this.f13906p;
        if (parcelable != null) {
            savedState.f13912c = parcelable;
        } else {
            C0640fb fbVar = this.f13896f.mAdapter;
            if (fbVar instanceof C4297l) {
                savedState.f13912c = ((C4297l) fbVar).mo9191a();
            }
        }
        return savedState;
    }

    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f13901k.mo9257r(i)) {
            return this.f13901k.mo9259t(i);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f13901k.mo9249j();
    }

    /* renamed from: e */
    public final void mo9216e(int i) {
        if (i > 0 || i == -1) {
            this.f13900j = i;
            this.f13896f.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C4320w();

        /* renamed from: a */
        int f13910a;

        /* renamed from: b */
        int f13911b;

        /* renamed from: c */
        Parcelable f13912c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13910a = parcel.readInt();
            this.f13911b = parcel.readInt();
            this.f13912c = parcel.readParcelable(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13910a);
            parcel.writeInt(this.f13911b);
            parcel.writeParcelable(this.f13912c, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12332j(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12332j(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m12332j(context, attributeSet);
    }
}
