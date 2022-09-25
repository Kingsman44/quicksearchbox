package com.google.android.libraries.places.api.model;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_PhotoMetadata  reason: invalid class name */
/* compiled from: PG */
public abstract class C$AutoValue_PhotoMetadata extends PhotoMetadata {

    /* renamed from: a */
    public final String f85524a;

    /* renamed from: b */
    public final int f85525b;

    /* renamed from: c */
    public final int f85526c;

    /* renamed from: d */
    public final String f85527d;

    public C$AutoValue_PhotoMetadata(String str, int i, int i2, String str2) {
        if (str != null) {
            this.f85524a = str;
            this.f85525b = i;
            this.f85526c = i2;
            if (str2 != null) {
                this.f85527d = str2;
                return;
            }
            throw new NullPointerException("Null photoReference");
        }
        throw new NullPointerException("Null attributions");
    }

    /* renamed from: a */
    public final int mo37495a() {
        return this.f85525b;
    }

    /* renamed from: b */
    public final int mo37496b() {
        return this.f85526c;
    }

    /* renamed from: c */
    public final String mo37497c() {
        return this.f85524a;
    }

    /* renamed from: d */
    public final String mo37498d() {
        return this.f85527d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoMetadata) {
            PhotoMetadata photoMetadata = (PhotoMetadata) obj;
            return this.f85524a.equals(photoMetadata.mo37497c()) && this.f85525b == photoMetadata.mo37495a() && this.f85526c == photoMetadata.mo37496b() && this.f85527d.equals(photoMetadata.mo37498d());
        }
    }

    public final int hashCode() {
        return ((((((this.f85524a.hashCode() ^ 1000003) * 1000003) ^ this.f85525b) * 1000003) ^ this.f85526c) * 1000003) ^ this.f85527d.hashCode();
    }

    public final String toString() {
        String str = this.f85524a;
        int i = this.f85525b;
        int i2 = this.f85526c;
        String str2 = this.f85527d;
        return "PhotoMetadata{attributions=" + str + ", height=" + i + ", width=" + i2 + ", photoReference=" + str2 + "}";
    }
}
