package com.google.android.odml.image;

/* compiled from: PG */
public abstract class ImageProperties {

    /* compiled from: PG */
    abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract ImageProperties build();

        /* access modifiers changed from: package-private */
        public abstract Builder setImageFormat(int i);

        /* access modifiers changed from: package-private */
        public abstract Builder setStorageType(int i);
    }

    static Builder builder() {
        return new C45013a();
    }

    /* renamed from: a */
    public abstract int mo48850a();

    /* renamed from: b */
    public abstract int mo48851b();
}
