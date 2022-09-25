package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ay.p;
import com.google.android.apps.gsa.nga.engine.b.c.a;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.p5970d.C75156a;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77551ad;
import com.google.android.apps.gsa.nga.engine.recognition.C77552ae;
import com.google.android.apps.gsa.nga.engine.recognition.C77556ai;
import com.google.android.apps.gsa.nga.engine.recognition.C77564aq;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.engine.recognition.C77731k;
import com.google.android.apps.gsa.nga.engine.recognition.C77830m;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.engine.recognition.p6111d.C77616b;
import com.google.android.apps.gsa.nga.engine.recognition.p6123j.C77730c;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77737e;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.C67091ks;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.ay */
/* compiled from: PG */
public final class C77701ay implements C77564aq, C77730c {

    /* renamed from: a */
    public static final C58974d f214029a = C58974d.m91136j();

    /* renamed from: b */
    public final C77616b f214030b;

    /* renamed from: c */
    public C77687ak f214031c;

    /* renamed from: d */
    private final C22871g f214032d;

    /* renamed from: e */
    private final C77691ao f214033e;

    /* renamed from: f */
    private final C77732a f214034f;

    /* renamed from: g */
    private final C76092h f214035g;

    /* renamed from: h */
    private final C91142g f214036h;

    /* renamed from: i */
    private final C80642f f214037i;

    /* renamed from: j */
    private final C75050a f214038j;

    /* renamed from: k */
    private final C77700ax f214039k = new C77700ax(this);

    public C77701ay(C22871g gVar, C77691ao aoVar, C77616b bVar, C77732a aVar, C76092h hVar, C91142g gVar2, C80642f fVar, C75050a aVar2) {
        this.f214032d = gVar;
        this.f214033e = aoVar;
        this.f214030b = bVar;
        this.f214034f = aVar;
        this.f214035g = hVar;
        this.f214036h = gVar2;
        this.f214037i = fVar;
        this.f214038j = aVar2;
    }

    /* renamed from: a */
    public final void mo72673a(ac acVar) {
        if (!mo72674b()) {
            ((C58970a) ((C58970a) f214029a.mo56226d()).mo56372aa(4406)).mo56386p("Not closing audio session because manual endpointing is not allowed");
            return;
        }
        this.f214034f.mo72788c(C89849ae.NGA_SPEECH_HANDLER_MANUAL_ENDPOINT, C77889u.S3);
        this.f214032d.mo28212l("[NGA] S3 Manual Endpoint", new C77697au(this, acVar));
    }

