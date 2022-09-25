package com.google.apps.tiktok.dataservice.local;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46781cy;
import com.google.apps.tiktok.dataservice.C46782cz;
import com.google.apps.tiktok.dataservice.C46784da;
import com.google.apps.tiktok.tracing.C47810es;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.dataservice.local.au */
/* compiled from: PG */
final class C46846au implements Closeable, C46784da {

    /* renamed from: a */
    public final C46851e f122267a;

    /* renamed from: b */
    boolean f122268b = false;

    /* renamed from: c */
    final /* synthetic */ C46847av f122269c;

    /* renamed from: d */
    private final Executor f122270d;

    /* renamed from: e */
    private final Object f122271e = new Object();

    /* renamed from: f */
    private boolean f122272f = false;

    public C46846au(C46847av avVar, C46851e eVar, Executor executor) {
        this.f122269c = avVar;
        this.f122267a = eVar;
        this.f122270d = executor;
    }

    /* renamed from: a */
    public final void mo50795a(C46782cz czVar) {
        boolean z;
        synchronized (this.f122271e) {
            C46781cy cyVar = C46781cy.LOCAL_STATE_CHANGE;
            int ordinal = czVar.f122144c.ordinal();
            z = true;
            if (ordinal == 0) {
                this.f122272f = true;
            } else if (ordinal == 1) {
                z = false;
            } else {
                String valueOf = String.valueOf(czVar);
                throw new IllegalStateException("Unrecognized CallReason: " + valueOf);
            }
        }
        if (z) {
            this.f122270d.execute(C47810es.m84977q(new C46845at(this)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50854b() {
        boolean z;
        if (!this.f122268b) {
            C19559g.m37304c();
            if (this.f122272f) {
                C46847av avVar = this.f122269c;
                if (avVar.f122275c != null && avVar.f122276d) {
                    synchronized (this.f122271e) {
                        z = false;
                        if (this.f122272f) {
                            C46847av avVar2 = this.f122269c;
                            if (avVar2.f122275c != null && avVar2.f122276d) {
                                this.f122272f = false;
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        this.f122269c.f122275c.mo50866a(this.f122267a);
                    }
                }
            }
        }
    }

    public final void close() {
        C19559g.m37304c();
        this.f122268b = true;
    }
}
