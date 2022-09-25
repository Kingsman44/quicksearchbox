package com.google.android.apps.gsa.opa.smartspace;

import android.graphics.Bitmap;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.c */
/* compiled from: PG */
public final class C83744c extends C83801q {

    /* renamed from: a */
    public C58833ax f228271a;

    /* renamed from: b */
    public Bitmap f228272b;

    /* renamed from: c */
    public C58833ax f228273c;

    public C83744c() {
        C58836b bVar = C58836b.f156633a;
        this.f228271a = bVar;
        this.f228273c = bVar;
    }

    public C83744c(C83802r rVar) {
        C58836b bVar = C58836b.f156633a;
        this.f228271a = bVar;
        this.f228273c = bVar;
        C83757d dVar = (C83757d) rVar;
        this.f228271a = dVar.f228294a;
        this.f228272b = dVar.f228295b;
        this.f228273c = dVar.f228296c;
    }

    /* renamed from: a */
    public final C83802r mo77069a() {
        return new C83757d(this.f228271a, this.f228272b, this.f228273c);
    }

    /* renamed from: b */
    public final void mo77070b(Bitmap bitmap) {
        this.f228272b = bitmap;
    }

    /* renamed from: c */
    public final void mo77071c(C58833ax axVar) {
        this.f228273c = axVar;
    }
}
