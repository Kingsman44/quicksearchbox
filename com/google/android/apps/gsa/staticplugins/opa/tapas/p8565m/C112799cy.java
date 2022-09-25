package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.widget.C0673gh;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.p5826p.C73897c;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41661aa;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.cy */
/* compiled from: PG */
final class C112799cy implements C113342cm {

    /* renamed from: a */
    private final C91097g f312634a;

    /* renamed from: b */
    private final C73897c f312635b;

    /* renamed from: c */
    private final C112794ct f312636c;

    public C112799cy(C91097g gVar, C73897c cVar, C112794ct ctVar) {
        this.f312634a = gVar;
        this.f312635b = cVar;
        this.f312636c = ctVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.geo_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 97540;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112798cx(view);
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
        this.f312636c.mo99739a(5, ezVar, esVar, Optional.empty());
        C41693s sVar = ezVar.mo100209i().f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        this.f312634a.mo65089a(new Intent("android.intent.action.VIEW", Uri.parse(sVar.f109057c)));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112798cx cxVar = (C112798cx) ghVar;
        SpannableStringBuilder append = new SpannableStringBuilder().append(ezVar.mo100199L(), new ForegroundColorSpan(this.f312635b.mo65405a() == 1 ? -1 : -16777216), 33).append(" • ");
        C41661aa aaVar = ezVar.mo100209i().f109013g;
        if (aaVar == null) {
            aaVar = C41661aa.f108926g;
        }
        SpannableStringBuilder append2 = append.append(aaVar.f108929b);
        int i = C112798cx.f312632b;
        cxVar.f312633a.setText(append2);
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
