package com.airbnb.lottie.p243e;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4907d;
import com.airbnb.lottie.p243e.p244a.C4908e;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.airbnb.lottie.e.p */
/* compiled from: PG */
final class C4932p {

    /* renamed from: a */
    private static final C4906c f15687a = C4906c.m13601a("x", "y");

    /* renamed from: a */
    static float m13672a(C4908e eVar) {
        int r = eVar.mo9855r();
        int i = r - 1;
        if (r == 0) {
            throw null;
        } else if (i == 0) {
            eVar.mo9846i();
            float a = (float) eVar.mo9839a();
            while (eVar.mo9853p()) {
                eVar.mo9852o();
            }
            eVar.mo9848k();
            return a;
        } else if (i == 6) {
            return (float) eVar.mo9839a();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type ".concat(C4907d.m13602a(r)));
        }
    }

    /* renamed from: b */
    static int m13673b(C4908e eVar) {
        eVar.mo9846i();
        int a = (int) (eVar.mo9839a() * 255.0d);
        int a2 = (int) (eVar.mo9839a() * 255.0d);
        int a3 = (int) (eVar.mo9839a() * 255.0d);
        while (eVar.mo9853p()) {
            eVar.mo9852o();
        }
        eVar.mo9848k();
        return Color.argb(PrivateKeyType.INVALID, a, a2, a3);
    }

    /* renamed from: c */
    static PointF m13674c(C4908e eVar, float f) {
        int r = eVar.mo9855r();
        int i = r - 1;
        if (r == 0) {
            throw null;
        } else if (i == 0) {
            eVar.mo9846i();
            float a = (float) eVar.mo9839a();
            float a2 = (float) eVar.mo9839a();
            while (eVar.mo9855r() != 2) {
                eVar.mo9852o();
            }
            eVar.mo9848k();
            return new PointF(a * f, a2 * f);
        } else if (i == 2) {
            eVar.mo9847j();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (eVar.mo9853p()) {
                int c = eVar.mo9841c(f15687a);
                if (c == 0) {
                    f2 = m13672a(eVar);
                } else if (c != 1) {
                    eVar.mo9851n();
                    eVar.mo9852o();
                } else {
                    f3 = m13672a(eVar);
                }
            }
            eVar.mo9849l();
            return new PointF(f2 * f, f3 * f);
        } else if (i == 6) {
            float a3 = (float) eVar.mo9839a();
            float a4 = (float) eVar.mo9839a();
            while (eVar.mo9853p()) {
                eVar.mo9852o();
            }
            return new PointF(a3 * f, a4 * f);
        } else {
            throw new IllegalArgumentException("Unknown point starts with ".concat(C4907d.m13602a(eVar.mo9855r())));
        }
    }

    /* renamed from: d */
    static List m13675d(C4908e eVar, float f) {
        ArrayList arrayList = new ArrayList();
        eVar.mo9846i();
        while (eVar.mo9855r() == 1) {
            eVar.mo9846i();
            arrayList.add(m13674c(eVar, f));
            eVar.mo9848k();
        }
        eVar.mo9848k();
        return arrayList;
    }
}
