package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.net.Uri;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.sidekick.shared.util.C91958ai;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.assistant.p3861at.C50375ut;
import com.google.assistant.p3861at.C50376uu;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.aq */
/* compiled from: PG */
final class C102095aq extends k {

    /* renamed from: a */
    final /* synthetic */ C102097as f284808a;

    public C102095aq(C102097as asVar) {
        this.f284808a = asVar;
    }

    /* renamed from: gn */
    public final void mo92870gn(Throwable th) {
        C59104x c = C102097as.f284810a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VMParentSelScreenFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(20549)).mo56386p("Error fetching family construct");
        Toast.makeText(this.f284808a.f284812c.getActivity(), R.string.hotword_enrollment_parent_selector_family_fetch_failed, 0).show();
        C101765e eVar = new C101765e();
        eVar.mo92562b(2);
        eVar.f283865a = C92408n.m151739a(C92381e.FAMILY_NOT_FETCHED);
        C47393f.m84236g(eVar.mo92561a(), this.f284808a.f284812c);
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo92871go(Object obj) {
        act act = (act) obj;
        C92371d dVar = this.f284808a.f284818i;
        C50376uu uuVar = act.f128912s;
        if (uuVar == null) {
            uuVar = C50376uu.f131134d;
        }
        dVar.mo87031l(uuVar.f131137b);
        C92371d dVar2 = this.f284808a.f284818i;
        C50376uu uuVar2 = act.f128912s;
        if (uuVar2 == null) {
            uuVar2 = C50376uu.f131134d;
        }
        dVar2.mo87032m(uuVar2.f131138c);
        C50376uu uuVar3 = act.f128912s;
        if (uuVar3 == null) {
            uuVar3 = C50376uu.f131134d;
        }
        for (C50375ut utVar : uuVar3.f131136a) {
            C102097as asVar = this.f284808a;
            Uri c = C91958ai.m150913c("s160-cc", utVar.f131132d);
            ImageView a = asVar.f284821l.mo87062a(utVar, new C47591co(asVar.f284820k, "On Click", new C102093ao(asVar, utVar)));
            asVar.f284815f.mo85147l(asVar.f284816g.mo85419g(c, a), new C102096ar(a));
        }
    }
}
