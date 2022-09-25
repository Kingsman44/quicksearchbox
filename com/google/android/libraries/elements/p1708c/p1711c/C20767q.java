package com.google.android.libraries.elements.p1708c.p1711c;

import com.airbnb.lottie.LottieAnimationView;
import com.google.protos.youtube.elements.C66012a;
import com.google.protos.youtube.elements.C66065b;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.elements.c.c.q */
/* compiled from: PG */
public final class C20767q {
    /* renamed from: a */
    static C66065b m38977a(LottieAnimationView lottieAnimationView) {
        C66012a aVar = (C66012a) C66065b.f179659d.createBuilder();
        boolean k = lottieAnimationView.f15138d.mo9774k();
        aVar.copyOnWrite();
        C66065b bVar = (C66065b) aVar.instance;
        bVar.f179662a |= 1;
        bVar.f179663b = k;
        float d = lottieAnimationView.f15138d.f15342b.mo9874d();
        aVar.copyOnWrite();
        C66065b bVar2 = (C66065b) aVar.instance;
        bVar2.f179662a |= 2;
        bVar2.f179664c = d;
        return (C66065b) aVar.build();
    }

    /* renamed from: b */
    static SenderStateOuterClass$SenderState m38978b(SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, C66065b bVar) {
        C66216ec ecVar;
        if (senderStateOuterClass$SenderState != null) {
            ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder(senderStateOuterClass$SenderState);
        } else {
            ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        }
        ecVar.mo58885m(C66065b.f179660e, bVar);
        return (SenderStateOuterClass$SenderState) ecVar.build();
    }
}
