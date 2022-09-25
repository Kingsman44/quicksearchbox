package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128364a;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128365b;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128366c;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128368e;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128369f;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128544a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60944c;
import com.google.common.p4580v.C60945d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.speech.p5224k.p5225a.C67193ak;
import com.google.speech.p5224k.p5225a.C67194al;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.p */
/* compiled from: PG */
public final class C128384p {

    /* renamed from: a */
    public static final C59071e f353092a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.m.l.p");

    /* renamed from: h */
    private static final Duration f353093h = Duration.ofSeconds(10);

    /* renamed from: b */
    public final Deque f353094b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f353095c;

    /* renamed from: d */
    public final C60950i f353096d;

    /* renamed from: e */
    public boolean f353097e = false;

    /* renamed from: f */
    public Instant f353098f = null;

    /* renamed from: g */
    public String f353099g = null;

    /* renamed from: i */
    private final C128544a f353100i;

    public C128384p(C128544a aVar, Executor executor, C60950i iVar) {
        this.f353100i = aVar;
        this.f353095c = executor;
        this.f353096d = iVar;
    }

    /* renamed from: d */
    public static boolean m209502d(C67194al alVar) {
        if (alVar == null) {
            return false;
        }
        C67193ak akVar = alVar.f182646b;
        if (akVar == null) {
            akVar = C67193ak.f182639c;
        }
        return ((akVar.f182641a & 8) == 0 || (alVar.f182645a & 4) == 0) ? false : true;
    }

    /* renamed from: a */
    public final void mo108404a() {
        this.f353095c.execute(C47810es.m84977q(new C128381m(this)));
    }

    /* renamed from: b */
    public final void mo108405b(C67194al alVar) {
        this.f353095c.execute(C47810es.m84977q(new C128382n(this, alVar)));
    }

    /* renamed from: c */
    public final void mo108406c(C67194al alVar) {
        if (m209502d(alVar)) {
            Instant instant = this.f353098f;
            if (this.f353097e && instant != null) {
                C67193ak akVar = alVar.f182646b;
                if (akVar == null) {
                    akVar = C67193ak.f182639c;
                }
                String str = akVar.f182642b;
                Instant e = C60945d.m93100e(instant, C60944c.m93093f(alVar.f182647c));
                C128544a aVar = this.f353100i;
                C128364a aVar2 = (C128364a) C128365b.f353033d.createBuilder();
                C67193ak akVar2 = alVar.f182646b;
                if (akVar2 == null) {
                    akVar2 = C67193ak.f182639c;
                }
                String str2 = akVar2.f182642b;
                aVar2.copyOnWrite();
                C128365b bVar = (C128365b) aVar2.instance;
                str2.getClass();
                bVar.f353035a |= 1;
                bVar.f353036b = str2;
                C63042fg c = C62950b.m95472c(e);
                aVar2.copyOnWrite();
                C128365b bVar2 = (C128365b) aVar2.instance;
                c.getClass();
                bVar2.f353037c = c;
                bVar2.f353035a |= 2;
                Duration duration = f353093h;
                C128366c cVar = (C128366c) C128369f.f353045c.createBuilder();
                C128368e eVar = C128368e.TIMED_OUT;
                cVar.copyOnWrite();
                C128369f fVar = (C128369f) cVar.instance;
                fVar.f353048b = eVar.f353044e;
                fVar.f353047a |= 1;
                C60856cj.m92911t(aVar.mo108509a((C128365b) aVar2.build(), duration, (C128369f) cVar.build()), C47810es.m84974n(new C128383o(this, alVar)), this.f353095c);
            }
        }
    }
}
