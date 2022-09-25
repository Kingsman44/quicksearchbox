package com.google.android.libraries.lens.view.feedback;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.lens.view.feedback.ab */
/* compiled from: PG */
public final class C25809ab {

    /* renamed from: a */
    private static final C58974d f70122a = C58974d.m91135i("Screenshotter");

    /* renamed from: a */
    public static Bitmap m47620a(Bitmap bitmap) {
        Size size;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int i2 = 4096;
        if (i > 1835008 || width > 4096 || height > 4096) {
            double d = (double) width;
            double d2 = (double) height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (i > 1835008) {
                width = (int) Math.sqrt(1835008.0d * d3);
                double d4 = (double) width;
                Double.isNaN(d4);
                height = (int) (d4 / d3);
            }
            if (width > 4096) {
                height = (int) (4096.0d / d3);
                width = 4096;
            }
            if (height > 4096) {
                width = (int) (d3 * 4096.0d);
            } else {
                i2 = height;
            }
            size = new Size(width, i2);
        } else {
            size = null;
        }
        return size != null ? Bitmap.createScaledBitmap(bitmap, size.getWidth(), size.getHeight(), true) : bitmap;
    }

    /* renamed from: b */
    public static C60870cx m47621b(Window window, View view) {
        if (window == null) {
            return C60856cj.m92899h(new IllegalArgumentException());
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        SettableFuture settableFuture = new SettableFuture();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        try {
            int i = iArr[0];
            PixelCopy.request(window, new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()), createBitmap, new C25808aa(settableFuture, createBitmap), new Handler(Looper.getMainLooper()));
            return settableFuture;
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f70122a.mo56225c()).mo56382g(e)).mo56372aa(49354)).mo56386p("Unable to convert bitmap");
            return C60856cj.m92899h(e);
        }
    }
}
