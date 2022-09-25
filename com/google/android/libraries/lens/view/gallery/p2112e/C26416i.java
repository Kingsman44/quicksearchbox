package com.google.android.libraries.lens.view.gallery.p2112e;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.lens.view.gallery.e.i */
/* compiled from: PG */
public final class C26416i {

    /* renamed from: a */
    public final ImageView f71870a;

    /* renamed from: b */
    public final ImageView f71871b;

    /* renamed from: c */
    public final Bitmap f71872c;

    /* renamed from: d */
    public final int[] f71873d = new int[2];

    /* renamed from: e */
    public final Rect f71874e = new Rect();

    /* renamed from: f */
    public final Rect f71875f = new Rect();

    /* renamed from: g */
    public ImageView f71876g;

    /* renamed from: h */
    public float f71877h;

    /* renamed from: i */
    public float f71878i;

    /* renamed from: j */
    public float f71879j;

    /* renamed from: k */
    public float f71880k;

    /* renamed from: l */
    public float f71881l;

    /* renamed from: m */
    public float f71882m;

    /* renamed from: n */
    public float f71883n;

    /* renamed from: o */
    public boolean f71884o;

    /* renamed from: p */
    public Runnable f71885p;

    /* renamed from: q */
    private final Rect f71886q = new Rect();

    public C26416i(C26415h hVar, ImageView imageView) {
        this.f71870a = imageView;
        this.f71871b = hVar.f71868a;
        this.f71872c = hVar.f71869b;
    }

    /* renamed from: a */
    public static void m48701a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    /* renamed from: b */
    public final void mo31618b() {
        Runnable runnable = this.f71885p;
        if (runnable != null) {
            this.f71885p = null;
            runnable.run();
        }
    }

    /* renamed from: c */
    public final void mo31619c() {
        if (this.f71884o) {
            ImageView imageView = this.f71876g;
            imageView.getClass();
            imageView.setVisibility(0);
            this.f71870a.setVisibility(8);
        }
        mo31618b();
    }

    /* renamed from: d */
    public final void mo31620d() {
        this.f71870a.animate().cancel();
        this.f71870a.setClipBounds((Rect) null);
        this.f71870a.setVisibility(8);
        this.f71871b.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo31621e(float f) {
        float height = (((float) this.f71875f.height()) / ((float) this.f71875f.width())) / (((float) this.f71874e.height()) / ((float) this.f71874e.width()));
        this.f71886q.left = 0;
        this.f71886q.top = 0;
        if (height <= 1.0f) {
            int width = this.f71875f.width();
            this.f71886q.left = Math.round((1.0f - f) * 0.5f * ((float) width) * (1.0f - height));
        } else {
            int height2 = this.f71875f.height();
            this.f71886q.top = Math.round((1.0f - f) * 0.5f * ((float) height2) * (1.0f - (1.0f / height)));
        }
        this.f71886q.right = this.f71875f.width() - this.f71886q.left;
        this.f71886q.bottom = this.f71875f.height() - this.f71886q.top;
        this.f71870a.setClipBounds(this.f71886q);
    }

    /* renamed from: f */
    public final void mo31622f(float f, float f2, float f3) {
        this.f71870a.setScaleX(f3);
        this.f71870a.setScaleY(f3);
        this.f71870a.setTranslationX(f - ((float) this.f71873d[0]));
        this.f71870a.setTranslationY(f2 - ((float) this.f71873d[1]));
    }
}
