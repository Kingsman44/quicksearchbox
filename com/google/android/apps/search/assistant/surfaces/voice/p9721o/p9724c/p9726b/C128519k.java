package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.view.View;
import androidx.p109f.p110a.C2243q;
import androidx.p109f.p110a.C2251y;
import androidx.p109f.p110a.C2252z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.k */
/* compiled from: PG */
final class C128519k implements C2243q {

    /* renamed from: a */
    final /* synthetic */ C128524p f353422a;

    /* renamed from: b */
    final /* synthetic */ View f353423b;

    public C128519k(C128524p pVar, View view) {
        this.f353422a = pVar;
        this.f353423b = view;
    }

    /* renamed from: a */
    public final void mo5581a() {
        if ((!C128524p.m209756b(this.f353423b) || C128524p.m209759e(this.f353423b) <= 0.5f) && (!C128524p.m209755a(this.f353423b) || C128524p.m209758d(this.f353423b) <= 0.5f)) {
            if (C128524p.m209755a(this.f353423b)) {
                C2251y yVar = new C2251y(this.f353423b, new C128520l());
                C128524p pVar = this.f353422a;
                yVar.f6330o = new C2252z(0.0f);
                yVar.mo5587f(new C128517i(pVar));
                yVar.mo5585d();
            }
            if (C128524p.m209756b(this.f353423b)) {
                C2251y yVar2 = new C2251y(this.f353423b, new C128521m());
                C128524p pVar2 = this.f353422a;
                yVar2.f6330o = new C2252z(0.0f);
                yVar2.mo5587f(new C128518j(pVar2));
                yVar2.mo5585d();
                return;
            }
            return;
        }
        this.f353422a.f353428c.mo5672a();
        this.f353423b.setVisibility(4);
        this.f353422a.f353426a.mo5672a();
        this.f353422a.f353427b.mo5672a();
    }
}
