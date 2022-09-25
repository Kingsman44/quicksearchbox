package com.google.android.gms.car.p10760f.p10761a;

import android.os.RemoteException;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.car.p10768k.p10770b.C143324a;
import com.google.android.gms.car.p10768k.p10770b.C143325b;
import com.google.common.base.C58852bp;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.car.f.a.a */
/* compiled from: PG */
public final class C143235a {

    /* renamed from: a */
    private final C58852bp f388360a;

    /* renamed from: b */
    private final AtomicBoolean f388361b = new AtomicBoolean(false);

    public C143235a(C58852bp bpVar) {
        this.f388360a = bpVar;
    }

    /* renamed from: a */
    public final Object mo118275a(C143324a aVar) {
        try {
            return aVar.call();
        } catch (RemoteException | IllegalStateException e) {
            mo118279e(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    /* renamed from: b */
    public final Object mo118276b(C143324a aVar, Object obj) {
        try {
            return aVar.call();
        } catch (RemoteException e) {
            mo118280f(e);
            return obj;
        }
    }

    /* renamed from: c */
    public final Object mo118277c(C143324a aVar) {
        try {
            return aVar.call();
        } catch (RemoteException e) {
            mo118280f(e);
            C143236b.m232385c(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    /* renamed from: d */
    public final void mo118278d(C143325b bVar) {
        try {
            bVar.mo117950a();
        } catch (RemoteException | IllegalStateException e) {
            mo118279e(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    /* renamed from: e */
    public final void mo118279e(Exception exc) {
        if (exc instanceof RemoteException) {
            RemoteException remoteException = (RemoteException) exc;
            mo118280f(remoteException);
            C143236b.m232385c(remoteException);
        }
        if (exc instanceof IllegalStateException) {
            C143236b.m232383a((IllegalStateException) exc);
        }
        throw new RuntimeException("Unexpected exception", exc);
    }

    /* renamed from: f */
    public final void mo118280f(RemoteException remoteException) {
        if (C143109au.m232164a("CAR.CLIENT", 4)) {
            C143316a.m232514d(4, "CAR.CLIENT", (Throwable) null, "Remote exception from car service: %s", remoteException.getMessage());
        }
        if (!this.f388361b.getAndSet(true)) {
            this.f388360a.mo40846a(remoteException);
        } else if (C143109au.m232164a("CAR.CLIENT", 3)) {
            C143316a.m232511a("CAR.CLIENT", (Throwable) null, "Already handling a remote exception, ignoring");
        }
    }
}
