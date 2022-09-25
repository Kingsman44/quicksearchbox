package com.google.android.libraries.onegoogle.account.p2346b;

/* renamed from: com.google.android.libraries.onegoogle.account.b.b */
/* compiled from: PG */
public final class C30165b extends C30164a {

    /* renamed from: a */
    public final boolean f81537a;

    public C30165b(boolean z) {
        this.f81537a = z;
    }

    /* renamed from: a */
    public final boolean mo35568a() {
        return this.f81537a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C30164a) && this.f81537a == ((C30164a) obj).mo35568a();
    }

    public final int hashCode() {
        return (true != this.f81537a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f81537a;
        return "AccountCapabilities{shouldHideEmail=" + z + "}";
    }
}
