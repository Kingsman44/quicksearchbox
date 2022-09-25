package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.google.android.gms.cloudmessaging.s */
/* compiled from: PG */
public final /* synthetic */ class C143692s implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C143696w f389554a;

    /* renamed from: b */
    public final /* synthetic */ String f389555b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledFuture f389556c;

    public /* synthetic */ C143692s(C143696w wVar, String str, ScheduledFuture scheduledFuture) {
        this.f389554a = wVar;
        this.f389555b = str;
        this.f389556c = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C143696w wVar = this.f389554a;
        String str = this.f389555b;
        ScheduledFuture scheduledFuture = this.f389556c;
        synchronized (wVar.f389565c) {
            wVar.f389565c.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
