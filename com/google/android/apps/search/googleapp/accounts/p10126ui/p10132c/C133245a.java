package com.google.android.apps.search.googleapp.accounts.p10126ui.p10132c;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.C30635r;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4880aq.C63746c;
import com.google.protos.p4880aq.C63747d;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63939c;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63940d;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.c.a */
/* compiled from: PG */
public final class C133245a implements C46792di {

    /* renamed from: a */
    private static final C59071e f363167a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.c.a");

    /* renamed from: b */
    private final Fragment f363168b;

    /* renamed from: c */
    private final Optional f363169c;

    /* renamed from: d */
    private final boolean f363170d;

    /* renamed from: e */
    private final C136969bx f363171e;

    public C133245a(Fragment fragment, boolean z, C136969bx bxVar, Optional optional) {
        this.f363168b = fragment;
        this.f363169c = optional;
        this.f363171e = bxVar;
        this.f363170d = z;
    }

    /* renamed from: d */
    private final void m216248d(int i, C137007dh dhVar) {
        ((C30635r) this.f363169c.get()).mo36288d(i, true);
        C30635r rVar = (C30635r) this.f363169c.get();
        Fragment fragment = this.f363168b;
        rVar.mo36285a(fragment, fragment.getParentFragmentManager(), (SelectedAccountDisc) this.f363168b.requireView().findViewById(R.id.googleapp_selected_account_disc));
        this.f363171e.mo113458o(dhVar);
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f363167a.mo56225c()).mo56382g(th)).mo56372aa(40026)).mo56386p("Failed to receive promotion.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C63733av avVar;
        C63747d dVar;
        C63959w wVar;
        Object obj2;
        C137007dh dhVar = (C137007dh) obj;
        if (this.f363169c.isPresent()) {
            int i = 1;
            if (dhVar.f372872b == 1) {
                avVar = (C63733av) dhVar.f372873c;
            } else {
                avVar = C63733av.f172308c;
            }
            if (avVar.f172310a == 5) {
                dVar = (C63747d) avVar.f172311b;
            } else {
                dVar = C63747d.f172457c;
            }
            int a = C63746c.m96300a(dVar.f172460b);
            if (a == 0) {
                a = 1;
            }
            if (dhVar.f372872b == 2) {
                wVar = (C63959w) dhVar.f372873c;
            } else {
                wVar = C63959w.f172981b;
            }
            C62940bt r4 = C62942bv.checkIsLite(C63940d.f172917d);
            wVar.mo58887l(r4);
            Object l = wVar.f169962ag.mo58854l(r4.f169971d);
            if (l == null) {
                obj2 = r4.f169969b;
            } else {
                obj2 = r4.mo58889c(l);
            }
            int a2 = C63939c.m96322a(((C63940d) obj2).f172920b);
            if (a2 != 0) {
                i = a2;
            }
            C63926bm a3 = C63926bm.m96318a(dhVar.f372874d);
            if (a3 == null) {
                a3 = C63926bm.UNSPECIFIED;
            }
            if (a != 2 && i != 2) {
                if (a != 3) {
                    if (i == 3) {
                        i = 3;
                    }
                    if (a != 4 || i == 4) {
                        m216248d(19, dhVar);
                    }
                    return;
                }
                if (this.f363170d) {
                    m216248d(18, dhVar);
                    return;
                }
                if (a != 4) {
                }
                m216248d(19, dhVar);
            } else if (a3 == C63926bm.HOME) {
                m216248d(12, dhVar);
            } else if (a3 == C63926bm.SEARCH) {
                m216248d(13, dhVar);
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
