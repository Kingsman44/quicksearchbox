package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* renamed from: androidx.mediarouter.app.aj */
/* compiled from: PG */
public final class C3764aj {

    /* renamed from: a */
    public final BitmapDrawable f12150a;

    /* renamed from: b */
    public float f12151b = 1.0f;

    /* renamed from: c */
    public final Rect f12152c;

    /* renamed from: d */
    public Interpolator f12153d;

    /* renamed from: e */
    public long f12154e;

    /* renamed from: f */
    public final Rect f12155f;

    /* renamed from: g */
    public int f12156g;

    /* renamed from: h */
    public float f12157h = 1.0f;

    /* renamed from: i */
    public float f12158i = 1.0f;

    /* renamed from: j */
    public long f12159j;

    /* renamed from: k */
    public boolean f12160k;

    /* renamed from: l */
    public boolean f12161l;

    /* renamed from: m */
    public C3774k f12162m;

    public C3764aj(BitmapDrawable bitmapDrawable, Rect rect) {
        this.f12150a = bitmapDrawable;
        this.f12155f = rect;
        Rect rect2 = new Rect(rect);
        this.f12152c = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f12151b * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
