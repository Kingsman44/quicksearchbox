package com.google.android.libraries.lens.view.imageviewer;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.contrib.logging.C43708k;
import com.google.android.libraries.web.contrib.logging.C43709l;
import com.google.android.libraries.web.contrib.logging.C43710m;
import com.google.android.libraries.web.contrib.logging.C43711n;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.b */
/* compiled from: PG */
public final class C26938b implements C43713p {

    /* renamed from: a */
    private static final C58974d f73431a = C58974d.m91135i("ImageViewerLogger");

    /* renamed from: b */
    private final C37215b f73432b;

    public C26938b(C37215b bVar) {
        this.f73432b = bVar;
    }

    /* renamed from: a */
    public final void mo32323a(String str, C43709l lVar, C43367l lVar2) {
        lVar.mo46714a();
        C43362g gVar = C43362g.UNSPECIFIED;
        C43708k kVar = C43708k.CANCELLING_REQUEST;
        C43710m mVar = C43710m.PAGE_LOAD_ERROR;
        int ordinal = lVar.mo46714a().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f73432b.mo19974a(C37194a.f98586cq.mo40805c(C62722b.CANCELLED));
        } else if (ordinal == 2) {
            this.f73432b.mo19974a(C37194a.f98586cq.mo40805c(C62722b.INVALID_ARGUMENT));
        } else if (ordinal == 3) {
            this.f73432b.mo19974a(C37194a.f98586cq.mo40805c(C62722b.ABORTED));
        } else if (ordinal == 4) {
            this.f73432b.mo19974a(C37194a.f98586cq.mo40805c(C62722b.UNKNOWN));
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
        C62722b bVar;
        ((C58970a) ((C58970a) f73431a.mo56225c()).mo56372aa(49481)).mo56354G("logFailed reason=%s, url: %s", nVar.mo46731a(), str);
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
            this.f73432b.mo19974a(C37194a.f98586cq.mo40805c(bVar));
        } else if (ordinal == 1) {
            this.f73432b.mo19974a(C37194a.f98586cq.mo40805c(C62722b.INVALID_ARGUMENT));
        }
    }

    /* renamed from: f */
    public final void mo32328f(String str, C43367l lVar) {
    }

    /* renamed from: g */
    public final void mo32329g(C43367l lVar) {
        this.f73432b.mo19974a(C37194a.f98585cp);
    }

    /* renamed from: h */
    public final void mo32330h(String str, String str2, C43367l lVar) {
        this.f73432b.mo19974a(C37194a.f98586cq.mo40805c(C62722b.OK));
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
