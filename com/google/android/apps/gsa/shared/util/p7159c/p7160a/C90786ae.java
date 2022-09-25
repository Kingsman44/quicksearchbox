package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C90786ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90790ai f253880a;

    /* renamed from: b */
    public final /* synthetic */ C58881cr f253881b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f253882c;

    public /* synthetic */ C90786ae(C90790ai aiVar, C58881cr crVar, Runnable runnable) {
        this.f253880a = aiVar;
        this.f253881b = crVar;
        this.f253882c = runnable;
    }

    public final void run() {
        C90790ai aiVar = this.f253880a;
        C58881cr crVar = this.f253881b;
        Runnable runnable = this.f253882c;
        aiVar.f253891d = new C90789ah(aiVar, Thread.currentThread(), crVar);
        try {
            runnable.run();
        } finally {
            aiVar.mo85119d();
        }
    }
}
