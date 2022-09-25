package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.C8971c;
import com.google.android.apps.gsa.projection.p6477a.C84184a;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1110c.p1111a.C15502d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.au */
/* compiled from: PG */
public final class C101369au extends C8971c {

    /* renamed from: b */
    public final C58974d f282885b = C58974d.m91135i("VoicePlateCarActivity");

    /* renamed from: c */
    public C84184a f282886c;

    /* renamed from: d */
    public C22871g f282887d;

    /* renamed from: e */
    public C37251i f282888e;

    /* renamed from: n */
    private C60870cx f282889n;

    /* renamed from: o */
    private C101370a f282890o;

    /* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.au$a */
    /* compiled from: PG */
    public interface C101370a {
        /* renamed from: aw */
        C84184a mo92265aw();

        /* renamed from: bW */
        C15502d mo92266bW();

        /* renamed from: cl */
        C22871g mo92267cl();

        /* renamed from: cx */
        C37266j mo92268cx();

        /* renamed from: eL */
        Executor mo92269eL();

        /* renamed from: rX */
        C32240a mo92270rX();
    }

    /* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.au$b */
    /* compiled from: PG */
    public interface C101371b {
        /* renamed from: dS */
        C15488n mo92271dS();
    }

    /* renamed from: N */
    private final void m167664N(Consumer consumer, String str) {
        C60870cx cxVar = this.f282889n;
        if (cxVar == null) {
            ((C58970a) ((C58970a) this.f282885b.mo56226d()).mo56372aa(20119)).mo56386p("Trying to run lifecycle method before attaching");
            return;
        }
        C90875ai.m148465b(C101365aq.f282881a, this.f282887d.mo28210j(cxVar, "AssistantFragment Attached", new C101364ap(this, str, consumer)), this.f282887d, "Run lifecycle on AssistantFragmentHost").mo85223a(new C101366ar(this));
    }

    /* renamed from: c */
    public final void mo17282c(Bundle bundle) {
        super.mo17282c(bundle);
        C101370a aVar = (C101370a) C47266f.m84076a(this, C101370a.class);
        this.f282890o = aVar;
        this.f282886c = aVar.mo92265aw();
        this.f282887d = this.f282890o.mo92267cl();
        C37251i a = this.f282890o.mo92268cx().mo40826a();
        this.f282888e = a;
        a.mo40774b(C37179a.f97578cr.mo40779c());
        mo17290l();
        if (this.f282886c.f229167b == null) {
            ((C58970a) ((C58970a) this.f282885b.mo56225c()).mo56372aa(20110)).mo56386p("Cannot complete request with null Config.");
            mo118012A();
            return;
        }
        mo118029z();
        if (!((C143268bb) this.f388166f).f388466o.hasExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM") || !((C143268bb) this.f388166f).f388466o.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", false)) {
            this.f31072a.mo17292a().setBackgroundColor(0);
            this.f31072a.f31077b.mo17277a();
            FrameLayout frameLayout = (FrameLayout) mo118024t().inflate(R.layout.assist_layer_container, (ViewGroup) null);
            mo17288j(frameLayout);
            this.f282889n = this.f282887d.mo28201a("AssistantFragmentHost onCreate", new C101357ai(this, frameLayout));
            return;
        }
        C101370a aVar2 = this.f282890o;
        this.f282888e.mo40774b(C37179a.f97663ee.mo40805c(C62722b.OK));
        mo92264q();
        C60870cx a2 = aVar2.mo92270rX().f86461a.mo104411a(C101371b.class);
        C101359ak akVar = new C101359ak(this, aVar2);
        C46459k.m82829b(C60922j.m93045h(a2, C47810es.m84966f(akVar), aVar2.mo92269eL()), "Failed to log prewarm appflow", new Object[0]);
        mo118012A();
    }

    /* renamed from: g */
    public final void mo17285g() {
        super.mo17285g();
        m167664N(C101361am.f282875a, "VoicePlateCarActivity#onStart");
    }

    /* renamed from: h */
    public final void mo17286h() {
        super.mo17286h();
        m167664N(C101362an.f282876a, "VoicePlateCarActivity#onStop");
    }

    /* renamed from: m */
    public final void mo19990m() {
        super.mo19990m();
        m167664N(C101367as.f282883a, "VoicePlateCarActivity#onDestroy");
    }

    /* renamed from: n */
    public final void mo19991n(Intent intent) {
        if (!intent.getBooleanExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_STOP_VOICE_SESSION", false)) {
            ((C58970a) ((C58970a) this.f282885b.mo56226d()).mo56372aa(20114)).mo56389s("Unsupported new intent: %s", intent);
            return;
        }
        m167664N(new C101368at(intent), "VoicePlateCarActivity#onNewIntent");
        this.f388174j.mo583n();
    }

    /* renamed from: o */
    public final void mo19992o() {
        super.mo19992o();
        m167664N(C101358aj.f282870a, "VoicePlateCarActivity#onPause");
    }

    /* renamed from: p */
    public final void mo19993p() {
        super.mo19993p();
        m167664N(C101363ao.f282877a, "VoicePlateCarActivity#onResume");
    }

    /* renamed from: q */
    public final void mo92264q() {
        Intent intent = ((C143268bb) this.f388166f).f388466o;
        if (intent == null) {
            ((C58970a) ((C58970a) this.f282885b.mo56226d()).mo56372aa(20123)).mo56386p("No intent set when bringing up the CarActivity.");
            intent = new Intent();
        }
        intent.putExtra("assistant_auto_additional_events_extra", this.f282888e.mo40776d());
        mo118016F(intent);
    }
}
