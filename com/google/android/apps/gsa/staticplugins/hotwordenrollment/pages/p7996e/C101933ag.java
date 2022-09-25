package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.databinding.C0118a;
import android.support.p031v4.app.C0167am;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.apps.gsa.hotword.b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchplate.C88911am;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7148ui.RingProgressBar;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92417w;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92381e;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101491a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101502c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a.C101511af;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a.C101528j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101630t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101633w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101634x;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101782v;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a.C101883i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101884a;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.speech.p5208h.C66595bu;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ag */
/* compiled from: PG */
public final class C101933ag {

    /* renamed from: S */
    private static final List f284327S = C58485gu.m89849q(C89849ae.VOICE_MATCH_ENROLLMENT_SHOW_FIRST_QUERY, C89849ae.VOICE_MATCH_ENROLLMENT_SHOW_SECOND_QUERY, C89849ae.VOICE_MATCH_ENROLLMENT_SHOW_THIRD_QUERY, C89849ae.VOICE_MATCH_ENROLLMENT_SHOW_FOURTH_QUERY);

    /* renamed from: a */
    public static final C59071e f284328a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ag");

    /* renamed from: b */
    public static final long f284329b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static final long f284330c = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: A */
    public final C101860a f284331A;

    /* renamed from: B */
    public final C58833ax f284332B;

    /* renamed from: C */
    public final C101884a f284333C;

    /* renamed from: D */
    public final C102230s f284334D;

    /* renamed from: E */
    public final C90584f f284335E;

    /* renamed from: F */
    public final String f284336F;

    /* renamed from: G */
    public C101943aq f284337G;

    /* renamed from: H */
    public int f284338H;

    /* renamed from: I */
    public C101965f f284339I;

    /* renamed from: J */
    public final boolean f284340J;

    /* renamed from: K */
    public View f284341K;

    /* renamed from: L */
    public int f284342L;

    /* renamed from: M */
    public ViewFlipper f284343M;

    /* renamed from: N */
    public C101966g f284344N = C101966g.DEFAULT;

    /* renamed from: O */
    public boolean f284345O;

    /* renamed from: P */
    public SpeakerIdModel f284346P;

    /* renamed from: Q */
    public C83975q f284347Q = null;

    /* renamed from: R */
    final b f284348R = new C101932af(this);

    /* renamed from: T */
    private final C68214a f284349T;

    /* renamed from: U */
    private final C101633w f284350U;

    /* renamed from: V */
    private final C101634x f284351V;

    /* renamed from: W */
    private boolean f284352W;

    /* renamed from: d */
    public boolean f284353d;

    /* renamed from: e */
    public int f284354e;

    /* renamed from: f */
    public boolean f284355f;

    /* renamed from: g */
    public boolean f284356g;

    /* renamed from: h */
    public final C101970k f284357h;

    /* renamed from: i */
    public final C92380d f284358i;

    /* renamed from: j */
    public final C101781u f284359j;

    /* renamed from: k */
    public final C90932cb f284360k;

    /* renamed from: l */
    public final C22871g f284361l;

    /* renamed from: m */
    public final C74555u f284362m;

    /* renamed from: n */
    public final C89994f f284363n;

    /* renamed from: o */
    public final C68214a f284364o;

    /* renamed from: p */
    public final C118561t f284365p;

    /* renamed from: q */
    public final C90021c f284366q;

    /* renamed from: r */
    public final Context f284367r;

    /* renamed from: s */
    public final C86124t f284368s;

    /* renamed from: t */
    public final C90743b f284369t;

    /* renamed from: u */
    public final C92486a f284370u;

    /* renamed from: v */
    public final C101883i f284371v;

    /* renamed from: w */
    public final C101967h f284372w;

    /* renamed from: x */
    public final C101528j f284373x;

    /* renamed from: y */
    public final C68214a f284374y;

    /* renamed from: z */
    public final C101497ae f284375z;

