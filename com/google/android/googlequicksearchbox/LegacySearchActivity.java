package com.google.android.googlequicksearchbox;

import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.gsa.h.k.b;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10310h.C136136q;
import com.google.android.apps.search.googleapp.p10310h.C136137r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60218r;
import dagger.C68214a;
import java.util.List;
import p3186j$.util.Optional;

/* compiled from: PG */
public class LegacySearchActivity extends C146538a {

    /* renamed from: k */
    private static final C59071e f395740k = C59071e.m91332i("com.google.android.googlequicksearchbox.LegacySearchActivity");

    /* renamed from: a */
    public C68214a f395741a;

    /* renamed from: b */
    public C68214a f395742b;

    /* renamed from: c */
    public C90476a f395743c;

    /* renamed from: d */
    public Optional f395744d;

    /* renamed from: e */
    public Query f395745e;

    /* renamed from: f */
    public C38802e f395746f;

    /* renamed from: g */
    public C68214a f395747g;

    /* renamed from: h */
    public C68214a f395748h;

    /* renamed from: i */
    public C146543f f395749i;

    /* renamed from: j */
    public Optional f395750j = Optional.empty();

    /* renamed from: l */
    private C21370a f395751l;

    /* renamed from: com.google.android.googlequicksearchbox.LegacySearchActivity$a */
    /* compiled from: PG */
    public interface C146537a {
        /* renamed from: bT */
        C47770dh mo123323bT();
    }

    public LegacySearchActivity() {
        C31499r.f84816a.mo37198b(SystemClock.elapsedRealtime());
    }

    /* renamed from: b */
    public static Optional m238542b(Intent intent) {
        if (!intent.hasExtra("promo_id") && !intent.hasExtra("sop")) {
            return Optional.empty();
        }
        C136136q qVar = (C136136q) C136137r.f370767d.createBuilder();
        int intExtra = intent.getIntExtra("promo_id", 0);
        if (intExtra != 0) {
            qVar.copyOnWrite();
            C136137r rVar = (C136137r) qVar.instance;
            rVar.f370769a |= 1;
            rVar.f370770b = intExtra;
        }
        boolean booleanExtra = intent.getBooleanExtra("sop", false);
        qVar.copyOnWrite();
        C136137r rVar2 = (C136137r) qVar.instance;
        rVar2.f370769a |= 2;
        rVar2.f370771c = booleanExtra;
        return Optional.m71637of((C136137r) qVar.build());
    }

    /* renamed from: e */
    private final Bundle m238543e() {
        return ActivityOptions.makeCustomAnimation(this, 0, 0).toBundle();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        if (r1.equals("web.bks") != false) goto L_0x0134;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m238544f(android.content.Intent r12, p3186j$.util.Optional r13) {
        /*
            r11 = this;
            android.support.p033v7.app.C0401v.m1321C()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            r0.<init>(r1)
            java.lang.String r1 = "query"
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = "query-header-visibility"
            r3 = 0
            int r2 = r12.getIntExtra(r2, r3)
            com.google.android.apps.search.googleapp.search.e.g r4 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.googleapp.search.e.e r4 = (com.google.android.apps.search.googleapp.search.p10409e.C137416e) r4
            java.lang.String r5 = "search_query_options"
            boolean r6 = r12.hasExtra(r5)
            if (r6 == 0) goto L_0x0053
            byte[] r5 = r12.getByteArrayExtra(r5)     // Catch:{ ct -> 0x0044 }
            r5.getClass()
            byte[] r5 = (byte[]) r5     // Catch:{ ct -> 0x0044 }
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0044 }
            com.google.android.apps.search.googleapp.search.e.g r7 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ ct -> 0x0044 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r5, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x0044 }
            com.google.android.apps.search.googleapp.search.e.g r5 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r5     // Catch:{ ct -> 0x0044 }
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ ct -> 0x0044 }
            com.google.android.apps.search.googleapp.search.e.e r5 = (com.google.android.apps.search.googleapp.search.p10409e.C137416e) r5     // Catch:{ ct -> 0x0044 }
            r4 = r5
            goto L_0x0053
        L_0x0044:
            r5 = move-exception
            com.google.common.f.e r6 = f395740k
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "Error parsing QueryOptions proto"
            r8 = 42097(0xa471, float:5.899E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(r8)).mo56386p(r7)
        L_0x0053:
            int r2 = com.google.android.apps.search.googleapp.search.p10409e.C137415d.m223276a(r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.googleapp.search.e.g r5 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r5
            int r6 = r2 + -1
            if (r2 == 0) goto L_0x01cb
            r5.f373774f = r6
            int r2 = r5.f373769a
            r2 = r2 | 8
            r5.f373769a = r2
            r2 = 1
            if (r1 == 0) goto L_0x007b
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.googleapp.search.e.g r5 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r5
            int r6 = r5.f373769a
            r6 = r6 | r2
            r5.f373769a = r6
            r5.f373770b = r1
        L_0x007b:
            com.google.common.b.gz r1 = new com.google.common.b.gz
            r5 = 4
            r1.<init>(r5)
            java.lang.String r6 = "search-stick"
            java.lang.String r6 = r12.getStringExtra(r6)
            if (r6 == 0) goto L_0x008e
            java.lang.String r7 = "stick"
            r1.mo55429h(r7, r6)
        L_0x008e:
            java.lang.String r6 = "ved"
            java.lang.String r7 = r12.getStringExtra(r6)
            if (r7 == 0) goto L_0x0099
            r1.mo55429h(r6, r7)
        L_0x0099:
            java.lang.String r6 = "search_immersive_base_page"
            java.lang.String r6 = r12.getStringExtra(r6)
            if (r6 == 0) goto L_0x00a6
            java.lang.String r7 = "ibp"
            r1.mo55429h(r7, r6)
        L_0x00a6:
            java.lang.String r6 = "kg-mid"
            java.lang.String r6 = r12.getStringExtra(r6)
            if (r6 == 0) goto L_0x00b3
            java.lang.String r7 = "kgmid"
            r1.mo55429h(r7, r6)
        L_0x00b3:
            com.google.common.b.hd r1 = r1.mo55427f(r3)
            r4.mo113713a(r1)
            boolean r1 = r13.isPresent()
            if (r1 == 0) goto L_0x00d9
            java.lang.Object r13 = r13.get()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.android.apps.search.googleapp.search.e.g r1 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r1
            int r6 = r1.f373769a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r1.f373769a = r6
            r1.f373777i = r13
        L_0x00d9:
            java.lang.String r13 = "search_within_corpus"
            boolean r1 = r12.hasExtra(r13)
            r6 = 2
            if (r1 != 0) goto L_0x00e8
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
            goto L_0x0188
        L_0x00e8:
            java.lang.String r1 = r12.getStringExtra(r13)
            if (r1 == 0) goto L_0x0168
            int r7 = r1.hashCode()
            r8 = 5
            r9 = 3
            java.lang.String r10 = "web"
            switch(r7) {
                case -764028567: goto L_0x0129;
                case -763740848: goto L_0x011f;
                case 117588: goto L_0x0117;
                case 1222272944: goto L_0x010e;
                case 1222284848: goto L_0x0104;
                case 1222292087: goto L_0x00fa;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x0133
        L_0x00fa:
            java.lang.String r3 = "web.vid"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0133
            r3 = 4
            goto L_0x0134
        L_0x0104:
            java.lang.String r3 = "web.nws"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0133
            r3 = 2
            goto L_0x0134
        L_0x010e:
            java.lang.String r7 = "web.bks"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0117:
            boolean r3 = r1.equals(r10)
            if (r3 == 0) goto L_0x0133
            r3 = 5
            goto L_0x0134
        L_0x011f:
            java.lang.String r3 = "web.shop"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0133
            r3 = 3
            goto L_0x0134
        L_0x0129:
            java.lang.String r3 = "web.isch"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0133
            r3 = 1
            goto L_0x0134
        L_0x0133:
            r3 = -1
        L_0x0134:
            if (r3 == 0) goto L_0x0141
            if (r3 == r2) goto L_0x0141
            if (r3 == r6) goto L_0x0141
            if (r3 == r9) goto L_0x0141
            if (r3 == r5) goto L_0x0141
            if (r3 == r8) goto L_0x0141
            goto L_0x0168
        L_0x0141:
            java.lang.String r12 = r12.getStringExtra(r13)
            if (r12 != 0) goto L_0x014c
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
            goto L_0x0188
        L_0x014c:
            java.lang.String r13 = "web."
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x0158
            java.lang.String r12 = r12.substring(r5)
        L_0x0158:
            boolean r13 = r10.equals(r12)
            if (r13 == 0) goto L_0x0163
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
            goto L_0x0188
        L_0x0163:
            j$.util.Optional r12 = p3186j$.util.Optional.ofNullable(r12)
            goto L_0x0188
        L_0x0168:
            java.lang.String r12 = "images"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0177
            java.lang.String r12 = "isch"
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r12)
            goto L_0x0188
        L_0x0177:
            com.google.common.f.e r12 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.f242423a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r13 = "Invalid input of corpus string: %s is not supported."
            r3 = 11469(0x2ccd, float:1.6071E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r3)).mo56389s(r13, r1)
            j$.util.Optional r12 = p3186j$.util.Optional.empty()
        L_0x0188:
            boolean r13 = r12.isPresent()
            if (r13 == 0) goto L_0x01a5
            java.lang.Object r12 = r12.get()
            java.lang.String r12 = (java.lang.String) r12
            r4.copyOnWrite()
            com.google.protobuf.bv r13 = r4.instance
            com.google.android.apps.search.googleapp.search.e.g r13 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r13
            r12.getClass()
            int r1 = r13.f373769a
            r1 = r1 | r6
            r13.f373769a = r1
            r13.f373771c = r12
        L_0x01a5:
            java.lang.String r12 = "SKIP_EXIT_ANIMATION"
            r0.putExtra(r12, r2)
            com.google.android.apps.search.googleapp.h.i r12 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()
            com.google.android.apps.search.googleapp.u.t r13 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            r12.mo112776k(r13)
            com.google.protobuf.bv r13 = r4.build()
            com.google.android.apps.search.googleapp.search.e.g r13 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r13
            j$.util.Optional r13 = p3186j$.util.Optional.m71637of(r13)
            r12.mo112775j(r13)
            com.google.android.apps.search.googleapp.h.j r12 = r12.mo112766a()
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r0, r12)
            r11.startActivity(r0)
            return
        L_0x01cb:
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.googlequicksearchbox.LegacySearchActivity.m238544f(android.content.Intent, j$.util.Optional):void");
    }

    /* renamed from: g */
    private final void m238545g(Intent intent) {
        Query query;
        Intent intent2;
        Intent intent3 = new Intent(intent);
        intent3.setAction("android.intent.action.MAIN");
        if (intent.hasExtra("velvet-query")) {
            query = (Query) intent.getParcelableExtra("velvet-query");
        } else {
            query = C89429a.m145442D(intent, this.f395742b, new C146542e(this));
            if (intent.getAction().equals("com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH") && intent.hasExtra("googleapp_qsubts_override")) {
                long longExtra = intent.getLongExtra("googleapp_qsubts_override", 0);
                C90498f i = query.mo84480i();
                i.mo84583o("googleapp-qsubts-override", longExtra);
                query = i.mo84568a();
            }
        }
        intent3.setFlags(intent3.getFlags() & -8388609);
        String action = intent.getAction();
        if (!"com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH".equals(action) && !"com.google.android.googlequicksearchbox.TEXT_ASSIST".equals(action) && (C89429a.m145441C(intent) || C89429a.m145467y(intent) || C89429a.m145464v(intent) || "android.intent.action.ASSIST".equals(action))) {
            intent3.addFlags(67108864);
        }
        if (!C89429a.m145457o(intent) && !C89429a.m145465w(intent) && (!"com.google.android.googlequicksearchbox.GOOGLE_SEARCH".equals(intent.getAction()) || !intent.hasExtra(C89429a.m145451i(intent)) || !TextUtils.isEmpty(C89429a.m145449g(intent)))) {
            intent3.putExtra("commit-query", true);
        }
        if (!C89429a.m145453k(intent)) {
            C84515a c = this.f395749i.mo123330c();
            String a = C39193b.m68624a(intent3);
            if (a == null) {
                a = "and.gsa.tracker";
            }
            if (!((C84486a) c.f230019b.mo27525b()).mo78207n()) {
                intent2 = null;
            } else {
                C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                String str = query.f252770i;
                eVar.copyOnWrite();
                C137418g gVar = (C137418g) eVar.instance;
                str.getClass();
                gVar.f373769a |= 1;
                gVar.f373770b = str;
                C58490gz gzVar = new C58490gz(4);
                String bg = query.mo84348bg();
                if (bg != null) {
                    gzVar.mo55429h("ibp", bg);
                }
                String bo = query.mo84356bo();
                if (bo != null) {
                    gzVar.mo55429h("stick", bo);
                }
                String bp = query.mo84357bp();
                if (bp != null) {
                    gzVar.mo55429h("ved", bp);
                }
                eVar.mo113713a(gzVar.mo55427f(false));
                Optional of = Optional.m71637of((C137418g) eVar.build());
                C136128i l = C136129j.m221208l();
                l.mo112776k(C139779t.SEARCH);
                l.mo112775j(of);
                intent2 = new Intent();
                intent2.putExtra("source", a);
                C136127h.m221196a(intent2, l.mo112766a());
            }
            if (intent2 == null) {
                Intent b = c.mo78219b(a);
                b.putExtra("commit-query", true);
                b.putExtras(intent3);
                b.setFlags(intent3.getFlags());
                intent3 = b;
            } else {
                intent3 = intent2;
            }
            intent3.addFlags(268468224);
        } else if (TextUtils.equals(intent.getAction(), "android.intent.action.VOICE_ASSIST")) {
            m238546h(C39193b.m68624a(intent));
            return;
        } else {
            intent3.setAction(intent.getAction());
            intent3.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.queryentry.QueryEntryActivity");
        }
        intent3.putExtra("velvet-query", query);
        startActivity(intent3, m238543e());
    }

    /* renamed from: h */
    private final void m238546h(String str) {
        C88489j jVar = new C88489j(C87739bu.EXTERNAL_VOICE_ASSIST);
        jVar.mo82015c(this.f395745e.mo84275aL(str));
        C88483e.m142828c(this, jVar.mo82013a());
    }

    /* renamed from: i */
    private final void m238547i(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            this.f395750j = Optional.m71637of(component.getClassName());
        }
    }

    /* renamed from: j */
    private final void m238548j() {
        if (this.f395749i.mo123329b().mo79746e(C90014bt.f247287eM)) {
            Context applicationContext = getApplicationContext();
            C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
            hwVar.copyOnWrite();
            C53287ih ihVar = (C53287ih) hwVar.instance;
            ihVar.f139698d = 1;
            ihVar.f139695a = 1 | ihVar.f139695a;
            hwVar.copyOnWrite();
            C53287ih ihVar2 = (C53287ih) hwVar.instance;
            ihVar2.f139702h = 9;
            ihVar2.f139695a |= 64;
            hwVar.copyOnWrite();
            C53287ih ihVar3 = (C53287ih) hwVar.instance;
            ihVar3.f139703i = 12;
            ihVar3.f139695a |= 128;
            startActivity(C87571n.m142339c(applicationContext, C87571n.m142341e(C87571n.m142342f((C53287ih) hwVar.build())), this.f395749i.mo123329b().mo79746e(C90014bt.f247381gA), (C60218r) null));
            return;
        }
        startActivity(C87566i.m142320s(getApplicationContext(), C87566i.m142226A(C39193b.m68624a(getIntent())), 268468224));
    }

    /* renamed from: k */
    private final void m238549k(Intent intent) {
        C90476a aVar = C91018d.f254254a;
        C90334c.m146890e(this, intent, new C23129y("searchnow", "TYPE_SEARCHNOW"));
        if (!b.d(intent).mo56113h()) {
            this.f395749i.mo123334g(intent, 1);
            intent.putExtra("extra_sna_bootstrap_source", 3);
            return;
        }
        intent.putExtra("extra_sna_bootstrap_source", 1);
    }

    /* renamed from: l */
    private final boolean m238550l(int i, long j) {
        if (i == 0) {
            return false;
        }
        if (j <= 0) {
            return true;
        }
        m238555q();
        return ((long) i) <= (System.currentTimeMillis() - j) / 1000;
    }

    /* renamed from: m */
    private static boolean m238551m(Intent intent) {
        return "android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER");
    }