    /* renamed from: b */
    public final boolean mo72674b() {
        if (this.f214035g.mo72021b().mo72042g() || !this.f214036h.mo85405j(C90126fx.f250999aY)) {
            return this.f214037i.mo74384j(this.f214038j.mo71417a().mo71465k());
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo72675c(C77566as asVar, C79856d dVar) {
        this.f214034f.mo72788c(C89849ae.NGA_SPEECH_HANDLER_RESET, C77889u.S3);
        this.f214032d.mo28212l("[NGA] S3 Reset", new C77698av(this, asVar, dVar));
        return true;
    }

    /* renamed from: d */
    public final boolean mo72676d(C77566as asVar, C79856d dVar) {
        this.f214034f.mo72788c(C89849ae.NGA_SPEECH_HANDLER_RESUME, C77889u.S3);
        this.f214032d.mo28212l("[NGA] S3 Start", new C77696at(this, asVar, dVar));
        return true;
    }

    /* renamed from: e */
    public final boolean mo72677e() {
        this.f214034f.mo72788c(C89849ae.NGA_SPEECH_HANDLER_PAUSE, C77889u.S3);
        this.f214032d.mo28212l("[NGA] S3 Stop", new C77695as(this));
        return true;
    }

    /* renamed from: f */
    public final C60870cx mo72779f() {
        return this.f214032d.mo28201a("[NGA] S3 Get Current", new C77699aw(this));
    }

    /* renamed from: g */
    public final void mo72780g() {
        C59081b.m91349a(C58979ad.MEDIUM, "stack size");
        C77687ak akVar = this.f214031c;
        this.f214031c = null;
        if (akVar != null) {
            ((C58970a) ((C58970a) f214029a.mo56224b()).mo56372aa(4402)).mo56389s("Stopping S3 session with utterance id %s", akVar.f213977e.f218924a.c());
            synchronized (akVar.f213975c) {
                akVar.mo72776a();
                C77737e eVar = akVar.f213990r;
                if (eVar != null) {
                    eVar.mo72800a();
                    akVar.f213990r = null;
                }
                akVar.f213989q = true;
                akVar.f213992t.f213972a = null;
            }
            akVar.f213986n.mo72772a();
        }
    }

    /* renamed from: h */
    public final boolean mo72781h(C77566as asVar, C79856d dVar) {
        C60870cx cxVar;
        C59081b.m91349a(C58979ad.MEDIUM, "stack size");
        if (this.f214031c != null) {
            return false;
        }
        C58970a aVar = (C58970a) ((C58970a) f214029a.mo56224b()).mo56372aa(4408);
        int m = asVar.mo72690m();
        String a = C77568au.m124486a(m);
        if (m != 0) {
            aVar.mo56354G("Starting S3 session %s with utterance id %s", a, dVar.f218924a.c());
            C77691ao aoVar = this.f214033e;
            C77700ax axVar = this.f214039k;
            asVar.getClass();
            axVar.getClass();
            C22871g gVar = (C22871g) aoVar.f214004a.mo17428b();
            gVar.getClass();
            C22871g gVar2 = (C22871g) aoVar.f214005b.mo17428b();
            gVar2.getClass();
            C22871g gVar3 = (C22871g) aoVar.f214006c.mo17428b();
            gVar3.getClass();
            C81465n nVar = (C81465n) aoVar.f214007d.mo17428b();
            nVar.getClass();
            C77616b bVar = (C77616b) aoVar.f214008e.mo17428b();
            bVar.getClass();
            C77721s sVar = (C77721s) aoVar.f214009f.mo17428b();
            sVar.getClass();
            p pVar = (p) aoVar.f214010g.mo17428b();
            pVar.getClass();
            C75156a aVar2 = (C75156a) aoVar.f214011h.mo17428b();
            aVar2.getClass();
            C77693aq aqVar = (C77693aq) aoVar.f214012i.mo17428b();
            aqVar.getClass();
            C77678ab abVar = (C77678ab) aoVar.f214013j.mo17428b();
            abVar.getClass();
            C77689am amVar = (C77689am) aoVar.f214014k.mo17428b();
            amVar.getClass();
            C77687ak akVar = new C77687ak(asVar, axVar, dVar, gVar, gVar2, gVar3, nVar, bVar, sVar, pVar, aVar2, aqVar, abVar, amVar);
            this.f214031c = akVar;
            C77566as asVar2 = akVar.f213976d;
            akVar.f213977e.f218924a.c();
            if (akVar.f213991s != null) {
                ((C58970a) ((C58970a) C77687ak.f213973a.mo56226d()).mo56372aa(4395)).mo56386p("Mic already opened running");
                if (akVar.f213976d.mo72698w()) {
                    akVar.f213981i.mo72746b(akVar.f213976d);
                }
            } else {
                akVar.f213991s = akVar.f213987o.mo72777a();
                akVar.f213980h.mo28211k(akVar.f213991s, "[NGA] audio capture callback", new C77685ai(akVar));
            }
            C77678ab abVar2 = akVar.f213986n;
            long d = abVar2.f213961b.mo85399d(C90126fx.f251672nI);
            if (abVar2.f213964e != null) {
                ((C58970a) ((C58970a) C77678ab.f213960a.mo56226d()).mo56372aa(4384)).mo56386p("Network timeout future already set.");
            } else if (d > 0) {
                C22871g gVar4 = abVar2.f213962c;
                C81457f fVar = abVar2.f213963d;
                Objects.requireNonNull(fVar);
                abVar2.f213964e = gVar4.mo28208h("[NGA] S3NetworkTimeoutFuture.start", d, new C77728z(fVar));
            }
            if (akVar.f213976d.mo72698w() && akVar.f213991s != null && ((Boolean) akVar.f213976d.mo72693r().get()).booleanValue() && (cxVar = akVar.f213991s) != null) {
                p pVar2 = akVar.f213983k;
                Objects.requireNonNull(pVar2);
                cxVar.mo4106b(new C77680ad(pVar2), new C77681ae(akVar));
            }
            if (akVar.f213976d.mo72682e().isPresent()) {
                akVar.f213984l.mo71505c((HotwordResult) akVar.f213976d.mo72682e().get());
            }
            C77720r rVar = akVar.f213982j;
            long j = rVar.f214095m;
            rVar.f214095m = 1 + j;
            String valueOf = String.valueOf(j);
            a a2 = rVar.f214087e.mo74269a();
            C77731k kVar = new C77731k();
            kVar.f214124a = BuildConfig.FLAVOR;
            kVar.mo72608f(C77551ad.S3);
            C77552ae a3 = kVar.mo72603a();
            C77830m mVar = new C77830m();
            mVar.mo72625c(C77889u.S3);
            mVar.f214385d = a2;
            mVar.mo72630h(rVar.f214085c.mo57444a());
            mVar.mo72629g(true);
            mVar.mo72636n();
            mVar.mo72626d(C77556ai.PARTIAL);
            mVar.f214382a = C58485gu.m89842j(C58485gu.m89846n(a3));
            mVar.mo72633k(rVar.f214084b.mo72853a(a2.a.c(), C77889u.S3, C67091ks.f182386h));
            rVar.f214086d.mo72602c(mVar.mo72623a(), valueOf);
            return true;
        }
        throw null;
    }
}
