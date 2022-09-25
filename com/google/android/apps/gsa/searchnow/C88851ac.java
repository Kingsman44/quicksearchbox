package com.google.android.apps.gsa.searchnow;

import com.google.android.apps.gsa.shared.monet.C90163ad;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90196b;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;

/* renamed from: com.google.android.apps.gsa.searchnow.ac */
/* compiled from: PG */
final class C88851ac extends C90163ad {

    /* renamed from: a */
    final /* synthetic */ C88861am f240559a;

    public C88851ac(C88861am amVar) {
        this.f240559a = amVar;
    }

    /* renamed from: a */
    public final void mo76767a(C22939d dVar) {
        this.f240559a.f240605f.addView(dVar.mo28297il());
        this.f240559a.f240605f.setVisibility(0);
        C90196b bVar = (C90196b) dVar;
        C88861am amVar = this.f240559a;
        amVar.f240586P = bVar;
        amVar.mo82645f();
        SearchNowDrawerLayout searchNowDrawerLayout = this.f240559a.f240607h;
        searchNowDrawerLayout.f253544i = bVar.mo83937a();
        searchNowDrawerLayout.mo84960A();
        this.f240559a.mo82648i();
    }

    /* renamed from: b */
    public final void mo76768b(C22939d dVar) {
        this.f240559a.f240605f.setVisibility(8);
        this.f240559a.f240605f.removeView(dVar.mo28297il());
        C88861am amVar = this.f240559a;
        amVar.f240586P = null;
        amVar.mo82648i();
    }
}
