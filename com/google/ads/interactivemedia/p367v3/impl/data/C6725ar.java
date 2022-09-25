package com.google.ads.interactivemedia.p367v3.impl.data;

import android.view.View;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ar */
/* compiled from: PG */
public abstract class C6725ar {
    public abstract C6726as build();

    public abstract C6725ar height(int i);

    public abstract C6725ar left(int i);

    public C6725ar locationOnScreenOfView(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return left(iArr[0]).top(iArr[1]).height(view.getHeight()).width(view.getWidth());
    }

    public abstract C6725ar top(int i);

    public abstract C6725ar width(int i);
}
