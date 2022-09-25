package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_ContainerInfo  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_ContainerInfo extends ContainerInfo {

    /* renamed from: a */
    public final String f110615a;

    /* renamed from: b */
    public final boolean f110616b;

    /* renamed from: c */
    public final int f110617c;

    public C$AutoValue_ContainerInfo(int i, String str, boolean z) {
        if (i != 0) {
            this.f110617c = i;
            if (str != null) {
                this.f110615a = str;
                this.f110616b = z;
                return;
            }
            throw new NullPointerException("Null encodedContainerId");
        }
        throw new NullPointerException("Null containerType");
    }

    /* renamed from: a */
    public final String mo44958a() {
        return this.f110615a;
    }

    /* renamed from: b */
    public final boolean mo44959b() {
        return this.f110616b;
    }

    /* renamed from: c */
    public final int mo44960c() {
        return this.f110617c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContainerInfo) {
            ContainerInfo containerInfo = (ContainerInfo) obj;
            return this.f110617c == containerInfo.mo44960c() && this.f110615a.equals(containerInfo.mo44958a()) && this.f110616b == containerInfo.mo44959b();
        }
    }

    public final int hashCode() {
        return ((((this.f110617c ^ 1000003) * 1000003) ^ this.f110615a.hashCode()) * 1000003) ^ (true != this.f110616b ? 1237 : 1231);
    }

    public final String toString() {
        String num = Integer.toString(this.f110617c - 1);
        String str = this.f110615a;
        boolean z = this.f110616b;
        return "ContainerInfo{containerType=" + num + ", encodedContainerId=" + str + ", fromVerifiedField=" + z + "}";
    }
}
