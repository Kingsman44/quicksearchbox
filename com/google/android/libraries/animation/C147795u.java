package com.google.android.libraries.animation;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58405dv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58522id;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4522b.C58764rc;
import java.util.Map;

/* renamed from: com.google.android.libraries.animation.u */
/* compiled from: PG */
final class C147795u implements C147768a {

    /* renamed from: a */
    private final C58522id f398764a;

    /* renamed from: b */
    private final C147768a f398765b;

    /* renamed from: c */
    private final C58714pg f398766c;

    /* renamed from: d */
    private final C147788n f398767d;

    /* renamed from: e */
    private final C58714pg f398768e;

    /* renamed from: f */
    private final C147788n f398769f;

    public C147795u(C58522id idVar, Map.Entry entry, Map.Entry entry2, C147768a aVar) {
        this.f398764a = idVar;
        this.f398765b = aVar;
        this.f398766c = (C58714pg) entry.getKey();
        this.f398767d = (C147788n) entry.getValue();
        this.f398768e = (C58714pg) entry2.getKey();
        this.f398769f = (C147788n) entry2.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42047a(Object obj) {
        Float f = (Float) obj;
        if (f.floatValue() <= ((Float) this.f398766c.f156457c.mo55176b()).floatValue()) {
            if (!this.f398766c.mo55821l() || f.floatValue() > ((Float) this.f398766c.f156456b.mo55176b()).floatValue()) {
                this.f398765b.mo42047a(this.f398767d.mo42061a(f.floatValue()));
            } else {
                this.f398765b.mo42047a(this.f398767d.mo42061a(((Float) this.f398766c.f156456b.mo55176b()).floatValue()));
            }
        } else if (f.floatValue() < ((Float) this.f398768e.f156456b.mo55176b()).floatValue()) {
            C147768a aVar = this.f398765b;
            C58522id idVar = this.f398764a;
            C58485gu guVar = idVar.f156168b;
            C58817ah c = C58714pg.m90500c();
            int a = C58764rc.m90670a(C58597ky.m90217h(guVar, c), new C58405dv(f), C58701ou.f156429a);
            Object obj2 = null;
            if (a != -1 && ((C58714pg) idVar.f156168b.get(a)).mo5941a(f)) {
                obj2 = idVar.f156169c.get(a);
            }
            C147788n nVar = (C147788n) obj2;
            nVar.getClass();
            aVar.mo42047a(nVar.mo42061a(f.floatValue()));
        } else if (!this.f398768e.mo55822m() || f.floatValue() < ((Float) this.f398768e.f156457c.mo55176b()).floatValue()) {
            this.f398765b.mo42047a(this.f398769f.mo42061a(f.floatValue()));
        } else {
            this.f398765b.mo42047a(this.f398769f.mo42061a(((Float) this.f398768e.f156457c.mo55176b()).floatValue()));
        }
    }
}
