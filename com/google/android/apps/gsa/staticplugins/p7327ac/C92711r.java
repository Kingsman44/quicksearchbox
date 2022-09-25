package com.google.android.apps.gsa.staticplugins.p7327ac;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86111g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.state.p6872d.C86965q;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90007bm;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.silentfeedback.C92013f;
import com.google.android.apps.gsa.silentfeedback.C92014g;
import com.google.android.apps.gsa.silentfeedback.C92015h;
import com.google.android.apps.gsa.silentfeedback.C92016i;
import com.google.android.apps.gsa.silentfeedback.C92017j;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21532b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21530c;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21708a;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21711d;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21712e;
import com.google.android.libraries.gcoreclient.p1803w.p1804a.C21719l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.r */
/* compiled from: PG */
public final class C92711r {

    /* renamed from: a */
    public static final C59071e f258789a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ac.r");

    /* renamed from: b */
    public static final String[] f258790b = {"ANDROID_GSA", "ANDROID_GSA_ANDROID_PRIMES", "ANDROID_GSA_COUNTERS", "ANDROID_GSA_HIGH_PRIORITY_EVENTS", "CHIME", "CLIENT_LOGGING_PROD", "CRONET_ANDROID_GSA", "FEDASS_COUNTERS", "FEDASS_LOGS", "ONEGOOGLE_MOBILE", "SHERLOG", "SILK_NATIVE", "STREAMZ_ANDROID_ASSISTANT", "STREAMZ_ANDROID_GSA", "STREAMZ_LENS_ANDROID", "STREAMZ_NGA", "OPA_TV", "OPA_TV_ANDROID_PRIMES"};

    /* renamed from: c */
    public final Context f258791c;

    /* renamed from: d */
    public final C22871g f258792d;

    /* renamed from: e */
    public final C22871g f258793e;

    /* renamed from: f */
    public final C68214a f258794f;

    /* renamed from: g */
    public final C68214a f258795g;

    /* renamed from: h */
    public final C68214a f258796h;

    /* renamed from: i */
    private final C86124t f258797i;

    /* renamed from: j */
    private final C86338r f258798j;

    /* renamed from: k */
    private final C86054o f258799k;

    /* renamed from: l */
    private final C68214a f258800l;

    /* renamed from: m */
    private final C68214a f258801m;

    /* renamed from: n */
    private final Object f258802n = new Object();

    /* renamed from: o */
    private C21711d f258803o;

    public C92711r(Context context, C86124t tVar, C86338r rVar, C22871g gVar, C22871g gVar2, C86054o oVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f258791c = context;
        this.f258797i = tVar;
        this.f258798j = rVar;
        this.f258792d = gVar;
        this.f258793e = gVar2;
        this.f258799k = oVar;
        this.f258794f = aVar;
        this.f258795g = aVar2;
        this.f258800l = aVar3;
        this.f258801m = aVar4;
        this.f258796h = aVar5;
    }

    /* renamed from: a */
    public final String mo87443a() {
        String F = this.f258799k.mo79659F();
        return F == null ? BuildConfig.FLAVOR : F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo87444b(C21708a aVar) {
        FileOutputStream openFileOutput;
        C90748e.m148224b();
        if (aVar != null && aVar.mo27073a() != null) {
            for (C21712e eVar : aVar.mo27073a()) {
                eVar.mo27075a();
                if (eVar.mo27075a().length > 0) {
                    C86111g a = C92013f.m151026a(aVar, ((C21370a) this.f258800l.mo27525b()).mo26871c());
                    C86337q b = this.f258798j.mo80076b();
                    b.mo80072g("gsa_config_last_commit_time", ((C21370a) this.f258800l.mo27525b()).mo26871c());
                    b.mo80073h("ph_server_token", a.f232748f);
                    b.apply();
                    C86124t tVar = this.f258797i;
                    tVar.mo79739j(tVar.mo79755u(a, tVar.mo79736f()), a);
                    Context context = this.f258791c;
                    C92016i iVar = (C92016i) C92017j.f256539d.createBuilder();
                    boolean e = this.f258797i.mo79746e(C90007bm.f246884c);
                    iVar.copyOnWrite();
                    C92017j jVar = (C92017j) iVar.instance;
                    jVar.f256541a |= 1;
                    jVar.f256542b = e;
                    long a2 = this.f258797i.mo79743a(C90007bm.f246885d);
                    iVar.copyOnWrite();
                    C92017j jVar2 = (C92017j) iVar.instance;
                    jVar2.f256541a |= 2;
                    jVar2.f256543c = a2;
                    C92017j jVar3 = (C92017j) iVar.build();
                    try {
                        openFileOutput = context.openFileOutput("current_configuration.bin", 0);
                        jVar3.writeTo(openFileOutput);
                        if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                    } catch (IOException | NullPointerException e2) {
                        C59104x d = C92015h.f256538a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "SilentFeedbackConfig");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(11959)).mo56386p("Couldn't write experiments for CrashloopReceiver");
                    } catch (Throwable th) {
                        C92014g.m151027a(th, th);
                    }
                    C92703j jVar4 = (C92703j) this.f258801m.mo27525b();
                    C22871g gVar = jVar4.f258778b;
                    C86965q qVar = jVar4.f258777a;
                    Objects.requireNonNull(qVar);
                    gVar.mo28212l("Notify state after committing configs.", new C92702i(qVar));
                    C21530c cVar = new C21530c(this.f258791c);
                    cVar.mo26980a((C21532b) this.f258796h.mo27525b());
                    C21529b h = cVar.mo26989h();
                    h.f59932a.mo119131f();
                    mo87445c();
                    C21551h hVar = (C21551h) C21711d.m40832a(h, aVar.f60026a.f393980a).mo26995b(60000, TimeUnit.MILLISECONDS);
                    h.f59932a.mo119132g();
                    if (hVar.mo27003f()) {
                        C89949q.m146523g(919);
                        return;
                    }
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 918;
                    C59752ei eiVar = (C59752ei) C59753ej.f161449e.createBuilder();
                    int a3 = hVar.mo26998a();
                    eiVar.copyOnWrite();
                    C59753ej ejVar = (C59753ej) eiVar.instance;
                    ejVar.f161451a |= 1;
                    ejVar.f161452b = a3;
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    C59753ej ejVar2 = (C59753ej) eiVar.build();
                    ejVar2.getClass();
                    ufVar2.f164076J = ejVar2;
                    ufVar2.f164146b |= 8192;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    ((C59052c) ((C59052c) f258789a.mo56225c()).mo56372aa(19024)).mo56352E("Failed to commit flags to Phenotype. %s (%s)", hVar.mo27000d(), hVar.mo26998a());
                    return;
                }
            }
            return;
        }
        return;
        throw th;
    }

    /* renamed from: c */
    public final C21711d mo87445c() {
        C21711d dVar;
        synchronized (this.f258802n) {
            if (this.f258803o == null) {
                this.f258803o = new C21719l();
            }
            dVar = this.f258803o;
        }
        return dVar;
    }
}
