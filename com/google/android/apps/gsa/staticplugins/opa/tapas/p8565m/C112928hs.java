package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113426fg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hs */
/* compiled from: PG */
public final class C112928hs implements C113342cm {

    /* renamed from: a */
    private static final C59071e f312966a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.hs");

    /* renamed from: b */
    private final C91189au f312967b;

    /* renamed from: c */
    private final C91097g f312968c;

    /* renamed from: d */
    private final C112794ct f312969d;

    public C112928hs(C91189au auVar, C91097g gVar, C112794ct ctVar) {
        this.f312967b = auVar;
        this.f312968c = gVar;
        this.f312969d = ctVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.video_suggestion_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 97543;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112927hr(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C58838bb.m90868c(ezVar.mo100197J().isPresent());
        this.f312969d.mo99739a(13, ezVar, esVar, Optional.empty());
        C113426fg fgVar = (C113426fg) ezVar.mo100197J().get();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(fgVar.mo100078c());
        intent.setData(Uri.parse(fgVar.mo100079d()));
        this.f312968c.mo65089a(intent);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!ezVar.mo100197J().isEmpty()) {
            C113426fg fgVar = (C113426fg) ezVar.mo100197J().get();
            if (fgVar.mo100076a().isEmpty() || fgVar.mo100077b().isEmpty()) {
                C59104x c = f312966a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VideoSgstRndrer");
                ((C59052c) ((C59052c) c).mo56372aa(27838)).mo56389s("Video params has missing fields:\n%s", ezVar);
                return;
            }
            C112927hr hrVar = (C112927hr) ghVar;
            hrVar.f312965c.setText((CharSequence) fgVar.mo100076a().get());
            hrVar.f312965c.setVisibility(0);
            hrVar.f312964b.setText(ezVar.mo100199L());
            hrVar.f312964b.setVisibility(0);
            this.f312967b.mo85429s(hrVar.f312963a);
            this.f312967b.mo85428r(this.f312967b.mo85421i((String) fgVar.mo100077b().get(), hrVar.f312963a), "Fetching media icon", new C112926hq(hrVar));
            hrVar.itemView.setVisibility(0);
        }
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
