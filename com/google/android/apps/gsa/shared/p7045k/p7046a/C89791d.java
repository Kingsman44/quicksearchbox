package com.google.android.apps.gsa.shared.p7045k.p7046a;

import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4656j.p4657a.C61719c;
import com.google.p4656j.p4657a.C61720d;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.shared.k.a.d */
/* compiled from: PG */
final class C89791d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C89790c f243033a;

    public C89791d(C89790c cVar) {
        this.f243033a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C89789b.f243026a.mo56225c()).mo56372aa(10543)).mo56389s("Fail to fetch CRL: %s", th.getMessage());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C89057m mVar = (C89057m) obj;
        if (mVar != null) {
            try {
                byte[] array = mVar.mo83034a().mo83032c().array();
                C61720d dVar = C61720d.f166745b;
                if (array != null && array.length > 0 && dVar != null) {
                    C89789b bVar = this.f243033a.f243032c.f243025a;
                    bVar.f243027b = (C61720d) ((C61719c) ((C61719c) dVar.newBuilderForType()).mergeFrom(array)).build();
                    bVar.mo83641b();
                }
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C89792e.f243034a.mo56225c()).mo56382g(e)).mo56372aa(10561)).mo56386p("Successfully fetched CRL; error on getting response body.");
            }
        } else {
            ((C59052c) ((C59052c) C89792e.f243034a.mo56224b()).mo56372aa(10560)).mo56386p("Successfully fetched CRL, but result is null.");
        }
    }
}
