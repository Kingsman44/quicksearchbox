package com.google.android.apps.gsa.nga.engine.recognition.p6134n.p6135a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.am.y.c;
import com.google.android.apps.gsa.nga.engine.av.s;
import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.p5913am.p5944y.C74977b;
import com.google.android.apps.gsa.nga.engine.p5964av.C75076bk;
import com.google.android.apps.gsa.nga.engine.p5964av.C75162p;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75113bn;
import com.google.android.apps.gsa.nga.engine.p6137s.C77908f;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.p6260x.C79857e;
import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.engine.recognition.p6134n.C77867a;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80640d;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.n.a.f */
/* compiled from: PG */
public final class C77873f implements C77867a {

    /* renamed from: a */
    private final Object f214519a = new Object();

    /* renamed from: b */
    private final C60950i f214520b;

    /* renamed from: c */
    private final C77908f f214521c;

    /* renamed from: d */
    private final C81459h f214522d;

    /* renamed from: e */
    private final C79857e f214523e;

    /* renamed from: f */
    private final C22871g f214524f;

    /* renamed from: g */
    private final C75113bn f214525g;

    public C77873f(C75113bn bnVar, C79857e eVar, C77908f fVar, C60950i iVar, C81465n nVar, C90821bm bmVar, C22871g gVar) {
        this.f214525g = bnVar;
        this.f214523e = eVar;
        this.f214521c = fVar;
        this.f214520b = iVar;
        this.f214524f = gVar;
        this.f214522d = nVar.mo75095b(bmVar.mo85163a(C77872e.class), C77870c.f214517a);
    }

    /* renamed from: g */
    private final C60870cx m124956g(j jVar, C77889u uVar, C77551ad adVar, String str, Optional optional, e eVar, Optional optional2) {
        C60870cx a;
        synchronized (this.f214519a) {
            this.f214521c.mo72879d();
            C74977b a2 = c.a();
            optional2.ifPresent(new C77869b(a2));
            C75162p g = C75076bk.m121347g();
            g.f209594a = jVar;
            g.d(uVar);
            g.c(eVar);
            g.f209595b = a2.mo71360a();
            s sVar = new s();
            sVar.c(str);
            sVar.b(adVar);
            sVar.d(this.f214520b.mo57444a());
            if (optional != null) {
                sVar.a = optional;
                C75076bk h = g.h(sVar.a());
                this.f214522d.mo75090a(h);
                a = this.f214525g.mo71498a(h);
            } else {
                throw new NullPointerException("Null clickTrackingCgi");
            }
        }
        return a;
    }

    /* renamed from: a */
    public final C60870cx mo72847a(C80640d dVar, String str) {
        return this.f214524f.mo28209i(m124956g(new C79856d(this.f214523e.mo74270a()).mo74269a(), C77889u.WATCH_SUGGESTION, C77551ad.WATCH_SUGGESTION, str, Optional.empty(), e.W, Optional.m71637of(dVar)), "[NGA] executeWatchSuggestionQuery", C77868a.f214515a);
    }

    /* renamed from: b */
    public final void mo72848b(String str, e eVar) {
        m124956g(new C79856d(this.f214523e.mo74270a()).mo74269a(), C77889u.KEYBOARD_INPUT, C77551ad.KEYBOARD_INPUT, str, Optional.empty(), eVar, Optional.empty());
    }

    /* renamed from: c */
    public final void mo72849c(String str, String str2, e eVar) {
        String str3 = str;
        m124956g(new C79856d(this.f214523e.mo74270a()).mo74269a(), C77889u.OPA_SUGGESTION, C77551ad.OPA_SUGGESTION, str3, Optional.ofNullable(str2).filter(C77871d.f214518a), eVar, Optional.empty());
    }

    /* renamed from: d */
    public final void mo72850d(String str) {
        m124956g(new C79856d(this.f214523e.mo74270a()).mo74269a(), C77889u.PROACTIVE, C77551ad.PROACTIVE, str, Optional.empty(), e.A, Optional.empty());
    }

    /* renamed from: e */
    public final void mo72851e(String str, e eVar) {
        m124956g(new C79856d(this.f214523e.mo74270a()).mo74269a(), C77889u.TEXT_QUERY, C77551ad.EDUCATIONAL_SUGGESTION, str, Optional.empty(), eVar, Optional.empty());
    }

    /* renamed from: f */
    public final void mo72852f(String str) {
        m124956g(new C79856d(this.f214523e.mo74270a()).mo74269a(), C77889u.TEXT_QUERY, C77551ad.USER_INPUT, str, Optional.empty(), e.bY, Optional.empty());
    }
}
