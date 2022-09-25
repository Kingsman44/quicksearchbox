package com.google.android.apps.search.googleapp.stampviewer.p10489c;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.c.e */
/* compiled from: PG */
public final class C139349e extends C139355k {

    /* renamed from: a */
    private final boolean f378970a;

    public C139349e(boolean z) {
        this.f378970a = z;
    }

    /* renamed from: a */
    public final boolean mo114919a() {
        return this.f378970a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C139355k) && this.f378970a == ((C139355k) obj).mo114919a();
    }

    public final int hashCode() {
        return (true != this.f378970a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f378970a;
        return "PageAttachmentStateEvent{pageAttachmentOpened=" + z + "}";
    }
}
