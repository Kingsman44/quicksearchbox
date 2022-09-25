package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.h.a.a.a.a.c */
/* compiled from: PG */
public final class C119078c extends C119085j {

    /* renamed from: a */
    public String f332179a;

    /* renamed from: b */
    public C119084i f332180b;

    /* renamed from: c */
    private C58485gu f332181c;

    /* renamed from: d */
    private C58485gu f332182d;

    /* renamed from: a */
    public final C119086k mo104136a() {
        C58485gu guVar;
        String str;
        C119084i iVar;
        C58485gu guVar2 = this.f332181c;
        if (guVar2 != null && (guVar = this.f332182d) != null && (str = this.f332179a) != null && (iVar = this.f332180b) != null) {
            return new C119079d(guVar2, guVar, str, iVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f332181c == null) {
            sb.append(" timepoints");
        }
        if (this.f332182d == null) {
            sb.append(" words");
        }
        if (this.f332179a == null) {
            sb.append(" paragraphText");
        }
        if (this.f332180b == null) {
            sb.append(" audio");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo104137b(C119084i iVar) {
        this.f332180b = iVar;
    }

    /* renamed from: c */
    public final void mo104138c(C58485gu guVar) {
        if (guVar != null) {
            this.f332181c = guVar;
            return;
        }
        throw new NullPointerException("Null timepoints");
    }

    /* renamed from: d */
    public final void mo104139d(C58485gu guVar) {
        if (guVar != null) {
            this.f332182d = guVar;
            return;
        }
        throw new NullPointerException("Null words");
    }
}
