package com.google.android.libraries.onegoogle.tooltip;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.z */
/* compiled from: PG */
final class C31090z {

    /* renamed from: a */
    public final ViewTreeObserver.OnPreDrawListener f83737a;

    /* renamed from: b */
    public final View f83738b;

    /* renamed from: c */
    public final View f83739c;

    /* renamed from: d */
    public final Rect f83740d;

    /* renamed from: e */
    public final C31076l f83741e;

    public C31090z(View view, C31076l lVar) {
        this.f83739c = view;
        View rootView = view.getRootView();
        this.f83738b = rootView;
        this.f83740d = m57996a(view);
        this.f83741e = lVar;
        C31089y yVar = new C31089y(this);
        this.f83737a = yVar;
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(yVar);
        }
    }

    /* renamed from: a */
    public static Rect m57996a(View view) {
        View rootView = view.getRootView();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        while (view != rootView) {
            View view2 = (View) view.getParent();
            rect.offset(view.getLeft() - view2.getScrollX(), view.getTop() - view2.getScrollY());
            view = view2;
        }
        return rect;
    }
}
