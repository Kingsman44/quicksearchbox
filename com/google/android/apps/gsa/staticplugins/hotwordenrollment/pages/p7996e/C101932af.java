package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.support.p031v4.app.C0167am;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.hotword.b;
import com.google.android.apps.gsa.search.core.C85767f;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92417w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66595bu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.af */
/* compiled from: PG */
final class C101932af implements b {

    /* renamed from: a */
    final /* synthetic */ C101933ag f284326a;

    public C101932af(C101933ag agVar) {
        this.f284326a = agVar;
    }

    /* renamed from: a */
    public final void mo92696a(List list) {
        C0167am activity = this.f284326a.f284357h.getActivity();
        if (activity == null) {
            ((C89859i) this.f284326a.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_NULL_ACTIVITY_AT_ENROLL_SCREEN);
            return;
        }
        C88483e.m142828c(activity, new C88489j(C87739bu.REFRESH_SERVICE_STATE).mo82013a());
        C85767f.m137817a(activity);
        C101933ag agVar = this.f284326a;
        if (!agVar.f284356g) {
            agVar.f284363n.mo83901au(0, agVar.f284336F);
            long j = 0;
            long j2 = this.f284326a.f284362m.mo70887e().mo70853a().mo70880d() ? 0 : C101933ag.f284329b;
            if (!this.f284326a.f284362m.mo70887e().mo70853a().mo70880d()) {
                j = C101933ag.f284330c;
            }
            C118561t tVar = this.f284326a.f284365p;
            C118522by byVar = C118522by.UPLOAD_AUDIO_LOGS;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 1;
            agVar2.f328822b = j2;
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            agVar3.f328821a |= 2;
            agVar3.f328823c = j;
            afVar.copyOnWrite();
            C118472ag agVar4 = (C118472ag) afVar.instance;
            agVar4.f328824d = 2;
            agVar4.f328821a |= 4;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
        if (this.f284326a.f284362m.mo70891j()) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f284326a.f284362m.mo70885c().mo70898b() == z.b) {
                C60870cx a = this.f284326a.f284373x.mo92367a();
                ((C89859i) this.f284326a.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_START);
                new C90873ag(a, this.f284326a.f284361l, "home retrain callback", C101873d.m168556a(new C101927aa(this))).mo85223a(C101873d.m168556a(new C101928ab(this)));
                return;
            }
            this.f284326a.f284373x.mo92369c();
            ((C89859i) this.f284326a.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_START);
        }
        this.f284326a.mo92701e();
        C101933ag agVar5 = this.f284326a;
        C90875ai.m148465b(C101873d.m168557b(new C101929ac(this)), agVar5.f284333C.mo92665a(agVar5.f284336F, (C66595bu) agVar5.f284375z.f283245b.mo87020a().mo56111f()), this.f284326a.f284361l, "Record Consent").mo85223a(C101873d.m168556a(new C101930ad(this)));
    }

    /* renamed from: b */
    public final void mo92697b() {
        C59104x d = C101933ag.f284328a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) d).mo56372aa(20451)).mo56386p("EnrollmentRunner failed");
        this.f284326a.f284337G.mo92726c();
        C60870cx a = ((C92417w) this.f284326a.f284364o.mo27525b()).mo87056a(this.f284326a.f284336F, -1);
        ((C89859i) this.f284326a.f284374y.mo27525b()).mo83702b(C89849ae.DELETE_UTTERANCES_ON_ENROLLMENT_FAILURE);
        this.f284326a.f284360k.mo85148m(a, new C101931ae(this));
    }
}
