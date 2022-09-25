package com.bumptech.glide.p287f.p288a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.f.a.i */
/* compiled from: PG */
public final class C5567i {
    /* renamed from: a */
    public static final C5575q m14435a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C5560b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C5565g(imageView);
        }
        String obj = cls.toString();
        throw new IllegalArgumentException("Unhandled class: " + obj + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