    public C101933ag(C101970k kVar, C101781u uVar, C74555u uVar2, C90932cb cbVar, C22871g gVar, C89994f fVar, C68214a aVar, C118561t tVar, C90021c cVar, Context context, C68214a aVar2, C86124t tVar2, C90743b bVar, C92486a aVar3, C101883i iVar, C101633w wVar, C101634x xVar, C101967h hVar, C101528j jVar, C68214a aVar4, C101497ae aeVar, boolean z, C58833ax axVar, C101860a aVar5, C101884a aVar6, C102230s sVar, C90584f fVar2, String str) {
        C101781u uVar3 = uVar;
        this.f284357h = kVar;
        this.f284359j = uVar3;
        this.f284360k = cbVar;
        this.f284362m = uVar2;
        this.f284361l = gVar;
        this.f284363n = fVar;
        this.f284364o = aVar;
        this.f284365p = tVar;
        this.f284366q = cVar;
        this.f284367r = context;
        this.f284349T = aVar2;
        this.f284368s = tVar2;
        this.f284369t = bVar;
        this.f284370u = aVar3;
        this.f284371v = iVar;
        this.f284350U = wVar;
        this.f284351V = xVar;
        this.f284372w = hVar;
        this.f284373x = jVar;
        this.f284374y = aVar4;
        C92380d dVar = uVar3.f283919b;
        this.f284358i = dVar == null ? C92380d.f257600g : dVar;
        this.f284375z = aeVar;
        this.f284340J = z;
        this.f284331A = aVar5;
        this.f284332B = axVar;
        this.f284333C = aVar6;
        this.f284334D = sVar;
        this.f284335E = fVar2;
        this.f284336F = str;
    }

    /* renamed from: b */
    public static C101970k m168662b(C101781u uVar) {
        return C101970k.m168758b(uVar);
    }

    /* renamed from: t */
    private final void m168663t() {
        if (this.f284356g) {
            this.f284337G.mo92731h(((C101935ai) this.f284349T.mo27525b()).mo92716a(this.f284331A.mo92638c(), this.f284354e));
        }
    }

    /* renamed from: u */
    private final boolean m168664u() {
        return !this.f284362m.mo70891j() && this.f284335E == C90584f.OK_GOOGLE;
    }

