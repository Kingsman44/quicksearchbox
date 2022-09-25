package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.C119473g;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129856c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9861a.C129891a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.o */
/* compiled from: PG */
public final class C130019o {

    /* renamed from: a */
    public static final C59071e f356543a = C59071e.m91331h();

    /* renamed from: b */
    public final C47770dh f356544b;

    /* renamed from: c */
    public final C46439e f356545c;

    /* renamed from: d */
    public final C130008d f356546d;

    /* renamed from: e */
    public final C46855i f356547e;

    /* renamed from: f */
    public final C129891a f356548f;

    /* renamed from: g */
    public final InterpreterInteractionController f356549g;

    /* renamed from: h */
    public final C129024a f356550h;

    /* renamed from: i */
    public final C119473g f356551i;

    /* renamed from: j */
    public final float f356552j;

    /* renamed from: k */
    public final float f356553k;

    /* renamed from: l */
    public final C129856c f356554l = new C129856c();

    /* renamed from: m */
    public String f356555m;

    /* renamed from: n */
    public String f356556n;

    /* renamed from: o */
    public boolean f356557o;

    /* renamed from: p */
    public final C129855b f356558p;

    public C130019o(C47770dh dhVar, C46439e eVar, C130008d dVar, C129855b bVar, C46855i iVar, C129891a aVar, InterpreterInteractionController interpreterInteractionController, C129024a aVar2) {
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(iVar, "subscriptionMixin");
        this.f356544b = dhVar;
        this.f356545c = eVar;
        this.f356546d = dVar;
        this.f356558p = bVar;
        this.f356547e = iVar;
        this.f356548f = aVar;
        this.f356549g = interpreterInteractionController;
        this.f356550h = aVar2;
        C119473g gVar = new C119473g();
        this.f356551i = gVar;
        gVar.f333081e = new C130009e(this);
        this.f356552j = (float) dVar.getResources().getInteger(R.integer.assistant_interpreter_plate_logo_view_logo_width);
        this.f356553k = (float) dVar.getResources().getInteger(R.integer.assistant_interpreter_plate_logo_view_logo_height);
    }

    /* renamed from: a */
    public final RelativeLayout mo109409a() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_auto_mic_plate);
        C69664n.m101060f(findViewById, "fragment.requireView().f…terpreter_auto_mic_plate)");
        return (RelativeLayout) findViewById;
    }

    /* renamed from: b */
    public final RelativeLayout mo109410b() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_keyboard_plate);
        C69664n.m101060f(findViewById, "fragment.requireView().f…terpreter_keyboard_plate)");
        return (RelativeLayout) findViewById;
    }

    /* renamed from: c */
    public final RelativeLayout mo109411c() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_manual_mic_plate);
        C69664n.m101060f(findViewById, "fragment.requireView().f…rpreter_manual_mic_plate)");
        return (RelativeLayout) findViewById;
    }

    /* renamed from: d */
    public final LogoView mo109412d() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_shared_logo_view);
        C69664n.m101060f(findViewById, "fragment.requireView().f…rpreter_shared_logo_view)");
        return (LogoView) findViewById;
    }

    /* renamed from: e */
    public final InterpreterKeyboardButtonView mo109413e() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_source_keyboard_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…r_source_keyboard_button)");
        return (InterpreterKeyboardButtonView) findViewById;
    }

    /* renamed from: f */
    public final InterpreterKeyboardButtonView mo109414f() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_target_keyboard_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…r_target_keyboard_button)");
        return (InterpreterKeyboardButtonView) findViewById;
    }

    /* renamed from: g */
    public final InterpreterMicButtonView mo109415g() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_auto_mic_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…erpreter_auto_mic_button)");
        return (InterpreterMicButtonView) findViewById;
    }

    /* renamed from: h */
    public final InterpreterMicButtonView mo109416h() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_source_mic_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…preter_source_mic_button)");
        return (InterpreterMicButtonView) findViewById;
    }

    /* renamed from: i */
    public final InterpreterMicButtonView mo109417i() {
        View findViewById = this.f356546d.requireView().findViewById(R.id.assistant_interpreter_target_mic_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…preter_target_mic_button)");
        return (InterpreterMicButtonView) findViewById;
    }

    /* renamed from: j */
    public final void mo109418j(C129940bo boVar) {
        C46439e eVar = this.f356545c;
        C46438d b = C46438d.m82810b(this.f356558p.mo109295a(boVar));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356554l);
    }

    /* renamed from: k */
    public final void mo109419k(View view) {
        if (view.getVisibility() != 0 || view.getAlpha() != 1.0f) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
            }
            Animator loadAnimator = AnimatorInflater.loadAnimator(this.f356546d.requireContext(), R.animator.assistant_interpreter_fade_in_animator);
            loadAnimator.setTarget(view);
            loadAnimator.addListener(new C130017m());
            loadAnimator.start();
        }
    }

    /* renamed from: l */
    public final void mo109420l(View view) {
        if (view.getVisibility() == 0) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(this.f356546d.requireContext(), R.animator.assistant_interpreter_fade_out_animator);
            loadAnimator.setTarget(view);
            loadAnimator.addListener(new C130018n(this, view));
            loadAnimator.start();
        }
    }
}
