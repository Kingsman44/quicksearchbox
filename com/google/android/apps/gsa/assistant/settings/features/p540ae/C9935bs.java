package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.accounts.Account;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a.C9861b;
import com.google.android.apps.gsa.assistant.settings.features.p562ao.C10180d;
import com.google.android.apps.gsa.assistant.settings.shared.e.b;
import com.google.android.apps.gsa.assistant.settings.shared.e.c;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.ui.IdentityView;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.AccountMenu;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.assistant.p3861at.C49842b;
import com.google.assistant.p3861at.C50270qw;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bs */
/* compiled from: PG */
public final class C9935bs {

    /* renamed from: a */
    public static final C59071e f34041a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ae.bs");

    /* renamed from: b */
    public final C9922bf f34042b;

    /* renamed from: c */
    public final c f34043c;

    /* renamed from: d */
    public final C91189au f34044d;

    /* renamed from: e */
    public final h f34045e;

    /* renamed from: f */
    public final C30305n f34046f;

    /* renamed from: g */
    public final GmsheadAccountsModelUpdater f34047g;

    /* renamed from: h */
    public final C86054o f34048h;

    /* renamed from: i */
    public final C86124t f34049i;

    /* renamed from: j */
    public final Set f34050j;

    /* renamed from: k */
    public final C69464a f34051k;

    /* renamed from: l */
    public final C10180d f34052l;

    /* renamed from: m */
    public final C28310af f34053m;

    /* renamed from: n */
    public final C28443m f34054n;

    /* renamed from: o */
    public final C68214a f34055o;

    /* renamed from: p */
    public final C9861b f34056p;

    /* renamed from: q */
    public final C46801dp f34057q;

    /* renamed from: r */
    public AccountMenu f34058r;

    /* renamed from: s */
    C30282k f34059s;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bs$a */
    /* compiled from: PG */
    final class C9936a implements C46792di {

        /* renamed from: a */
        private final C9935bs f34060a;

        /* renamed from: b */
        private final b f34061b;

        public C9936a(C9935bs bsVar, b bVar) {
            this.f34060a = bsVar;
            this.f34061b = bVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59104x b = C9935bs.f34041a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MainPageV2FragPeer");
            ((C59052c) ((C59052c) b).mo56372aa(958)).mo56386p("#onError");
            this.f34061b.b(1);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            act act = (act) obj;
            C59104x b = C9935bs.f34041a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MainPageV2FragPeer");
            ((C59052c) ((C59052c) b).mo56372aa(959)).mo56386p("#onNewData");
            C9935bs bsVar = this.f34060a;
            if (!bsVar.f34049i.mo79746e(C90059dk.f249069af) && (act.f128894a & 16) != 0) {
                C49842b bVar = act.f128899f;
                if (bVar == null) {
                    bVar = C49842b.f129519l;
                }
                String str = bVar.f129528h;
                IdentityView findViewById = bsVar.f34042b.requireView().findViewById(R.id.settings_identity);
                findViewById.a(bsVar.f34044d, str);
                IdentityView.b(findViewById.b, bVar.f129527g);
                Account a = bsVar.f34045e.a();
                a.getClass();
                IdentityView.b(findViewById.c, a.name);
            }
            if (bsVar.f34049i.mo79746e(C90059dk.f249095bE) && !bsVar.f34049i.mo79746e(C90014bt.f247382gB)) {
                ArrayList arrayList = new ArrayList();
                C50282rh rhVar = act.f128876C;
                if (rhVar == null) {
                    rhVar = C50282rh.f130762c;
                }
                for (C50270qw qwVar : rhVar.f130765b) {
                    arrayList.addAll(qwVar.f130729b);
                }
                if (!arrayList.isEmpty()) {
                    LinearLayout linearLayout = (LinearLayout) bsVar.f34042b.requireView().findViewById(R.id.proactive_section);
                    bsVar.f34052l.mo18312a(linearLayout, arrayList, new C9923bg(bsVar)).ifPresent(new C9924bh(linearLayout));
                }
            }
            this.f34061b.b(0);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C9935bs(C9922bf bfVar, c cVar, C91189au auVar, h hVar, C30305n nVar, GmsheadAccountsModelUpdater gmsheadAccountsModelUpdater, C86054o oVar, C86124t tVar, Set set, C69464a aVar, C10180d dVar, C28310af afVar, C28443m mVar, C68214a aVar2, C9861b bVar, C46801dp dpVar) {
        this.f34042b = bfVar;
        this.f34043c = cVar;
        this.f34044d = auVar;
        this.f34045e = hVar;
        this.f34046f = nVar;
        this.f34047g = gmsheadAccountsModelUpdater;
        this.f34048h = oVar;
        this.f34049i = tVar;
        this.f34050j = set;
        this.f34051k = aVar;
        this.f34052l = dVar;
        this.f34053m = afVar;
        this.f34054n = mVar;
        this.f34055o = aVar2;
        this.f34056p = bVar;
        this.f34057q = dpVar;
    }
}
