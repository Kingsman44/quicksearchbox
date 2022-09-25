package com.google.android.odml.image;

/* renamed from: com.google.android.odml.image.b */
/* compiled from: PG */
class C45014b extends ImageProperties {

    /* renamed from: a */
    public final int f117624a;

    /* renamed from: b */
    public final int f117625b;

    public C45014b(int i, int i2) {
        this.f117624a = i;
        this.f117625b = i2;
    }

    /* renamed from: a */
    public final int mo48850a() {
        return this.f117624a;
    }

    /* renamed from: b */
    public final int mo48851b() {
        return this.f117625b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            return this.f117624a == imageProperties.mo48850a() && this.f117625b == imageProperties.mo48851b();
        }
    }

    public int hashCode() {
        return ((this.f117624a ^ 1000003) * 1000003) ^ this.f117625b;
    }

    public final String toString() {
        int i = this.f117624a;
        int i2 = this.f117625b;
        return "ImageProperties{imageFormat=" + i + ", storageType=" + i2 + "}";
    }
}
