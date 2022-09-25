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
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.p7271d.C92232i;
import com.google.android.apps.gsa.speech.p7271d.C92233j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.p7984a.C101807a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.w */
/* compiled from: PG */
public final class C101855w implements C101835c {

    /* renamed from: d */
    private static final C59071e f284105d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.w");

    /* renamed from: a */
    public final Activity f284106a;

    /* renamed from: b */
    public final C89859i f284107b;

    /* renamed from: c */
    public C101838f f284108c;

    /* renamed from: e */
    private final C101845m f284109e;

    /* renamed from: f */
    private final C101850r f284110f;

    /* renamed from: g */
    private final C92233j f284111g;

    /* renamed from: h */
    private final C101833az f284112h;

    /* renamed from: i */
    private final C101813af f284113i;

    /* renamed from: j */
    private final C101817aj f284114j;

    /* renamed from: k */
    private final C86124t f284115k;

    /* renamed from: l */
    private final C89994f f284116l;

    /* renamed from: m */
    private final C86054o f284117m;

    /* renamed from: n */
    private final C9325m f284118n;

    /* renamed from: o */
    private final C101807a f284119o;

    /* renamed from: p */
    private final bm f284120p;

    /* renamed from: q */
    private C92232i f284121q;

    public C101855w(C86054o oVar, Activity activity, C101845m mVar, C101850r rVar, C92233j jVar, C101833az azVar, C101813af afVar, C101817aj ajVar, C86124t tVar, C89994f fVar, C9325m mVar2, C101807a aVar, C89859i iVar, bm bmVar) {
        this.f284106a = activity;
        this.f284109e = mVar;
        this.f284110f = rVar;
        this.f284111g = jVar;
        this.f284112h = azVar;
        this.f284113i = afVar;
        this.f284114j = ajVar;
        this.f284115k = tVar;
        this.f284116l = fVar;
        this.f284117m = oVar;
        this.f284118n = mVar2;
        this.f284119o = aVar;
        this.f284107b = iVar;
        this.f284120p = bmVar;
    }

    /* renamed from: c */
    private final void m168525c(int i) {
        Toast.makeText(this.f284106a, i, 0).show();
    }

    /* renamed from: a */
    public final void mo92593a(Bundle bundle, C101838f fVar) {
        this.f284107b.mo83702b(C89849ae.VOICE_MATCH_LEGACY_DEPENDENCY_CONTROLLER_CREATE);
        this.f284108c = fVar;
        if (bundle != null) {
            fVar.mo92605c().mo92613a();
        } else if (!fVar.mo92610g() && !this.f284118n.mo17534a()) {
            C59104x c = f284105d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "LegacyDepCtlr");
            ((C59052c) ((C59052c) c).mo56372aa(20665)).mo56386p("Google is not the default assist app, cannot continue.");
            m168525c(R.string.hotword_enrollment_google_not_default_assist);
            fVar.mo92605c().mo92614b(C92408n.m151739a(C92381e.AGSA_NOT_DEFAULT_APP));
        } else if (!this.f284115k.mo79746e(C90110fh.f250606aD) || fVar.mo92610g() || this.f284120p.s()) {
            C101853u uVar = new C101853u(this);
            C101854v vVar = new C101854v(this);
            HashSet hashSet = new HashSet();
            hashSet.add(this.f284110f.mo92626a(this.f284108c.mo92604b(), this.f284108c.mo92609f()));
            if (!this.f284108c.mo92610g() && this.f284115k.mo79746e(C90082eg.f249898aN)) {
                C59104x b = f284105d.mo56224b();
                b.mo56378ag(C58975e.f156826a, "LegacyDepCtlr");
                ((C59052c) ((C59052c) b).mo56372aa(20663)).mo56386p("Adding phone enrollment dependency checkers");
                hashSet.add(this.f284109e);
            }
            Account w = this.f284117m.mo79689w(this.f284108c.mo92607e());
            if (w != null) {
                hashSet.add(this.f284113i.mo92597a(w));
            }
            if (this.f284119o.mo92591a()) {
                C59104x b2 = f284105d.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "LegacyDepCtlr");
                ((C59052c) ((C59052c) b2).mo56372aa(20662)).mo56386p("start checking cloud enrollment");
                hashSet.add(this.f284114j.mo92599a(w, this.f284116l.mo83850M(), this.f284108c.mo92610g()));
            }
            hashSet.add(this.f284112h.mo92602a(w, this.f284108c.mo92609f(), this.f284108c.mo92606d()));
            this.f284121q = this.f284111g.mo86908a(hashSet, uVar, vVar);
            mo92631b();
        } else {
            C59104x c2 = f284105d.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "LegacyDepCtlr");
            ((C59052c) ((C59052c) c2).mo56372aa(20664)).mo56386p("Not OPA-eligible, cannot continue.");
            m168525c(R.string.hotword_enrollment_feature_disabled);
            fVar.mo92605c().mo92614b(C92408n.m151739a(C92381e.OPA_INELIGIBLE));
        }
    }

    /* renamed from: b */
    public final void mo92631b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f284108c.mo92603a().setVisibility(0);
        this.f284121q.mo86907a();
    }
}
