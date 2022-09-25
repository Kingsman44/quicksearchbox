package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128565a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128625d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128626e;
import com.google.android.googlequicksearchbox.R;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.h */
/* compiled from: PG */
final class C128590h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f353558a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128590h(LottieAnimationView lottieAnimationView) {
        super(1);
        this.f353558a = lottieAnimationView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        int i;
        C128565a aVar = (C128565a) obj;
        C69664n.m101061g(aVar, "insets");
        Context context = this.f353558a.getContext();
        C69664n.m101060f(context, "micView.context");
        int a = C128626e.m209922a(context, R.dimen.assistant_mic_bottom_margin_fix);
        LottieAnimationView lottieAnimationView = this.f353558a;
        if (aVar.f353518b) {
            i = 0;
        } else {
            i = C128567c.m209820c(aVar.f353517a).f5824e;
        }
        C128625d.m209921a(lottieAnimationView, a + i);
        return C69788q.f186170a;
    }
}
