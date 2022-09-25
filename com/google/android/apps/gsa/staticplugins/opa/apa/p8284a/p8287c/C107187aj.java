package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.shared.p6983ah.C89145b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17311g;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17312h;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17313i;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17316l;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17317m;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17318n;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17319o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.p1879c.C22867c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34829c;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a.C63126b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a.C63127c;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.aj */
/* compiled from: PG */
final class C107187aj implements C70862aj, C2391v {

    /* renamed from: a */
    public static final C59071e f298341a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.apa.a.c.aj");

    /* renamed from: b */
    public final C22871g f298342b;

    /* renamed from: c */
    public final C89145b f298343c;

    /* renamed from: d */
    public final C2393x f298344d = new C2393x(this);

    /* renamed from: e */
    public final C83357g f298345e = new C83361k(C88079oj.UNKNOWN, C22867c.class);

    /* renamed from: f */
    public final C60870cx f298346f;

    /* renamed from: g */
    private final C70862aj f298347g;

    /* renamed from: h */
    private final Context f298348h;

    /* renamed from: i */
    private final Query f298349i;

    /* renamed from: j */
    private final C22871g f298350j;

    /* renamed from: k */
    private final C87568k f298351k;

    /* renamed from: l */
    private final C21370a f298352l;

    /* renamed from: m */
    private final C58881cr f298353m;

    /* renamed from: n */
    private final C57987f f298354n;

    /* renamed from: o */
    private final AtomicBoolean f298355o;

    /* renamed from: p */
    private boolean f298356p;

    /* renamed from: q */
    private final C107192e f298357q;

    public C107187aj(C70862aj ajVar, Context context, Query query, C22871g gVar, C22871g gVar2, C87568k kVar, C89145b bVar, C107192e eVar, C21370a aVar, C58881cr crVar) {
        C57987f fVar = new C57987f();
        this.f298354n = fVar;
        this.f298346f = fVar.f155055e.mo20440jJ(new C107186ai());
        this.f298355o = new AtomicBoolean();
        this.f298356p = false;
        this.f298347g = ajVar;
        this.f298348h = context;
        this.f298350j = gVar2;
        this.f298351k = kVar;
        this.f298349i = query;
        this.f298342b = gVar;
        this.f298343c = bVar;
        this.f298357q = eVar;
        this.f298352l = aVar;
        this.f298353m = crVar;
        gVar2.mo28212l("OpaHandoverService: on StreamingHandoverController created", new C107183af(this));
    }

    /* renamed from: d */
    public static Throwable m177924d(Status status, C63126b bVar) {
        return new StatusException(status, C34829c.m63593b(C63127c.f170471a, bVar));
    }

    /* renamed from: a */
    public final void mo20121a() {
        if (!this.f298356p) {
            mo95820e(m177924d(Status.f186912j, C63126b.MISSING_METADATA));
        }
        this.f298354n.f155056f.mo54589f(true);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f298341a.mo56226d()).mo56382g(th)).mo56372aa(23531)).mo56386p("#onError");
        mo95820e(Status.m102100d(th).asException());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C17311g gVar;
        C66611ci ciVar;
        C17313i iVar = (C17313i) obj;
        C17312h hVar = C17312h.METADATA;
        int ordinal = C17312h.m34531a(iVar.f50143a).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (!this.f298356p) {
                    ((C59052c) ((C59052c) f298341a.mo56226d()).mo56372aa(23537)).mo56386p("S3Response received without leading metadata");
                }
                C57987f fVar = this.f298354n;
                if (iVar.f50143a == 2) {
                    ciVar = (C66611ci) iVar.f50144b;
                } else {
                    ciVar = C66611ci.f181206g;
                }
                fVar.f155056f.mo54591h(ciVar);
                return;
            }
            throw new AssertionError(C17312h.m34531a(iVar.f50143a));
        } else if (this.f298356p) {
            mo95820e(m177924d(Status.f186912j, C63126b.REPEATED_METADATA));
        } else {
            this.f298356p = true;
            mo95821f(3);
            if (iVar.f50143a == 1) {
                gVar = (C17311g) iVar.f50144b;
            } else {
                gVar = C17311g.f50134b;
            }
            long j = gVar.f50136a;
            C90875ai.m148465b(C107209v.f298400a, this.f298346f, this.f298342b, "StreamingHandoverController: waiting for S3Responses to end").mo85223a(new C107213z(this));
            Optional.ofNullable((C107191d) this.f298357q.f298369a.getAndSet(new C107195h(j, this.f298354n, new C107178aa(this)))).map(C107177a.f298331a).ifPresent(C107179ab.f298333a);
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.opa.extra.HANDOVER_FROM_APA", true);
            Query aH = this.f298349i.mo84245H(1, true, (QueryTriggerType) null).mo84307as(bundle).mo84271aH(j);
            boolean booleanValue = ((Boolean) this.f298353m.mo6453a()).booleanValue();
            C87565h hVar2 = new C87565h();
            hVar2.f236565k = aH;
            hVar2.f236537ah = booleanValue;
            hVar2.f236508L = true;
            hVar2.f236560f = 4;
            hVar2.f236512P = 268468224;
            this.f298350j.mo28212l("OpaHandoverService: register lifecycle observer", new C107210w(this));
            C83357g gVar2 = this.f298345e;
            C88079oj ojVar = C88079oj.RESUMED;
            Objects.requireNonNull(ojVar);
            C90875ai.m148465b(new C107181ad(this), C90877ak.m148471e(C83349aj.m132646a(gVar2, new C107180ac(ojVar)), 5, TimeUnit.SECONDS, this.f298342b), this.f298342b, "StreamingHandoverController: waiting for OPA to resume").mo85223a(new C107182ae(this));
            this.f298351k.mo81688b(this.f298348h, hVar2.mo81685a());
        }
    }

    /* renamed from: e */
    public final void mo95820e(Throwable th) {
        if (this.f298355o.compareAndSet(false, true)) {
            if (th == null) {
                this.f298347g.mo20121a();
            } else {
                ((C59052c) ((C59052c) ((C59052c) f298341a.mo56226d()).mo56382g(th)).mo56372aa(23532)).mo56386p("#onHandoverEnd: failed");
                this.f298354n.f155056f.mo54590g(th);
                this.f298347g.mo20122b(th);
            }
            this.f298350j.mo28212l("OpaHandoverService: unregister lifecycle observer", new C107211x(this));
        }
    }

    /* renamed from: f */
    public final void mo95821f(int i) {
        C62910ar l = C62948a.m95461l(this.f298352l.mo26872d());
        C70862aj ajVar = this.f298347g;
        C17316l lVar = (C17316l) C17317m.f50147c.createBuilder();
        C17318n nVar = (C17318n) C17319o.f50151c.createBuilder();
        nVar.copyOnWrite();
        ((C17319o) nVar.instance).f50153a = i - 2;
        nVar.copyOnWrite();
        l.getClass();
        ((C17319o) nVar.instance).f50154b = l;
        lVar.copyOnWrite();
        C17317m mVar = (C17317m) lVar.instance;
        C17319o oVar = (C17319o) nVar.build();
        oVar.getClass();
        mVar.f50150b = oVar;
        mVar.f50149a = 1;
        ajVar.mo20123c((C17317m) lVar.build());
    }

    public final C2384o getLifecycle() {
        return this.f298344d;
    }
}
