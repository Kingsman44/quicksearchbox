package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.C143558i;

/* renamed from: com.google.android.gms.cast.internal.q */
/* compiled from: PG */
final class C143591q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C143593s f389332a;

    /* renamed from: b */
    final /* synthetic */ String f389333b;

    /* renamed from: c */
    final /* synthetic */ String f389334c;

    public C143591q(C143593s sVar, String str, String str2) {
        this.f389332a = sVar;
        this.f389333b = str;
        this.f389334c = str2;
    }

    public final void run() {
        C143558i iVar;
        synchronized (this.f389332a.f389347g) {
            iVar = (C143558i) this.f389332a.f389347g.get(this.f389333b);
        }
        if (iVar != null) {
            iVar.mo118773a(this.f389334c);
            return;
        }
        C143593s.f389337a.mo118884b("Discarded message for unknown namespace '%s'", this.f389333b);
    }
}
