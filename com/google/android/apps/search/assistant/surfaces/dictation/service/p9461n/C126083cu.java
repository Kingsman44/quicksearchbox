package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cu */
/* compiled from: PG */
public final class C126083cu {

    /* renamed from: a */
    public final boolean f347480a;

    /* renamed from: b */
    public final boolean f347481b;

    /* renamed from: c */
    public final boolean f347482c;

    /* renamed from: d */
    public final C126088cz f347483d;

    public C126083cu() {
        this((byte[]) null);
    }

    public C126083cu(boolean z, boolean z2, boolean z3, C126088cz czVar) {
        C69664n.m101061g(czVar, "spokenOrTappedEmoji");
        this.f347480a = z;
        this.f347481b = z2;
        this.f347482c = z3;
        this.f347483d = czVar;
    }

    public /* synthetic */ C126083cu(byte[] bArr) {
        this(false, false, false, new C126088cz((byte[]) null));
    }

    /* renamed from: a */
    public static /* synthetic */ C126083cu m206170a(C126083cu cuVar, boolean z, boolean z2, boolean z3, C126088cz czVar, int i) {
        if ((i & 1) != 0) {
            z = cuVar.f347480a;
        }
        if ((i & 2) != 0) {
            z2 = cuVar.f347481b;
        }
        if ((i & 4) != 0) {
            z3 = cuVar.f347482c;
        }
        if ((i & 8) != 0) {
            czVar = cuVar.f347483d;
        }
        C69664n.m101061g(czVar, "spokenOrTappedEmoji");
        return new C126083cu(z, z2, z3, czVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C126083cu)) {
            return false;
        }
        C126083cu cuVar = (C126083cu) obj;
        return this.f347480a == cuVar.f347480a && this.f347481b == cuVar.f347481b && this.f347482c == cuVar.f347482c && C69664n.m101066l(this.f347483d, cuVar.f347483d);
    }

    public final int hashCode() {
        return ((((((this.f347480a ? 1 : 0) * true) + (this.f347481b ? 1 : 0)) * 31) + (this.f347482c ? 1 : 0)) * 31) + this.f347483d.hashCode();
    }

    public final String toString() {
        boolean z = this.f347480a;
        boolean z2 = this.f347481b;
        boolean z3 = this.f347482c;
        C126088cz czVar = this.f347483d;
        return "EmojiContext(canShowEmojiSuggestions=" + z + ", orationHasEmojiDeleted=" + z2 + ", orationHasEmojiSpokenOrTapped=" + z3 + ", spokenOrTappedEmoji=" + czVar + ")";
    }
}
