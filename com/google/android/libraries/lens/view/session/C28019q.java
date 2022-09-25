package com.google.android.libraries.lens.view.session;

import android.graphics.Bitmap;
import android.util.Pair;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.filecache.C25839c;
import com.google.android.libraries.lens.view.main.C27306aw;
import com.google.android.libraries.lens.view.main.C27322bl;
import com.google.android.libraries.lens.view.main.C27327bq;
import com.google.android.libraries.lens.view.p2069am.C25342r;
import com.google.android.libraries.lens.view.p2078at.C25523f;
import com.google.android.libraries.lens.view.p2078at.C25531n;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2078at.C25542y;
import com.google.android.libraries.lens.view.p2154p.p2156b.C27543c;
import com.google.android.libraries.lens.view.p2154p.p2158d.C27546a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4707j.C62491dn;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56262bp;
import com.google.protos.p4799ag.p4802b.C63162b;
import com.google.protos.p4799ag.p4802b.C63164d;

/* renamed from: com.google.android.libraries.lens.view.session.q */
/* compiled from: PG */
public final class C28019q implements C27794n {

    /* renamed from: a */
    public static final C58974d f76256a = C58974d.m91135i("DocSesCtrlrHelperImpl");

    /* renamed from: b */
    public final C37215b f76257b;

    /* renamed from: c */
    private final C27543c f76258c;

    /* renamed from: d */
    private final C27546a f76259d;

    /* renamed from: e */
    private final C25839c f76260e;

    /* renamed from: f */
    private C27306aw f76261f;

    public C28019q(C27543c cVar, C27546a aVar, C25839c cVar2, C37215b bVar) {
        this.f76258c = cVar;
        this.f76259d = aVar;
        this.f76260e = cVar2;
        this.f76257b = bVar;
    }

    /* renamed from: h */
    private final void m52198h() {
        this.f76258c.mo33113p(C56262bp.CROPPING_VIEW);
        m52197g();
    }

