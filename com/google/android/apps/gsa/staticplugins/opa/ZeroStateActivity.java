package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.app.C0401v;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73908b;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.ars;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.binaries.satin.app.bbb;
import com.google.android.apps.gsa.binaries.satin.app.bbd;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87547c;
import com.google.android.apps.gsa.search.shared.p6928f.C87548d;
import com.google.android.apps.gsa.search.shared.p6928f.C87549e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7003av.C89293a;
import com.google.android.apps.gsa.shared.p7003av.C89294b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.p7066m.C90146y;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.opa.C109866oo;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108051f;
import com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108052g;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113720h;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113721i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114119ax;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114754h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114755i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8635i.C114773b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114796at;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b.C114951c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b.C114952d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b.C114953e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b.C114954f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b.C114955g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b.C114957i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b.C114958j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.p1714d.p1718d.C20893o;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21603c;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.play.core.p3534f.C45111s;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53284ie;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class ZeroStateActivity extends C0395p {

    /* renamed from: j */
    public static final C59071e f295675j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity");

    /* renamed from: A */
    public C114742l f295676A;

    /* renamed from: B */
    public C114735e f295677B;

    /* renamed from: C */
    public C114737g f295678C;

    /* renamed from: D */
    public C68214a f295679D;

    /* renamed from: E */
    public C107698i f295680E;

    /* renamed from: F */
    public C68214a f295681F;

    /* renamed from: G */
    public C89293a f295682G;

    /* renamed from: H */
    public C114773b f295683H;

    /* renamed from: I */
    boolean f295684I = false;

    /* renamed from: J */
    public C109870or f295685J;

    /* renamed from: K */
    public C87547c f295686K;

    /* renamed from: L */
    private C87673aa f295687L;

    /* renamed from: M */
    private View f295688M;

    /* renamed from: N */
    private C28293k f295689N;

    /* renamed from: O */
    private boolean f295690O;

    /* renamed from: P */
    private boolean f295691P = true;

    /* renamed from: Q */
    private C114957i f295692Q;

    /* renamed from: k */
    public Context f295693k;

    /* renamed from: l */
    public C114754h f295694l;

    /* renamed from: m */
    public C108051f f295695m;

    /* renamed from: n */
    public C86124t f295696n;

    /* renamed from: o */
    public C87549e f295697o;

    /* renamed from: p */
    public C22871g f295698p;

    /* renamed from: q */
    public C58833ax f295699q;

    /* renamed from: r */
    public C87571n f295700r;

    /* renamed from: s */
    public C114860dc f295701s;

    /* renamed from: t */
    public C114958j f295702t;

    /* renamed from: u */
    public C114748b f295703u;

    /* renamed from: v */
    public C108052g f295704v;

    /* renamed from: w */
    public C109728nb f295705w;

    /* renamed from: x */
    public C109717mv f295706x;

    /* renamed from: y */
    public C109248v f295707y;

    /* renamed from: z */
    public C109739nm f295708z;

    /* renamed from: x */
    private final void m176469x() {
        C0401v.m1321C();
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (C90962a.m148577a(this.f295693k)) {
            decorView.setSystemUiVisibility(systemUiVisibility & -8193);
        } else {
            decorView.setSystemUiVisibility(systemUiVisibility | 8192);
        }
    }

    /* renamed from: y */
    private final void m176470y(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        String stringExtra = intent.getStringExtra("deep_link_data");
        if (stringExtra == null) {
            Uri data = intent.getData();
            if (data != null) {
                stringExtra = C87571n.m142343g(data.toString());
            } else {
                return;
            }
        }
        C53287ih d = C87571n.m142340d(stringExtra);
        if (d != null) {
            int a = C53284ie.m86806a(d.f139698d);
            boolean z = true;
            if ((a == 0 || a != 3) && !d.f139700f) {
                z = false;
            }
            this.f295690O = z;
            this.f295703u.f318451d = stringExtra;
            return;
        }
        C59104x d2 = f295675j.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "ZeroStateActivity");
        ((C59052c) ((C59052c) d2).mo56372aa(23035)).mo56389s("#setDeepLinkData(): failed to parse base64 encoded data: %s", stringExtra);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C45111s.m80290c(this, false);
        C90476a aVar = C91018d.f254254a;
        C45111s.m80290c(this, false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f295685J.mo85356g(i, i2, intent, this);
    }

    public final void onBackPressed() {
        moveTaskToBack(true);
    }

    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        C114957i iVar;
        C74504a.m120462a(f.aj);
        C58976aa aaVar = C58975e.f156826a;
        C89838ab.m146266j(38);
        super.onCreate(bundle);
        C109866oo ooVar = new C109866oo(this);
        if (ooVar.f306125b == null) {
            ((C109866oo.C109867a) C47266f.m84076a(ooVar.f306124a, C109866oo.C109867a.class)).mo98214qA(ooVar);
        }
        bbb bbb = ooVar.f306125b;
        bbb.f204934b = this;
        bbb.f204935c = this;
        bbb.f204936d = this;
        C68225k.m98529a(bbb.f204934b, Activity.class);
        C68225k.m98529a(bbb.f204935c, C0167am.class);
        C68225k.m98529a(bbb.f204936d, C2391v.class);
        bbd bbd = new bbd(bbb.f204933a, new C20893o(), bbb.f204934b, bbb.f204935c, bbb.f204936d);
        this.f295696n = (C86124t) bbd.f205016b.a.f202006C.mo17428b();
        this.f295697o = bbd.f205016b.b.mo67234Y();
        this.f295698p = (C22871g) bbd.f205016b.aT.mo17428b();
        this.f295699q = (C58833ax) bbd.f204959W.mo17428b();
        this.f295700r = (C87571n) bbd.f205016b.a.f202811eC.mo17428b();
        this.f295701s = (C114860dc) bbd.f205106s.mo17428b();
        aqy aqy = bbd.f205016b;
        C69464a aVar = aqy.g;
        C69464a aVar2 = bbd.f205069c;
        asp asp = aqy.a;
        C69464a aVar3 = asp.f202218G;
        C69464a a = C68226l.m98533a(asp.f202866fE);
        aqy aqy2 = bbd.f205016b;
        asp asp2 = aqy2.a;
        C69464a aVar4 = asp2.f202860ez;
        C69464a aVar5 = asp2.f202813eE;
        ars ars = aqy2.b;
        this.f295702t = new C114958j(aVar, aVar2, aVar3, a, aVar4, aVar5, ars.f200304h, asp2.f202006C, ars.f200021bi, aqy2.aT, aqy2.aU, C68226l.m98533a(ars.f199968ai));
        this.f295703u = (C114748b) bbd.f205098k.mo17428b();
        this.f295704v = (C108052g) bbd.f204990aa.mo17428b();
        this.f295705w = bbd.f205016b.a.mo68167cY();
        this.f295706x = (C109717mv) bbd.f205091d.mo17428b();
        this.f295707y = (C109248v) bbd.f205016b.b.f200304h.mo17428b();
        this.f295708z = (C109739nm) bbd.f205016b.b.f200184em.mo17428b();
        this.f295676A = (C114742l) bbd.f205097j.mo17428b();
        this.f295677B = (C114735e) bbd.f205101n.mo17428b();
        this.f295678C = (C114737g) bbd.f205095h.mo17428b();
        this.f295679D = C68219e.m98518a(bbd.f205016b.a.f202688bm);
        C68219e.m98518a(bbd.f205016b.a.f202586Q);
        bm bmVar = (bm) bbd.f205016b.a.f202218G.mo17428b();
        aqy aqy3 = bbd.f205016b;
        this.f295686K = aqy3.b.mo67585rd();
        C91142g gVar = (C91142g) aqy3.bq.mo17428b();
        this.f295680E = (C107698i) bbd.f205092e.mo17428b();
        this.f295681F = C68219e.m98518a(bbd.f205016b.a.f202324I);
        C21601a aVar6 = (C21601a) bbd.f205016b.b.f200175ed.mo17428b();
        C21603c cVar = (C21603c) bbd.f205016b.b.f200176ee.mo17428b();
        this.f295682G = (C89293a) bbd.f205016b.b.f200169eX.mo17428b();
        C68219e.m98518a(bbd.f205103p);
        C114796at atVar = (C114796at) bbd.f205099l.mo17428b();
        this.f295683H = (C114773b) bbd.f205107t.mo17428b();
        this.f295677B.mo101559g();
        this.f295693k = getApplicationContext();
        this.f295685J = new C109870or(this);
        m176469x();
        Intent intent = getIntent();
        this.f295706x.mo98048b((C90757ba) null);
        C87673aa a2 = this.f295706x.mo98047a();
        this.f295687L = a2;
        a2.mo81932c();
        this.f295687L.mo81940l(new C109764oj(this), C88244um.START_ACTIVITY);
        setContentView((int) R.layout.standalone_zero_state_container);
        C109870or orVar = this.f295685J;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.zero_state_input_plate_container);
        C114958j jVar = this.f295702t;
        viewGroup2.getClass();
        ((Context) jVar.f318975a.mo17428b()).getClass();
        Activity activity = (Activity) ((C68221g) jVar.f318976b).f184583a;
        activity.getClass();
        bm bmVar2 = (bm) jVar.f318977c.mo17428b();
        bmVar2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) jVar.f318978d).f184585a);
        a3.getClass();
        C58833ax axVar = (C58833ax) jVar.f318979e.mo17428b();
        axVar.getClass();
        C58833ax axVar2 = (C58833ax) jVar.f318980f.mo17428b();
        axVar2.getClass();
        C109248v vVar = (C109248v) jVar.f318981g.mo17428b();
        vVar.getClass();
        C86124t tVar = (C86124t) jVar.f318982h.mo17428b();
        tVar.getClass();
        C73908b bVar = (C73908b) jVar.f318983i.mo17428b();
        bVar.getClass();
        C22871g gVar2 = (C22871g) jVar.f318984j.mo17428b();
        gVar2.getClass();
        C22871g gVar3 = (C22871g) jVar.f318985k.mo17428b();
        gVar3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) jVar.f318986l).f184585a);
        a4.getClass();
        orVar.getClass();
        C114957i iVar2 = new C114957i(activity, bmVar2, a3, axVar, axVar2, vVar, tVar, bVar, gVar2, gVar3, a4, orVar, viewGroup2);
        this.f295692Q = iVar2;
        if (!iVar2.f318962e.mo56113h() || !((C74715bp) iVar2.f318962e.mo56107c()).mo71084e()) {
            viewGroup = (ViewGroup) LayoutInflater.from(iVar2.f318959b).inflate(R.layout.zero_state_input_plate_view, iVar2.f318968k, false);
            viewGroup.getClass();
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.zero_state_input_plate_updates_icon);
            C28292j jVar2 = new C28292j(96306);
            imageView.getClass();
            C28295m.m52919e(imageView, jVar2);
            iVar2.f318970m.add(C28293k.m52908e(jVar2, new C28293k[0]));
            iVar2.f318972o = (ImageView) viewGroup.findViewById(R.id.zero_state_input_plate_explore_icon);
            if (!iVar2.f318965h.mo79746e(C90146y.f251892d) && iVar2.f318960c.v()) {
                C28292j jVar3 = new C28292j(96307);
                jVar3.mo33795i(5);
                ImageView imageView2 = iVar2.f318972o;
                imageView2.getClass();
                C28295m.m52919e(imageView2, jVar3);
                iVar2.f318970m.add(C28293k.m52908e(jVar3, new C28293k[0]));
                iVar2.mo101747b(false);
            } else {
                ImageView imageView3 = iVar2.f318972o;
                imageView3.getClass();
                imageView3.setVisibility(8);
            }
            LogoView logoView = (LogoView) viewGroup.findViewById(R.id.zero_state_input_plate_mic_icon);
            float integer = (float) iVar2.f318959b.getResources().getInteger(R.integer.zero_state_input_plate_opa_mic_icon_size);
            iVar2.mo101746a(logoView, integer, integer, new C89943l(new C114951c(iVar2)));
            if (!((C27683a) iVar2.f318961d.mo27525b()).mo33175b() || !((C27683a) iVar2.f318961d.mo27525b()).mo33174a()) {
                viewGroup.findViewById(R.id.zero_state_input_plate_lens_icon).setVisibility(8);
                ((FrameLayout.LayoutParams) logoView.getLayoutParams()).gravity = 83;
            } else {
                View findViewById = viewGroup.findViewById(R.id.zero_state_input_plate_lens_icon);
                C28292j jVar4 = new C28292j(96308);
                jVar4.mo33795i(5);
                findViewById.getClass();
                C28295m.m52919e(findViewById, jVar4);
                iVar2.f318970m.add(C28293k.m52908e(jVar4, new C28293k[0]));
                findViewById.setOnClickListener(new C89943l(new C114952d(iVar2)));
            }
            View findViewById2 = viewGroup.findViewById(R.id.zero_state_input_plate_keyboard_icon);
            C28292j jVar5 = new C28292j(96310);
            jVar5.mo33795i(5);
            findViewById2.getClass();
            C28295m.m52919e(findViewById2, jVar5);
            iVar2.f318970m.add(C28293k.m52908e(jVar5, new C28293k[0]));
            findViewById2.setOnClickListener(new C89943l(new C114953e(iVar2)));
            View findViewById3 = viewGroup.findViewById(R.id.zero_state_input_plate_inner_container);
            C113720h hVar = new C113720h();
            hVar.f314945a = iVar2.f318959b.getResources().getColor(R.color.search_plate_inner_shadow_color);
            hVar.f314947c = iVar2.f318959b.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_shadow_y_offset);
            hVar.f314946b = iVar2.f318959b.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_shadow_radius);
            findViewById3.setBackground(new C113721i(hVar, iVar2.f318959b.getResources().getColor(R.color.search_plate_inner_background_color), (float) iVar2.f318959b.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_background_radius), (float) iVar2.f318959b.getResources().getDimensionPixelSize(R.dimen.opa_search_plate_inner_background_radius)));
            findViewById3.setElevation(0.0f);
            findViewById3.setLayerType(1, (Paint) null);
            if (iVar2.f318965h.mo79746e(C90014bt.f247289eO)) {
                viewGroup.findViewById(R.id.zero_state_input_plate_shadow).setVisibility(8);
            }
            C28292j jVar6 = new C28292j(96305);
            iVar2.f318971n = C28293k.m52907d(jVar6, iVar2.f318970m);
            C28295m.m52919e(viewGroup, jVar6);
        } else {
            viewGroup = (ViewGroup) LayoutInflater.from(iVar2.f318959b).inflate(R.layout.zero_state_nga_input_plate_view, iVar2.f318968k, false);
            TypedValue typedValue = new TypedValue();
            iVar2.f318959b.getResources().getValue(R.dimen.zero_state_nga_input_plate_mic_icon_size, typedValue, true);
            float f = typedValue.getFloat();
            iVar2.mo101746a((LogoView) viewGroup.findViewById(R.id.zero_state_nga_input_plate_mic_icon), f, f, new C114954f(iVar2));
            viewGroup.findViewById(R.id.zero_state_nga_input_plate_keyboard_icon).setOnClickListener(new C114955g(iVar2));
            viewGroup.getClass();
        }
        viewGroup2.addView(viewGroup);
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.zs_container);
        C108052g gVar4 = this.f295704v;
        C58836b bVar2 = C58836b.f156633a;
        this.f295695m = gVar4.mo96384a(bVar2, bVar2, this.f295685J, bVar2, bVar2, bVar2);
        if (!this.f295699q.mo56113h()) {
            finish();
            return;
        }
        m176470y(intent);
        C114754h a5 = ((C114755i) this.f295699q.mo56107c()).mo101437a(new C109865on(this), this.f295690O, (C114119ax) null);
        this.f295694l = a5;
        a5.mo101433w(this.f295685J);
        this.f295694l.mo101431u(new C109765ok(this));
        if (this.f295696n.mo79746e(C90014bt.f247261dn) && (iVar = this.f295692Q) != null) {
            this.f295694l.mo101432v(iVar.f318971n);
        }
        ViewGroup a6 = this.f295694l.mo101411a();
        this.f295688M = a6;
        viewGroup3.addView(a6);
        this.f295689N = this.f295694l.mo101412b();
        this.f295698p.mo28211k(this.f295697o.mo77516a(this.f295686K.mo81666a(new C87548d(new C87680ah(this.f295687L), false))), "ZeroStateActivity useCardFactory", new C109766ol(this));
        if (this.f295696n.mo79746e(C90014bt.f247598kF)) {
            C87673aa aaVar2 = this.f295687L;
            C88489j jVar7 = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
            C62940bt btVar = C87694ac.f237131a;
            C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
            adVar.copyOnWrite();
            C87696ae aeVar = (C87696ae) adVar.instance;
            aeVar.f237134a |= 1024;
            aeVar.f237144k = true;
            C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
            C53306j jVar8 = C53306j.MAIN_APP;
            hpVar.copyOnWrite();
            C53271hs hsVar = (C53271hs) hpVar.instance;
            hsVar.f139663l = jVar8.f139793X;
            hsVar.f139652a |= 512;
            C53270hr hrVar = C53270hr.FOREGROUND;
            hpVar.copyOnWrite();
            C53271hs hsVar2 = (C53271hs) hpVar.instance;
            hsVar2.f139665n = hrVar.f139649g;
            hsVar2.f139652a |= 2048;
            adVar.copyOnWrite();
            C87696ae aeVar2 = (C87696ae) adVar.instance;
            C53271hs hsVar3 = (C53271hs) hpVar.build();
            hsVar3.getClass();
            aeVar2.f237136c = hsVar3;
            aeVar2.f237134a |= 2;
            adVar.copyOnWrite();
            C87696ae aeVar3 = (C87696ae) adVar.instance;
            aeVar3.f237134a |= 2048;
            aeVar3.f237145l = true;
            jVar7.mo82014b(btVar, (C87696ae) adVar.build());
            aaVar2.mo81937i(jVar7.mo82013a());
        } else {
            this.f295691P = false;
        }
        mo95175w();
        if (!this.f295696n.mo79746e(C90080ee.f249818q)) {
            int taskId = getTaskId();
            for (ActivityManager.AppTask next : ((ActivityManager) getSystemService("activity")).getAppTasks()) {
                try {
                    if (next.getTaskInfo().id == taskId) {
                        next.setExcludeFromRecents(true);
                    }
                } catch (RuntimeException e) {
                    C59104x c = f295675j.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ZeroStateActivity");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(23025)).mo56386p("Error excludeFromRecents()");
                }
            }
        }
        this.f295682G.f242097a.mo5706i(C89294b.STOPPED);
    }

    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        super.onDestroy();
        C114754h hVar = this.f295694l;
        if (hVar != null) {
            hVar.mo101423m();
        }
        this.f295678C.mo101562a();
        this.f295687L.mo81934f();
        C89293a aVar = this.f295682G;
        aVar.f242097a.mo5706i(C89294b.DESTROYED);
    }

    public final void onNewIntent(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        super.onNewIntent(intent);
        if (this.f295696n.mo79746e(C90014bt.f247381gA) && intent != null && this.f295700r.mo81696h(intent) && !this.f295691P) {
            m176470y(intent);
        }
    }

    public final void onPause() {
        C58976aa aaVar = C58975e.f156826a;
        super.onPause();
        this.f295687L.mo81948t(false);
        this.f295687L.mo81933e();
        this.f295678C.mo101563b();
        if (this.f295688M != null) {
            this.f295694l.mo101422l();
            this.f295694l.mo101428r();
        }
        C89293a aVar = this.f295682G;
        aVar.f242097a.mo5706i(C89294b.PAUSED);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f295685J.f306130e.mo85347b(i, strArr, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r15 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 38
            com.google.android.apps.gsa.shared.logger.C89838ab.m146266j(r0)
            super.onResume()
            com.google.android.apps.gsa.search.shared.service.aa r1 = r15.f295687L
            boolean r1 = r1.mo81951w()
            if (r1 != 0) goto L_0x0017
            com.google.android.apps.gsa.search.shared.service.aa r1 = r15.f295687L
            r1.mo81932c()
        L_0x0017:
            com.google.android.apps.gsa.search.shared.service.aa r1 = r15.f295687L
            boolean r1 = r1.mo81953y()
            r2 = 0
            if (r1 != 0) goto L_0x0025
            com.google.android.apps.gsa.search.shared.service.aa r1 = r15.f295687L
            r1.mo81947s(r2)
        L_0x0025:
            r15.m176469x()
            android.content.Intent r1 = r15.getIntent()
            if (r1 == 0) goto L_0x005f
            com.google.android.apps.gsa.search.core.i.t r3 = r15.f295696n
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247692lu
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0043
            com.google.android.apps.gsa.staticplugins.opa.nm r3 = r15.f295708z
            android.os.Bundle r1 = r1.getExtras()
            com.google.common.base.ax r1 = r3.mo98062c(r1)
            goto L_0x004d
        L_0x0043:
            com.google.android.apps.gsa.staticplugins.opa.nm r3 = r15.f295708z
            android.os.Bundle r1 = r1.getExtras()
            com.google.common.base.ax r1 = r3.mo98061b(r1)
        L_0x004d:
            boolean r3 = r1.mo56113h()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r1 = r1.mo56107c()
            android.content.Intent r1 = (android.content.Intent) r1
            r15.startActivity(r1)
            r15.finish()
        L_0x005f:
            android.view.View r1 = r15.f295688M
            r3 = 0
            if (r1 == 0) goto L_0x015c
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r1 = r15.f295694l
            r4 = 1
            r1.mo101427q(r4)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.b r1 = r15.f295703u
            java.lang.String r1 = r1.f318451d
            com.google.assistant.s.a.ih r1 = com.google.android.apps.gsa.search.shared.p6930h.C87571n.m142340d(r1)
            com.google.android.apps.gsa.search.core.i.t r5 = r15.f295696n
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90080ee.f249802a
            boolean r5 = r5.mo79746e(r6)
            if (r5 != 0) goto L_0x007e
            if (r1 == 0) goto L_0x0127
        L_0x007e:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.l r6 = r15.f295676A
            r6.f318415b = r1
            r7 = 22
            r8 = 11
            r9 = 9
            r10 = 7
            if (r1 == 0) goto L_0x00b5
            int r11 = r1.f139702h
            int r11 = com.google.assistant.p3994s.p3995a.C53282ic.m86805a(r11)
            if (r11 != 0) goto L_0x0094
            r11 = 1
        L_0x0094:
            int r11 = r11 + -1
            if (r11 == r4) goto L_0x00a8
            if (r11 == r10) goto L_0x00a5
            if (r11 == r9) goto L_0x00a2
            if (r11 == r8) goto L_0x009f
            goto L_0x00b5
        L_0x009f:
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.ae
            goto L_0x00b7
        L_0x00a2:
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.al
            goto L_0x00b7
        L_0x00a5:
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.bw
            goto L_0x00b7
        L_0x00a8:
            int r11 = r1.f139703i
            int r11 = com.google.assistant.p3994s.p3995a.C53286ig.m86808b(r11)
            if (r11 == 0) goto L_0x00b5
            if (r11 != r7) goto L_0x00b5
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.bx
            goto L_0x00b7
        L_0x00b5:
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.a
        L_0x00b7:
            r6.f318414a = r11
            r11 = 13
            if (r1 != 0) goto L_0x00c1
            r4 = 13
            goto L_0x011b
        L_0x00c1:
            int r12 = r1.f139702h
            int r12 = com.google.assistant.p3994s.p3995a.C53282ic.m86805a(r12)
            if (r12 != 0) goto L_0x00ca
            r12 = 1
        L_0x00ca:
            int r12 = r12 + -1
            r13 = 10
            r14 = 2
            if (r12 == r4) goto L_0x0101
            if (r12 == r14) goto L_0x00ff
            r7 = 3
            if (r12 == r7) goto L_0x00fd
            if (r12 == r13) goto L_0x00e5
            if (r12 == r11) goto L_0x00e2
            r0 = 16
            if (r12 == r0) goto L_0x00df
            goto L_0x011b
        L_0x00df:
            r4 = 12
            goto L_0x011b
        L_0x00e2:
            r4 = 8
            goto L_0x011b
        L_0x00e5:
            int r7 = r1.f139703i
            int r7 = com.google.assistant.p3994s.p3995a.C53286ig.m86808b(r7)
            if (r7 != 0) goto L_0x00ee
            r7 = 1
        L_0x00ee:
            int r7 = r7 + -1
            r10 = 20
            if (r7 == r10) goto L_0x00fa
            if (r7 == r0) goto L_0x00f7
            goto L_0x011b
        L_0x00f7:
            r4 = 11
            goto L_0x011b
        L_0x00fa:
            r4 = 9
            goto L_0x011b
        L_0x00fd:
            r4 = 7
            goto L_0x011b
        L_0x00ff:
            r4 = 6
            goto L_0x011b
        L_0x0101:
            int r0 = r1.f139703i
            int r0 = com.google.assistant.p3994s.p3995a.C53286ig.m86808b(r0)
            if (r0 != 0) goto L_0x010a
            r0 = 1
        L_0x010a:
            int r0 = r0 + -1
            if (r0 == r4) goto L_0x0119
            r8 = 21
            if (r0 == r8) goto L_0x0117
            if (r0 == r7) goto L_0x0115
            goto L_0x011b
        L_0x0115:
            r4 = 2
            goto L_0x011b
        L_0x0117:
            r4 = 5
            goto L_0x011b
        L_0x0119:
            r4 = 10
        L_0x011b:
            r6.f318418e = r4
            if (r1 == 0) goto L_0x0125
            com.google.common.o.l.r r2 = r1.f139704j
            if (r2 != 0) goto L_0x0125
            com.google.common.o.l.r r2 = com.google.common.p4552o.p4566l.C60218r.f162925d
        L_0x0125:
            r6.f318416c = r2
        L_0x0127:
            if (r5 != 0) goto L_0x012f
            if (r1 != 0) goto L_0x012f
            boolean r0 = r15.f295684I
            if (r0 == 0) goto L_0x014a
        L_0x012f:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.l r0 = r15.f295676A
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r1 = r15.f295694l
            com.google.common.o.oe r0 = r0.mo101568c(r1)
            if (r0 == 0) goto L_0x014a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.g r1 = r15.f295678C
            com.google.common.o.l.r r0 = r0.f163227b
            if (r0 != 0) goto L_0x0141
            com.google.common.o.l.r r0 = com.google.common.p4552o.p4566l.C60218r.f162925d
        L_0x0141:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r2 = r15.f295694l
            android.view.ViewGroup r2 = r2.mo101411a()
            r1.mo101564c(r0, r2)
        L_0x014a:
            boolean r0 = r15.f295691P
            if (r0 != 0) goto L_0x015a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.h r0 = r15.f295694l
            r0.mo101424n()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e r0 = r15.f295677B
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_ZERO_STATE_RENDERED
            r0.mo101556d(r1)
        L_0x015a:
            r15.f295691P = r3
        L_0x015c:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.b.i r0 = r15.f295692Q
            if (r0 == 0) goto L_0x0172
            com.google.android.libraries.gsa.k.g r1 = r0.f318967j
            com.google.android.apps.gsa.assistant.shared.s.b r2 = r0.f318966i
            com.google.common.util.concurrent.cx r2 = r2.mo65440b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.b.h r4 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.b.h
            r4.<init>(r0)
            java.lang.String r0 = "Verifies if a badge should be shown on the Updates Center entry point."
            r1.mo28211k(r2, r0, r4)
        L_0x0172:
            r15.f295684I = r3
            com.google.android.apps.gsa.shared.av.a r0 = r15.f295682G
            com.google.android.apps.gsa.shared.av.b r1 = com.google.android.apps.gsa.shared.p7003av.C89294b.RESUMED
            androidx.lifecycle.ag r0 = r0.f242097a
            r0.mo5706i(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity.onResume():void");
    }

    public final void onStart() {
        C58976aa aaVar = C58975e.f156826a;
        C89838ab.m146266j(38);
        super.onStart();
        C89293a aVar = this.f295682G;
        aVar.f242097a.mo5706i(C89294b.PAUSED);
    }

    public final void onStop() {
        C58976aa aaVar = C58975e.f156826a;
        super.onStop();
        this.f295694l.mo101429s();
        C114735e eVar = this.f295677B;
        if (eVar.f318396b.mo79746e(C90014bt.f247287eM)) {
            eVar.f318397c.set(true);
        }
        C89293a aVar = this.f295682G;
        aVar.f242097a.mo5706i(C89294b.STOPPED);
    }

    public final void onTopResumedActivityChanged(boolean z) {
        this.f295687L.mo81938j(z);
    }

    /* renamed from: v */
    public final C87565h mo95174v() {
        C87565h hVar = new C87565h();
        hVar.mo81686b();
        hVar.f236509M = true;
        hVar.f236543an = true;
        hVar.f236497A = this.f295696n.mo79746e(C90014bt.f247604kL);
        hVar.f236560f = 1;
        hVar.f236572r = QueryTriggerType.OPA_SUGGESTION_CHIP;
        hVar.f236556b = e.ab;
        return hVar;
    }

    /* renamed from: w */
    public final void mo95175w() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.opa_persistent_finish_setup_bar_view_stub);
        View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            if (this.f295696n.mo79746e(C90053de.f248982o)) {
                C58976aa aaVar = C58975e.f156826a;
                ((C113787bc) this.f295679D.mo27525b()).mo100626f();
            }
            if (!this.f295696n.mo79746e(C90037cp.f248599dq) && ((C113787bc) this.f295679D.mo27525b()).mo100629i(this.f295696n.mo79746e(C90053de.f248952S))) {
                inflate.setVisibility(0);
                C28292j jVar = new C28292j(true != this.f295696n.mo79746e(C90029ch.f248218aE) ? 44770 : 116313);
                C28295m.m52919e(inflate, jVar);
                C89949q.m146521e(C28285c.m52874a(inflate, 1221), false);
                this.f295676A.mo101570e(C28293k.m52908e(jVar, new C28293k[0]), this.f295689N);
                inflate.setOnClickListener(new C109767om(this));
                return;
            }
            inflate.setVisibility(8);
        }
    }
}
