package com.google.android.libraries.p3339v;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.android.libraries.v.c */
/* compiled from: PG */
public final /* synthetic */ class C43203c implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C43204d f112928a;

    public /* synthetic */ C43203c(C43204d dVar) {
        this.f112928a = dVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C43204d dVar = this.f112928a;
        if (((C146014aj) abVar).f394703b) {
            dVar.cancel(false);
        } else if (abVar.mo122491j()) {
            dVar.mo57356n(abVar.mo122488g());
        } else {
            Exception f = abVar.mo122487f();
            if (f != null) {
                dVar.mo57357o(f);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