    /* renamed from: a */
    public final void mo33303a(C25342r rVar, C25533p pVar) {
        C58838bb.m90868c(rVar.f68973b.equals("document-scanner"));
        if (pVar == null) {
            mo33476e(rVar, (C25533p) null, (C25531n) null);
            return;
        }
        C60870cx d = pVar.mo30572d();
        C27795o oVar = new C27795o(this, rVar, pVar);
        C60856cj.m92911t(d, C47810es.m84974n(oVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final boolean mo33304b() {
        if (this.f76258c.mo33102e().equals(C56262bp.PREVIEW_CROPPED_DOCUMENT)) {
            C58833ax c = this.f76258c.mo33100c();
            this.f76258c.mo33105h();
            if (!c.mo56113h()) {
                return false;
            }
            C27306aw awVar = this.f76261f;
            awVar.getClass();
            awVar.mo32853a((Bitmap) ((Pair) c.mo56107c()).first, (C24226r) ((Pair) c.mo56107c()).second);
            m52198h();
            return true;
        } else if (!this.f76258c.mo33102e().equals(C56262bp.CROPPING_VIEW)) {
            return false;
        } else {
            this.f76258c.mo33115r(C58836b.f156633a);
            this.f76258c.mo33107j();
            m52197g();
            this.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.CANCELLED));
            return false;
        }
    }

    /* renamed from: c */
    public final void mo33305c(C27306aw awVar) {
        this.f76261f = awVar;
    }

    /* renamed from: d */
    public final void mo33306d(C25533p pVar) {
        if (this.f76258c.mo33102e().equals(C56262bp.CROPPING_VIEW)) {
            this.f76257b.mo19974a(C37194a.f98443aF);
            C60870cx cxVar = ((C25523f) pVar).f69503a;
            C28018p pVar2 = new C28018p(this, pVar);
            C60856cj.m92911t(cxVar, C47810es.m84974n(pVar2), C60826bg.f164896a);
        }
    }

    /* renamed from: e */
    public final void mo33476e(C25342r rVar, C25533p pVar, C25531n nVar) {
        C60870cx cxVar;
        Bitmap bitmap;
        C63164d dVar = rVar.f68979h;
        if (dVar == null) {
            dVar = C63164d.f170556b;
        }
        C63162b a = C63162b.m96189a(dVar.f170558a);
        if (a == null) {
            a = C63162b.UNKNOWN_ACTION;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            boolean z = true;
            if (ordinal == 1) {
                this.f76257b.mo19974a(C37194a.f98443aF);
                if (pVar == null || nVar == null) {
                    ((C58970a) ((C58970a) f76256a.mo56225c()).mo56372aa(49931)).mo56386p("frozenImage cannot be null");
                    this.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.INVALID_ARGUMENT));
                    return;
                }
                ((C58970a) ((C58970a) f76256a.mo56224b()).mo56372aa(49932)).mo56386p("Using last final image captured for scanning.");
                mo33477f(nVar.mo30578b(), pVar.mo30569a());
            } else if (ordinal == 2 || ordinal == 3) {
                C58974d dVar2 = f76256a;
                ((C58970a) ((C58970a) dVar2.mo56224b()).mo56372aa(49923)).mo56389s("Launching save document intent: %s", a);
                if (!a.equals(C63162b.SHARE_CROPPED_DOCUMENT) && !a.equals(C63162b.SHARE_CROPPED_DOCUMENT_JPEG)) {
                    z = false;
                }
                C58838bb.m90868c(z);
                if (nVar == null) {
                    this.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.INVALID_ARGUMENT));
                    ((C58970a) ((C58970a) dVar2.mo56225c()).mo56372aa(49925)).mo56386p("Could not find final (document) image to share");
                    return;
                }
                if (a.equals(C63162b.SHARE_CROPPED_DOCUMENT)) {
                    this.f76257b.mo19974a(C37194a.f98441aD.mo40815i(C62722b.OK));
                    cxVar = this.f76260e.mo30985a(nVar.mo30578b(), C25542y.PDF, 100, (String) null, (String) null, (String) null);
                } else if (a.equals(C63162b.SHARE_CROPPED_DOCUMENT_JPEG)) {
                    this.f76257b.mo19974a(C37194a.f98440aC.mo40815i(C62722b.OK));
                    cxVar = this.f76260e.mo30985a(nVar.mo30578b(), C25542y.JPEG, (int) Math.min(100, Math.max(90, 0)), (String) null, (String) null, (String) null);
                } else {
                    this.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.INVALID_ARGUMENT));
                    ((C58970a) ((C58970a) dVar2.mo56225c()).mo56372aa(49924)).mo56389s("Invalid target action passed to launchSaveDocumentToIntent(): %s", a);
                    return;
                }
                this.f76261f.getClass();
                C27327bq.m50890p(cxVar);
            } else if (ordinal == 4 && !C58832aw.m90831a(C56262bp.PREVIEW_CROPPED_DOCUMENT, this.f76258c.mo33102e())) {
                C58974d dVar3 = f76256a;
                ((C58970a) ((C58970a) dVar3.mo56224b()).mo56372aa(49926)).mo56386p("Rectifying document image for post capture");
                if (nVar == null) {
                    bitmap = null;
                } else {
                    try {
                        bitmap = nVar.mo30578b();
                    } catch (IllegalArgumentException e) {
                        this.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.INVALID_ARGUMENT));
                        ((C58970a) ((C58970a) ((C58970a) f76256a.mo56226d()).mo56382g(e)).mo56372aa(49928)).mo56386p("Failed to create rectified documet image");
                        return;
                    }
                }
                C58833ax b = this.f76258c.mo33099b();
                if (bitmap == null || !b.mo56113h()) {
                    this.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.INVALID_ARGUMENT));
                    ((C58970a) ((C58970a) dVar3.mo56225c()).mo56372aa(49927)).mo56354G("Failed to create rectified document image, originalImage=%s, detectedDocument=%s", bitmap, b);
                    return;
                }
                m52197g();
                C27546a aVar = this.f76259d;
                C62491dn dnVar = ((C62231l) b.mo56107c()).f168026b;
                if (dnVar == null) {
                    dnVar = C62491dn.f168710e;
                }
                Bitmap a2 = aVar.mo33116a(bitmap, dnVar);
                this.f76258c.mo33113p(C56262bp.PREVIEW_CROPPED_DOCUMENT);
                this.f76258c.mo33108k(a2);
                C27306aw awVar = this.f76261f;
                awVar.getClass();
                awVar.mo32853a(a2, C24226r.RECTIFIED_DOCUMENT);
                this.f76257b.mo19974a(C37194a.f98442aE);
            }
        } else {
            ((C58970a) ((C58970a) f76256a.mo56226d()).mo56372aa(49922)).mo56386p("Unknown document scan action received");
        }
    }

    /* renamed from: f */
    public final void mo33477f(Bitmap bitmap, C24226r rVar) {
        C58974d dVar = f76256a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(49929)).mo56386p("Starting document scanner in post capture");
        if (bitmap != null) {
            this.f76258c.mo33110m(bitmap, rVar);
            m52198h();
            return;
        }
        this.f76257b.mo19974a(C37194a.f98439aB.mo40815i(C62722b.INTERNAL));
        ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(49930)).mo56389s("Failed to initiate document scanner filter, finalImage=%s, ", (Object) null);
    }

    /* renamed from: g */
    private final void m52197g() {
        C27306aw awVar = this.f76261f;
        awVar.getClass();
        C27322bl blVar = awVar.f74719a.f74787ag;
        blVar.getClass();
        blVar.mo32864n(3);
    }
}
