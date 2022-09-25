package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8739g;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87848fv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87884hd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87886hf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87888hh;
import com.google.android.apps.gsa.searchbox.p6944c.C88540a;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.p7159c.C90881ao;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.imageviewer.C22821a;
import com.google.android.libraries.gsa.imageviewer.C22825c;
import com.google.android.libraries.gsa.imageviewer.C22827e;
import com.google.android.libraries.gsa.imageviewer.C22828f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import dagger.C68214a;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.g.b */
/* compiled from: PG */
public final class C116955b extends C88540a implements C89196a {

    /* renamed from: a */
    public static final C59071e f324685a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.g.b");

    /* renamed from: b */
    private final C68214a f324686b;

    /* renamed from: c */
    private final C86124t f324687c;

    /* renamed from: d */
    private final C68214a f324688d;

    /* renamed from: e */
    private final C68214a f324689e;

    /* renamed from: f */
    private C90931ca f324690f;

    /* renamed from: g */
    private C89356b f324691g;

    public C116955b(C68214a aVar, C68214a aVar2, C86124t tVar, C68214a aVar3) {
        this.f324686b = aVar;
        this.f324687c = tVar;
        this.f324688d = aVar2;
        this.f324689e = aVar3;
    }

    /* renamed from: a */
    public final int mo82173a() {
        return 165662253;
    }

    /* renamed from: b */
    public final C60870cx mo82174b(C87848fv fvVar) {
        Object obj;
        Object obj2;
        C62940bt r1 = C62942bv.checkIsLite(C87884hd.f237751a);
        fvVar.mo58887l(r1);
        if (fvVar.f169962ag.mo58857o(r1.f169971d)) {
            if (this.f324691g == null) {
                this.f324691g = ((C84466a) this.f324688d.mo27525b()).mo78025a("suggest-image-search-graph", 148, 154);
            }
            C62940bt r12 = C62942bv.checkIsLite(C87884hd.f237751a);
            fvVar.mo58887l(r12);
            Object l = fvVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj2 = r12.f169969b;
            } else {
                obj2 = r12.mo58889c(l);
            }
            try {
                Uri build = new Uri.Builder().scheme("https").authority(this.f324687c.mo79758x(C90120fr.f250847n)).appendPath("search").appendQueryParameter("async", "ijn:0,_fmt:pb,p:1").appendQueryParameter("q", ((C87886hf) obj2).f237755a).appendQueryParameter("asearch", "isch").appendQueryParameter("tbm", "isch").build();
                C89019aq c = C89020ar.m144758c();
                c.mo82994f(build.toString());
                c.f241244j = false;
                c.f241245k = 1;
                return this.f324690f.mo85141f(((C87242k) this.f324686b.mo27525b()).mo80852a(this.f324691g, C89066v.f241382a, new C89018ap(c.mo82989a(), C89009ag.f241207b)), new C90881ao("Get HttpResponse and parse protos", 1, 0, new C116954a(fvVar)));
            } catch (MalformedURLException e) {
                C59104x c2 = f324685a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "sb.r.ImCarEvtHdlr");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32528)).mo56386p("Exception while fetching Image Search results.");
            }
        } else {
            C62940bt r0 = C62942bv.checkIsLite(C87884hd.f237752b);
            fvVar.mo58887l(r0);
            if (fvVar.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C87884hd.f237752b);
                fvVar.mo58887l(r02);
                Object l2 = fvVar.f169962ag.mo58854l(r02.f169971d);
                if (l2 == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l2);
                }
                C87888hh hhVar = (C87888hh) obj;
                String str = hhVar.f237759a;
                C65926d dVar = hhVar.f237760b;
                if (dVar == null) {
                    dVar = C65926d.f179289b;
                }
                int i = hhVar.f237761c;
                C22827e q = C22828f.m42670q();
                ((C22821a) q).f62833a = str;
                q.mo28164e(i);
                q.mo28161b(false);
                q.mo28165f(false);
                q.mo28162c();
                q.mo28166g(true);
                q.mo28163d(dVar);
                Intent a = C22825c.m42662a(q.mo28160a());
                if (a != null) {
                    ((C91097g) this.f324689e.mo27525b()).mo65089a(a);
                }
            }
            return C60866ct.f164955a;
        }
    }

    /* renamed from: f */
    public final void mo82222f(C90931ca caVar) {
        this.f324690f = caVar;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }
}
