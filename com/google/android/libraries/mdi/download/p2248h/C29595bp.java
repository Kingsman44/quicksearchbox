package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104098hi;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28732bj;
import com.google.android.libraries.mdi.download.C28734bl;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.android.libraries.phenotype.client.C31650af;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31676o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.h.bp */
/* compiled from: PG */
public final class C29595bp implements C28746bx {

    /* renamed from: a */
    private final String f80171a;

    /* renamed from: b */
    private final String f80172b;

    /* renamed from: c */
    private final C58833ax f80173c;

    /* renamed from: d */
    private final C29594bo f80174d;

    @Deprecated
    public C29595bp() {
        this.f80171a = "com.google.android.googlequicksearchbox";
        this.f80172b = "8498";
        this.f80173c = C58836b.f156633a;
        this.f80174d = C29586bg.f80159a;
    }

    public C29595bp(C29593bn bnVar) {
        this.f80171a = bnVar.f80167a;
        this.f80172b = bnVar.f80168b;
        this.f80173c = bnVar.f80169c;
        this.f80174d = bnVar.f80170d;
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        C29045l.m53930b("%s: Add groups from ph config to Mdd.", "PhFileGroupPop");
        if (!this.f80174d.mo34772a()) {
            C29045l.m53930b("%s: The populator was disabled by enabledSupplier", "PhFileGroupPop");
            return C60866ct.f164955a;
        }
        C31652ah ahVar = new C31652ah(C31676o.m59019a(this.f80171a));
        ArrayList arrayList = new ArrayList();
        for (C28732bj bjVar : ((C28734bl) new C31650af(ahVar, this.f80172b, C28734bl.f78057b, false, C29587bh.f80160a).mo37303b()).f78059a) {
            C29045l.m53931c("%s: Found ph flag %s from ph config.", "PhFileGroupPop", bjVar.f78055a);
            C31650af afVar = new C31650af(ahVar, bjVar.f78055a, (Object) null, false, C29588bi.f80161a);
            C60870cx i = C60856cj.m92900i(C58836b.f156633a);
            if (afVar.mo37303b() != null && !((C28708an) afVar.mo37303b()).f77997b.isEmpty()) {
                if (this.f80173c.mo56113h()) {
                    C104098hi hiVar = (C104098hi) this.f80173c.mo56107c();
                    C28708an anVar = (C28708an) afVar.mo37303b();
                    i = anVar.f77997b.equals("nga_sot_configs") ? C60856cj.m92900i(C58833ax.m90834k(anVar)) : C60856cj.m92900i(C58836b.f156633a);
                } else {
                    i = C60856cj.m92900i(C58833ax.m90834k((C28708an) afVar.mo37303b()));
                }
            }
            C60870cx h = C60922j.m93045h(i, C47810es.m84966f(new C29589bj(fdVar, bjVar)), C60826bg.f164896a);
            C60856cj.m92911t(h, C47810es.m84974n(new C29591bl(afVar)), C60826bg.f164896a);
            arrayList.add(h);
        }
        return C29672d.m54726a(arrayList).mo34823a(C29590bk.f80164a, C60826bg.f164896a);
    }
}
