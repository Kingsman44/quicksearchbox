package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11000d;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146036p;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.af.a.b.c.d.b */
/* compiled from: PG */
public final /* synthetic */ class C147526b implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f398179a;

    public /* synthetic */ C147526b(SettableFuture settableFuture) {
        this.f398179a = settableFuture;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        SettableFuture settableFuture = this.f398179a;
        if (((C146014aj) abVar).f394703b) {
            settableFuture.cancel(false);
        } else if (abVar.mo122491j()) {
            settableFuture.mo57356n(abVar.mo122488g());
        } else {
            Exception f = abVar.mo122487f();
            if (f != null) {
                settableFuture.mo57357o(f);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
