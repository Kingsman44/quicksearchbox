package com.google.android.apps.search.assistant.verticals.p9880a.p9881a.p9882a;

import com.google.android.apps.search.assistant.libraries.dictation.starter.C119336d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64728g;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64732k;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64733l;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.a.a.b */
/* compiled from: PG */
public final class C130325b implements C130324a {

    /* renamed from: a */
    private static final C58974d f357221a = C58974d.m91136j();

    /* renamed from: b */
    private final C37215b f357222b;

    public C130325b(C37215b bVar) {
        this.f357222b = bVar;
    }

    /* renamed from: g */
    private static C37252a m212764g(C37258g gVar, C64735n nVar) {
        C64733l lVar = nVar.f175478j;
        if (lVar == null) {
            lVar = C64733l.f175464b;
        }
        int b = C64732k.m96449b(lVar.f175466a);
        if (b == 0) {
            b = 1;
        }
        C37252a j = gVar.mo40816j("frame_type", String.valueOf(C64732k.m96448a(b)));
        ((C37253b) j).mo40795s("app", nVar.f175474f);
        return j;
    }

    /* renamed from: h */
    private final void m212765h(C64735n nVar, C37258g gVar) {
        this.f357222b.mo19974a(m212764g(gVar, nVar));
    }

    /* renamed from: i */
    private static boolean m212766i(C64735n nVar) {
        int a = C64728g.m96445a(nVar.f175479k);
        return a == 0 || a != 2;
    }

    /* renamed from: j */
    private static C37259h m212767j(C37257f fVar, C64735n nVar) {
        C64733l lVar = nVar.f175478j;
        if (lVar == null) {
            lVar = C64733l.f175464b;
        }
        int b = C64732k.m96449b(lVar.f175466a);
        if (b == 0) {
            b = 1;
        }
        C37259h f = fVar.mo40808f("frame_type", String.valueOf(C64732k.m96448a(b)));
        ((C37253b) f.f99012a).mo40795s("app", nVar.f175474f);
        return f;
    }

    /* renamed from: a */
    public final void mo107393a(C64735n nVar) {
        if (m212766i(nVar)) {
            this.f357222b.mo19974a(m212764g(C37182a.f98053fT, nVar));
        }
    }

    /* renamed from: b */
    public final void mo107394b(C64735n nVar, C62722b bVar) {
        if (m212766i(nVar)) {
            this.f357222b.mo19974a(m212767j(C37182a.f98054fU, nVar).mo40781e(bVar));
        }
    }

    /* renamed from: c */
    public final void mo107395c(C64735n nVar, C119336d dVar) {
        if (m212766i(nVar)) {
            C119336d dVar2 = C119336d.ABOUT_TO_START;
            int ordinal = dVar.ordinal();
            if (ordinal == 0) {
                m212765h(nVar, C37182a.f98057fX);
            } else if (ordinal == 1) {
                m212765h(nVar, C37182a.f98058fY);
            } else if (ordinal == 2) {
                m212765h(nVar, C37182a.f98059fZ);
            } else if (ordinal == 3) {
                m212765h(nVar, C37182a.f98113ga);
            } else if (ordinal == 4) {
                m212765h(nVar, C37182a.f98114gb);
            } else if (ordinal == 5) {
                m212765h(nVar, C37182a.f98115gc);
            }
        }
    }

    /* renamed from: d */
    public final void mo107396d(Throwable th) {
        this.f357222b.mo19974a(C37182a.f98041fH.mo40805c(C62722b.UNKNOWN));
        ((C58970a) ((C58970a) ((C58970a) f357221a.mo56226d()).mo56382g(th)).mo56372aa(39407)).mo56386p("NGA_APP_CONTROL_DICTATION_START_ENDED with an exception");
    }

    /* renamed from: e */
    public final void mo107397e(C64735n nVar, C62722b bVar) {
        C64733l lVar = nVar.f175478j;
        if (lVar != null) {
            int b = C64732k.m96449b(lVar.f175466a);
            if (b == 0 || b != 2) {
                this.f357222b.mo19974a(m212767j(C37182a.f98041fH, nVar).mo40781e(bVar));
            }
        }
    }

    /* renamed from: f */
    public final void mo107398f(C64735n nVar) {
        C64733l lVar = nVar.f175478j;
        if (lVar != null) {
            int b = C64732k.m96449b(lVar.f175466a);
            if (b == 0 || b != 2) {
                this.f357222b.mo19974a(m212764g(C37182a.f98040fG, nVar));
            }
        }
    }
}
