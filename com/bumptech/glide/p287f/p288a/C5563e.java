package com.bumptech.glide.p287f.p288a;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.p291h.C5630q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.f.a.e */
/* compiled from: PG */
final class C5563e {

    /* renamed from: a */
    static Integer f16845a;

    /* renamed from: b */
    public final View f16846b;

    /* renamed from: c */
    public final List f16847c = new ArrayList();

    /* renamed from: d */
    public C5562d f16848d;

    public C5563e(View view) {
        this.f16846b = view;
    }

    /* renamed from: d */
    public static final boolean m14408d(int i, int i2) {
        return m14410f(i) && m14410f(i2);
    }

    /* renamed from: e */
    private final int m14409e(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (this.f16846b.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = this.f16846b.getContext();
        if (f16845a == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            C5630q.m14607d(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f16845a = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f16845a.intValue();
    }

    /* renamed from: f */
    private static final boolean m14410f(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final int mo11998a() {
        int paddingTop = this.f16846b.getPaddingTop() + this.f16846b.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.f16846b.getLayoutParams();
        return m14409e(this.f16846b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    /* renamed from: b */
    public final int mo11999b() {
        int paddingLeft = this.f16846b.getPaddingLeft() + this.f16846b.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = this.f16846b.getLayoutParams();
        return m14409e(this.f16846b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12000c() {
        ViewTreeObserver viewTreeObserver = this.f16846b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f16848d);
        }
        this.f16848d = null;
        this.f16847c.clear();
    }
}
