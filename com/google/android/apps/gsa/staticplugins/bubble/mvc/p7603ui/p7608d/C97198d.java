package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7608d;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.d.d */
/* compiled from: PG */
public final /* synthetic */ class C97198d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ View f271560a;

    /* renamed from: b */
    public final /* synthetic */ View f271561b;

    /* renamed from: c */
    public final /* synthetic */ View f271562c;

    /* renamed from: d */
    public final /* synthetic */ View f271563d;

    /* renamed from: e */
    public final /* synthetic */ int f271564e;

    public /* synthetic */ C97198d(View view, View view2, View view3, View view4, int i) {
        this.f271560a = view;
        this.f271561b = view2;
        this.f271562c = view3;
        this.f271563d = view4;
        this.f271564e = i;
    }

    public final boolean onPreDraw() {
        View view = this.f271560a;
        View view2 = this.f271561b;
        View view3 = this.f271562c;
        View view4 = this.f271563d;
        int i = this.f271564e;
        int width = view.getWidth() / 2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        if (i2 <= width) {
            view2.setVisibility(0);
            view3.setVisibility(8);
            view4.setVisibility(8);
            return true;
        } else if (i2 <= width || i2 >= i - (width * 3)) {
            view2.setVisibility(8);
            view3.setVisibility(8);
            view4.setVisibility(0);
            return true;
        } else {
            view2.setVisibility(8);
            view3.setVisibility(0);
            view4.setVisibility(8);
            return true;
        }
    }
}
