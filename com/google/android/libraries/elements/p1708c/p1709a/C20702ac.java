package com.google.android.libraries.elements.p1708c.p1709a;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21311r;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: com.google.android.libraries.elements.c.a.ac */
/* compiled from: PG */
public final class C20702ac {

    /* renamed from: a */
    public final Map f58001a = new HashMap();

    /* renamed from: b */
    public final C68214a f58002b;

    /* renamed from: c */
    public final C70128t f58003c;

    /* renamed from: d */
    public final Object f58004d = new Object();

    /* renamed from: e */
    private boolean f58005e;

    /* renamed from: f */
    private final C70128t f58006f;

    public C20702ac(C68214a aVar, C70128t tVar, C70128t tVar2) {
        this.f58002b = aVar;
        this.f58006f = tVar;
        this.f58003c = tVar2;
    }

    /* renamed from: a */
    public final void mo25798a() {
        C69803b bVar;
        synchronized (this.f58004d) {
            if (!this.f58005e) {
                this.f58005e = true;
                for (C20701ab abVar : this.f58001a.values()) {
                    if (!(abVar == null || (bVar = abVar.f57999c) == null || bVar.mo25859e())) {
                        abVar.f58000d = true;
                        C69828d.m101309f((AtomicReference) abVar.f57999c);
                        abVar.f57999c = null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo25799b() {
        synchronized (this.f58004d) {
            if (this.f58005e) {
                this.f58005e = false;
                for (String str : this.f58001a.keySet()) {
                    C20701ab abVar = (C20701ab) this.f58001a.get(str);
                    if (abVar != null && abVar.f58000d) {
                        C21311r rVar = abVar.f57998b;
                        if (rVar != null) {
                            mo25800c(str, rVar);
                            abVar.f58000d = false;
                        } else {
                            throw new C21260bc("Paused loops should not have null CommandEventData");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo25800c(String str, C21311r rVar) {
        synchronized (this.f58004d) {
            if (!this.f58005e) {
                C20701ab abVar = (C20701ab) this.f58001a.get(str);
                if (abVar != null) {
                    C69803b bVar = abVar.f57999c;
                    if (bVar != null) {
                        if (!bVar.mo25859e()) {
                            return;
                        }
                    }
                    long j = (long) (abVar.f57997a.f179578c * 1000.0f);
                    abVar.f57998b = rVar;
                    abVar.f57999c = C70120l.m102050k(j, j, TimeUnit.MILLISECONDS, this.f58006f).mo61654n(new C20745z(this, abVar, rVar));
                    return;
                }
                throw new C21260bc("Cannot start a loop that has not been registered yet");
            }
            throw new C21260bc("This LoopCommandController is paused");
        }
    }

    /* renamed from: d */
    public final void mo25801d(String str) {
        synchronized (this.f58004d) {
            C20701ab abVar = (C20701ab) this.f58001a.get(str);
            if (abVar != null) {
                abVar.f57998b = null;
                abVar.f58000d = false;
                C69803b bVar = abVar.f57999c;
                if (bVar != null) {
                    C69828d.m101309f((AtomicReference) bVar);
                    abVar.f57999c = null;
                }
            }
        }
    }
}
