package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.j */
/* compiled from: PG */
final class C107143j implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C107144k f298221a;

    public C107143j(C107144k kVar) {
        this.f298221a = kVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) C107144k.f298222a.mo56225c()).mo56372aa(25333)).mo56354G("Failed to download image from %s, Error: %s", C58485gu.m89842j(this.f298221a.f298232k.f298206a), th.getMessage());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        try {
            this.f298221a.mo95804j();
        } catch (Throwable th) {
            mo17701gl(th);
        }
    }
}
