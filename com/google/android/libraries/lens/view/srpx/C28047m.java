package com.google.android.libraries.lens.view.srpx;

import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.contrib.logging.C43708k;
import com.google.android.libraries.web.contrib.logging.C43709l;
import com.google.android.libraries.web.contrib.logging.C43710m;
import com.google.android.libraries.web.contrib.logging.C43711n;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59892ba;
import com.google.common.p4552o.p4563i.C59895bd;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.lens.view.srpx.m */
/* compiled from: PG */
public final class C28047m implements C43713p {

    /* renamed from: a */
    private static final C58974d f76323a = C58974d.m91135i("SrpXLogger");

    /* renamed from: b */
    private final C25073c f76324b;

    /* renamed from: c */
    private final C37215b f76325c;

    public C28047m(C37215b bVar, C25073c cVar) {
        this.f76325c = bVar;
        this.f76324b = cVar;
    }

    /* renamed from: l */
    private final void m52264l(C43367l lVar, C62722b bVar) {
        Object obj;
        if (!lVar.f113298d) {
            if ((lVar.f113295a & 16) != 0) {
                C43323b bVar2 = lVar.f113300f;
                if (bVar2 == null) {
                    bVar2 = C43323b.f113174a;
                }
                C62940bt r1 = C62942bv.checkIsLite(C25486d.f69438f);
                bVar2.mo58887l(r1);
                if (bVar2.f169962ag.mo58857o(r1.f169971d)) {
                    C43323b bVar3 = lVar.f113300f;
                    if (bVar3 == null) {
                        bVar3 = C43323b.f113174a;
                    }
                    C62940bt r0 = C62942bv.checkIsLite(C25486d.f69438f);
                    bVar3.mo58887l(r0);
                    Object l = bVar3.f169962ag.mo58854l(r0.f169971d);
                    if (l == null) {
                        obj = r0.f169969b;
                    } else {
                        obj = r0.mo58889c(l);
                    }
                    C25486d dVar = (C25486d) obj;
                    if (this.f76324b.mo30254c(dVar)) {
                        C25073c cVar = this.f76324b;
                        C59892ba baVar = (C59892ba) C59895bd.f161854d.createBuilder();
                        baVar.copyOnWrite();
                        C59895bd bdVar = (C59895bd) baVar.instance;
                        bdVar.f161857b = 1;
                        bdVar.f161856a |= 1;
                        int i = true != dVar.f69442c ? 3 : 2;
                        baVar.copyOnWrite();
                        C59895bd bdVar2 = (C59895bd) baVar.instance;
                        bdVar2.f161858c = i - 1;
                        bdVar2.f161856a |= 2;
                        cVar.mo30252a(bVar, (C59895bd) baVar.build());
                        return;
                    }
                    return;
                }
            }
            ((C58970a) ((C58970a) f76323a.mo56225c()).mo56372aa(50152)).mo56386p("LensClientData missing for SRP request");
        }
    }

    /* renamed from: a */
    public final void mo32323a(String str, C43709l lVar, C43367l lVar2) {
        lVar.mo46714a();
        C43362g gVar = C43362g.UNSPECIFIED;
        C43708k kVar = C43708k.CANCELLING_REQUEST;
        C43710m mVar = C43710m.PAGE_LOAD_ERROR;
        int ordinal = lVar.mo46714a().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f76325c.mo19974a(C37194a.f98424N.mo40815i(C62722b.CANCELLED));
        } else if (ordinal == 2) {
            this.f76325c.mo19974a(C37194a.f98424N.mo40815i(C62722b.INVALID_ARGUMENT));
        } else if (ordinal == 3) {
            this.f76325c.mo19974a(C37194a.f98424N.mo40815i(C62722b.ABORTED));
        } else if (ordinal == 4) {
            this.f76325c.mo19974a(C37194a.f98424N.mo40815i(C62722b.UNKNOWN));
        }
        m52264l(lVar2, C62722b.CANCELLED);
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
        C62722b bVar;
        nVar.mo46731a();
        C43362g gVar = C43362g.UNSPECIFIED;
        C43708k kVar = C43708k.CANCELLING_REQUEST;
        C43710m mVar = C43710m.PAGE_LOAD_ERROR;
        int ordinal = nVar.mo46731a().ordinal();
        if (ordinal == 0) {
            C43362g a = C43362g.m76515a(nVar.mo46732b().f113278b);
            if (a == null) {
                a = C43362g.UNSPECIFIED;
            }
            int ordinal2 = a.ordinal();
            if (ordinal2 == 2) {
                bVar = C62722b.INTERNAL;
            } else if (ordinal2 != 4) {
                bVar = C62722b.UNKNOWN;
            } else {
                bVar = C62722b.UNAVAILABLE;
            }
            this.f76325c.mo19974a(C37194a.f98424N.mo40815i(bVar));
        } else if (ordinal == 1) {
            this.f76325c.mo19974a(C37194a.f98424N.mo40815i(C62722b.INVALID_ARGUMENT));
        }
        m52264l(lVar, C62722b.INTERNAL);
    }

    /* renamed from: f */
    public final void mo32328f(String str, C43367l lVar) {
        this.f76325c.mo19974a(C37194a.f98423M);
    }

    /* renamed from: g */
    public final void mo32329g(C43367l lVar) {
        this.f76325c.mo19974a(C37194a.f98421K);
    }

    /* renamed from: h */
    public final void mo32330h(String str, String str2, C43367l lVar) {
        this.f76325c.mo19974a(C37194a.f98424N.mo40815i(C62722b.OK));
        m52264l(lVar, C62722b.OK);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo32331i(C43367l lVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo32332j() {
    }

    /* renamed from: k */
    public final void mo32333k() {
        this.f76325c.mo19974a(C37194a.f98422L);
    }
}
