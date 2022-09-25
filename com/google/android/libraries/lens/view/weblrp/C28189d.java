package com.google.android.libraries.lens.view.weblrp;

import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25485c;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.contrib.logging.C43709l;
import com.google.android.libraries.web.contrib.logging.C43711n;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4563i.C59892ba;
import com.google.common.p4552o.p4563i.C59895bd;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.lens.view.weblrp.d */
/* compiled from: PG */
public final class C28189d implements C43713p {

    /* renamed from: a */
    private static final C59071e f76717a = C59071e.m91332i("com.google.android.libraries.lens.view.weblrp.d");

    /* renamed from: b */
    private final C37215b f76718b;

    /* renamed from: c */
    private final C25073c f76719c;

    public C28189d(C37215b bVar, C25073c cVar) {
        this.f76718b = bVar;
        this.f76719c = cVar;
    }

    /* renamed from: l */
    private static C58833ax m52716l(C43367l lVar) {
        Object obj;
        C43323b bVar = lVar.f113300f;
        if (bVar == null) {
            bVar = C43323b.f113174a;
        }
        C62940bt r1 = C62942bv.checkIsLite(C25486d.f69438f);
        bVar.mo58887l(r1);
        if (bVar.f169962ag.mo58857o(r1.f169971d)) {
            C43323b bVar2 = lVar.f113300f;
            if (bVar2 == null) {
                bVar2 = C43323b.f113174a;
            }
            C62940bt r0 = C62942bv.checkIsLite(C25486d.f69438f);
            bVar2.mo58887l(r0);
            Object l = bVar2.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            return C58833ax.m90834k((C25486d) obj);
        }
        ((C59052c) ((C59052c) f76717a.mo56226d()).mo56372aa(50309)).mo56386p("LensClientData missing for WebLRP request");
        return C58836b.f156633a;
    }

    /* renamed from: m */
    private final void m52717m(C43367l lVar, C62722b bVar) {
        C58833ax l = m52716l(lVar);
        if (l.mo56113h() && this.f76719c.mo30254c((C25486d) l.mo56107c())) {
            C25073c cVar = this.f76719c;
            C59892ba baVar = (C59892ba) C59895bd.f161854d.createBuilder();
            baVar.copyOnWrite();
            C59895bd bdVar = (C59895bd) baVar.instance;
            bdVar.f161857b = 2;
            bdVar.f161856a |= 1;
            int i = true != ((C25486d) l.mo56107c()).f69442c ? 3 : 2;
            baVar.copyOnWrite();
            C59895bd bdVar2 = (C59895bd) baVar.instance;
            bdVar2.f161858c = i - 1;
            bdVar2.f161856a |= 2;
            cVar.mo30252a(bVar, (C59895bd) baVar.build());
        }
    }

    /* renamed from: a */
    public final void mo32323a(String str, C43709l lVar, C43367l lVar2) {
        lVar.mo46714a();
        C58833ax l = m52716l(lVar2);
        if (l.mo56113h()) {
            int a = C25485c.m46944a(((C25486d) l.mo56107c()).f69443d);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                this.f76718b.mo19974a(C37194a.f98560cQ.mo40815i(C62722b.CANCELLED));
                m52717m(lVar2, C62722b.CANCELLED);
            } else if (i == 3) {
                this.f76718b.mo19974a(C37194a.f98624dy.mo40815i(C62722b.CANCELLED));
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo32324b(String str, C43367l lVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo32325c(String str, C43367l lVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo32326d(String str, C43367l lVar) {
    }

    /* renamed from: e */
    public final void mo32327e(String str, C43711n nVar, C43367l lVar) {
        nVar.mo46731a();
        int i = nVar.mo46732b().f113280d;
        C58833ax l = m52716l(lVar);
        if (l.mo56113h()) {
            int a = C25485c.m46944a(((C25486d) l.mo56107c()).f69443d);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                this.f76718b.mo19974a(C37194a.f98560cQ.mo40815i(C62722b.INTERNAL));
                m52717m(lVar, C62722b.INTERNAL);
            } else if (i2 == 3) {
                this.f76718b.mo19974a(C37194a.f98624dy.mo40815i(C62722b.INTERNAL));
            }
        }
    }

    /* renamed from: f */
    public final void mo32328f(String str, C43367l lVar) {
        int a;
        C58833ax l = m52716l(lVar);
        if (l.mo56113h() && (a = C25485c.m46944a(((C25486d) l.mo56107c()).f69443d)) != 0 && a == 2) {
            this.f76718b.mo19974a(C37194a.f98561cR.mo40815i(C62722b.OK));
        }
    }

    /* renamed from: g */
    public final void mo32329g(C43367l lVar) {
        String str = lVar.f113296b;
        C58833ax l = m52716l(lVar);
        if (l.mo56113h()) {
            int a = C25485c.m46944a(((C25486d) l.mo56107c()).f69443d);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 0) {
                ((C59052c) ((C59052c) f76717a.mo56225c()).mo56372aa(50315)).mo56389s("Unknown page load for request: %s", lVar.f113296b);
            } else if (i == 1) {
                this.f76718b.mo19974a(C37194a.f98559cP);
            } else if (i == 3) {
                this.f76718b.mo19974a(C37194a.f98623dx);
            }
        }
    }

    /* renamed from: h */
    public final void mo32330h(String str, String str2, C43367l lVar) {
        C58833ax l = m52716l(lVar);
        if (l.mo56113h()) {
            int a = C25485c.m46944a(((C25486d) l.mo56107c()).f69443d);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                this.f76718b.mo19974a(C37194a.f98560cQ.mo40815i(C62722b.OK));
                m52717m(lVar, C62722b.OK);
            } else if (i == 3) {
                this.f76718b.mo19974a(C37194a.f98624dy.mo40815i(C62722b.OK));
            }
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void mo32331i(C43367l lVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo32332j() {
    }

    /* renamed from: k */
    public final void mo32333k() {
    }
}
