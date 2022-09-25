package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.C85634as;
import com.google.android.apps.gsa.search.core.C85635at;
import com.google.android.apps.gsa.search.core.C86085h;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.core.udc.C87204ah;
import com.google.android.apps.gsa.search.core.udc.C87215k;
import com.google.android.apps.gsa.shared.p7144t.C90615f;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1792r.p1793a.C21629a;
import com.google.android.libraries.gcoreclient.p1792r.p1793a.C21630b;
import com.google.android.libraries.gcoreclient.p1792r.p1793a.C21635g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.l */
/* compiled from: PG */
public final class C91272l extends C90615f {

    /* renamed from: a */
    public static final C59071e f254733a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.b.l");

    /* renamed from: b */
    public final C86106b f254734b;

    /* renamed from: c */
    private final C86127w f254735c;

    /* renamed from: d */
    private final C87204ah f254736d;

    /* renamed from: e */
    private final C68214a f254737e;

    /* renamed from: f */
    private final C68214a f254738f;

    public C91272l(Context context, C22871g gVar, C86127w wVar, C87204ah ahVar, C68214a aVar, C86106b bVar, C68214a aVar2, C69464a aVar3) {
        super("LockboxApiWrapper", context, gVar, 30000, aVar3);
        this.f254735c = wVar;
        this.f254736d = ahVar;
        this.f254737e = aVar;
        this.f254734b = bVar;
        this.f254738f = aVar2;
    }

    /* renamed from: g */
    private static String m149200g(Account account) {
        return "lockbox_opt_in_status_".concat(String.valueOf(account.name));
    }

