package com.airbnb.lottie.p234a.p236b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p238c.C4842a;
import com.airbnb.lottie.p238c.p240b.C4868k;
import com.airbnb.lottie.p245f.C4946c;
import com.airbnb.lottie.p245f.C4947d;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4956a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.q */
/* compiled from: PG */
public final class C4818q extends C4807f {

    /* renamed from: e */
    private final C4868k f15318e = new C4868k();

    /* renamed from: f */
    private final Path f15319f = new Path();

    public C4818q(List list) {
        super(list);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo9739f(C4956a aVar, float f) {
        C4868k kVar = (C4868k) aVar.f15731b;
        C4868k kVar2 = (C4868k) aVar.f15732c;
        C4868k kVar3 = this.f15318e;
        if (kVar3.f15505b == null) {
            kVar3.f15505b = new PointF();
        }
        boolean z = true;
        if (!kVar.f15506c && !kVar2.f15506c) {
            z = false;
        }
        kVar3.f15506c = z;
        if (kVar.f15504a.size() != kVar2.f15504a.size()) {
            ((C4946c) C4947d.f15711a).mo9784a("Curves must have the same number of control points. Shape 1: " + kVar.f15504a.size() + "\tShape 2: " + kVar2.f15504a.size(), (Throwable) null);
        }
        int min = Math.min(kVar.f15504a.size(), kVar2.f15504a.size());
        if (kVar3.f15504a.size() < min) {
            for (int size = kVar3.f15504a.size(); size < min; size++) {
                kVar3.f15504a.add(new C4842a());
            }
        } else if (kVar3.f15504a.size() > min) {
            int size2 = kVar3.f15504a.size();
            while (true) {
                size2--;
                if (size2 < min) {
                    break;
                }
                List list = kVar3.f15504a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = kVar.f15505b;
        PointF pointF2 = kVar2.f15505b;
        float c = C4949f.m13709c(pointF.x, pointF2.x, f);
        float c2 = C4949f.m13709c(pointF.y, pointF2.y, f);
        if (kVar3.f15505b == null) {
            kVar3.f15505b = new PointF();
        }
        kVar3.f15505b.set(c, c2);
        int size3 = kVar3.f15504a.size();
        while (true) {
            size3--;
            if (size3 >= 0) {
                C4842a aVar2 = (C4842a) kVar.f15504a.get(size3);
                C4842a aVar3 = (C4842a) kVar2.f15504a.get(size3);
                PointF pointF3 = aVar2.f15419a;
                PointF pointF4 = aVar2.f15420b;
                PointF pointF5 = aVar2.f15421c;
                PointF pointF6 = aVar3.f15419a;
                PointF pointF7 = aVar3.f15420b;
                PointF pointF8 = aVar3.f15421c;
                ((C4842a) kVar3.f15504a.get(size3)).f15419a.set(C4949f.m13709c(pointF3.x, pointF6.x, f), C4949f.m13709c(pointF3.y, pointF6.y, f));
                ((C4842a) kVar3.f15504a.get(size3)).f15420b.set(C4949f.m13709c(pointF4.x, pointF7.x, f), C4949f.m13709c(pointF4.y, pointF7.y, f));
                ((C4842a) kVar3.f15504a.get(size3)).f15421c.set(C4949f.m13709c(pointF5.x, pointF8.x, f), C4949f.m13709c(pointF5.y, pointF8.y, f));
            } else {
                C4949f.m13713g(this.f15318e, this.f15319f);
                return this.f15319f;
            }
        }
    }
}
