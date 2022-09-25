package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134281m;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134283o;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.ab */
/* compiled from: PG */
public final class C135130ab implements C134283o {

    /* renamed from: a */
    public static final C59071e f368049a = C59071e.m91331h();

    /* renamed from: b */
    public final C60950i f368050b;

    /* renamed from: c */
    public final long f368051c;

    /* renamed from: d */
    public final Executor f368052d;

    /* renamed from: e */
    public final C42876ab f368053e;

    /* renamed from: f */
    public final Duration f368054f;

    /* renamed from: g */
    public final C39143kr f368055g;

    /* renamed from: h */
    private final C71422aw f368056h;

    /* renamed from: i */
    private final C42850e f368057i;

    /* renamed from: j */
    private final C69585o f368058j;

    public C135130ab(C71422aw awVar, C42850e eVar, C60950i iVar, long j, C69585o oVar, Executor executor, C42876ab abVar, C62910ar arVar, C39143kr krVar) {
        C69664n.m101061g(awVar, "scope");
        C69664n.m101061g(eVar, "feedDatabase");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(abVar, "dataStore");
        C69664n.m101061g(krVar, "clientStreamz");
        this.f368056h = awVar;
        this.f368057i = eVar;
        this.f368050b = iVar;
        this.f368051c = j;
        this.f368058j = oVar;
        this.f368052d = executor;
        this.f368053e = abVar;
        this.f368055g = krVar;
        this.f368054f = C62949a.m95468c(arVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo111527a() {
        return C134281m.m217855a(this);
    }

    /* renamed from: b */
    public final Object mo112130b(C135202v vVar, C69577g gVar) {
        C60870cx a = this.f368057i.mo45937a(new C135129aa(vVar, this));
        C69664n.m101060f(a, "suspend fun <T> modifySu…db)) }\n      .await()\n  }");
        return C71663i.m104690c(a, gVar);
    }

    /* renamed from: c */
    public final Object mo111529c(C69577g gVar) {
        return C71803m.m105040a(this.f368058j, new C135206z(this, (C69577g) null), gVar);
    }

    /* renamed from: d */
    public final C71422aw mo111530d() {
        return this.f368056h;
    }
}
