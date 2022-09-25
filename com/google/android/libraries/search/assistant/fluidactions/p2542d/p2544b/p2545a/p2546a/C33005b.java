package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.b */
/* compiled from: PG */
final class C33005b extends C32987ai {

    /* renamed from: a */
    private final C50969bn f88402a;

    /* renamed from: b */
    private final C51406gn f88403b;

    /* renamed from: c */
    private final boolean f88404c;

    /* renamed from: d */
    private final C52091ex f88405d;

    public C33005b(C50969bn bnVar, C51406gn gnVar, boolean z, C52091ex exVar) {
        this.f88402a = bnVar;
        this.f88403b = gnVar;
        this.f88404c = z;
        this.f88405d = exVar;
    }

    /* renamed from: a */
    public final C50969bn mo38448a() {
        return this.f88402a;
    }

    /* renamed from: b */
    public final C51406gn mo38449b() {
        return this.f88403b;
    }

    /* renamed from: c */
    public final C52091ex mo38450c() {
        return this.f88405d;
    }

    /* renamed from: d */
    public final boolean mo38451d() {
        return this.f88404c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32987ai) {
            C32987ai aiVar = (C32987ai) obj;
            return this.f88402a.equals(aiVar.mo38448a()) && this.f88403b.equals(aiVar.mo38449b()) && this.f88404c == aiVar.mo38451d() && this.f88405d.equals(aiVar.mo38450c());
        }
    }

    public final int hashCode() {
        return ((((((this.f88402a.hashCode() ^ 1000003) * 1000003) ^ this.f88403b.hashCode()) * 1000003) ^ (true != this.f88404c ? 1237 : 1231)) * 1000003) ^ this.f88405d.hashCode();
    }

    public final String toString() {
        String obj = this.f88402a.toString();
        String obj2 = this.f88403b.toString();
        boolean z = this.f88404c;
        String obj3 = this.f88405d.toString();
        return "ContactSelectionUpdate{contactSelection=" + obj + ", communicationFluidActionsData=" + obj2 + ", contactSelectionDone=" + z + ", conversationParams=" + obj3 + "}";
    }
}
