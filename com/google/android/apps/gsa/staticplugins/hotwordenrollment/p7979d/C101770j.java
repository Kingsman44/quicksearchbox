package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92416v;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92417w;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92379c;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101862c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59601ay;
import com.google.common.p4552o.C59651be;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60078k;
import com.google.common.p4552o.C60107l;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.j */
/* compiled from: PG */
public final class C101770j {

    /* renamed from: g */
    private static final C59071e f283873g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.j");

    /* renamed from: a */
    public final SharedPreferences f283874a;

    /* renamed from: b */
    public C101773m f283875b = C101773m.NO_SCREEN;

    /* renamed from: c */
    public int f283876c = 0;

    /* renamed from: d */
    protected Intent f283877d;

    /* renamed from: e */
    public int f283878e;

    /* renamed from: f */
    protected long f283879f;

    /* renamed from: h */
    private final C68214a f283880h;

    /* renamed from: i */
    private final C68214a f283881i;

    /* renamed from: j */
    private final C68214a f283882j;

    /* renamed from: k */
    private final C92417w f283883k;

    /* renamed from: l */
    private final C74555u f283884l;

    /* renamed from: m */
    private final C101860a f283885m;

    /* renamed from: n */
    private final C89994f f283886n;

    /* renamed from: o */
    private final Activity f283887o;

    /* renamed from: p */
    private final C22871g f283888p;

    /* renamed from: q */
    private final Map f283889q;

    /* renamed from: r */
    private final C90584f f283890r;

    /* renamed from: s */
    private C92380d f283891s;

    /* renamed from: t */
    private final C21370a f283892t;

    public C101770j(C74555u uVar, C101860a aVar, Activity activity, C89994f fVar, SharedPreferences sharedPreferences, C68214a aVar2, C92417w wVar, C68214a aVar3, C22871g gVar, C21370a aVar4, Map map, C68214a aVar5, C90584f fVar2) {
        this.f283880h = aVar3;
        this.f283884l = uVar;
        this.f283885m = aVar;
        this.f283887o = activity;
        this.f283886n = fVar;
        this.f283874a = sharedPreferences;
        this.f283881i = aVar2;
        this.f283883k = wVar;
        this.f283892t = aVar4;
        this.f283888p = gVar;
        this.f283889q = map;
        this.f283882j = aVar5;
        this.f283890r = fVar2;
        this.f283891s = C92380d.f257600g;
    }

