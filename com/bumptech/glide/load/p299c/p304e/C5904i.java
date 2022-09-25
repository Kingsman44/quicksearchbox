package com.bumptech.glide.load.p299c.p304e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p033v7.widget.LinearLayoutManager;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;

/* renamed from: com.bumptech.glide.load.c.e.i */
/* compiled from: PG */
final class C5904i extends C5561c {

    /* renamed from: a */
    final int f17528a;

    /* renamed from: b */
    public Bitmap f17529b;

    /* renamed from: d */
    private final Handler f17530d;

    /* renamed from: e */
    private final long f17531e;

    public C5904i(Handler handler, int i, long j) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f17530d = handler;
        this.f17528a = i;
        this.f17531e = j;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        this.f17529b = (Bitmap) obj;
        this.f17530d.sendMessageAtTime(this.f17530d.obtainMessage(1, this), this.f17531e);
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        this.f17529b = null;
    }
}
