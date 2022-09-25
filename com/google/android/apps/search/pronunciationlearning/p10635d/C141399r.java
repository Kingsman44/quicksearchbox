package com.google.android.apps.search.pronunciationlearning.p10635d;

import android.speech.tts.UtteranceProgressListener;
import android.util.ArrayMap;
import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37345aj;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37482d;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37761d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.r */
/* compiled from: PG */
public final class C141399r {

    /* renamed from: a */
    public static final C37346ak f383822a;

    /* renamed from: b */
    public final C141382a f383823b;

    /* renamed from: c */
    public final Executor f383824c;

    /* renamed from: d */
    public final Map f383825d = new ArrayMap();

    /* renamed from: e */
    public int f383826e;

    /* renamed from: f */
    public C37325aa f383827f;

    /* renamed from: g */
    public String f383828g;

    /* renamed from: h */
    public final C37482d f383829h;

    /* renamed from: i */
    private final C60870cx f383830i;

    /* renamed from: j */
    private final UtteranceProgressListener f383831j;

    static {
        C37345aj ajVar = (C37345aj) C37346ak.f99197g.createBuilder();
        ajVar.copyOnWrite();
        C37346ak akVar = (C37346ak) ajVar.instance;
        akVar.f99199a |= 1;
        akVar.f99200b = 4;
        ajVar.copyOnWrite();
        C37346ak akVar2 = (C37346ak) ajVar.instance;
        akVar2.f99199a |= 2;
        akVar2.f99201c = 5;
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37761d dVar = C37761d.f100194a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        dVar.getClass();
        cVar.f100246b = dVar;
        cVar.f100245a = 16;
        ajVar.copyOnWrite();
        C37346ak akVar3 = (C37346ak) ajVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        akVar3.f99203e = cVar2;
        akVar3.f99199a |= 8;
        f383822a = (C37346ak) ajVar.build();
    }

    public C141399r(C141382a aVar, C60887da daVar, C37482d dVar) {
        C141397p pVar = new C141397p(this);
        this.f383831j = pVar;
        this.f383826e = 0;
        this.f383823b = aVar;
        this.f383829h = dVar;
        this.f383830i = aVar.mo116398a(Locale.forLanguageTag("en-US"), pVar);
        this.f383824c = new C60904dr(daVar);
    }

    /* renamed from: a */
    public final C60870cx mo116408a(String str) {
        C47633f i = C47633f.m84733g(this.f383830i).mo51516i(new C141389h(this), this.f383824c).mo51516i(new C141390i(this), this.f383824c).mo51516i(C141391j.f383812a, this.f383824c).mo51516i(new C141392k(this, str), this.f383824c);
        C141398q qVar = new C141398q(this);
        C60856cj.m92911t(i, C47810es.m84974n(qVar), this.f383824c);
        return i;
    }

    /* renamed from: b */
    public final C60870cx mo116409b(String str) {
        C141388g gVar = new C141388g(this, str);
        return C60856cj.m92903l(C47810es.m84977q(gVar), this.f383824c);
    }

    /* renamed from: c */
    public final void mo116410c() {
        C141394m mVar = new C141394m(this);
        C60856cj.m92905n(C47810es.m84965e(mVar), this.f383824c);
    }

    /* renamed from: d */
    public final void mo116411d() {
        C141393l lVar = new C141393l(this);
        C60856cj.m92903l(C47810es.m84977q(lVar), this.f383824c);
    }
}
