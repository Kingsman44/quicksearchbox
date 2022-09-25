package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80710cl;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.b */
/* compiled from: PG */
final class C81891b extends C81888ap {

    /* renamed from: b */
    private final C80710cl f223953b;

    /* renamed from: c */
    private final boolean f223954c;

    public C81891b(C80710cl clVar, boolean z) {
        this.f223953b = clVar;
        this.f223954c = z;
    }

    /* renamed from: a */
    public final C80710cl mo75385a() {
        return this.f223953b;
    }

    /* renamed from: b */
    public final boolean mo75386b() {
        return this.f223954c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81888ap) {
            C81888ap apVar = (C81888ap) obj;
            return this.f223953b.equals(apVar.mo75385a()) && this.f223954c == apVar.mo75386b();
        }
    }

    public final int hashCode() {
        return ((this.f223953b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f223954c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f223953b);
        boolean z = this.f223954c;
        return "SpeechTransitionInput{edgeLights=" + valueOf + ", userSpeaking=" + z + "}";
    }
}
