package com.google.android.gms.mdh.internal;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.android.gms.mdh.internal.g */
/* compiled from: PG */
public final /* synthetic */ class C145056g implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C145057h f392116a;

    public /* synthetic */ C145056g(C145057h hVar) {
        this.f392116a = hVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C145057h hVar = this.f392116a;
        synchronized (hVar.f392120d.f392131f) {
            C145060k.m235707a(hVar.f392119c, abVar);
            hVar.f392118b = false;
            for (C145055f fVar : hVar.f392117a) {
                if (abVar.mo122491j()) {
                    fVar.mo120580a();
                } else {
                    Exception f = abVar.mo122487f();
                    if (f != null) {
                        fVar.f392114a.f394698a.mo122507u(f);
                    }
                }
            }
            hVar.f392117a.clear();
            C145060k kVar = hVar.f392120d;
            boolean j = abVar.mo122491j();
            if (kVar.f392131f.size() > 1) {
                kVar.f392131f.removeFirst();
                ((C145057h) kVar.f392131f.getFirst()).mo120581a();
            } else if (j) {
                kVar.f392131f.removeFirst();
            }
        }
    }
}
