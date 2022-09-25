package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.webview.C87259e;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107468ag;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107471aj;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107472ak;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.w */
/* compiled from: PG */
public final class C107848w implements C107839n {

    /* renamed from: a */
    public static final C59071e f300096a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.a.w");

    /* renamed from: b */
    public C58833ax f300097b = C58836b.f156633a;

    /* renamed from: c */
    private final C85454d f300098c;

    /* renamed from: d */
    private final C107932g f300099d;

    /* renamed from: e */
    private final C22871g f300100e;

    public C107848w(C85454d dVar, C107932g gVar, C22871g gVar2) {
        this.f300098c = dVar;
        this.f300099d = gVar;
        this.f300100e = gVar2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        Object obj;
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_WEB_VIEW) {
            C62940bt r4 = C62942bv.checkIsLite(C107468ag.f299047a);
            eVar.mo58887l(r4);
            Object l = eVar.f169962ag.mo58854l(r4.f169971d);
            if (l == null) {
                obj = r4.f169969b;
            } else {
                obj = r4.mo58889c(l);
            }
            int a2 = C107471aj.m178390a(((C107472ak) obj).f299052b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i != 1) {
                if (i == 2 && this.f300097b.mo56113h()) {
                    this.f300098c.mo78969k(((GsaWebViewContainer) this.f300097b.mo56107c()).mo80859b());
                    this.f300097b = C58836b.f156633a;
                }
            } else if (this.f300097b.mo56113h()) {
                mo96307c();
            } else {
                new C90873ag(this.f300098c.mo78961c(new C87259e("OPA")), this.f300100e, "Create WebView", new C107846u(this)).mo85223a(C107847v.f300095a);
            }
        }
    }

    /* renamed from: c */
    public final void mo96307c() {
        C87684al alVar = new C87684al(C88244um.ATTACH_WEBVIEW);
        alVar.mo81966c((Parcelable) this.f300097b.mo56107c());
        this.f300099d.mo96337a(alVar.mo81964a());
    }
}
