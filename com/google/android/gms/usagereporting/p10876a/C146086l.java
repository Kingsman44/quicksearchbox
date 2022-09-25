package com.google.android.gms.usagereporting.p10876a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.usagereporting.a.l */
/* compiled from: PG */
final class C146086l extends C146083i {

    /* renamed from: a */
    private final C143825n f394807a;

    /* renamed from: b */
    private final AtomicReference f394808b;

    /* renamed from: c */
    private final C146088n f394809c;

    /* renamed from: d */
    private final C146079e f394810d;

    public C146086l(C146079e eVar, C143825n nVar, AtomicReference atomicReference, C146088n nVar2) {
        this.f394810d = eVar;
        this.f394807a = nVar;
        this.f394808b = atomicReference;
        this.f394809c = nVar2;
    }

    /* renamed from: b */
    public final void mo122593b(Status status) {
        if (!status.mo119097c()) {
            AtomicReference atomicReference = this.f394808b;
            if (atomicReference != null) {
                atomicReference.set((Object) null);
            }
            this.f394807a.mo117682i(status);
            return;
        }
        this.f394807a.mo117682i(Status.f389615a);
    }

    /* renamed from: c */
    public final void mo122594c(Status status) {
        AtomicReference atomicReference = this.f394808b;
        if (atomicReference != null) {
            atomicReference.set((Object) null);
        }
        if (!status.mo119097c()) {
            this.f394807a.mo117682i(status);
            return;
        }
        C146088n nVar = this.f394809c;
        if (nVar == null) {
            this.f394807a.mo117682i(Status.f389615a);
            return;
        }
        AtomicReference atomicReference2 = this.f394808b;
        if (atomicReference2 != null) {
            atomicReference2.set(nVar);
        }
        this.f394810d.mo122602f(this.f394809c, this);
    }
}
