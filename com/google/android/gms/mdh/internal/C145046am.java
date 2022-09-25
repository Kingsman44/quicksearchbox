package com.google.android.gms.mdh.internal;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.android.gms.mdh.internal.am */
/* compiled from: PG */
public final /* synthetic */ class C145046am implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C145047an f392088a;

    public /* synthetic */ C145046am(C145047an anVar) {
        this.f392088a = anVar;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C145047an anVar = this.f392088a;
        synchronized (anVar.f392092d.f392105h) {
            C145050aq.m235697b(anVar.f392091c, abVar);
            anVar.f392090b = false;
            for (C145045al alVar : anVar.f392089a) {
                if (abVar.mo122491j()) {
                    alVar.mo120575a();
                } else {
                    Exception f = abVar.mo122487f();
                    if (f != null) {
                        alVar.f392086a.f394698a.mo122507u(f);
                    }
                }
            }
            anVar.f392089a.clear();
            C145050aq aqVar = anVar.f392092d;
            boolean j = abVar.mo122491j();
            if (aqVar.f392105h.size() > 1) {
                aqVar.f392105h.removeFirst();
                ((C145047an) aqVar.f392105h.getFirst()).mo120576a();
            } else if (j) {
                aqVar.f392105h.removeFirst();
            }
        }
    }
}
