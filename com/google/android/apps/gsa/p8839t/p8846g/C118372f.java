package com.google.android.apps.gsa.p8839t.p8846g;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85886bi;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85963di;
import com.google.android.apps.gsa.search.core.google.C85965dk;
import com.google.android.apps.gsa.search.core.google.C86071m;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.t.g.f */
/* compiled from: PG */
public final /* synthetic */ class C118372f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118378l f328561a;

    public /* synthetic */ C118372f(C118378l lVar) {
        this.f328561a = lVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118378l lVar = this.f328561a;
        C85886bi biVar = ((C85929cw) lVar.f328572f.mo27525b()).f232334j;
        C85965dk B = ((C85929cw) lVar.f328572f.mo27525b()).mo79561B(lVar.f328571e);
        C85981c cVar = B.f232475a;
        ((C86071m) lVar.f328568b.mo27525b()).mo79491a(cVar);
        cVar.mo79637c(cVar.f232497e, "X-Device-Elapsed-Time", Long.toString(lVar.f328569c.mo26872d()));
        ((C85963di) lVar.f328573g.mo27525b()).mo79491a(cVar);
        Uri uri = cVar.f232493a;
        uri.getClass();
        String authority = uri.getAuthority();
        authority.getClass();
        cVar.mo79637c(cVar.f232497e, "Host", authority);
        Map c = B.mo79627c();
        C85981c cVar2 = B.f232475a;
        return biVar.mo79520b(c, cVar2.f232498f, cVar2.f232497e);
    }
}
