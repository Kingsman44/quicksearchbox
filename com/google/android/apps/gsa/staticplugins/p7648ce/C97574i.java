package com.google.android.apps.gsa.staticplugins.p7648ce;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.i */
/* compiled from: PG */
public final class C97574i extends C90904ba {

    /* renamed from: a */
    public final SettableFuture f272587a = new SettableFuture();

    /* renamed from: b */
    private final View f272588b;

    public C97574i(View view) {
        super("TakeScreenshotTask");
        this.f272588b = view;
    }

    public final void run() {
        SettableFuture settableFuture = this.f272587a;
        View view = this.f272588b;
        int width = view.getWidth();
        int height = view.getHeight();
        Bitmap bitmap = null;
        if (!(height == 0 || width == 0)) {
            if (view instanceof CoScrollContainer) {
                CoScrollContainer coScrollContainer = (CoScrollContainer) view;
                int computeVerticalScrollRange = coScrollContainer.computeVerticalScrollRange();
                coScrollContainer.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(computeVerticalScrollRange, 1073741824));
                coScrollContainer.layout(0, 0, width, computeVerticalScrollRange);
                height = computeVerticalScrollRange;
            }
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmap));
            view.requestLayout();
        }
        settableFuture.mo57356n(bitmap);
    }
}
