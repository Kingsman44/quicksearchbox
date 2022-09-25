package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.p7271d.C92232i;
import com.google.android.apps.gsa.speech.p7271d.C92233j;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ab */
/* compiled from: PG */
public final class C101809ab implements C101835c {

    /* renamed from: c */
    private static final C59071e f283960c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ab");

    /* renamed from: a */
    public final Activity f283961a;

    /* renamed from: b */
    public C101838f f283962b;

    /* renamed from: d */
    private final C101845m f283963d;

    /* renamed from: e */
    private final C92233j f283964e;

    /* renamed from: f */
    private final C101833az f283965f;

    /* renamed from: g */
    private final C101813af f283966g;

    /* renamed from: h */
    private final C86054o f283967h;

    /* renamed from: i */
    private final C9325m f283968i;

    /* renamed from: j */
    private final C86124t f283969j;

    /* renamed from: k */
    private final bm f283970k;

    /* renamed from: l */
    private final C89859i f283971l;

    /* renamed from: m */
    private C92232i f283972m;

    public C101809ab(C86054o oVar, Activity activity, C101845m mVar, C92233j jVar, C101833az azVar, C101813af afVar, C9325m mVar2, C89859i iVar, C86124t tVar, bm bmVar) {
        this.f283961a = activity;
        this.f283963d = mVar;
        this.f283964e = jVar;
        this.f283965f = azVar;
        this.f283966g = afVar;
        this.f283967h = oVar;
        this.f283968i = mVar2;
        this.f283971l = iVar;
        this.f283969j = tVar;
        this.f283970k = bmVar;
    }

    /* renamed from: c */
    private final void m168459c(int i) {
        Toast.makeText(this.f283961a, i, 0).show();
    }

    /* renamed from: a */
    public final void mo92593a(Bundle bundle, C101838f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f283971l.mo83702b(C89849ae.VOICE_MATCH_PREDOMAIN_DEPENDENCY_CONTROLLER_CREATE);
        this.f283962b = fVar;
        if (bundle != null) {
            fVar.mo92605c().mo92613a();
        } else if (!fVar.mo92610g() && !this.f283968i.mo17534a()) {
            C59104x c = f283960c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PreDomainDependencyCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(20670)).mo56386p("Google is not the default assist app, cannot continue.");
            m168459c(R.string.hotword_enrollment_google_not_default_assist);
            fVar.mo92605c().mo92614b(C92408n.m151739a(C92381e.AGSA_NOT_DEFAULT_APP));
        } else if (!this.f283969j.mo79746e(C90110fh.f250606aD) || fVar.mo92610g() || this.f283970k.s()) {
            C101856x xVar = new C101856x(this);
            C101857y yVar = new C101857y(this);
            HashSet hashSet = new HashSet();
            if (!this.f283962b.mo92610g()) {
                C59104x b = f283960c.mo56224b();
                b.mo56378ag(C58975e.f156826a, "PreDomainDependencyCtrl");
                ((C59052c) ((C59052c) b).mo56372aa(20667)).mo56386p("Adding phone enrollment dependency checkers");
                hashSet.add(this.f283963d);
            }
            Account w = this.f283967h.mo79689w(this.f283962b.mo92607e());
            if (w != null) {
                hashSet.add(this.f283966g.mo92597a(w));
            }
            hashSet.add(this.f283965f.mo92602a(w, this.f283962b.mo92609f(), this.f283962b.mo92606d()));
            this.f283972m = this.f283964e.mo86908a(hashSet, xVar, yVar);
            mo92594b();
        } else {
            C59104x c2 = f283960c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "PreDomainDependencyCtrl");
            ((C59052c) ((C59052c) c2).mo56372aa(20669)).mo56386p("Not OPA-eligible, cannot continue.");
            m168459c(R.string.hotword_enrollment_feature_disabled);
            fVar.mo92605c().mo92614b(C92408n.m151739a(C92381e.OPA_INELIGIBLE));
        }
    }

    /* renamed from: b */
    public final void mo92594b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f283962b.mo92603a().setVisibility(0);
        this.f283972m.mo86907a();
    }
}
