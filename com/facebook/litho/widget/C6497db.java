package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.litho.C6132bm;
import com.facebook.litho.C6169cq;
import com.facebook.litho.C6381hf;
import com.facebook.litho.C6411u;
import com.facebook.litho.LithoView;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.List;

/* renamed from: com.facebook.litho.widget.db */
/* compiled from: PG */
public final class C6497db extends SwipeRefreshLayout implements C6169cq {

    /* renamed from: s */
    public static final /* synthetic */ int f19264s = 0;

    /* renamed from: o */
    public final LithoView f19265o;

    /* renamed from: p */
    public final RecyclerView f19266p;

    /* renamed from: q */
    public boolean f19267q = false;

    /* renamed from: r */
    public C0646fh f19268r;

    /* renamed from: t */
    private C6132bm f19269t;

    public C6497db(Context context, RecyclerView recyclerView) {
        super(context);
        this.f19266p = recyclerView;
        C6496da daVar = new C6496da();
        if (daVar != recyclerView.mChildDrawingOrderCallback$ar$class_merging) {
            recyclerView.mChildDrawingOrderCallback$ar$class_merging = daVar;
            recyclerView.setChildrenDrawingOrderEnabled(recyclerView.mChildDrawingOrderCallback$ar$class_merging != null);
        }
        C0661fw fwVar = recyclerView.mRecycler;
        fwVar.f2435e = 0;
        fwVar.mo3038o();
        addView(recyclerView);
        LithoView lithoView = new LithoView(new C6411u(getContext(), (String) null, (C21215m) null, (C6381hf) null), (AttributeSet) null);
        this.f19265o = lithoView;
        lithoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(lithoView);
    }

    /* renamed from: a */
    public final void mo13143a(List list) {
        int childCount = this.f19266p.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f19266p.getChildAt(i);
            if (childAt instanceof LithoView) {
                list.add((LithoView) childAt);
            }
        }
    }

    /* renamed from: b */
    public final C6132bm mo12667b() {
        return this.f19269t;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6132bm bmVar = this.f19269t;
        if (bmVar != null) {
            bmVar.mo13114a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: m */
    public final void mo12684m(C6132bm bmVar) {
        this.f19269t = bmVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19267q = true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f19265o.getVisibility() != 8) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            LithoView lithoView = this.f19265o;
            lithoView.layout(paddingLeft, paddingTop, lithoView.getMeasuredWidth() + paddingLeft, this.f19265o.getMeasuredHeight() + paddingTop);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo13583r(View.MeasureSpec.getSize(i));
    }

    /* renamed from: q */
    public final void mo13582q() {
        this.f19265o.mo12731D();
        this.f19265o.setVisibility(8);
    }

    /* renamed from: r */
    public final void mo13583r(int i) {
        measureChild(this.f19265o, View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() != null && !this.f13510c.f6017a) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f19266p.setOnTouchListener(onTouchListener);
    }
}
