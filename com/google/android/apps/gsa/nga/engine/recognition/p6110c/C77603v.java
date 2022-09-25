package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.recognition.C77557aj;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.v */
/* compiled from: PG */
public final class C77603v {

    /* renamed from: a */
    public final C80642f f213805a;

    /* renamed from: b */
    public final C75050a f213806b;

    /* renamed from: c */
    private Optional f213807c = Optional.empty();

    /* renamed from: d */
    private Optional f213808d = Optional.empty();

    public C77603v(C80642f fVar, C75050a aVar) {
        this.f213805a = fVar;
        this.f213806b = aVar;
    }

    /* renamed from: a */
    public final synchronized Optional mo72730a(ac acVar) {
        return this.f213807c.filter(new C77601t(this, acVar)).map(C77602u.f213804a);
    }

    /* renamed from: b */
    public final synchronized void mo72731b() {
        this.f213807c = Optional.empty();
        this.f213808d = Optional.empty();
    }

    /* renamed from: c */
    public final synchronized void mo72732c(C77557aj ajVar) {
        if (ajVar.mo72662z()) {
            this.f213807c = Optional.empty();
            this.f213808d = Optional.m71637of(ajVar.mo72638a().b());
            return;
        }
        this.f213807c = Optional.m71637of(ajVar);
    }

    /* renamed from: d */
    public final synchronized boolean mo72733d(C77557aj ajVar) {
        return Optional.m71637of(ajVar.mo72638a().b()).equals(this.f213808d);
    }

    /* renamed from: e */
    public final synchronized boolean mo72734e(ac acVar) {
        return this.f213807c.filter(new C77600s(acVar)).isPresent();
    }
}
