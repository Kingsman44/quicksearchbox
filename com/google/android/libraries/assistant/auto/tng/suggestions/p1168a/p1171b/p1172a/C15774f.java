package com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.p1172a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15778e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15797g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15803m;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15806p;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15809s;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15813w;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.C15814a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.a.b.a.f */
/* compiled from: PG */
public final class C15774f implements C15778e {

    /* renamed from: c */
    private static final C59071e f46999c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.a.b.a.f");

    /* renamed from: a */
    public final C16002a f47000a;

    /* renamed from: b */
    public final C15814a f47001b;

    /* renamed from: d */
    private final Executor f47002d;

    public C15774f(C16002a aVar, Executor executor, C15814a aVar2) {
        this.f47000a = aVar;
        this.f47002d = executor;
        this.f47001b = aVar2;
    }

    /* renamed from: c */
    public static C58833ax m32541c(C60870cx cxVar, Class cls) {
        try {
            return (C58833ax) C60856cj.m92909r(cxVar);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f46999c.mo56226d()).mo56382g(e)).mo56372aa(46430)).mo56389s("Failed to get signal from the future of %s", cls);
            return C58836b.f156633a;
        }
    }

    /* renamed from: a */
    public final C60870cx mo22541a() {
        C60870cx a = this.f47001b.mo22573a(C15809s.f47037b);
        C15773e eVar = C15773e.f46998a;
        return C60922j.m93044g(a, C47810es.m84963c(eVar), this.f47002d);
    }

    /* renamed from: b */
    public final C60870cx mo22542b(C16090ap apVar) {
        C60870cx a = this.f47001b.mo22573a(C15813w.f47039b);
        C60870cx a2 = this.f47001b.mo22573a(C15813w.f47038a);
        C60870cx a3 = this.f47001b.mo22573a(C15803m.f47032b);
        C60870cx a4 = this.f47001b.mo22573a(C15803m.f47033c);
        C60870cx a5 = this.f47001b.mo22573a(C15809s.f47036a);
        C60870cx a6 = this.f47001b.mo22573a(C15797g.f47029a);
        C15770b bVar = new C15770b(this, apVar);
        C60870cx h = C60922j.m93045h(a5, C47810es.m84966f(bVar), this.f47002d);
        C60870cx a7 = this.f47001b.mo22573a(C15806p.f47034a);
        C15771c cVar = new C15771c(this, apVar);
        C60870cx h2 = C60922j.m93045h(a5, C47810es.m84966f(cVar), this.f47002d);
        return C47638k.m84751b(a, a2, a3, a4, a5, h, a7, h2, a6).mo51520a(new C15772d(a, a2, a3, a5, a6, h, a7, a4, h2), this.f47002d);
    }
}
