package com.google.android.libraries.p590as.p593b.p596b;

/* renamed from: com.google.android.libraries.as.b.b.b */
/* compiled from: PG */
final class C10823b extends C10865f {

    /* renamed from: a */
    private final String f35865a;

    public C10823b(String str) {
        if (str != null) {
            this.f35865a = str;
            return;
        }
        throw new NullPointerException("Null filepath");
    }

    /* renamed from: a */
    public final String mo19306a() {
        return this.f35865a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10865f) {
            return this.f35865a.equals(((C10865f) obj).mo19306a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f35865a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f35865a;
        return "SystemPartitionParams{filepath=" + str + "}";
    }
}
