package com.google.android.libraries.search.assistant.invocation.p2646l.p2648b;

import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.b.c */
/* compiled from: PG */
public final class C33936c implements C33938e {

    /* renamed from: a */
    private final Instant f90510a;

    /* renamed from: b */
    private final C51450id f90511b;

    public C33936c(Instant instant, C51450id idVar) {
        C69664n.m101061g(instant, "timestamp");
        this.f90510a = instant;
        this.f90511b = idVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33936c)) {
            return false;
        }
        C33936c cVar = (C33936c) obj;
        return C69664n.m101066l(this.f90510a, cVar.f90510a) && C69664n.m101066l(this.f90511b, cVar.f90511b);
    }

    public final int hashCode() {
        return (this.f90510a.hashCode() * 31) + this.f90511b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f90510a;
        int size = this.f90511b.f133995b.size();
        int i = this.f90511b.f133994a;
        boolean z = false;
        boolean z2 = (i & 2) != 0;
        StringBuilder sb = new StringBuilder("\n    #@");
        sb.append(instant);
        sb.append(": ACQUIRED:\n    #  mediaSessionCount - ");
        sb.append(size);
        sb.append("\n    #  hasStickyApp - ");
        sb.append(z2);
        sb.append("\n    #  hasMediaFocus - ");
        if (1 == (i & 1)) {
            z = true;
        }
        sb.append(z);
        return C69764m.m101224d(sb.toString(), "#");
    }
}
