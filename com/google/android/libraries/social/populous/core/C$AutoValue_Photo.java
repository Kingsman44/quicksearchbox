package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Photo  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Photo extends Photo {

    /* renamed from: a */
    public final int f110667a;

    /* renamed from: b */
    public final String f110668b;

    /* renamed from: c */
    public final C58833ax f110669c;

    /* renamed from: d */
    public final PersonFieldMetadata f110670d;

    /* renamed from: e */
    public final boolean f110671e;

    public C$AutoValue_Photo(int i, String str, C58833ax axVar, PersonFieldMetadata personFieldMetadata, boolean z) {
        this.f110667a = i;
        if (str != null) {
            this.f110668b = str;
            if (axVar != null) {
                this.f110669c = axVar;
                if (personFieldMetadata != null) {
                    this.f110670d = personFieldMetadata;
                    this.f110671e = z;
                    return;
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null glyph");
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: a */
    public final int mo45046a() {
        return this.f110667a;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44976b() {
        return this.f110670d;
    }

    /* renamed from: c */
    public final C58833ax mo45047c() {
        return this.f110669c;
    }

    /* renamed from: d */
    public final String mo45048d() {
        return this.f110668b;
    }

    /* renamed from: e */
    public final boolean mo45049e() {
        return this.f110671e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Photo) {
            Photo photo = (Photo) obj;
            return this.f110667a == photo.mo45046a() && this.f110668b.equals(photo.mo45048d()) && this.f110669c.equals(photo.mo45047c()) && this.f110670d.equals(photo.mo44976b()) && this.f110671e == photo.mo45049e();
        }
    }

    public final int hashCode() {
        return ((((((((this.f110667a ^ 1000003) * 1000003) ^ this.f110668b.hashCode()) * 1000003) ^ this.f110669c.hashCode()) * 1000003) ^ this.f110670d.hashCode()) * 1000003) ^ (true != this.f110671e ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f110667a;
        String str = this.f110668b;
        String obj = this.f110669c.toString();
        String obj2 = this.f110670d.toString();
        boolean z = this.f110671e;
        return "Photo{source=" + i + ", value=" + str + ", glyph=" + obj + ", metadata=" + obj2 + ", isDefault=" + z + "}";
    }
}
