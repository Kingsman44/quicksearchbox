package com.google.apps.tiktok.dataservice.p3638c;

import com.google.common.base.C58812ac;
import com.google.common.base.C58815af;
import com.google.common.base.C58817ah;
import com.google.common.base.C58818ai;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.dataservice.c.j */
/* compiled from: PG */
public final class C46753j {

    /* renamed from: a */
    public C58817ah f122102a;

    /* renamed from: b */
    public C46745b f122103b;

    /* renamed from: c */
    private C58815af f122104c;

    /* renamed from: d */
    private C58817ah f122105d;

    /* renamed from: e */
    private C46744a f122106e;

    /* renamed from: a */
    public final C46755l mo50770a() {
        C58838bb.m90866a(this.f122102a, "No ViewBinder");
        boolean z = true;
        if (this.f122103b != null && this.f122104c == null) {
            z = false;
        }
        C58838bb.m90884s(z, "DataDiffer was provided without a StableIdFunction or Equivalence.");
        if (this.f122104c != null && this.f122103b == null) {
            this.f122103b = new C46746c();
        }
        this.f122106e = new C46744a();
        return new C46755l(this.f122102a, this.f122105d, this.f122104c, this.f122103b, this.f122106e);
    }

    /* renamed from: b */
    public final void mo50771b(C58817ah ahVar) {
        this.f122105d = ahVar;
        this.f122104c = new C58818ai(ahVar, C58812ac.f156604a);
    }
}
