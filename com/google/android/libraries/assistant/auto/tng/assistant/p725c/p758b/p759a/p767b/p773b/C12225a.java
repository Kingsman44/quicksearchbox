package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.a */
/* compiled from: PG */
public final class C12225a extends C12279d {

    /* renamed from: a */
    public C60870cx f38961a;

    /* renamed from: b */
    private C60870cx f38962b;

    /* renamed from: c */
    private C12991i f38963c;

    /* renamed from: a */
    public final C12280e mo20500a() {
        C60870cx cxVar;
        C12991i iVar;
        C60870cx cxVar2 = this.f38961a;
        if (cxVar2 != null && (cxVar = this.f38962b) != null && (iVar = this.f38963c) != null) {
            return new C12228b(cxVar2, cxVar, iVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38961a == null) {
            sb.append(" queryTextData");
        }
        if (this.f38962b == null) {
            sb.append(" conversationDelta");
        }
        if (this.f38963c == null) {
            sb.append(" assistantRequestConfig");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20501b(C12991i iVar) {
        if (iVar != null) {
            this.f38963c = iVar;
            return;
        }
        throw new NullPointerException("Null assistantRequestConfig");
    }

    /* renamed from: c */
    public final void mo20502c(C60870cx cxVar) {
        if (cxVar != null) {
            this.f38962b = cxVar;
            return;
        }
        throw new NullPointerException("Null conversationDelta");
    }
}
