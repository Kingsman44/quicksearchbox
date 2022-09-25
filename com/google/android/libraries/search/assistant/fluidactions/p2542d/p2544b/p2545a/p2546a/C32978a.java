package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.a */
/* compiled from: PG */
final class C32978a extends C32986ah {

    /* renamed from: a */
    public C50969bn f88346a;

    /* renamed from: b */
    public C51406gn f88347b;

    /* renamed from: c */
    public boolean f88348c;

    /* renamed from: d */
    public C52091ex f88349d;

    /* renamed from: e */
    public byte f88350e;

    /* renamed from: a */
    public final void mo38430a(C51406gn gnVar) {
        if (gnVar != null) {
            this.f88347b = gnVar;
            return;
        }
        throw new NullPointerException("Null communicationFluidActionsData");
    }

    /* renamed from: b */
    public final void mo38431b(C50969bn bnVar) {
        if (bnVar != null) {
            this.f88346a = bnVar;
            return;
        }
        throw new NullPointerException("Null contactSelection");
    }

    /* renamed from: c */
    public final void mo38432c(boolean z) {
        this.f88348c = z;
        this.f88350e = 1;
    }

    /* renamed from: d */
    public final void mo38433d(C52091ex exVar) {
        if (exVar != null) {
            this.f88349d = exVar;
            return;
        }
        throw new NullPointerException("Null conversationParams");
    }
}
