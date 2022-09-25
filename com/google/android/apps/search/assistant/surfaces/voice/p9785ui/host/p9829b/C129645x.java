package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129543ac;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129563ae;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129565ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129567ai;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129685s;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129687u;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129688v;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129691y;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129692z;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129663a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129664b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129669g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129657d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.x */
/* compiled from: PG */
public final class C129645x implements C129566ah {

    /* renamed from: a */
    private static final C59071e f355820a = C59071e.m91331h();

    /* renamed from: b */
    private final Context f355821b;

    /* renamed from: c */
    private final AccountId f355822c;

    /* renamed from: d */
    private final C129644w f355823d;

    /* renamed from: e */
    private final Optional f355824e;

    /* renamed from: f */
    private final C129663a f355825f;

    public C129645x(Context context, AccountId accountId, C129644w wVar, C129663a aVar, Optional optional) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(optional, "voiceInteractionSessionStarter");
        this.f355821b = context;
        this.f355822c = accountId;
        this.f355823d = wVar;
        this.f355825f = aVar;
        this.f355824e = optional;
    }

    /* renamed from: d */
    private final void m211693d(C129669g gVar) {
        Intent a = C129664b.m211715a(this.f355821b, this.f355822c, gVar);
        C129663a aVar = this.f355825f;
        C69664n.m101061g(a, "intent");
        C47810es.m84979s(aVar.f355871a, a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo109105a(C129676j jVar) {
        C129565ag.m211551a(this, jVar);
    }

    /* renamed from: b */
    public final void mo109106b(C129676j jVar, C34053bp bpVar) {
        C69664n.m101061g(jVar, "content");
        mo109157c(new C129669g(this.f355823d.mo109156b(jVar), jVar, (NavigatorArgs$Transition) null, bpVar));
    }

    /* renamed from: c */
    public final void mo109157c(C129669g gVar) {
        C129567ai.m211555b(gVar.f355877a);
        int a = C129692z.m211747a(gVar.f355877a.f355593a);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            m211693d(gVar);
        } else if (i != 1) {
            if (i == 2) {
                throw new IllegalArgumentException("Destination host must be specified.");
            }
        } else if (!this.f355824e.isPresent()) {
            C59052c cVar = (C59052c) f355820a.mo56226d();
            cVar.mo56379ah(new C59094n(38357));
            cVar.mo56386p("GlobalNavigator::startVoiceInteractionSession(): voiceInteractionSessionStarter empty");
            C129691y yVar = (C129691y) C129541aa.f355591c.createBuilder();
            C69664n.m101060f(yVar, "newBuilder()");
            C129563ae a2 = C69664n.m101061g(yVar, "builder");
            C129685s sVar = (C129685s) C129688v.f355911c.createBuilder();
            C69664n.m101060f(sVar, "newBuilder()");
            C129543ac a3 = C69664n.m101061g(sVar, "builder");
            a3.mo109085b(C129687u.DEFAULT_ACTIVITY);
            a2.mo109103b(a3.mo109084a());
            m211693d(C129669g.m211718b(gVar, a2.mo109102a(), (C129676j) null, 14));
        } else {
            C129657d dVar = (C129657d) this.f355824e.get();
            C46459k.m82829b(dVar.f355850a.mo38977c(new C129655b(dVar.f355851b, gVar), C34037b.CLIENT_MAIN_ASSISTANT), "Starting VoiceInteractionSession failed", new Object[0]);
        }
    }
}
