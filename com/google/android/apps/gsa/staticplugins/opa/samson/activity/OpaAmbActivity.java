package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0395p;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0813f;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2097l;
import androidx.core.p098j.C2098m;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2383n;
import com.evernote.android.state.StateSaver;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.binaries.satin.app.aff;
import com.google.android.apps.gsa.binaries.satin.app.afh;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87548d;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7148ui.C90642ar;
import com.google.android.apps.gsa.shared.p7148ui.C90643as;
import com.google.android.apps.gsa.shared.p7148ui.SwipeDismissableFrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107071k;
import com.google.android.apps.gsa.staticplugins.opa.experience.C109024k;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8337bg.C108055b;
import com.google.android.apps.gsa.staticplugins.opa.p8337bg.C108058e;
import com.google.android.apps.gsa.staticplugins.opa.p8337bg.C108060g;
import com.google.android.apps.gsa.staticplugins.opa.p8337bg.C108061h;
import com.google.android.apps.gsa.staticplugins.opa.p8337bg.C108063j;
import com.google.android.apps.gsa.staticplugins.opa.p8337bg.C108064k;
import com.google.android.apps.gsa.staticplugins.opa.samson.activity.C110036p;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.AmbientBiometricsUnlockController;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110107e;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110112j;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.C110113k;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.lifecycleobservers.C110114a;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110091b;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110093d;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110095f;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110096g;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110097h;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110099j;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110100k;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110103n;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110106q;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110121g;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.BoundBrightnessSensorListener;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.BrightnessController;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110251c;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110252d;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110253e;
import com.google.android.apps.gsa.staticplugins.opa.samson.lightness.C110254f;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8434i.C110185g;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110262ab;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110265b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110284u;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110349bh;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110420g;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110425l;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.ActivityIdleDismissController;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110407d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110415l;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.C110416m;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114752f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114868dk;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.elements.p1714d.p1718d.C20893o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.android.play.core.p3534f.C45111s;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.ajb;
import com.google.common.p4552o.ajg;
import com.google.common.p4552o.akp;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4553a.C59565u;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class OpaAmbActivity extends C0395p implements C110107e, C2010ad, C110407d, C110252d, C90643as, C90642ar, C110112j {

    /* renamed from: j */
    public static final C59071e f306519j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.activity.OpaAmbActivity");

    /* renamed from: A */
    public C110265b f306520A;

    /* renamed from: B */
    public C110254f f306521B;

    /* renamed from: C */
    public C107071k f306522C;

    /* renamed from: D */
    public C69464a f306523D;

    /* renamed from: E */
    public C110185g f306524E;

    /* renamed from: F */
    ViewGroup f306525F;

    /* renamed from: G */
    View f306526G;

    /* renamed from: H */
    View f306527H;

    /* renamed from: I */
    ViewGroup f306528I;

    /* renamed from: J */
    ViewGroup f306529J;

    /* renamed from: K */
    ViewGroup f306530K;

    /* renamed from: L */
    TextView f306531L;

    /* renamed from: M */
    C109024k f306532M;

    /* renamed from: N */
    C60870cx f306533N;

    /* renamed from: O */
    View f306534O;

    /* renamed from: P */
    GestureDetector f306535P;

    /* renamed from: Q */
    public SwipeDismissableFrameLayout f306536Q;

    /* renamed from: R */
    public boolean f306537R = false;

    /* renamed from: S */
    public C110425l f306538S;

    /* renamed from: T */
    public C110402b f306539T;

    /* renamed from: U */
    private Application.ActivityLifecycleCallbacks f306540U;

    /* renamed from: V */
    private C110121g f306541V;

    /* renamed from: W */
    private C0816c f306542W;

    /* renamed from: X */
    private boolean f306543X = false;

    /* renamed from: Y */
    private final List f306544Y = new ArrayList();

    /* renamed from: k */
    public C110099j f306545k;

    /* renamed from: l */
    public C108061h f306546l;
    C110034n loggingState = C110034n.UNKNOWN;

    /* renamed from: m */
    public C110093d f306547m;

    /* renamed from: n */
    public C87673aa f306548n;

    /* renamed from: o */
    public C86124t f306549o;

    /* renamed from: p */
    public C22871g f306550p;

    /* renamed from: q */
    public Map f306551q;

    /* renamed from: r */
    public AmbientBiometricsUnlockController f306552r;

    /* renamed from: s */
    public ActivityIdleDismissController f306553s;
    C110035o state = C110035o.UPDATES;

    /* renamed from: t */
    public OpaAmbientUiStatus f306554t;

    /* renamed from: u */
    public BrightnessController f306555u;

    /* renamed from: v */
    public C110113k f306556v;

    /* renamed from: w */
    public C114868dk f306557w;

    /* renamed from: x */
    public C110114a f306558x;

    /* renamed from: y */
    public C110397a f306559y;

    /* renamed from: z */
    public C113863cr f306560z;

    /* renamed from: E */
    private final void m183250E() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        getWindow().setAttributes(attributes);
        this.f306522C.mo95766a();
        setTurnScreenOn(true);
    }

    /* renamed from: F */
    private final void m183251F(Intent intent) {
        if (intent != null) {
            switch (intent.getIntExtra("PHOTOS_EXTRA_EXIT_REASON", -1)) {
                case 0:
                    C58976aa aaVar = C58975e.f156826a;
                    finish();
                    return;
                case 1:
                    if (this.f306549o.mo79746e(C90014bt.f247069aG)) {
                        C58976aa aaVar2 = C58975e.f156826a;
                        return;
                    }
                    C58976aa aaVar3 = C58975e.f156826a;
                    finish();
                    return;
                case 3:
                case 4:
                    C58976aa aaVar4 = C58975e.f156826a;
                    mo98298B(true);
                    return;
                case 5:
                    C58976aa aaVar5 = C58975e.f156826a;
                    finish();
                    return;
                case 6:
                    if (!this.f306538S.mo98664b()) {
                        finish();
                        return;
                    }
                    return;
                case 7:
                    C58976aa aaVar6 = C58975e.f156826a;
                    finish();
                    return;
                case 8:
                    finish();
                    return;
                case 9:
                    C58976aa aaVar7 = C58975e.f156826a;
                    mo98298B(true);
                    return;
                default:
                    this.loggingState = C110034n.PHOTO;
                    return;
            }
        }
    }

    /* renamed from: G */
    private final void m183252G() {
        if (!this.f306548n.mo81951w()) {
            this.f306548n.mo81932c();
        }
        if (!this.f306548n.mo81953y()) {
            this.f306548n.mo81947s((Bundle) null);
        }
    }

    /* renamed from: H */
    private final void m183253H(Intent intent) {
        if (intent.hasExtra("MEDIA_EXTRA_EXIT_REASON")) {
            mo98305v(intent);
        } else if (intent.hasExtra("PHOTOS_EXTRA_EXIT_REASON")) {
            m183251F(intent);
        }
    }

    /* renamed from: I */
    private final void m183254I() {
        C60870cx cxVar = this.f306533N;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f306533N = null;
        }
    }

    /* renamed from: J */
    private final boolean m183255J() {
        Intent b;
        C69464a aVar = (C69464a) this.f306551q.get("ch-amb-pf-ip");
        if (aVar == null || (b = ((C110420g) aVar.mo17428b()).mo98440b()) == null) {
            return false;
        }
        startActivityForResult(b, 2);
        return true;
    }

    /* renamed from: A */
    public final void mo97369A(boolean z) {
        if (Boolean.TRUE.equals(Boolean.valueOf(z))) {
            C59104x b = f306519j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaAmbAct");
            ((C59052c) ((C59052c) b).mo56372aa(25578)).mo56386p("Activity idled.");
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo98298B(boolean z) {
        C110091b.m183350a(this.f306525F, this.f306528I, 0);
        this.state = C110035o.CLOCK;
        if (z) {
            this.f306545k.mo98373a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo98299C() {
        m183254I();
        if (getLifecycle().mo5789a() != C2383n.RESUMED) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (this.state == C110035o.CLOCK) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else if (m183255J()) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else {
            C110091b.m183350a(this.f306525F, this.f306528I, 300);
            this.state = C110035o.CLOCK;
            this.f306545k.mo98373a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo98300D(C28293k kVar, int i) {
        if (kVar == null) {
            C59104x d = f306519j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaAmbAct");
            ((C59052c) ((C59052c) d).mo56372aa(25569)).mo56386p("Ambient updates screen VE tree does not exist.");
            return;
        }
        ArrayList arrayList = new ArrayList(kVar.mo33746b());
        arrayList.addAll(this.f306544Y);
        C60321oe b = C28285c.m52875b(C28293k.m52907d(kVar.mo33745a(), arrayList), 472);
        if (b == null) {
            C59104x d2 = f306519j.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "OpaAmbAct");
            ((C59052c) ((C59052c) d2).mo56372aa(25568)).mo56386p("Client proto does not exist, failed to log ve impression");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        aqp aqp = (aqp) ((aqs) b.f163228c.get(0)).toBuilder();
        C62940bt btVar = ajg.f158866h;
        ajb ajb = (ajb) ajg.f158865g.createBuilder();
        ajb.copyOnWrite();
        ajg ajg = (ajg) ajb.instance;
        ajg.f158871d = i - 1;
        ajg.f158868a |= 256;
        ajb.copyOnWrite();
        ajg ajg2 = (ajg) ajb.instance;
        ajg2.f158872e = 2;
        ajg2.f158868a |= 512;
        aqp.mo58885m(btVar, (ajg) ajb.build());
        C60320od odVar = (C60320od) b.toBuilder();
        odVar.mo57084d(0, (aqs) aqp.build());
        aql aql = (aql) aqm.f159760n.createBuilder();
        aql.copyOnWrite();
        aqm aqm = (aqm) aql.instance;
        aqm.f159762a |= 4;
        aqm.f159765d = 75711;
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        aqm aqm2 = (aqm) aql.build();
        aqm2.getClass();
        oeVar.f163230e = aqm2;
        oeVar.f163226a |= 16;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 472;
        C59565u uVar = C59565u.f158051f;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        uVar.getClass();
        ufVar2.f164174bb = uVar;
        ufVar2.f164251f |= 33554432;
        this.f306560z.mo100722b(0, 0, (C60555uf) tzVar.build(), (C60321oe) odVar.build());
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        C2098m q = cpVar.f5994b.mo5234q();
        if (q != null) {
            this.f306528I.setPadding(C2097l.m5778b(q.f6013a), C2097l.m5780d(q.f6013a), C2097l.m5779c(q.f6013a), C2097l.m5777a(q.f6013a));
            this.f306527H.setPadding(C2097l.m5778b(q.f6013a), C2097l.m5780d(q.f6013a), C2097l.m5779c(q.f6013a), C2097l.m5777a(q.f6013a));
        }
        return cpVar.f5994b.mo5235r();
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C45111s.m80290c(this, false);
    }

    /* renamed from: b */
    public final boolean mo84935b() {
        return this.f306546l.f300612d.f300625e.mo101416f(1);
    }

    /* renamed from: c */
    public final void mo84936c() {
        if (((KeyguardManager) getSystemService("keyguard")).isKeyguardLocked()) {
            this.f306536Q.setVisibility(8);
            this.f306522C.mo95770e(new C110032l(this));
            return;
        }
        finish();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BrightnessController brightnessController = this.f306555u;
        int action = motionEvent.getAction();
        C58976aa aaVar = C58975e.f156826a;
        if (brightnessController.f307236e) {
            if (brightnessController.f307237f) {
                brightnessController.mo98494g(false);
            }
            brightnessController.mo98495h();
            if (action == 1 || action == 3) {
                brightnessController.f307238g = brightnessController.f307235d.mo28208h("APPLY_AOD_BRIGHTNESS_MODE_TIMEOUT", BrightnessController.f307233b, new C110251c(brightnessController));
            }
        }
        this.f306535P.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 17432577);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            if (extras.containsKey("MEDIA_EXTRA_EXIT_REASON")) {
                mo98305v(intent);
            } else if (extras.containsKey("PHOTOS_EXTRA_EXIT_REASON")) {
                m183251F(intent);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m183250E();
        C108061h hVar = this.f306546l;
        int i = configuration.orientation;
        C108063j jVar = hVar.f300612d;
        C58976aa aaVar = C58975e.f156826a;
        jVar.f300625e.mo101435y();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        GradientDrawable gradientDrawable;
        C74504a.m120462a(f.ay);
        super.onCreate(bundle);
        C110036p pVar = new C110036p(this);
        if (pVar.f306587b == null) {
            ((C110036p.C110037a) C47266f.m84076a(pVar.f306586a, C110036p.C110037a.class)).mo98324qJ(pVar);
        }
        aff aff = pVar.f306587b;
        LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.getClass();
        aff.f195951b = layoutInflater;
        aff.f195952c = C58836b.f156633a;
        aff.f195953d = this;
        aff.f195954e = this;
        aff.f195955f = this;
        Optional of = Optional.m71637of(this);
        of.getClass();
        aff.f195956g = of;
        aff.f195957h = this;
        aff.f195958i = this;
        aff.f195959j = this;
        akp akp = akp.CLOCK_SCREEN;
        akp.getClass();
        aff.f195960k = akp;
        C68225k.m98529a(aff.f195951b, LayoutInflater.class);
        C68225k.m98529a(aff.f195952c, C58833ax.class);
        C68225k.m98529a(aff.f195953d, C0395p.class);
        C68225k.m98529a(aff.f195954e, Context.class);
        C68225k.m98529a(aff.f195955f, C0167am.class);
        C68225k.m98529a(aff.f195956g, Optional.class);
        C68225k.m98529a(aff.f195957h, C110107e.class);
        C68225k.m98529a(aff.f195958i, C110407d.class);
        C68225k.m98529a(aff.f195959j, C110252d.class);
        C68225k.m98529a(aff.f195960k, akp.class);
        afh afh = new afh(aff.f195950a, new C20893o(), aff.f195951b, aff.f195952c, aff.f195953d, aff.f195955f, aff.f195956g, aff.f195957h, aff.f195958i, aff.f195959j, aff.f195960k);
        C118561t tVar = (C118561t) afh.g.a.f202112E.mo17428b();
        C0395p pVar2 = afh.a;
        C58495hd o = C58495hd.m89901o(C110103n.class, afh.j, C110106q.class, afh.l);
        C69464a aVar = afh.i;
        aqy aqy = afh.g;
        asp asp = aqy.a;
        C69464a aVar2 = asp.f202006C;
        C69464a aVar3 = aqy.b.f200194ew;
        C69464a aVar4 = afh.m;
        C69464a a = C68226l.m98533a(asp.f202758dC);
        C69464a a2 = C68226l.m98533a(afh.g.a.f202324I);
        C69464a aVar5 = afh.n;
        aqy aqy2 = afh.g;
        C69464a aVar6 = aqy2.aT;
        C58495hd hdVar = o;
        C69464a aVar7 = aqy2.aU;
        C110095f fVar = (C110095f) afh.h.mo17428b();
        C69464a aVar8 = afh.p;
        C110254f fVar2 = (C110254f) afh.g.b.f200225fa.mo17428b();
        C69464a aVar9 = afh.q;
        C21378h hVar = (C21378h) afh.g.gT.mo17428b();
        C69464a aVar10 = afh.r;
        h hVar2 = (h) afh.g.a.f202853es.mo17428b();
        C0395p pVar3 = pVar2;
        h hVar3 = hVar2;
        C21378h hVar4 = hVar;
        C110254f fVar3 = fVar2;
        C110095f fVar4 = fVar;
        C58495hd hdVar2 = hdVar;
        this.f306545k = new C110099j((C86124t) afh.g.a.f202006C.mo17428b(), pVar3, hVar3, hVar4, fVar3, fVar4, hdVar2, new C110284u(aVar, aVar2, aVar3, aVar4, a, a2, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, afh.s, aqy2.b.f200195ex, aqy2.a.f202730cb), new C110349bh(afh.g.g), (C110416m) afh.u.mo17428b());
        C69464a aVar11 = afh.i;
        aqy aqy3 = afh.g;
        C113863cr crVar = (C113863cr) afh.x.mo17428b();
        this.f306546l = new C108061h(afh.g.b.mo67234Y(), (C90929bz) afh.g.a.f203444q.mo17428b(), new C108064k(aVar11, aqy3.b.f200304h, afh.y, afh.am, aqy3.a.f202812eD), afh.g.b.mo67585rd(), (C108055b) afh.y.mo17428b(), (C107698i) afh.w.mo17428b(), (C107710u) afh.v.mo17428b(), (C53306j) afh.an.mo17428b(), (C114748b) afh.D.mo17428b(), (C87681ai) afh.r.mo17428b());
        this.f306547m = afh.d();
        this.f306548n = (C87673aa) afh.r.mo17428b();
        this.f306549o = (C86124t) afh.g.a.f202006C.mo17428b();
        this.f306550p = (C22871g) afh.g.aT.mo17428b();
        this.f306551q = (Map) afh.g.b.f199973an.mo17428b();
        this.f306552r = new AmbientBiometricsUnlockController((C86124t) afh.g.a.f202006C.mo17428b(), (C22871g) afh.g.aT.mo17428b(), (Activity) ((C68221g) afh.i).f184583a, afh.c);
        this.f306553s = (ActivityIdleDismissController) afh.ao.mo17428b();
        this.f306554t = (OpaAmbientUiStatus) afh.g.ic.mo17428b();
        this.f306555u = new BrightnessController((Activity) ((C68221g) afh.i).f184583a, (C86124t) afh.g.a.f202006C.mo17428b(), new BoundBrightnessSensorListener(afh.g.b.mo67560h(), (C110253e) afh.g.b.f200231fg.mo17428b(), afh.ap), (C110253e) afh.g.b.f200231fg.mo17428b(), (C22871g) afh.g.aT.mo17428b(), afh.e);
        this.f306538S = (C110425l) afh.g.b.f200194ew.mo17428b();
        this.f306556v = (C110113k) afh.aq.mo17428b();
        this.f306557w = (C114868dk) afh.k.mo17428b();
        C68219e.m98518a(afh.g.gX);
        this.f306558x = (C110114a) afh.g.a.f202763dH.mo17428b();
        this.f306539T = (C110402b) afh.g.a.f202859ey.mo17428b();
        this.f306559y = (C110397a) afh.g.a.f202761dF.mo17428b();
        this.f306560z = (C113863cr) afh.x.mo17428b();
        this.f306520A = (C110265b) afh.s.mo17428b();
        this.f306521B = (C110254f) afh.g.b.f200225fa.mo17428b();
        this.f306522C = (C107071k) afh.o.mo17428b();
        this.f306523D = afh.ar;
        this.f306524E = (C110185g) afh.g.b.f200230ff.mo17428b();
        m183253H(getIntent());
        if (!isFinishing()) {
            C58976aa aaVar = C58975e.f156826a;
            if (bundle == null) {
                this.f306543X = true;
            }
            this.f306540U = new C110033m(this);
            this.f306541V = new C110038q(this);
            StateSaver.restoreInstanceState((Object) this, bundle);
            this.f306520A.mo98510b((C110262ab) new C2368bp(this).mo5770a(C110262ab.class));
            m183250E();
            setContentView((int) R.layout.opa_amb_activity);
            if (!C90685b.m148054b(this, this.f306549o)) {
                setRequestedOrientation(1);
            }
            this.f306534O = getWindow().getDecorView().getRootView();
            this.f306526G = findViewById(R.id.amb_settings);
            C28292j jVar = new C28292j(83115);
            jVar.mo33795i(5);
            C28295m.m52919e(this.f306526G, jVar);
            this.f306544Y.add(C28293k.m52908e(jVar, new C28293k[0]));
            this.f306542W = mo3336s(new C0813f(), this.f2708i, C110024d.f306568a);
            this.f306526G.setOnClickListener(new C89943l(new C110025e(this)));
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.opa_amb_clock_container);
            this.f306525F = viewGroup;
            viewGroup.setAlpha(0.0f);
            C110099j jVar2 = this.f306545k;
            View a3 = ((C110100k) jVar2.f306753a.mo17428b()).mo98375a();
            if (!jVar2.f306759g) {
                jVar2.f306757e.mo5704e(jVar2.f306756d, new C110096g(jVar2));
                jVar2.f306763k.mo26881h(jVar2.f306755c);
                jVar2.f306763k.mo26880g(jVar2.f306755c);
                jVar2.mo98374b();
                ((C110100k) jVar2.f306753a.mo17428b()).mo98375a().setOnClickListener(jVar2.f306761i);
                jVar2.f306762j = (C109024k) new C2368bp(jVar2.f306756d).mo5770a(C109024k.class);
                C110349bh bhVar = jVar2.f306758f;
                C109024k kVar = jVar2.f306762j;
                kVar.getClass();
                bhVar.mo98582a(kVar).mo98563b(jVar2.f306756d);
                C109024k kVar2 = jVar2.f306762j;
                kVar2.getClass();
                kVar2.f303168d.mo5704e(jVar2.f306756d, new C110097h((TextView) ((C110100k) jVar2.f306753a.mo17428b()).mo98375a().findViewById(R.id.ambient_clock_battery)));
                jVar2.f306759g = true;
            }
            this.f306527H = a3;
            this.f306525F.addView(a3);
            C110099j jVar3 = this.f306545k;
            jVar3.f306761i = new C89943l(new C110026f(this));
            if (jVar3.f306759g) {
                ((C110100k) jVar3.f306753a.mo17428b()).mo98375a().setOnClickListener(jVar3.f306761i);
            }
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.opa_amb_assistant_update_container);
            this.f306528I = viewGroup2;
            if (!(viewGroup2 == null || (gradientDrawable = (GradientDrawable) ((LayerDrawable) viewGroup2.getBackground()).findDrawableByLayerId(R.id.gradientDrawable)) == null)) {
                this.f306557w.mo101667a();
                C114752f fVar5 = C114752f.UNKNOWN;
                C110034n nVar = C110034n.UNKNOWN;
                C110035o oVar = C110035o.UPDATES;
                int ordinal = this.f306557w.f318710a.ordinal();
                if (ordinal == 1) {
                    gradientDrawable.mutate();
                    gradientDrawable.setColors(new int[]{getResources().getColor(R.color.ambient_background_morning_top), getResources().getColor(R.color.ambient_background_morning_bottom)});
                } else if (ordinal == 2) {
                    gradientDrawable.mutate();
                    gradientDrawable.setColors(new int[]{getResources().getColor(R.color.ambient_background_afternoon_top), getResources().getColor(R.color.ambient_background_afternoon_bottom)});
                } else if (ordinal == 3) {
                    gradientDrawable.mutate();
                    gradientDrawable.setColors(new int[]{getResources().getColor(R.color.ambient_background_evening_top), getResources().getColor(R.color.ambient_background_evening_bottom)});
                } else if (ordinal == 4) {
                    gradientDrawable.mutate();
                    gradientDrawable.setColors(new int[]{getResources().getColor(R.color.ambient_background_night_top), getResources().getColor(R.color.ambient_background_night_bottom)});
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.opa_amb_zero_state_container);
            this.f306529J = viewGroup3;
            C108061h hVar5 = this.f306546l;
            if (hVar5.f300618j == null) {
                hVar5.f300618j = hVar5.f300612d.mo96414a();
                hVar5.f300611c.mo96220c(new C108058e(hVar5), C88244um.START_ACTIVITY);
                C108055b bVar = hVar5.f300615g;
                hVar5.f300614f.mo85147l(hVar5.f300613e.mo77516a(hVar5.f300619k.mo81666a(new C87548d(new C87680ah(hVar5.f300617i), false))), new C108060g(hVar5));
            }
            viewGroup3.addView(hVar5.f300612d.mo96414a());
            this.f306531L = (TextView) findViewById(R.id.amb_updates_battery);
            C109024k kVar3 = (C109024k) new C2368bp(this).mo5770a(C109024k.class);
            this.f306532M = kVar3;
            kVar3.f303168d.mo5704e(this, new C110019a(this));
            this.f306530K = (ViewGroup) findViewById(R.id.opa_amb_logo_container);
            if (this.f306549o.mo79746e(C90014bt.f247220cz)) {
                ImageView a4 = this.f306547m.mo98370a(e.aq, R.layout.amb_opa_logo_view, 83114);
                this.f306530K.addView(a4);
                this.f306544Y.add(C28293k.m52908e(C28295m.m52915a(a4), new C28293k[0]));
                this.loggingState = C110034n.INITIAL;
            } else {
                this.f306530K.setVisibility(8);
            }
            m183252G();
            C108061h hVar6 = this.f306546l;
            C107698i iVar = hVar6.f300610b;
            C88489j jVar4 = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
            C62940bt btVar = C87694ac.f237131a;
            C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
            adVar.copyOnWrite();
            C87696ae aeVar = (C87696ae) adVar.instance;
            aeVar.f237134a |= 1024;
            aeVar.f237144k = true;
            C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
            C53306j jVar5 = hVar6.f300616h;
            hpVar.copyOnWrite();
            C53271hs hsVar = (C53271hs) hpVar.instance;
            hsVar.f139663l = jVar5.f139793X;
            hsVar.f139652a |= 512;
            C53270hr hrVar = C53270hr.FOREGROUND;
            hpVar.copyOnWrite();
            C53271hs hsVar2 = (C53271hs) hpVar.instance;
            hsVar2.f139665n = hrVar.f139649g;
            hsVar2.f139652a |= 2048;
            C53271hs hsVar3 = (C53271hs) hpVar.build();
            adVar.copyOnWrite();
            C87696ae aeVar2 = (C87696ae) adVar.instance;
            hsVar3.getClass();
            aeVar2.f237136c = hsVar3;
            aeVar2.f237134a |= 2;
            adVar.copyOnWrite();
            C87696ae aeVar3 = (C87696ae) adVar.instance;
            aeVar3.f237134a |= 2048;
            aeVar3.f237145l = false;
            jVar4.mo82014b(btVar, (C87696ae) adVar.build());
            iVar.mo96219b(jVar4.mo82013a());
            this.f306552r.mo98334b(this);
            this.f306554t.mo98393f(this.f306541V);
            ((TouchInterceptingFrameLayout) findViewById(R.id.opa_amb_root)).f253398a = new C110022b(this);
            SwipeDismissableFrameLayout swipeDismissableFrameLayout = (SwipeDismissableFrameLayout) findViewById(R.id.opa_amb_swipe_dismissable_root);
            this.f306536Q = swipeDismissableFrameLayout;
            swipeDismissableFrameLayout.f253387b = this;
            swipeDismissableFrameLayout.f253388c = this;
            this.f306535P = new GestureDetector(this, new C110039r(this));
            this.f306553s.mo98644a(this);
            BrightnessController brightnessController = this.f306555u;
            getLifecycle().mo5790b(brightnessController);
            getLifecycle().mo5790b(brightnessController.f307234c);
            C110099j jVar6 = this.f306545k;
            jVar6.f306754b.mo98530a((FrameLayout) ((C110100k) jVar6.f306753a.mo17428b()).mo98375a().findViewById(R.id.ambient_smart_space));
            C2043bi.m5555ai(this.f306534O, this);
            if (this.f306549o.mo79746e(C90014bt.f247751n)) {
                this.f306521B.mo5704e(this, new C110023c(this));
            }
            C114752f fVar6 = C114752f.UNKNOWN;
            C110034n nVar2 = C110034n.UNKNOWN;
            C110035o oVar2 = C110035o.UPDATES;
            int ordinal2 = this.state.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    mo98298B(false);
                }
            } else if (this.f306543X && this.f306537R && this.f306549o.mo79746e(C90014bt.f247751n)) {
                mo98298B(false);
            }
            if (!this.f306539T.mo98629a()) {
                finish();
            }
            if (bundle != null && !this.f306559y.mo98624b(true)) {
                finish();
            }
            getLifecycle().mo5790b(this.f306558x);
            this.f306554t.mo98392e(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        C58976aa aaVar = C58975e.f156826a;
        C110099j jVar = this.f306545k;
        jVar.f306763k.mo26883j(jVar.f306755c);
        jVar.f306763k.mo26882i(jVar.f306755c);
        this.f306546l.f300612d.f300625e.mo101423m();
        if (this.f306548n.mo81953y()) {
            this.f306548n.mo81948t(false);
        }
        if (this.f306548n.mo81951w()) {
            this.f306548n.mo81933e();
        }
        C110121g gVar = this.f306541V;
        if (gVar != null) {
            this.f306554t.mo98394g(gVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m183253H(intent);
            if (intent.getIntExtra("launched_from_screen_trigger", -1) == 0 && !this.f306549o.mo79746e(C90014bt.f247069aG)) {
                C58976aa aaVar = C58975e.f156826a;
                PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435482, "agsa:opa-amb-activity");
                newWakeLock.acquire(200);
                try {
                    newWakeLock.release();
                } catch (RuntimeException unused) {
                }
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        C58976aa aaVar = C58975e.f156826a;
        m183254I();
        if (this.f306549o.mo79746e(C90014bt.f247840p)) {
            this.f306524E.mo98460b(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        C58976aa aaVar = C58975e.f156826a;
        this.f306522C.mo95768c();
        if (this.f306549o.mo79746e(C90014bt.f247840p)) {
            C110415l lVar = this.f306545k.f306760h;
            if (lVar != null) {
                lVar.mo98651b();
            }
            this.f306524E.mo98459a(this);
        }
        this.f306545k.f306754b.mo98533d();
        m183252G();
        if (this.state == C110035o.UPDATES) {
            if (!this.f306538S.mo98664b()) {
                mo98298B(true);
            } else if (!this.f306543X || !this.f306537R || !this.f306549o.mo79746e(C90014bt.f247751n)) {
                C114752f fVar = C114752f.UNKNOWN;
                C110034n nVar = C110034n.UNKNOWN;
                int ordinal = this.loggingState.ordinal();
                if (ordinal == 1) {
                    this.f306546l.mo96387a(new C110028h(this));
                } else if (ordinal == 2) {
                    this.f306546l.mo96387a(new C110027g(this));
                } else if (ordinal != 3) {
                    this.f306546l.mo96387a(new C110029i(this));
                } else if (this.state == C110035o.UPDATES) {
                    mo98300D(this.f306546l.f300612d.mo96415b(), 1);
                }
                mo98307x();
            } else {
                this.f306543X = false;
                mo98298B(true);
            }
        }
        this.loggingState = C110034n.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        StateSaver.saveInstanceState((Object) this, bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        C58976aa aaVar = C58975e.f156826a;
        C110099j jVar = this.f306545k;
        jVar.f306754b.mo98531b(jVar.f306756d);
        getApplication().registerActivityLifecycleCallbacks(this.f306540U);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        C58976aa aaVar = C58975e.f156826a;
        this.f306556v.mo98389a();
        getApplication().unregisterActivityLifecycleCallbacks(this.f306540U);
        this.f306545k.f306754b.mo98532c();
    }

    public final void onUserInteraction() {
        super.onUserInteraction();
        this.f306553s.f307715k.mo98404b();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C110113k kVar = this.f306556v;
        C58976aa aaVar = C58975e.f156826a;
        kVar.f306831a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo98305v(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("MEDIA_EXTRA_EXIT_REASON", -1);
            C59071e eVar = f306519j;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaAmbAct");
            ((C59052c) ((C59052c) b).mo56372aa(25555)).mo56387q("exit with reason: %d", intExtra);
            if (intExtra != -1) {
                switch (intExtra) {
                    case 0:
                        if (m183255J()) {
                            return;
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        if (this.f306538S.mo98664b()) {
                            C110034n nVar = C110034n.MEDIA;
                            if (!this.f306538S.mo98664b()) {
                                C59104x c = eVar.mo56225c();
                                c.mo56378ag(C58975e.f156826a, "OpaAmbAct");
                                ((C59052c) ((C59052c) c).mo56372aa(25590)).mo56386p("switchToUpdatesScreen() called even though updates screen should not be shown!");
                                return;
                            }
                            C110091b.m183350a(this.f306528I, this.f306525F, 0);
                            this.state = C110035o.UPDATES;
                            this.loggingState = nVar;
                            return;
                        }
                        mo98298B(true);
                        return;
                    case 3:
                    case 6:
                        if (!this.f306549o.mo79746e(C90014bt.f247069aG)) {
                            finish();
                            return;
                        }
                        return;
                    case 4:
                        if (!this.f306538S.mo98664b()) {
                            finish();
                            return;
                        }
                        return;
                    case 7:
                        finish();
                        return;
                    case 8:
                        finish();
                        return;
                    default:
                        return;
                }
                mo98298B(true);
            }
        }
    }

    /* renamed from: w */
    public final void mo98306w() {
        if (this.f306549o.mo79746e(C90059dk.f249138bv)) {
            C0816c cVar = this.f306542W;
            C18509a aVar = (C18509a) this.f306523D.mo17428b();
            aVar.mo24024f("ambient");
            cVar.mo526b(aVar.mo24020b().mo24031a());
            return;
        }
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "android_device_settings";
        this.f306542W.mo526b(c.mo24020b().mo24031a());
    }

    /* renamed from: x */
    public final void mo98307x() {
        C60870cx cxVar = this.f306533N;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        this.f306533N = this.f306550p.mo28208h("opa:amb-fade-to-amb-sc", this.f306549o.mo79743a(C90014bt.f247592k), new C110040s(this));
    }

    /* renamed from: y */
    public final void mo98308y(float f) {
        C58976aa aaVar = C58975e.f156826a;
        this.f306534O.setAlpha(f);
    }

    /* renamed from: z */
    public final void mo97376z() {
        boolean z = this.f306522C.f298118b;
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            finish();
        }
    }
}
