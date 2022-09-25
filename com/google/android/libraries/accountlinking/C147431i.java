package com.google.android.libraries.accountlinking;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.accountlinking.i */
/* compiled from: PG */
public final class C147431i {

    /* renamed from: a */
    public final C58528ij f397967a;

    /* renamed from: b */
    public final C58528ij f397968b;

    /* renamed from: c */
    public final C58485gu f397969c;

    /* renamed from: d */
    public final String f397970d = null;

    /* renamed from: e */
    public final String f397971e;

    /* renamed from: f */
    public final String f397972f;

    /* renamed from: g */
    public final int f397973g;

    /* renamed from: h */
    public final int f397974h;

    public C147431i(C147430h hVar) {
        C58528ij ijVar = hVar.f397960a;
        ijVar.getClass();
        C58838bb.m90869d(!ijVar.isEmpty(), "Set<Flow> enabledFlows must not be empty.");
        String str = hVar.f397964e;
        str.getClass();
        this.f397967a = hVar.f397960a;
        this.f397971e = hVar.f397963d;
        this.f397972f = str;
        this.f397973g = hVar.f397965f;
        this.f397968b = hVar.f397961b;
        this.f397969c = hVar.f397962c;
        this.f397974h = hVar.f397966g;
    }

    /* renamed from: a */
    public final C147430h mo124167a() {
        C147430h hVar = new C147430h();
        hVar.mo124166c(this.f397967a);
        hVar.f397964e = this.f397972f;
        hVar.f397965f = this.f397973g;
        hVar.f397963d = this.f397971e;
        hVar.f397966g = this.f397974h;
        C58528ij ijVar = this.f397968b;
        if (ijVar != null) {
            hVar.mo124164a(ijVar);
        }
        C58485gu guVar = this.f397969c;
        if (guVar != null) {
            hVar.mo124165b(guVar);
        }
        return hVar;
    }
}
