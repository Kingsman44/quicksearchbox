package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.C0800m;
import com.google.android.apps.search.assistant.surfaces.roti.p9499a.C126761e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34831e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cf */
/* compiled from: PG */
public final class C126824cf {

    /* renamed from: a */
    public static final C59071e f349260a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.roti.home.cf");

    /* renamed from: b */
    public final C126781as f349261b;

    /* renamed from: c */
    public final C46855i f349262c;

    /* renamed from: d */
    public final C126817bz f349263d;

    /* renamed from: e */
    public final C126853n f349264e;

    /* renamed from: f */
    public final C46439e f349265f;

    /* renamed from: g */
    public final C37215b f349266g;

    /* renamed from: h */
    public final Context f349267h;

    /* renamed from: i */
    public final C126797bh f349268i;

    /* renamed from: j */
    public final C47770dh f349269j;

    /* renamed from: k */
    public final C126761e f349270k;

    /* renamed from: l */
    public final C126826b f349271l = new C126826b();

    /* renamed from: m */
    public final C126825a f349272m = new C126825a();

    /* renamed from: n */
    public final C46852f f349273n = new C126822cd(this);

    /* renamed from: o */
    public final C46852f f349274o = new C126823ce(this);

    /* renamed from: p */
    public final C46852f f349275p = new C126829ci(this);

    /* renamed from: q */
    public final C46852f f349276q = new C126827cg(this);

    /* renamed from: r */
    public C126833cm f349277r;

    /* renamed from: s */
    public boolean f349278s;

    /* renamed from: t */
    public C126840ct f349279t;

    /* renamed from: u */
    public final C0800m f349280u = new C126820cb(this);

    /* renamed from: v */
    public int f349281v = 3;

