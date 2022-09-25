package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.Bitmap;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.shared.y.f */
/* compiled from: PG */
final class C91214f implements FrameSequenceDrawable.BitmapProvider, C5962u {

    /* renamed from: a */
    private static final Bitmap.Config f254603a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final C5642d f254604b;

    public C91214f(C5642d dVar) {
        this.f254604b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(FrameSequence.decodeStream((InputStream) obj), this);
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(5);
        return new C91213e(frameSequenceDrawable);
    }

    public final Bitmap acquireBitmap(int i, int i2) {
        return this.f254604b.mo12113a(i, i2, f254603a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        byte[] bArr = new byte[21];
        return ((InputStream) obj).read(bArr) != -1 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80 && bArr[12] == 86 && bArr[13] == 80 && bArr[14] == 56 && bArr[15] == 88 && (bArr[20] & 2) != 0;
    }

    public final void releaseBitmap(Bitmap bitmap) {
        this.f254604b.mo12116d(bitmap);
    }
}
