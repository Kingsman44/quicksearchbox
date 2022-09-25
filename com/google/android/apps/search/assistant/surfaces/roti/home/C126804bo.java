package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.media.MediaPlayer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.support.p033v7.widget.C0678gm;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.activity.C0800m;
import androidx.core.graphics.drawable.C1929b;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119473g;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119474h;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34831e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5124m.p5125a.C65599b;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71083eb;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71084ec;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bo */
/* compiled from: PG */
public final class C126804bo {

    /* renamed from: a */
    public static final C59071e f349196a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.roti.home.bo");

    /* renamed from: A */
    public final C46852f f349197A = new C126803bn(this);

    /* renamed from: B */
    public final C46852f f349198B = new C126812bu(this);

    /* renamed from: C */
    public final C46852f f349199C = new C126807bp(this);

    /* renamed from: D */
    public int f349200D = 0;

    /* renamed from: E */
    public boolean f349201E;

    /* renamed from: F */
    public boolean f349202F;

    /* renamed from: G */
    public C28439i f349203G;

    /* renamed from: H */
    public MediaPlayer f349204H = new MediaPlayer();

    /* renamed from: I */
    public final C0800m f349205I = new C126799bj(this);

    /* renamed from: J */
    public int f349206J = 1;

    /* renamed from: K */
    public int f349207K = 4;

    /* renamed from: L */
    private boolean f349208L;

    /* renamed from: M */
    private boolean f349209M;

    /* renamed from: N */
    private final Vibrator f349210N;

    /* renamed from: O */
    private final boolean f349211O;

    /* renamed from: P */
    private final AccessibilityManager f349212P;

    /* renamed from: Q */
    private final C119473g f349213Q;

    /* renamed from: b */
    public final C126781as f349214b;

    /* renamed from: c */
    public final C46855i f349215c;

    /* renamed from: d */
    public final C126795bf f349216d;

    /* renamed from: e */
    public final C126853n f349217e;

    /* renamed from: f */
    public final C46439e f349218f;

    /* renamed from: g */
    public final C28443m f349219g;

    /* renamed from: h */
    public final C37215b f349220h;

    /* renamed from: i */
    public final Context f349221i;

    /* renamed from: j */
    public final C126797bh f349222j;

    /* renamed from: k */
    public final boolean f349223k;

    /* renamed from: l */
    public final boolean f349224l;

    /* renamed from: m */
    public final boolean f349225m;

    /* renamed from: n */
    public final C28306ab f349226n;

    /* renamed from: o */
    public final C28310af f349227o;

    /* renamed from: p */
    public final C47770dh f349228p;

    /* renamed from: q */
    public final C65599b f349229q;

    /* renamed from: r */
    public final boolean f349230r;

    /* renamed from: s */
    public final C65599b f349231s;

    /* renamed from: t */
    public final boolean f349232t;

    /* renamed from: u */
    public final C65599b f349233u;

    /* renamed from: v */
    public final boolean f349234v;

    /* renamed from: w */
    public int f349235w = -1;

    /* renamed from: x */
    public final C126806b f349236x = new C126806b();

    /* renamed from: y */
    public final C126805a f349237y = new C126805a();

    /* renamed from: z */
    public final C46852f f349238z = new C126802bm(this);

