package com.google.android.libraries.glide.p1822a;

import android.graphics.Bitmap;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import java.util.LinkedList;

/* renamed from: com.google.android.libraries.glide.a.d */
/* compiled from: PG */
public final class C22003d implements FrameSequenceDrawable.BitmapProvider, C5679av {

    /* renamed from: a */
    private static final Bitmap.Config f60712a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final FrameSequence f60713b;

    /* renamed from: c */
    private final C5642d f60714c;

    /* renamed from: d */
    private final LinkedList f60715d = new LinkedList();

    public C22003d(FrameSequence frameSequence, C5642d dVar) {
        this.f60713b = frameSequence;
        this.f60714c = dVar;
    }

    /* renamed from: a */
    public final int mo12158a() {
        double width = (double) (this.f60713b.getWidth() * this.f60713b.getHeight());
        double frameCount = (double) this.f60713b.getFrameCount();
        Double.isNaN(frameCount);
        Double.isNaN(width);
        return (int) (width * ((frameCount * 0.06d) + 16.0d));
    }

    public final Bitmap acquireBitmap(int i, int i2) {
        return this.f60714c.mo12113a(i, i2, f60712a);
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return FrameSequenceDrawable.class;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12160c() {
        FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(this.f60713b, this);
        this.f60715d.add(frameSequenceDrawable);
        return frameSequenceDrawable;
    }

    /* renamed from: e */
    public final void mo12162e() {
        while (!this.f60715d.isEmpty()) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) this.f60715d.poll();
            if (!frameSequenceDrawable.isDestroyed()) {
                frameSequenceDrawable.destroy();
            }
        }
    }

    public final void releaseBitmap(Bitmap bitmap) {
        this.f60714c.mo12116d(bitmap);
    }
}
