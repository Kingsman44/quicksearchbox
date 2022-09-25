package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87316ao;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87320c;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7209d.C91418a;
import com.google.android.apps.gsa.sidekick.shared.util.C91995n;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.bo */
/* compiled from: PG */
final class C104574bo implements C91417d {

    /* renamed from: a */
    final /* synthetic */ C104576bq f291018a;

    public C104574bo(C104576bq bqVar) {
        this.f291018a = bqVar;
    }

    /* renamed from: a */
    public final void mo85763a(C23056g gVar, C7718hj hjVar, boolean z, boolean z2, boolean z3, String str, C91418a aVar) {
        C7718hj hjVar2 = hjVar;
        boolean z4 = z;
        C91418a aVar2 = aVar;
        C104576bq bqVar = this.f291018a;
        bqVar.f291029j--;
        int size = bqVar.f291021b.mo28755f().size();
        if (size == 0) {
            ((C59052c) ((C59052c) C104576bq.f291020a.mo56226d()).mo56372aa(22011)).mo56389s("There are no children with name %s that belong to this cluster.", "CHILDREN");
            int i = C90755l.f253831a;
        } else if (size == 1) {
            C104576bq bqVar2 = this.f291018a;
            bqVar2.f291026g.mo85763a(bqVar2, hjVar, z, z2, z3, str, aVar);
        } else {
            this.f291018a.f291021b.mo85773b(gVar);
            if (z2) {
                String a = C91995n.m151000a(hjVar2, str, this.f291018a.f291022c);
                C104576bq bqVar3 = this.f291018a;
                C23052c cVar = bqVar3.f63405W;
                String str2 = z3 ? bqVar3.f291023d : BuildConfig.FLAVOR;
                C87320c cVar2 = C87320c.PREEMPTIVE;
                C58833ax k = C58833ax.m90834k(new C104573bn(this, z4, hjVar2, aVar2));
                C58836b bVar = C58836b.f156633a;
                bqVar3.f291031l = new C87316ao(cVar, a, str2, cVar2, k, bVar, bVar);
                C104576bq bqVar4 = this.f291018a;
                C87316ao aoVar = bqVar4.f291031l;
                aoVar.f235809b = new C104572bm(this, aVar2);
                bqVar4.f291024e.mo80980c(aoVar);
                return;
            }
            this.f291018a.mo94258f(z4, hjVar2);
        }
    }
}
