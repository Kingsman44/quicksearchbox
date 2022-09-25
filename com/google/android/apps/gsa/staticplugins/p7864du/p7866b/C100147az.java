package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.common.base.FinalizableReference;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.az */
/* compiled from: PG */
public final class C100147az {

    /* renamed from: a */
    public final Set f280035a = C58758qx.m90653k();

    /* renamed from: b */
    public final C100176ca f280036b;

    public C100147az() {
        C100176ca caVar = new C100176ca();
        this.f280036b = caVar;
    }

    /* renamed from: a */
    public final int mo91776a() {
        return this.f280035a.size();
    }

    /* renamed from: b */
    public final void mo91777b() {
        C100176ca caVar = this.f280036b;
        Reference poll = caVar.f280115b.poll();
        if (poll != null) {
            do {
                poll.clear();
                if (poll != null) {
                    try {
                        if (poll instanceof FinalizableReference) {
                            ((FinalizableReference) poll).finalizeReferent();
                        }
                    } catch (Throwable th) {
                        ((C59052c) ((C59052c) ((C59052c) C100176ca.f280114a.mo56225c()).mo56382g(th)).mo56372aa(33228)).mo56386p("Error finalizing reference");
                    }
                    poll = caVar.f280115b.poll();
                } else {
                    return;
                }
            } while (poll != null);
        }
    }
}
