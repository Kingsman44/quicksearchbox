package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.GridLayoutManager;
import android.view.ViewGroup;

/* renamed from: com.facebook.litho.widget.z */
/* compiled from: PG */
final class C6561z extends GridLayoutManager {
    public C6561z(Context context, int i, int i2) {
        super(context, i, i2);
    }

    public final C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C6472cd) {
            return new C6560y((C6472cd) layoutParams);
        }
        return super.generateLayoutParams(layoutParams);
    }
}
