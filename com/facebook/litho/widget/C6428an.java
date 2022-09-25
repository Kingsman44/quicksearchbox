package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.facebook.litho.widget.an */
/* compiled from: PG */
final class C6428an extends LinearLayoutManager {
    public C6428an(Context context, int i) {
        super(context, i, false);
    }

    public final C0654fp generateDefaultLayoutParams() {
        if (getOrientation() == 1) {
            return new C0654fp(-1, -2);
        }
        return new C0654fp(-2, -1);
    }

    public final boolean supportsPredictiveItemAnimations() {
        if (getOrientation() == 0) {
            return false;
        }
        return super.supportsPredictiveItemAnimations();
    }
}
