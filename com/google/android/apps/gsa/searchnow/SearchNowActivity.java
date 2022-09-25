package com.google.android.apps.gsa.searchnow;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.binaries.satin.app.alo;
import com.google.android.apps.gsa.binaries.satin.app.alq;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.ars;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.plugins.p6468a.p6471c.C84058a;
import com.google.android.apps.gsa.search.shared.overlay.C87663l;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87625ad;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87676ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.searchplate.p6966d.C88937i;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.monet.C90164ae;
import com.google.android.apps.gsa.shared.monet.C90347r;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.p6993ao.C89249n;
import com.google.android.apps.gsa.shared.p6993ao.C89252q;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7066m.C90115fm;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.C90704p;
import com.google.android.apps.gsa.shared.p7148ui.C90705q;
import com.google.android.apps.gsa.shared.search.C90492c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91750f;
import com.google.android.apps.gsa.sidekick.shared.util.C91974ay;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108502d;
import com.google.android.apps.gsa.staticplugins.opa.continuation.C108508j;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139694a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21374d;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59668bv;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60547ty;
import com.google.p375ai.p378b.C7891nu;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68225k;
import dagger.p5294a.C68226l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class SearchNowActivity extends C90705q implements C88863ao {

    /* renamed from: o */
    private static final C60547ty f240548o = C60547ty.SEARCH_NOW_ACTIVITY;

    /* renamed from: j */
    public C88868e f240549j;

    /* renamed from: k */
    public C58833ax f240550k;

    /* renamed from: l */
    public C21370a f240551l;

    /* renamed from: m */
    C88867d f240552m;

    /* renamed from: n */
    public Bundle f240553n;

    /* renamed from: p */
    private boolean f240554p = false;

    public SearchNowActivity() {
        super("SearchNowActivity", f240548o);
        C31499r.f84816a.mo37198b(SystemClock.elapsedRealtime());
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C88867d dVar = this.f240552m;
        C91006f f = C91006f.m148645f(dVar.f240638e);
        f.mo85286m(dVar.f240635b);
        f.mo85295u(printWriter, str);
    }

    /* renamed from: f */
    public final void mo76884f() {
        finish();
    }

    public final void finish() {
        super.finish();
        C88867d dVar = this.f240552m;
        if (dVar.f240634a.getIntent().getBooleanExtra("SKIP_EXIT_ANIMATION", false)) {
            dVar.f240634a.overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: gy */
    public final void mo82632gy() {
        C87625ad adVar = this.f240552m.f240635b.f240603d;
        if (adVar != null) {
            C87663l lVar = adVar.f236837an;
            C58976aa aaVar = C58975e.f156826a;
            lVar.f236915a = false;
            lVar.f236936e = false;
            lVar.f236937f = false;
            lVar.f236938g = false;
            lVar.f236939h = false;
            lVar.f236943l = false;
            lVar.f236944m = false;
            lVar.f236940i = false;
            lVar.f236941j = false;
            lVar.f236942k = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C88867d dVar = this.f240552m;
        C88861am amVar = dVar.f240635b;
        C87676ad adVar = amVar.f240584N;
        adVar.mo81955a(i, i2, intent, adVar.f237014b);
        C90730an.m148190c(amVar.f240609j, new C88884u(i, i2, intent));
        C91090a aVar = (C91090a) dVar.f240636c.mo27525b();
        aVar.mo85356g(i, i2, intent, aVar.f254379a);
    }

    public final void onBackPressed() {
        ((C90347r) ((C58847bk) this.f240552m.f240635b.f240609j).f156646a).mo84036g();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        C74504a.m120462a(f.G);
        Duration ofNanos = Duration.ofNanos(C21374d.m40426a());
        Bundle b = C90704p.m148107b(bundle);
        setIntent(C90704p.m148106a(getIntent()));
        C90730an.m148190c(C88871h.m144313a(getIntent(), false, false), new C88865b(this));
        int i = 1;
        if (!this.f240554p) {
            this.f240554p = true;
            alo rQ = ((C88866c) C47266f.m84076a(this, C88866c.class)).mo82656rQ();
            rQ.f197569b = this;
            C68225k.m98529a(rQ.f197569b, SearchNowActivity.class);
            alq alq = new alq(rQ.f197568a, rQ.f197569b);
            C69464a aVar = alq.f197598aB;
            C69464a a = C68226l.m98533a(alq.f197640f);
            C69464a a2 = C68226l.m98533a(alq.f197623an);
            aqy aqy = alq.f197636b;
            C69464a aVar2 = aqy.r;
            ars ars = aqy.b;
            this.f240549j = new C88868e(aVar, a, a2, aVar2, ars.f200017be, ars.f200020bh);
            this.f240550k = C58833ax.m90834k(alq.f197636b.b.mo67304bO());
            this.f240551l = (C21370a) alq.f197636b.i.mo17428b();
        }
        ((C139694a) ((C58847bk) this.f240550k).f156646a).mo115168a(this);
        super.onCreate(b);
        this.f240553n = b;
        if (getIntent() != null && getIntent().getBooleanExtra("eager_application_initializer", false)) {
            ((C90492c) getApplication()).mo65451d();
        }
        setContentView((int) R.layout.search_now_overlay);
        C88868e eVar = this.f240549j;
        C88861am amVar = (C88861am) eVar.f240641a.mo17428b();
        amVar.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) eVar.f240642b).f184585a);
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) eVar.f240643c).f184585a);
        a4.getClass();
        C90476a aVar3 = (C90476a) eVar.f240644d.mo17428b();
        aVar3.getClass();
        C58833ax axVar = (C58833ax) eVar.f240645e.mo17428b();
        axVar.getClass();
        C38802e eVar2 = (C38802e) eVar.f240646f.mo17428b();
        eVar2.getClass();
        C88867d dVar = new C88867d(this, amVar, a3, a4, aVar3, axVar, eVar2);
        this.f240552m = dVar;
        C60547ty tyVar = f240548o;
        dVar.f240634a.getWindow().getDecorView().setSystemUiVisibility(dVar.f240634a.getWindow().getDecorView().getSystemUiVisibility() | 1792);
        if (b == null) {
            C58833ax axVar2 = dVar.f240639f;
            if (axVar2.mo56113h()) {
                Activity activity = dVar.f240634a;
                ((C89922b) axVar2.mo56107c()).mo83758b(tyVar, activity.getClass(), C58833ax.m90834k(activity.getIntent()), ofNanos.toMillis(), false);
            }
            dVar.f240640g.mo41627a(ofNanos, dVar.f240634a);
        }
        C88861am amVar2 = dVar.f240635b;
        dVar.f240634a.getIntent();
        SearchNowDrawerLayout searchNowDrawerLayout = amVar2.f240607h;
        searchNowDrawerLayout.f253547j.add(new C88878o(amVar2));
        dVar.f240635b.mo82647h(dVar.f240634a.getIntent(), b, true);
        C88861am amVar3 = dVar.f240635b;
        Intent intent = dVar.f240634a.getIntent();
        long nanos = ofNanos.toNanos();
        if (intent != null && b == null && amVar3.mo82641a(intent, (Bundle) null, true) == C90208n.INTERESTS_TAB && ((extras = intent.getExtras()) == null || ((C57315dp) C90734ar.m148199b(extras, "notification_pinned_content_token", C57315dp.f152986c.getParserForType())) == null)) {
            C91656e eVar3 = amVar3.f240625z.f240556a;
            eVar3.mo86042g(nanos, C89849ae.FEED_LAUNCH_START, C89849ae.FEED_LAUNCH_TIMEOUT, (C59687cb) C91656e.m149938b(eVar3.f255622i).build());
        }
        WindowManager.LayoutParams attributes = dVar.f240634a.getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 30) {
            i = 3;
        }
        attributes.layoutInDisplayCutoutMode = i;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        C88867d dVar = this.f240552m;
        C88861am amVar = dVar.f240635b;
        boolean isChangingConfigurations = dVar.f240634a.isChangingConfigurations();
        amVar.f240603d.f236773C.mo81941m(amVar.f240623x, C88244um.INIT_NOW_UI, C88244um.FORCE_CLOSE);
        for (C89252q qVar : ((C89249n) amVar.f240616q).f242000b.f242007a.values()) {
            qVar.f242009b = true;
            qVar.f242010c = 0.0f;
        }
        C90164ae aeVar = amVar.f240610k;
        aeVar.f251927a = null;
        aeVar.mo83912a();
        C90164ae aeVar2 = amVar.f240611l;
        aeVar2.f251927a = null;
        aeVar2.mo83912a();
        C90164ae aeVar3 = amVar.f240612m;
        aeVar3.f251927a = null;
        aeVar3.mo83912a();
        C90164ae aeVar4 = amVar.f240613n;
        aeVar4.f251927a = null;
        aeVar4.mo83912a();
        C90164ae aeVar5 = amVar.f240614o;
        aeVar5.f251927a = null;
        aeVar5.mo83912a();
        amVar.f240603d.mo81809ap();
        amVar.f240625z.f240556a.f255623j = isChangingConfigurations;
        amVar.f240584N.mo81957c();
        C90730an.m148190c(amVar.f240609j, C88877n.f240652a);
        if (amVar.f240618s) {
            C108508j jVar = (C108508j) amVar.f240617r;
            if (jVar.f301911c != null) {
                jVar.f301916h.cancel(true);
                jVar.f301911c = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        r0 = r0.f236844au;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNewIntent(android.content.Intent r5) {
        /*
            r4 = this;
            android.content.Intent r0 = com.google.android.apps.gsa.shared.p7148ui.C90704p.m148106a(r5)
            r4.setIntent(r0)
            java.lang.String r0 = "reuse_search_now_activity"
            r1 = 0
            boolean r5 = r5.getBooleanExtra(r0, r1)
            if (r5 == 0) goto L_0x0036
            android.content.Intent r5 = r4.getIntent()
            com.google.android.apps.gsa.searchnow.d r0 = r4.f240552m
            com.google.android.apps.gsa.searchnow.am r0 = r0.f240635b
            com.google.android.apps.gsa.search.shared.overlay.a.ad r0 = r0.f240603d
            r2 = 1
            if (r0 == 0) goto L_0x0029
            com.google.android.apps.gsa.shared.search.Query r0 = r0.f236844au
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.mo84426dG()
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            com.google.common.base.ax r5 = com.google.android.apps.gsa.searchnow.C88871h.m144313a(r5, r2, r0)
            com.google.android.apps.gsa.searchnow.b r0 = new com.google.android.apps.gsa.searchnow.b
            r0.<init>(r4)
            com.google.android.apps.gsa.shared.util.C90730an.m148190c(r5, r0)
        L_0x0036:
            android.content.Intent r5 = r4.getIntent()
            super.onNewIntent(r5)
            com.google.common.base.ax r5 = r4.f240550k
            com.google.common.base.bk r5 = (com.google.common.base.C58847bk) r5
            java.lang.Object r5 = r5.f156646a
            com.google.android.apps.search.googleapp.t.c.a r5 = (com.google.android.apps.search.googleapp.p10516t.p10519c.C139694a) r5
            r5.mo115168a(r4)
            com.google.android.apps.gsa.searchnow.d r5 = r4.f240552m
            android.content.Intent r0 = r4.getIntent()
            com.google.common.base.ax r2 = r5.f240639f
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.shared.logger.i.b r2 = (com.google.android.apps.gsa.shared.logger.p7064i.C89922b) r2
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ACTIVITY_ON_INTENT
            r2.mo83763g(r3)
        L_0x0061:
            com.google.android.apps.gsa.searchnow.am r5 = r5.f240635b
            r2 = 0
            r5.mo82647h(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchnow.SearchNowActivity.onNewIntent(android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        C88867d dVar = this.f240552m;
        C88861am amVar = dVar.f240635b;
        dVar.f240634a.isChangingConfigurations();
        C90730an.m148190c(amVar.f240609j, C88880q.f240655a);
        C88861am amVar2 = dVar.f240635b;
        boolean isChangingConfigurations = dVar.f240634a.isChangingConfigurations();
        amVar2.f240606g.mo82655a(2, false);
        amVar2.f240603d.mo81808ao();
        C88848a aVar = amVar2.f240625z;
        if (isChangingConfigurations) {
            aVar.f240556a.mo86057v(103);
        } else {
            aVar.f240556a.mo86057v(2);
        }
        aVar.f240556a.f255623j = isChangingConfigurations;
        if (amVar2.mo82652m() && (amVar2.f240619t || amVar2.f240620u)) {
            amVar2.f240602c.mo76884f();
        }
        amVar2.f240582L = null;
        C90730an.m148190c(amVar2.f240609j, C88881r.f240656a);
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C88861am amVar = this.f240552m.f240635b;
        amVar.f240603d.mo81787T(bundle);
        if (bundle != null) {
            amVar.mo82644e(bundle);
            Parcelable parcelable = null;
            amVar.f240575E = null;
            amVar.f240581K = bundle.getBoolean("search_now_overlay:has-sent-opt-in", false);
            C87676ad adVar = amVar.f240584N;
            Bundle bundle2 = bundle.getBundle("activity_starter_bundle");
            if (bundle2 != null) {
                parcelable = bundle2.getParcelable("activity_starter_extra_data");
            }
            adVar.f237014b = parcelable;
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((C91075b) this.f240552m.f240637d.mo27525b()).mo85347b(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        boolean z;
        super.onResume();
        C88867d dVar = this.f240552m;
        C88861am amVar = dVar.f240635b;
        amVar.f240606g.mo82655a(2, true);
        Intent intent = amVar.f240575E;
        if (intent != null) {
            z = intent.getBooleanExtra("use-consistent-resume", false) && !amVar.mo82651l();
            if (!z) {
                amVar.f240603d.mo81802ai();
            }
        } else {
            z = false;
        }
        amVar.f240603d.mo81788U();
        Intent intent2 = amVar.f240575E;
        if (intent2 != null) {
            if (!amVar.f240581K && C91750f.m150308a(intent2, C84058a.m133962a(intent2)) && amVar.f240603d.f236773C != null) {
                amVar.f240581K = true;
                amVar.f240603d.f236773C.mo81937i(C91974ay.m150930a(C7891nu.FIRST_RUN));
            }
            if (!amVar.mo82652m() || (z && amVar.f240593W)) {
                amVar.f240603d.mo81817m(true);
                C87625ad adVar = amVar.f240603d;
                adVar.f236793W = true;
                adVar.mo17500a();
                amVar.f240603d.mo81817m(false);
                C89838ab.m146259c(0);
            } else if (amVar.f240580J) {
                String a = C39193b.m68624a(intent2);
                if (intent2.getBooleanExtra("launch-from-google-app-activity", false)) {
                    ((C89859i) amVar.f240574D.mo27525b()).mo83702b(C89849ae.SEARCH_WIDGET_MIC_TAP);
                } else if ("and.gsa.widget.mic".equals(a)) {
                    ((C89859i) amVar.f240574D.mo27525b()).mo83702b(C89849ae.QSB_MIC_TAP);
                } else if ("and.gsa.voice.search.icon".equals(a)) {
                    ((C89859i) amVar.f240574D.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_ICON_TAP);
                } else if ("and.gsa.launcher.shortcut.voice".equals(a)) {
                    ((C89859i) amVar.f240574D.mo27525b()).mo83702b(C89849ae.VOICE_SEARCH_ICON_SHORTCUT_TAP);
                } else if ("and.gsa.monet.minus1".equals(a)) {
                    ((C89859i) amVar.f240574D.mo27525b()).mo83702b(C89849ae.MINUS_ONE_SEARCH_BOX_MIC_TAP);
                } else if ("and.gsa.tng.minus1".equals(a)) {
                    ((C89859i) amVar.f240574D.mo27525b()).mo83702b(C89849ae.ACETONE_SEARCH_BOX_MIC_TAP);
                }
                if (amVar.f240622w.mo85405j(C90115fm.f250734a)) {
                    amVar.f240603d.mo81770C(QueryTriggerType.SEARCH_WIDGET_MIC);
                } else {
                    amVar.f240603d.mo81770C((QueryTriggerType) null);
                }
            } else {
                amVar.f240603d.mo81827w(C89429a.m145442D(intent2, amVar.f240608i, (C58881cr) null).mo84272aI(amVar.f240578H), false);
                amVar.f240603d.mo81820p(true);
            }
        }
        if (amVar.mo82653n()) {
            amVar.f240603d.f236793W = false;
        } else {
            C87625ad adVar2 = amVar.f240603d;
            if (!adVar2.f236799aB) {
                if (adVar2.f236834ak) {
                    adVar2.mo81775H();
                } else {
                    adVar2.f236800aC = true;
                }
            }
        }
        amVar.mo82650k();
        amVar.f240575E = null;
        amVar.mo82649j();
        amVar.f240619t = false;
        amVar.f240620u = false;
        C90730an.m148190c(amVar.f240609j, C88887x.f240664a);
        C90208n nVar = amVar.f240583M;
        if (nVar != null) {
            amVar.f240616q.mo83201a(nVar);
        }
        Query query = amVar.f240582L;
        if (query != null && !query.mo84418cy() && !query.mo84335bT()) {
            Query query2 = amVar.f240582L;
            query2.getClass();
            ((SearchPlate) amVar.f240603d.f236879u.findViewById(R.id.search_plate)).mo82681n(C88937i.m144544a(query2), true);
            amVar.f240603d.mo81797ad(4, 0, true);
        }
        amVar.f240582L = null;
        C90730an.m148190c(dVar.f240635b.f240609j, C88886w.f240663a);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C88867d dVar = this.f240552m;
        C88861am amVar = dVar.f240635b;
        amVar.f240603d.mo81789V(bundle);
        bundle.putBoolean("search_now_overlay:launched_in_text_search_mode", amVar.f240579I);
        bundle.putBoolean("search_now_overlay:launched_in_voice_search_mode", amVar.f240580J);
        bundle.putBoolean("search_now_overlay:search_mode_ended", amVar.f240593W);
        bundle.putBoolean("search_now_overlay:has-sent-opt-in", amVar.f240581K);
        C87676ad adVar = amVar.f240584N;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("activity_starter_extra_data", adVar.f237014b);
        bundle.putBundle("activity_starter_bundle", bundle2);
        C90208n nVar = amVar.f240583M;
        if (nVar != null) {
            bundle.putInt("search_now_overlay:initial_tab_type", nVar.f251999l);
        }
        C90730an.m148190c(amVar.f240609j, new C88888y(bundle));
        C87673aa i = dVar.f240635b.f240603d.mo81813i();
        if (i != null) {
            i.mo81942n(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        ViewGroup viewGroup;
        Duration ofNanos = Duration.ofNanos(this.f240551l.mo26872d());
        super.onStart();
        C88867d dVar = this.f240552m;
        C88861am amVar = dVar.f240635b;
        amVar.f240603d.mo81790W();
        amVar.mo82650k();
        C90730an.m148190c(amVar.f240609j, C88883t.f240658a);
        if (amVar.f240618s && (viewGroup = ((C108508j) amVar.f240617r).f301911c) != null) {
            C2043bi.m5555ai(viewGroup, C108502d.f301899a);
        }
        dVar.f240640g.mo41628b(ofNanos, dVar.f240634a);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C58833ax axVar = this.f240552m.f240639f;
        if (axVar.mo56113h()) {
            ((C89922b) axVar.mo56107c()).mo83761e(C59668bv.STARTUP_CANCEL_ACTIVITY_STOPPED);
        }
        super.onStop();
        C88867d dVar = this.f240552m;
        C88861am amVar = dVar.f240635b;
        boolean isChangingConfigurations = dVar.f240634a.isChangingConfigurations();
        C90730an.m148190c(amVar.f240609j, C88879p.f240654a);
        if (amVar.f240618s) {
            ViewGroup viewGroup = ((C108508j) amVar.f240617r).f301911c;
        }
        amVar.f240603d.mo81791X(isChangingConfigurations);
    }

    public final void onTopResumedActivityChanged(boolean z) {
        super.onTopResumedActivityChanged(z);
        this.f240552m.f240635b.f240603d.mo76808e(z);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C88861am amVar = this.f240552m.f240635b;
        amVar.f240603d.mo81792Y(z);
        amVar.f240622w.mo78242b();
        amVar.f240606g.mo82655a(1, amVar.f240622w.mo85406k("GSAPrefs.hotword_enabled", true));
        amVar.f240606g.mo82655a(4, z);
    }
}
