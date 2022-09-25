package com.google.android.libraries.elements.p1708c.p1711c;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.elements.c.c.i */
/* compiled from: PG */
public final /* synthetic */ class C20759i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21313t f58094a;

    /* renamed from: b */
    public final /* synthetic */ C21357r f58095b;

    /* renamed from: c */
    public final /* synthetic */ LottieAnimationView f58096c;

    /* renamed from: d */
    public final /* synthetic */ C21319z f58097d;

    public /* synthetic */ C20759i(C21313t tVar, C21357r rVar, LottieAnimationView lottieAnimationView, C21319z zVar) {
        this.f58094a = tVar;
        this.f58095b = rVar;
        this.f58096c = lottieAnimationView;
        this.f58097d = zVar;
    }

    public final void run() {
        C21313t tVar = this.f58094a;
        C21357r rVar = this.f58095b;
        LottieAnimationView lottieAnimationView = this.f58096c;
        C21319z zVar = this.f58097d;
        CommandOuterClass$Command a = rVar.mo26862a();
        C21309p k = C21311r.m40252k();
        C21230a aVar = (C21230a) k;
        aVar.f59563d = C20767q.m38978b((SenderStateOuterClass$SenderState) null, C20767q.m38977a(lottieAnimationView));
        aVar.f59565f = zVar.mo26806h();
        tVar.mo26124a(a, k.mo26698a()).mo61453k();
    }
}