    /* renamed from: n */
    private final boolean m238552n(Intent intent) {
        return "com.google.android.googlequicksearchbox.SEARCH_GESTURE".equals(intent.getAction()) && this.f395749i.mo123329b().mo79746e(C90110fh.f250609aG);
    }

    /* renamed from: o */
    private final boolean m238553o() {
        return this.f395749i.mo123328a().u();
    }

    /* renamed from: p */
    private final int m238554p(C90291g gVar) {
        ResolveInfo resolveActivity;
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) getSystemService("activity")).getAppTasks();
        PackageManager packageManager = getApplicationContext().getPackageManager();
        for (ActivityManager.AppTask taskInfo : appTasks) {
            ActivityManager.RecentTaskInfo taskInfo2 = taskInfo.getTaskInfo();
            if (!((!gVar.f252197m && !taskInfo2.isRunning) || (resolveActivity = packageManager.resolveActivity(taskInfo2.baseIntent, 0)) == null || resolveActivity.activityInfo == null)) {
                String str = resolveActivity.activityInfo.name;
                if ("com.google.android.apps.gsa.searchnow.SearchNowActivity".equals(str)) {
                    return 2;
                }
                if ("com.google.android.googlequicksearchbox.InternalGoogleAppActivityEntrypoint".equals(str) || "com.google.android.apps.search.googleapp.activity.GoogleAppActivity".equals(str)) {
                    return 1;
                }
            }
        }
        return 3;
    }

    /* renamed from: q */
    private final void m238555q() {
        if (this.f395751l == null) {
            this.f395751l = new C21375e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r7 == com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0163, code lost:
        if (r1 != false) goto L_0x0165;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a5  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123319d(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "android.intent.action.MAIN"
            r1 = 0
            r3 = 1
            r4 = 0
            com.google.android.libraries.gsa.monet.shared.InitializationData r5 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146887b(r11)     // Catch:{ b -> 0x012e }
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r5 = r5.f63419b     // Catch:{ b -> 0x012e }
            com.google.android.apps.gsa.shared.monet.b.v.g r6 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T     // Catch:{ b -> 0x012e }
            com.google.protobuf.eb r6 = r6.getParserForType()     // Catch:{ b -> 0x012e }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ b -> 0x012e }
            com.google.protobuf.bv r5 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r5, r6, r7, r3)     // Catch:{ b -> 0x012e }
            com.google.android.apps.gsa.shared.monet.b.v.g r5 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r5     // Catch:{ b -> 0x012e }
            if (r5 == 0) goto L_0x012b
            int r6 = r5.f252195k     // Catch:{ b -> 0x012e }
            long r1 = r5.f252196l     // Catch:{ b -> 0x0129 }
            boolean r7 = r5.f252197m     // Catch:{ b -> 0x0129 }
            java.lang.String r8 = "android.intent.category.LAUNCHER"
            if (r7 == 0) goto L_0x00c5
            int r7 = r5.f252188d     // Catch:{ b -> 0x0129 }
            int r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90290f.m146824a(r7)     // Catch:{ b -> 0x0129 }
            if (r7 != 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            if (r7 == r3) goto L_0x0035
            goto L_0x00c5
        L_0x0035:
            int r7 = r5.f252187c     // Catch:{ b -> 0x0129 }
            com.google.android.apps.gsa.shared.monet.b.af.n r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.m146767a(r7)     // Catch:{ b -> 0x0129 }
            if (r7 != 0) goto L_0x003f
            com.google.android.apps.gsa.shared.monet.b.af.n r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB     // Catch:{ b -> 0x0129 }
        L_0x003f:
            com.google.android.apps.gsa.shared.monet.b.af.n r9 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.INTERESTS_TAB     // Catch:{ b -> 0x0129 }
            if (r7 == r9) goto L_0x0051
            int r7 = r5.f252187c     // Catch:{ b -> 0x0129 }
            com.google.android.apps.gsa.shared.monet.b.af.n r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.m146767a(r7)     // Catch:{ b -> 0x0129 }
            if (r7 != 0) goto L_0x004d
            com.google.android.apps.gsa.shared.monet.b.af.n r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB     // Catch:{ b -> 0x0129 }
        L_0x004d:
            com.google.android.apps.gsa.shared.monet.b.af.n r9 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB     // Catch:{ b -> 0x0129 }
            if (r7 != r9) goto L_0x00c5
        L_0x0051:
            boolean r7 = m238551m(r11)     // Catch:{ b -> 0x0129 }
            if (r7 == 0) goto L_0x006e
            boolean r7 = r10.m238550l(r6, r1)     // Catch:{ b -> 0x0129 }
            if (r7 != 0) goto L_0x006e
            int r7 = r10.m238554p(r5)     // Catch:{ b -> 0x0129 }
            r9 = 2
            if (r7 != r9) goto L_0x006e
            boolean r7 = r5.f252205u     // Catch:{ b -> 0x0129 }
            if (r7 == 0) goto L_0x0126
            boolean r7 = r5.f252200p     // Catch:{ b -> 0x0129 }
            if (r7 != 0) goto L_0x006e
            goto L_0x0126
        L_0x006e:
            android.support.p033v7.app.C0401v.m1321C()     // Catch:{ b -> 0x0129 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ b -> 0x0129 }
            r5.<init>()     // Catch:{ b -> 0x0129 }
            boolean r7 = m238551m(r11)     // Catch:{ b -> 0x0129 }
            if (r7 == 0) goto L_0x0082
            r5.setAction(r0)     // Catch:{ b -> 0x0129 }
            r5.addCategory(r8)     // Catch:{ b -> 0x0129 }
        L_0x0082:
            com.google.android.apps.search.googleapp.h.i r7 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()     // Catch:{ b -> 0x0129 }
            com.google.android.apps.search.googleapp.u.t r8 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN     // Catch:{ b -> 0x0129 }
            r7.mo112776k(r8)     // Catch:{ b -> 0x0129 }
            r7.mo112767b(r4)     // Catch:{ b -> 0x0129 }
            com.google.common.base.ax r8 = com.google.android.apps.gsa.sidekick.shared.util.C91972aw.m150926a(r11)     // Catch:{ b -> 0x0129 }
            com.google.android.googlequicksearchbox.c r9 = new com.google.android.googlequicksearchbox.c     // Catch:{ b -> 0x0129 }
            r9.<init>(r11)     // Catch:{ b -> 0x0129 }
            com.google.common.base.ax r8 = r8.mo56106b(r9)     // Catch:{ b -> 0x0129 }
            if (r8 == 0) goto L_0x00bd
            r9 = r7
            com.google.android.apps.search.googleapp.h.a r9 = (com.google.android.apps.search.googleapp.p10310h.C136120a) r9     // Catch:{ b -> 0x0129 }
            r9.f370720a = r8     // Catch:{ b -> 0x0129 }
            j$.util.Optional r8 = m238542b(r11)     // Catch:{ b -> 0x0129 }
            r7.mo112774i(r8)     // Catch:{ b -> 0x0129 }
            java.lang.String r8 = "open_account_menu_on_start"
            boolean r8 = r11.getBooleanExtra(r8, r4)     // Catch:{ b -> 0x0129 }
            r7.mo112771f(r8)     // Catch:{ b -> 0x0129 }
            com.google.android.apps.search.googleapp.h.j r7 = r7.mo112766a()     // Catch:{ b -> 0x0129 }
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r5, r7)     // Catch:{ b -> 0x0129 }
            com.google.apps.tiktok.tracing.C47810es.m84979s(r10, r5)     // Catch:{ b -> 0x0129 }
            return
        L_0x00bd:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ b -> 0x0129 }
            java.lang.String r7 = "Null discoverIntentOptionsOptional"
            r5.<init>(r7)     // Catch:{ b -> 0x0129 }
            throw r5     // Catch:{ b -> 0x0129 }
        L_0x00c5:
            boolean r7 = r5.f252197m     // Catch:{ b -> 0x0129 }
            if (r7 != 0) goto L_0x010b
            boolean r7 = r5.f252200p     // Catch:{ b -> 0x0129 }
            if (r7 == 0) goto L_0x010b
            boolean r7 = m238551m(r11)     // Catch:{ b -> 0x0129 }
            if (r7 == 0) goto L_0x010b
            boolean r7 = r10.m238550l(r6, r1)     // Catch:{ b -> 0x0129 }
            if (r7 != 0) goto L_0x010b
            int r7 = r10.m238554p(r5)     // Catch:{ b -> 0x0129 }
            if (r7 != r3) goto L_0x010b
            android.support.p033v7.app.C0401v.m1321C()     // Catch:{ b -> 0x0129 }
            boolean r5 = m238551m(r11)     // Catch:{ b -> 0x0129 }
            com.google.common.base.C58838bb.m90883r(r5)     // Catch:{ b -> 0x0129 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ b -> 0x0129 }
            r5.<init>()     // Catch:{ b -> 0x0129 }
            r5.setAction(r0)     // Catch:{ b -> 0x0129 }
            r5.addCategory(r8)     // Catch:{ b -> 0x0129 }
            com.google.android.apps.search.googleapp.h.i r7 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()     // Catch:{ b -> 0x0129 }
            com.google.android.apps.search.googleapp.u.t r8 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH     // Catch:{ b -> 0x0129 }
            r7.mo112776k(r8)     // Catch:{ b -> 0x0129 }
            r7.mo112767b(r4)     // Catch:{ b -> 0x0129 }
            com.google.android.apps.search.googleapp.h.j r7 = r7.mo112766a()     // Catch:{ b -> 0x0129 }
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r5, r7)     // Catch:{ b -> 0x0129 }
            r10.startActivity(r5)     // Catch:{ b -> 0x0129 }
            return
        L_0x010b:
            boolean r7 = r5.f252200p     // Catch:{ b -> 0x0129 }
            if (r7 == 0) goto L_0x0126
            int r7 = r5.f252188d     // Catch:{ b -> 0x0129 }
            int r7 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90290f.m146824a(r7)     // Catch:{ b -> 0x0129 }
            if (r7 == 0) goto L_0x0126
            r8 = 3
            if (r7 != r8) goto L_0x0126
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)     // Catch:{ b -> 0x0129 }
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)     // Catch:{ b -> 0x0129 }
            r10.m238544f(r11, r5)     // Catch:{ b -> 0x0129 }
            return
        L_0x0126:
            boolean r5 = r5.f252205u     // Catch:{ b -> 0x0129 }
            goto L_0x013f
        L_0x0129:
            r5 = move-exception
            goto L_0x0130
        L_0x012b:
            r5 = 0
            r6 = 0
            goto L_0x013f
        L_0x012e:
            r5 = move-exception
            r6 = 0
        L_0x0130:
            com.google.common.f.e r7 = f395740k
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Failed to get initialization data."
            r9 = 42096(0xa470, float:5.8989E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r5)).mo56372aa(r9)).mo56386p(r8)
            r5 = 0
        L_0x013f:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r11)
            int r8 = r7.getFlags()
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r8 = r8 & r9
            r7.setFlags(r8)
            boolean r8 = m238551m(r11)
            if (r8 == 0) goto L_0x0165
            boolean r1 = r10.m238550l(r6, r1)
            java.lang.String r2 = "consistent-resume-timed-out"
            r7.putExtra(r2, r1)
            java.lang.String r2 = "use-consistent-resume"
            r7.putExtra(r2, r3)
            if (r1 == 0) goto L_0x0170
        L_0x0165:
            int r1 = r7.getFlags()
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r7.setFlags(r1)
        L_0x0170:
            if (r5 == 0) goto L_0x0188
            java.lang.String r1 = "com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH"
            java.lang.String r2 = r7.getAction()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0188
            int r1 = r7.getFlags()
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r2
            r7.setFlags(r1)
        L_0x0188:
            java.lang.String r1 = "com.google.android.googlequicksearchbox"
            java.lang.String r2 = "com.google.android.apps.gsa.searchnow.SearchNowActivity"
            r7.setClassName(r1, r2)
            java.lang.String r1 = r11.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01a5
            java.lang.String r0 = "suppress_animations"
            boolean r11 = r11.getBooleanExtra(r0, r4)
            if (r11 != 0) goto L_0x01a5
            r10.startActivity(r7)
            return
        L_0x01a5:
            android.os.Bundle r11 = r10.m238543e()
            r10.startActivity(r7, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.googlequicksearchbox.LegacySearchActivity.mo123319d(android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01eb, code lost:
        if (com.google.android.apps.gsa.p5855h.C74533a.f208689a.contains(getCallingActivity()) == false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0809, code lost:
        if (r2 == 1) goto L_0x080b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (true != r11.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER")) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x08eb  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x08f8  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0917  */
    /* JADX WARNING: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "android.speech.action.WEB_SEARCH"
            java.lang.String r3 = "search-activity-destination"
            java.lang.String r4 = "android.intent.action.ASSIST"
            java.lang.String r5 = "source-debug"
            java.lang.String r6 = "com.google.android.googlequicksearchbox.VIEW_TERMS_OF_SERVICE"
            com.google.android.apps.gsa.e.f r7 = com.google.android.apps.gsa.e.f.aY
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r7)
            com.google.apps.tiktok.tracing.ey r7 = com.google.apps.tiktok.tracing.C47816ey.m84989c()
            boolean r8 = r7.mo51645d()
            java.lang.String r9 = "SearchActivity Lifecycle.onCreate"
            if (r8 != 0) goto L_0x002b
            com.google.apps.tiktok.tracing.bx r7 = r7.mo51644a()
            com.google.apps.tiktok.tracing.bi r8 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r9)
            com.google.android.googlequicksearchbox.d r9 = new com.google.android.googlequicksearchbox.d
            r9.<init>(r8, r7)
            goto L_0x003b
        L_0x002b:
            java.lang.Class<com.google.android.googlequicksearchbox.LegacySearchActivity$a> r7 = com.google.android.googlequicksearchbox.LegacySearchActivity.C146537a.class
            java.lang.Object r7 = dagger.hilt.C68286a.m98629a(r1, r7)
            com.google.android.googlequicksearchbox.LegacySearchActivity$a r7 = (com.google.android.googlequicksearchbox.LegacySearchActivity.C146537a) r7
            com.google.apps.tiktok.tracing.dh r7 = r7.mo123323bT()
            com.google.apps.tiktok.tracing.ax r9 = r7.mo51613c(r9)
        L_0x003b:
            com.google.android.apps.gsa.shared.util.q.c r10 = com.google.android.apps.gsa.shared.util.p7180q.C91084c.SEARCH     // Catch:{ all -> 0x0924 }
            com.google.android.apps.gsa.shared.util.p7180q.C91083b.m148803a(r10)     // Catch:{ all -> 0x0924 }
            r18.m238555q()     // Catch:{ all -> 0x0924 }
            long r10 = com.google.android.libraries.p1730f.p1731a.C21374d.m40426a()     // Catch:{ all -> 0x0924 }
            j$.time.Duration r10 = p3186j$.time.Duration.ofNanos(r10)     // Catch:{ all -> 0x0924 }
            com.google.android.apps.gsa.shared.s.a.a r11 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ all -> 0x0924 }
            super.onCreate(r19)     // Catch:{ all -> 0x091d }
            com.google.android.googlequicksearchbox.f r11 = new com.google.android.googlequicksearchbox.f     // Catch:{ all -> 0x0924 }
            r11.<init>(r1)     // Catch:{ all -> 0x0924 }
            r1.f395749i = r11     // Catch:{ all -> 0x0924 }
            android.content.Intent r11 = r18.getIntent()     // Catch:{ all -> 0x0924 }
            com.google.android.apps.gsa.shared.logger.C89838ab.m146267k(r11)     // Catch:{ all -> 0x0924 }
            java.lang.String r12 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r11)     // Catch:{ all -> 0x0924 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0924 }
            java.lang.String r13 = "search_within_corpus"
            java.lang.String r14 = "com.google.android.apps.sidekick.FROM_NOTIFICATION"
            java.lang.String r15 = "com.google.android.googlequicksearchbox.GOOGLE_SEARCH"
            java.lang.String r7 = "source"
            if (r12 != 0) goto L_0x0074
            r16 = r9
            goto L_0x013f
        L_0x0074:
            boolean r12 = m238551m(r11)     // Catch:{ all -> 0x0924 }
            java.lang.String r8 = "and.gsa.d.sa"
            if (r12 == 0) goto L_0x0088
            java.lang.String r5 = "and.gsa.launcher.icon"
            r16 = r9
            goto L_0x0120
        L_0x0082:
            r0 = move-exception
            r2 = r0
            r16 = r9
            goto L_0x0928
        L_0x0088:
            java.lang.String r12 = r11.getAction()     // Catch:{ all -> 0x0924 }
            r16 = r9
            android.net.Uri r9 = r11.getData()     // Catch:{ all -> 0x0922 }
            boolean r9 = com.google.android.apps.gsa.shared.util.C91100u.m148848a(r12, r9)     // Catch:{ all -> 0x0922 }
            if (r9 == 0) goto L_0x009c
            java.lang.String r5 = "and.gsa.d.dl"
            goto L_0x0120
        L_0x009c:
            boolean r9 = r1.m238552n(r11)     // Catch:{ all -> 0x0922 }
            if (r9 == 0) goto L_0x00a6
            java.lang.String r5 = "and.gsa.launcher.sg"
            goto L_0x0120
        L_0x00a6:
            java.lang.String r9 = r11.getAction()     // Catch:{ all -> 0x0922 }
            boolean r9 = android.text.TextUtils.equals(r9, r15)     // Catch:{ all -> 0x0922 }
            if (r9 == 0) goto L_0x00d0
            boolean r9 = r11.hasExtra(r13)     // Catch:{ all -> 0x0922 }
            if (r9 == 0) goto L_0x00d0
            java.lang.String r5 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145450h(r11)     // Catch:{ all -> 0x0922 }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0922 }
            java.lang.String r12 = "invalid"
            r17 = r5
            r5 = 1
            if (r5 != r9) goto L_0x00c7
            r5 = r12
            goto L_0x00c9
        L_0x00c7:
            r5 = r17
        L_0x00c9:
            java.lang.String r9 = "and.gsa.corpus"
            java.lang.String r5 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148741a(r9, r5)     // Catch:{ all -> 0x0922 }
            goto L_0x0120
        L_0x00d0:
            boolean r9 = r11.hasExtra(r14)     // Catch:{ all -> 0x0922 }
            if (r9 == 0) goto L_0x00d9
            java.lang.String r5 = "and.now.n"
            goto L_0x0120
        L_0x00d9:
            boolean r9 = r11.hasExtra(r5)     // Catch:{ all -> 0x0922 }
            if (r9 == 0) goto L_0x00e8
            java.lang.String r5 = r11.getStringExtra(r5)     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148741a(r8, r5)     // Catch:{ all -> 0x0922 }
            goto L_0x0120
        L_0x00e8:
            boolean r5 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148756i(r11)     // Catch:{ all -> 0x0922 }
            if (r5 == 0) goto L_0x011f
            boolean r5 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148755h(r11)     // Catch:{ all -> 0x0922 }
            java.lang.String r9 = "android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER"
            if (r5 == 0) goto L_0x0108
            boolean r5 = r11.hasExtra(r9)     // Catch:{ all -> 0x0922 }
            java.lang.String r9 = "and.gsa.define.ss"
            java.lang.String r12 = "and.gsa.define"
            r17 = r9
            r9 = 1
            if (r9 == r5) goto L_0x0105
        L_0x0103:
            r5 = r12
            goto L_0x0120
        L_0x0105:
            r5 = r17
            goto L_0x0120
        L_0x0108:
            boolean r5 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148757j(r11)     // Catch:{ all -> 0x0922 }
            if (r5 == 0) goto L_0x011c
            boolean r5 = r11.hasExtra(r9)     // Catch:{ all -> 0x0922 }
            java.lang.String r9 = "and.gsa.translate.ss"
            java.lang.String r12 = "and.gsa.translate"
            r17 = r9
            r9 = 1
            if (r9 == r5) goto L_0x0105
            goto L_0x0103
        L_0x011c:
            java.lang.String r5 = ""
            goto L_0x0120
        L_0x011f:
            r5 = 0
        L_0x0120:
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0922 }
            if (r9 != 0) goto L_0x012a
            r11.putExtra(r7, r5)     // Catch:{ all -> 0x0922 }
            goto L_0x013f
        L_0x012a:
            java.lang.String r5 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r11)     // Catch:{ all -> 0x0922 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0922 }
            if (r5 == 0) goto L_0x013f
            java.lang.String r5 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148743c(r11)     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148741a(r8, r5)     // Catch:{ all -> 0x0922 }
            r11.putExtra(r7, r5)     // Catch:{ all -> 0x0922 }
        L_0x013f:
            j$.util.Optional r5 = r1.f395744d     // Catch:{ all -> 0x0922 }
            boolean r5 = r5.isPresent()     // Catch:{ all -> 0x0922 }
            if (r5 == 0) goto L_0x0156
            j$.util.Optional r5 = r1.f395744d     // Catch:{ all -> 0x0922 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.logger.i.b r5 = (com.google.android.apps.gsa.shared.logger.p7064i.C89922b) r5     // Catch:{ all -> 0x0922 }
            long r8 = r10.toMillis()     // Catch:{ all -> 0x0922 }
            r5.mo83765i(r8)     // Catch:{ all -> 0x0922 }
        L_0x0156:
            com.google.android.libraries.search.logging.appflows.startup.a.e r5 = r1.f395746f     // Catch:{ all -> 0x0922 }
            r5.mo41631e(r10, r1)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.s.a.a r5 = r1.f395743c     // Catch:{ all -> 0x0922 }
            boolean r5 = r5.mo84225b()     // Catch:{ all -> 0x0922 }
            if (r5 == 0) goto L_0x016a
            java.lang.String r5 = "SearchActivity.onCreate"
            com.google.android.apps.gsa.shared.s.a.a r8 = r1.f395743c     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148695a(r5, r8)     // Catch:{ all -> 0x0922 }
        L_0x016a:
            java.lang.String r5 = r11.getAction()     // Catch:{ all -> 0x0922 }
            boolean r8 = r6.equals(r5)     // Catch:{ all -> 0x0922 }
            java.lang.String r9 = "com.google.android.googlequicksearchbox.VIEW_PRIVACY_POLICY"
            if (r8 != 0) goto L_0x089c
            boolean r8 = r9.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r8 == 0) goto L_0x017e
            goto L_0x089c
        L_0x017e:
            java.lang.String r6 = "com.google.android.googlequicksearchbox.VOICE_SEARCH_DSP_HOTWORD"
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r6 == 0) goto L_0x0196
            com.google.android.apps.gsa.search.shared.service.j r2 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HOTWORD_TRIGGERED_ON_DSP     // Catch:{ all -> 0x0922 }
            r2.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r3)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r2 = r2.mo82013a()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.p6940d.C88483e.m142828c(r1, r2)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0196:
            boolean r6 = r4.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r6 == 0) goto L_0x01aa
            boolean r6 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145453k(r11)     // Catch:{ all -> 0x0922 }
            if (r6 != 0) goto L_0x01aa
            com.google.android.googlequicksearchbox.f r2 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r3 = 1
            r2.mo123333f(r11, r3)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x01aa:
            boolean r6 = m238551m(r11)     // Catch:{ all -> 0x0922 }
            if (r6 == 0) goto L_0x01b8
            r1.m238549k(r11)     // Catch:{ all -> 0x0922 }
            r1.mo123319d(r11)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x01b8:
            java.lang.String r6 = "and.gsa.tng.minus1"
            java.lang.String r8 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r11)     // Catch:{ all -> 0x0922 }
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0922 }
            java.lang.String r8 = "com.google.android.googlequicksearchbox.action.CLASSIC_GSA_VOICE_SEARCH"
            r9 = 3
            java.lang.String r10 = "android.intent.action.MAIN"
            if (r6 != 0) goto L_0x01ed
            java.lang.String r6 = "and.gsa.save"
            java.lang.String r12 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r11)     // Catch:{ all -> 0x0922 }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x0922 }
            if (r6 != 0) goto L_0x01ed
            java.lang.String r6 = "and.gsa.widget.mic"
            java.lang.String r12 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r11)     // Catch:{ all -> 0x0922 }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x0922 }
            if (r6 != 0) goto L_0x01ed
            com.google.common.b.ij r6 = com.google.android.apps.gsa.p5855h.C74533a.f208689a     // Catch:{ all -> 0x0922 }
            android.content.ComponentName r12 = r18.getCallingActivity()     // Catch:{ all -> 0x0922 }
            boolean r6 = r6.contains(r12)     // Catch:{ all -> 0x0922 }
            if (r6 == 0) goto L_0x02e5
        L_0x01ed:
            java.lang.String r6 = r11.getAction()     // Catch:{ all -> 0x0922 }
            boolean r6 = r10.equals(r6)     // Catch:{ all -> 0x0922 }
            if (r6 == 0) goto L_0x02e5
            boolean r6 = r11.hasExtra(r3)     // Catch:{ all -> 0x0922 }
            if (r6 == 0) goto L_0x02e5
            com.google.android.apps.gsa.h.g.d r2 = com.google.android.apps.gsa.h.g.d.c     // Catch:{ ct -> 0x02d3 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x02d3 }
            com.google.protobuf.MessageLite r2 = com.google.protobuf.contrib.android.ProtoParsers.m95519b(r11, r3, r2, r4)     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.h.g.d r2 = (com.google.android.apps.gsa.h.g.d) r2     // Catch:{ ct -> 0x02d3 }
            int r2 = r2.b     // Catch:{ ct -> 0x02d3 }
            int r2 = com.google.android.apps.gsa.p5855h.p5857g.C74536c.m120510a(r2)     // Catch:{ ct -> 0x02d3 }
            if (r2 != 0) goto L_0x0212
            r2 = 1
        L_0x0212:
            int r2 = r2 + -1
            if (r2 == 0) goto L_0x02c3
            r3 = 1
            if (r2 == r3) goto L_0x02a8
            if (r2 == r9) goto L_0x027b
            r3 = 4
            if (r2 == r3) goto L_0x024e
            com.google.android.apps.gsa.shared.monet.h.a r2 = com.google.android.apps.gsa.shared.monet.p7116h.C90332a.TRANSPARENT     // Catch:{ ct -> 0x02d3 }
            com.google.android.libraries.gsa.monet.shared.y r3 = com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90254a.f252113c     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.shared.monet.b.m.a.e r4 = com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90259e.f252122d     // Catch:{ ct -> 0x02d3 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.shared.monet.b.m.a.b r4 = (com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90256b) r4     // Catch:{ ct -> 0x02d3 }
            r4.copyOnWrite()     // Catch:{ ct -> 0x02d3 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.shared.monet.b.m.a.e r5 = (com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90259e) r5     // Catch:{ ct -> 0x02d3 }
            int r6 = r5.f252124a     // Catch:{ ct -> 0x02d3 }
            r7 = 1
            r6 = r6 | r7
            r5.f252124a = r6     // Catch:{ ct -> 0x02d3 }
            r5.f252125b = r7     // Catch:{ ct -> 0x02d3 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.shared.monet.b.m.a.e r4 = (com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90259e) r4     // Catch:{ ct -> 0x02d3 }
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r4 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43556a(r4)     // Catch:{ ct -> 0x02d3 }
            java.lang.String r2 = r2.f252281i     // Catch:{ ct -> 0x02d3 }
            android.content.Intent r2 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146886a(r2, r3, r4)     // Catch:{ ct -> 0x02d3 }
            r1.startActivity(r2)     // Catch:{ ct -> 0x02d3 }
            goto L_0x08e9
        L_0x024e:
            java.lang.String r2 = "reuse_search_now_activity"
            r3 = 0
            boolean r2 = r11.getBooleanExtra(r2, r3)     // Catch:{ ct -> 0x02d3 }
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.search.core.aj.a.a r3 = r3.mo123330c()     // Catch:{ ct -> 0x02d3 }
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x02d3 }
            r5 = 2
            r6 = 0
            android.content.Intent r3 = r3.mo78225h(r5, r6, r4)     // Catch:{ ct -> 0x02d3 }
            if (r2 == 0) goto L_0x0276
            int r2 = r3.getFlags()     // Catch:{ ct -> 0x02d3 }
            r4 = -32769(0xffffffffffff7fff, float:NaN)
            r2 = r2 & r4
            r3.setFlags(r2)     // Catch:{ ct -> 0x02d3 }
            java.lang.String r2 = "reuse_search_now_activity"
            r4 = 1
            r3.putExtra(r2, r4)     // Catch:{ ct -> 0x02d3 }
        L_0x0276:
            r1.startActivity(r3)     // Catch:{ ct -> 0x02d3 }
            goto L_0x08e9
        L_0x027b:
            dagger.a r2 = r1.f395741a     // Catch:{ ct -> 0x02d3 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.shared.util.v.g r2 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r2     // Catch:{ ct -> 0x02d3 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247387gG     // Catch:{ ct -> 0x02d3 }
            boolean r3 = r2.mo85405j(r3)     // Catch:{ ct -> 0x02d3 }
            if (r3 != 0) goto L_0x029f
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250670bO     // Catch:{ ct -> 0x02d3 }
            boolean r2 = r2.mo85405j(r3)     // Catch:{ ct -> 0x02d3 }
            if (r2 == 0) goto L_0x0294
            goto L_0x029f
        L_0x0294:
            r11.setAction(r8)     // Catch:{ ct -> 0x02d3 }
            com.google.android.googlequicksearchbox.f r2 = r1.f395749i     // Catch:{ ct -> 0x02d3 }
            r3 = 2
            r2.mo123333f(r11, r3)     // Catch:{ ct -> 0x02d3 }
            goto L_0x08e9
        L_0x029f:
            java.lang.String r2 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r11)     // Catch:{ ct -> 0x02d3 }
            r1.m238546h(r2)     // Catch:{ ct -> 0x02d3 }
            goto L_0x08e9
        L_0x02a8:
            boolean r2 = r18.m238553o()     // Catch:{ ct -> 0x02d3 }
            if (r2 == 0) goto L_0x02b3
            r18.m238548j()     // Catch:{ ct -> 0x02d3 }
            goto L_0x08e9
        L_0x02b3:
            com.google.common.f.e r2 = f395740k     // Catch:{ ct -> 0x02d3 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ ct -> 0x02d3 }
            java.lang.String r3 = "The Updates tab is disabled"
            r4 = 42102(0xa476, float:5.8997E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ ct -> 0x02d3 }
            goto L_0x08e9
        L_0x02c3:
            com.google.common.f.e r2 = f395740k     // Catch:{ ct -> 0x02d3 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ ct -> 0x02d3 }
            java.lang.String r3 = "Unknown destination"
            r4 = 42101(0xa475, float:5.8996E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ ct -> 0x02d3 }
            goto L_0x08e9
        L_0x02d3:
            r0 = move-exception
            r2 = r0
            com.google.common.f.e r3 = f395740k     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = "Failed to get gateway destination from the intent"
            r5 = 42094(0xa46e, float:5.8986E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x02e5:
            android.net.Uri r3 = r11.getData()     // Catch:{ all -> 0x0922 }
            boolean r3 = com.google.android.apps.gsa.shared.util.C91100u.m148848a(r5, r3)     // Catch:{ all -> 0x0922 }
            java.lang.String r6 = "query"
            if (r3 == 0) goto L_0x0431
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0922 }
            r2.<init>()     // Catch:{ all -> 0x0922 }
            android.os.Bundle r3 = r11.getExtras()     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x0303
            android.os.Bundle r3 = r11.getExtras()     // Catch:{ all -> 0x0922 }
            r2.putExtras(r3)     // Catch:{ all -> 0x0922 }
        L_0x0303:
            android.net.Uri r3 = r11.getData()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = r3.getHost()     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = "cards"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0922 }
            if (r5 == 0) goto L_0x031e
            r2.setAction(r4)     // Catch:{ all -> 0x0922 }
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r4 = 1
            r3.mo123333f(r2, r4)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x031e:
            java.lang.String r4 = "suggest"
            boolean r4 = r4.equals(r3)     // Catch:{ all -> 0x0922 }
            if (r4 == 0) goto L_0x0332
            java.lang.String r3 = "android.search.action.GLOBAL_SEARCH"
            r2.setAction(r3)     // Catch:{ all -> 0x0922 }
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r3.mo123333f(r2, r9)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0332:
            java.lang.String r4 = "referral"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x0426
            android.net.Uri r3 = r11.getData()     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = "referral_id"
            java.lang.String r3 = r3.getQueryParameter(r4)     // Catch:{ all -> 0x0922 }
            android.net.Uri r4 = r11.getData()     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = "followup"
            java.lang.String r4 = r4.getQueryParameter(r5)     // Catch:{ all -> 0x0922 }
            android.net.Uri r5 = r11.getData()     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = r5.getQueryParameter(r6)     // Catch:{ all -> 0x0922 }
            android.net.Uri r7 = r11.getData()     // Catch:{ all -> 0x0922 }
            java.lang.String r8 = "corpus"
            java.lang.String r7 = r7.getQueryParameter(r8)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x03b5
            com.google.common.o.sm r8 = com.google.common.p4552o.C60508sm.f163805c     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.common.o.sl r8 = (com.google.common.p4552o.C60507sl) r8     // Catch:{ all -> 0x0922 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x0922 }
            com.google.common.o.sm r9 = (com.google.common.p4552o.C60508sm) r9     // Catch:{ all -> 0x0922 }
            int r11 = r9.f163807a     // Catch:{ all -> 0x0922 }
            r12 = 1
            r11 = r11 | r12
            r9.f163807a = r11     // Catch:{ all -> 0x0922 }
            r9.f163808b = r3     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r3 = r8.build()     // Catch:{ all -> 0x0922 }
            com.google.common.o.sm r3 = (com.google.common.p4552o.C60508sm) r3     // Catch:{ all -> 0x0922 }
            com.google.common.o.uf r8 = com.google.common.p4552o.C60555uf.f164065cO     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.common.o.tz r8 = (com.google.common.p4552o.C60548tz) r8     // Catch:{ all -> 0x0922 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x0922 }
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9     // Catch:{ all -> 0x0922 }
            int r11 = r9.f164093a     // Catch:{ all -> 0x0922 }
            r12 = 2
            r11 = r11 | r12
            r9.f164093a = r11     // Catch:{ all -> 0x0922 }
            r11 = 758(0x2f6, float:1.062E-42)
            r9.f164258m = r11     // Catch:{ all -> 0x0922 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ all -> 0x0922 }
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9     // Catch:{ all -> 0x0922 }
            r3.getClass()     // Catch:{ all -> 0x0922 }
            r9.f164116aW = r3     // Catch:{ all -> 0x0922 }
            int r3 = r9.f164251f     // Catch:{ all -> 0x0922 }
            r11 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r11
            r9.f164251f = r3     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r3 = r8.build()     // Catch:{ all -> 0x0922 }
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3     // Catch:{ all -> 0x0922 }
            r8 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r3, r8, r8, r8)     // Catch:{ all -> 0x0922 }
        L_0x03b5:
            java.lang.String r3 = "search"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x0408
            r2.setAction(r15)     // Catch:{ all -> 0x0922 }
            if (r5 == 0) goto L_0x03c5
            r2.putExtra(r6, r5)     // Catch:{ all -> 0x0922 }
        L_0x03c5:
            if (r7 == 0) goto L_0x03ca
            r2.putExtra(r13, r7)     // Catch:{ all -> 0x0922 }
        L_0x03ca:
            r1.m238549k(r2)     // Catch:{ b -> 0x03f3 }
            com.google.android.libraries.gsa.monet.shared.InitializationData r3 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146887b(r2)     // Catch:{ b -> 0x03f3 }
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r3 = r3.f63419b     // Catch:{ b -> 0x03f3 }
            com.google.android.apps.gsa.shared.monet.b.v.g r4 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T     // Catch:{ b -> 0x03f3 }
            com.google.protobuf.eb r4 = r4.getParserForType()     // Catch:{ b -> 0x03f3 }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ b -> 0x03f3 }
            r6 = 1
            com.google.protobuf.bv r3 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r3, r4, r5, r6)     // Catch:{ b -> 0x03f3 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r3     // Catch:{ b -> 0x03f3 }
            if (r3 == 0) goto L_0x0403
            boolean r3 = r3.f252200p     // Catch:{ b -> 0x03f3 }
            if (r3 == 0) goto L_0x0403
            j$.util.Optional r3 = p3186j$.util.Optional.empty()     // Catch:{ b -> 0x03f3 }
            r1.m238544f(r2, r3)     // Catch:{ b -> 0x03f3 }
            goto L_0x08e9
        L_0x03f3:
            r0 = move-exception
            r3 = r0
            com.google.common.f.e r4 = f395740k     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = "Failed to get initialization data."
            r6 = 42107(0xa47b, float:5.9004E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x0922 }
        L_0x0403:
            r1.m238545g(r2)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0408:
            java.lang.String r3 = "now_stream"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x041b
            r2.setAction(r10)     // Catch:{ all -> 0x0922 }
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r4 = 1
            r3.mo123333f(r2, r4)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x041b:
            r2.setAction(r10)     // Catch:{ all -> 0x0922 }
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r4 = 1
            r3.mo123333f(r2, r4)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0426:
            r2.setAction(r10)     // Catch:{ all -> 0x0922 }
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r4 = 1
            r3.mo123333f(r2, r4)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0431:
            boolean r3 = r2.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r3 != 0) goto L_0x083a
            boolean r3 = r8.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x043f
            goto L_0x083a
        L_0x043f:
            boolean r2 = r1.m238552n(r11)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x045f
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0922 }
            r2.<init>()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "com.google.android.googlequicksearchbox.TEXT_ASSIST"
            r2.setAction(r3)     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "show_full_bleed_suggest_from_lg_plate"
            r4 = 1
            r2.putExtra(r3, r4)     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "USE_DEFAULT_FINISHING_TRANSITION"
            r2.putExtra(r3, r4)     // Catch:{ all -> 0x0922 }
            r1.startActivity(r2)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x045f:
            java.lang.String r2 = "com.google.android.googlequicksearchbox.MUSIC_SEARCH"
            java.lang.String r3 = r11.getAction()     // Catch:{ all -> 0x0922 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x0514
            java.lang.String r2 = "android.soundsearch.extra.RECOGNIZED_TRACK_MID"
            boolean r2 = r11.hasExtra(r2)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x047b
            java.lang.String r2 = "android.soundsearch.extra.USE_ASSISTANT"
            boolean r2 = r11.hasExtra(r2)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x0514
        L_0x047b:
            java.lang.String r2 = "android.soundsearch.extra.RECOGNIZED_TRACK_MID"
            java.lang.String r2 = r11.getStringExtra(r2)     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "android.soundsearch.extra.RECOGNIZED_TITLE"
            java.lang.String r3 = r11.getStringExtra(r3)     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = "android.soundsearch.extra.RECOGNIZED_ARTIST"
            java.lang.String r4 = r11.getStringExtra(r4)     // Catch:{ all -> 0x0922 }
            android.content.res.Resources r5 = r18.getResources()     // Catch:{ all -> 0x0922 }
            r6 = 2132092511(0x7f15265f, float:1.982542E38)
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.Query r6 = r1.f395745e     // Catch:{ all -> 0x0922 }
            r8 = 0
            r9 = 0
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84245H(r9, r9, r8)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84268aE(r5, r9)     // Catch:{ all -> 0x0922 }
            boolean r8 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0922 }
            if (r8 != 0) goto L_0x04d0
            r2.getClass()
            com.google.android.apps.gsa.shared.search.f r6 = r6.mo84480i()     // Catch:{ all -> 0x0922 }
            boolean r8 = r6.f252965C     // Catch:{ all -> 0x0922 }
            java.lang.String r9 = r6.f252973K     // Catch:{ all -> 0x0922 }
            boolean r9 = android.text.TextUtils.equals(r2, r9)     // Catch:{ all -> 0x0922 }
            r10 = 1
            r9 = r9 ^ r10
            r8 = r8 | r9
            r6.f252965C = r8     // Catch:{ all -> 0x0922 }
            r6.f252973K = r2     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.Query r2 = r6.mo84568a()     // Catch:{ all -> 0x0922 }
            java.lang.String r6 = "android.soundsearch.extra.RECOGNIZED_TITLE"
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo84278aO(r6, r3)     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "android.soundsearch.extra.RECOGNIZED_ARTIST"
            com.google.android.apps.gsa.shared.search.Query r6 = r2.mo84278aO(r3, r4)     // Catch:{ all -> 0x0922 }
        L_0x04d0:
            com.google.android.apps.gsa.search.shared.h.h r2 = new com.google.android.apps.gsa.search.shared.h.h     // Catch:{ all -> 0x0922 }
            r2.<init>()     // Catch:{ all -> 0x0922 }
            r3 = 4
            r2.f236560f = r3     // Catch:{ all -> 0x0922 }
            r3 = 1
            r2.f236497A = r3     // Catch:{ all -> 0x0922 }
            r2.f236568n = r5     // Catch:{ all -> 0x0922 }
            r2.f236565k = r6     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.QueryTriggerType r3 = com.google.android.apps.gsa.shared.search.QueryTriggerType.MUSIC_SEARCH_INTENT     // Catch:{ all -> 0x0922 }
            r2.f236572r = r3     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.bt     // Catch:{ all -> 0x0922 }
            r2.f236556b = r3     // Catch:{ all -> 0x0922 }
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r2.f236512P = r3     // Catch:{ all -> 0x0922 }
            android.os.Bundle r2 = r2.mo81685a()     // Catch:{ all -> 0x0922 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0922 }
            r3.<init>()     // Catch:{ all -> 0x0922 }
            r4 = 268468224(0x10008000, float:2.5342157E-29)
            r3.addFlags(r4)     // Catch:{ all -> 0x0922 }
            android.content.Context r4 = r18.getApplicationContext()     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity"
            r3.setClassName(r4, r5)     // Catch:{ all -> 0x0922 }
            r3.putExtras(r2)     // Catch:{ all -> 0x0922 }
            android.content.Intent r2 = r18.getIntent()     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = "and.opa.lockscreen.nowplaying"
            r2.putExtra(r7, r4)     // Catch:{ all -> 0x0922 }
            r1.startActivity(r3)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0514:
            boolean r2 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145464v(r11)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x0540
            com.google.android.apps.search.soundsearch.b.e r2 = com.google.android.apps.search.soundsearch.p10653b.C141643e.f384462c     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.search.soundsearch.b.b r2 = (com.google.android.apps.search.soundsearch.p10653b.C141640b) r2     // Catch:{ all -> 0x0922 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0922 }
            com.google.android.apps.search.soundsearch.b.e r3 = (com.google.android.apps.search.soundsearch.p10653b.C141643e) r3     // Catch:{ all -> 0x0922 }
            r3.f384465b = r9     // Catch:{ all -> 0x0922 }
            int r4 = r3.f384464a     // Catch:{ all -> 0x0922 }
            r5 = 1
            r4 = r4 | r5
            r3.f384464a = r4     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.search.soundsearch.b.e r2 = (com.google.android.apps.search.soundsearch.p10653b.C141643e) r2     // Catch:{ all -> 0x0922 }
            android.content.Intent r2 = com.google.android.apps.search.soundsearch.p10653b.C141644f.m229859a(r2)     // Catch:{ all -> 0x0922 }
            r1.startActivity(r2)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0540:
            boolean r2 = r15.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x0706
            java.lang.String r2 = "com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x0706
            java.lang.String r2 = "com.google.android.googlequicksearchbox.LAUNCH_GSA"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x0706
            java.lang.String r2 = "android.intent.action.WEB_SEARCH"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x0706
            java.lang.String r2 = "com.google.android.googlequicksearchbox.VOICE_SEARCH_RECORDED_AUDIO"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x0706
            boolean r2 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145453k(r11)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x0706
            boolean r2 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145454l(r11)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x0706
            boolean r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148756i(r11)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x05f9
            boolean r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148755h(r11)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x05ab
            java.lang.String r2 = "android.intent.extra.TEXT"
            java.lang.String r2 = r11.getStringExtra(r2)     // Catch:{ all -> 0x0922 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x059a
            com.google.common.f.e r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.f254322a     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "Got define intent with no text."
            r4 = 11429(0x2ca5, float:1.6015E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0922 }
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0922 }
            goto L_0x05e8
        L_0x059a:
            java.lang.String r3 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148753f(r2, r1)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.b.g r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148751d(r11, r3, r2)     // Catch:{ all -> 0x0922 }
            android.content.Intent r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148748a(r11, r3, r2)     // Catch:{ all -> 0x0922 }
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ all -> 0x0922 }
            goto L_0x05e8
        L_0x05ab:
            boolean r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148757j(r11)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x05e6
            java.lang.String r2 = "android.intent.extra.TEXT"
            java.lang.String r2 = r11.getStringExtra(r2)     // Catch:{ all -> 0x0922 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x05cd
            com.google.common.f.e r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.f254322a     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "Got translate intent with no text."
            r4 = 11430(0x2ca6, float:1.6017E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0922 }
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0922 }
            goto L_0x05e8
        L_0x05cd:
            java.util.Locale r3 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61898bh.m94556a(r11)     // Catch:{ all -> 0x0922 }
            j$.util.Optional r3 = p3186j$.util.Optional.ofNullable(r3)     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148754g(r2, r3, r1)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.b.g r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148752e(r11, r2, r3, r1)     // Catch:{ all -> 0x0922 }
            android.content.Intent r2 = com.google.android.apps.gsa.shared.util.p7175m.C91056b.m148748a(r11, r4, r2)     // Catch:{ all -> 0x0922 }
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ all -> 0x0922 }
            goto L_0x05e8
        L_0x05e6:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x0922 }
        L_0x05e8:
            boolean r3 = r2.mo56113h()     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x08e9
            java.lang.Object r2 = r2.mo56107c()     // Catch:{ all -> 0x0922 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x0922 }
            r1.startActivity(r2)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x05f9:
            java.lang.String r2 = "lobby_initial_tab"
            r3 = 8
            int r2 = r11.getIntExtra(r2, r3)     // Catch:{ all -> 0x0922 }
            r3 = 2
            if (r2 != r3) goto L_0x060f
            boolean r2 = r18.m238553o()     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x060f
            r18.m238548j()     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x060f:
            java.lang.String r2 = "com.google.android.googlequicksearchbox.GENERIC_QUERY"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x06e9
            java.lang.String r2 = r11.getStringExtra(r6)     // Catch:{ all -> 0x0922 }
            boolean r3 = com.google.common.base.C58837ba.m90859h(r2)     // Catch:{ all -> 0x0922 }
            if (r3 == 0) goto L_0x0631
            com.google.common.f.e r2 = f395740k     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "[Generic query action] No query string passed."
            r4 = 42106(0xa47a, float:5.9003E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0631:
            dagger.a r3 = r1.f395741a     // Catch:{ all -> 0x0922 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.util.v.g r3 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r3     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.m.h r4 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251550kt     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = r3.mo85403h(r4)     // Catch:{ all -> 0x0922 }
            com.google.common.b.gu r3 = com.google.android.apps.gsa.shared.p7066m.C89988b.m146551d(r3)     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = "*"
            boolean r4 = r3.contains(r4)     // Catch:{ all -> 0x0922 }
            if (r4 != 0) goto L_0x069e
            java.lang.String r4 = r18.getCallingPackage()     // Catch:{ all -> 0x0922 }
            if (r4 != 0) goto L_0x0661
            com.google.common.f.e r2 = f395740k     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "[Generic query action] No calling activity. Activity should be started using 'startActivityForResult' method from another activity."
            r4 = 42105(0xa479, float:5.9002E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0661:
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0922 }
            if (r3 != 0) goto L_0x0677
            com.google.common.f.e r2 = f395740k     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "[Generic query action] The calling package isn't allowlisted: %s"
            r5 = 42104(0xa478, float:5.9E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r3, r4)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0677:
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ all -> 0x0922 }
            dagger.a r5 = r3.f395767g     // Catch:{ all -> 0x0922 }
            if (r5 != 0) goto L_0x0680
            r3.mo123332e()     // Catch:{ all -> 0x0922 }
        L_0x0680:
            dagger.a r3 = r3.f395767g     // Catch:{ all -> 0x0922 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x0922 }
            com.google.android.gms.common.ac r3 = (com.google.android.gms.common.C143701ac) r3     // Catch:{ all -> 0x0922 }
            boolean r3 = r3.mo119084c(r4)     // Catch:{ all -> 0x0922 }
            if (r3 != 0) goto L_0x069e
            com.google.common.f.e r2 = f395740k     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "[Generic query action] The calling package isn't Google signed: %s"
            r5 = 42103(0xa477, float:5.8999E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r3, r4)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x069e:
            java.lang.String r3 = "full_screen"
            r4 = 0
            boolean r3 = r11.getBooleanExtra(r3, r4)     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = "keyboard_input"
            boolean r5 = r11.getBooleanExtra(r5, r4)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.h.h r4 = new com.google.android.apps.gsa.search.shared.h.h     // Catch:{ all -> 0x0922 }
            r4.<init>()     // Catch:{ all -> 0x0922 }
            r6 = 1
            if (r6 == r5) goto L_0x06b5
            r5 = 4
            goto L_0x06b6
        L_0x06b5:
            r5 = 1
        L_0x06b6:
            r4.f236560f = r5     // Catch:{ all -> 0x0922 }
            r4.f236497A = r3     // Catch:{ all -> 0x0922 }
            r4.f236568n = r2     // Catch:{ all -> 0x0922 }
            r2 = 335544320(0x14000000, float:6.4623485E-27)
            r4.f236512P = r2     // Catch:{ all -> 0x0922 }
            android.os.Bundle r2 = r4.mo81685a()     // Catch:{ all -> 0x0922 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0922 }
            r3.<init>()     // Catch:{ all -> 0x0922 }
            r4 = 268468224(0x10008000, float:2.5342157E-29)
            r3.addFlags(r4)     // Catch:{ all -> 0x0922 }
            android.content.Context r4 = r18.getApplicationContext()     // Catch:{ all -> 0x0922 }
            java.lang.String r5 = "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity"
            r3.setClassName(r4, r5)     // Catch:{ all -> 0x0922 }
            r3.putExtras(r2)     // Catch:{ all -> 0x0922 }
            android.content.Intent r2 = r18.getIntent()     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = "and.opa.generic_query"
            r2.putExtra(r7, r4)     // Catch:{ all -> 0x0922 }
            r1.startActivity(r3)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x06e9:
            boolean r2 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145466x(r11)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x06fe
            boolean r2 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145460r(r11)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x06f6
            goto L_0x06fe
        L_0x06f6:
            boolean r2 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145467y(r11)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x06ff
            r9 = 2
            goto L_0x06ff
        L_0x06fe:
            r9 = 1
        L_0x06ff:
            com.google.android.googlequicksearchbox.f r2 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r2.mo123333f(r11, r9)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0706:
            java.lang.String r2 = "weather"
            android.os.Bundle r3 = r11.getExtras()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = r3.getString(r6)     // Catch:{ all -> 0x0922 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x07d9
            android.os.Bundle r2 = r11.getExtras()     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "extra_is_fallback_intent"
            boolean r2 = r2.getBoolean(r3)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x07d9
            com.google.android.apps.gsa.shared.search.b.g r2 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145448f(r11)     // Catch:{ all -> 0x0922 }
            if (r2 != 0) goto L_0x07d9
            com.google.ch.b.j r2 = com.google.p4481ch.p4485b.C58095j.f155284e     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.ch.b.g r2 = (com.google.p4481ch.p4485b.C58092g) r2     // Catch:{ all -> 0x0922 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0922 }
            com.google.ch.b.j r3 = (com.google.p4481ch.p4485b.C58095j) r3     // Catch:{ all -> 0x0922 }
            r4 = 19
            r3.f155287b = r4     // Catch:{ all -> 0x0922 }
            int r4 = r3.f155286a     // Catch:{ all -> 0x0922 }
            r6 = 1
            r4 = r4 | r6
            r3.f155286a = r4     // Catch:{ all -> 0x0922 }
            com.google.protos.ar.a.b r3 = com.google.protos.p4881ar.p4882a.C63771b.f172510a     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.protos.ar.a.a r3 = (com.google.protos.p4881ar.p4882a.C63770a) r3     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bt r4 = com.google.knowledge.p4682d.C61993d.f167537b     // Catch:{ all -> 0x0922 }
            com.google.knowledge.d.d r6 = com.google.knowledge.p4682d.C61993d.f167536a     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.knowledge.d.c r6 = (com.google.knowledge.p4682d.C61992c) r6     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bt r7 = com.google.knowledge.p4682d.C61996g.f167542a     // Catch:{ all -> 0x0922 }
            com.google.knowledge.a.a.n r8 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.knowledge.a.a.m r8 = (com.google.knowledge.p4661a.p4662a.C61751m) r8     // Catch:{ all -> 0x0922 }
            java.lang.String r9 = "Weather"
            r8.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x0922 }
            com.google.knowledge.a.a.n r10 = (com.google.knowledge.p4661a.p4662a.C61752n) r10     // Catch:{ all -> 0x0922 }
            int r12 = r10.f166810a     // Catch:{ all -> 0x0922 }
            r13 = 4
            r12 = r12 | r13
            r10.f166810a = r12     // Catch:{ all -> 0x0922 }
            r10.f166811b = r9     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x0922 }
            com.google.knowledge.a.a.n r8 = (com.google.knowledge.p4661a.p4662a.C61752n) r8     // Catch:{ all -> 0x0922 }
            r6.mo58885m(r7, r8)     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ all -> 0x0922 }
            com.google.knowledge.d.d r6 = (com.google.knowledge.p4682d.C61993d) r6     // Catch:{ all -> 0x0922 }
            r3.mo58885m(r4, r6)     // Catch:{ all -> 0x0922 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0922 }
            com.google.ch.b.j r4 = (com.google.p4481ch.p4485b.C58095j) r4     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x0922 }
            com.google.protos.ar.a.b r3 = (com.google.protos.p4881ar.p4882a.C63771b) r3     // Catch:{ all -> 0x0922 }
            r3.getClass()     // Catch:{ all -> 0x0922 }
            r4.f155289d = r3     // Catch:{ all -> 0x0922 }
            int r3 = r4.f155286a     // Catch:{ all -> 0x0922 }
            r6 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r6
            r4.f155286a = r3     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0922 }
            com.google.ch.b.j r2 = (com.google.p4481ch.p4485b.C58095j) r2     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.b.g r3 = com.google.android.apps.gsa.shared.search.p7138b.C90491g.f252884z     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.b.e r3 = (com.google.android.apps.gsa.shared.search.p7138b.C90489e) r3     // Catch:{ all -> 0x0922 }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x0922 }
            int r4 = r2.length     // Catch:{ all -> 0x0922 }
            byte[] r2 = com.google.common.util.C60789b.m92791a(r2, r4)     // Catch:{ all -> 0x0922 }
            com.google.common.l.i r4 = com.google.common.p4541l.C59326i.f157517e     // Catch:{ all -> 0x0922 }
            com.google.common.l.i r4 = r4.mo56826f()     // Catch:{ all -> 0x0922 }
            int r6 = r2.length     // Catch:{ all -> 0x0922 }
            java.lang.String r2 = r4.mo56837l(r2, r6)     // Catch:{ all -> 0x0922 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.b.g r4 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r4     // Catch:{ all -> 0x0922 }
            int r6 = r4.f252886a     // Catch:{ all -> 0x0922 }
            r7 = 2
            r6 = r6 | r7
            r4.f252886a = r6     // Catch:{ all -> 0x0922 }
            r4.f252888c = r2     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r2 = r3.build()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.search.b.g r2 = (com.google.android.apps.gsa.shared.search.p7138b.C90491g) r2     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "search-options-proto"
            java.lang.String r2 = com.google.android.apps.gsa.shared.search.C90506n.m147606a(r2)     // Catch:{ all -> 0x0922 }
            r11.putExtra(r3, r2)     // Catch:{ all -> 0x0922 }
        L_0x07d9:
            boolean r2 = r15.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x0835
            r1.m238549k(r11)     // Catch:{ all -> 0x0922 }
            com.google.android.libraries.gsa.monet.shared.InitializationData r2 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146887b(r11)     // Catch:{ b -> 0x0820 }
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r2 = r2.f63419b     // Catch:{ b -> 0x0820 }
            com.google.android.apps.gsa.shared.monet.b.v.g r3 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T     // Catch:{ b -> 0x0820 }
            com.google.protobuf.eb r3 = r3.getParserForType()     // Catch:{ b -> 0x0820 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ b -> 0x0820 }
            r5 = 1
            com.google.protobuf.bv r2 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r2, r3, r4, r5)     // Catch:{ b -> 0x0820 }
            com.google.android.apps.gsa.shared.monet.b.v.g r2 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r2     // Catch:{ b -> 0x0820 }
            if (r2 == 0) goto L_0x081b
            boolean r3 = r2.f252200p     // Catch:{ b -> 0x0820 }
            if (r3 == 0) goto L_0x081b
            int r2 = r2.f252188d     // Catch:{ b -> 0x0820 }
            int r2 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90290f.m146824a(r2)     // Catch:{ b -> 0x0820 }
            if (r2 != 0) goto L_0x0808
            goto L_0x080b
        L_0x0808:
            r3 = 1
            if (r2 != r3) goto L_0x081b
        L_0x080b:
            boolean r2 = r11.hasExtra(r14)     // Catch:{ b -> 0x0820 }
            if (r2 == 0) goto L_0x0812
            goto L_0x081b
        L_0x0812:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()     // Catch:{ b -> 0x0820 }
            r1.m238544f(r11, r2)     // Catch:{ b -> 0x0820 }
            goto L_0x08e9
        L_0x081b:
            r1.m238545g(r11)     // Catch:{ b -> 0x0820 }
            goto L_0x08e9
        L_0x0820:
            r0 = move-exception
            r2 = r0
            com.google.common.f.e r3 = f395740k     // Catch:{ all -> 0x0922 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0922 }
            java.lang.String r4 = "Failed to get initialization data."
            r5 = 42092(0xa46c, float:5.8983E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x0922 }
            r1.m238545g(r11)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0835:
            r1.m238545g(r11)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x083a:
            com.google.android.googlequicksearchbox.f r3 = r1.f395749i     // Catch:{ all -> 0x0922 }
            dagger.a r4 = r3.f395768h     // Catch:{ all -> 0x0922 }
            if (r4 != 0) goto L_0x0843
            r3.mo123332e()     // Catch:{ all -> 0x0922 }
        L_0x0843:
            dagger.a r3 = r3.f395768h     // Catch:{ all -> 0x0922 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.shared.bisto.d r3 = (com.google.android.apps.gsa.shared.bisto.C89649d) r3     // Catch:{ all -> 0x0922 }
            boolean r3 = r3.mo83540a(r11)     // Catch:{ all -> 0x0922 }
            if (r3 != 0) goto L_0x08e9
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x0895
            com.google.android.googlequicksearchbox.f r2 = r1.f395749i     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.assistant.shared.bm r2 = r2.mo123328a()     // Catch:{ all -> 0x0922 }
            boolean r2 = r2.u()     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x0895
            com.google.android.apps.gsa.search.shared.service.b.aaj r2 = com.google.android.apps.gsa.search.shared.service.p6935b.aaj.f237075i     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.b.aai r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.aai) r2     // Catch:{ all -> 0x0922 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.b.aaj r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.aaj) r3     // Catch:{ all -> 0x0922 }
            int r4 = r3.f237077a     // Catch:{ all -> 0x0922 }
            r5 = 4
            r4 = r4 | r5
            r3.f237077a = r4     // Catch:{ all -> 0x0922 }
            r4 = 1
            r3.f237080d = r4     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.b.aaj r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.aaj) r2     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.VOICE_SEARCH_HANDS_FREE     // Catch:{ all -> 0x0922 }
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)     // Catch:{ all -> 0x0922 }
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.aah.f237074a     // Catch:{ all -> 0x0922 }
            r3.mo82014b(r4, r2)     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.ClientEventData r2 = r3.mo82013a()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.shared.service.p6940d.C88483e.m142828c(r1, r2)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x0895:
            com.google.android.googlequicksearchbox.f r2 = r1.f395749i     // Catch:{ all -> 0x0922 }
            r3 = 2
            r2.mo123333f(r11, r3)     // Catch:{ all -> 0x0922 }
            goto L_0x08e9
        L_0x089c:
            r8 = 0
            boolean r2 = r6.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x08c8
            com.google.android.googlequicksearchbox.f r2 = r1.f395749i     // Catch:{ all -> 0x0922 }
            dagger.a r3 = r2.f395763c     // Catch:{ all -> 0x0922 }
            if (r3 != 0) goto L_0x08ac
            r2.mo123332e()     // Catch:{ all -> 0x0922 }
        L_0x08ac:
            dagger.a r3 = r2.f395764d     // Catch:{ all -> 0x0922 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.core.google.cw r3 = (com.google.android.apps.gsa.search.core.google.C85929cw) r3     // Catch:{ all -> 0x0922 }
            dagger.a r2 = r2.f395763c     // Catch:{ all -> 0x0922 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x0922 }
            com.google.android.apps.gsa.search.core.i.z r2 = (com.google.android.apps.gsa.search.core.p6805i.C86130z) r2     // Catch:{ all -> 0x0922 }
            r4 = 2132093027(0x7f152863, float:1.9826467E38)
            java.lang.String r2 = r2.mo79764c(r4)     // Catch:{ all -> 0x0922 }
            android.net.Uri r8 = r3.mo79562a(r2)     // Catch:{ all -> 0x0922 }
            goto L_0x08dd
        L_0x08c8:
            boolean r2 = r9.equals(r5)     // Catch:{ all -> 0x0922 }
            if (r2 == 0) goto L_0x08dd
            android.content.res.Resources r2 = r18.getResources()     // Catch:{ all -> 0x0922 }
            r3 = 2132091637(0x7f1522f5, float:1.9823648E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x0922 }
            android.net.Uri r8 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0922 }
        L_0x08dd:
            if (r8 == 0) goto L_0x08e9
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0922 }
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3, r8)     // Catch:{ all -> 0x0922 }
            r1.startActivity(r2)     // Catch:{ all -> 0x0922 }
        L_0x08e9:
            if (r16 == 0) goto L_0x08ee
            r16.close()
        L_0x08ee:
            android.content.Intent r2 = r18.getIntent()
            boolean r3 = m238551m(r2)
            if (r3 != 0) goto L_0x090c
            dagger.a r3 = r1.f395747g
            java.lang.Object r3 = r3.mo27525b()
            com.google.common.util.concurrent.db r3 = (com.google.common.util.concurrent.C60888db) r3
            com.google.android.googlequicksearchbox.b r4 = new com.google.android.googlequicksearchbox.b
            r4.<init>(r1, r2)
            r5 = 3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r3.mo29164d(r4, r5, r2)
        L_0x090c:
            r18.finish()
            com.google.android.apps.gsa.shared.s.a.a r2 = r1.f395743c
            boolean r2 = r2.mo84225b()
            if (r2 == 0) goto L_0x091c
            com.google.android.apps.gsa.shared.s.a.a r2 = r1.f395743c
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148696b(r2)
        L_0x091c:
            return
        L_0x091d:
            r0 = move-exception
            r16 = r9
            r2 = r0
            throw r2     // Catch:{ all -> 0x0922 }
        L_0x0922:
            r0 = move-exception
            goto L_0x0927
        L_0x0924:
            r0 = move-exception
            r16 = r9
        L_0x0927:
            r2 = r0
        L_0x0928:
            if (r16 == 0) goto L_0x0948
            r16.close()     // Catch:{ all -> 0x092e }
            goto L_0x0948
        L_0x092e:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0948 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r6 = 0
            r5[r6] = r4     // Catch:{ Exception -> 0x0948 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x0948 }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0948 }
            r5[r6] = r3     // Catch:{ Exception -> 0x0948 }
            r4.invoke(r2, r5)     // Catch:{ Exception -> 0x0948 }
        L_0x0948:
            goto L_0x094a
        L_0x0949:
            throw r2
        L_0x094a:
            goto L_0x0949
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.googlequicksearchbox.LegacySearchActivity.onCreate(android.os.Bundle):void");
    }

    public final void startActivity(Intent intent) {
        intent.putExtra("source", C39193b.m68624a(getIntent()));
        super.startActivity(intent);
        m238547i(intent);
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        intent.putExtra("source", C39193b.m68624a(getIntent()));
        super.startActivity(intent, bundle);
        m238547i(intent);
    }
}
