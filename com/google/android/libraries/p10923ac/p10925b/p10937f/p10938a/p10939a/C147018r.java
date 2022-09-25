package com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.p10939a;

import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97254j;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147135aj;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147175i;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.libraries.ac.b.f.a.a.r */
/* compiled from: PG */
final class C147018r implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C147019s f396971a;

    public C147018r(C147019s sVar) {
        this.f396971a = sVar;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        Exception exc = (Exception) obj;
        C147256m mVar = (C147256m) this.f396971a.f396973b.mo27525b();
        if (mVar.f397497a) {
            C70761fa a = C147175i.m239999a(exc);
            if (a != null) {
                mVar.mo124068k("Registration execution exception, trailers=%s", exc, a.f188572b);
            } else {
                mVar.mo124068k("Registration execution exception", exc, new Object[0]);
            }
        } else {
            mVar.mo124067j("Registration execution exception", new Object[0]);
        }
        C97254j jVar = this.f396971a.f396972a.mo123824j().f397503b;
        if (((Boolean) new C58885cv(true).f156729a).booleanValue()) {
            throw C147135aj.m239929a(exc);
        }
        throw exc;
    }
}
