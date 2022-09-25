package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.a */
/* compiled from: PG */
public final class C12191a extends C12222d {

    /* renamed from: a */
    public C60870cx f38899a;

    /* renamed from: b */
    public C60870cx f38900b;

    /* renamed from: c */
    private C13023ak f38901c;

    /* renamed from: d */
    private C12991i f38902d;

    /* renamed from: a */
    public final C12223e mo20483a() {
        C13023ak akVar;
        C60870cx cxVar;
        C12991i iVar;
        C60870cx cxVar2 = this.f38899a;
        if (cxVar2 != null && (akVar = this.f38901c) != null && (cxVar = this.f38900b) != null && (iVar = this.f38902d) != null) {
            return new C12196b(cxVar2, akVar, cxVar, iVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38899a == null) {
            sb.append(" queryTextData");
        }
        if (this.f38901c == null) {
            sb.append(" textInputParams");
        }
        if (this.f38900b == null) {
            sb.append(" conversationDelta");
        }
        if (this.f38902d == null) {
            sb.append(" assistantRequestConfig");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20484b(C12991i iVar) {
        if (iVar != null) {
            this.f38902d = iVar;
            return;
        }
        throw new NullPointerException("Null assistantRequestConfig");
    }

    /* renamed from: c */
    public final void mo20485c(C13023ak akVar) {
        if (akVar != null) {
            this.f38901c = akVar;
            return;
        }
        throw new NullPointerException("Null textInputParams");
    }
}
