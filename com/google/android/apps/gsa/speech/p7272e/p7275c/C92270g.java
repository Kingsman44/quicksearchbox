package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92256r;
import com.google.p395al.p408c.p414c.p416b.C8476as;

/* renamed from: com.google.android.apps.gsa.speech.e.c.g */
/* compiled from: PG */
public final class C92270g {

    /* renamed from: a */
    public final C92256r f257275a;

    /* renamed from: b */
    public final String f257276b;

    /* renamed from: c */
    public final String f257277c;

    /* renamed from: d */
    public final C92252n f257278d;

    /* renamed from: e */
    public final String[] f257279e;

    /* renamed from: f */
    public final C8476as f257280f;

    /* renamed from: g */
    public final C92249k f257281g;

    public C92270g(C92256r rVar, String str, String str2, C92249k kVar, C92252n nVar, String[] strArr, C8476as asVar) {
        this.f257275a = rVar;
        this.f257276b = str;
        this.f257277c = str2;
        this.f257281g = kVar;
        this.f257278d = nVar;
        this.f257279e = strArr;
        this.f257280f = asVar;
    }

    public final boolean equals(Object obj) {
        C92252n nVar;
        if (!(obj instanceof C92270g)) {
            return false;
        }
        C92270g gVar = (C92270g) obj;
        if (this.f257277c.equals(gVar.f257277c) && (nVar = this.f257278d) == gVar.f257278d && nVar == C92252n.GRAMMAR && this.f257281g == gVar.f257281g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f257277c.hashCode();
    }
}
