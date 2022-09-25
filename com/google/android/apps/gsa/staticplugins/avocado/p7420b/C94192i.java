package com.google.android.apps.gsa.staticplugins.avocado.p7420b;

import android.net.Uri;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.sidekick.shared.util.C91958ai;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50375ut;
import com.google.assistant.p3861at.C50376uu;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.b.i */
/* compiled from: PG */
final class C94192i extends k {

    /* renamed from: a */
    final /* synthetic */ C94194k f263172a;

    public C94192i(C94194k kVar) {
        this.f263172a = kVar;
    }

    /* renamed from: gn */
    public final void mo88393gn(Throwable th) {
        C59104x c = C94194k.f263174b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FMParentSelScreenFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(14444)).mo56386p("Error fetching family construct");
        Toast.makeText(this.f263172a.getActivity(), R.string.hotword_enrollment_parent_selector_family_fetch_failed, 0).show();
        this.f263172a.mo88395e(1);
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo88394go(Object obj) {
        act act = (act) obj;
        C92371d dVar = this.f263172a.f263183k;
        C50376uu uuVar = act.f128912s;
        if (uuVar == null) {
            uuVar = C50376uu.f131134d;
        }
        dVar.mo87031l(uuVar.f131137b);
        C92371d dVar2 = this.f263172a.f263183k;
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
            C94194k kVar = this.f263172a;
            Uri c = C91958ai.m150913c("s160-cc", utVar.f131132d);
            ImageView a = kVar.f263185m.mo87062a(utVar, new C94190g(kVar, utVar, c));
            kVar.f263180h.mo85147l(kVar.f263181i.mo85419g(c, a), new C94193j(a));
        }
    }
}
