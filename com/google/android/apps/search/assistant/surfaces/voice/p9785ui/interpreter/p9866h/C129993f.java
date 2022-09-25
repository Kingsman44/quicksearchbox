package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9866h;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129856c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.h.f */
/* compiled from: PG */
public final class C129993f {

    /* renamed from: a */
    public static final C59071e f356504a = C59071e.m91331h();

    /* renamed from: b */
    public final C47770dh f356505b;

    /* renamed from: c */
    public final C129989b f356506c;

    /* renamed from: d */
    public final InterpreterInteractionController f356507d;

    /* renamed from: e */
    public final C46855i f356508e;

    /* renamed from: f */
    public final C46439e f356509f;

    /* renamed from: g */
    public final C129856c f356510g = new C129856c();

    /* renamed from: h */
    public String f356511h;

    /* renamed from: i */
    public final C129855b f356512i;

    public C129993f(C47770dh dhVar, C129989b bVar, C129855b bVar2, InterpreterInteractionController interpreterInteractionController, C46855i iVar, C46439e eVar) {
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(iVar, "subscriptionMixin");
        C69664n.m101061g(eVar, "futuresMixin");
        this.f356505b = dhVar;
        this.f356506c = bVar;
        this.f356512i = bVar2;
        this.f356507d = interpreterInteractionController;
        this.f356508e = iVar;
        this.f356509f = eVar;
    }

    /* renamed from: a */
    public final Button mo109373a() {
        View findViewById = this.f356506c.requireView().findViewById(R.id.assistant_interpreter_keyboard_cancel_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…r_keyboard_cancel_button)");
        return (Button) findViewById;
    }

    /* renamed from: b */
    public final Button mo109374b() {
        View findViewById = this.f356506c.requireView().findViewById(R.id.assistant_interpreter_keyboard_commit_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…r_keyboard_commit_button)");
        return (Button) findViewById;
    }

    /* renamed from: c */
    public final EditText mo109375c() {
        View findViewById = this.f356506c.requireView().findViewById(R.id.assistant_interpreter_keyboard_main_text);
        C69664n.m101060f(findViewById, "fragment.requireView().f…reter_keyboard_main_text)");
        return (EditText) findViewById;
    }

    /* renamed from: d */
    public final LinearLayout mo109376d() {
        View findViewById = this.f356506c.requireView().findViewById(R.id.assistant_interpreter_auto_waiting);
        C69664n.m101060f(findViewById, "fragment.requireView().f…interpreter_auto_waiting)");
        return (LinearLayout) findViewById;
    }

    /* renamed from: e */
    public final RelativeLayout mo109377e() {
        View findViewById = this.f356506c.requireView().findViewById(R.id.assistant_interpreter_waiting);
        C69664n.m101060f(findViewById, "fragment.requireView().f…tant_interpreter_waiting)");
        return (RelativeLayout) findViewById;
    }

    /* renamed from: f */
    public final RelativeLayout mo109378f() {
        View findViewById = this.f356506c.requireView().findViewById(R.id.assistant_interpreter_keyboard_waiting);
        C69664n.m101060f(findViewById, "fragment.requireView().f…rpreter_keyboard_waiting)");
        return (RelativeLayout) findViewById;
    }

    /* renamed from: g */
    public final TextView mo109379g() {
        View findViewById = this.f356506c.requireView().findViewById(R.id.assistant_interpreter_keyboard_lang_name);
        C69664n.m101060f(findViewById, "fragment.requireView().f…reter_keyboard_lang_name)");
        return (TextView) findViewById;
    }

    /* renamed from: h */
    public final void mo109380h(C129940bo boVar) {
        C46439e eVar = this.f356509f;
        C46438d b = C46438d.m82810b(this.f356512i.mo109295a(boVar));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356510g);
    }
}
