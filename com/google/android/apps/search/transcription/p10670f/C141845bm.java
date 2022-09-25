package com.google.android.apps.search.transcription.p10670f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.transcription.p10666b.C141746e;
import com.google.android.apps.search.transcription.p10668d.C141764a;
import com.google.android.apps.search.transcription.p10670f.p10674c.C141856a;
import com.google.android.apps.search.transcription.p10670f.p10674c.C141857b;
import com.google.android.libraries.assistant.soda.C19390z;
import com.google.android.libraries.assistant.soda.p1605d.C19273k;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.speech.context.p5201a.C66485h;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.function.Supplier;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.transcription.f.bm */
/* compiled from: PG */
public final class C141845bm implements C141847bo {

    /* renamed from: a */
    public static final C59071e f384915a = C59071e.m91332i("com.google.android.apps.search.transcription.f.bm");

    /* renamed from: b */
    public final C60888db f384916b;

    /* renamed from: c */
    public final C19390z f384917c;

    /* renamed from: d */
    public final C19273k f384918d;

    /* renamed from: e */
    public final C58833ax f384919e;

    /* renamed from: f */
    public final C47770dh f384920f;

    /* renamed from: g */
    public final C62910ar f384921g;

    /* renamed from: h */
    public final C66485h f384922h;

    /* renamed from: i */
    public final C141851bs f384923i;

    /* renamed from: j */
    public final C141848bp f384924j;

    /* renamed from: k */
    public final Set f384925k;

    /* renamed from: l */
    public final C58833ax f384926l;

    /* renamed from: m */
    public final C58833ax f384927m;

    /* renamed from: n */
    public final C58833ax f384928n;

    /* renamed from: o */
    public final C141852bt f384929o;

    /* renamed from: p */
    public final C141787af f384930p;

    /* renamed from: q */
    public final AtomicBoolean f384931q = new AtomicBoolean(false);

    /* renamed from: r */
    public C60870cx f384932r;

    /* renamed from: s */
    public final C141857b f384933s;

    /* renamed from: t */
    private final C60888db f384934t;

    public C141845bm(C141764a aVar, C141857b bVar, C60888db dbVar, C60888db dbVar2, C19390z zVar, C19273k kVar, C58833ax axVar, C47770dh dhVar, Map map, Map map2, C58833ax axVar2, C58833ax axVar3, C141852bt btVar, C141851bs bsVar, C141848bp bpVar, C141787af afVar) {
        Set set;
        this.f384921g = aVar.f384735c;
        this.f384922h = C66485h.f180782d;
        this.f384933s = bVar;
        this.f384934t = dbVar;
        this.f384916b = dbVar2;
        this.f384917c = zVar;
        this.f384918d = kVar;
        this.f384919e = axVar;
        this.f384920f = dhVar;
        String str = "smart_dictation";
        if (bsVar.mo116833o() || bsVar.mo116831m().equals(str)) {
            set = (C58528ij) Collection.EL.stream(map.values()).map(C141837be.f384907a).collect(C58370cn.f155947b);
        } else {
            set = C58733pz.f156496a;
        }
        this.f384925k = set;
        Map map3 = map2;
        this.f384926l = C58833ax.m90833j((C69464a) map2.get(!bsVar.mo116831m().equals(str) ? bsVar.mo116833o() ? "ANDROID_SPEECH_API" : BuildConfig.FLAVOR : str)).mo56106b(C141836bd.f384906a);
        this.f384927m = axVar2;
        this.f384928n = axVar3;
        this.f384929o = btVar;
        this.f384923i = bsVar;
        this.f384924j = bpVar;
        this.f384930p = afVar;
    }

    /* renamed from: a */
    public final void mo116736a() {
        ((C59052c) ((C59052c) f384915a.mo56224b()).mo56372aa(41912)).mo56386p("Offline recognizer - stop detection");
        if (this.f384931q.compareAndSet(false, true)) {
            this.f384924j.mo116728b(new C141746e());
            C60870cx cxVar = this.f384932r;
            if (cxVar != null) {
                C141840bh bhVar = new C141840bh();
                C60856cj.m92911t(cxVar, C47810es.m84974n(bhVar), this.f384934t);
            }
        }
    }

    /* renamed from: c */
    public final void mo116738c(Supplier supplier, int i, int i2) {
        C59071e eVar = f384915a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41913)).mo56386p("Offline recognizer - start listening");
        if (this.f384932r != null) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41915)).mo56386p("Recognizer already starts listening.");
            return;
        }
        String l = this.f384923i.mo116830l();
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(41914)).mo56389s("Initialize Soda [locale: %s]", l);
        C141857b bVar = this.f384933s;
        C60870cx b = bVar.f384953b.mo19399b(C47810es.m84978r(new C141856a(bVar, l)));
        C141834bb bbVar = new C141834bb(this);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(bbVar), this.f384934t);
        this.f384932r = h;
        C141839bg bgVar = new C141839bg(this, i, i2, supplier);
        C60856cj.m92911t(h, C47810es.m84974n(bgVar), this.f384934t);
    }
}
