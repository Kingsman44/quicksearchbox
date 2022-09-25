package com.airbnb.lottie.p243e;

import android.graphics.PointF;
import com.airbnb.lottie.p238c.C4842a;
import com.airbnb.lottie.p238c.p240b.C4868k;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.airbnb.lottie.p245f.C4949f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.research.xeno.effect.C66412o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.ab */
/* compiled from: PG */
public final class C4911ab implements C4917ah {

    /* renamed from: a */
    public static final C4911ab f15659a = new C4911ab();

    /* renamed from: b */
    private static final C4906c f15660b = C4906c.m13601a(C45240c.f118157a, "v", "i", C66412o.f180592a);

    private C4911ab() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9858a(C4908e eVar, float f) {
        if (eVar.mo9855r() == 1) {
            eVar.mo9846i();
        }
        eVar.mo9847j();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (eVar.mo9853p()) {
            int c = eVar.mo9841c(f15660b);
            if (c == 0) {
                z = eVar.mo9854q();
            } else if (c == 1) {
                list = C4932p.m13675d(eVar, f);
            } else if (c == 2) {
                list2 = C4932p.m13675d(eVar, f);
            } else if (c != 3) {
                eVar.mo9851n();
                eVar.mo9852o();
            } else {
                list3 = C4932p.m13675d(eVar, f);
            }
        }
        eVar.mo9849l();
        if (eVar.mo9855r() == 2) {
            eVar.mo9848k();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C4868k(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new C4842a(C4949f.m13712f((PointF) list.get(i2), (PointF) list3.get(i2)), C4949f.m13712f(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new C4842a(C4949f.m13712f((PointF) list.get(i3), (PointF) list3.get(i3)), C4949f.m13712f(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new C4868k(pointF, z, arrayList);
        }
    }
}
