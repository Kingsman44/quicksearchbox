package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.a */
/* compiled from: PG */
final class C11064a extends C11071ag {

    /* renamed from: a */
    public C50969bn f36313a;

    /* renamed from: b */
    public C51406gn f36314b;

    /* renamed from: c */
    public boolean f36315c;

    /* renamed from: d */
    public C52091ex f36316d;

    /* renamed from: e */
    public byte f36317e;

    /* renamed from: a */
    public final void mo19530a(C51406gn gnVar) {
        if (gnVar != null) {
            this.f36314b = gnVar;
            return;
        }
        throw new NullPointerException("Null communicationFluidActionsData");
    }

    /* renamed from: b */
    public final void mo19531b(C50969bn bnVar) {
        if (bnVar != null) {
            this.f36313a = bnVar;
            return;
        }
        throw new NullPointerException("Null contactSelection");
    }

    /* renamed from: c */
    public final void mo19532c(boolean z) {
        this.f36315c = z;
        this.f36317e = 1;
    }

    /* renamed from: d */
    public final void mo19533d(C52091ex exVar) {
        if (exVar != null) {
            this.f36316d = exVar;
            return;
        }
        throw new NullPointerException("Null conversationParams");
    }
}
