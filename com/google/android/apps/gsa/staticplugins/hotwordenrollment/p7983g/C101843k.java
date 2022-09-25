package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.p7271d.C92232i;
import com.google.android.apps.gsa.speech.p7271d.C92233j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.p7984a.C101807a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.k */
/* compiled from: PG */
public final class C101843k implements C101835c {

    /* renamed from: c */
    private static final C59071e f284064c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.k");

    /* renamed from: a */
    public final Activity f284065a;

    /* renamed from: b */
    public C101838f f284066b;

    /* renamed from: d */
    private final C101850r f284067d;

    /* renamed from: e */
    private final C92233j f284068e;

    /* renamed from: f */
    private final C101817aj f284069f;

    /* renamed from: g */
    private final C89994f f284070g;

    /* renamed from: h */
    private final C86054o f284071h;

    /* renamed from: i */
    private final C9325m f284072i;

    /* renamed from: j */
    private final C101807a f284073j;

    /* renamed from: k */
    private final C89859i f284074k;

    /* renamed from: l */
    private C92232i f284075l;

    public C101843k(C86054o oVar, Activity activity, C101850r rVar, C92233j jVar, C101817aj ajVar, C101807a aVar, C89994f fVar, C89859i iVar, C9325m mVar) {
        this.f284065a = activity;
        this.f284067d = rVar;
        this.f284068e = jVar;
        this.f284069f = ajVar;
        this.f284073j = aVar;
        this.f284070g = fVar;
        this.f284074k = iVar;
        this.f284071h = oVar;
        this.f284072i = mVar;
    }

    /* renamed from: a */
    public final void mo92593a(Bundle bundle, C101838f fVar) {
        this.f284074k.mo83702b(C89849ae.VOICE_MATCH_DOMAIN_DEPENDENCY_CONTROLLER_CREATE);
        this.f284066b = fVar;
        if (bundle != null) {
            fVar.mo92605c().mo92613a();
        } else if (fVar.mo92610g() || this.f284072i.mo17534a()) {
            C101841i iVar = new C101841i(this);
            C101842j jVar = new C101842j(this);
            HashSet hashSet = new HashSet();
            hashSet.add(this.f284067d.mo92626a(this.f284066b.mo92604b(), this.f284066b.mo92609f()));
            Account w = this.f284071h.mo79689w(this.f284066b.mo92607e());
            if (this.f284073j.mo92591a()) {
                ((C59052c) ((C59052c) f284064c.mo56224b()).mo56372aa(20645)).mo56386p("start checking cloud enrollment");
                hashSet.add(this.f284069f.mo92599a(w, this.f284070g.mo83850M(), this.f284066b.mo92610g()));
            }
            this.f284075l = this.f284068e.mo86908a(hashSet, iVar, jVar);
            mo92619b();
        } else {
            ((C59052c) ((C59052c) f284064c.mo56225c()).mo56372aa(20646)).mo56386p("Google is not the default assist app, cannot continue.");
            Toast.makeText(this.f284065a, R.string.hotword_enrollment_google_not_default_assist, 0).show();
            fVar.mo92605c().mo92614b(C92408n.m151739a(C92381e.AGSA_NOT_DEFAULT_APP));
        }
    }

    /* renamed from: b */
    public final void mo92619b() {
        this.f284066b.mo92603a().setVisibility(0);
        this.f284075l.mo86907a();
    }
}
