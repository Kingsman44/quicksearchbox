package com.google.android.apps.gsa.shared.p7129r;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;
import com.google.android.gms.feedback.C144206k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.apps.gsa.shared.r.j */
/* compiled from: PG */
public final class C90468j {

    /* renamed from: a */
    private static final C59071e f252723a = C59071e.m91332i("com.google.android.apps.gsa.shared.r.j");

    /* renamed from: b */
    public static Point m147188b(int i, int i2) {
        int i3 = i * i2;
        int i4 = 4096;
        if (i3 <= 1835008 && i <= 4096 && i2 <= 4096) {
            return null;
        }
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        if (i3 > 1835008) {
            i = (int) Math.sqrt(1835008.0d * d3);
            double d4 = (double) i;
            Double.isNaN(d4);
            i2 = (int) (d4 / d3);
        }
        if (i > 4096) {
            i2 = (int) (4096.0d / d3);
            i = 4096;
        }
        if (i2 > 4096) {
            i = (int) (d3 * 4096.0d);
        } else {
            i4 = i2;
        }
        return new Point(i, i4);
    }

    /* renamed from: a */
    public final Bitmap mo84218a(View view, Activity activity, int i) {
        int i2;
        int i3;
        Bitmap bitmap;
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (view instanceof CoScrollContainer) {
                CoScrollContainer coScrollContainer = (CoScrollContainer) view;
                coScrollContainer.mo84807n(true);
                int computeVerticalScrollRange = coScrollContainer.computeVerticalScrollRange();
                coScrollContainer.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(computeVerticalScrollRange, 1073741824));
                coScrollContainer.layout(0, 0, width, computeVerticalScrollRange);
                coScrollContainer.mo84807n(false);
                height = computeVerticalScrollRange;
            }
            Point b = m147188b(width, height);
            if (b == null) {
                i2 = width;
            } else {
                i2 = b.x;
            }
            if (b == null) {
                i3 = height;
            } else {
                i3 = b.y;
            }
            if (i2 <= 0 || i3 <= 0) {
                bitmap = null;
            } else {
                bitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                paint.setColor(i);
                float f = (float) width;
                float f2 = (float) height;
                canvas.drawRect(0.0f, 0.0f, f, f2, paint);
                if (view instanceof SurfaceView) {
                    HandlerThread handlerThread = new HandlerThread("SurfaceView Screenshot Pixel Copier");
                    handlerThread.start();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    PixelCopy.request((SurfaceView) view, bitmap, new C90467i(countDownLatch, handlerThread), new Handler(handlerThread.getLooper()));
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        ((C59052c) ((C59052c) ((C59052c) f252723a.mo56226d()).mo56382g(e)).mo56372aa(10581)).mo56386p("Screenshotter.getCurrentScreenshot() failed to capture a SurfaceView.");
                    }
                } else {
                    if (b != null) {
                        canvas.scale(((float) b.x) / f, ((float) b.y) / f2);
                    }
                    view.draw(canvas);
                    if (view.getParent() != null) {
                        view.getParent().requestLayout();
                    } else {
                        view.requestLayout();
                    }
                }
            }
            if (bitmap != null) {
                return bitmap;
            }
            ((C59052c) ((C59052c) f252723a.mo56226d()).mo56372aa(10583)).mo56386p("Screenshotter.getCurrentScreenshot() returned null as a current screenshot");
            return null;
        } else if (activity == null) {
            return null;
        } else {
            Bitmap a = C144206k.m234449a(activity);
            if (a != null) {
                Point b2 = m147188b(a.getWidth(), a.getHeight());
                if (b2 != null) {
                    return Bitmap.createScaledBitmap(a, b2.x, b2.y, false);
                }
                return a.copy(Bitmap.Config.ARGB_8888, false);
            }
            ((C59052c) ((C59052c) f252723a.mo56226d()).mo56372aa(10582)).mo56386p("ScreenshotCapturer.getScreenshot() returned null as a screenshot for an activity");
            return a;
        }
    }
}
