package com.google.android.libraries.lens.view.infopanel.scrollview;

import android.content.Context;
import android.graphics.Rect;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.widget.C6497db;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* compiled from: PG */
public final class LensResultsNestedScrollView extends NestedScrollView {

    /* renamed from: e */
    private static final C58974d f74369e = C58974d.m91135i("LRNSV");

    /* renamed from: f */
    private final LruCache f74370f = new LruCache(2);

    /* renamed from: g */
    private float f74371g;

    /* renamed from: h */
    private float f74372h;

    public LensResultsNestedScrollView(Context context) {
        super(context);
    }

    /* renamed from: p */
    static View m50441p(View view, int i) {
        if (C2043bi.m5571ay(view) && view.canScrollVertically(i)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View p = m50441p(viewGroup.getChildAt(i2), i);
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static void m50442r(View view) {
        if (C2043bi.m5571ay(view)) {
            view.scrollTo(0, 0);
            if (view instanceof C6497db) {
                ((C6497db) view).f19266p.scrollToPosition(0);
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m50442r(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: s */
    private final View m50443s(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View p = m50441p(getChildAt(i2), i);
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    /* renamed from: u */
    private final C27203b m50444u(View view) {
        C27203b bVar = (C27203b) this.f74370f.get(view);
        if (bVar != null) {
            return bVar;
        }
        int top = view.getTop();
        for (ViewGroup viewGroup = (ViewGroup) view.getParent(); viewGroup != this; viewGroup = (ViewGroup) viewGroup.getParent()) {
            top += viewGroup.getTop();
        }
        C27202a aVar = new C27202a(top);
        this.f74370f.put(view, aVar);
        return aVar;
    }

    public final boolean canScrollVertically(int i) {
        return super.canScrollVertically(i) || m50443s(i) != null;
    }

    /* renamed from: d */
    public final void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
        this.f6033c.mo5283e(i, i2, iArr, (int[]) null, i3);
        mo32640q(view, i2 - iArr[1], iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: fE */
    public final int mo5307fE(Rect rect) {
        ((C58970a) ((C58970a) f74369e.mo56226d()).mo56372aa(49594)).mo56387q("computeScrollDeltaToGetChildRectOnScreen(): override scrollDelta[%d] with 0", super.mo5307fE(rect));
        return 0;
    }

    /* renamed from: fG */
    public final void mo5309fG(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        View s;
        super.mo5309fG(i, i2, iArr, i3, iArr2);
        int i4 = i2 - iArr2[1];
        if (i4 != 0 && (s = m50443s(Integer.signum(i4))) != null) {
            s.scrollBy(0, i4);
            iArr2[1] = iArr2[1] + i4;
        }
    }

    /* renamed from: h */
    public final void mo1857h(View view, int i) {
        this.f74370f.evictAll();
        super.mo1857h(view, i);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f74371g = motionEvent.getX();
            this.f74372h = motionEvent.getY();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (action != 2) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            if (((int) Math.abs(this.f74371g - motionEvent.getX())) > ((int) Math.abs(this.f74372h - motionEvent.getY()))) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean d = this.f6033c.mo5282d(f, f2);
        boolean z = view instanceof RecyclerView;
        if (d || z) {
            return d;
        }
        mo5293c((int) (-f2));
        this.f6033c.mo5281c(0.0f, f2, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int scrollY = i2 - getScrollY();
        View s = m50443s(Integer.signum(scrollY));
        if (s != null) {
            int[] iArr = new int[2];
            mo32640q(s, scrollY, iArr);
            if (scrollY != 0 && iArr[1] == 0) {
                super.onOverScrolled(i, i2, z, z2);
                return;
            }
            return;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo32640q(View view, int i, int[] iArr) {
        if (i > 0) {
            if (super.canScrollVertically(1)) {
                int a = m50444u(view).mo32641a() - getScrollY();
                if (a > 0) {
                    int min = Math.min(a, i);
                    scrollBy(0, min);
                    iArr[1] = iArr[1] + min;
                    i -= min;
                }
                if (i != 0) {
                    boolean canScrollVertically = view.canScrollVertically(1);
                    boolean canScrollVertically2 = super.canScrollVertically(1);
                    if (!canScrollVertically && canScrollVertically2) {
                        scrollBy(0, i);
                        iArr[1] = iArr[1] + i;
                    }
                }
            }
        } else if (i < 0 && super.canScrollVertically(-1)) {
            int a2 = m50444u(view).mo32641a() - getScrollY();
            if (a2 < 0) {
                int max = Math.max(a2, i);
                scrollBy(0, max);
                iArr[1] = iArr[1] + max;
                i -= max;
            }
            if (i != 0) {
                boolean canScrollVertically3 = view.canScrollVertically(-1);
                boolean canScrollVertically4 = super.canScrollVertically(-1);
                if (!canScrollVertically3 && canScrollVertically4) {
                    scrollBy(0, i);
                    iArr[1] = iArr[1] + i;
                }
            }
        }
    }

    public LensResultsNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
