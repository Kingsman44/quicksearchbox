package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a */
/* compiled from: PG */
public final class C12582a extends C12611d {

    /* renamed from: a */
    public C12093d f39538a;

    /* renamed from: b */
    public C60870cx f39539b;

    /* renamed from: c */
    private C12991i f39540c;

    /* renamed from: d */
    private C13023ak f39541d;

    /* renamed from: a */
    public final C12612e mo20664a() {
        C12991i iVar;
        C13023ak akVar;
        C60870cx cxVar;
        C12093d dVar = this.f39538a;
        if (dVar != null && (iVar = this.f39540c) != null && (akVar = this.f39541d) != null && (cxVar = this.f39539b) != null) {
            return new C12609b(dVar, iVar, akVar, cxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39538a == null) {
            sb.append(" audioClient");
        }
        if (this.f39540c == null) {
            sb.append(" assistantRequestConfig");
        }
        if (this.f39541d == null) {
            sb.append(" textInputParams");
        }
        if (this.f39539b == null) {
            sb.append(" lastInteractionState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20665b(C12991i iVar) {
        if (iVar != null) {
            this.f39540c = iVar;
            return;
        }
        throw new NullPointerException("Null assistantRequestConfig");
    }

    /* renamed from: c */
    public final void mo20666c(C13023ak akVar) {
        if (akVar != null) {
            this.f39541d = akVar;
            return;
        }
        throw new NullPointerException("Null textInputParams");
    }
}
