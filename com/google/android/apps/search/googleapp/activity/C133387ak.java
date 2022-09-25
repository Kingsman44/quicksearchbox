package com.google.android.apps.search.googleapp.activity;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.search.googleapp.activity.p10136a.C133376f;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.incognito.p10323d.C136245c;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139694a;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.p10516t.p10520d.C139699c;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139777r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.pixelsuggest.C136895e;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.logging.p3046g.C39196b;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p3025k.C38567u;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46052t;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.amk;
import com.google.common.p4552o.aml;
import com.google.protobuf.C62940bt;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.activity.ak */
/* compiled from: PG */
public final class C133387ak extends C133389am implements C45987ay {

    /* renamed from: a */
    public static final C58974d f363452a = C58974d.m91135i("GoogleAppActivity");

    /* renamed from: b */
    public static final Duration f363453b = Duration.ofHours(1);

    /* renamed from: c */
    public Instant f363454c = Instant.ofEpochMilli(-1);

    /* renamed from: d */
    public final GoogleAppActivity f363455d;

    /* renamed from: e */
    public final C45989b f363456e;

    /* renamed from: f */
    public final C21370a f363457f;

    /* renamed from: g */
    public final C89922b f363458g;

    /* renamed from: h */
    public final C139695b f363459h;

    /* renamed from: i */
    public boolean f363460i;

    /* renamed from: j */
    public final C38802e f363461j;

    /* renamed from: k */
    public final boolean f363462k;

    /* renamed from: l */
    public final C133148g f363463l;

    /* renamed from: m */
    public final C136895e f363464m;

    /* renamed from: n */
    public final C47770dh f363465n;

    /* renamed from: o */
    public C133395as f363466o;

    /* renamed from: p */
    public final C139694a f363467p;

    /* renamed from: r */
    private final C28306ab f363468r;

    /* renamed from: s */
    private final C139699c f363469s;

    /* renamed from: t */
    private final Map f363470t;

    /* renamed from: u */
    private final C136226a f363471u;

    /* renamed from: v */
    private final C32158h f363472v;

    /* renamed from: w */
    private final C136245c f363473w;

    /* renamed from: x */
    private final boolean f363474x;

    /* renamed from: y */
    private final C136247a f363475y;

