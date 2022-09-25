package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9859d;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129856c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.d.g */
/* compiled from: PG */
public final class C129885g {

    /* renamed from: a */
    public final C47770dh f356309a;

    /* renamed from: b */
    public final C46439e f356310b;

    /* renamed from: c */
    public final InterpreterInteractionController f356311c;

    /* renamed from: d */
    public final C46855i f356312d;

    /* renamed from: e */
    public final C129024a f356313e;

    /* renamed from: f */
    public final C129856c f356314f = new C129856c();

    /* renamed from: g */
    public String f356315g;

    /* renamed from: h */
    public String f356316h;

    /* renamed from: i */
    public final C129855b f356317i;

    /* renamed from: j */
    private final C129880b f356318j;

    public C129885g(C47770dh dhVar, C129880b bVar, C46439e eVar, C129855b bVar2, InterpreterInteractionController interpreterInteractionController, C46855i iVar, C129024a aVar) {
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(iVar, "subscriptionMixin");
        this.f356309a = dhVar;
        this.f356318j = bVar;
        this.f356310b = eVar;
        this.f356317i = bVar2;
        this.f356311c = interpreterInteractionController;
        this.f356312d = iVar;
        this.f356313e = aVar;
    }

    /* renamed from: a */
    public final int mo109318a() {
        return C19391a.m36980a(this.f356318j.requireContext(), R.attr.colorPrimary);
    }

    /* renamed from: b */
    public final int mo109319b() {
        return C19391a.m36980a(this.f356318j.requireContext(), R.attr.assistantOnBackground);
    }

    /* renamed from: c */
    public final TextView mo109320c() {
        View findViewById = this.f356318j.requireView().findViewById(R.id.assistant_interpreter_mode_selector_auto_mode);
        C69664n.m101060f(findViewById, "fragment.requireView().f…_mode_selector_auto_mode)");
        return (TextView) findViewById;
    }

    /* renamed from: d */
    public final TextView mo109321d() {
        View findViewById = this.f356318j.requireView().findViewById(R.id.assistant_interpreter_mode_selector_keyboard_mode);
        C69664n.m101060f(findViewById, "fragment.requireView().f…e_selector_keyboard_mode)");
        return (TextView) findViewById;
    }

    /* renamed from: e */
    public final TextView mo109322e() {
        View findViewById = this.f356318j.requireView().findViewById(R.id.assistant_interpreter_mode_selector_manual_mode);
        C69664n.m101060f(findViewById, "fragment.requireView().f…ode_selector_manual_mode)");
        return (TextView) findViewById;
    }

    /* renamed from: f */
    public final void mo109323f(C129940bo boVar) {
        C46439e eVar = this.f356310b;
        C46438d b = C46438d.m82810b(this.f356317i.mo109295a(boVar));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356314f);
    }
}