    /* renamed from: f */
    private final C59687cb m168392f() {
        String str;
        if (this.f283884l.mo70891j()) {
            str = ((C92371d) this.f283880h.mo27525b()).mo87021b();
        } else {
            str = this.f283886n.mo83863Z();
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        str.getClass();
        cbVar.f160115b |= 4096;
        cbVar.f160048M = str;
        C9439b a = this.f283884l.mo70883a();
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        cbVar2.f160049N = a.f32835aq;
        cbVar2.f160115b |= 8192;
        ajVar.mo57004a((List) Collection.EL.stream(((C92371d) this.f283880h.mo27525b()).f257559d).map(C101768h.f283871a).collect(Collectors.toList()));
        C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
        C90584f fVar = this.f283890r;
        ayVar.copyOnWrite();
        C59651be beVar = (C59651be) ayVar.instance;
        beVar.f159945k = fVar.f253255d;
        beVar.f159935a |= 4096;
        C59651be beVar2 = (C59651be) ayVar.build();
        ajVar.copyOnWrite();
        C59687cb cbVar3 = (C59687cb) ajVar.instance;
        beVar2.getClass();
        cbVar3.f160100al = beVar2;
        cbVar3.f160122c |= 16;
        return (C59687cb) ajVar.build();
    }

    /* renamed from: g */
    private final void m168393g(C89849ae aeVar) {
        ((C89859i) this.f283881i.mo27525b()).mo83702b(aeVar);
    }

    /* renamed from: h */
    private final void m168394h(C89849ae aeVar, C59687cb cbVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.f246203c = cbVar;
        ((C89859i) this.f283881i.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: a */
    public final void mo92568a(String str) {
        C59104x b = f283873g.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EnrollmentCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(20420)).mo56350C("#deleteEnrollmentUtterances, current time: %d, enrollment start time: %d", this.f283892t.mo26870b(), this.f283879f);
        C92417w wVar = this.f283883k;
        long b2 = (this.f283892t.mo26870b() - this.f283879f) / 1000;
        if (str == null) {
            ((C59052c) ((C59052c) C92417w.f257735a.mo56225c()).mo56372aa(12530)).mo56386p("Called deleteEnrollmentUtterances for null account");
            C60870cx cxVar = C60866ct.f164955a;
            return;
        }
        wVar.f257736b.mo28207g("Delete Enrollment Utterances", new C92416v(wVar, str, b2));
    }

    /* renamed from: b */
    public final void mo92569b(int i, Intent intent) {
        C59071e eVar = f283873g;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EnrollmentCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(20421)).mo56387q("#finishActivity, result=%d", i);
        this.f283876c = i;
        this.f283877d = intent;
        C92380d dVar = this.f283891s;
        if (dVar.f257605d && i != -1 && dVar != null && !dVar.f257606e) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "EnrollmentCtrl");
            ((C59052c) ((C59052c) b2).mo56372aa(20422)).mo56387q("Disable hotword detector because the EnrollmentResult is not COMPLETED %d", i);
            this.f283888p.mo28212l("Modify SharedPreferences", new C101767g(this));
        }
        if (this.f283887o.getCallingActivity() != null) {
            this.f283887o.setResult(i, intent);
        }
        this.f283887o.finish();
        if (this.f283884l.mo70887e().mo70856e()) {
            this.f283887o.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: c */
    public final void mo92570c(C92380d dVar) {
        this.f283891s = dVar;
        this.f283879f = this.f283892t.mo26870b();
        this.f283888p.mo28212l("Modify SharedPreferences", new C101769i(this));
    }

    /* renamed from: d */
    public final void mo92571d(boolean z) {
        int a;
        C89849ae aeVar;
        C89849ae aeVar2;
        C92381e eVar;
        if (z) {
            return;
        }
        if (this.f283876c == 2) {
            C89849ae aeVar3 = C89849ae.VOICE_MATCH_ENROLLMENT_FAILED;
            Intent intent = this.f283877d;
            if (intent == null) {
                eVar = C92381e.UNKNOWN_ERROR;
            } else {
                eVar = (C92381e) intent.getSerializableExtra("enrollment_errors_key");
            }
            if (eVar == null) {
                eVar = C92381e.UNKNOWN_ERROR;
            }
            C60078k kVar = (C60078k) C60107l.f162548d.createBuilder();
            kVar.copyOnWrite();
            C60107l lVar = (C60107l) kVar.instance;
            lVar.f162551b = 2;
            lVar.f162550a |= 1;
            int i = eVar.f257628t;
            kVar.copyOnWrite();
            C60107l lVar2 = (C60107l) kVar.instance;
            lVar2.f162550a = 2 | lVar2.f162550a;
            lVar2.f162552c = i;
            C60107l lVar3 = (C60107l) kVar.build();
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            lVar3.getClass();
            C62971cq cqVar = cbVar.f160052Q;
            if (!cqVar.mo58948c()) {
                cbVar.f160052Q = C62942bv.mutableCopy(cqVar);
            }
            cbVar.f160052Q.add(lVar3);
            m168394h(aeVar3, (C59687cb) ajVar.build());
            m168394h(C89849ae.VOICE_MATCH_ENROLLMENT_WITH_MODEL_DOWNLOAD_FINISH, m168392f());
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f283875b.name();
        switch (this.f283875b.ordinal()) {
            case 2:
                m168393g(C89849ae.VOICE_MATCH_HOTWORD_CONSENT_SCREEN_EXIT);
                break;
            case 3:
                if ((!this.f283884l.mo70891j() && ((a = C92379c.m151713a(this.f283891s.f257603b)) == 0 || a != 3 || this.f283884l.mo70887e().mo70857f())) || this.f283885m.f284137d.get()) {
                    m168393g(C89849ae.VOICE_MATCH_INTRO_SCREEN_EXIT);
                    break;
                } else {
                    m168393g(C89849ae.VOICE_MATCH_BOTTOM_SHEET_INTRO_SCREEN_EXIT);
                    break;
                }
            case 6:
                if (this.f283876c != -1) {
                    C89849ae aeVar4 = C89849ae.VOICE_MATCH_HOTWORD_ENROLLMENT_SCREEN_EXIT;
                    C59582aj ajVar2 = (C59582aj) C59687cb.f160034bf.createBuilder();
                    int i2 = this.f283878e;
                    ajVar2.copyOnWrite();
                    C59687cb cbVar2 = (C59687cb) ajVar2.instance;
                    cbVar2.f160115b |= 33554432;
                    cbVar2.f160089aa = i2;
                    m168394h(aeVar4, (C59687cb) ajVar2.build());
                    break;
                } else {
                    m168393g(C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS);
                    break;
                }
            case 7:
                if (this.f283876c != -1) {
                    if (this.f283885m.f284134a.get()) {
                        aeVar = C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_SCREEN_EXIT;
                    } else {
                        aeVar = C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_SCREEN_EXIT;
                    }
                    m168393g(aeVar);
                    break;
                } else {
                    m168393g(C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS);
                    break;
                }
            case 8:
                if (this.f283876c != -1) {
                    m168393g(C89849ae.VOICE_MATCH_WAITING_SCREEN_EXIT);
                    break;
                } else {
                    m168393g(C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS);
                    break;
                }
            case 9:
                m168393g(C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS_SUMMARY);
                break;
            case 10:
                m168393g(C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS_PERSONAL_RESULT);
                break;
            case 12:
            case 19:
                m168393g(C89849ae.VOICE_MATCH_ENROLLMENT_SUCCESS);
                break;
            case 14:
                m168393g(C89849ae.VOICE_MATCH_SLA_ALREADY_ENABLED_SCREEN_EXIT);
                break;
            case 15:
                if (((C101862c) this.f283882j.mo27525b()).mo92641c() == C101861b.ENROLLED) {
                    aeVar2 = C89849ae.VOICE_MATCH_SLA_ENROLLMENT_SUCCESS_CONFIRMATION_EXIT;
                } else {
                    aeVar2 = C89849ae.VOICE_MATCH_SLA_CONFIRMATION_EXIT;
                }
                m168393g(aeVar2);
                break;
            case 16:
                m168393g(C89849ae.VOICE_MATCH_SLA_VOICE_MATCH_CONSENT_EXIT);
                break;
            case 18:
                m168393g(C89849ae.VOICE_MATCH_SLA_PERSONAL_RESULTS_CONSENT_EXIT);
                break;
        }
        m168394h(C89849ae.VOICE_MATCH_ENROLLMENT_WITH_MODEL_DOWNLOAD_FINISH, m168392f());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00fb */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92572e(com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101500a r8, com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m r9, boolean r10) {
        /*
            r7 = this;
            java.util.WeakHashMap r0 = com.google.apps.tiktok.tracing.C47831fm.f123851a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.name()
            android.support.v4.app.FragmentManager r0 = r8.getChildFragmentManager()
            java.lang.String r1 = r9.name()
            android.support.v4.app.cc r0 = r0.f634a
            android.support.v4.app.Fragment r0 = r0.mo671c(r1)
            r1 = 1
            if (r0 != 0) goto L_0x004a
            java.util.Map r0 = r7.f283889q
            java.lang.Object r0 = r0.get(r9)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.l r0 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101772l) r0
            java.lang.String r2 = "No factory for screenId %s"
            com.google.common.base.C58838bb.m90867b(r0, r2, r9)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.u r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u.f283916c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.t r2 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101780t) r2
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r3 = r7.f283891s
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.u r4 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u) r4
            r3.getClass()
            r4.f283919b = r3
            int r3 = r4.f283918a
            r3 = r3 | r1
            r4.f283918a = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.u r2 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u) r2
            android.support.v4.app.Fragment r0 = r0.mo92407a(r2)
        L_0x004a:
            r2 = 2
            if (r0 != 0) goto L_0x0071
            com.google.common.f.e r8 = f283873g
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "EnrollmentCtrl"
            r8.mo56378ag(r10, r0)
            java.lang.String r10 = "Invalid hotword enrollment screen to show: %s"
            java.lang.String r9 = r9.name()
            r0 = 20426(0x4fca, float:2.8623E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56389s(r10, r9)
            int r8 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.e r8 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e.INVALID_SCREEN
            android.content.Intent r8 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.m151739a(r8)
            r7.mo92569b(r2, r8)
            return
        L_0x0071:
            android.app.Activity r3 = r7.f283887o
            monitor-enter(r3)
            android.app.Activity r4 = r7.f283887o     // Catch:{ all -> 0x00fc }
            boolean r4 = r4.isDestroyed()     // Catch:{ all -> 0x00fc }
            if (r4 == 0) goto L_0x009a
            com.google.common.f.e r8 = f283873g     // Catch:{ all -> 0x00fc }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x00fc }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00fc }
            java.lang.String r10 = "EnrollmentCtrl"
            r8.mo56378ag(r9, r10)     // Catch:{ all -> 0x00fc }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00fc }
            r9 = 20425(0x4fc9, float:2.8622E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r9)     // Catch:{ all -> 0x00fc }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x00fc }
            java.lang.String r9 = "#showScreen, activity destroyed"
            r8.mo56386p(r9)     // Catch:{ all -> 0x00fc }
            monitor-exit(r3)     // Catch:{ all -> 0x00fc }
            return
        L_0x009a:
            com.google.apps.tiktok.tracing.bx r4 = com.google.apps.tiktok.tracing.C47831fm.m85028w()     // Catch:{ all -> 0x00fc }
            r5 = 0
            android.support.v4.app.FragmentManager r8 = r8.getChildFragmentManager()     // Catch:{ all -> 0x00e0 }
            android.support.v4.app.a r6 = new android.support.v4.app.a     // Catch:{ all -> 0x00e0 }
            r6.<init>((android.support.p031v4.app.FragmentManager) r8)     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.gsa.h.s.u r8 = r7.f283884l     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.gsa.h.s.ab r8 = r8.mo70886d()     // Catch:{ all -> 0x00e0 }
            com.google.android.apps.gsa.h.s.ac r8 = r8.mo70847a()     // Catch:{ all -> 0x00e0 }
            int r8 = r8.d()     // Catch:{ all -> 0x00e0 }
            if (r8 != r2) goto L_0x00c2
            r8 = 2130772178(0x7f0100d2, float:1.7147467E38)
            r10 = 2130772179(0x7f0100d3, float:1.714747E38)
            r6.mo691x(r8, r10, r5, r5)     // Catch:{ all -> 0x00e0 }
            goto L_0x00cc
        L_0x00c2:
            if (r10 == 0) goto L_0x00cc
            r8 = 17498112(0x10b0000, float:2.5530268E-38)
            r10 = 17498113(0x10b0001, float:2.553027E-38)
            r6.mo691x(r8, r10, r5, r5)     // Catch:{ all -> 0x00e0 }
        L_0x00cc:
            java.lang.String r8 = r9.name()     // Catch:{ all -> 0x00e0 }
            r10 = 2131435854(0x7f0b214e, float:1.8493562E38)
            r6.mo689v(r10, r0, r8)     // Catch:{ all -> 0x00e0 }
            r6.mo505b(r1)     // Catch:{ all -> 0x00e0 }
            r4.close()     // Catch:{ all -> 0x00fc }
            r7.f283875b = r9     // Catch:{ all -> 0x00fc }
            monitor-exit(r3)     // Catch:{ all -> 0x00fc }
            return
        L_0x00e0:
            r8 = move-exception
            r4.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00fb
        L_0x00e5:
            r9 = move-exception
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00fb }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r10[r5] = r0     // Catch:{ Exception -> 0x00fb }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r2 = "addSuppressed"
            java.lang.reflect.Method r10 = r0.getDeclaredMethod(r2, r10)     // Catch:{ Exception -> 0x00fb }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00fb }
            r0[r5] = r9     // Catch:{ Exception -> 0x00fb }
            r10.invoke(r8, r0)     // Catch:{ Exception -> 0x00fb }
        L_0x00fb:
            throw r8     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fc }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j.mo92572e(com.google.android.apps.gsa.staticplugins.hotwordenrollment.b.a, com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m, boolean):void");
    }
}
