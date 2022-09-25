package com.google.android.apps.gsa.shared.p7195y;

/* renamed from: com.google.android.apps.gsa.shared.y.p */
/* compiled from: PG */
final class C91224p extends C91197bb {

    /* renamed from: a */
    private final String f254635a;

    public C91224p(String str) {
        if (str != null) {
            this.f254635a = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* renamed from: a */
    public final String mo85472a() {
        return this.f254635a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91197bb) {
            return this.f254635a.equals(((C91197bb) obj).mo85472a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f254635a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f254635a;
        return "MapImageModel{url=" + str + "}";
    }
}
