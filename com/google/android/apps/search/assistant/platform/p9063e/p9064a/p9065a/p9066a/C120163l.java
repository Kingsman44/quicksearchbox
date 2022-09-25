package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.aoa;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17251p;
import com.google.android.libraries.search.assistant.p2513e.p2514a.C32566c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66675i;
import com.google.speech.p5208h.C66676j;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.a.l */
/* compiled from: PG */
public final class C120163l implements C17266e {

    /* renamed from: g */
    private static final C59071e f334422g = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.a.a.a.l");

    /* renamed from: a */
    public final Executor f334423a;

    /* renamed from: b */
    public final C119891j f334424b;

    /* renamed from: c */
    public final C60870cx f334425c;

    /* renamed from: d */
    public final C32566c f334426d;

    /* renamed from: e */
    public C2164c f334427e;

    /* renamed from: f */
    public final aoa f334428f;

    /* renamed from: h */
    private final boolean f334429h;

    /* renamed from: i */
    private final C60870cx f334430i;

    public C120163l(Executor executor, aoa aoa, C32566c cVar, C119893l lVar, boolean z, C60870cx cxVar) {
        this.f334423a = executor;
        this.f334428f = aoa;
        this.f334426d = cVar;
        C119891j a = C119891j.m198765a(lVar.f333897d);
        this.f334424b = a == null ? C119891j.DEFAULT_AUDIO_ENCODING : a;
        this.f334429h = z;
        this.f334430i = cxVar;
        this.f334425c = C2169h.m6027a(new C120161j(this));
    }

    /* renamed from: b */
    public static C60870cx m199094b(C63088z zVar, Consumer consumer) {
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        C66675i iVar = (C66675i) C66676j.f181378c.createBuilder();
        iVar.copyOnWrite();
        C66676j jVar = (C66676j) iVar.instance;
        zVar.getClass();
        jVar.f181382a |= 1;
        jVar.f181383b = zVar;
        cdVar.mo58885m(C66676j.f181380e, (C66676j) iVar.build());
        ((C17251p) consumer).accept((C66607ce) cdVar.build());
        return C60866ct.f164955a;
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        C59071e eVar = f334422g;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PreambleS3RequestProducer");
        ((C59052c) ((C59052c) b).mo56372aa(34661)).mo56386p("#createInitialRequestMutator");
        if (this.f334429h) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PreambleS3RequestProducer");
            ((C59052c) ((C59052c) b2).mo56372aa(34662)).mo56386p("Skip sending preamble info for reopening mic turn.");
            return C60856cj.m92900i(C120156e.f334411a);
        }
        C60870cx j = C60856cj.m92901j(this.f334430i);
        C120157f fVar = new C120157f(this);
        return C60922j.m93044g(j, C47810es.m84963c(fVar), this.f334423a);
    }

    /* renamed from: c */
    public final C60870cx mo23246c(Consumer consumer) {
        C59071e eVar = f334422g;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PreambleS3RequestProducer");
        ((C59052c) ((C59052c) b).mo56372aa(34663)).mo56386p("#streamTo");
        if (this.f334429h) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PreambleS3RequestProducer");
            ((C59052c) ((C59052c) b2).mo56372aa(34664)).mo56386p("Skip sending preamble audio for reopening mic turn.");
            this.f334427e.mo5437b((Object) null);
            return C60866ct.f164955a;
        }
        C60870cx j = C60856cj.m92901j(this.f334430i);
        C120159h hVar = new C120159h(this, consumer);
        C60870cx h = C60922j.m93045h(j, C47810es.m84966f(hVar), this.f334423a);
        h.mo4106b(new C120160i(this), C60826bg.f164896a);
        return h;
    }
}
