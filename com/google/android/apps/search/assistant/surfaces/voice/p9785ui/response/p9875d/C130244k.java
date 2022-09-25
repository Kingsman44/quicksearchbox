package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.k */
/* compiled from: PG */
public final class C130244k {

    /* renamed from: a */
    public static final C59071e f357063a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.k");

    /* renamed from: h */
    private static final Duration f357064h = Duration.ofMillis(200);

    /* renamed from: i */
    private static final Duration f357065i = Duration.ofSeconds(2);

    /* renamed from: b */
    public final C130235b f357066b;

    /* renamed from: c */
    public String f357067c;

    /* renamed from: d */
    public final C46439e f357068d;

    /* renamed from: e */
    public final C130245a f357069e = new C130245a();

    /* renamed from: f */
    public final C129024a f357070f;

    /* renamed from: g */
    public final AnimatorSet f357071g;

    /* renamed from: j */
    private final Context f357072j;

    /* renamed from: k */
    private final C127118j f357073k;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.k$a */
    /* compiled from: PG */
    final class C130245a implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C130244k.f357063a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FeedbackFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38785)).mo56386p("Failed to start interaction for feedback click.");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C59071e eVar = C130244k.f357063a;
            C58976aa aaVar = C58975e.f156826a;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
            Void voidR = (Void) obj;
            C59071e eVar = C130244k.f357063a;
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    public C130244k(C47215a aVar, C130235b bVar, C46439e eVar, C127118j jVar, C129024a aVar2) {
        Context p = aVar.mo51121p();
        this.f357072j = p;
        this.f357066b = bVar;
        this.f357068d = eVar;
        this.f357073k = jVar;
        this.f357070f = aVar2;
        this.f357071g = new AnimatorSet();
        this.f357067c = p.getString(R.string.assistant_feedback_acknowledgement);
    }

    /* renamed from: a */
    public static C130235b m212635a(AccountId accountId) {
        C130235b bVar = new C130235b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }

    /* renamed from: b */
    public final void mo109602b(ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6) {
        imageView2.setColorFilter(C44535e.m78720c(this.f357072j, R.attr.colorOnSurfaceInverse, 0));
        imageView3.setColorFilter(C44535e.m78720c(this.f357072j, R.attr.colorOnSurfaceInverse, 0));
        imageView4.setColorFilter(C44535e.m78720c(this.f357072j, R.attr.colorOnSurfaceInverse, 0));
        imageView5.setColorFilter(C44535e.m78720c(this.f357072j, R.attr.colorOnSurfaceInverse, 0));
        imageView6.setColorFilter(C44535e.m78720c(this.f357072j, R.attr.colorOnSurfaceInverse, 0));
        imageView.setColorFilter(C44535e.m78720c(this.f357072j, R.attr.colorOnPrimaryContainer, 0));
    }

    /* renamed from: c */
    public final void mo109603c(TextView textView, int i) {
        textView.setText(this.f357067c);
        String valueOf = String.valueOf(i);
        AnimatorSet animatorSet = this.f357071g;
        TextView textView2 = (TextView) this.f357066b.requireView().findViewById(R.id.assistant_feedback_survey_floater).findViewById(R.id.assistant_txt_header);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, View.ALPHA, new float[]{1.0f, 0.0f});
        Duration duration = f357064h;
        ofFloat.setDuration(duration.toMillis());
        ofFloat.addListener(new C130242i(this, textView2));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((TextView) this.f357066b.requireView().findViewById(R.id.assistant_feedback_survey_floater).findViewById(R.id.assistant_txt_header), View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(duration.toMillis());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((TextView) this.f357066b.requireView().findViewById(R.id.assistant_feedback_survey_floater).findViewById(R.id.assistant_txt_header), View.ALPHA, new float[]{1.0f, 1.0f});
        ofFloat3.setDuration(f357065i.toMillis());
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f357066b.requireView().findViewById(R.id.assistant_feedback_survey_floater), View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat4.setDuration(duration.toMillis());
        ofFloat4.addListener(new C130243j(this));
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        this.f357071g.start();
        C46439e eVar = this.f357068d;
        C127118j jVar = this.f357073k;
        C127454b bVar = C127454b.CSAT_FEEDBACK_SURVEY;
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        valueOf.getClass();
        amp.f135386a = 1 | amp.f135386a;
        amp.f135387b = valueOf;
        C46438d b = C46438d.m82810b(jVar.mo107931g(C127407d.m208364d(bVar, (C51682amp) amm.build())));
        eVar.mo50428h(b.f121541a, (Object) null, this.f357069e);
    }
}
