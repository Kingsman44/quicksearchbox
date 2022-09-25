package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.o */
/* compiled from: PG */
public final /* synthetic */ class C113208o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C113116aa f313541a;

    /* renamed from: b */
    public final /* synthetic */ String f313542b;

    public /* synthetic */ C113208o(C113116aa aaVar, String str) {
        this.f313541a = aaVar;
        this.f313542b = str;
    }

    public final void run() {
        C113116aa aaVar = this.f313541a;
        String str = this.f313542b;
        Optional f = aaVar.mo99847f(str);
        if (f.isPresent()) {
            synchronized (aaVar.f313402a) {
                aaVar.f313406e.put(str, ((CharSequence) f.get()).toString());
            }
        }
    }
}