    /* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bo$a */
    /* compiled from: PG */
    final class C126805a implements C46440f {
        public C126805a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C126804bo.f349196a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37178)).mo56386p("Failed to stop interaction.");
            C126804bo.this.f349220h.mo19974a(C37176a.f96806D.mo40815i(C62722b.INTERNAL));
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59104x c = C126804bo.f349196a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
            ((C59052c) ((C59052c) c).mo56372aa(37179)).mo56386p("Successfully closed mic");
            C126804bo.this.f349220h.mo19974a(C37176a.f96806D.mo40815i(C62722b.OK));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bo$b */
    /* compiled from: PG */
    final class C126806b implements C46440f {
        public C126806b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C126804bo.f349196a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(37182)).mo56386p("InteractionCallbacks: onFailure.");
            if (th instanceof C126850k) {
                C126838cr.m207506e(C126804bo.this.f349220h, 3);
                C126804bo boVar = C126804bo.this;
                if (!boVar.f349229q.f178301a.contains(Integer.valueOf(boVar.f349235w))) {
                    C126804bo boVar2 = C126804bo.this;
                    if (!boVar2.f349230r) {
                        boVar2.mo107808n(R.string.assistant_roti_listening_greeting, 2);
                        return;
                    }
                }
                C126804bo.this.mo107808n(R.string.assistant_roti_timeout_suggestion_greeting, 2);
            } else if (th instanceof C126852m) {
                C126838cr.m207507f(C126804bo.this.f349220h, 2);
                C126804bo.this.mo107808n(R.string.assistant_roti_transcription_only_error_greeting, 2);
            } else if (th instanceof C126849j) {
                C126838cr.m207507f(C126804bo.this.f349220h, 10);
                C126804bo.this.mo107808n(R.string.assistant_roti_transcription_only_error_greeting, 2);
            } else if (th instanceof C126847h) {
                C126838cr.m207507f(C126804bo.this.f349220h, 3);
                C126804bo.this.mo107808n(R.string.assistant_roti_networkunreachable_greeting, 3);
            } else if (th instanceof C126851l) {
                C59104x b = C126804bo.f349196a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
                ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(37183)).mo56389s("%s", th.getMessage());
            } else if (th instanceof C34831e) {
                C34819a aVar = ((C34831e) th).f92394a;
                C126804bo.this.mo107808n(R.string.assistant_roti_transcription_only_error_greeting, 2);
                C126838cr.m207504c(C126804bo.this.f349220h, aVar);
            } else if (th instanceof C126845f) {
                C126838cr.m207507f(C126804bo.this.f349220h, 11);
                C126804bo.this.mo107808n(R.string.assistant_roti_transcription_only_error_greeting, 2);
            } else if (th instanceof C126846g) {
                C126838cr.m207507f(C126804bo.this.f349220h, 12);
                C126804bo.this.mo107808n(R.string.assistant_roti_transcription_only_error_greeting, 2);
            } else if (th instanceof C126848i) {
                C126804bo.this.mo107808n(R.string.assistant_roti_timeout_suggestion_greeting, 2);
                C126838cr.m207507f(C126804bo.this.f349220h, 15);
            } else {
                C126838cr.m207507f(C126804bo.this.f349220h, 1);
                C126804bo.this.mo107808n(R.string.assistant_roti_networkunreachable_greeting, 2);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            ResultState resultState = (ResultState) obj2;
            C58976aa aaVar = C58975e.f156826a;
            C126804bo boVar = C126804bo.this;
            ((TextView) boVar.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription)).setText(resultState.mo107755c());
            C126804bo.this.f349220h.mo19974a(C37176a.f97331y.mo40805c(C62722b.OK));
            C126804bo.this.f349216d.getActivity().setResult(-1, resultState.mo107753a());
            C126804bo boVar2 = C126804bo.this;
            Intent b = resultState.mo107754b();
            if (!(b.getComponent() == null && b.getPackage() == null)) {
                C59104x b2 = C126804bo.f349196a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
                ((C59052c) ((C59052c) b2).mo56372aa(37187)).mo56386p("Starting external intent.");
                C47709i.m84861a(boVar2.f349216d, b);
            }
            C126804bo.this.mo107807m();
            C126804bo boVar3 = C126804bo.this;
            boVar3.f349206J = 4;
            boVar3.mo107798d();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C126804bo(C126797bh bhVar, C126795bf bfVar, C126781as asVar, C46855i iVar, C126853n nVar, C46439e eVar, C28443m mVar, C47770dh dhVar, C37215b bVar, Context context, boolean z, boolean z2, boolean z3, C65599b bVar2, C65599b bVar3, C65599b bVar4, boolean z4, boolean z5, boolean z6, boolean z7, C28310af afVar, C28306ab abVar, C119473g gVar, AccessibilityManager accessibilityManager) {
        C126797bh bhVar2 = bhVar;
        this.f349213Q = gVar;
        this.f349216d = bfVar;
        this.f349214b = asVar;
        this.f349215c = iVar;
        this.f349217e = nVar;
        this.f349218f = eVar;
        this.f349219g = mVar;
        this.f349220h = bVar;
        this.f349228p = dhVar;
        this.f349222j = bhVar2;
        nVar.mo107775e(bhVar);
        this.f349223k = z;
        this.f349224l = z2;
        this.f349225m = z3;
        this.f349221i = context;
        this.f349226n = abVar;
        this.f349227o = afVar;
        this.f349231s = bVar2;
        this.f349232t = z5;
        this.f349229q = bVar3;
        this.f349230r = z4;
        this.f349233u = bVar4;
        this.f349234v = z6;
        this.f349211O = z7;
        this.f349212P = accessibilityManager;
        if (!bhVar2.f349183e.isEmpty()) {
            this.f349235w = ((Integer) bhVar2.f349183e.get(0)).intValue();
        }
        this.f349210N = (Vibrator) bfVar.getActivity().getSystemService("vibrator");
    }

    /* renamed from: a */
    public final float mo107795a(float f) {
        return f * this.f349221i.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public final void mo107796b(View view) {
        view.findViewById(R.id.assistant_roti_inputplate_shadow).setVisibility(8);
        Drawable c = C0678gm.m2375e().mo3100c(this.f349221i, R.drawable.assistant_roti_inputplate_background);
        c.getClass();
        Drawable mutate = c.mutate();
        C1929b.m5225f(mutate, this.f349221i.getResources().getColor(R.color.agsa_color_background));
        view.findViewById(R.id.assistant_roti_inputplate_root).setBackground(mutate);
        this.f349216d.getActivity().getWindow().setBackgroundDrawableResource(R.color.assistant_roti_grey_scrim);
    }

    /* renamed from: c */
    public final void mo107797c(View view) {
        view.setVisibility(0);
        int i = this.f349221i.getResources().getConfiguration().uiMode;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int[] iArr = (i & 48) == 32 ? new int[]{Color.parseColor("#003C4043"), Color.parseColor("#293C4043"), Color.parseColor("#003C4043")} : new int[]{Color.parseColor("#00000000"), Color.parseColor("#1A000000"), Color.parseColor("#00000000")};
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.setShaderFactory(new C126801bl(iArr, new float[]{0.0f, 0.73f, 1.0f}));
        view.setBackground(shapeDrawable);
    }

    /* renamed from: d */
    public final void mo107798d() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f349216d.requireView().findViewById(R.id.assistant_roti_speaking_gif_animation);
        if (lottieAnimationView != null) {
            lottieAnimationView.mo9692c();
            lottieAnimationView.setVisibility(8);
        }
        this.f349216d.getActivity().finish();
        this.f349216d.getActivity().overridePendingTransition(0, 0);
    }

    /* renamed from: e */
    public final void mo107799e(View view) {
        this.f349219g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (this.f349206J == 1) {
            C126838cr.m207506e(this.f349220h, 5);
        }
        C37215b bVar = this.f349220h;
        int i = this.f349222j.f349181c;
        Chip chip = (Chip) view;
        int id = chip.getId();
        C71083eb ebVar = (C71083eb) C71084ec.f189581d.createBuilder();
        ebVar.copyOnWrite();
        C71084ec ecVar = (C71084ec) ebVar.instance;
        ecVar.f189584a |= 2;
        ecVar.f189585b = i;
        C71084ec ecVar2 = (C71084ec) ebVar.build();
        if (id == R.id.assistant_readit) {
            bVar.mo19974a(C37176a.f97326t.mo40812e(C71084ec.f189582e, ecVar2));
        } else if (id == R.id.assistant_translate) {
            bVar.mo19974a(C37176a.f96857ab.mo40812e(C71084ec.f189582e, ecVar2));
        }
        mo107808n(R.string.assistant_roti_default_greeting, 1);
        String obj = chip.getText().toString();
        this.f349218f.mo50428h(new C46438d(this.f349217e.mo107772b(obj)).f121541a, (Object) null, this.f349236x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo107800f(boolean z) {
        int i;
        String string;
        boolean z2 = false;
        if (this.f349212P.isEnabled() && this.f349212P.isTouchExplorationEnabled()) {
            z2 = true;
        }
        LogoView logoView = (LogoView) this.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_logo_view);
        if (z) {
            mo107807m();
            logoView.setContentDescription(this.f349221i.getString(R.string.assistant_roti_stop_interaction));
            i = R.raw.assistant_roti_open_mic;
        } else {
            if (z2) {
                mo107807m();
            }
            logoView.setContentDescription(this.f349221i.getString(R.string.assistant_roti_start_interaction));
            i = R.raw.assistant_roti_close_mic;
        }
        if (z2 || ((string = Settings.Secure.getString(this.f349221i.getContentResolver(), "enabled_accessibility_services")) != null && string.contains("com.google.android.apps.accessibility.voiceaccess"))) {
            MediaPlayer create = MediaPlayer.create(this.f349221i, i);
            this.f349204H = create;
            create.start();
        }
    }

    /* renamed from: g */
    public final void mo107801g() {
        mo107803i();
        C46439e eVar = this.f349218f;
        C46438d dVar = new C46438d(this.f349217e.mo107771a());
        eVar.mo50428h(dVar.f121541a, (Object) null, this.f349236x);
    }

    /* renamed from: h */
    public final void mo107802h(LogoView logoView, int i) {
        if (this.f349208L) {
            if (i != 7) {
                if (i == 1) {
                    i = 1;
                }
            }
            C28306ab.m52929e(logoView);
            this.f349208L = false;
        }
        if (i == 7) {
            this.f349226n.mo33801b(logoView, this.f349227o.mo33805a(C28427h.m53115a(119039)));
            this.f349208L = true;
        } else if (i == 1) {
            this.f349226n.mo33801b(logoView, this.f349227o.mo33805a(C28427h.m53115a(119038)));
            this.f349208L = true;
        }
    }

    /* renamed from: i */
    public final void mo107803i() {
        TextView textView = (TextView) this.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription);
        textView.setText(this.f349221i.getResources().getString(R.string.assistant_roti_listening_greeting));
        textView.setTextColor(this.f349221i.getResources().getColor(R.color.assistant_roti_intent_api_google_logo_tint));
    }

    /* renamed from: j */
    public final void mo107804j(int i) {
        View findViewById = this.f349216d.requireView().findViewById(R.id.assistant_translate);
        View findViewById2 = this.f349216d.requireView().findViewById(R.id.assistant_readit);
        if (!this.f349223k || (!this.f349202F && !this.f349201E)) {
            findViewById.setVisibility(4);
            C28439i iVar = this.f349203G;
            iVar.getClass();
            iVar.mo33892i(2);
            findViewById2.setVisibility(8);
            return;
        }
        if (!this.f349201E || i != 0) {
            findViewById.setVisibility(8);
        } else {
            this.f349220h.mo19974a(C37176a.f97325s);
            C28439i iVar2 = this.f349203G;
            iVar2.getClass();
            iVar2.mo33892i(1);
            findViewById.setVisibility(0);
        }
        if (!this.f349202F || i != 0) {
            findViewById2.setVisibility(8);
            return;
        }
        this.f349220h.mo19974a(C37176a.f97325s);
        findViewById2.setVisibility(0);
    }

    /* renamed from: k */
    public final void mo107805k(C119474h hVar) {
        LogoView logoView = (LogoView) this.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_logo_view);
        if (logoView.f332963e == 2) {
            C119473g gVar = this.f349213Q;
            gVar.f333081e = hVar;
            logoView.mo104346f(gVar);
        }
    }

    /* renamed from: l */
    public final void mo107806l() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f349216d.requireView().findViewById(R.id.assistant_roti_speaking_gif_animation);
        if (lottieAnimationView != null) {
            lottieAnimationView.mo9694e();
            lottieAnimationView.f15138d.mo9773j(0.0f);
        }
    }

    /* renamed from: m */
    public final void mo107807m() {
        Vibrator vibrator;
        if (this.f349211O && (vibrator = this.f349210N) != null && vibrator.hasVibrator()) {
            this.f349210N.vibrate(VibrationEffect.createOneShot(C126839cs.f349303b.toMillis(), -1));
        }
    }

    /* renamed from: n */
    public final void mo107808n(int i, int i2) {
        if (this.f349206J != i2) {
            if (this.f349209M) {
                C28306ab.m52929e(this.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription));
                this.f349209M = false;
            }
            if (!(i2 == 1 || i == R.string.assistant_roti_listening_greeting)) {
                if (i == R.string.assistant_roti_timeout_suggestion_greeting) {
                    this.f349226n.mo33801b(this.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription), this.f349227o.mo33805a(C28427h.m53115a(119036)));
                } else if (i == R.string.assistant_roti_error_greeting || i == R.string.assistant_roti_networkunreachable_greeting || i == R.string.assistant_roti_transcription_only_error_greeting) {
                    this.f349226n.mo33801b(this.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription), this.f349227o.mo33805a(C28427h.m53115a(119037)));
                }
                this.f349209M = true;
            }
            this.f349206J = i2;
            ((TextView) this.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription)).setText(i);
        }
    }
}
