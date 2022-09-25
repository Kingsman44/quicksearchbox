package com.google.android.apps.gsa.staticplugins.microdetection;

import android.content.SharedPreferences;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13898b;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13899c;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13900d;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59601ay;
import com.google.common.p4552o.C59651be;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.amo;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C67047jb;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67071jz;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67174s;
import com.google.speech.p5218j.C67175t;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.s */
/* compiled from: PG */
final class C102863s implements C102790aa {

    /* renamed from: a */
    final /* synthetic */ MicroDetectionWorker f287292a;

    public C102863s(MicroDetectionWorker microDetectionWorker) {
        this.f287292a = microDetectionWorker;
    }

    /* renamed from: f */
    private final Query m170616f(Query query) {
        C17880aj k;
        if (this.f287292a.f286938J.mo56113h()) {
            String l = ((bd) this.f287292a.f286938J.mo56107c()).l();
            if (!TextUtils.isEmpty(l) && (l.equals(this.f287292a.f286983p.f232820b.mo79804a()) || this.f287292a.f286976i.mo79745c(C90014bt.f247847w).contains(Integer.toString(C91042a.m148717a(l))))) {
                Query aO = query.mo84278aO("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME", l);
                if (!this.f287292a.f286976i.mo79746e(C90014bt.f247045J) || (k = ((bd) this.f287292a.f286938J.mo56107c()).k(l)) == null) {
                    return aO;
                }
                return aO.mo84303ao("android.opa.extra.APP_INTEGRATION_CLIENT_VOICE_PLATE_PARAMS", k.toByteArray());
            }
        }
        if (!"com.google.android.googlequicksearchbox".equals(this.f287292a.f286983p.f232820b.mo79804a())) {
            return query;
        }
        Query i = this.f287292a.f286985r.f233970e.mo80560b(MicroDetectionWorker.m170423y(query)).mo80460i();
        return (i == null || TextUtils.isEmpty(i.mo84351bj())) ? query : query.mo84278aO("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME", i.mo84351bj());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m170617g(com.google.android.apps.gsa.shared.search.Query r6) {
        /*
            r5 = this;
            java.lang.String r6 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170423y(r6)
            int r0 = r6.hashCode()
            r1 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002f
            r1 = 110240(0x1aea0, float:1.54479E-40)
            if (r0 == r1) goto L_0x0025
            r1 = 1900885043(0x714d3433, float:1.0161205E30)
            if (r0 == r1) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r0 = "car_assistant"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0039
            r6 = 2
            goto L_0x003a
        L_0x0025:
            java.lang.String r0 = "opa"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0039
            r6 = 0
            goto L_0x003a
        L_0x002f:
            java.lang.String r0 = "search"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0039
            r6 = 1
            goto L_0x003a
        L_0x0039:
            r6 = -1
        L_0x003a:
            if (r6 == r4) goto L_0x004a
            if (r6 == r3) goto L_0x003f
            return r2
        L_0x003f:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r6 = r5.f287292a
            com.google.android.apps.gsa.search.core.i.t r6 = r6.f286976i
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250467dg
            boolean r6 = r6.mo79746e(r0)
            return r6
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.C102863s.m170617g(com.google.android.apps.gsa.shared.search.Query):boolean");
    }

    /* renamed from: h */
    private final boolean m170618h(Query query, HotwordResult hotwordResult, Uri uri) {
        int i;
        if (!query.mo84456dj() || !((az) this.f287292a.f286943O.mo27525b()).l() || !this.f287292a.f286976i.mo79746e(C90051dc.f248842ax)) {
            return false;
        }
        C59104x b = MicroDetectionWorker.f286928a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
        ((C59052c) ((C59052c) b).mo56372aa(21074)).mo56386p("Morris is active on SpeedRacer, handing over hotword");
        if (hotwordResult != null) {
            i = hotwordResult.mo84685e();
        } else {
            i = (int) this.f287292a.f286976i.mo79743a(C90082eg.f250028cl);
        }
        int i2 = (hotwordResult.mo84708y() == null || hotwordResult.mo84708y().isEmpty()) ? 1 : 2;
        if (i2 == 1) {
            C59104x d = MicroDetectionWorker.f286928a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) d).mo56372aa(21075)).mo56386p("HotwordPhrase is UNKNOWN and shouldn't be");
        }
        String uri2 = uri != null ? uri.toString() : BuildConfig.FLAVOR;
        C13900d dVar = (C13900d) C13901e.f42330j.createBuilder();
        long j = query.f252749G;
        dVar.copyOnWrite();
        C13901e eVar = (C13901e) dVar.instance;
        eVar.f42332a |= 8;
        eVar.f42336e = j;
        long c = this.f287292a.f286992y.mo26871c();
        dVar.copyOnWrite();
        C13901e eVar2 = (C13901e) dVar.instance;
        eVar2.f42332a |= 16;
        eVar2.f42337f = c;
        dVar.copyOnWrite();
        C13901e eVar3 = (C13901e) dVar.instance;
        eVar3.f42338g = i2 - 1;
        eVar3.f42332a |= 32;
        C67047jb jbVar = (C67047jb) C67048jc.f182253h.createBuilder();
        float d2 = hotwordResult.mo84684d();
        jbVar.copyOnWrite();
        C67048jc jcVar = (C67048jc) jbVar.instance;
        jcVar.f182255a |= 4;
        jcVar.f182258d = d2;
        String x = hotwordResult.mo84707x();
        jbVar.copyOnWrite();
        C67048jc jcVar2 = (C67048jc) jbVar.instance;
        x.getClass();
        jcVar2.f182255a |= 64;
        jcVar2.f182261g = x;
        boolean D = hotwordResult.mo84679D();
        jbVar.copyOnWrite();
        C67048jc jcVar3 = (C67048jc) jbVar.instance;
        jcVar3.f182255a |= 8;
        jcVar3.f182259e = D;
        dVar.copyOnWrite();
        C13901e eVar4 = (C13901e) dVar.instance;
        C67048jc jcVar4 = (C67048jc) jbVar.build();
        jcVar4.getClass();
        eVar4.f42335d = jcVar4;
        eVar4.f42332a |= 4;
        C13898b bVar = (C13898b) C13899c.f42324e.createBuilder();
        bVar.copyOnWrite();
        C13899c cVar = (C13899c) bVar.instance;
        cVar.f42326a |= 8;
        cVar.f42329d = i;
        bVar.copyOnWrite();
        C13899c cVar2 = (C13899c) bVar.instance;
        uri2.getClass();
        cVar2.f42327b = 4;
        cVar2.f42328c = uri2;
        dVar.copyOnWrite();
        C13901e eVar5 = (C13901e) dVar.instance;
        C13899c cVar3 = (C13899c) bVar.build();
        cVar3.getClass();
        eVar5.f42334c = cVar3;
        eVar5.f42332a |= 2;
        if (hotwordResult.mo84698p().mo56113h()) {
            C67071jz jzVar = (C67071jz) C67073ka.f182324f.createBuilder();
            C67170o oVar = (C67170o) C67171p.f182575e.createBuilder();
            C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
            C67174s a = C67174s.m97431a(hotwordResult.mo84687f());
            qVar.copyOnWrite();
            C67175t tVar = (C67175t) qVar.instance;
            tVar.f182591b = a.f182587e;
            tVar.f182590a |= 1;
            qVar.copyOnWrite();
            C67175t tVar2 = (C67175t) qVar.instance;
            tVar2.f182590a |= 4;
            tVar2.f182593d = i;
            int i3 = hotwordResult.mo84691i();
            qVar.copyOnWrite();
            C67175t tVar3 = (C67175t) qVar.instance;
            tVar3.f182590a |= 2;
            tVar3.f182592c = i3;
            oVar.copyOnWrite();
            C67171p pVar = (C67171p) oVar.instance;
            C67175t tVar4 = (C67175t) qVar.build();
            tVar4.getClass();
            pVar.f182579c = tVar4;
            pVar.f182577a |= 2;
            C63088z A = C63088z.m96139A((byte[]) hotwordResult.mo84698p().mo56107c());
            oVar.copyOnWrite();
            C67171p pVar2 = (C67171p) oVar.instance;
            pVar2.f182577a |= 1;
            pVar2.f182578b = A;
            jzVar.copyOnWrite();
            C67073ka kaVar = (C67073ka) jzVar.instance;
            C67171p pVar3 = (C67171p) oVar.build();
            pVar3.getClass();
            kaVar.f182327b = pVar3;
            kaVar.f182326a |= 1;
            int g = hotwordResult.mo84688g();
            jzVar.copyOnWrite();
            C67073ka kaVar2 = (C67073ka) jzVar.instance;
            kaVar2.f182326a |= 4;
            kaVar2.f182328c = g;
            dVar.copyOnWrite();
            C13901e eVar6 = (C13901e) dVar.instance;
            C67073ka kaVar3 = (C67073ka) jzVar.build();
            kaVar3.getClass();
            eVar6.f42333b = kaVar3;
            eVar6.f42332a |= 1;
        }
        ((az) this.f287292a.f286943O.mo27525b()).e((C13901e) dVar.build());
        return true;
    }

    /* renamed from: i */
    private static final boolean m170619i(Query query, ClientConfig clientConfig) {
        if (clientConfig.mo81876F()) {
            return true;
        }
        if (!query.mo84403cj() || clientConfig.mo81904u() || clientConfig.mo81898p()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final Query m170620j(HotwordResult hotwordResult, Uri uri, boolean z) {
        boolean z2;
        long j;
        boolean R = this.f287292a.mo93444R(hotwordResult.mo84677B());
        MicroDetectionWorker microDetectionWorker = this.f287292a;
        if (microDetectionWorker.f286993z.s()) {
            if (microDetectionWorker.mo93448w().mo81904u()) {
                boolean isDeviceLocked = microDetectionWorker.f286981n.f230023b.isDeviceLocked();
                C58976aa aaVar = C58975e.f156826a;
                if (!isDeviceLocked) {
                    z2 = false;
                }
            }
            z2 = true;
        } else {
            z2 = microDetectionWorker.f286985r.f233970e.mo80559a().mo80459X();
        }
        MicroDetectionWorker microDetectionWorker2 = this.f287292a;
        Query b = microDetectionWorker2.f286984q.mo78246b(z, R, microDetectionWorker2.f286973f.mo80452c(), this.f287292a.f286973f.mo80451b(), z2, uri, hotwordResult.mo84691i(), this.f287292a.f286973f.mo80453e(), this.f287292a.mo93448w().mo81905v());
        int e = hotwordResult.mo84685e();
        if (e > 1) {
            b = b.mo84300al(e);
        }
        if (hotwordResult.mo84693k() > 0) {
            j = hotwordResult.mo84693k();
        } else {
            j = this.f287292a.f286992y.mo26871c();
        }
        long j2 = j;
        MicroDetectionWorker microDetectionWorker3 = this.f287292a;
        Query av = b.mo84310av(HotwordResultMetadata.m147624r(microDetectionWorker3.f286975h, hotwordResult, microDetectionWorker3.mo93440N(z, false), j2, b.mo84423dD()));
        if (this.f287292a.f286971b.mo80488A().mo87300a()) {
            C90498f i = av.mo84480i();
            i.mo84572d(0, 2251799813685248L);
            av = i.mo84568a();
        }
        if (hotwordResult.mo84692j() == 2 || hotwordResult.mo84692j() == 0) {
            return av.mo84314az();
        }
        return av;
    }

    /* renamed from: a */
    public final C89857g mo93452a(HotwordResult hotwordResult, Uri uri, C58833ax axVar, C58833ax axVar2) {
        MicroDetectionWorker microDetectionWorker = this.f287292a;
        if (!microDetectionWorker.f286934F && !microDetectionWorker.f286976i.mo79746e(C90082eg.f250077n)) {
            C92486a aVar = (C92486a) this.f287292a.f286988u.mo27525b();
            int j = hotwordResult.mo84692j();
            MicroDetectionWorker microDetectionWorker2 = this.f287292a;
            boolean z = microDetectionWorker2.f286973f.mo80452c() || microDetectionWorker2.f286973f.mo80451b() || microDetectionWorker2.f286971b.mo80483v() || microDetectionWorker2.f286971b.mo80484w() || (microDetectionWorker2.f286938J.mo56113h() && ((bd) microDetectionWorker2.f286938J.mo56107c()).q());
            String F = this.f287292a.f286986s.mo79659F();
            boolean z2 = F != null && !z && j == 0 && aVar.mo87242p() && !((C91123v) aVar.f258095i.mo27525b()).mo85390b() && (!this.f287292a.f286993z.s() ? !((SharedPreferences) aVar.f258096j.mo27525b()).getBoolean("voice_onboarding_completed", false) : !(aVar.f258088b.mo83817f() || aVar.f258088b.mo83824m(F)));
            int R = this.f287292a.f286982o.mo83855R();
            if (z2) {
                if (R != 4) {
                    ((C92486a) this.f287292a.f286988u.mo27525b()).mo87239m(false, EventForDump.m147675d(25));
                    this.f287292a.f286982o.mo83903aw(2, EventForDump.m147676e(25, "incorrectState: " + R));
                } else {
                    C74554t i = C74555u.m120572i();
                    i.mo70869c(C9439b.INCOMPLETE_STATE_ONBOARDING);
                    ((C91097g) this.f287292a.f286990w.mo27525b()).mo65089a(i.mo70882h());
                    this.f287292a.f286991x.edit().putBoolean("voice_onboarding_completed", true).apply();
                    this.f287292a.mo93430B(uri);
                    String z3 = this.f287292a.mo93450z();
                    if (z3 == null) {
                        z3 = BuildConfig.FLAVOR;
                    }
                    C59582aj ajVar = (C59582aj) this.f287292a.mo93449x(hotwordResult).toBuilder();
                    C59601ay ayVar = (C59601ay) C59651be.f159929E.createBuilder();
                    int R2 = this.f287292a.f286982o.mo83855R();
                    ayVar.copyOnWrite();
                    C59651be beVar = (C59651be) ayVar.instance;
                    beVar.f159935a |= 1048576;
                    beVar.f159953s = R2;
                    ayVar.copyOnWrite();
                    C59651be beVar2 = (C59651be) ayVar.instance;
                    beVar2.f159935a |= 4194304;
                    beVar2.f159955u = z3;
                    ajVar.mo57010g((C59651be) ayVar.build());
                    C89856f fVar = new C89856f();
                    fVar.f246201a = C89849ae.HOTWORD_OPA_ONBOARDING_TRIGGERED;
                    fVar.f246203c = (C59687cb) ajVar.build();
                    return fVar.mo83699a();
                }
            }
        }
        if (this.f287292a.mo93448w().f236951d == amo.ANDROID_AUTO_PHONE && this.f287292a.f286976i.mo79746e(C90082eg.f250068e) && hotwordResult.mo84678C() && hotwordResult.mo84684d() == 0.0f) {
            C58976aa aaVar = C58975e.f156826a;
            this.f287292a.mo93430B(uri);
            uri = null;
        }
        C89849ae d = mo93516d(hotwordResult, uri, axVar, axVar2);
        C89856f fVar2 = new C89856f();
        fVar2.f246201a = d;
        fVar2.f246203c = this.f287292a.mo93449x(hotwordResult);
        return fVar2.mo83699a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C90584f mo93514b(String str) {
        if (str != null) {
            return C90584f.OK_HEY_GOOGLE;
        }
        C59104x b = MicroDetectionWorker.f286928a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
        ((C59052c) ((C59052c) b).mo56372aa(21062)).mo56386p("Hotword phrase is null");
        if (this.f287292a.mo93448w().mo81882L()) {
            return C90584f.OK_HEY_GOOGLE;
        }
        return this.f287292a.f286982o.mo83827p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo93515c(HotwordResult hotwordResult) {
        MicroDetectionWorker microDetectionWorker = this.f287292a;
        if (microDetectionWorker.f286945Q == null) {
            microDetectionWorker.f286945Q = (TelephonyManager) microDetectionWorker.f286975h.getSystemService("phone");
        }
        if (this.f287292a.f286976i.mo79746e(C90082eg.f249958bU)) {
            TelephonyManager telephonyManager = this.f287292a.f286945Q;
            if (telephonyManager == null || telephonyManager.getCallState() != 2) {
                return false;
            }
            C59104x b = MicroDetectionWorker.f286928a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
            ((C59052c) ((C59052c) b).mo56372aa(21073)).mo56386p("Call state is off-hook : Ignoring hotword");
            this.f287292a.f286971b.mo80468e(hotwordResult);
            return true;
        }
        TelephonyManager telephonyManager2 = this.f287292a.f286945Q;
        if (telephonyManager2 == null || telephonyManager2.getCallState() == 0) {
            return false;
        }
        C59104x b2 = MicroDetectionWorker.f286928a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
        ((C59052c) ((C59052c) b2).mo56372aa(21072)).mo56386p("Call state is not idle : Ignoring hotword");
        this.f287292a.f286971b.mo80468e(hotwordResult);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x06a0, code lost:
        if (r7.queryIntentServices(r9, 0).isEmpty() != false) goto L_0x06e7;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.shared.logger.p7051b.C89849ae mo93516d(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r24, android.net.Uri r25, com.google.common.base.C58833ax r26, com.google.common.base.C58833ax r27) {
        /*
            r23 = this;
            r0 = r23
            r11 = r24
            r12 = r25
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f286976i
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250606aD
            boolean r1 = r1.mo79746e(r2)
            java.lang.String r2 = "MicroDetectionWorker"
            if (r1 == 0) goto L_0x0039
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r1 = r1.f286993z
            boolean r1 = r1.s()
            if (r1 == 0) goto L_0x001f
            goto L_0x0039
        L_0x001f:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.f286928a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Hotword triggering voice search is ablated due to experiment b/175682237"
            r3 = 21060(0x5244, float:2.9511E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_OPA_INELIGIBLE_ABLATED
            return r1
        L_0x0039:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.libraries.f.a r1 = r1.f286992y
            long r3 = r1.mo26872d()
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r1.mo93448w()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.f286928a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r2)
            java.lang.String r6 = "#onHotwordDetected"
            r7 = 21049(0x5239, float:2.9496E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r5 = r5.f286976i
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250353bY
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x0085
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            dagger.a r5 = r5.f286939K
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.util.v r5 = (com.google.android.apps.gsa.shared.util.C91123v) r5
            boolean r5 = r5.mo85390b()
            if (r5 == 0) goto L_0x0085
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.libraries.gsa.k.g r5 = r5.f286979l
            com.google.android.apps.gsa.staticplugins.microdetection.p r6 = new com.google.android.apps.gsa.staticplugins.microdetection.p
            r6.<init>(r0)
            java.lang.String r7 = "Automotive Hotword Toast"
            r5.mo28212l(r7, r6)
        L_0x0085:
            boolean r5 = r24.mo84679D()
            if (r5 == 0) goto L_0x0090
            r5 = 1104(0x450, float:1.547E-42)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170414H(r5)
        L_0x0090:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            boolean r6 = r24.mo84678C()
            r5.f286947S = r6
            boolean r5 = r23.mo93515c(r24)
            if (r5 != 0) goto L_0x0bab
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r5 = r5.f286976i
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250293aR
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x00c9
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r5 = r5.f286971b
            boolean r5 = r5.mo80483v()
            if (r5 == 0) goto L_0x00c9
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.libraries.assistant.auto.tng.j.a.a.a r5 = r5.f286949U
            boolean r6 = r5.f41676b
            if (r6 != 0) goto L_0x00c9
            boolean r5 = r5.f41675a
            if (r5 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_AUTO_MULTI_CLIENT_CANCEL
            return r1
        L_0x00c9:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r5 = r5.f286976i
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250340bL
            boolean r5 = r5.mo79746e(r6)
            r6 = 1
            if (r5 == 0) goto L_0x0105
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r5 = r5.f286971b
            boolean r5 = r5.mo80483v()
            if (r5 == 0) goto L_0x0105
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.libraries.assistant.auto.jumpboost.a.i.a r8 = r5.f286950V
            boolean r8 = r8.f37228a
            if (r8 != 0) goto L_0x00ea
            goto L_0x0105
        L_0x00ea:
            dagger.a r1 = r5.f286940L
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.y.a r1 = (com.google.android.apps.gsa.p8885y.C118827a) r1
            com.google.android.apps.gsa.u.b r2 = com.google.android.apps.gsa.p8852u.C118569b.AAP_HOTWORD_ONGOING_SESSION_DETECTED_TNG_COUNT
            com.google.android.apps.gsa.u.h r3 = com.google.android.apps.gsa.p8852u.C118575h.WORKER_MICRO_DETECTION
            com.google.android.apps.gsa.y.a.d r1 = r1.mo77944g(r2, r3)
            r1.mo104025g(r6)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_AUTO_ONGOING_SESSION_CANCEL
            return r1
        L_0x0105:
            int r5 = r24.mo84692j()
            r8 = 3
            if (r5 != r8) goto L_0x0114
            boolean r5 = r1.mo81874D()
            if (r5 == 0) goto L_0x0114
            r5 = 1
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            if (r5 == 0) goto L_0x0138
            boolean r10 = r1.mo81874D()
            if (r10 == 0) goto L_0x011e
            goto L_0x0138
        L_0x011e:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.f286928a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Client doesn't want to handle hotword in DUMP_UTTERANCE mode"
            r3 = 21056(0x5240, float:2.9506E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DUMP_UTTERANCE_MODE
            return r1
        L_0x0138:
            com.google.common.base.ax r10 = r24.mo84698p()
            java.lang.Object r10 = r10.mo56111f()
            byte[] r10 = (byte[]) r10
            if (r10 == 0) goto L_0x01cf
            java.lang.String r14 = r24.mo84708y()
            com.google.android.apps.gsa.shared.speech.hotword.a.f r14 = r0.mo93514b(r14)
            if (r5 == 0) goto L_0x01b4
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r15 = r0.f287292a
            com.google.android.apps.gsa.search.core.google.gaia.o r15 = r15.f286986s
            java.lang.String r15 = r15.mo79659F()
            boolean r16 = r1.mo81880J()
            if (r16 == 0) goto L_0x0166
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r13 = r0.f287292a
            android.content.SharedPreferences r13 = r13.f286991x
            java.lang.String r8 = "hotword_enrollment_account"
            java.lang.String r15 = r13.getString(r8, r15)
        L_0x0166:
            com.google.common.o.amo r8 = r1.f236951d
            com.google.common.o.amo r13 = com.google.common.p4552o.amo.SPEAKER_ID_ENROLLMENT
            if (r8 == r13) goto L_0x0187
            com.google.common.o.amo r8 = r1.f236951d
            com.google.common.o.amo r13 = com.google.common.p4552o.amo.TI_SID_ENROLLMENT
            if (r8 == r13) goto L_0x0187
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r8 = r0.f287292a
            dagger.a r8 = r8.f286940L
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.y.a r8 = (com.google.android.apps.gsa.p8885y.C118827a) r8
            com.google.android.apps.gsa.u.b r13 = com.google.android.apps.gsa.p8852u.C118569b.HOTWORD_AUDIO_DUMP_OUTSIDE_ENROLLMENT_COUNT
            com.google.android.apps.gsa.u.h r9 = com.google.android.apps.gsa.p8852u.C118575h.WORKER_MICRO_DETECTION
            com.google.android.apps.gsa.y.a.d r8 = r8.mo77944g(r13, r9)
            r8.mo104025g(r6)
        L_0x0187:
            if (r15 == 0) goto L_0x019a
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r6 = r0.f287292a
            com.google.android.apps.gsa.speech.audio.g r6 = r6.f286936H
            com.google.android.apps.gsa.speech.audio.e r7 = com.google.android.apps.gsa.speech.audio.C92185e.f257011b
            com.google.android.apps.gsa.speech.audio.f r6 = r6.mo86868a(r7)
            com.google.android.apps.gsa.speech.audio.d r7 = com.google.android.apps.gsa.speech.audio.C92195f.m151371a(r14)
            r6.mo86855b(r10, r15, r7)
        L_0x019a:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r6 = r0.f287292a
            com.google.android.apps.gsa.speech.audio.g r6 = r6.f286936H
            com.google.android.apps.gsa.speech.audio.e r7 = com.google.android.apps.gsa.speech.audio.C92185e.f257011b
            com.google.android.apps.gsa.speech.audio.f r6 = r6.mo86868a(r7)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.shared.m.b.f r7 = r7.f286982o
            java.lang.String r7 = r7.mo83886af()
            com.google.android.apps.gsa.speech.audio.d r8 = com.google.android.apps.gsa.speech.audio.C92195f.m151371a(r14)
            r6.mo86855b(r10, r7, r8)
            goto L_0x01cf
        L_0x01b4:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r6 = r0.f287292a
            com.google.android.apps.gsa.shared.m.b.f r6 = r6.f286982o
            boolean r6 = r6.mo83870aG()
            if (r6 == 0) goto L_0x01cf
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r6 = r0.f287292a
            com.google.android.apps.gsa.speech.audio.g r6 = r6.f286936H
            com.google.android.apps.gsa.speech.audio.e r7 = com.google.android.apps.gsa.speech.audio.C92185e.f257010a
            com.google.android.apps.gsa.speech.audio.f r6 = r6.mo86868a(r7)
            java.lang.String r7 = "-hotword"
            com.google.android.apps.gsa.speech.audio.d r8 = com.google.android.apps.gsa.speech.audio.C92173d.UNKNOWN
            r6.mo86855b(r10, r7, r8)
        L_0x01cf:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r6 = r0.f287292a
            android.content.Context r6 = r6.f286975h
            boolean r6 = com.google.android.apps.gsa.opa.C83583an.m133148c(r6)
            if (r6 == 0) goto L_0x01dd
            r0.mo93517e(r12)
            goto L_0x01e6
        L_0x01dd:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r6 = r0.f287292a
            boolean r7 = r6.f286934F
            if (r7 == 0) goto L_0x01f0
            r0.mo93517e(r12)
        L_0x01e6:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_SETUP_OR_RETAIL_MODE
            return r1
        L_0x01f0:
            android.media.AudioManager r6 = r6.f286977j
            int r6 = r6.getMode()
            if (r6 != 0) goto L_0x0b8c
            if (r5 == 0) goto L_0x01fc
            goto L_0x0b8c
        L_0x01fc:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            dagger.a r5 = r5.f286987t
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.speech.microdetection.d r5 = (com.google.android.apps.gsa.speech.microdetection.C92532d) r5
            r5.mo85080d()
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r5 = r0.f287292a
            com.google.android.apps.gsa.search.core.aj.aa r5 = r5.f286981n
            boolean r5 = r5.mo78228b()
            com.google.android.apps.gsa.shared.search.Query r6 = r0.m170620j(r11, r12, r5)
            boolean r8 = r0.m170618h(r6, r11, r12)
            if (r8 == 0) goto L_0x021e
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGER_PASSED_TO_MORRIS_SPEEDRACER
            return r1
        L_0x021e:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r8 = r0.f287292a
            com.google.android.apps.gsa.search.core.service.af r8 = r8.f286985r
            com.google.android.apps.gsa.search.core.service.r r8 = r8.f233977l
            if (r8 == 0) goto L_0x028b
            boolean r9 = r6.mo84458dl()
            if (r9 == 0) goto L_0x028b
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r9 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r9 = r9.f286976i
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248842ax
            boolean r9 = r9.mo79746e(r13)
            if (r9 == 0) goto L_0x024a
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.f286928a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r13, r2)
            java.lang.String r13 = "There is an attached SearchServiceClient, even though SearchService is not used in SpeedRacer"
            r14 = 21054(0x523e, float:2.9503E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r14)).mo56386p(r13)
        L_0x024a:
            com.google.android.apps.gsa.search.shared.service.al r9 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r13 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.MORRIS_HOTWORD
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r13)
            com.google.protobuf.bt r13 = com.google.android.apps.gsa.search.shared.service.p6935b.C88038mw.f238069a
            com.google.android.apps.gsa.search.shared.service.b.my r14 = com.google.android.apps.gsa.search.shared.service.p6935b.C88040my.f238070c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.mx r14 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88039mx) r14
            r18 = r8
            long r7 = r6.f252749G
            java.lang.String r7 = java.lang.Long.toString(r7)
            r14.copyOnWrite()
            com.google.protobuf.bv r8 = r14.instance
            com.google.android.apps.gsa.search.shared.service.b.my r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88040my) r8
            r7.getClass()
            int r15 = r8.f238072a
            r17 = 1
            r15 = r15 | 1
            r8.f238072a = r15
            r8.f238073b = r7
            com.google.protobuf.bv r7 = r14.build()
            com.google.android.apps.gsa.search.shared.service.b.my r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88040my) r7
            r9.mo81965b(r13, r7)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r7 = r9.mo81964a()
            r8 = r18
            com.google.android.apps.gsa.search.core.service.n r9 = r8.f234383e
            r9.mo80379b(r7)
        L_0x028b:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f286976i
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247117bB
            boolean r7 = r7.mo79746e(r9)
            if (r7 == 0) goto L_0x02a5
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f286976i
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247232dK
            boolean r7 = r7.mo79746e(r9)
            if (r7 == 0) goto L_0x02a5
            r7 = 1
            goto L_0x02a6
        L_0x02a5:
            r7 = 0
        L_0x02a6:
            if (r5 == 0) goto L_0x02aa
            if (r7 == 0) goto L_0x02b2
        L_0x02aa:
            boolean r7 = r6.mo84458dl()
            if (r7 != 0) goto L_0x02b2
            r7 = 1
            goto L_0x02b3
        L_0x02b2:
            r7 = 0
        L_0x02b3:
            boolean r9 = r1.mo81904u()
            if (r9 == 0) goto L_0x0304
            if (r7 == 0) goto L_0x0304
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r7 = r7.f286993z
            int r7 = r7.y()
            r9 = 3
            if (r7 == r9) goto L_0x02f7
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.service.af r7 = r7.f286985r
            com.google.android.apps.gsa.search.core.state.cu r7 = r7.f233970e
            com.google.android.apps.gsa.search.core.state.a.j r7 = r7.mo80559a()
            com.google.android.apps.gsa.shared.search.Query r7 = r7.mo80460i()
            java.lang.String r7 = r7.mo84355bn()
            if (r7 != 0) goto L_0x02dc
            java.lang.String r7 = "and.opa.hotword"
        L_0x02dc:
            r9 = 0
            r13 = 1
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84245H(r13, r13, r9)
            android.os.Bundle r9 = android.os.Bundle.EMPTY
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84264aA(r7, r9)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            android.content.Context r9 = r7.f286975h
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f286976i
            boolean r7 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b.m148054b(r9, r7)
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84284aU(r7)
            goto L_0x0304
        L_0x02f7:
            r0.mo93517e(r12)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_OPA_DISABLED_DETECTED
            return r1
        L_0x0304:
            int r7 = r24.mo84692j()
            java.lang.String r9 = ""
            r13 = 6
            r14 = 2
            if (r7 != r14) goto L_0x03c8
            boolean r7 = r1.mo81905v()
            if (r7 != 0) goto L_0x03c8
            boolean r7 = r24.mo84676A()
            if (r7 != 0) goto L_0x037c
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.f286928a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Speaker Verification failed."
            r3 = 21064(0x5248, float:2.9517E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.aj.aa r2 = r1.f286981n
            int r2 = r2.mo78232f()
            r3 = 303(0x12f, float:4.25E-43)
            r1.mo93446T(r3, r6, r11, r2)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            boolean r1 = r1.mo93442P()
            if (r1 == 0) goto L_0x0349
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            java.lang.String r2 = "Speaker ID Fail"
            r3 = 1
            r1.mo93435I(r2, r3)
        L_0x0349:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.aj.aa r1 = r1.f286981n
            int r1 = r1.mo78227a()
            if (r1 != 0) goto L_0x036d
            float r1 = r24.mo84684d()
            java.lang.String r1 = java.lang.Float.toString(r1)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            dagger.a r2 = r2.f286935G
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.speech.dumper.ak r2 = (com.google.android.apps.gsa.shared.speech.dumper.C90548ak) r2
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump r1 = com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r13, r1)
            r3 = 1
            r2.mo84668b(r3, r1, r9)
        L_0x036d:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_IMPOSTER_DETECTED
            return r1
        L_0x037c:
            boolean r2 = r24.mo84709z()
            if (r2 == 0) goto L_0x03b6
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.shared.speech.dumper.ag r7 = r2.f286942N
            com.google.android.libraries.f.a r2 = r2.f286992y
            long r18 = r2.mo26870b()
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            r7.mo84661b(r2)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.shared.m.b.f r2 = r2.f286982o
            boolean r2 = r2.mo83846I()
            if (r2 == 0) goto L_0x03b6
            if (r10 == 0) goto L_0x03b6
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.speech.audio.g r2 = r2.f286936H
            com.google.android.apps.gsa.speech.audio.e r7 = com.google.android.apps.gsa.speech.audio.C92185e.f257011b
            com.google.android.apps.gsa.speech.audio.f r2 = r2.mo86868a(r7)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.shared.m.b.f r7 = r7.f286982o
            java.lang.String r7 = r7.mo83886af()
            com.google.android.apps.gsa.speech.audio.d r15 = com.google.android.apps.gsa.speech.audio.C92173d.OK_HEY_GOOGLE_ADAPTATION_PENDING
            r2.mo86855b(r10, r7, r15)
        L_0x03b6:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            dagger.a r2 = r2.f286931C
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r2 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r2
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_SPEAKER_VERIFIED
            r2.mo83702b(r7)
            r2 = 301(0x12d, float:4.22E-43)
            goto L_0x03ca
        L_0x03c8:
            r2 = 65
        L_0x03ca:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.shared.m.b.f r15 = r7.f286982o
            com.google.android.apps.gsa.search.core.aj.aa r7 = r7.f286981n
            int r7 = r7.mo78227a()
            r13 = 0
            boolean r7 = com.google.android.apps.gsa.search.core.p6513aj.C84564x.m135287a(r13, r15, r7)
            if (r7 != 0) goto L_0x03f7
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.aj.aa r2 = r1.f286981n
            int r2 = r2.mo78232f()
            r3 = 302(0x12e, float:4.23E-43)
            r1.mo93446T(r3, r6, r11, r2)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_CAR_MODE_DETECTED
            return r1
        L_0x03f7:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.aj.aa r7 = r7.f286981n
            int r7 = r7.mo78232f()
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r13 = r0.f287292a
            r15 = 1
            r13.mo93437K(r15)
            if (r10 == 0) goto L_0x0422
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r13 = r0.f287292a
            com.google.android.apps.gsa.speech.audio.y r13 = r13.f286951W
            long r14 = r6.f252749G
            r20 = r9
            com.google.android.apps.gsa.c.a.a r9 = new com.google.android.apps.gsa.c.a.a
            r21 = r7
            r7 = 16000(0x3e80, float:2.2421E-41)
            r22 = r2
            int r2 = r24.mo84685e()
            r9.<init>(r7, r2, r10)
            r13.mo86891b(r14, r9)
            goto L_0x0428
        L_0x0422:
            r22 = r2
            r21 = r7
            r20 = r9
        L_0x0428:
            com.google.common.o.amo r2 = r1.f236951d
            com.google.common.o.amo r7 = com.google.common.p4552o.amo.ANDROID_AUTO_PHONE
            if (r2 != r7) goto L_0x043e
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            dagger.a r2 = r2.f286932D
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.carassistant.c.a r2 = (com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a) r2
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAV_START_HOTWORD
            r2.mo79328j(r7, r3)
            goto L_0x046d
        L_0x043e:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            dagger.a r2 = r2.f286939K
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.util.v r2 = (com.google.android.apps.gsa.shared.util.C91123v) r2
            boolean r2 = r2.mo85390b()
            if (r2 == 0) goto L_0x046d
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            dagger.a r2 = r2.f286932D
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.carassistant.c.a r2 = (com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a) r2
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AAE_START_HOTWORD
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r9 = r0.f287292a
            com.google.android.apps.gsa.a.c.c r10 = r9.f286941M
            com.google.android.apps.gsa.search.core.i.t r9 = r9.f286976i
            com.google.android.apps.gsa.shared.m.f r13 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250514l
            long r13 = r9.mo79743a(r13)
            com.google.common.o.cb r9 = r10.mo17492a(r13)
            r2.mo79329k(r7, r3, r9)
        L_0x046d:
            if (r8 == 0) goto L_0x04d2
            com.google.android.apps.gsa.shared.util.BitFlags r2 = r1.f236949b
            long r9 = r2.f253762b
            r13 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            boolean r2 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r9, r13)
            if (r2 == 0) goto L_0x04d2
            com.google.common.o.amo r1 = r1.f236951d
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.ANDROID_AUTO_PROJECTED
            if (r1 != r2) goto L_0x0483
            r13 = 1
            goto L_0x0484
        L_0x0483:
            r13 = 0
        L_0x0484:
            com.google.android.apps.gsa.search.shared.service.al r1 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.HANDLE_HOTWORD_QUERY
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87717az.f237190a
            com.google.android.apps.gsa.search.shared.service.b.bb r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87720bb.f237191d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ba r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87719ba) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.bb r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87720bb) r7
            int r9 = r7.f237193a
            r10 = 1
            r9 = r9 | r10
            r7.f237193a = r9
            r7.f237194b = r3
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.bb r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87720bb) r3
            int r4 = r3.f237193a
            r7 = 2
            r4 = r4 | r7
            r3.f237193a = r4
            r3.f237195c = r13
            com.google.protobuf.bv r3 = r5.build()
            com.google.android.apps.gsa.search.shared.service.b.bb r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87720bb) r3
            r1.mo81965b(r2, r3)
            r1.mo81966c(r6)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r1 = r1.mo81964a()
            com.google.android.apps.gsa.search.core.service.n r2 = r8.f234383e
            r2.mo80379b(r1)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_CLIENT_HANDLES_QUERY
            return r1
        L_0x04d2:
            boolean r2 = r26.mo56113h()
            if (r2 == 0) goto L_0x04fc
            java.lang.Object r2 = r26.mo56107c()
            com.google.android.libraries.search.c.hq r2 = (com.google.android.libraries.search.p2904c.C37670hq) r2
            int r2 = r2.f100054a
            r7 = 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x04fc
            java.lang.Object r2 = r26.mo56107c()
            com.google.android.libraries.search.c.hq r2 = (com.google.android.libraries.search.p2904c.C37670hq) r2
            int r2 = r2.f100055b
            java.lang.String r7 = "audio_source_handoff_id"
            com.google.android.apps.gsa.shared.search.Query r2 = r6.mo84311aw(r7, r2)
            java.lang.String r6 = "audio_source_handoff_offset"
            int r7 = r24.mo84688g()
            com.google.android.apps.gsa.shared.search.Query r6 = r2.mo84311aw(r6, r7)
        L_0x04fc:
            boolean r2 = r27.mo56113h()
            if (r2 == 0) goto L_0x051e
            java.lang.Object r2 = r27.mo56107c()
            com.google.android.apps.gsa.c.f.bd r2 = (com.google.android.apps.gsa.c.f.bd) r2
            com.google.android.apps.gsa.speech.l.b r2 = r2.g
            java.lang.String r7 = "channel_config"
            int r9 = r2.mo87190a()
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84311aw(r7, r9)
            java.lang.String r7 = "sampling_rate_hz"
            int r2 = r2.mo87195f()
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84311aw(r7, r2)
        L_0x051e:
            boolean r2 = r6.mo84337bV()
            if (r2 == 0) goto L_0x053a
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.i r2 = r2.f286973f
            boolean r2 = r2.mo80452c()
            if (r2 != 0) goto L_0x0538
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.i r2 = r2.f286973f
            boolean r2 = r2.mo80451b()
            if (r2 == 0) goto L_0x053a
        L_0x0538:
            r2 = 1
            goto L_0x053b
        L_0x053a:
            r2 = 0
        L_0x053b:
            if (r2 == 0) goto L_0x0574
            boolean r7 = r6.mo84403cj()
            if (r7 != 0) goto L_0x0574
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.google.gaia.o r7 = r7.f286986s
            java.lang.String r7 = r7.mo79659F()
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0574
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r9 = r0.f287292a
            android.content.Context r9 = r9.f286975h
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.String r7 = com.google.android.apps.gsa.shared.util.C91035f.m148708d(r7)
            r10 = 0
            r13[r10] = r7
            r7 = 2132092261(0x7f152565, float:1.9824913E38)
            java.lang.String r7 = r9.getString(r7, r13)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r9 = r0.f287292a
            com.google.android.libraries.gsa.k.g r9 = r9.f286979l
            com.google.android.apps.gsa.staticplugins.microdetection.o r10 = new com.google.android.apps.gsa.staticplugins.microdetection.o
            r10.<init>(r0, r7)
            java.lang.String r7 = "Show audio account toast"
            r9.mo28212l(r7, r10)
        L_0x0574:
            boolean r7 = r6.mo84466dt()
            java.lang.String r9 = "and.gsa.hotword"
            if (r7 == 0) goto L_0x0587
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84275aL(r9)
            com.google.common.o.amo r7 = com.google.common.p4552o.amo.LOCKSCREEN_ENTRY
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84272aI(r7)
            goto L_0x0591
        L_0x0587:
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84275aL(r9)
            com.google.common.o.amo r7 = r1.f236951d
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84272aI(r7)
        L_0x0591:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f286976i
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250606aD
            boolean r7 = r7.mo79746e(r9)
            r9 = 5
            r10 = 4
            if (r7 == 0) goto L_0x063e
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r7 = r7.f286993z
            boolean r7 = r7.s()
            if (r7 != 0) goto L_0x063e
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            dagger.a r7 = r7.f286944P
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r7 = (com.google.android.apps.gsa.shared.logger.C89911f) r7
            com.google.android.apps.gsa.shared.q.a r13 = new com.google.android.apps.gsa.shared.q.a
            r14 = 29
            r15 = 917507(0xe0003, float:1.285701E-39)
            r13.<init>(r14, r15)
            com.google.android.apps.gsa.shared.logger.e r7 = r7.mo83756b(r13)
            r13 = 197648122(0xbc7defa, float:7.698751E-32)
            r7.f246282c = r13
            r13 = 7
            java.lang.Object[] r13 = new java.lang.Object[r13]
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r14 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r14 = r14.f286993z
            boolean r14 = r14.s()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15 = 0
            r13[r15] = r14
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r14 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r14 = r14.f286993z
            boolean r14 = r14.r()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15 = 1
            r13[r15] = r14
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r14 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r14 = r14.f286993z
            boolean r14 = r14.u()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15 = 2
            r13[r15] = r14
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r14 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r14 = r14.f286993z
            boolean r14 = r14.w()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15 = 3
            r13[r15] = r14
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r14 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r14 = r14.f286993z
            boolean r14 = r14.n()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r13[r10] = r14
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r14 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r14 = r14.f286993z
            boolean r14 = r14.m()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r13[r9] = r14
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r14 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r14 = r14.f286971b
            boolean r14 = r14.mo80482u()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15 = 6
            r13[r15] = r14
            java.lang.String r14 = "Query created with and.gsa.hotword. opaEligibilityChecker.isHotwordOpaEligible(): %b. opaEligibilityChecker.isDevicePrebuiltWithOpa(): %b. opaEligibilityChecker.isOpaEligible(): %b. opaEligibilityChecker.isOpaUserEnabled(): %b. opaEligibilityChecker.isAwaitingOpaUpgrade(): %b. opaEligibilityChecker.hasTriggeredOpaUpgrade(): %b, and MDState hotword opa ineligibility set to %b"
            java.lang.String r13 = java.lang.String.format(r14, r13)
            r13.getClass()
            r7.f246283d = r13
            r7.mo83721a()
        L_0x063e:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.common.base.ax r13 = r7.f286937I
            boolean r13 = r13.mo56113h()
            if (r13 == 0) goto L_0x0661
            com.google.common.base.ax r7 = r7.f286937I
            java.lang.Object r7 = r7.mo56107c()
            com.google.common.base.cr r7 = (com.google.common.base.C58881cr) r7
            java.lang.Object r7 = r7.mo6453a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r13 = 2
            if (r7 != r13) goto L_0x0661
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84287aX()
        L_0x0661:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            android.content.Context r7 = r7.f286975h
            android.content.ContentResolver r13 = r7.getContentResolver()
            java.lang.String r14 = "enabled_accessibility_services"
            java.lang.String r13 = android.provider.Settings.Secure.getString(r13, r14)
            r14 = 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x06e7
            java.lang.String r15 = "com.google.android.apps.accessibility.voiceaccess"
            boolean r13 = r13.contains(r15)
            if (r13 == 0) goto L_0x06e7
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ApplicationInfo r13 = r7.getApplicationInfo(r15, r14)     // Catch:{ NameNotFoundException -> 0x06e6 }
            android.os.Bundle r13 = r13.metaData
            java.lang.String r9 = "com.google.android.apps.accessibility.voiceaccess.USE_RECOGNITION_SERVICE"
            boolean r9 = r13.getBoolean(r9)
            if (r9 == 0) goto L_0x06a3
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r13 = "com.google.android.apps.accessibility.voiceaccess.AGSA_CONNECTION"
            r9.<init>(r13)
            r9.setPackage(r15)
            r13 = 0
            java.util.List r7 = r7.queryIntentServices(r9, r13)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x06a3
            goto L_0x06e7
        L_0x06a3:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            dagger.a r1 = r1.f286946R
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.service.e.q r1 = (com.google.android.apps.gsa.search.core.service.p6848e.C86695q) r1
            com.google.android.apps.gsa.search.shared.service.c.b.bb r2 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.ba r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r2
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88441bl.f239105a
            com.google.android.apps.gsa.search.shared.service.c.b.bi r4 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88438bi.f239100c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.bh r4 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88437bh) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bi r5 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88438bi) r5
            r6 = 2
            r5.f239103b = r6
            int r6 = r5.f239102a
            r7 = 1
            r6 = r6 | r7
            r5.f239102a = r6
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bi r4 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88438bi) r4
            r2.mo58885m(r3, r4)
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bb r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb) r2
            java.lang.String r3 = "voice_access"
            r1.mo80275j(r3, r2)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_VOICE_ACCESS_DETECTED
            return r1
        L_0x06e6:
        L_0x06e7:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r7 = r7.f286993z
            boolean r7 = r7.s()
            if (r7 == 0) goto L_0x077d
            int r7 = r6.mo84472e()
            if (r7 != r10) goto L_0x077d
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r2 = 1
            r1.mo93432D(r2, r6)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r13 = r0.f287292a
            boolean r14 = r6.mo84423dD()
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            android.content.Context r2 = r1.f286975h
            com.google.android.apps.gsa.search.core.i.t r3 = r1.f286976i
            com.google.android.apps.gsa.search.core.l.a r4 = r1.f286983p
            com.google.common.base.ax r5 = r1.f286938J
            com.google.android.apps.gsa.search.core.aj.aa r7 = r1.f286981n
            boolean r7 = r7.mo78228b()
            r8 = 0
            boolean r7 = r1.mo93440N(r7, r8)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.libraries.f.a r1 = r1.f286992y
            long r8 = r1.mo26871c()
            boolean r10 = r6.mo84423dD()
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r24
            r6 = r7
            r7 = r8
            r9 = r25
            android.content.Intent r1 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170422v(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            if (r14 != 0) goto L_0x075b
            com.google.android.apps.gsa.search.core.aj.aa r2 = r13.f286981n
            android.app.KeyguardManager r2 = r2.f230023b
            boolean r2 = r2.isDeviceLocked()
            if (r2 != 0) goto L_0x073f
            goto L_0x075b
        L_0x073f:
            r13.mo93447V()
            com.google.android.apps.gsa.search.core.state.a.m r2 = r13.f286971b
            boolean r2 = r2.mo80492E()
            if (r2 == 0) goto L_0x074e
            r13.mo93445S(r1)
            goto L_0x0751
        L_0x074e:
            r13.mo93434G(r1)
        L_0x0751:
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x076c
        L_0x075b:
            com.google.android.libraries.gsa.k.g r2 = r13.f286980m
            com.google.android.apps.gsa.staticplugins.microdetection.t r3 = new com.google.android.apps.gsa.staticplugins.microdetection.t
            com.google.android.apps.gsa.search.core.aj.aa r4 = r13.f286981n
            dagger.a r5 = r13.f286990w
            r3.<init>(r13, r1, r4, r5)
            java.lang.String r1 = "Wait for device unlock before launching opa on lockscreen"
            com.google.common.util.concurrent.cx r1 = r2.mo28201a(r1, r3)
        L_0x076c:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.libraries.gsa.k.g r2 = r2.f286978k
            com.google.android.apps.gsa.staticplugins.microdetection.r r3 = new com.google.android.apps.gsa.staticplugins.microdetection.r
            r3.<init>(r0, r12, r11)
            java.lang.String r4 = "Launch Opa from lockscreen callback"
            r2.mo28211k(r1, r4, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_LOCKSCREEN_ENTRY_DETECTED
            return r1
        L_0x077d:
            boolean r7 = r6.mo84403cj()
            if (r7 == 0) goto L_0x07b0
            if (r2 != 0) goto L_0x07b0
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r2 = r2.f286993z
            boolean r2 = r2.w()
            if (r2 == 0) goto L_0x0790
            goto L_0x07b0
        L_0x0790:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.common.base.ax r1 = r1.f286930B
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r1 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r1
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            android.content.Context r2 = r2.f286975h
            android.os.Bundle r3 = android.os.Bundle.EMPTY
            r1.mo81688b(r2, r3)
            r0.mo93517e(r12)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_OPA_DISABLED_DETECTED
            return r1
        L_0x07b0:
            boolean r2 = m170619i(r6, r1)
            if (r2 == 0) goto L_0x07d6
            boolean r2 = r0.m170617g(r6)
            if (r2 != 0) goto L_0x07d6
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.dd r2 = r2.f286974g
            java.lang.String r7 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170423y(r6)
            com.google.android.apps.gsa.search.shared.service.c.a r9 = new com.google.android.apps.gsa.search.shared.service.c.a
            r14 = 100
            r9.<init>(r14, r7)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.l.a r7 = r7.f286983p
            android.os.Bundle r7 = r7.mo79789a()
            r2.mo80620e(r9, r7)
        L_0x07d6:
            boolean r2 = com.google.android.apps.gsa.assistant.shared.k.a(r6)
            if (r2 == 0) goto L_0x07fc
            java.lang.String r2 = "android.opa.extra.INITIAL_QUERY"
            boolean r2 = r6.mo84363bw(r2)
            if (r2 == 0) goto L_0x07fc
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.l.a r2 = r2.f286983p
            com.google.android.apps.gsa.search.core.l.j r2 = r2.f232820b
            java.lang.String r2 = r2.mo79804a()
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.l.a r7 = r7.f286983p
            boolean r2 = com.google.android.apps.gsa.opa.C83583an.m133147b(r2, r7)
            java.lang.String r7 = "android.opa.extra.QUERY_FROM_HOMESCREEN"
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84302an(r7, r2)
        L_0x07fc:
            if (r12 == 0) goto L_0x081d
            boolean r2 = r6.mo84403cj()
            if (r2 == 0) goto L_0x0817
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.common.base.ax r2 = r2.f286938J
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.assistant.shared.bd r2 = (com.google.android.apps.gsa.assistant.shared.bd) r2
            boolean r2 = r2.s()
            if (r2 != 0) goto L_0x0815
            goto L_0x0817
        L_0x0815:
            r2 = 0
            goto L_0x0818
        L_0x0817:
            r2 = 1
        L_0x0818:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            r7.mo93432D(r2, r6)
        L_0x081d:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            r7 = 2
            r2.mo93443Q(r7)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.common.base.ax r2 = r2.f286933E
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0876
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.l.a r2 = r2.f286983p
            com.google.android.apps.gsa.search.core.l.j r2 = r2.f232820b
            java.lang.String r2 = r2.mo79804a()
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.l.a r7 = r7.f286983p
            boolean r7 = com.google.android.apps.gsa.opa.C83583an.m133151f(r2, r7)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r9 = r0.f287292a
            com.google.common.base.ax r9 = r9.f286933E
            java.lang.Object r9 = r9.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r9 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r9
            r13 = r7 ^ 1
            r9.mo96441f(r13)
            if (r7 != 0) goto L_0x0876
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.android.apps.gsa.search.core.l.a r7 = r7.f286983p
            boolean r7 = com.google.android.apps.gsa.opa.C83583an.m133147b(r2, r7)
            if (r7 != 0) goto L_0x0868
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.common.base.ax r7 = r7.f286933E
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r7 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r7
            r7.mo96442g(r2)
            goto L_0x0876
        L_0x0868:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.common.base.ax r2 = r2.f286933E
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            r7 = 0
            r2.mo96442g(r7)
        L_0x0876:
            boolean r2 = r6.mo84403cj()
            r7 = 8
            if (r2 == 0) goto L_0x089f
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.l.a r9 = r2.f286983p
            com.google.common.base.ax r2 = r2.f286938J
            int r2 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170415U(r9, r2)
            java.lang.String r9 = "android.opa.extra.LAUNCHED_ON"
            com.google.android.apps.gsa.shared.search.Query r2 = r6.mo84311aw(r9, r2)
            r6 = 1
            if (r6 == r5) goto L_0x0893
            r9 = 5
            goto L_0x0895
        L_0x0893:
            r9 = 8
        L_0x0895:
            java.lang.String r5 = "android.opa.extra.TRIGGERED_BY"
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo84311aw(r5, r9)
            com.google.android.apps.gsa.shared.search.Query r6 = r0.m170616f(r2)
        L_0x089f:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r2 = r2.f286976i
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247244dW
            boolean r2 = r2.mo79746e(r5)
            if (r2 == 0) goto L_0x08b7
            com.google.android.apps.gsa.shared.util.ac r2 = com.google.android.apps.gsa.shared.util.C90719ac.f253778a
            java.util.Random r2 = r2.f253779b
            long r13 = r2.nextLong()
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84271aH(r13)
        L_0x08b7:
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170423y(r6)
            boolean r5 = r0.m170617g(r6)
            boolean r9 = r6.mo84403cj()
            if (r9 == 0) goto L_0x08e3
            if (r8 == 0) goto L_0x08e3
            com.google.android.apps.gsa.search.shared.service.j r9 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r13 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.STOP_SPEAKING
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r13)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r9 = r9.mo82013a()
            r8.mo80387i(r9)
            com.google.android.apps.gsa.search.shared.service.j r9 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r13 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CANCEL_CONVERSATION
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r13)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r9 = r9.mo82013a()
            r8.mo80387i(r9)
        L_0x08e3:
            boolean r9 = r6.mo84412cs()
            if (r9 == 0) goto L_0x08fd
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r9 = r0.f287292a
            dagger.a r9 = r9.f286939K
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.shared.util.v r9 = (com.google.android.apps.gsa.shared.util.C91123v) r9
            boolean r9 = r9.mo85390b()
            if (r9 == 0) goto L_0x08fd
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84314az()
        L_0x08fd:
            boolean r9 = r6.mo84446da()
            java.lang.String r13 = "rId"
            if (r9 == 0) goto L_0x091e
            if (r8 == 0) goto L_0x091e
            com.google.android.apps.gsa.shared.search.Query r1 = r6.mo84493u()
            com.google.android.apps.gsa.search.shared.service.j r2 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.QUERY_COMMIT
            r2.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r5)
            r2.mo82015c(r1)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r1 = r2.mo82013a()
            r8.mo80387i(r1)
            goto L_0x0b0e
        L_0x091e:
            if (r5 == 0) goto L_0x0ab1
            com.google.android.apps.gsa.search.shared.service.c.b.ad r5 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad.f239033l
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.ac r5 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88405ac) r5
            com.google.protobuf.z r8 = com.google.android.apps.gsa.shared.util.C90772bp.m148305m(r6)
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r9 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r9
            r8.getClass()
            int r12 = r9.f239035a
            r14 = 1
            r12 = r12 | r14
            r9.f239035a = r12
            r9.f239036b = r8
            com.google.protobuf.z r8 = com.google.android.apps.gsa.shared.util.C90772bp.m148305m(r24)
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r9 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r9
            r8.getClass()
            int r12 = r9.f239035a
            r14 = 2
            r12 = r12 | r14
            r9.f239035a = r12
            r9.f239037c = r8
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r8 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r8
            int r9 = r8.f239035a
            r9 = r9 | r10
            r8.f239035a = r9
            r9 = r22
            r8.f239038d = r9
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r8 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r8
            int r9 = r8.f239035a
            r7 = r7 | r9
            r8.f239035a = r7
            r7 = r21
            r8.f239039e = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r7 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r7
            int r8 = r7.f239035a
            r8 = r8 | 16
            r7.f239035a = r8
            r8 = 0
            r7.f239040f = r8
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r7 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r7
            int r9 = r7.f239035a
            r9 = r9 | 32
            r7.f239035a = r9
            r7.f239041g = r8
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            boolean r7 = r7.mo93441O()
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r8 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r8
            int r9 = r8.f239035a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r8.f239035a = r9
            r8.f239044j = r7
            com.google.common.o.amo r7 = r1.f236951d
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r8 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r8
            int r7 = r7.f159234au
            r8.f239042h = r7
            int r7 = r8.f239035a
            r7 = r7 | 64
            r8.f239035a = r7
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r7 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r7
            int r8 = r7.f239035a
            r9 = 128(0x80, float:1.794E-43)
            r8 = r8 | r9
            r7.f239035a = r8
            r7.f239043i = r3
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            java.lang.String r7 = r7.mo93450z()
            if (r7 == 0) goto L_0x09e2
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.gsa.search.shared.service.c.b.ad r8 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r8
            int r9 = r8.f239035a
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.f239035a = r9
            r8.f239045k = r7
        L_0x09e2:
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.gsa.search.shared.service.c.b.ad r5 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad) r5
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            com.google.common.o.cb r7 = r7.mo93449x(r11)
            com.google.android.apps.gsa.shared.logger.b.f r8 = new com.google.android.apps.gsa.shared.logger.b.f
            r8.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_FROM_HOTWORD
            r8.f246201a = r9
            long r9 = r6.f252749G
            java.lang.String r9 = java.lang.Long.toString(r9)
            r8.mo83701c(r13, r9)
            com.google.protobuf.bn r9 = r7.toBuilder()
            com.google.common.o.aj r9 = (com.google.common.p4552o.C59582aj) r9
            com.google.common.o.be r7 = r7.f160100al
            if (r7 != 0) goto L_0x0a0c
            com.google.common.o.be r7 = com.google.common.p4552o.C59651be.f159929E
        L_0x0a0c:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.common.o.ay r7 = (com.google.common.p4552o.C59601ay) r7
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r10 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r10 = r10.f286993z
            boolean r10 = r10.t()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.common.o.be r12 = (com.google.common.p4552o.C59651be) r12
            int r14 = r12.f159935a
            r15 = 16777216(0x1000000, float:2.3509887E-38)
            r14 = r14 | r15
            r12.f159935a = r14
            r12.f159957w = r10
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r10 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r10 = r10.f286993z
            boolean r10 = r10.q()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.common.o.be r12 = (com.google.common.p4552o.C59651be) r12
            int r14 = r12.f159935a
            r15 = 33554432(0x2000000, float:9.403955E-38)
            r14 = r14 | r15
            r12.f159935a = r14
            r12.f159958x = r10
            com.google.protobuf.bv r7 = r7.build()
            com.google.common.o.be r7 = (com.google.common.p4552o.C59651be) r7
            r9.mo57010g(r7)
            com.google.protobuf.bv r7 = r9.build()
            com.google.common.o.cb r7 = (com.google.common.p4552o.C59687cb) r7
            r8.f246203c = r7
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r7 = r0.f287292a
            dagger.a r7 = r7.f286931C
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r7 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r7
            com.google.android.apps.gsa.shared.logger.b.g r8 = r8.mo83699a()
            r7.mo74236a(r8)
            boolean r7 = m170619i(r6, r1)
            if (r7 != 0) goto L_0x0a90
            java.lang.String r7 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170423y(r6)
            java.lang.String r1 = r1.f236953f
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x0a77
            goto L_0x0a90
        L_0x0a77:
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HOTWORD_DETECTED_ON_ACTIVE_CLIENT
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87873gt.f237726a
            r1.mo82014b(r2, r5)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r1 = r1.mo82013a()
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            com.google.android.apps.gsa.search.core.service.af r2 = r2.f286985r
            r2.mo80221b(r1)
            goto L_0x0b0e
        L_0x0a90:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            dagger.a r1 = r1.f286946R
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.service.e.q r1 = (com.google.android.apps.gsa.search.core.service.p6848e.C86695q) r1
            com.google.android.apps.gsa.search.shared.service.c.b.bb r7 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.ba r7 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r7
            com.google.protobuf.bt r8 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88407ae.f239046a
            r7.mo58885m(r8, r5)
            com.google.protobuf.bv r5 = r7.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bb r5 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb) r5
            r1.mo80275j(r2, r5)
            goto L_0x0b0e
        L_0x0ab1:
            r7 = r21
            r9 = r22
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.assistant.shared.bm r1 = r1.f286993z
            int r1 = r1.y()
            r5 = 3
            if (r1 != r5) goto L_0x0ae0
            r0.mo93517e(r12)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.common.base.ax r1 = r1.f286930B
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r1 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r1
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r2 = r0.f287292a
            android.content.Context r2 = r2.f286975h
            android.os.Bundle r3 = android.os.Bundle.EMPTY
            r1.mo81688b(r2, r3)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_OPA_DISABLED_DETECTED
            return r1
        L_0x0ae0:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.service.af r1 = r1.f286985r
            com.google.android.apps.gsa.search.core.state.cu r1 = r1.f233970e
            com.google.android.apps.gsa.search.core.state.a.j r1 = r1.mo80560b(r2)
            r1.mo80462q(r6)
            boolean r1 = r6.mo84456dj()
            if (r1 != 0) goto L_0x0af9
            boolean r1 = r6.mo84458dl()
            if (r1 == 0) goto L_0x0b0e
        L_0x0af9:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.service.af r2 = r1.f286985r
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker.m170423y(r6)
            com.google.android.apps.gsa.search.core.state.cu r2 = r2.f233970e
            com.google.android.apps.gsa.search.core.state.a.j r2 = r2.mo80560b(r5)
            com.google.android.apps.gsa.shared.search.Query r2 = r2.mo80460i()
            r1.mo93446T(r9, r2, r11, r7)
        L_0x0b0e:
            boolean r1 = r6.mo84456dj()
            if (r1 != 0) goto L_0x0b1a
            boolean r1 = r6.mo84458dl()
            if (r1 == 0) goto L_0x0b61
        L_0x0b1a:
            boolean r1 = r6.mo84403cj()
            if (r1 == 0) goto L_0x0b61
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.i.t r1 = r1.f286976i
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247244dW
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0b52
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            dagger.a r1 = r1.f286931C
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.f r2 = new com.google.android.apps.gsa.shared.logger.b.f
            r2.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_HOTWORD
            r2.f246201a = r5
            r2.f246204d = r3
            long r3 = r6.f252749G
            java.lang.String r3 = java.lang.Long.toString(r3)
            r2.mo83701c(r13, r3)
            com.google.android.apps.gsa.shared.logger.b.g r2 = r2.mo83699a()
            r1.mo74236a(r2)
            goto L_0x0b61
        L_0x0b52:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            dagger.a r1 = r1.f286931C
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_HOTWORD
            r1.mo83703p(r2, r3)
        L_0x0b61:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            boolean r1 = r1.mo93442P()
            if (r1 == 0) goto L_0x0b78
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r2 = r20
            r3 = 0
            r1.mo93435I(r2, r3)
        L_0x0b78:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.shared.speech.dumper.ag r1 = r1.f286942N
            com.google.android.libraries.storage.protostore.ab r1 = r1.f253129b
            com.google.android.apps.gsa.shared.speech.dumper.u r2 = com.google.android.apps.gsa.shared.speech.dumper.C90568u.f253167a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = r1.mo46039a(r2, r3)
            com.google.android.apps.gsa.p8883x.C118826c.m197213c(r1)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_QUERY_COMMITTED
            return r1
        L_0x0b8c:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            com.google.android.apps.gsa.search.core.state.a.m r1 = r1.f286971b
            r1.mo80468e(r11)
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            dagger.a r1 = r1.f286989v
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.speech.m.h r1 = (com.google.android.apps.gsa.speech.p7302m.C92483h) r1
            com.google.android.apps.gsa.speech.m.j r2 = com.google.android.apps.gsa.speech.p7302m.C92485j.MULTI_DEVICE_SELECTION_REQUEST
            r3 = 0
            r1.mo87226a(r2, r3, r3)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_CALL_OR_QUARTZ_MODE
            return r1
        L_0x0bab:
            com.google.android.apps.gsa.staticplugins.microdetection.MicroDetectionWorker r1 = r0.f287292a
            r1.mo93430B(r12)
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_PHONE_CALL_ACTIVE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.C102863s.mo93516d(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult, android.net.Uri, com.google.common.base.ax, com.google.common.base.ax):com.google.android.apps.gsa.shared.logger.b.ae");
    }

    /* renamed from: e */
    public final void mo93517e(Uri uri) {
        C59071e eVar = MicroDetectionWorker.f286928a;
        C58976aa aaVar = C58975e.f156826a;
        if (uri != null) {
            this.f287292a.mo93430B(uri);
        } else if (((C102792ac) this.f287292a.f286929A.mo27525b()).mo93456d()) {
            ((C102792ac) this.f287292a.f286929A.mo27525b()).mo93455c();
        }
    }
}
