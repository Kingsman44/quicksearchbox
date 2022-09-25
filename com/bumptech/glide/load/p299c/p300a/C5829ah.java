package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C5948g;
import com.bumptech.glide.load.C5951j;
import com.bumptech.glide.load.C5954m;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.a.ah */
/* compiled from: PG */
public final class C5829ah implements C5830ai {

    /* renamed from: a */
    private final C5640b f17419a;

    /* renamed from: b */
    private final List f17420b;

    /* renamed from: c */
    private final ParcelFileDescriptorRewinder f17421c;

    public C5829ah(ParcelFileDescriptor parcelFileDescriptor, List list, C5640b bVar) {
        this.f17419a = bVar;
        this.f17420b = list;
        this.f17421c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
    }

    /* renamed from: a */
    public final int mo12298a() {
        return C5954m.m15365b(this.f17420b, new C5951j(this.f17421c, this.f17419a));
    }

    /* renamed from: b */
    public final Bitmap mo12299b(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.f17421c.f17565a.rewind().getFileDescriptor(), (Rect) null, options);
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo12300c() {
        return C5954m.m15368e(this.f17420b, new C5948g(this.f17421c, this.f17419a));
    }

    /* renamed from: d */
    public final void mo12301d() {
    }
}
