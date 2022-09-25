package com.google.android.libraries.mdi.download;

/* renamed from: com.google.android.libraries.mdi.download.v */
/* compiled from: PG */
final class C29682v extends C29655hz {

    /* renamed from: a */
    private final int f80376a;

    public C29682v(int i) {
        this.f80376a = i;
    }

    /* renamed from: a */
    public final int mo34800a() {
        return this.f80376a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C29655hz) && this.f80376a == ((C29655hz) obj).mo34800a();
    }

    public final int hashCode() {
        return this.f80376a ^ 1000003;
    }

    public final String toString() {
        int i = this.f80376a;
        return "RemoveFileGroupsByFilterResponse{removedFileGroupsCount=" + i + "}";
    }
}
