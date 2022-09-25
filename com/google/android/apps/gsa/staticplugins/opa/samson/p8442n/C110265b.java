package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import androidx.lifecycle.LiveData;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.b */
/* compiled from: PG */
public final class C110265b extends LiveData {

    /* renamed from: h */
    private C110260a f307286h;

    /* renamed from: b */
    public final void mo98510b(C110262ab abVar) {
        C110260a aVar = this.f307286h;
        if (aVar != null) {
            abVar.f307282a = aVar;
            this.f307286h = null;
        }
        mo5708l(abVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo98511n(C110260a aVar) {
        C110262ab abVar = (C110262ab) mo3842a();
        if (abVar != null) {
            abVar.f307282a = aVar;
            mo5708l(abVar);
            return;
        }
        this.f307286h = aVar;
    }
}