    /* renamed from: w */
    public int f349282w = 4;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cf$a */
    /* compiled from: PG */
    final class C126825a implements C46440f {
        public C126825a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C126824cf.f349260a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37198)).mo56386p("Failed to stop interaction.");
            C126824cf.this.f349266g.mo19974a(C37176a.f96806D.mo40815i(C62722b.INTERNAL));
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C58976aa aaVar = C58975e.f156826a;
            C126824cf.this.f349266g.mo19974a(C37176a.f96806D.mo40815i(C62722b.OK));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cf$b */
    /* compiled from: PG */
    final class C126826b implements C46440f {
        public C126826b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C126824cf.f349260a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37202)).mo56386p("InteractionCallbacks: onFailure.");
            C126833cm cmVar = C126824cf.this.f349277r;
            cmVar.getClass();
            cmVar.f349290a.setVisibility(4);
            cmVar.f349291b.setImageDrawable(cmVar.f349293d);
            cmVar.f349292c.setBackgroundResource(R.drawable.assistant_roti_intent_api_red_ring);
            cmVar.f349296g.setEnabled(false);
            C126824cf cfVar = C126824cf.this;
            C126833cm cmVar2 = cfVar.f349277r;
            cmVar2.getClass();
            cmVar2.mo107825a(new C47591co(cfVar.f349269j, "Clicked 'mic image' to restart", new C126828ch(this)), cfVar.f349267h.getString(R.string.assistant_roti_intent_api_tap_to_try_again));
            C126824cf.this.f349270k.f349082a.mo107751a(R.raw.failure);
            if (th instanceof C126850k) {
                C126838cr.m207506e(C126824cf.this.f349266g, 6);
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_tap_to_try_again, 2);
            } else if (th instanceof C126852m) {
                C126838cr.m207507f(C126824cf.this.f349266g, 2);
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_tap_to_try_again, 2);
            } else if (th instanceof C126849j) {
                C126838cr.m207507f(C126824cf.this.f349266g, 10);
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_no_speech_detected_error, 2);
            } else if (th instanceof C126847h) {
                C126838cr.m207507f(C126824cf.this.f349266g, 3);
                C126824cf.this.mo107822e(R.string.assistant_roti_networkunreachable_greeting, 3);
            } else if (th instanceof C126851l) {
                C59104x b = C126824cf.f349260a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
                ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(37203)).mo56389s("%s", th.getMessage());
            } else if (th instanceof C34831e) {
                C34819a aVar = ((C34831e) th).f92394a;
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_tap_to_try_again, 2);
                C126838cr.m207504c(C126824cf.this.f349266g, aVar);
            } else if (th instanceof C126845f) {
                C126838cr.m207507f(C126824cf.this.f349266g, 11);
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_tap_to_try_again, 2);
            } else if (th instanceof C126846g) {
                C126838cr.m207507f(C126824cf.this.f349266g, 12);
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_tap_to_try_again, 2);
            } else if (th instanceof C126848i) {
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_no_speech_detected_error, 2);
                C126838cr.m207507f(C126824cf.this.f349266g, 15);
            } else {
                C126838cr.m207507f(C126824cf.this.f349266g, 1);
                C126824cf.this.mo107822e(R.string.assistant_roti_networkunreachable_greeting, 2);
            }
            C126824cf.this.mo107821d(0);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            ResultState resultState = (ResultState) obj2;
            C58976aa aaVar = C58975e.f156826a;
            if (!resultState.mo107755c().isEmpty()) {
                C126838cr.m207507f(C126824cf.this.f349266g, 13);
                C126824cf.this.mo107822e(R.string.assistant_roti_intent_api_tap_to_try_again, 2);
                C126824cf.this.mo107821d(0);
                return;
            }
            C126833cm cmVar = C126824cf.this.f349277r;
            cmVar.getClass();
            cmVar.f349290a.setVisibility(4);
            cmVar.f349291b.setImageDrawable(cmVar.f349295f);
            cmVar.f349292c.setBackgroundResource(R.drawable.assistant_roti_intent_api_green_ring);
            cmVar.f349296g.setEnabled(false);
            C126833cm cmVar2 = C126824cf.this.f349277r;
            cmVar2.getClass();
            cmVar2.mo107825a((View.OnClickListener) null, (String) null);
            C126824cf cfVar = C126824cf.this;
            cfVar.f349281v = 4;
            cfVar.f349263d.getActivity().setResult(-1, resultState.mo107753a());
            C126824cf.this.f349270k.f349082a.mo107751a(R.raw.success);
            C126824cf.this.f349266g.mo19974a(C37176a.f97331y.mo40805c(C62722b.OK));
            C126824cf cfVar2 = C126824cf.this;
            Intent b = resultState.mo107754b();
            if (!(b.getComponent() == null && b.getPackage() == null)) {
                C59104x b2 = C126824cf.f349260a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
                ((C59052c) ((C59052c) b2).mo56372aa(37207)).mo56386p("Starting external intent.");
                cfVar2.f349263d.getActivity().startActivity(b);
            }
            C126824cf.this.mo107818a();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C126824cf(C126797bh bhVar, C126817bz bzVar, C126781as asVar, C46855i iVar, C126853n nVar, C46439e eVar, C37215b bVar, Context context, C47770dh dhVar, C126761e eVar2) {
        this.f349263d = bzVar;
        this.f349261b = asVar;
        this.f349262c = iVar;
        this.f349264e = nVar;
        this.f349265f = eVar;
        this.f349266g = bVar;
        this.f349268i = bhVar;
        nVar.mo107775e(bhVar);
        this.f349267h = context;
        this.f349269j = dhVar;
        this.f349270k = eVar2;
    }

    /* renamed from: a */
    public final void mo107818a() {
        this.f349263d.getActivity().finish();
        this.f349263d.getActivity().overridePendingTransition(0, 0);
    }

    /* renamed from: b */
    public final void mo107819b() {
        mo107821d(4);
        mo107822e(R.string.assistant_roti_intent_api_start_speaking, 1);
        C46439e eVar = this.f349265f;
        C46438d dVar = new C46438d(this.f349264e.mo107771a());
        eVar.mo50428h(dVar.f121541a, (Object) null, this.f349271l);
    }

    /* renamed from: c */
    public final void mo107820c() {
        C126838cr.m207503b(this.f349266g, this.f349268i.f349181c);
        this.f349278s = false;
        mo107819b();
    }

    /* renamed from: d */
    public final void mo107821d(int i) {
        Button button = (Button) this.f349263d.requireView().findViewById(R.id.assistant_roti_retry_button);
        button.setVisibility(i);
        button.setEnabled(i == 0);
    }

    /* renamed from: e */
    public final void mo107822e(int i, int i2) {
        if (this.f349281v != i2) {
            this.f349281v = i2;
            ((TextView) this.f349263d.requireView().findViewById(R.id.assistant_roti_intent_api_text)).setText(i);
        }
    }
}
