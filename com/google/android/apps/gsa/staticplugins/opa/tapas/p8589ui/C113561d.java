package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.d */
/* compiled from: PG */
public final class C113561d extends C0648fj {

    /* renamed from: a */
    private final Paint f314440a;

    public C113561d(int i) {
        Paint paint = new Paint();
        this.f314440a = paint;
        paint.setColor(i);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 1) {
            View childAt = recyclerView.getChildAt(0);
            int left = childAt.findViewById(R.id.text).getLeft();
            int right = childAt.getRight();
            for (int i = 1; i < childCount; i++) {
                View childAt2 = recyclerView.getChildAt(i);
                canvas.drawLine((float) left, (float) childAt2.getTop(), (float) right, (float) childAt2.getTop(), this.f314440a);
            }
        }
    }
}
