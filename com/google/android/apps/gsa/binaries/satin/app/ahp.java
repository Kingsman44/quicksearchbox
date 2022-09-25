package com.google.android.apps.gsa.binaries.satin.app;

import android.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83889aw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.avocado.p7420b.C94194k;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
final class ahp implements C83889aw {

    /* renamed from: a */
    private final aqy f196151a;

    /* renamed from: b */
    private final C74206oz f196152b;

    /* renamed from: c */
    private final C69464a f196153c;

    public ahp(aqy aqy, C74206oz ozVar) {
        this.f196151a = aqy;
        this.f196152b = ozVar;
        this.f196153c = new aho(aqy);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo65465a(Fragment fragment) {
        C94194k kVar = (C94194k) fragment;
        kVar.f263178f = (l) this.f196151a.a.f202833eY.mo17428b();
        kVar.f263179g = (C86054o) this.f196151a.a.f202324I.mo17428b();
        kVar.f263180h = (C90929bz) this.f196151a.a.f203444q.mo17428b();
        kVar.f263181i = (C91189au) this.f196151a.a.f202737ci.mo17428b();
        kVar.f263182j = (EnrollmentHelper) this.f196153c.mo17428b();
        kVar.f263183k = (C92371d) this.f196151a.a.f202806dy.mo17428b();
        kVar.f263184l = (ai) this.f196152b.f207586l.mo17428b();
        kVar.f263186n = (C101495ac) this.f196152b.f207587m.mo17428b();
    }
}