    /* renamed from: a */
    public final C102229r mo92698a(C84011f fVar) {
        C101970k kVar = this.f284357h;
        boolean s = mo92715s();
        int i = R.string.hotword_enrollment_enroll_cancel_glif;
        if (!s && this.f284362m.mo70891j()) {
            i = R.string.hotword_enrollment_google_home_no_thanks;
        }
        String string = kVar.getString(i);
        C102228q f = C102229r.m169429f();
        f.mo92319b(2);
        f.mo92320c(fVar);
        C84010e e = C84011f.m133882e();
        e.mo77375c(string);
        ((C83958a) e).f228734b = new C101981v(this);
        f.mo92321d(e.mo77373a());
        if (string != null) {
            ((C101491a) f).f283234b = string;
            return f.mo92318a();
        }
        throw new NullPointerException("Null opaSecondaryButtonContentDescription");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C59687cb mo92699c() {
        int i = 2;
        int i2 = true != this.f284356g ? 2 : 3;
        if (this.f284344N == C101966g.SODA) {
            i = 3;
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160058W = i - 1;
        cbVar.f160115b |= C89885b.NOW_VALUE;
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        cbVar2.f160061Z = i2 - 1;
        cbVar2.f160115b |= 16777216;
        return (C59687cb) ajVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r3.f284350U;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92700d() {
        /*
            r3 = this;
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.aq r0 = r3.f284337G
            r0.mo92727d()
            boolean r0 = r3.m168664u()
            if (r0 == 0) goto L_0x0019
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.w r0 = r3.f284350U
            com.google.android.apps.gsa.speech.microdetection.adapter.d r1 = r0.f283602b
            if (r1 == 0) goto L_0x0019
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.u r2 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.u
            r2.<init>(r0, r1)
            r1.mo87273a(r2)
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e.C101933ag.mo92700d():void");
    }

    /* renamed from: e */
    public final void mo92701e() {
        this.f284361l.mo28212l("disconnect", new C101979t(this));
    }

    /* renamed from: f */
    public final void mo92702f() {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        this.f284345O = true;
        if (this.f284357h.getView() != null) {
            C47393f.m84236g(new C101783w(), this.f284357h);
            return;
        }
        ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_NULL_FRAGMENT_VIEW_AT_ENROLL_SCREEN);
        C59104x c = f284328a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        C0118a.m96d(c, "fragment.getView() is null", 20452, C58979ad.FULL);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo92703g() {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        C59104x b = f284328a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20453)).mo56389s("enrollVoiceMatch: isTiSidHomeEnrollment = %s", Boolean.valueOf(this.f284355f));
        ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_START_ENROLLMENT_ON_ENROLL_SCREEN);
        if (!this.f284355f) {
            C90873ag agVar = new C90873ag(this.f284337G.mo92725b(), this.f284361l, "enroll voice match callback", C101873d.m168556a(new C101971l(this)));
            agVar.mo85224b(IllegalStateException.class, C101873d.m168556a(new C101974o(this)));
            agVar.mo85223a(C101873d.m168556a(new C101975p(this)));
            return;
        }
        this.f284348R.a(new ArrayList());
    }

    /* renamed from: h */
    public final void mo92704h(C101511af afVar) {
        C92381e eVar;
        C92362c cVar;
        C59071e eVar2 = f284328a;
        C59104x c = eVar2.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) c).mo56372aa(20456)).mo56389s("#handleHomeRetrainFailure: %s", afVar.name());
        C90584f fVar = C90584f.UNKNOWN;
        s sVar = s.a;
        int ordinal = afVar.ordinal();
        if (ordinal == 0) {
            eVar = C92381e.ENROLLMENT_NOT_UPLOADED;
            cVar = C92362c.UPLOAD_ENROLLMENT;
        } else if (ordinal == 1) {
            ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_FAILED);
            eVar = C92381e.RETRAIN_FAILED;
            cVar = C92362c.RETRAIN;
        } else if (ordinal == 3) {
            ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_FAILED);
            eVar = C92381e.ENROLLMENT_UTTERANCES_NOT_READY;
            cVar = C92362c.ENROLLMENT_UTTERANCES_READY;
        } else {
            throw new AssertionError("Unknown retrain result: ".concat(String.valueOf(afVar.name())));
        }
        Intent a = C92408n.m151739a(eVar);
        a.putExtra("assistant_enrollment_error", cVar);
        if (this.f284357h.getView() != null) {
            C101765e eVar3 = new C101765e();
            eVar3.mo92562b(2);
            eVar3.f283865a = a;
            C47393f.m84236g(eVar3.mo92561a(), this.f284357h);
            return;
        }
        C59104x c2 = eVar2.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        C0118a.m96d(c2, "fragment.getView() is null!", 20457, C58979ad.FULL);
    }

    /* renamed from: i */
    public final void mo92705i() {
        C59071e eVar = f284328a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20458)).mo56386p("hotwordTriggered");
        this.f284354e++;
        if (!this.f284357h.isAdded()) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
            ((C59052c) ((C59052c) d).mo56372aa(20460)).mo56386p("Fragment was not attached!");
            ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FRAGMENT_NOT_ATTACHED_ON_HOTWORD_TRIGGERED);
            return;
        }
        C47393f.m84236g(new C101782v(this.f284354e), this.f284357h);
        if (this.f284354e < this.f284338H) {
            m168663t();
        }
        mo92712p();
        if (mo92714r()) {
            mo92708l(false);
            Button button = (Button) this.f284341K.findViewById(R.id.start_recording_button);
            if (this.f284354e < this.f284338H) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
        } else if (this.f284354e == this.f284338H) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
            ((C59052c) ((C59052c) b2).mo56372aa(20459)).mo56386p("Last utterance detected, stopping hotword detection");
            mo92708l(false);
        }
    }

    /* renamed from: j */
    public final void mo92706j() {
        C92518d dVar;
        C59104x b = f284328a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20472)).mo56386p("onStop");
        mo92708l(false);
        if (m168664u() && (dVar = this.f284350U.f283602b) != null) {
            dVar.mo87274b();
        }
        this.f284337G.mo92728e();
        if (!this.f284352W) {
            this.f284357h.getActivity().getWindow().clearFlags(128);
        }
    }

    /* renamed from: k */
    public final void mo92707k() {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        C0167am activity = this.f284357h.getActivity();
        if (activity != null) {
            this.f284333C.mo92666b(activity, this.f284336F);
        }
        if (this.f284335E == C90584f.OK_GOOGLE) {
            C101633w wVar = this.f284350U;
            if (wVar.f283602b != null && wVar.f283605e && wVar.f283604d) {
                ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_DSP_ENROLLMENT_START);
                C101633w wVar2 = this.f284350U;
                boolean z = this.f284358i.f257605d;
                this.f284362m.mo70887e().mo70858g();
                C60856cj.m92911t(C2169h.m6027a(new C101630t(wVar2, z)), new C101984y(this), C60826bg.f164896a);
                return;
            }
        }
        C59104x b = f284328a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20476)).mo56389s("Don't enroll DSP, only update the Settings. ok_google: %b", Boolean.valueOf(this.f284335E == C90584f.OK_GOOGLE));
        this.f284351V.mo92452a(this.f284358i.f257605d);
        mo92702f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo92708l(boolean z) {
        C59104x b = f284328a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20477)).mo56389s("Setting hotword detection %s", Boolean.valueOf(z));
        C101943aq aqVar = this.f284337G;
        Intent intent = new Intent("com.google.android.googlequicksearchbox.action.HOTWORD_ENROLLMENT");
        intent.putExtra("com.google.android.googlequicksearchbox.extra.HOTWORD_REQUESTED", z);
        intent.setPackage("com.google.android.googlequicksearchbox");
        aqVar.f284422m.mo92529a(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
        aqVar.mo92732i(z);
    }

    /* renamed from: m */
    public final void mo92709m() {
        if (this.f284362m.mo70891j() || this.f284362m.mo70887e().mo70856e()) {
            mo92702f();
        } else {
            mo92707k();
        }
    }

    /* renamed from: n */
    public final void mo92710n(int i) {
        if (this.f284357h.isAdded()) {
            Toast.makeText(this.f284357h.getActivity(), i, 0).show();
        }
    }

    /* renamed from: o */
    public final void mo92711o() {
        C59104x b = f284328a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20480)).mo56386p("startDetection");
        if (this.f284354e == 0 && !this.f284362m.mo70891j() && !this.f284362m.mo70887e().mo70853a().mo70880d()) {
            this.f284363n.mo83843F(this.f284336F, EventForDump.m147676e(8, "Starting enrollment with model type: ".concat(this.f284335E == C90584f.OK_HEY_GOOGLE ? "X" : "Ok")));
            ((C92417w) this.f284364o.mo27525b()).mo87056a(this.f284336F, 30);
            ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.DELETE_UTTERANCES_ON_ENROLLMENT_START);
        }
        m168663t();
        int i = this.f284354e;
        boolean z = true;
        mo92708l(i >= 0 && i < this.f284338H);
        if ((this.f284357h.getActivity().getWindow().getAttributes().flags & 128) == 0) {
            z = false;
        }
        this.f284352W = z;
        if (!z) {
            this.f284357h.getActivity().getWindow().addFlags(128);
        }
        if (this.f284355f && this.f284375z.f283245b.mo87020a().mo56113h()) {
            this.f284337G.mo92733j((C66595bu) this.f284375z.f283245b.mo87020a().mo56107c());
        }
    }

    /* renamed from: p */
    public final void mo92712p() {
        String str;
        int i;
        String str2;
        int i2;
        int i3 = this.f284354e;
        if (i3 < -1) {
            C59104x c = f284328a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
            ((C59052c) ((C59052c) c).mo56372aa(20484)).mo56387q("Should never happen: utteranceCount is smaller than %d", -1);
            C101765e eVar = new C101765e();
            eVar.mo92562b(2);
            eVar.f283865a = C92408n.m151739a(C92381e.INVALID_UTTERANCE_COUNT);
            C47393f.m84236g(eVar.mo92561a(), this.f284357h);
        } else if (i3 > this.f284338H) {
            C59104x b = f284328a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
            ((C59052c) ((C59052c) b).mo56372aa(20483)).mo56393w("We have recorded enough utterances [current utterance count = %d, # required utterance = %d]. Ignore it.", this.f284354e, this.f284338H);
            return;
        }
        if (this.f284342L >= 0 || !mo92715s()) {
            if (this.f284354e == -1) {
                this.f284343M.setDisplayedChild(0);
                this.f284342L = 0;
            } else {
                this.f284343M.setDisplayedChild(1);
                this.f284342L = 1;
            }
            if (this.f284354e >= 0) {
                this.f284343M.getCurrentView();
                C59104x b2 = f284328a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
                ((C59052c) ((C59052c) b2).mo56372aa(20485)).mo56386p("updateRecordHotwordScreen");
                ((C89859i) this.f284374y.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_ENROLL_SCREEN_FOOTER_VIEW_NULL);
                if (this.f284354e == this.f284338H) {
                    C89856f fVar = new C89856f();
                    fVar.f246201a = C89849ae.VOICE_MATCH_HOTWORD_ENROLLMENT_COMPLETE;
                    fVar.f246203c = mo92699c();
                    ((C89859i) this.f284374y.mo27525b()).mo74236a(fVar.mo83699a());
                } else {
                    ((C89859i) this.f284374y.mo27525b()).mo83702b((C89849ae) f284327S.get(this.f284354e));
                }
                C101965f fVar2 = this.f284339I;
                View view = this.f284341K;
                int i4 = this.f284354e;
                int i5 = this.f284338H;
                if (this.f284335E == C90584f.OK_HEY_GOOGLE) {
                    C101935ai aiVar = (C101935ai) this.f284349T.mo27525b();
                    C90584f fVar3 = C90584f.OK_HEY_GOOGLE;
                    String c2 = this.f284331A.mo92638c();
                    int i6 = this.f284354e;
                    boolean c3 = this.f284369t.mo85090c();
                    boolean j = this.f284362m.mo70891j();
                    boolean z = this.f284355f;
                    C59104x b3 = C101935ai.f284377a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "GHEnrollmentUXHelper");
                    Integer valueOf = Integer.valueOf(i6);
                    boolean z2 = z;
                    int i7 = i6;
                    ((C59052c) ((C59052c) b3).mo56372aa(20489)).mo56362O("getHotwordEnrollmentQuery: modelType %s, locale %s, utteranceCount %d, isTalkbackEnabled %b, isPhoneEnrollment %b, isTiSidHomeEnrollment %b", fVar3, c2, valueOf, Boolean.valueOf(c3), Boolean.valueOf(!j), Boolean.valueOf(z));
                    if (aiVar.f284380d.mo79746e(C90082eg.f250016cZ) || !c3) {
                        if (i7 == 0 || i7 == 1) {
                            i2 = 1;
                        } else if (i7 == 2 || i7 == 3) {
                            i2 = 2;
                        } else {
                            str2 = BuildConfig.FLAVOR;
                            if (aiVar.f284379c.mo83851N() || z2) {
                                str2 = str2 + ", " + aiVar.mo92716a(c2, i7);
                            }
                            str = aiVar.f284378b.getString(R.string.hotword_enrollment_utterance, new Object[]{str2});
                        }
                        str2 = aiVar.mo92717b(fVar3, c2, i2, 1);
                        str2 = str2 + ", " + aiVar.mo92716a(c2, i7);
                        str = aiVar.f284378b.getString(R.string.hotword_enrollment_utterance, new Object[]{str2});
                    } else {
                        C59104x b4 = C101935ai.f284377a.mo56224b();
                        b4.mo56378ag(C58975e.f156826a, "GHEnrollmentUXHelper");
                        ((C59052c) ((C59052c) b4).mo56372aa(20488)).mo56359L("getHotwordEnrollmentListeningTalkBackText: modelType %s, locale %s, utteranceCount %d", fVar3, c2, valueOf);
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    str = aiVar.f284378b.getString(R.string.hotword_enrollment_enroll_listening_talkback_assistant_device, new Object[]{aiVar.mo92717b(fVar3, c2, 2, 2)});
                                } else if (i7 != 3) {
                                    if (i7 == 4) {
                                        str = aiVar.f284378b.getString(R.string.hotword_enrollment_enroll_listening_talkback_assistant_device, new Object[]{aiVar.mo92717b(fVar3, c2, 3, 2)});
                                    } else if (i7 != 5) {
                                        str = BuildConfig.FLAVOR;
                                    }
                                }
                            }
                            str = aiVar.f284378b.getString(R.string.hotword_enrollment_enroll_listening_talkback_assistant_device_again);
                        } else {
                            str = aiVar.f284378b.getString(R.string.hotword_enrollment_enroll_listening_talkback_assistant_device, new Object[]{aiVar.mo92717b(fVar3, c2, 1, 2)});
                        }
                    }
                } else if (this.f284369t.mo85090c()) {
                    int i8 = this.f284354e;
                    if (i8 == 0) {
                        str = this.f284367r.getString(R.string.hotword_enrollment_enroll_listening_talkback);
                    } else if (i8 == this.f284338H - 1) {
                        str = this.f284367r.getString(R.string.hotword_enrollment_enroll_last_talkback);
                    } else {
                        str = this.f284367r.getString(R.string.hotword_enrollment_enroll_again_talkback);
                    }
                } else {
                    str = this.f284367r.getString(R.string.hotword_enrollment_utterance, new Object[]{this.f284370u.mo87230d()});
                }
                RingProgressBar ringProgressBar = (RingProgressBar) view.findViewById(R.id.circular_progress_bar);
                if (i4 > 0) {
                    int max = ringProgressBar.getMax();
                    int i9 = (i4 * max) / i5;
                    ringProgressBar.getProgress();
                    ObjectAnimator.ofInt(ringProgressBar, "progress", new int[]{i9 - (max / i5), i9}).setDuration(300).start();
                }
                ringProgressBar.setContentDescription(view.getContext().getString(R.string.hotword_enrollment_enroll_tisid_talkback_number_of_queries_readout, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}));
                if (i4 > 0) {
                    ((TextView) view.findViewById(R.id.hotword_enrollment_query)).setText(BuildConfig.FLAVOR);
                    ((ImageView) view.findViewById(R.id.check_mark_view)).setVisibility(0);
                    ((LogoView) view.findViewById(R.id.user_input_logoview)).setVisibility(8);
                    if (i4 < i5) {
                        C102230s sVar = fVar2.f284522e;
                        C102231t e = C102232u.m169449e();
                        ((C101502c) e).f283252a = BuildConfig.FLAVOR;
                        sVar.mo93026h(e.mo92349a());
                        fVar2.f284519b.mo28213m("Proceed to next query", 1000, new C101962c(fVar2, view, str));
                    } else {
                        C102230s sVar2 = fVar2.f284522e;
                        C102231t e2 = C102232u.m169449e();
                        e2.mo92352d(fVar2.f284520c.getString(R.string.hotword_enrollment_utterance_title_final));
                        sVar2.mo93026h(e2.mo92349a());
                        fVar2.f284521d.mo83702b(C89849ae.VOICE_MATCH_CIRCLE_UI_UTTERANCE_COLLECTION_COMPLETE);
                        C22871g gVar = fVar2.f284519b;
                        Runnable runnable = fVar2.f284523f;
                        Objects.requireNonNull(runnable);
                        gVar.mo28213m("Trigger utterance complete action", 1000, new C101963d(runnable));
                    }
                    i = 1;
                } else {
                    view.findViewById(R.id.hotword_enrollment_enroll_hotword_list).addOnLayoutChangeListener(new C101964e(fVar2));
                    LogoView logoView = (LogoView) view.findViewById(R.id.user_input_logoview);
                    C88911am amVar = new C88911am();
                    amVar.f240858a = fVar2.f284520c.mo17754z().f284337G.mo92724a();
                    logoView.f63000g.mo28247c(amVar, 2);
                    i = 1;
                    logoView.mo28225e(2, true);
                    fVar2.mo92744d(view, str, true);
                }
                this.f284339I.mo92742b(this.f284341K, i);
                return;
            }
            return;
        }
        this.f284343M.setDisplayedChild(2);
        this.f284342L = 2;
        C102230s sVar3 = this.f284334D;
        C84010e e3 = C84011f.m133882e();
        e3.mo77375c(this.f284357h.getString(R.string.hotword_enrollment_intro_get_started));
        ((C83958a) e3).f228734b = new C101972m(this);
        sVar3.mo93025g(mo92698a(e3.mo77373a()));
    }

    /* renamed from: q */
    public final void mo92713q(int i) {
        C101965f fVar = this.f284339I;
        fVar.f284519b.mo28212l("#updateTextColor", new C101953b(fVar, this.f284341K, this.f284354e, i, this.f284331A.mo92638c()));
    }

    /* renamed from: r */
    public final boolean mo92714r() {
        return this.f284363n.mo83851N() && this.f284369t.mo85090c() && this.f284366q.mo79746e(C90082eg.f250016cZ);
    }

    /* renamed from: s */
    public final boolean mo92715s() {
        if (this.f284375z.mo92335h()) {
            return true;
        }
        if (this.f284362m.mo70891j() && this.f284362m.mo70885c().mo70898b() == z.b) {
            return false;
        }
        if (this.f284362m.mo70892k() && this.f284362m.mo70887e().mo70858g()) {
            return false;
        }
        if (this.f284353d || this.f284375z.mo92338k()) {
            return true;
        }
        return false;
    }
}
