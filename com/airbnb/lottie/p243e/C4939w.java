package com.airbnb.lottie.p243e;

import android.graphics.PointF;
import com.airbnb.lottie.p243e.p244a.C4907d;
import com.airbnb.lottie.p243e.p244a.C4908e;

/* renamed from: com.airbnb.lottie.e.w */
/* compiled from: PG */
public final class C4939w implements C4917ah {

    /* renamed from: a */
    public static final C4939w f15702a = new C4939w();

    private C4939w() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9858a(C4908e eVar, float f) {
        int r = eVar.mo9855r();
        if (r == 1) {
            return C4932p.m13674c(eVar, f);
        }
        if (r == 3) {
            return C4932p.m13674c(eVar, f);
        }
        if (r == 7) {
            PointF pointF = new PointF(((float) eVar.mo9839a()) * f, ((float) eVar.mo9839a()) * f);
            while (eVar.mo9853p()) {
                eVar.mo9852o();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(C4907d.m13602a(r)));
    }
}
