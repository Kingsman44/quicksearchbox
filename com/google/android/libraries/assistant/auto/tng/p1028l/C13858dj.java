package com.google.android.libraries.assistant.auto.tng.p1028l;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13028ap;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13029aq;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13030ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13031as;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13032at;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13848b;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.p4449cd.p4456g.p4459c.C57998b;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.dj */
/* compiled from: PG */
public final class C13858dj {

    /* renamed from: a */
    public final C57987f f42191a;

    /* renamed from: b */
    public final C23319a f42192b;

    /* renamed from: c */
    public final C23319a f42193c;

    /* renamed from: d */
    public final C37215b f42194d;

    /* renamed from: e */
    public final C13848b f42195e;

    /* renamed from: f */
    public boolean f42196f = false;

    /* renamed from: g */
    public boolean f42197g = false;

    /* renamed from: h */
    public boolean f42198h = false;

    /* renamed from: i */
    private final Executor f42199i;

    /* renamed from: j */
    private boolean f42200j = false;

    public C13858dj(C13848b bVar, C37215b bVar2, Executor executor) {
        C57987f fVar = new C57987f();
        this.f42191a = fVar;
        this.f42192b = new C23319a();
        this.f42193c = new C23319a();
        bVar.mo21300k(new C57998b(fVar, new C13857di()));
        this.f42195e = bVar;
        this.f42194d = bVar2;
        this.f42199i = new C60904dr(executor);
    }

    /* renamed from: a */
    public static C13033au m30142a(C67438ag agVar, C23319a aVar) {
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
            String str = !b.isEmpty() ? (String) b.get(0) : BuildConfig.FLAVOR;
            C13028ap apVar = (C13028ap) C13033au.f40462c.createBuilder();
            C13029aq aqVar = (C13029aq) C13030ar.f40453c.createBuilder();
            aqVar.copyOnWrite();
            C13030ar arVar = (C13030ar) aqVar.instance;
            str.getClass();
            arVar.f40455a = 1 | arVar.f40455a;
            arVar.f40456b = str;
            apVar.copyOnWrite();
            C13033au auVar = (C13033au) apVar.instance;
            C13030ar arVar2 = (C13030ar) aqVar.build();
            arVar2.getClass();
            auVar.f40465b = arVar2;
            auVar.f40464a = 2;
            return (C13033au) apVar.build();
        }
        Pair a2 = aVar.mo28812a(agVar);
        Object obj = a2.first;
        Object obj2 = a2.second;
        C13028ap apVar2 = (C13028ap) C13033au.f40462c.createBuilder();
        C13031as asVar = (C13031as) C13032at.f40457d.createBuilder();
        String str2 = (String) a2.first;
        asVar.copyOnWrite();
        C13032at atVar = (C13032at) asVar.instance;
        str2.getClass();
        atVar.f40459a |= 1;
        atVar.f40460b = str2;
        String str3 = (String) a2.second;
        asVar.copyOnWrite();
        C13032at atVar2 = (C13032at) asVar.instance;
        str3.getClass();
        atVar2.f40459a = 2 | atVar2.f40459a;
        atVar2.f40461c = str3;
        apVar2.copyOnWrite();
        C13033au auVar2 = (C13033au) apVar2.instance;
        C13032at atVar3 = (C13032at) asVar.build();
        atVar3.getClass();
        auVar2.f40465b = atVar3;
        auVar2.f40464a = 1;
        return (C13033au) apVar2.build();
    }

    /* renamed from: b */
    public final C60870cx mo21307b(C67438ag agVar, boolean z) {
        C13854df dfVar = new C13854df(this, agVar, z);
        return C60856cj.m92903l(C47810es.m84977q(dfVar), this.f42199i);
    }

    /* renamed from: c */
    public final C60870cx mo21308c(C67438ag agVar) {
        C13855dg dgVar = new C13855dg(this, agVar);
        return C60856cj.m92903l(C47810es.m84977q(dgVar), this.f42199i);
    }

    /* renamed from: d */
    public final void mo21309d(boolean z) {
        C13856dh dhVar = new C13856dh(this, z);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(dhVar), this.f42199i), "RecognitionEventHandler#end failed", new Object[0]);
    }

    /* renamed from: e */
    public final void mo21310e() {
        if (!this.f42200j) {
            this.f42200j = true;
            this.f42195e.mo21297h();
        }
    }
}
