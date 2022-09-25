package com.google.android.libraries.assistant.auto.tng.p1028l;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5543b.C70936a;
import p5535j.p5536a.p5543b.C70955b;
import p5535j.p5536a.p5543b.C70957d;
import p5535j.p5536a.p5543b.C70958e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.do */
/* compiled from: PG */
public final class C13863do {

    /* renamed from: a */
    public static final C59071e f42210a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.l.do");

    /* renamed from: b */
    public final C37215b f42211b;

    /* renamed from: c */
    public final C21370a f42212c;

    /* renamed from: d */
    public final C69464a f42213d;

    /* renamed from: e */
    public final C13722af f42214e;

    /* renamed from: f */
    private final Executor f42215f;

    /* renamed from: g */
    private final C23319a f42216g;

    /* renamed from: h */
    private final C23319a f42217h;

    /* renamed from: i */
    private boolean f42218i = false;

    /* renamed from: j */
    private boolean f42219j = false;

    /* renamed from: k */
    private boolean f42220k = false;

    /* renamed from: l */
    private boolean f42221l = false;

    public C13863do(C37215b bVar, Executor executor, C21370a aVar, C69464a aVar2, C13722af afVar) {
        this.f42211b = bVar;
        this.f42215f = new C60904dr(executor);
        this.f42212c = aVar;
        this.f42216g = new C23319a();
        this.f42217h = new C23319a();
        this.f42213d = aVar2;
        this.f42214e = afVar;
    }

    /* renamed from: c */
    public static C70958e m30147c(long j) {
        C70936a aVar = (C70936a) C70958e.f189197m.createBuilder();
        C70955b bVar = (C70955b) C70957d.f189190f.createBuilder();
        bVar.copyOnWrite();
        C70957d dVar = (C70957d) bVar.instance;
        dVar.f189193b = 6;
        dVar.f189192a |= 1;
        bVar.copyOnWrite();
        C70957d dVar2 = (C70957d) bVar.instance;
        dVar2.f189192a |= 2;
        dVar2.f189194c = j;
        aVar.copyOnWrite();
        C70958e eVar = (C70958e) aVar.instance;
        C70957d dVar3 = (C70957d) bVar.build();
        dVar3.getClass();
        eVar.f189209j = dVar3;
        eVar.f189200a |= 128;
        return (C70958e) aVar.build();
    }

    /* renamed from: d */
    public static C70958e m30148d(C67438ag agVar) {
        C70936a aVar = (C70936a) C70958e.f189197m.createBuilder();
        C70955b bVar = (C70955b) C70957d.f189190f.createBuilder();
        bVar.copyOnWrite();
        C70957d dVar = (C70957d) bVar.instance;
        dVar.f189193b = 5;
        dVar.f189192a |= 1;
        long j = agVar.f183266i;
        bVar.copyOnWrite();
        C70957d dVar2 = (C70957d) bVar.instance;
        dVar2.f189192a |= 2;
        dVar2.f189194c = j;
        long j2 = agVar.f183267j;
        bVar.copyOnWrite();
        C70957d dVar3 = (C70957d) bVar.instance;
        dVar3.f189192a |= 4;
        dVar3.f189195d = j2;
        long j3 = agVar.f183265h;
        bVar.copyOnWrite();
        C70957d dVar4 = (C70957d) bVar.instance;
        dVar4.f189192a |= 8;
        dVar4.f189196e = j3;
        aVar.copyOnWrite();
        C70958e eVar = (C70958e) aVar.instance;
        C70957d dVar5 = (C70957d) bVar.build();
        dVar5.getClass();
        eVar.f189209j = dVar5;
        eVar.f189200a |= 128;
        return (C70958e) aVar.build();
    }

    /* renamed from: g */
    private final C60870cx m30149g(C67438ag agVar, C60870cx cxVar, C60870cx cxVar2, boolean z) {
        long j = agVar.f183265h;
        long j2 = agVar.f183266i;
        long j3 = agVar.f183267j;
        C67442ak akVar = agVar.f183263f;
        if (akVar == null) {
            akVar = C67442ak.f183276i;
        }
        long j4 = akVar.f183280c;
        return C47638k.m84753d(cxVar, cxVar2).mo51520a(new C13862dn(this, cxVar, cxVar2, z, agVar), this.f42215f);
    }

    /* renamed from: h */
    private static String m30150h(C67438ag agVar, C23319a aVar) {
        C67442ak akVar;
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            if ((agVar.f183258a & 16) != 0) {
                akVar = agVar.f183263f;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
            } else {
                akVar = agVar.f183261d;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
            }
            C58485gu b = aVar.mo28813b(akVar);
            return !b.isEmpty() ? (String) b.get(0) : BuildConfig.FLAVOR;
        }
        Pair a2 = aVar.mo28812a(agVar);
        Object obj = a2.first;
        Object obj2 = a2.second;
        return (String) a2.first;
    }

    /* renamed from: a */
    public final C60870cx mo21312a(C67438ag agVar, C60870cx cxVar, C60870cx cxVar2) {
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            long j = agVar.f183265h;
            long j2 = agVar.f183266i;
            long j3 = agVar.f183267j;
            if (!this.f42218i && (j2 > 0 || j3 > 0)) {
                this.f42218i = true;
                return m30149g(agVar, cxVar, cxVar2, false);
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo21313b(C67438ag agVar, C60870cx cxVar, C60870cx cxVar2) {
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            long j = agVar.f183265h;
            long j2 = agVar.f183266i;
            long j3 = agVar.f183267j;
            if (!this.f42219j && (j2 > 0 || j3 > 0)) {
                this.f42219j = true;
                return m30149g(agVar, cxVar, cxVar2, true);
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: e */
    public final void mo21314e(C67438ag agVar) {
        if (!this.f42220k && !m30150h(agVar, this.f42216g).isEmpty()) {
            this.f42211b.mo19974a(C37179a.f97550cP);
            this.f42220k = true;
        }
    }

    /* renamed from: f */
    public final void mo21315f(C67438ag agVar) {
        if (!this.f42221l && !m30150h(agVar, this.f42217h).isEmpty()) {
            this.f42211b.mo19974a(C37179a.f97549cO);
            this.f42221l = true;
        }
    }
}
