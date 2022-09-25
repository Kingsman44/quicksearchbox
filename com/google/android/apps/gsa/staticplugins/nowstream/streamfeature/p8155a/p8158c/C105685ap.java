package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87316ao;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87320c;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91417d;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7209d.C91418a;
import com.google.android.apps.gsa.sidekick.shared.util.C91995n;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8142f.C105365a;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8157b.C105666b;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7718hj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ap */
/* compiled from: PG */
final class C105685ap implements C91417d {

    /* renamed from: a */
    final /* synthetic */ C105687ar f294828a;

    public C105685ap(C105687ar arVar) {
        this.f294828a = arVar;
    }

    /* renamed from: a */
    public final void mo85763a(C23056g gVar, C7718hj hjVar, boolean z, boolean z2, boolean z3, String str, C91418a aVar) {
        this.f294828a.f294873l.mo85773b(gVar);
        this.f294828a.mo94978p();
        C105666b bVar = this.f294828a.f294845P;
        bVar.mo94953d();
        bVar.mo94954e(gVar);
        if (this.f294828a.f294885x.mo56113h()) {
            ((C105365a) this.f294828a.f294885x.mo56107c()).mo94665b();
        }
        if (!this.f294828a.mo94967B()) {
            this.f294828a.mo94974l();
        }
        if (!z2) {
            this.f294828a.f294873l.mo85772a();
            this.f294828a.mo94975m(hjVar, z);
            return;
        }
        String a = C91995n.m151000a(hjVar, str, this.f294828a.f294875n);
        C105687ar arVar = this.f294828a;
        C23052c cVar = arVar.f63405W;
        String str2 = z3 ? arVar.f294876o : BuildConfig.FLAVOR;
        C87320c cVar2 = C87320c.PREEMPTIVE;
        C58833ax k = C58833ax.m90834k(new C105684ao(this, aVar, hjVar, z));
        C58836b bVar2 = C58836b.f156633a;
        C87316ao aoVar = new C87316ao(cVar, a, str2, cVar2, k, bVar2, bVar2);
        aoVar.f235809b = new C105683an(this, aoVar, aVar);
        C105687ar arVar2 = this.f294828a;
        arVar2.f294836G.f293975a = aoVar;
        arVar2.f294881t.mo80980c(aoVar);
    }
}
