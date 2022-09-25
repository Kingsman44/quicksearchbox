package com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a;

import com.google.speech.micro.GoogleEndpointer;
import java.io.Closeable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.e.b.a.a */
/* compiled from: PG */
final class C32576a implements Closeable {

    /* renamed from: a */
    public final GoogleEndpointer f87235a;

    public C32576a(GoogleEndpointer googleEndpointer) {
        this.f87235a = googleEndpointer;
    }

    public final void close() {
        this.f87235a.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32576a) && C69664n.m101066l(this.f87235a, ((C32576a) obj).f87235a);
    }

    public final int hashCode() {
        return this.f87235a.hashCode();
    }

    public final String toString() {
        GoogleEndpointer googleEndpointer = this.f87235a;
        return "CloseableGoogleEndpointer(googleEndpointer=" + googleEndpointer + ")";
    }
}
