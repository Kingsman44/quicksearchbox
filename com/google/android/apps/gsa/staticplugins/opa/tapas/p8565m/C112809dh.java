package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113163bu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113426fg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dh */
/* compiled from: PG */
final class C112809dh extends C112920hk {

    /* renamed from: a */
    public static final C59071e f312666a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.dh");

    /* renamed from: b */
    private final C112794ct f312667b;

    /* renamed from: c */
    private final C68214a f312668c;

    /* renamed from: d */
    private final C112925hp f312669d;

    /* renamed from: e */
    private final C91097g f312670e;

    /* renamed from: f */
    private final C113251ad f312671f;

    /* renamed from: g */
    private final C113206m f312672g;

    /* renamed from: h */
    private final C22871g f312673h;

    public C112809dh(C112794ct ctVar, C68214a aVar, C112925hp hpVar, C91097g gVar, C113251ad adVar, C113206m mVar, C22871g gVar2) {
        this.f312667b = ctVar;
        this.f312668c = aVar;
        this.f312669d = hpVar;
        this.f312670e = gVar;
        this.f312671f = adVar;
        this.f312672g = mVar;
        this.f312673h = gVar2;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 118243;
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C58838bb.m90868c(ezVar.mo100197J().isPresent());
        this.f312667b.mo99739a(22, ezVar, esVar, Optional.empty());
        C113426fg fgVar = (C113426fg) ezVar.mo100197J().get();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(fgVar.mo100078c());
        intent.setData(Uri.parse(fgVar.mo100079d()));
        this.f312670e.mo65089a(intent);
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        ((C112880fy) this.f312668c.mo27525b()).mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C58838bb.m90868c(ezVar.mo100197J().isPresent());
        C112919hj hjVar = (C112919hj) ghVar;
        String c = ((C113426fg) ezVar.mo100197J().get()).mo100078c();
        C113163bu.m187179a(this.f312671f.mo99924a(c), "fetch app icon");
        Optional k = this.f312672g.mo99852k(c);
        if (k.isEmpty()) {
            hjVar.itemView.setVisibility(8);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        ezVar.mo100199L();
        C60870cx c2 = this.f312671f.mo99926c(c);
        if (C90877ak.m148480n(c2)) {
            mo99743j(hjVar, ezVar.mo100199L(), (Optional) C90877ak.m148474h(c2), (C113286bk) k.get());
        } else {
            new C90873ag(c2, this.f312673h, "Render internet channel suggestion", new C112807df(this, hjVar, ezVar, k)).mo85223a(C112808dg.f312665a);
        }
    }

    /* renamed from: j */
    public final void mo99743j(C112919hj hjVar, String str, Optional optional, C113286bk bkVar) {
        if (optional.isEmpty()) {
            hjVar.itemView.setVisibility(8);
            return;
        }
        C112725ae aeVar = new C112725ae();
        aeVar.f312483a = hjVar.f312954b;
        aeVar.f312484b = hjVar.f312953a;
        aeVar.mo99702b(str);
        aeVar.f312485c = Optional.m71637of((String) optional.get());
        aeVar.f312486d = Optional.m71637of(bkVar);
        this.f312669d.mo99783b(aeVar.mo99701a());
        hjVar.itemView.setVisibility(0);
    }
}
