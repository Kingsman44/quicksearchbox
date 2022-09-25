package com.google.android.libraries.assistant.p1467d;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.appintegration.p8990b.C119515a;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17850a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17863c;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17866f;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.C17867g;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17913o;
import com.google.frameworks.client.data.android.p4634b.C61382a;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70851i;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70225e;
import p5488io.grpc.p5533i.C70852a;

/* renamed from: com.google.android.libraries.assistant.d.m */
/* compiled from: PG */
public final class C17935m implements C119515a {

    /* renamed from: a */
    private static final C70175a f51376a = C70175a.m102188c("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.platform.appintegration.endpoint.AppIntegrationService");

    /* renamed from: b */
    private static final C70175a f51377b = C70175a.m102188c("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.platform.appintegration.mosaic.endpoint.MosaicService");

    /* renamed from: c */
    private final boolean f51378c;

    public C17935m(Context context, boolean z) {
        C70175a aVar;
        Application application = (Application) context.getApplicationContext();
        if (z) {
            aVar = f51377b;
        } else {
            aVar = f51376a;
        }
        C70225e a = C70225e.m102371a(aVar, application);
        a.mo61889e(new C61382a(C143701ac.m233450a(application)));
        C70286co c = a.f187197a.mo57963c();
        context.getPackageName();
        C17863c cVar = (C17863c) C70852a.m103707c(new C17850a(), c, C70851i.f189015a);
        this.f51378c = z;
    }

    /* renamed from: a */
    public final void mo23492a(C17881ak akVar) {
        C17866f fVar = (C17866f) C17867g.f51196f.createBuilder();
        fVar.copyOnWrite();
        C17867g gVar = (C17867g) fVar.instance;
        akVar.getClass();
        gVar.f51200c = akVar;
        gVar.f51198a |= 2;
        boolean z = this.f51378c;
        fVar.copyOnWrite();
        C17867g gVar2 = (C17867g) fVar.instance;
        gVar2.f51198a |= 8;
        gVar2.f51202e = z;
        if ((akVar.f51233a & 16) != 0) {
            C17913o oVar = akVar.f51238f;
            if (oVar == null) {
                oVar = C17913o.f51320c;
            }
            int b = C17912n.m35110b(oVar.f51323b);
            if (b != 0 && b == 2) {
                fVar.copyOnWrite();
                C17867g gVar3 = (C17867g) fVar.instance;
                gVar3.f51198a |= 4;
                gVar3.f51201d = true;
            }
        }
        C17867g gVar4 = (C17867g) fVar.build();
        throw null;
    }

    /* renamed from: b */
    public final boolean mo23493b() {
        return false;
    }
}
