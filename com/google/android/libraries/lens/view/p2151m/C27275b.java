package com.google.android.libraries.lens.view.p2151m;

import android.content.ComponentName;
import androidx.browser.p059a.C0962j;
import androidx.browser.p059a.C0966n;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.lens.view.m.b */
/* compiled from: PG */
public final class C27275b extends C0966n {

    /* renamed from: b */
    final /* synthetic */ C27276c f74597b;

    public C27275b(C27276c cVar) {
        this.f74597b = cVar;
    }

    /* renamed from: a */
    public final void mo3591a(ComponentName componentName, C0962j jVar) {
        C2164c cVar = this.f74597b.f74598a;
        if (cVar != null) {
            cVar.mo5437b(jVar);
            this.f74597b.f74598a = null;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f74597b.mo32808b();
    }
}
