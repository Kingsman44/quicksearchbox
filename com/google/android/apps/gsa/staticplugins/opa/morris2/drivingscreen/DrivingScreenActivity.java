package com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import com.google.android.apps.gsa.binaries.satin.app.C74132lh;
import com.google.android.apps.gsa.binaries.satin.app.C74133lj;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8398i.C109702o;
import com.google.android.gms.maps.C145011h;
import com.google.android.gms.maps.C145013j;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14987i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14745o;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14746p;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14386hh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14387hi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14483kx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14485kz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15111ae;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.p5294a.C68225k;
import java.util.concurrent.Executor;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Optional;

/* compiled from: PG */
public class DrivingScreenActivity extends C0395p implements C14987i, C145013j {

    /* renamed from: j */
    public static final C59071e f304991j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity");

    /* renamed from: k */
    public BroadcastReceiver f304992k;

    /* renamed from: l */
    public C86124t f304993l;

    /* renamed from: m */
    public C14647d f304994m;

    /* renamed from: n */
    public C14986h f304995n;

    /* renamed from: o */
    public C15111ae f304996o;

    /* renamed from: p */
    public Executor f304997p;

    /* renamed from: q */
    public C109702o f304998q;

    /* renamed from: r */
    public C14113an f304999r;

    /* renamed from: s */
    public C14115ap f305000s;

    /* renamed from: t */
    private boolean f305001t;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity$a */
    /* compiled from: PG */
    public interface C109502a {
        /* renamed from: rS */
        C74132lh mo97871rS();
    }

    /* renamed from: w */
    private final C51474ja m182232w() {
        return C51474ja.m86196a(getIntent().getIntExtra("INTENT_TRIGGERING_SOURCE_KEY", C51474ja.DRIVING_SCREEN_UNSPECIFIED.f134124v));
    }

    /* renamed from: n */
    public final void mo21881n(C14499lm lmVar) {
        runOnUiThread(new C109506b(this, lmVar));
    }

