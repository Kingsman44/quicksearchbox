package com.google.android.odml.image;

import com.google.android.odml.image.ImageProperties;

/* renamed from: com.google.android.odml.image.a */
/* compiled from: PG */
final class C45013a extends ImageProperties.Builder {

    /* renamed from: a */
    private int f117621a;

    /* renamed from: b */
    private int f117622b;

    /* renamed from: c */
    private byte f117623c;

    /* access modifiers changed from: package-private */
    public final ImageProperties build() {
        if (this.f117623c == 3) {
            return new C45015c(this.f117621a, this.f117622b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f117623c & 1) == 0) {
            sb.append(" imageFormat");
        }
        if ((this.f117623c & 2) == 0) {
            sb.append(" storageType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: package-private */
    public final ImageProperties.Builder setImageFormat(int i) {
        this.f117621a = i;
        this.f117623c = (byte) (this.f117623c | 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ImageProperties.Builder setStorageType(int i) {
        this.f117622b = i;
        this.f117623c = (byte) (this.f117623c | 2);
        return this;
    }
}
