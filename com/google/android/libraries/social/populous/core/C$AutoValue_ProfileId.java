package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_ProfileId  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_ProfileId extends ProfileId {

    /* renamed from: a */
    public final CharSequence f110672a;

    /* renamed from: b */
    public final PersonFieldMetadata f110673b;

    /* renamed from: c */
    public final C58833ax f110674c;

    /* renamed from: d */
    public final C58833ax f110675d;

    public C$AutoValue_ProfileId(CharSequence charSequence, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2) {
        if (charSequence != null) {
            this.f110672a = charSequence;
            if (personFieldMetadata != null) {
                this.f110673b = personFieldMetadata;
                if (axVar != null) {
                    this.f110674c = axVar;
                    if (axVar2 != null) {
                        this.f110675d = axVar2;
                        return;
                    }
                    throw new NullPointerException("Null photo");
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44976b() {
        return this.f110673b;
    }

    /* renamed from: c */
    public final C58833ax mo45053c() {
        return this.f110674c;
    }

    /* renamed from: d */
    public final C58833ax mo45054d() {
        return this.f110675d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProfileId) {
            ProfileId profileId = (ProfileId) obj;
            return this.f110672a.equals(profileId.mo44982g()) && this.f110673b.equals(profileId.mo44976b()) && this.f110674c.equals(profileId.mo45053c()) && this.f110675d.equals(profileId.mo45054d());
        }
    }

    /* renamed from: g */
    public final CharSequence mo44982g() {
        return this.f110672a;
    }

    public final int hashCode() {
        return ((((((this.f110672a.hashCode() ^ 1000003) * 1000003) ^ this.f110673b.hashCode()) * 1000003) ^ this.f110674c.hashCode()) * 1000003) ^ this.f110675d.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.f110672a;
        String obj = this.f110673b.toString();
        String obj2 = this.f110674c.toString();
        String obj3 = this.f110675d.toString();
        return "ProfileId{value=" + ((String) charSequence) + ", metadata=" + obj + ", name=" + obj2 + ", photo=" + obj3 + "}";
    }
}
