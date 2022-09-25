package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11729z;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1262j.C16310e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1262j.C16323r;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1262j.C16325t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.suggestion.C53473c;
import com.google.assistant.suggestion.RegisterDisplayParams;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.k */
/* compiled from: PG */
final class C11740k implements C70862aj {

    /* renamed from: a */
    public C70862aj f37793a;

    /* renamed from: b */
    final /* synthetic */ C11741l f37794b;

    public C11740k(C11741l lVar) {
        this.f37794b = lVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        if (this.f37794b.mo20124l()) {
            C46459k.m82829b(this.f37794b.f37798d.mo22885b(), "Failure unregistering Suggestions", new Object[0]);
        }
        this.f37793a = null;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C11741l.f37795a.mo56225c()).mo56382g(th)).mo56372aa(43415)).mo56386p("Error streaming Suggestion Callbacks");
        if (this.f37794b.mo20124l()) {
            C46459k.m82829b(this.f37794b.f37798d.mo22885b(), "Error unregistering Suggestions", new Object[0]);
        }
        this.f37793a = null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C11729z zVar = (C11729z) obj;
        this.f37793a.getClass();
        if (!this.f37794b.mo20124l()) {
            ((C59052c) ((C59052c) C11741l.f37795a.mo56225c()).mo56372aa(43416)).mo56386p("SuggestionCallbacks received when the feature is not enabled");
            C70862aj ajVar = this.f37793a;
            ajVar.getClass();
            ajVar.mo20122b(C11741l.m27401e());
            this.f37793a = null;
        } else if ((zVar.f37777a & 1) != 0) {
            C16325t tVar = this.f37794b.f37798d;
            C11739j jVar = new C11739j(this);
            int intValue = ((Long) tVar.f48027g.mo17428b()).intValue();
            C53473c a = C53473c.m86820a();
            a.f140342d = 6;
            a.f140339a = intValue;
            C60870cx f = tVar.f48021a.mo22920f("coolwalk_suggestion_display_id", new RegisterDisplayParams(a), new C16323r(tVar, intValue, jVar), 3);
            C16310e eVar = new C16310e(tVar);
            C46459k.m82829b(C60922j.m93045h(f, C47810es.m84966f(eVar), tVar.f48024d), "Gearhead register Suggestion failed", new Object[0]);
        }
    }
}
