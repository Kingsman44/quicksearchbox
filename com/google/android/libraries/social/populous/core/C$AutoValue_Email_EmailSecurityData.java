package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_EmailSecurityData  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Email_EmailSecurityData extends Email.EmailSecurityData {

    /* renamed from: a */
    public final boolean f110638a;

    public C$AutoValue_Email_EmailSecurityData(boolean z) {
        this.f110638a = z;
    }

    /* renamed from: a */
    public final boolean mo44996a() {
        return this.f110638a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Email.EmailSecurityData) && this.f110638a == ((Email.EmailSecurityData) obj).mo44996a();
    }

    public final int hashCode() {
        return (true != this.f110638a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f110638a;
        return "EmailSecurityData{usesConfusingCharacters=" + z + "}";
    }
}
