package com.google.android.libraries.assistant.pcp.p1570j.p1571a;

import com.google.android.libraries.assistant.pcp.p1578m.C18995y;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.a */
/* compiled from: PG */
final class C18782a extends C18796d {

    /* renamed from: a */
    private C18995y f52900a;

    /* renamed from: b */
    private boolean f52901b;

    /* renamed from: c */
    private byte f52902c;

    /* renamed from: a */
    public final C18797e mo24120a() {
        C18995y yVar;
        if (this.f52902c == 1 && (yVar = this.f52900a) != null) {
            return new C18794b(yVar, this.f52901b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f52900a == null) {
            sb.append(" storedElement");
        }
        if (this.f52902c == 0) {
            sb.append(" isPushed");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo24121b(boolean z) {
        this.f52901b = z;
        this.f52902c = 1;
    }

    /* renamed from: c */
    public final void mo24122c(C18995y yVar) {
        if (yVar != null) {
            this.f52900a = yVar;
            return;
        }
        throw new NullPointerException("Null storedElement");
    }
}
