package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.content.Context;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.p098j.C2008ab;
import androidx.core.p098j.C2100o;
import androidx.core.widget.NestedScrollView;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.GestureAwareLayout */
/* compiled from: PG */
public class GestureAwareLayout extends ConstraintLayout implements C2008ab {

    /* renamed from: d */
    public final C82090f f224273d;

    /* renamed from: e */
    private final C2100o f224274e;

    /* renamed from: f */
    private View f224275f;

    public GestureAwareLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private static boolean m130317b(View view) {
        if (!(view instanceof RecyclerView)) {
            return view.getScrollY() == 0;
        }
        C0653fo foVar = ((RecyclerView) view).mLayout;
        if (foVar == null) {
            return false;
        }
        int findFirstCompletelyVisibleItemPosition = foVar instanceof LinearLayoutManager ? ((LinearLayoutManager) foVar).findFirstCompletelyVisibleItemPosition() : -1;
        if (foVar instanceof GridLayoutManager) {
            findFirstCompletelyVisibleItemPosition = ((GridLayoutManager) foVar).findFirstCompletelyVisibleItemPosition();
        }
        return findFirstCompletelyVisibleItemPosition == 0;
    }

    /* renamed from: d */
    public final void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
        boolean b = m130317b(view);
        C82090f fVar = this.f224273d;
        int i4 = C82090f.f224437e;
        float f = fVar.f224438a;
        view.getHeight();
        if ((i2 >= 0 || !b) && !this.f224273d.f224440c) {
            super.onNestedPreScroll(view, i, i2, iArr);
            return;
        }
        this.f224273d.mo75507c((float) i2);
        iArr[1] = i2;
    }

    /* renamed from: e */
    public final void mo1850e(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* renamed from: f */
    public final void mo1851f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: g */
    public final void mo1852g(View view, View view2, int i, int i2) {
        if ((view2 instanceof RecyclerView) || (view2 instanceof NestedScrollView)) {
            this.f224275f = view2;
        }
    }

    /* renamed from: h */
    public final void mo1857h(View view, int i) {
        if (view == this.f224275f) {
            this.f224275f = null;
            this.f224273d.mo75506b();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f224275f != null) {
            return false;
        }
        if (motionEvent.getAction() == 2 && this.f224273d.f224440c) {
            return true;
        }
        this.f224274e.f6015a.f6014a.onTouchEvent(motionEvent);
        return this.f224273d.f224440c;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean b = m130317b(view);
        C82090f fVar = this.f224273d;
        int i = C82090f.f224437e;
        float f3 = fVar.f224438a;
        if ((f2 >= 0.0f || !b) && !this.f224273d.f224440c) {
            return super.onNestedFling(view, f, f2, z);
        }
        C82090f fVar2 = this.f224273d;
        fVar2.f224439b = -f2;
        fVar2.mo75506b();
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean b = m130317b(view);
        C82090f fVar = this.f224273d;
        int i = C82090f.f224437e;
        float f3 = fVar.f224438a;
        if ((f2 >= 0.0f || !b) && !this.f224273d.f224440c) {
            return super.onNestedPreFling(view, f, f2);
        }
        C82090f fVar2 = this.f224273d;
        fVar2.f224439b = -f2;
        fVar2.mo75506b();
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f224274e.f6015a.f6014a.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            C82090f fVar = this.f224273d;
            int i = C82090f.f224437e;
            float f = fVar.f224438a;
            C82090f fVar2 = this.f224273d;
            float f2 = fVar2.f224439b;
            fVar2.mo75506b();
        }
        if (super.onTouchEvent(motionEvent) || onTouchEvent) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo1884t(View view, View view2, int i, int i2) {
        return ((view2 instanceof RecyclerView) || (view2 instanceof NestedScrollView)) && (i & 2) != 0;
    }

    public GestureAwareLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C82090f fVar = new C82090f();
        this.f224273d = fVar;
        this.f224274e = new C2100o(context, fVar, (Handler) null);
    }
}
