package com.airbnb.lottie.p243e;

import android.graphics.Color;
import com.airbnb.lottie.p243e.p244a.C4908e;

/* renamed from: com.airbnb.lottie.e.f */
/* compiled from: PG */
public final class C4922f implements C4917ah {

    /* renamed from: a */
    public static final C4922f f15672a = new C4922f();

    private C4922f() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9858a(C4908e eVar, float f) {
        boolean z = true;
        if (eVar.mo9855r() != 1) {
            z = false;
        }
        if (z) {
            eVar.mo9846i();
        }
        double a = eVar.mo9839a();
        double a2 = eVar.mo9839a();
        double a3 = eVar.mo9839a();
        double a4 = eVar.mo9855r() == 7 ? eVar.mo9839a() : 1.0d;
        if (z) {
            eVar.mo9848k();
        }
        if (a <= 1.0d && a2 <= 1.0d && a3 <= 1.0d) {
            a *= 255.0d;
            a2 *= 255.0d;
            a3 *= 255.0d;
            if (a4 <= 1.0d) {
                a4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) a4, (int) a, (int) a2, (int) a3));
    }
}
