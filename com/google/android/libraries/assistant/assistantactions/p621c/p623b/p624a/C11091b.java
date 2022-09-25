package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.b */
/* compiled from: PG */
final class C11091b extends C11072ah {

    /* renamed from: a */
    private final C50969bn f36370a;

    /* renamed from: b */
    private final C51406gn f36371b;

    /* renamed from: c */
    private final boolean f36372c;

    /* renamed from: d */
    private final C52091ex f36373d;

    public C11091b(C50969bn bnVar, C51406gn gnVar, boolean z, C52091ex exVar) {
        this.f36370a = bnVar;
        this.f36371b = gnVar;
        this.f36372c = z;
        this.f36373d = exVar;
    }

    /* renamed from: a */
    public final C50969bn mo19548a() {
        return this.f36370a;
    }

    /* renamed from: b */
    public final C51406gn mo19549b() {
        return this.f36371b;
    }

    /* renamed from: c */
    public final C52091ex mo19550c() {
        return this.f36373d;
    }

    /* renamed from: d */
    public final boolean mo19551d() {
        return this.f36372c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11072ah) {
            C11072ah ahVar = (C11072ah) obj;
            return this.f36370a.equals(ahVar.mo19548a()) && this.f36371b.equals(ahVar.mo19549b()) && this.f36372c == ahVar.mo19551d() && this.f36373d.equals(ahVar.mo19550c());
        }
    }

    public final int hashCode() {
        return ((((((this.f36370a.hashCode() ^ 1000003) * 1000003) ^ this.f36371b.hashCode()) * 1000003) ^ (true != this.f36372c ? 1237 : 1231)) * 1000003) ^ this.f36373d.hashCode();
    }

    public final String toString() {
        String obj = this.f36370a.toString();
        String obj2 = this.f36371b.toString();
        boolean z = this.f36372c;
        String obj3 = this.f36373d.toString();
        return "ContactSelectionUpdate{contactSelection=" + obj + ", communicationFluidActionsData=" + obj2 + ", contactSelectionDone=" + z + ", conversationParams=" + obj3 + "}";
    }
}
