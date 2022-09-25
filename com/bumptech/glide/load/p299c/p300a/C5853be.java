package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;

/* renamed from: com.bumptech.glide.load.c.a.be */
/* compiled from: PG */
public final class C5853be implements C5962u {

    /* renamed from: a */
    public static final C5959r f17451a = new C5959r("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5844aw());

    /* renamed from: b */
    public static final C5959r f17452b = new C5959r("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5845ax());

    /* renamed from: c */
    private final C5850bb f17453c;

    /* renamed from: d */
    private final C5642d f17454d;

    public C5853be(C5642d dVar, C5850bb bbVar) {
        this.f17454d = dVar;
        this.f17453c = bbVar;
    }

    /* renamed from: a */
    public final C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        int intValue;
        Bitmap bitmap;
        int i3 = i;
        int i4 = i2;
        C5960s sVar2 = sVar;
        long longValue = ((Long) sVar2.mo12401b(f17451a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) sVar2.mo12401b(f17452b);
            if (num == null) {
                num = 2;
            }
            C5873v vVar = (C5873v) sVar2.mo12401b(C5873v.f17475f);
            if (vVar == null) {
                vVar = C5873v.f17474e;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f17453c.mo12321a(mediaMetadataRetriever, obj);
                intValue = num.intValue();
                bitmap = null;
                if (!(i3 == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || vVar == C5873v.f17473d)) {
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                    if (parseInt3 == 90 || parseInt3 == 270) {
                        int i5 = parseInt2;
                        parseInt2 = parseInt;
                        parseInt = i5;
                    }
                    float a = vVar.mo12332a(parseInt, parseInt2, i3, i4);
                    bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a), Math.round(a * ((float) parseInt2)));
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.close();
                throw th;
            }
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
            }
            if (bitmap != null) {
                mediaMetadataRetriever.close();
                return C5856e.m15133f(bitmap, this.f17454d);
            }
            throw new C5852bd();
        }
        throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
    }

    /* renamed from: b */
    public final boolean mo12294b(Object obj, C5960s sVar) {
        return true;
    }
}
