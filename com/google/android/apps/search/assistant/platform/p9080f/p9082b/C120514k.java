package com.google.android.apps.search.assistant.platform.p9080f.p9082b;

import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.k */
/* compiled from: PG */
public final class C120514k extends C120391a {

    /* renamed from: a */
    private final C63088z f335157a;

    public C120514k(C63088z zVar) {
        if (zVar != null) {
            this.f335157a = zVar;
            return;
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: a */
    public final C63088z mo104738a() {
        return this.f335157a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C120391a) {
            return this.f335157a.equals(((C120391a) obj).mo104738a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f335157a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f335157a.toString();
        return "AudioChunk{data=" + obj + "}";
    }
}
