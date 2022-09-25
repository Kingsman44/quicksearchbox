package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37462ck;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.m */
/* compiled from: PG */
final class C121797m {

    /* renamed from: a */
    public final C37462ck f338000a;

    /* renamed from: b */
    public final C37410bo f338001b;

    public C121797m(C37462ck ckVar, C37410bo boVar) {
        C69664n.m101061g(ckVar, "audioRoutingRequestParams");
        C69664n.m101061g(boVar, "audioRequestMicInputParams");
        this.f338000a = ckVar;
        this.f338001b = boVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121797m)) {
            return false;
        }
        C121797m mVar = (C121797m) obj;
        return C69664n.m101066l(this.f338000a, mVar.f338000a) && C69664n.m101066l(this.f338001b, mVar.f338001b);
    }

    public final int hashCode() {
        return (this.f338000a.hashCode() * 31) + this.f338001b.hashCode();
    }

    public final String toString() {
        C37462ck ckVar = this.f338000a;
        C37410bo boVar = this.f338001b;
        return "AudioLibraryParams(audioRoutingRequestParams=" + ckVar + ", audioRequestMicInputParams=" + boVar + ")";
    }
}
