package com.google.android.apps.gsa.search.core.google;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.searchbox.p6943b.C88537a;
import com.google.android.apps.gsa.searchbox.p6943b.C88538b;
import com.google.android.apps.gsa.searchbox.p6943b.C88539c;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.search.core.google.ch */
/* compiled from: PG */
public final class C85914ch extends C90888av {

    /* renamed from: a */
    final /* synthetic */ String f232262a;

    /* renamed from: b */
    final /* synthetic */ C60455qr f232263b;

    /* renamed from: c */
    final /* synthetic */ Query f232264c;

    /* renamed from: d */
    final /* synthetic */ C85919cm f232265d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85914ch(C85919cm cmVar, String str, C60455qr qrVar, Query query) {
        super("sendFp204ForOnDeviceClick", 2, 12);
        this.f232265d = cmVar;
        this.f232262a = str;
        this.f232263b = qrVar;
        this.f232264c = query;
    }

    public final void run() {
        long j = ((C86338r) this.f232265d.f232293g.mo27525b()).getLong("gsa_server_response_timestamp", -1);
        if (j != -1 && !BuildConfig.FLAVOR.equals(this.f232262a) && this.f232263b != null) {
            Query aL = this.f232264c.mo84275aL("and.gsa.widget.text");
            String str = this.f232262a;
            C90498f i = aL.mo84480i();
            i.mo84546E(str);
            i.mo84552K(-2, -2);
            Query ak = i.mo84568a().mo84299ak((C60456qs) this.f232263b.build());
            C85981c cVar = new C85981c();
            Long valueOf = Long.valueOf(j);
            ((C85887bj) this.f232265d.f232294h.mo27525b()).mo79436d(cVar, ak);
            cVar.mo79638d("acts", valueOf.toString());
            C90021c cVar2 = (C90021c) this.f232265d.f232292f.mo27525b();
            UriRequest b = new C85965dk(cVar, (C86338r) this.f232265d.f232293g.mo27525b()).mo79626b((C85966dl) null);
            C58976aa aaVar = C58975e.f156826a;
            if (this.f232265d.mo79548g(b, 2)) {
                C85919cm cmVar = this.f232265d;
                String str2 = this.f232262a;
                long a = ((C86124t) cmVar.f232292f.mo27525b()).mo79743a(C90120fr.f250830av);
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328821a |= 1;
                agVar.f328822b = a;
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                agVar2.f328824d = 1;
                agVar2.f328821a |= 4;
                C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
                C62940bt btVar = C88539c.f239298a;
                C88537a aVar = (C88537a) C88538b.f239291f.createBuilder();
                aVar.copyOnWrite();
                C88538b bVar = (C88538b) aVar.instance;
                str2.getClass();
                bVar.f239293a |= 1;
                bVar.f239294b = str2;
                aVar.copyOnWrite();
                C88538b bVar2 = (C88538b) aVar.instance;
                bVar2.f239295c = 1;
                bVar2.f239293a |= 2;
                aVar.copyOnWrite();
                C88538b bVar3 = (C88538b) aVar.instance;
                bVar3.f239297e = 6;
                bVar3.f239293a |= 8;
                ajVar.mo58885m(btVar, (C88538b) aVar.build());
                afVar.copyOnWrite();
                C118472ag agVar3 = (C118472ag) afVar.instance;
                C118476ak akVar = (C118476ak) ajVar.build();
                akVar.getClass();
                agVar3.f328827g = akVar;
                agVar3.f328821a |= 32;
                ((C118561t) cmVar.f232298l.mo27525b()).mo103754e(C118522by.REFRESH_SEARCH_HISTORY, (C118472ag) afVar.build());
                return;
            }
            apd apd = ((C60456qs) this.f232263b.instance).f163607d;
            if (apd == null) {
                apd = apd.f159555aA;
            }
            amt amt = (amt) apd.toBuilder();
            C60455qr qrVar = this.f232263b;
            amt.copyOnWrite();
            apd apd2 = (apd) amt.instance;
            apd2.f159611c |= 16384;
            apd2.f159600aq = true;
            qrVar.copyOnWrite();
            C60456qs qsVar = (C60456qs) qrVar.instance;
            apd apd3 = (apd) amt.build();
            apd3.getClass();
            qsVar.f163607d = apd3;
            qsVar.f163604a |= 4;
        }
    }
}
