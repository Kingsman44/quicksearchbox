package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.s */
/* compiled from: PG */
public final class C130047s {

    /* renamed from: a */
    public static final Duration f356611a = Duration.ofMillis(1500);

    /* renamed from: b */
    public static final C59071e f356612b = C59071e.m91331h();

    /* renamed from: c */
    public final AccountId f356613c;

    /* renamed from: d */
    public final C130044p f356614d;

    /* renamed from: e */
    public final C46855i f356615e;

    /* renamed from: f */
    public final C47770dh f356616f;

    /* renamed from: g */
    public final boolean f356617g;

    /* renamed from: h */
    public final C60950i f356618h;

    /* renamed from: i */
    public Instant f356619i;

    /* renamed from: j */
    public TtsViewModel f356620j;

    /* renamed from: k */
    public String f356621k;

    /* renamed from: l */
    public String f356622l;

    /* renamed from: m */
    public final C129855b f356623m;

    public C130047s(AccountId accountId, C130044p pVar, C129855b bVar, C46855i iVar, C47770dh dhVar, boolean z, C60950i iVar2) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(iVar, "subscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(iVar2, "timeSource");
        this.f356613c = accountId;
        this.f356614d = pVar;
        this.f356623m = bVar;
        this.f356615e = iVar;
        this.f356616f = dhVar;
        this.f356617g = z;
        this.f356618h = iVar2;
        Instant instant = Instant.EPOCH;
        C69664n.m101060f(instant, "EPOCH");
        this.f356619i = instant;
    }

    /* renamed from: a */
    public final ImageView mo109455a() {
        View findViewById = this.f356614d.requireView().findViewById(R.id.assistant_interpreter_output_text_copy_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…_output_text_copy_button)");
        return (ImageView) findViewById;
    }

    /* renamed from: b */
    public final ImageView mo109456b() {
        View findViewById = this.f356614d.requireView().findViewById(R.id.assistant_interpreter_output_text_tts_button);
        C69664n.m101060f(findViewById, "fragment.requireView().f…r_output_text_tts_button)");
        return (ImageView) findViewById;
    }

    /* renamed from: c */
    public final TextView mo109457c() {
        View findViewById = this.f356614d.requireView().findViewById(R.id.assistant_interpreter_input_text);
        C69664n.m101060f(findViewById, "fragment.requireView().f…t_interpreter_input_text)");
        return (TextView) findViewById;
    }

    /* renamed from: d */
    public final TextView mo109458d() {
        View findViewById = this.f356614d.requireView().findViewById(R.id.assistant_interpreter_output_lang_name);
        C69664n.m101060f(findViewById, "fragment.requireView().f…rpreter_output_lang_name)");
        return (TextView) findViewById;
    }

    /* renamed from: e */
    public final TextView mo109459e() {
        View findViewById = this.f356614d.requireView().findViewById(R.id.assistant_interpreter_output_text);
        C69664n.m101060f(findViewById, "fragment.requireView().f…_interpreter_output_text)");
        return (TextView) findViewById;
    }

    /* renamed from: f */
    public final InterpreterOtherTranslationView mo109460f() {
        View findViewById = this.f356614d.requireView().findViewById(R.id.assistant_interpreter_other_translations);
        C69664n.m101060f(findViewById, "fragment.requireView().f…reter_other_translations)");
        return (InterpreterOtherTranslationView) findViewById;
    }
}
