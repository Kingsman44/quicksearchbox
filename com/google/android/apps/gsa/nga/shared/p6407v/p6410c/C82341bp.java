package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bp */
/* compiled from: PG */
public final class C82341bp extends C82571kc {

    /* renamed from: a */
    private final String f224935a = "NGA_ESCAPE_HATCH_CLIENT_OP_RECEIVED";

    public C82341bp(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224935a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82571kc) {
            return this.f224935a.equals(((C82571kc) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f224935a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f224935a;
        return "NgaEscapeHatchClientOpReceivedEvent{token=" + str + "}";
    }
}
