package com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b;

import com.google.android.apps.gsa.shared.p7144t.C90609a;
import com.google.android.apps.gsa.shared.p7144t.C90611b;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21550g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.h.a.b.h */
/* compiled from: PG */
public final class C21540h implements C143712ae {

    /* renamed from: a */
    private final C21545m f59941a;

    /* renamed from: b */
    private final C90611b f59942b;

    public C21540h(C90611b bVar, C21545m mVar) {
        this.f59942b = bVar;
        this.f59941a = mVar;
    }

    /* renamed from: a */
    public final void mo6030a(C143711ad adVar) {
        C90611b bVar = this.f59942b;
        C21550g a = this.f59941a.mo26932a(adVar);
        C21551h c = a.mo26997c();
        if (c.mo27003f()) {
            bVar.f253285a.f253286a.mo57356n(a);
        } else if (c.mo27001e()) {
            bVar.f253285a.f253286a.cancel(true);
        } else {
            bVar.f253285a.f253286a.mo57357o(new C90609a(c));
        }
    }
}
