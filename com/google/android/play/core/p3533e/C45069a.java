package com.google.android.play.core.p3533e;

import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.play.core.e.a */
/* compiled from: PG */
public abstract class C45069a implements Runnable {

    /* renamed from: d */
    public final C146010af f117713d;

    public C45069a() {
        this.f117713d = null;
    }

    public C45069a(C146010af afVar) {
        this.f117713d = afVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48871a();

    /* renamed from: b */
    public final void mo48901b(Exception exc) {
        C146010af afVar = this.f117713d;
        if (afVar != null) {
            afVar.f394698a.mo122509w(exc);
        }
    }

    public final void run() {
        try {
            mo48871a();
        } catch (Exception e) {
            mo48901b(e);
        }
    }
}
