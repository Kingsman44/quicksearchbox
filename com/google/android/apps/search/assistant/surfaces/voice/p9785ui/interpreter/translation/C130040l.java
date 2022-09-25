package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction.InterpreterInteractionController;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129855b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9856a.C129856c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129963n;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.l */
/* compiled from: PG */
public final class C130040l {

    /* renamed from: a */
    public final C130037i f356597a;

    /* renamed from: b */
    public final C46855i f356598b;

    /* renamed from: c */
    public final C46439e f356599c;

    /* renamed from: d */
    public final InterpreterInteractionController f356600d;

    /* renamed from: e */
    public final C129856c f356601e = new C129856c();

    /* renamed from: f */
    public final C129855b f356602f;

    /* renamed from: g */
    private final C47770dh f356603g;

    public C130040l(C130037i iVar, C129855b bVar, C46855i iVar2, C47770dh dhVar, C46439e eVar, InterpreterInteractionController interpreterInteractionController) {
        C69664n.m101061g(iVar2, "subscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(eVar, "futuresMixin");
        this.f356597a = iVar;
        this.f356602f = bVar;
        this.f356598b = iVar2;
        this.f356603g = dhVar;
        this.f356599c = eVar;
        this.f356600d = interpreterInteractionController;
    }

    /* renamed from: f */
    public static final String m212312f(C129966q qVar) {
        C129963n nVar;
        String str;
        String str2;
        if (qVar.f356469b == 6) {
            nVar = (C129963n) qVar.f356470c;
        } else {
            nVar = C129963n.f356442m;
        }
        if (C69664n.m101066l(nVar.f356451h, qVar.f356474g)) {
            str = qVar.f356472e;
            str2 = "targetLocale";
        } else {
            str = qVar.f356471d;
            str2 = "sourceLocale";
        }
        C69664n.m101060f(str, str2);
        return str;
    }

    /* renamed from: a */
    public final HorizontalScrollView mo109445a() {
        View findViewById = this.f356597a.requireView().findViewById(R.id.assistant_interpreter_smart_replies_scroll_view);
        C69664n.m101060f(findViewById, "fragment.requireView().f…mart_replies_scroll_view)");
        return (HorizontalScrollView) findViewById;
    }

    /* renamed from: b */
    public final TextView mo109446b() {
        View findViewById = this.f356597a.requireView().findViewById(R.id.assistant_interpreter_smart_reply_content_0);
        C69664n.m101060f(findViewById, "fragment.requireView().f…er_smart_reply_content_0)");
        return (TextView) findViewById;
    }

    /* renamed from: c */
    public final TextView mo109447c() {
        View findViewById = this.f356597a.requireView().findViewById(R.id.assistant_interpreter_smart_reply_content_1);
        C69664n.m101060f(findViewById, "fragment.requireView().f…er_smart_reply_content_1)");
        return (TextView) findViewById;
    }

    /* renamed from: d */
    public final TextView mo109448d() {
        View findViewById = this.f356597a.requireView().findViewById(R.id.assistant_interpreter_smart_reply_content_2);
        C69664n.m101060f(findViewById, "fragment.requireView().f…er_smart_reply_content_2)");
        return (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo109449e(TextView textView, LinearLayout linearLayout, String str, String str2, String str3) {
        textView.setText(str);
        linearLayout.setOnClickListener(new C47591co(this.f356603g, str3, new C130039k(this, str, str2)));
    }
}
