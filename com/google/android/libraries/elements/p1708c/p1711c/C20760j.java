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

/* renamed from: com.google.android.libraries.elements.c.c.j */
/* compiled from: PG */
public final /* synthetic */ class C20760j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C21313t f58098a;

    /* renamed from: b */
    public final /* synthetic */ C21357r f58099b;

    /* renamed from: c */
    public final /* synthetic */ LottieAnimationView f58100c;

    /* renamed from: d */
    public final /* synthetic */ C21319z f58101d;

    public /* synthetic */ C20760j(C21313t tVar, C21357r rVar, LottieAnimationView lottieAnimationView, C21319z zVar) {
        this.f58098a = tVar;
        this.f58099b = rVar;
        this.f58100c = lottieAnimationView;
        this.f58101d = zVar;
    }

    public final void run() {
        C21313t tVar = this.f58098a;
        C21357r rVar = this.f58099b;
        LottieAnimationView lottieAnimationView = this.f58100c;
        C21319z zVar = this.f58101d;
        CommandOuterClass$Command a = rVar.mo26862a();
        C21309p k = C21311r.m40252k();
        C21230a aVar = (C21230a) k;
        aVar.f59563d = C20767q.m38978b((SenderStateOuterClass$SenderState) null, C20767q.m38977a(lottieAnimationView));
        aVar.f59565f = zVar.mo26806h();
        tVar.mo26124a(a, k.mo26698a()).mo61453k();
    }
}
