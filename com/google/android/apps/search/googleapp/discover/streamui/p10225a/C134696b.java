package com.google.android.apps.search.googleapp.discover.streamui.p10225a;

import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.a.b */
/* compiled from: PG */
public final class C134696b implements C69819a {

    /* renamed from: a */
    final /* synthetic */ C134698d f366806a;

    /* renamed from: b */
    final /* synthetic */ String f366807b;

    public C134696b(C134698d dVar, String str) {
        this.f366806a = dVar;
        this.f366807b = str;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C134698d dVar = this.f366806a;
        String str = this.f366807b;
        C69803b bVar = (C69803b) dVar.f366812d.get(str);
        if (bVar != null) {
            bVar.dispose();
        }
        dVar.f366812d.remove(str);
    }
}
