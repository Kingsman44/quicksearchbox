package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120420b;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120515l;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120419b;
import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.libraries.search.p2904c.C37405bj;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67175t;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.x */
/* compiled from: PG */
public final class C120416x implements C120419b {

    /* renamed from: a */
    public static final C59071e f334932a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.b.a.a.x");

    /* renamed from: b */
    public final C37419bx f334933b;

    /* renamed from: c */
    public final Executor f334934c;

    /* renamed from: d */
    public final Executor f334935d;

    /* renamed from: e */
    public C120507d f334936e = C120507d.m199598f().mo104789a();

    /* renamed from: f */
    public final Optional f334937f;

    public C120416x(C37419bx bxVar, Optional optional, Executor executor, Executor executor2) {
        this.f334933b = bxVar;
        this.f334937f = optional;
        this.f334934c = executor;
        this.f334935d = executor2;
    }

    /* renamed from: b */
    public static C60870cx m199445b(C37405bj bjVar) {
        C60870cx d = bjVar.mo40940a().mo20357d();
        C120412t tVar = new C120412t(bjVar);
        return C60922j.m93044g(d, C47810es.m84963c(tVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C47630c mo104744a(Consumer consumer) {
        Optional optional;
        C120420b bVar;
        C59071e eVar = f334932a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
        ((C59052c) ((C59052c) b).mo56372aa(35448)).mo56386p("#open");
        Optional optional2 = this.f334937f;
        if (!optional2.isPresent() || (((C18343b) optional2.get()).f52031a & 2) == 0) {
            optional = Optional.empty();
        } else {
            C67050je jeVar = ((C18343b) optional2.get()).f52033c;
            if (jeVar == null) {
                jeVar = C67050je.f182262f;
            }
            optional = Optional.m71637of(jeVar);
        }
        if (optional.isPresent()) {
            C67050je jeVar2 = ((C18343b) this.f334937f.get()).f52033c;
            if (jeVar2 == null) {
                jeVar2 = C67050je.f182262f;
            }
            C67073ka kaVar = jeVar2.f182266c;
            if (kaVar == null) {
                kaVar = C67073ka.f182324f;
            }
            C67171p pVar = kaVar.f182327b;
            if (pVar == null) {
                pVar = C67171p.f182575e;
            }
            C120515l f = C120507d.m199598f();
            C67175t tVar = pVar.f182579c;
            if (tVar == null) {
                tVar = C67175t.f182588e;
            }
            f.mo104792d(tVar.f182592c);
            C67175t tVar2 = pVar.f182579c;
            if (tVar2 == null) {
                tVar2 = C67175t.f182588e;
            }
            int i = tVar2.f182593d;
            if (i == 1) {
                bVar = C120420b.MONO;
            } else if (i == 2) {
                bVar = C120420b.STEREO;
            } else {
                throw new IllegalStateException("Invalid channel count");
            }
            f.mo104790b(bVar);
            this.f334936e = f.mo104789a();
        } else {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
            ((C59052c) ((C59052c) d).mo56372aa(35449)).mo56386p("Using default audio config");
            this.f334936e = C120507d.m199598f().mo104789a();
        }
        return C47630c.m84724a(new C120409q(this), this.f334934c).mo51506d(C60817ay.m92818o(), this.f334934c).mo51505c(new C120410r(this, consumer, optional), this.f334934c);
    }
}
