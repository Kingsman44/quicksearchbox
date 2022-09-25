package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_GroupOrigin  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_GroupOrigin extends GroupOrigin {

    /* renamed from: a */
    public final String f110642a;

    /* renamed from: b */
    public final Name f110643b;

    /* renamed from: c */
    public final Photo f110644c;

    public C$AutoValue_GroupOrigin(String str, Name name, Photo photo) {
        this.f110642a = str;
        this.f110643b = name;
        this.f110644c = photo;
    }

    /* renamed from: a */
    public final Name mo45006a() {
        return this.f110643b;
    }

    /* renamed from: b */
    public final Photo mo45007b() {
        return this.f110644c;
    }

    /* renamed from: c */
    public final String mo45008c() {
        return this.f110642a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupOrigin) {
            GroupOrigin groupOrigin = (GroupOrigin) obj;
            String str = this.f110642a;
            if (str != null ? str.equals(groupOrigin.mo45008c()) : groupOrigin.mo45008c() == null) {
                Name name = this.f110643b;
                if (name != null ? name.equals(groupOrigin.mo45006a()) : groupOrigin.mo45006a() == null) {
                    Photo photo = this.f110644c;
                    if (photo != null ? photo.equals(groupOrigin.mo45007b()) : groupOrigin.mo45007b() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f110642a;
        String valueOf = String.valueOf(this.f110643b);
        String valueOf2 = String.valueOf(this.f110644c);
        return "GroupOrigin{groupType=" + str + ", name=" + valueOf + ", photo=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f110642a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        Name name = this.f110643b;
        if (name == null) {
            i2 = 0;
        } else {
            i2 = name.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Photo photo = this.f110644c;
        if (photo != null) {
            i3 = photo.hashCode();
        }
        return i5 ^ i3;
    }
}