    /* renamed from: a */
    public final C86085h mo85548a(Account account, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (account == null) {
            return null;
        }
        if (this.f254736d.mo80840h()) {
            if (!this.f254736d.mo80837e(account, C56116b.DEVICE_INFO_DEVICE_LEVEL) || !this.f254736d.mo80837e(account, C56116b.SUPPL_WEB_AND_APP_DEVICE_LEVEL)) {
                return null;
            }
            C85634as asVar = (C85634as) C85635at.f231455d.createBuilder();
            boolean g = this.f254736d.mo80839g(account, C56116b.DEVICE_INFO_DEVICE_LEVEL);
            asVar.copyOnWrite();
            C85635at atVar = (C85635at) asVar.instance;
            atVar.f231457a |= 2;
            atVar.f231459c = g;
            boolean g2 = this.f254736d.mo80839g(account, C56116b.SUPPL_WEB_AND_APP_DEVICE_LEVEL);
            asVar.copyOnWrite();
            C85635at atVar2 = (C85635at) asVar.instance;
            atVar2.f231457a = 1 | atVar2.f231457a;
            atVar2.f231458b = g2;
            String str = account.name;
            return new C86085h(C58833ax.m90834k((C85635at) asVar.build()));
        } else if (((C87215k) this.f254737e.mo27525b()).mo80847h()) {
            C85634as asVar2 = (C85634as) C85635at.f231455d.createBuilder();
            boolean g3 = ((C87215k) this.f254737e.mo27525b()).mo80846g(account, C55912b.DEVICE_INFORMATION);
            asVar2.copyOnWrite();
            C85635at atVar3 = (C85635at) asVar2.instance;
            atVar3.f231457a |= 2;
            atVar3.f231459c = g3;
            boolean g4 = ((C87215k) this.f254737e.mo27525b()).mo80846g(account, C55912b.SUPPLEMENTAL_WEB_AND_APP_ACTIVITY);
            asVar2.copyOnWrite();
            C85635at atVar4 = (C85635at) asVar2.instance;
            atVar4.f231457a = 1 | atVar4.f231457a;
            atVar4.f231458b = g4;
            String str2 = account.name;
            return new C86085h(C58833ax.m90834k((C85635at) asVar2.build()));
        } else {
            ((C87215k) this.f254737e.mo27525b()).mo80848i(7);
            byte[] e = this.f254735c.f232790a.mo79722a().mo80079e(m149200g(account), (byte[]) null);
            if (e == null) {
                if (z) {
                    C86341u uVar = new C86341u((C86346z) this.f254735c.f232790a.mo79722a());
                    uVar.mo80068c(m149200g(account), C85635at.f231455d.toByteArray());
                    uVar.mo80086l(false);
                    C118522by byVar = C118522by.FETCH_OPT_IN_STATUSES;
                    C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                    afVar.copyOnWrite();
                    C118472ag agVar = (C118472ag) afVar.instance;
                    agVar.f328824d = 1;
                    agVar.f328821a |= 4;
                    ((C118561t) this.f254738f.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
                }
                return null;
            }
            C85635at atVar5 = C85635at.f231455d;
            try {
                atVar5 = (C85635at) ((C85634as) ((C85634as) C85635at.f231455d.createBuilder()).mergeFrom(e)).build();
            } catch (C62974ct e2) {
                C59104x d = f254733a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "LockboxApiWrapper");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(11516)).mo56386p("Error decoding LockboxOptInStatus.AccountEntry");
            }
            String str3 = account.name;
            return new C86085h(C58833ax.m90834k(atVar5));
        }
    }

    /* renamed from: b */
    public final C60870cx mo85549b(Account account) {
        return mo84765i(new C91269i(this, account), "setActiveGoogleNowAccount");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84763c(C21547d dVar) {
        dVar.mo26980a(new C21629a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C21551h mo85550d(Account account, C21632d dVar) {
        C21551h hVar = (C21551h) C21630b.m40752b(this.f253307n, account, dVar).mo26994a();
        if (hVar.mo27003f()) {
            if (this.f254736d.mo80840h()) {
                try {
                    C60917ed.m93034a(this.f254736d.mo80835a(account));
                } catch (CancellationException | ExecutionException unused) {
                }
            } else if (((C87215k) this.f254737e.mo27525b()).mo80847h()) {
                ((C87215k) this.f254737e.mo27525b()).mo80843c(account);
            } else {
                mo85551e(account, (C21635g) C21630b.m40751a(this.f253307n, account).mo26994a());
            }
        }
        return hVar;
    }

    /* renamed from: e */
    public final void mo85551e(Account account, C21635g gVar) {
        if (!((C21543k) gVar.mo26997c()).f59946b.mo119097c()) {
            C59104x d = f254733a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LockboxApiWrapper");
            ((C59052c) ((C59052c) d).mo56372aa(11525)).mo56389s("Error fetching opt-in status: %s", gVar.mo26997c());
            return;
        }
        C86085h a = mo85548a(account, false);
        C85634as asVar = (C85634as) C85635at.f231455d.createBuilder();
        boolean c = gVar.f59989b.f391965b.mo120482c();
        asVar.copyOnWrite();
        C85635at atVar = (C85635at) asVar.instance;
        atVar.f231457a |= 1;
        atVar.f231458b = c;
        boolean b = gVar.f59989b.f391965b.mo120481b();
        asVar.copyOnWrite();
        C85635at atVar2 = (C85635at) asVar.instance;
        atVar2.f231457a |= 2;
        atVar2.f231459c = b;
        C85635at atVar3 = (C85635at) asVar.build();
        C58976aa aaVar = C58975e.f156826a;
        C86341u uVar = new C86341u((C86346z) this.f254735c.f232790a.mo79722a());
        uVar.mo80068c(m149200g(account), atVar3.toByteArray());
        uVar.mo80086l(false);
        if (!atVar3.f231459c) {
            return;
        }
        if (a == null || !a.mo79717a()) {
            C118522by byVar = C118522by.UNKNOWN;
            C118522by byVar2 = C118522by.LOG_APPLICATIONS_TO_CLEARCUT_UNCONDITIONALLY;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = 10000;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328824d = 1;
            agVar2.f328821a |= 4;
            ((C118561t) this.f254738f.mo27525b()).mo103754e(byVar2, (C118472ag) afVar.build());
        }
    }

    /* renamed from: f */
    public final void mo85552f(Account account, C21632d dVar) {
        mo84765i(new C91271k(this, account, dVar), "optInAccount");
    }
}
