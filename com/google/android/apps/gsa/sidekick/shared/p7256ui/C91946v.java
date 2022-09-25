package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.shared.p7148ui.C90648ax;
import com.google.android.apps.gsa.shared.p7148ui.C90649ay;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.v */
/* compiled from: PG */
public class C91946v extends CardView {

    /* renamed from: g */
    public final C90649ay f256423g;

    /* renamed from: h */
    public final C90648ax f256424h;

    /* renamed from: i */
    public boolean f256425i = false;

    /* renamed from: j */
    public final ViewGroup f256426j;

    /* renamed from: k */
    public boolean f256427k = true;

    /* renamed from: l */
    private final Rect f256428l = new Rect();

    protected C91946v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f = context.getResources().getDisplayMetrics().density;
        int scaledPagingTouchSlop = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        C91945u uVar = new C91945u(this);
        this.f256424h = uVar;
        this.f256423g = new C90649ay(uVar, f, (float) scaledPagingTouchSlop);
        this.f256426j = this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo86602g(View view) {
        throw null;
    }

    /* renamed from: h */
    public boolean mo86603h(View view) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo86604i() {
        throw null;
    }

    /* renamed from: j */
    public final Point mo86646j(ViewGroup viewGroup, MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        if (viewGroup == this && this.f256426j == null) {
            return new Point(x, y);
        }
        Rect rect = new Rect(x, y, x, y);
        ViewGroup viewGroup2 = this.f256426j;
        if (viewGroup2 != null) {
            viewGroup.offsetRectIntoDescendantCoords(viewGroup2, rect);
        } else {
            viewGroup.offsetRectIntoDescendantCoords(this, rect);
        }
        return new Point(rect.left, rect.top);
    }

    /* renamed from: k */
    public final View mo86647k(int i, int i2) {
        int childCount = this.f256426j.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.f256426j.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(this.f256428l);
                if (this.f256428l.contains(i, i2)) {
                    return childAt;
                }
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f256427k) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f256423g.mo84941a(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f256427k) {
            return super.onTouchEvent(motionEvent);
        }
        return this.f256423g.mo84942b(motionEvent) || super.onTouchEvent(motionEvent);
    }
}
