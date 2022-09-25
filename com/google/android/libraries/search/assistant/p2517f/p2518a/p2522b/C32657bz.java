package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bz */
/* compiled from: PG */
public final class C32657bz {

    /* renamed from: a */
    public final C71389v f87534a;

    /* renamed from: b */
    public final C32858d f87535b;

    public C32657bz(C71389v vVar, C32858d dVar) {
        C69664n.m101061g(dVar, "accessSessionToken");
        this.f87534a = vVar;
        this.f87535b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32657bz)) {
            return false;
        }
        C32657bz bzVar = (C32657bz) obj;
        return C69664n.m101066l(this.f87534a, bzVar.f87534a) && C69664n.m101066l(this.f87535b, bzVar.f87535b);
    }

    public final int hashCode() {
        return (this.f87534a.hashCode() * 31) + this.f87535b.hashCode();
    }

    public final String toString() {
        C71389v vVar = this.f87534a;
        C32858d dVar = this.f87535b;
        return "SubscribedChannel(channel=" + vVar + ", accessSessionToken=" + dVar + ")";
    }
}
