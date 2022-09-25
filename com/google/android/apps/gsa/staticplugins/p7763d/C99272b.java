package com.google.android.apps.gsa.staticplugins.p7763d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.C144023z;
import com.google.android.gms.p10725a.p10730b.C142677d;
import com.google.android.libraries.gcoreclient.p1734a.p1737b.p1738a.C21410b;
import com.google.android.libraries.gcoreclient.p1734a.p1737b.p1738a.C21411c;
import com.google.android.libraries.gcoreclient.p1763h.C21526a;
import com.google.android.libraries.gcoreclient.p1763h.C21552b;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.d.b */
/* compiled from: PG */
final class C99272b extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C99273c f277712a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99272b(C99273c cVar) {
        super("AdvertisingInfo", 2, 0);
        this.f277712a = cVar;
    }

    public final /* synthetic */ Object call() {
        C21410b bVar = null;
        if (((C21411c) this.f277712a.f277714b.mo17428b()) != null) {
            try {
                bVar = new C21410b(C142677d.m231497b(this.f277712a.f277715c));
            } catch (C144022y e) {
                throw new C21526a(e);
            } catch (C144023z e2) {
                String message = e2.getMessage();
                e2.mo119087a();
                throw new C21552b(message, e2);
            } catch (C21526a | C21552b | IOException | IllegalStateException e3) {
                ((C89911f) this.f277712a.f277717g.mo27525b()).mo83755a(e3, 151755892, 29).mo83721a();
            }
        }
        if (bVar != null) {
            C86337q b = this.f277712a.f277713a.mo80076b();
            b.mo80073h("advertising_id", bVar.f59884a.f387158a);
            b.mo80067b("limited_ad_tracking", bVar.f59884a.f387159b);
            b.apply();
        }
        return C118826c.f331422a;
    }
}
