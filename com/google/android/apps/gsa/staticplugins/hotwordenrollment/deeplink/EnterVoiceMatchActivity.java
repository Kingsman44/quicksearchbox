package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.C0815b;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import dagger.C68214a;

/* compiled from: PG */
public class EnterVoiceMatchActivity extends C101798n {

    /* renamed from: p */
    private static final C59071e f283922p = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.EnterVoiceMatchActivity");

    /* renamed from: j */
    public C68214a f283923j;

    /* renamed from: k */
    public C68214a f283924k;

    /* renamed from: l */
    public C68214a f283925l;

    /* renamed from: m */
    C0816c f283926m;

    /* renamed from: n */
    C0815b f283927n;

    public final void onCreate(Bundle bundle) {
        Intent intent;
        C74504a.m120462a(f.ac);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            data.getPath();
            if ("/voicematch/voice-search".equals(data.getPath())) {
                C59104x b = f283922p.mo56224b();
                b.mo56378ag(C58975e.f156826a, "VMEntry");
                ((C59052c) ((C59052c) b).mo56372aa(20262)).mo56386p("Starting phone enrollment from Voice Search.");
                this.f283927n = new C101786b(this);
                this.f283926m = mo3336s(new C0813f(), this.f2708i, this.f283927n);
                if (((C92486a) this.f283925l.mo27525b()).mo87248v()) {
                    C74554t i = C74555u.m120572i();
                    i.mo70869c(C9439b.PHONE_ENROLLMENT_DEEPLINK_FROM_VOICE_SEARCH);
                    intent = i.mo70882h();
                } else {
                    C18509a c = C18522b.m35986c();
                    ((C18523c) c).f52492a = "phone_voice_match";
                    intent = c.mo24020b().mo24031a();
                }
                this.f283926m.mo526b(intent);
                return;
            }
            C59104x b2 = f283922p.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "VMEntry");
            ((C59052c) ((C59052c) b2).mo56372aa(20261)).mo56386p("Starting home enrollment.");
            this.f283927n = new C101787c(this);
            this.f283926m = mo3336s(new C0813f(), this.f2708i, this.f283927n);
            ((C89859i) this.f283923j.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_DEEPLINK_START);
            ((C118827a) this.f283924k.mo27525b()).mo77944g(C118569b.VOICE_MATCH_DEEPLINK_WELCOME_SCREEN_COUNT, C118575h.VOICE_MATCH_ENROLLMENT).mo104025g(1);
            C0816c cVar = this.f283926m;
            C83879am o = C83880an.m133553o();
            C83940g gVar = (C83940g) o;
            gVar.f228605a = "VoiceMatchDeeplinkOnboarding";
            gVar.f228607c = new C83938e(0, (String) null, (String) null);
            C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
            C9439b bVar = C9439b.VOICE_MATCH_ENROLLMENT_DEEPLINK;
            vVar.copyOnWrite();
            C59567w wVar = (C59567w) vVar.instance;
            wVar.f158062c = bVar.f32835aq;
            wVar.f158060a |= 2;
            o.mo77222b((C59567w) vVar.build());
            o.mo77225e(2);
            cVar.mo526b(o.mo77221a().mo77240n());
            return;
        }
        C59104x c2 = f283922p.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "VMEntry");
        ((C59052c) ((C59052c) c2).mo56372aa(20259)).mo56386p("Uri is null.");
        finish();
    }
}
