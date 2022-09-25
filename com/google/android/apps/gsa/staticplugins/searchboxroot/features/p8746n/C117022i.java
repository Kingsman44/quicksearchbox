package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.C41677c;
import com.google.android.libraries.searchbox.shared.suggestion.C41691q;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60599vw;
import com.google.common.p4552o.C60602vz;
import com.google.common.p4552o.amo;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.i */
/* compiled from: PG */
public final class C117022i implements C89196a, C89200e {

    /* renamed from: a */
    private final C117025g f324874a;

    /* renamed from: b */
    private final C68214a f324875b;

    /* renamed from: c */
    private C68214a f324876c;

    public C117022i(C117025g gVar, C68214a aVar) {
        this.f324874a = gVar;
        this.f324875b = aVar;
    }

    /* renamed from: a */
    public final void mo103102a(Suggestion suggestion, long j, int i, C60456qs qsVar, int i2) {
        C60602vz vzVar;
        amo amo;
        Suggestion suggestion2 = suggestion;
        C41691q qVar = suggestion2.f108907B.f109012f;
        if (qVar == null) {
            qVar = C41691q.f109047e;
        }
        String str = qVar.f109051c;
        int i3 = suggestion2.f108909j;
        int i4 = 3;
        if (i3 == 3) {
            i4 = 2;
        } else if (i3 != 19) {
            if (i3 != 27) {
                i4 = 1;
            } else {
                C41677c cVar = suggestion2.f108907B.f109021o;
                if (cVar == null) {
                    cVar = C41677c.f108996h;
                }
                str = cVar.f109001d;
                i4 = 5;
            }
        }
        amo amo2 = null;
        if (str.isEmpty()) {
            vzVar = null;
        } else {
            C60599vw vwVar = (C60599vw) C60602vz.f164395e.createBuilder();
            vwVar.copyOnWrite();
            C60602vz vzVar2 = (C60602vz) vwVar.instance;
            vzVar2.f164399c = i;
            vzVar2.f164397a = 2 | vzVar2.f164397a;
            vwVar.copyOnWrite();
            C60602vz vzVar3 = (C60602vz) vwVar.instance;
            str.getClass();
            vzVar3.f164397a = 1 | vzVar3.f164397a;
            vzVar3.f164398b = str;
            vwVar.copyOnWrite();
            C60602vz vzVar4 = (C60602vz) vwVar.instance;
            vzVar4.f164400d = i4 - 1;
            vzVar4.f164397a |= 4;
            vzVar = (C60602vz) vwVar.build();
        }
        C88533b bVar = (C88533b) this.f324876c.mo27525b();
        C89037bh bhVar = (C89037bh) this.f324875b.mo27525b();
        C117025g gVar = this.f324874a;
        synchronized (gVar.f324904a) {
            ClientConfig clientConfig = gVar.f324905b;
            if (clientConfig != null) {
                amo2 = clientConfig.f236951d;
            }
            amo = amo2;
        }
        bVar.mo82172c(j, 105, qsVar, bhVar, i2, amo, vzVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324876c = ((C88614r) obj).f239537h;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }
}
