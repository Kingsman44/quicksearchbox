package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.nga.api.bh;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89640k;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95373bx;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95838j;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.android.p10712d.C142362cn;
import com.google.android.p10712d.C142383dh;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.ai */
/* compiled from: PG */
public final class C95038ai implements C95029a, C95046i {

    /* renamed from: a */
    public static final C59071e f265878a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.a.ai");

    /* renamed from: b */
    static final long f265879b = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: c */
    public final bh f265880c;

    /* renamed from: d */
    public final C95065ab f265881d;

    /* renamed from: e */
    public final C22871g f265882e;

    /* renamed from: f */
    public final C95373bx f265883f;

    /* renamed from: g */
    public Optional f265884g = Optional.empty();

    /* renamed from: h */
    public C95034ae f265885h;

    /* renamed from: i */
    public C37336c f265886i;

    /* renamed from: j */
    public C95047j f265887j;

    /* renamed from: k */
    private final C95039b f265888k;

    /* renamed from: l */
    private final C95053p f265889l;

    /* renamed from: m */
    private final C95063z f265890m;

    /* renamed from: n */
    private final C58495hd f265891n;

    public C95038ai(bh bhVar, C95039b bVar, C95065ab abVar, C95373bx bxVar, C95053p pVar, C95063z zVar, C22871g gVar, C95850a aVar) {
        this.f265880c = bhVar;
        this.f265888k = bVar;
        this.f265881d = abVar;
        this.f265889l = pVar;
        this.f265890m = zVar;
        this.f265882e = gVar;
        this.f265883f = bxVar;
        C95032ac acVar = new C95032ac(this);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("CLOSED", acVar);
        gzVar.mo55429h("OPENING", new C95035af(this));
        gzVar.mo55429h("CACHING", new C95031ab(this));
        gzVar.mo55429h("ACTIVE", new C95030aa(this));
        gzVar.mo55429h("CLOSING", new C95033ad(this));
        this.f265891n = gzVar.mo55427f(false);
        bVar.mo88959g(this);
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
        this.f265885h = acVar;
    }

    /* renamed from: f */
    public static C37336c m156960f(C37335b bVar) {
        C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
        C37519dz dzVar = C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE;
        eaVar.copyOnWrite();
        C37561eb ebVar = (C37561eb) eaVar.instance;
        ebVar.f99803b = Integer.valueOf(dzVar.f99687U);
        ebVar.f99802a = 2;
        return new C37334a(bVar, C37360ay.f99224l, C60856cj.m92900i((C37561eb) eaVar.build()));
    }

    /* renamed from: g */
    public static C37336c m156961g(C37335b bVar) {
        C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
        C37563ed edVar = C37563ed.OPENED;
        eaVar.copyOnWrite();
        C37561eb ebVar = (C37561eb) eaVar.instance;
        ebVar.f99803b = Integer.valueOf(edVar.f99809d);
        ebVar.f99802a = 1;
        return new C37334a(bVar, C37360ay.f99224l, C60856cj.m92900i((C37561eb) eaVar.build()));
    }

    /* renamed from: a */
    public final void mo88946a(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        this.f265885h.mo88946a(bArr);
    }

    /* renamed from: b */
    public final void mo88947b(C142383dh dhVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f265885h.mo88947b(dhVar);
    }

    /* renamed from: c */
    public final C37336c mo88881c(boolean z) {
        C59104x b = f265878a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) b).mo56372aa(18158)).mo56389s("createWriteableAudioBufferData. shouldOpenMic=%b", Boolean.valueOf(z));
        return this.f265885h.mo88949c(z);
    }

    public final void close() {
        this.f265888k.mo88959g((C95029a) null);
    }

    /* renamed from: d */
    public final C60870cx mo88883d(boolean z) {
        C59104x b = f265878a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) b).mo56372aa(18159)).mo56389s("closeAudioStream. shouldCloseMic = %b", Boolean.valueOf(z));
        return this.f265885h.mo88950d(z);
    }

    /* renamed from: e */
    public final void mo88948e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f265885h.mo88948e();
    }

    /* renamed from: h */
    public final void mo88887h(C95838j jVar) {
        this.f265884g = Optional.m71637of(jVar);
    }

    /* renamed from: i */
    public final void mo88956i(String str) {
        C59104x b = f265878a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) b).mo56372aa(18160)).mo56354G("Moving from %s to %s", this.f265885h.mo88951f(), str);
        this.f265885h.mo88954h();
        C95034ae aeVar = (C95034ae) this.f265891n.get(str);
        aeVar.getClass();
        this.f265885h = aeVar;
        aeVar.mo88953iu();
    }

    /* renamed from: j */
    public final void mo88957j(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        C95047j jVar = this.f265887j;
        if (jVar != null) {
            jVar.mo88964d(bArr);
            return;
        }
        C59104x c = f265878a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) c).mo56372aa(18165)).mo56389s("onVoiceData with null decoder in %s.", this.f265885h.mo88951f());
    }

    /* renamed from: k */
    public final void mo88958k(C142383dh dhVar, C37335b bVar) {
        if (this.f265887j == null) {
            int a = C142362cn.m231067a(dhVar.f386358c);
            if (a != 0) {
                int i = 1;
                if (a != 1) {
                    if (a != 2) {
                        C59104x c = f265878a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
                        C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(18166);
                        int a2 = C142362cn.m231067a(dhVar.f386358c);
                        if (a2 != 0) {
                            i = a2;
                        }
                        cVar.mo56387q("Unsupported codec: %s; using direct decoder", i);
                        this.f265887j = this.f265889l.mo88983a(bVar);
                        return;
                    }
                    C95063z zVar = this.f265890m;
                    C95055r rVar = (C95055r) zVar.f265950a.mo17428b();
                    rVar.getClass();
                    C60888db dbVar = (C60888db) zVar.f265951b.mo17428b();
                    dbVar.getClass();
                    C60888db dbVar2 = (C60888db) zVar.f265952c.mo17428b();
                    dbVar2.getClass();
                    Executor executor = (Executor) zVar.f265953d.mo17428b();
                    executor.getClass();
                    C89640k kVar = (C89640k) zVar.f265954e.mo17428b();
                    kVar.getClass();
                    bVar.getClass();
                    dhVar.getClass();
                    this.f265887j = new C95062y(rVar, dbVar, dbVar2, executor, kVar, bVar, dhVar);
                    return;
                }
            }
            this.f265887j = this.f265889l.mo88983a(bVar);
        }
    }
}
