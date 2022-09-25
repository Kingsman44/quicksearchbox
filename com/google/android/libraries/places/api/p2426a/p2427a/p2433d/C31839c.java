package com.google.android.libraries.places.api.p2426a.p2427a.p2433d;

import android.os.HandlerThread;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.android.libraries.places.api.a.a.d.c */
/* compiled from: PG */
public final /* synthetic */ class C31839c implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C31840d f85463a;

    /* renamed from: b */
    public final /* synthetic */ C146010af f85464b;

    public /* synthetic */ C31839c(C31840d dVar, C146010af afVar) {
        this.f85463a = dVar;
        this.f85464b = afVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C31840d dVar = this.f85463a;
        HandlerThread handlerThread = (HandlerThread) dVar.f85465a.remove(this.f85464b);
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
