package com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.a.b */
/* compiled from: PG */
public final class C16621b extends C16615a {

    /* renamed from: a */
    private final String f48710a;

    public C16621b(String str) {
        if (str != null) {
            this.f48710a = str;
            return;
        }
        throw new NullPointerException("Null imageId");
    }

    /* renamed from: a */
    public final String mo22931a() {
        return this.f48710a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16615a) {
            return this.f48710a.equals(((C16615a) obj).mo22931a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f48710a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f48710a;
        return "AutoImageId{imageId=" + str + "}";
    }
}