    public final void onBackPressed() {
        C58976aa aaVar = C58975e.f156826a;
        this.f304995n.mo21875g(C14745o.m31058a());
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.au);
        super.onCreate(bundle);
        try {
            setRequestedOrientation(1);
        } catch (IllegalStateException e) {
            C59104x d = f304991j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24800)).mo56386p("safeSetRequestedOrientation: Unable to setRequestedOrientation.");
        }
        C74132lh rS = ((C109502a) C47266f.m84076a(this, C109502a.class)).mo97871rS();
        rS.f206550b = this;
        rS.f206551c = new C91093c(this);
        C68225k.m98529a(rS.f206550b, Activity.class);
        C68225k.m98529a(rS.f206551c, C91093c.class);
        C74133lj ljVar = new C74133lj(rS.f206549a, rS.f206550b);
        this.f304993l = (C86124t) ljVar.f206553b.a.f202006C.mo17428b();
        this.f304994m = (C14647d) ljVar.f206553b.a.f202840ef.mo17428b();
        this.f304995n = (C14986h) ljVar.f206553b.a.f202841eg.mo17428b();
        this.f304996o = ljVar.mo69420a();
        this.f304997p = (Executor) ljVar.f206553b.p.mo17428b();
        this.f304998q = new C109702o((Context) ljVar.f206553b.g.mo17428b(), (C86124t) ljVar.f206553b.a.f202006C.mo17428b(), (C14986h) ljVar.f206553b.a.f202841eg.mo17428b(), ljVar.mo69420a());
        this.f304999r = (C14113an) ljVar.f206553b.a.f202694bs.mo17428b();
        this.f305000s = (C14115ap) ljVar.f206553b.a.f202695bt.mo17428b();
        if (this.f304993l.mo79746e(C90051dc.f248820ab)) {
            C58976aa aaVar = C58975e.f156826a;
            C145011h.m235673b(getApplicationContext(), 2, this);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        m182232w();
        if (!this.f304993l.mo79746e(C90051dc.f248778M)) {
            C14113an anVar = this.f304999r;
            if (anVar != null) {
                anVar.mo21423a(C37182a.f98016ej.mo40805c(C62722b.CANCELLED));
            }
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f304993l.mo79758x(C90051dc.f248921r))));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f304995n.mo21874f();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        m182232w();
        setIntent(intent);
        super.onNewIntent(intent);
        C58976aa aaVar = C58975e.f156826a;
        m182232w();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        C59071e eVar = f304991j;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
        ((C59052c) ((C59052c) b).mo56372aa(24804)).mo56386p("#onResume");
        if (!this.f305001t) {
            C51474ja jaVar = C51474ja.UNKNOWN;
            switch (m182232w().ordinal()) {
                case 0:
                case 1:
                case 2:
                case 6:
                case 7:
                case 8:
                case 9:
                case 11:
                    C59104x d = eVar.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
                    ((C59052c) ((C59052c) d).mo56372aa(24814)).mo56386p("Driving screen triggered from invalid trigger source");
                    finish();
                    break;
                case 3:
                    this.f304999r.mo21425c(C37182a.f97991eK.mo40813g());
                    break;
                case 4:
                    this.f304999r.mo21425c(C37182a.f98118gf.mo40813g());
                    break;
                case 5:
                    this.f304999r.mo21425c(C37182a.f98055fV.mo40813g());
                    break;
                case 10:
                    this.f304999r.mo21425c(C37182a.f98045fL.mo40813g());
                    break;
                case 12:
                    this.f304999r.mo21425c(C37182a.f97989eI.mo40813g());
                    break;
                case 13:
                    this.f304999r.mo21425c(C37182a.f97990eJ.mo40813g());
                    break;
                case 14:
                    this.f304999r.mo21425c(C37182a.f98117ge.mo40813g());
                    break;
                case 15:
                    this.f304999r.mo21425c(C37182a.f98056fW.mo40813g());
                    break;
                case 16:
                    this.f304999r.mo21425c(C37182a.f97995eO.mo40813g());
                    break;
                case 17:
                    this.f304999r.mo21425c(C37182a.f97996eP.mo40813g());
                    break;
                case 18:
                    this.f304999r.mo21425c(C37182a.f98044fK.mo40813g());
                    break;
                case 19:
                    this.f304999r.mo21425c(C37182a.f98228io.mo40813g());
                    break;
                case 20:
                    this.f304999r.mo21425c(C37182a.f98034fA.mo40813g());
                    break;
            }
            this.f304995n.mo21876h(this);
            this.f304997p.execute(C47810es.m84977q(new C109503a(this)));
            if (this.f304994m.mo21594D()) {
                this.f304995n.mo21875g(C14746p.m31071d(m182232w().f134124v));
            } else {
                this.f304994m.mo21595E(m182232w());
                this.f304994m.mo21612z(C0027c.DRIVING_SCREEN);
                this.f304995n.mo21877i(C14746p.m31071d(m182232w().f134124v));
            }
            this.f305001t = true;
        } else if (this.f304993l.mo79746e(C90051dc.f248785T)) {
            C14986h hVar = this.f304995n;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14386hh hhVar = (C14386hh) C14387hi.f43524b.createBuilder();
            hhVar.copyOnWrite();
            ((C14387hi) hhVar.instance).f43526a = 1;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14387hi hiVar = (C14387hi) hhVar.build();
            hiVar.getClass();
            lfVar.f43801d = hiVar;
            lfVar.f43800c = 21;
            hVar.mo21875g((C14492lf) gtVar.build());
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        C59104x b = f304991j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
        ((C59052c) ((C59052c) b).mo56372aa(24806)).mo56386p("#onStart");
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        C59104x b = f304991j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
        ((C59052c) ((C59052c) b).mo56372aa(24807)).mo56386p("#onStop");
        this.f305001t = false;
        this.f304998q.mo98022c();
        if (!this.f304994m.mo21594D()) {
            if (this.f304994m.mo21603l()) {
                this.f305000s.mo21431e(C37182a.f98080fu.mo40813g());
            }
            this.f304994m.mo21591A(Optional.empty(), C14746p.m31072e());
            this.f304995n.mo21878j();
            this.f304994m.mo21612z(C0027c.OFF);
            this.f304994m.mo21596F(2);
        } else if (this.f304994m.mo21603l() || this.f304999r.mo21426d()) {
            this.f305000s.mo21431e(C37182a.f98080fu.mo40813g());
            if (this.f304994m.mo21592B()) {
                C14986h hVar = this.f304995n;
                C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
                C14483kx kxVar = (C14483kx) C14485kz.f43772d.createBuilder();
                kxVar.copyOnWrite();
                ((C14485kz) kxVar.instance).f43774a = 18;
                gtVar.copyOnWrite();
                C14492lf lfVar = (C14492lf) gtVar.instance;
                C14485kz kzVar = (C14485kz) kxVar.build();
                kzVar.getClass();
                lfVar.f43799b = kzVar;
                lfVar.f43798a = 1;
                hVar.mo21875g((C14492lf) gtVar.build());
                return;
            }
            this.f304995n.mo21875g(C14746p.m31072e());
        }
    }

    /* renamed from: v */
    public final void mo97870v(int i) {
        int i2 = i - 1;
        C51474ja jaVar = C51474ja.UNKNOWN;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (i2 == 1) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }
}