    public C133387ak(GoogleAppActivity googleAppActivity, C139694a aVar, C45989b bVar, C28306ab abVar, C21370a aVar2, C89922b bVar2, C139699c cVar, Map map, C136226a aVar3, C139695b bVar3, C136247a aVar4, C38802e eVar, C32158h hVar, C136245c cVar2, boolean z, boolean z2, C133148g gVar, C136895e eVar2, C47770dh dhVar) {
        C32158h hVar2 = hVar;
        this.f363455d = googleAppActivity;
        this.f363467p = aVar;
        this.f363456e = bVar;
        this.f363468r = abVar;
        this.f363457f = aVar2;
        this.f363458g = bVar2;
        this.f363469s = cVar;
        this.f363471u = aVar3;
        this.f363461j = eVar;
        this.f363470t = map;
        this.f363459h = bVar3;
        this.f363475y = aVar4;
        this.f363472v = hVar2;
        this.f363473w = cVar2;
        this.f363474x = z;
        this.f363462k = z2;
        this.f363463l = gVar;
        this.f363464m = eVar2;
        this.f363465n = dhVar;
        hVar2.mo37971b(googleAppActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f363471u.mo112853b(awVar);
        if (!awVar.f120815a.f120817b.equals("incognito")) {
            this.f363460i = true;
        } else if (!this.f363473w.mo112857a()) {
            IllegalStateException illegalStateException = new IllegalStateException("Incognito must be enabled to use the Incognito account");
            C58970a aVar = (C58970a) f363452a.mo56225c();
            aVar.mo56378ag(C38505d.f101864b, 162935873);
            ((C58970a) ((C58970a) aVar.mo56382g(illegalStateException)).mo56372aa(40045)).mo56389s("%s", "Incognito must be enabled to use the Incognito account");
            throw illegalStateException;
        } else if (!this.f363455d.isFinishing() && this.f363460i) {
            IllegalStateException illegalStateException2 = new IllegalStateException();
            C58970a aVar2 = (C58970a) f363452a.mo56225c();
            aVar2.mo56378ag(C38505d.f101864b, 179406851);
            ((C58970a) ((C58970a) aVar2.mo56382g(illegalStateException2)).mo56372aa(40044)).mo56389s("%s", "Reused activity when entering incognito. Create your incognito intent with GoogleAppEntryPoints and make sure that clearTask is set to true");
            throw illegalStateException2;
        }
        AccountId accountId = awVar.f120815a.f120816a;
        C133395as asVar = this.f363466o;
        if (asVar == null) {
            asVar = mo111117f();
        }
        mo111119h(accountId, asVar);
        this.f363466o = null;
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        boolean z = th instanceof C46054v;
        if (z && (th.getCause() instanceof C32209j)) {
            this.f363472v.mo37972c(this.f363456e);
        } else if (th instanceof C46052t) {
            if (!this.f363455d.isFinishing()) {
                this.f363475y.mo112861a();
            }
        } else if (!z || !(th.getCause() instanceof C38567u)) {
            ((C58970a) ((C58970a) ((C58970a) f363452a.mo56225c()).mo56382g(th)).mo56372aa(40047)).mo56386p("#onAccountError");
            C89922b bVar = this.f363458g;
            C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
            eVar.copyOnWrite();
            C59770f fVar = (C59770f) eVar.instance;
            fVar.f161503a |= 2;
            fVar.f161505c = 0;
            eVar.copyOnWrite();
            C59770f fVar2 = (C59770f) eVar.instance;
            fVar2.f161503a |= 1;
            fVar2.f161504b = C89885b.GOOGLE_APP_ACCOUNT_ERROR_VALUE;
            bVar.mo83762f((C59770f) eVar.build());
            this.f363461j.mo41635i(2);
            mo111121j();
        } else if (!this.f363455d.isFinishing()) {
            ((C58970a) ((C58970a) ((C58970a) f363452a.mo56224b()).mo56382g(th)).mo56372aa(40048)).mo56386p("Finishing the activity since it's using non-incognito account when Incognito is enabled");
            mo111121j();
        }
    }

    /* renamed from: c */
    public final void mo19984c() {
        C0154a aVar = new C0154a(this.f363455d.f727a.f739a.f744e);
        C133403b bVar = new C133403b();
        C68324h.m98669f(bVar);
        aVar.mo689v(R.id.googleapp_content, bVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        if (!this.f363474x) {
            this.f363471u.mo112852a(this.f363455d, axVar);
        }
        C28423g a = C45954d.m82060a(axVar.f120816a);
        C28313c a2 = this.f363468r.f76990a.mo33805a(C28427h.m53115a(78007));
        Optional a3 = this.f363459h.mo115169a();
        if (a3.isPresent()) {
            C62940bt btVar = C39196b.f103148a;
            amk amk = (amk) aml.f159155c.createBuilder();
            String str = (String) a3.get();
            amk.copyOnWrite();
            aml aml = (aml) amk.instance;
            str.getClass();
            aml.f159157a |= 1;
            aml.f159158b = str;
            a2.mo33858f(new C28353e(btVar, (aml) amk.build()));
        }
        C28306ab abVar = this.f363468r;
        GoogleAppActivity googleAppActivity = this.f363455d;
        a2.mo33861i(C28439i.f77216b);
        a2.mo33859g(C28375ak.m53061c(78008));
        a2.mo33859g(a);
        int i = C28485y.f77298f;
        abVar.mo33801b(googleAppActivity.mo1322k().mo1177e(16908290), a2);
    }

    /* renamed from: e */
    public final C133444w mo111116e() {
        Fragment b = this.f363455d.f727a.f739a.f744e.f634a.mo670b(R.id.googleapp_content);
        if (b instanceof C133430i) {
            return ((C133430i) b).mo17754z();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0123 A[SYNTHETIC, Splitter:B:26:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016a A[SYNTHETIC, Splitter:B:33:0x016a] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.googleapp.activity.C133395as mo111117f() {
        /*
            r10 = this;
            com.google.android.apps.search.googleapp.activity.GoogleAppActivity r0 = r10.f363455d
            android.content.Intent r0 = r0.getIntent()
            j$.util.Optional r1 = com.google.android.apps.search.googleapp.p10310h.C136126g.m221191e(r0)
            com.google.android.apps.search.googleapp.activity.as r2 = com.google.android.apps.search.googleapp.activity.C133395as.f363478e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.googleapp.activity.ar r2 = (com.google.android.apps.search.googleapp.activity.C133394ar) r2
            com.google.android.apps.search.googleapp.u.r r3 = com.google.android.apps.search.googleapp.p10527u.C139777r.f379893c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.googleapp.u.q r3 = (com.google.android.apps.search.googleapp.p10527u.C139776q) r3
            boolean r4 = r1.isPresent()
            r5 = 1
            if (r4 == 0) goto L_0x004e
            java.lang.Object r1 = r1.get()
            com.google.android.apps.search.googleapp.u.t r1 = (com.google.android.apps.search.googleapp.p10527u.C139779t) r1
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.googleapp.u.r r4 = (com.google.android.apps.search.googleapp.p10527u.C139777r) r4
            int r1 = r1.f379907i
            r4.f379896b = r1
            int r1 = r4.f379895a
            r1 = r1 | r5
            r4.f379895a = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.googleapp.activity.as r1 = (com.google.android.apps.search.googleapp.activity.C133395as) r1
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.search.googleapp.u.r r3 = (com.google.android.apps.search.googleapp.p10527u.C139777r) r3
            r3.getClass()
            r1.f363481b = r3
            int r3 = r1.f363480a
            r3 = r3 | r5
            r1.f363480a = r3
        L_0x004e:
            java.lang.String r1 = "promotion_options"
            j$.util.Optional r1 = com.google.android.apps.search.googleapp.p10310h.C136126g.m221190d(r0, r1)
            boolean r3 = r1.isPresent()
            if (r3 == 0) goto L_0x0086
            com.google.common.l.i r3 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ ct -> 0x0077 }
            java.lang.Object r1 = r1.get()     // Catch:{ ct -> 0x0077 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ ct -> 0x0077 }
            byte[] r1 = r3.mo56836k(r1)     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0077 }
            com.google.android.apps.search.googleapp.h.r r4 = com.google.android.apps.search.googleapp.p10310h.C136137r.f370767d     // Catch:{ ct -> 0x0077 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0077 }
            com.google.android.apps.search.googleapp.h.r r1 = (com.google.android.apps.search.googleapp.p10310h.C136137r) r1     // Catch:{ ct -> 0x0077 }
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ ct -> 0x0077 }
            goto L_0x008a
        L_0x0077:
            r1 = move-exception
            com.google.common.f.a.d r3 = com.google.android.apps.search.googleapp.p10310h.C136126g.f370751a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Error parsing PromotionOptions proto"
            r6 = 40571(0x9e7b, float:5.6852E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r1)).mo56372aa(r6)).mo56386p(r4)
        L_0x0086:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x008a:
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.apps.search.googleapp.activity.af r3 = new com.google.android.apps.search.googleapp.activity.af
            r3.<init>(r2)
            r1.ifPresent(r3)
            com.google.android.apps.search.googleapp.u.p r1 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.u.o r1 = (com.google.android.apps.search.googleapp.p10527u.C139774o) r1
            j$.util.Optional r3 = com.google.android.apps.search.googleapp.p10310h.C136126g.m221187a(r0)
            j$.util.Optional r4 = com.google.android.apps.search.googleapp.p10310h.C136126g.m221189c(r0)
            j$.util.Optional r4 = r10.mo111118g(r4)
            j$.util.Optional r6 = com.google.android.apps.search.googleapp.p10310h.C136126g.m221188b(r0)
            boolean r7 = r4.isPresent()
            if (r7 == 0) goto L_0x00c7
            boolean r7 = r3.isPresent()
            if (r7 == 0) goto L_0x00c7
            com.google.common.f.a.d r7 = f363452a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "Both query and discover intent options set on same intent"
            r9 = 40043(0x9c6b, float:5.6112E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r9)).mo56386p(r8)
        L_0x00c7:
            boolean r7 = r4.isPresent()
            if (r7 == 0) goto L_0x00e1
            java.lang.Object r4 = r4.get()
            com.google.android.apps.search.googleapp.search.e.g r4 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r4
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.apps.search.googleapp.u.p r7 = (com.google.android.apps.search.googleapp.p10527u.C139775p) r7
            r4.getClass()
            r7.f379891b = r4
            r7.f379890a = r5
        L_0x00e1:
            boolean r4 = r3.isPresent()
            r5 = 2
            if (r4 == 0) goto L_0x00fc
            java.lang.Object r3 = r3.get()
            com.google.android.apps.search.googleapp.h.d r3 = (com.google.android.apps.search.googleapp.p10310h.C136123d) r3
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.googleapp.u.p r4 = (com.google.android.apps.search.googleapp.p10527u.C139775p) r4
            r3.getClass()
            r4.f379891b = r3
            r4.f379890a = r5
        L_0x00fc:
            boolean r3 = r6.isPresent()
            if (r3 == 0) goto L_0x0117
            java.lang.Object r3 = r6.get()
            com.google.android.apps.search.googleapp.h.p r3 = (com.google.android.apps.search.googleapp.p10310h.C136135p) r3
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.googleapp.u.p r4 = (com.google.android.apps.search.googleapp.p10527u.C139775p) r4
            r3.getClass()
            r4.f379891b = r3
            r3 = 3
            r4.f379890a = r3
        L_0x0117:
            java.lang.String r3 = "collections_intent_options"
            j$.util.Optional r3 = com.google.android.apps.search.googleapp.p10310h.C136126g.m221190d(r0, r3)
            boolean r4 = r3.isPresent()
            if (r4 == 0) goto L_0x014f
            com.google.common.l.i r4 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ ct -> 0x0140 }
            java.lang.Object r3 = r3.get()     // Catch:{ ct -> 0x0140 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ ct -> 0x0140 }
            byte[] r3 = r4.mo56836k(r3)     // Catch:{ ct -> 0x0140 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0140 }
            com.google.android.apps.search.googleapp.collections.a.b r6 = com.google.android.apps.search.googleapp.collections.p10142a.C133493b.f363732c     // Catch:{ ct -> 0x0140 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r3, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x0140 }
            com.google.android.apps.search.googleapp.collections.a.b r3 = (com.google.android.apps.search.googleapp.collections.p10142a.C133493b) r3     // Catch:{ ct -> 0x0140 }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)     // Catch:{ ct -> 0x0140 }
            goto L_0x0153
        L_0x0140:
            r3 = move-exception
            com.google.common.f.a.d r4 = com.google.android.apps.search.googleapp.p10310h.C136126g.f370751a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r6 = "Error parsing CollectionsIntentOptions proto"
            r7 = 40566(0x9e76, float:5.6845E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r6)
        L_0x014f:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x0153:
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.android.apps.search.googleapp.activity.ag r4 = new com.google.android.apps.search.googleapp.activity.ag
            r4.<init>(r1)
            r3.ifPresent(r4)
            java.lang.String r3 = "google_app_browser_intent_options"
            j$.util.Optional r0 = com.google.android.apps.search.googleapp.p10310h.C136126g.m221190d(r0, r3)
            boolean r3 = r0.isPresent()
            if (r3 == 0) goto L_0x0196
            com.google.common.l.i r3 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ ct -> 0x0187 }
            java.lang.Object r0 = r0.get()     // Catch:{ ct -> 0x0187 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ ct -> 0x0187 }
            byte[] r0 = r3.mo56836k(r0)     // Catch:{ ct -> 0x0187 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0187 }
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r4 = com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h.f369059n     // Catch:{ ct -> 0x0187 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0187 }
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r0 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h) r0     // Catch:{ ct -> 0x0187 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x0187 }
            goto L_0x019a
        L_0x0187:
            r0 = move-exception
            com.google.common.f.a.d r3 = com.google.android.apps.search.googleapp.p10310h.C136126g.f370751a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Error parsing GoogleAppBrowserIntentOptions proto"
            r6 = 40568(0x9e78, float:5.6848E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r0)).mo56372aa(r6)).mo56386p(r4)
        L_0x0196:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x019a:
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.android.apps.search.googleapp.activity.ah r3 = new com.google.android.apps.search.googleapp.activity.ah
            r3.<init>(r1)
            r0.ifPresent(r3)
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.search.googleapp.u.p r0 = (com.google.android.apps.search.googleapp.p10527u.C139775p) r0
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.googleapp.activity.as r1 = (com.google.android.apps.search.googleapp.activity.C133395as) r1
            r0.getClass()
            r1.f363482c = r0
            int r0 = r1.f363480a
            r0 = r0 | r5
            r1.f363480a = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.search.googleapp.activity.as r0 = (com.google.android.apps.search.googleapp.activity.C133395as) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.activity.C133387ak.mo111117f():com.google.android.apps.search.googleapp.activity.as");
    }

    /* renamed from: g */
    public final Optional mo111118g(Optional optional) {
        Optional a = this.f363459h.mo115169a();
        if (!a.isPresent()) {
            return optional;
        }
        if ((!((String) a.get()).equals("and.gsa.widget.mic") && !((String) a.get()).equals("and.gsa.launcher.shortcut.voice") && !((String) a.get()).equals("and.gsa.launcher.qsb.mic") && !((String) a.get()).equals("and.gsa.voice.search.icon") && !((String) a.get()).equals("and.gsa.monet.minus1")) || !optional.isPresent()) {
            return optional;
        }
        C137416e eVar = (C137416e) ((C137418g) optional.get()).toBuilder();
        long c = this.f363457f.mo26871c();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        gVar.f373769a |= 4096;
        gVar.f373782n = c;
        return Optional.m71637of((C137418g) eVar.build());
    }

    /* renamed from: h */
    public final void mo111119h(AccountId accountId, C133395as asVar) {
        C47558bi a = C47831fm.m85006a("GoogleAppActivityPeer#attachMainFragment");
        try {
            C133430i iVar = new C133430i();
            C68324h.m98669f(iVar);
            C47247a.m84047b(iVar, accountId);
            C47243l.m84039a(iVar, asVar);
            C0154a aVar = new C0154a(this.f363455d.f727a.f739a.f744e);
            aVar.mo689v(R.id.googleapp_content, iVar, (String) null);
            aVar.mo509f();
            C133444w a2 = iVar.mo17754z();
            if (!a2.f363598G || a2.f363607P == C139779t.SEARCH) {
                C133376f fVar = a2.f363595D;
                C139779t tVar = a2.f363606O;
                tVar.getClass();
                fVar.mo111111c(tVar, C139761b.class).ifPresent(new C133432k(a2));
            }
            a.close();
            return;
        } catch (Throwable th) {
            C133378ab.m216496a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final void mo111120i(C1967b bVar) {
        bVar.mo3353a(this.f363469s);
        C139777r rVar = mo111117f().f363481b;
        if (rVar == null) {
            rVar = C139777r.f379893c;
        }
        C139779t a = C139779t.m227245a(rVar.f379896b);
        if (a == null) {
            a = C139779t.UNSPECIFIED;
        }
        if (this.f363470t.containsKey(a)) {
            bVar.mo3353a((C139699c) this.f363470t.get(a));
        }
    }

    /* renamed from: j */
    public final void mo111121j() {
        if (this.f363455d.getIntent().getBooleanExtra("SKIP_EXIT_ANIMATION", false)) {
            this.f363455d.overridePendingTransition(0, 0);
        }
        this.f363477q.mo111107x();
    }

    /* renamed from: k */
    public final void mo111122k(boolean z) {
        C133444w e = mo111116e();
        if (e != null && !e.mo111154k()) {
            if (z) {
                e.f363618c.finishAndRemoveTask();
            } else {
                e.f363618c.finish();
            }
        }
    }
}
