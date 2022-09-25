package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.impl.C147783f;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import com.google.android.libraries.search.p6glow.C39869b;
import com.google.android.libraries.search.p6glow.C39882m;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.k */
/* compiled from: PG */
public final /* synthetic */ class C81900k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223970a;

    public /* synthetic */ C81900k(C81889aq aqVar) {
        this.f223970a = aqVar;
    }

    public final void accept(Object obj) {
        C81889aq aqVar = this.f223970a;
        View view = (View) obj;
        AssistantP6GlowView assistantP6GlowView = (AssistantP6GlowView) view.findViewById(R.id.p6_glow_glow_view);
        assistantP6GlowView.setOnClickListener(new C81878af(aqVar, assistantP6GlowView));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.p6_glow_assistant_puddle);
        lottieAnimationView.setOnClickListener(new C81880ah(aqVar, lottieAnimationView));
        C147783f fVar = aqVar.f223941z;
        C39869b bVar = aqVar.f223935t;
        C69664n.m101061g(assistantP6GlowView, "view");
        C69664n.m101061g(fVar, "animationFactory");
        C69664n.m101061g(bVar, "callbacks");
        C39882m mVar = new C39882m(assistantP6GlowView, fVar, bVar, 1016);
        C147783f fVar2 = aqVar.f223941z;
        fVar2.getClass();
        aqVar.f223936u = new C81894e(mVar, fVar2, aqVar);
        aqVar.f223923h.mo76663c(aqVar.f223934s.mo75426a(R.string.p6_glow_glow_label), new C81881ai(aqVar, assistantP6GlowView));
        aqVar.f223923h.mo76663c(aqVar.f223934s.mo75426a(R.string.p6_glow_mic_label), new C81882aj(aqVar, lottieAnimationView));
        aqVar.f223923h.mo76663c(aqVar.f223920e.mo75152e(), new C81883ak(aqVar));
        aqVar.f223923h.mo76663c(aqVar.f223924i, new C81884al(aqVar));
        aqVar.f223923h.mo76663c(aqVar.f223925j, new C81896g(aqVar));
        aqVar.f223923h.mo76663c(aqVar.f223926k, new C83369s(aqVar.f223917b, "onSpeechTransition", new C81897h(aqVar, lottieAnimationView)));
        aqVar.f223923h.mo76663c(aqVar.f223927l, new C83369s(aqVar.f223917b, "layoutConfig", new C81898i(aqVar, assistantP6GlowView, lottieAnimationView)));
        aqVar.f223923h.mo76663c(aqVar.f223924i, new C83369s(aqVar.f223917b, "edgeLights", new C81899j(aqVar, lottieAnimationView)));
        aqVar.f223917b.mo28212l("[NGA] attachView p6glow", new C81879ag(aqVar, view, assistantP6GlowView, lottieAnimationView));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
