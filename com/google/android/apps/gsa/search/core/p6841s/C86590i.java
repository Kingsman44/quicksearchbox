package com.google.android.apps.gsa.search.core.p6841s;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.core.udc.C87197aa;
import com.google.android.apps.gsa.search.core.udc.C87204ah;
import com.google.android.apps.gsa.search.core.udc.C87215k;
import com.google.android.apps.gsa.search.core.udc.C87230z;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91262b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.protobuf.C62947c;
import dagger.C68214a;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.s.i */
/* compiled from: PG */
public final class C86590i {

    /* renamed from: a */
    public static final C59071e f233923a = C59071e.m91332i("com.google.android.apps.gsa.search.core.s.i");

    /* renamed from: b */
    public final C68214a f233924b;

    /* renamed from: c */
    public final C86054o f233925c;

    /* renamed from: d */
    public final C86130z f233926d;

    /* renamed from: e */
    public final C86124t f233927e;

    /* renamed from: f */
    public final C90929bz f233928f;

    /* renamed from: g */
    public final C86587f f233929g = new C86587f(this);

    /* renamed from: h */
    public final C91262b f233930h;

    /* renamed from: i */
    public final C68214a f233931i;

    /* renamed from: j */
    public final C89052h f233932j;

    /* renamed from: k */
    private final C86127w f233933k;

    /* renamed from: l */
    private final C87204ah f233934l;

    public C86590i(C68214a aVar, C86054o oVar, C86130z zVar, C86124t tVar, C86127w wVar, C90929bz bzVar, C91262b bVar, C87204ah ahVar, C68214a aVar2, C89052h hVar) {
        this.f233924b = aVar;
        this.f233925c = oVar;
        this.f233926d = zVar;
        this.f233927e = tVar;
        this.f233933k = wVar;
        this.f233928f = bzVar;
        this.f233930h = bVar;
        this.f233934l = ahVar;
        this.f233931i = aVar2;
        this.f233932j = hVar;
    }

    /* renamed from: a */
    public final void mo80205a(Account account, C86589h hVar, boolean z) {
        C86338r a = this.f233933k.f232790a.mo79722a();
        String b = hVar.mo80204b(account);
        C86341u uVar = new C86341u((C86346z) a);
        uVar.mo80085k(b, Boolean.valueOf(z));
        uVar.mo80086l(false);
    }

    /* renamed from: b */
    public final boolean mo80206b(Account account, C86589h hVar) {
        Boolean bool;
        if (this.f233934l.mo80840h()) {
            return this.f233934l.mo80839g(account, hVar.f233920d);
        }
        if (((C87215k) this.f233931i.mo27525b()).mo80847h()) {
            return ((C87215k) this.f233931i.mo27525b()).mo80846g(account, hVar.f233921e);
        }
        ((C87215k) this.f233931i.mo27525b()).mo80848i(10);
        C59104x b = f233923a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SearchHistoryHelper");
        ((C59052c) ((C59052c) b).mo56372aa(8227)).mo56389s("Falling back to legacy read flow for %s", hVar);
        C86338r a = this.f233933k.f232790a.mo79722a();
        String b2 = hVar.mo80204b(account);
        if (!a.contains(b2)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(a.getBoolean(b2, false));
        }
        if (bool == null) {
            mo80205a(account, hVar, false);
            new C86583b(this, hVar, account).mo85242e(new Void[0]);
        }
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo80207c() {
        Account a = this.f233925c.mo79668a();
        boolean z = false;
        if (a != null && mo80206b(a, C86589h.AUDIO)) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }

    /* renamed from: d */
    public final boolean mo80208d(Account account, C86589h hVar, boolean z) {
        if (!this.f233934l.mo80840h()) {
            C59104x b = f233923a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SearchHistoryHelper");
            ((C59052c) ((C59052c) b).mo56372aa(8229)).mo56389s("Falling back to legacy write flow for %s", hVar);
            mo80205a(account, hVar, z);
        } else if (z) {
            C87204ah ahVar = this.f233934l;
            C56116b[] bVarArr = {hVar.f233920d};
            synchronized (ahVar.f235614d) {
                Map b2 = ahVar.mo80836b(account);
                for (int i = 0; i <= 0; i++) {
                    C56116b bVar = bVarArr[i];
                    C56116b bVar2 = C56116b.UNKNOWN_ID;
                    int ordinal = bVar.ordinal();
                    if (ordinal == 2) {
                        C87204ah.m141023d(b2, C56116b.DEVICE_INFO);
                    } else if (ordinal != 4) {
                        if (ordinal != 7) {
                            if (ordinal == 8) {
                                C87204ah.m141023d(b2, C56116b.SUPPL_WEB_AND_APP);
                            }
                        }
                        C87204ah.m141023d(b2, C56116b.WEB_AND_APP);
                    } else {
                        C87204ah.m141023d(b2, C56116b.LOCATION_HISTORY);
                    }
                    C87204ah.m141023d(b2, bVar);
                }
                C87230z zVar = (C87230z) C87197aa.f235604b.createBuilder();
                Collection values = b2.values();
                zVar.copyOnWrite();
                C87197aa aaVar = (C87197aa) zVar.instance;
                aaVar.mo80832a();
                C62947c.addAll((Iterable) values, (List) aaVar.f235606a);
                C86337q b3 = ahVar.f235613c.mo80076b();
                String str = account.name;
                b3.mo80068c("udc_cached_settings_" + str, ((C87197aa) zVar.build()).toByteArray());
                b3.apply();
            }
        }
        C90748e.m148224b();
        return this.f233929g.mo80202b(account, hVar, z);
    }
}
