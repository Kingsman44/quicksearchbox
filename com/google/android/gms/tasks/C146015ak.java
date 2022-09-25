package com.google.android.gms.tasks;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.ak */
/* compiled from: PG */
public final /* synthetic */ class C146015ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C146010af f394708a;

    public /* synthetic */ C146015ak(C146010af afVar) {
        this.f394708a = afVar;
    }

    public final void run() {
        C146010af afVar = this.f394708a;
        afVar.f394698a.mo122509w(new TimeoutException());
    }
}
