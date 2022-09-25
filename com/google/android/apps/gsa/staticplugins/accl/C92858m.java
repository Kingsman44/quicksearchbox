package com.google.android.apps.gsa.staticplugins.accl;

import com.google.android.apps.gsa.binaries.satin.app.C73954bf;
import com.google.android.apps.gsa.binaries.satin.app.bh;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6491a.C84368n;
import com.google.android.apps.gsa.search.core.p6491a.C84369o;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6491a.C84371q;
import com.google.android.apps.gsa.search.core.p6491a.C84380z;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.m */
/* compiled from: PG */
public final class C92858m implements C84371q, C90991b {

    /* renamed from: a */
    private final Map f259076a = new HashMap();

    /* renamed from: b */
    private final C68214a f259077b;

    /* renamed from: c */
    private final C68214a f259078c;

    /* renamed from: d */
    private final C73954bf f259079d;

    public C92858m(C68214a aVar, C68214a aVar2, C68214a aVar3, C73954bf bfVar) {
        this.f259077b = aVar;
        ((C91022f) aVar2.mo27525b()).mo85301a(this);
        this.f259078c = aVar3;
        this.f259079d = bfVar;
    }

    /* renamed from: b */
    public final synchronized C84370p mo77930b(int i) {
        String format;
        format = String.format(Locale.US, "%s_%d", new Object[]{((C86054o) this.f259077b.mo27525b()).mo79659F(), Integer.valueOf(i)});
        if (!this.f259076a.containsKey(format)) {
            C84368n i2 = C84369o.m134630i();
            i2.mo77906b(i);
            i2.mo77907c((C84380z) this.f259078c.mo27525b());
            this.f259076a.put(format, mo77929a(i2.mo77905a()));
        }
        return (C84370p) this.f259076a.get(format);
    }

    /* renamed from: gS */
    public final synchronized void mo17602gS(C91006f fVar) {
        fVar.mo85291r("EntryPoint(ACCL)");
        for (Map.Entry entry : this.f259076a.entrySet()) {
            C91006f e = fVar.mo85281e((Object) null);
            e.mo85279c("accountName_clientType").mo85276a(C90752i.m148233g((CharSequence) entry.getKey()));
            C84370p pVar = (C84370p) entry.getValue();
            if (pVar instanceof C92747c) {
                e.mo85279c("assistant_dump").mo85276a(C90752i.m148229c(((C92747c) pVar).mo77921c()));
            }
        }
    }

    /* renamed from: a */
    public final synchronized C84370p mo77929a(C84369o oVar) {
        C73954bf bfVar;
        bfVar = this.f259079d;
        oVar.getClass();
        bfVar.f205186c = oVar;
        bfVar.f205187d = C58833ax.m90833j(((C86054o) this.f259077b.mo27525b()).mo79659F());
        C68225k.m98529a(bfVar.f205186c, C84369o.class);
        C68225k.m98529a(bfVar.f205187d, C58833ax.class);
        return new C92747c(new bh(bfVar.f205184a, bfVar.f205185b, bfVar.f205186c, bfVar.f205187d));
    }
}
