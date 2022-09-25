package com.google.android.apps.search.googleapp.amp.silk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139322d;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139323e;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139325g;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139338t;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139340v;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139341w;
import com.google.android.apps.search.googleapp.urlhandler.C139786b;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.apps.search.googleapp.urlhandler.p10531c.C139792b;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.base.C58851bo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4242bp.p4253e.p4254a.C56194n;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56612d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56616h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56620l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63042fg;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SilkAmpApiImplOpenHelperFragmentPeer {

    /* renamed from: a */
    public static final C59071e f363665a = C59071e.m91332i("com.google.android.apps.search.googleapp.amp.silk.SilkAmpApiImplOpenHelperFragmentPeer");

    /* renamed from: b */
    public final Context f363666b;

    /* renamed from: c */
    public final C139338t f363667c;

    /* renamed from: d */
    public final AccountId f363668d;

    /* renamed from: e */
    public final C133482r f363669e;

    /* renamed from: f */
    public final C139792b f363670f;

    /* renamed from: g */
    public final C133475k f363671g;

    /* renamed from: h */
    public final C46439e f363672h;

    /* renamed from: i */
    public final C39141kp f363673i;

    /* renamed from: j */
    public final C46440f f363674j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            C133464xc5f34d63 loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput = (C133464xc5f34d63) obj;
            ((C59052c) ((C59052c) ((C59052c) SilkAmpApiImplOpenHelperFragmentPeer.f363665a.mo56225c()).mo56382g(th)).mo56372aa(40056)).mo56386p("failed to load shouldShowPagesInEmbeddedBrowser");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            C133464xc5f34d63 loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput = (C133464xc5f34d63) obj;
            if (((Boolean) obj2).booleanValue()) {
                SilkAmpApiImplOpenHelperFragmentPeer a = SilkAmpApiImplOpenHelperFragmentPeer.this.f363671g.mo17754z();
                C56616h e = loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111178e();
                int d = loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111170d();
                String c = loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111169c();
                Instant f = loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111179f();
                C133482r rVar = a.f363669e;
                C56612d dVar = e.f151166b;
                if (dVar == null) {
                    dVar = C56612d.f151152f;
                }
                C139323e eVar = (C139323e) C139324f.f378925k.createBuilder();
                Stream stream = Collection.EL.stream(dVar.f151154a);
                Objects.requireNonNull(eVar);
                stream.forEach(new C133481q(eVar));
                if ((e.f151165a & 2) != 0) {
                    C60214n nVar = e.f151167c;
                    if (nVar == null) {
                        nVar = C60214n.f162914g;
                    }
                    eVar.copyOnWrite();
                    C139324f fVar = (C139324f) eVar.instance;
                    nVar.getClass();
                    fVar.f378930d = nVar;
                    fVar.f378927a |= 2;
                }
                if (d != 0) {
                    if (d == 2) {
                        boolean z = rVar.f363716a;
                        eVar.copyOnWrite();
                        C139324f fVar2 = (C139324f) eVar.instance;
                        fVar2.f378927a |= 64;
                        fVar2.f378935i = z;
                    }
                    long j = dVar.f151156c;
                    eVar.copyOnWrite();
                    C139324f fVar3 = (C139324f) eVar.instance;
                    fVar3.f378927a |= 1;
                    fVar3.f378929c = (int) j;
                    int a2 = C56194n.m87920a(dVar.f151158e);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    eVar.copyOnWrite();
                    C139324f fVar4 = (C139324f) eVar.instance;
                    fVar4.f378932f = a2 - 1;
                    fVar4.f378927a |= 8;
                    C56620l lVar = dVar.f151157d;
                    if (lVar == null) {
                        lVar = C56620l.f151173c;
                    }
                    C139325g gVar = (C139325g) C139326h.f378938c.createBuilder();
                    if ((lVar.f151175a & 1) != 0) {
                        boolean z2 = lVar.f151176b;
                        gVar.copyOnWrite();
                        C139326h hVar = (C139326h) gVar.instance;
                        hVar.f378940a |= 1;
                        hVar.f378941b = z2;
                    }
                    C139326h hVar2 = (C139326h) gVar.build();
                    eVar.copyOnWrite();
                    C139324f fVar5 = (C139324f) eVar.instance;
                    hVar2.getClass();
                    fVar5.f378933g = hVar2;
                    fVar5.f378927a |= 16;
                    eVar.copyOnWrite();
                    C139324f fVar6 = (C139324f) eVar.instance;
                    fVar6.f378927a |= 32;
                    fVar6.f378934h = true;
                    C139324f fVar7 = (C139324f) eVar.build();
                    if (d == 2 && (fVar7.f378927a & 2) == 0) {
                        ((C19567d) a.f363673i.f102975d.mo6453a()).mo24822a(1, C133465a.m216642a(2));
                        d = 2;
                    }
                    try {
                        C139341w wVar = a.f363675k;
                        C56612d dVar2 = e.f151166b;
                        if (dVar2 == null) {
                            dVar2 = C56612d.f151152f;
                        }
                        C56610b bVar = (C56610b) dVar2.f151154a.get(0);
                        C69664n.m101061g(bVar, "ampDocument");
                        C56610b bVar2 = wVar.f378960a;
                        if (bVar2 != null && C69664n.m101066l(bVar2.f151143b, bVar.f151143b)) {
                            C139341w wVar2 = a.f363675k;
                            C139340v vVar = (C139340v) wVar2.f378961b.get();
                            if (vVar != null) {
                                if (vVar.mo114909c(wVar2.f378960a)) {
                                    return;
                                }
                            }
                        }
                        Intent a3 = a.f363667c.mo114907a(fVar7, a.f363668d);
                        a3.addFlags(268435456);
                        a.f363666b.startActivity(a3);
                    } catch (C139322d e2) {
                        ((C59052c) ((C59052c) ((C59052c) SilkAmpApiImplOpenHelperFragmentPeer.f363665a.mo56225c()).mo56382g(e2)).mo56372aa(40057)).mo56386p("stamp params are invalid, falling back to urlhandler");
                        a.mo111177b(C37182a.f97931dD.mo40806d());
                        a.mo111176a(e, d, c, f);
                    }
                } else {
                    throw null;
                }
            } else {
                SilkAmpApiImplOpenHelperFragmentPeer.this.f363671g.mo17754z().mo111177b(C37182a.f97932dE.mo40806d());
                SilkAmpApiImplOpenHelperFragmentPeer.this.f363671g.mo17754z().mo111176a(loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111178e(), loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111170d(), loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111169c(), loadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput.mo111179f());
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: k */
    public final C139341w f363675k;

    /* renamed from: l */
    private final C139795f f363676l;

    /* renamed from: m */
    private final C133467c f363677m;

    /* renamed from: n */
    private final C139786b f363678n;

    /* renamed from: o */
    private final C37215b f363679o;

    /* renamed from: p */
    private final boolean f363680p;

    /* renamed from: com.google.android.apps.search.googleapp.amp.silk.SilkAmpApiImplOpenHelperFragmentPeer$LoadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput */
    /* compiled from: PG */
    abstract class C133464xc5f34d63 implements Parcelable {
        /* renamed from: a */
        public abstract ProtoParsers.ParcelableProto mo111167a();

        /* renamed from: b */
        public abstract ProtoParsers.ParcelableProto mo111168b();

        /* renamed from: c */
        public abstract String mo111169c();

        /* renamed from: d */
        public abstract int mo111170d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final C56616h mo111178e() {
            return (C56616h) mo111168b().mo58938a(C56616h.f151163d, C62921ba.m95368a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final Instant mo111179f() {
            return C62950b.m95474e((C63042fg) mo111167a().mo58938a(C63042fg.f170152c, C62921ba.m95368a()));
        }
    }

    public SilkAmpApiImplOpenHelperFragmentPeer(Context context, C139795f fVar, C133467c cVar, C139338t tVar, AccountId accountId, C133482r rVar, C139786b bVar, C139792b bVar2, C133475k kVar, C46439e eVar, C39141kp kpVar, C37215b bVar3, C139341w wVar, boolean z) {
        this.f363666b = context;
        this.f363676l = fVar;
        this.f363677m = cVar;
        this.f363667c = tVar;
        this.f363668d = accountId;
        this.f363669e = rVar;
        this.f363678n = bVar;
        this.f363670f = bVar2;
        this.f363671g = kVar;
        this.f363672h = eVar;
        this.f363673i = kpVar;
        this.f363679o = bVar3;
        this.f363675k = wVar;
        this.f363680p = z;
    }

    /* renamed from: a */
    public final void mo111176a(C56616h hVar, int i, String str, Instant instant) {
        C139851q qVar;
        long j;
        Uri uri;
        C56612d dVar = hVar.f151166b;
        if (dVar == null) {
            dVar = C56612d.f151152f;
        }
        C56610b bVar = (C56610b) dVar.f151154a.get((int) dVar.f151156c);
        Uri a = this.f363677m.mo111182a(Uri.parse(bVar.f151144c), instant);
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                qVar = C139851q.AMP_SRP;
            } else if (i2 == 1) {
                qVar = C139851q.AMP_DISCOVER;
            } else {
                throw new AssertionError("Unknown source");
            }
            iVar.copyOnWrite();
            C139823j jVar = (C139823j) iVar.instance;
            jVar.f380069b = qVar.f380143m;
            jVar.f380068a |= 1;
            iVar.copyOnWrite();
            C139823j jVar2 = (C139823j) iVar.instance;
            jVar2.f380068a |= 1024;
            jVar2.f380079l = true;
            Optional a2 = this.f363678n.mo115236a(Uri.parse(bVar.f151146e));
            if (a2.isPresent()) {
                j = ((Long) a2.get()).longValue();
            } else {
                j = (bVar.f151142a & 16) != 0 ? bVar.f151147f : C58851bo.f156649a.nextLong();
            }
            iVar.copyOnWrite();
            C139823j jVar3 = (C139823j) iVar.instance;
            jVar3.f380068a |= 4;
            jVar3.f380071d = j;
            if (str != null) {
                iVar.copyOnWrite();
                C139823j jVar4 = (C139823j) iVar.instance;
                jVar4.f380068a |= 8;
                jVar4.f380072e = str;
            }
            if (bVar.f151146e.isEmpty()) {
                uri = Uri.parse(bVar.f151143b);
                if (!this.f363680p) {
                    String uri2 = a.toString();
                    iVar.copyOnWrite();
                    C139823j jVar5 = (C139823j) iVar.instance;
                    uri2.getClass();
                    jVar5.f380068a |= 16;
                    jVar5.f380073f = uri2;
                }
            } else {
                uri = Uri.parse(bVar.f151146e);
                if (!this.f363680p) {
                    String uri3 = a.toString();
                    iVar.copyOnWrite();
                    C139823j jVar6 = (C139823j) iVar.instance;
                    uri3.getClass();
                    jVar6.f380068a |= 32;
                    jVar6.f380074g = uri3;
                }
            }
            this.f363676l.mo115250a(uri, (C139823j) iVar.build());
            return;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo111177b(C37259h hVar) {
        this.f363679o.mo19974a(hVar.mo40781e(C62722b.OK));
    }
}
