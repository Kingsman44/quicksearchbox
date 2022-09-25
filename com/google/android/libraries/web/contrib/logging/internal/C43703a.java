package com.google.android.libraries.web.contrib.logging.internal;

import com.google.android.libraries.web.contrib.logging.C43694b;
import com.google.android.libraries.web.contrib.logging.C43697e;
import com.google.android.libraries.web.contrib.logging.C43709l;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;

/* renamed from: com.google.android.libraries.web.contrib.logging.internal.a */
/* compiled from: PG */
final class C43703a {

    /* renamed from: a */
    public final C43713p f114011a;

    /* renamed from: b */
    public final Runnable f114012b;

    /* renamed from: c */
    public C43367l f114013c;

    /* renamed from: d */
    public C43376u f114014d;

    public C43703a(C43713p pVar, C43367l lVar, Runnable runnable) {
        this.f114011a = pVar;
        this.f114013c = lVar;
        this.f114012b = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46740a(C43367l lVar) {
        C43709l bVar = lVar == null ? C43697e.f114002a : new C43694b(lVar);
        C43713p pVar = this.f114011a;
        C43376u uVar = this.f114014d;
        pVar.mo32323a(uVar != null ? uVar.f113329b : this.f114013c.f113296b, bVar, this.f114013c);
        ((C43705c) this.f114012b).f114015a.f114016a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo46741b(C43376u uVar) {
        this.f114011a.mo32330h(uVar.f113329b, uVar.f113334g, this.f114013c);
        ((C43705c) this.f114012b).f114015a.f114016a = null;
    }

    /* renamed from: c */
    public final boolean mo46742c() {
        return this.f114014d != null;
    }
}
