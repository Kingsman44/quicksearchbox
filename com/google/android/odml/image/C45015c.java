package com.google.android.odml.image;

/* renamed from: com.google.android.odml.image.c */
/* compiled from: PG */
final class C45015c extends C45014b {

    /* renamed from: c */
    private volatile transient int f117626c;

    /* renamed from: d */
    private volatile transient boolean f117627d;

    public C45015c(int i, int i2) {
        super(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45015c) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof ImageProperties)) {
                return false;
            }
            ImageProperties imageProperties = (ImageProperties) obj;
            if (!(this.f117624a == imageProperties.mo48850a() && this.f117625b == imageProperties.mo48851b())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f117627d) {
            synchronized (this) {
                if (!this.f117627d) {
                    this.f117626c = ((this.f117624a ^ 1000003) * 1000003) ^ this.f117625b;
                    this.f117627d = true;
                }
            }
        }
        return this.f117626c;
    }
}
