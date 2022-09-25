package com.google.android.libraries.notifications.platform.registration;

/* compiled from: PG */
final class AutoOneOf_AccountRepresentation$Impl_gaia extends AutoOneOf_AccountRepresentation$Parent_ {

    /* renamed from: a */
    private final String f81525a;

    public AutoOneOf_AccountRepresentation$Impl_gaia(String str) {
        this.f81525a = str;
    }

    /* renamed from: a */
    public final C30151a mo35537a() {
        return C30151a.GAIA;
    }

    /* renamed from: b */
    public final String mo35538b() {
        return this.f81525a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AccountRepresentation) {
            AccountRepresentation accountRepresentation = (AccountRepresentation) obj;
            if (C30151a.GAIA != accountRepresentation.mo35537a() || !this.f81525a.equals(accountRepresentation.mo35538b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81525a.hashCode();
    }

    public final String toString() {
        String str = this.f81525a;
        return "AccountRepresentation{gaia=" + str + "}";
    }
}
