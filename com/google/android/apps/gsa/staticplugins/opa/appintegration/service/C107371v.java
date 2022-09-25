package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.IBinder;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17845h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.v */
/* compiled from: PG */
final class C107371v extends C17845h {

    /* renamed from: a */
    final /* synthetic */ C107372w f298828a;

    public C107371v(C107372w wVar) {
        this.f298828a = wVar;
    }

    /* renamed from: a */
    public final void mo23480a(byte[] bArr) {
        this.f298828a.f298830b.post(new C107369t(this, bArr));
    }

    /* renamed from: b */
    public final void mo23481b(IBinder iBinder) {
        this.f298828a.f298830b.post(new C107370u(this, iBinder));
    }
}
