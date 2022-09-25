package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;

/* renamed from: com.google.android.libraries.gsa.logoview.h */
/* compiled from: PG */
final class C22915h extends C22897ai {
    public C22915h() {
        super("THINKING");
    }

    /* renamed from: a */
    public final void mo28241a(C22904b bVar) {
        C22897ai.m42811q(bVar);
    }

    /* renamed from: b */
    public final void mo28242b(C22904b bVar) {
        bVar.mo28265c(bVar.f63077b, 0.0f);
        C22903a aVar = bVar.f63077b;
        float f = aVar.f63066b.f63012b;
        C22903a aVar2 = bVar.f63078c;
        float f2 = aVar2.f63066b.f63012b;
        C22903a aVar3 = bVar.f63079d;
        float f3 = aVar3.f63066b.f63012b;
        C22903a aVar4 = bVar.f63080e;
        float f4 = f3 - f2;
        float f5 = aVar4.f63066b.f63012b - f3;
        if (f2 - f > 1.5707964f) {
            bVar.mo28265c(aVar2, 0.0f);
        } else if (f4 > 1.5707964f) {
            bVar.mo28265c(aVar3, 1.5707964f);
        } else if (f5 > 1.5707964f) {
            bVar.mo28265c(aVar4, 3.1415927f);
        } else {
            bVar.mo28265c(aVar, 4.712389f);
        }
        bVar.f63077b.f63066b.mo28235c(4.712389f);
        bVar.f63078c.f63066b.mo28235c(0.0f);
        bVar.f63079d.f63066b.mo28235c(1.5707964f);
        bVar.f63080e.f63066b.mo28235c(3.1415927f);
    }

    /* renamed from: c */
    public final boolean mo28243c(long j, long j2, C22904b bVar) {
        float f;
        C22904b bVar2 = bVar;
        float f2 = ((float) (j2 - j)) / 6000.0f;
        float f3 = f2 - ((float) ((int) f2));
        C22903a aVar = bVar2.f63077b;
        C22903a aVar2 = bVar2.f63078c;
        C22903a aVar3 = bVar2.f63079d;
        C22903a aVar4 = bVar2.f63080e;
        if (f3 < 0.16749999f) {
            aVar.f63066b.mo28235c(4.712389f);
            aVar2.f63066b.mo28235c(0.0f);
            aVar3.f63066b.mo28235c(1.5707964f);
            aVar4.f63066b.mo28235c(3.1415927f);
        } else {
            double d = (double) f3;
            if (d < 0.25d) {
                aVar.f63066b.mo28235c(4.712389f);
                aVar2.f63066b.mo28235c(1.5707964f);
                aVar3.f63066b.mo28235c(2.6179938f);
                aVar4.f63066b.mo28235c(3.6651917f);
            } else if (f3 < 0.4175f) {
                aVar.f63066b.mo28235c(0.0f);
                aVar2.f63066b.mo28235c(1.5707964f);
                aVar3.f63066b.mo28235c(3.1415927f);
                aVar4.f63066b.mo28235c(4.712389f);
            } else if (d < 0.5d) {
                aVar.f63066b.mo28235c(0.5235988f);
                aVar2.f63066b.mo28235c(1.5707964f);
                aVar3.f63066b.mo28235c(4.712389f);
                aVar4.f63066b.mo28235c(5.759587f);
            } else if (f3 < 0.6675f) {
                aVar.f63066b.mo28235c(1.5707964f);
                aVar2.f63066b.mo28235c(3.1415927f);
                aVar3.f63066b.mo28235c(4.712389f);
                aVar4.f63066b.mo28235c(0.0f);
            } else if (d < 0.75d) {
                aVar.f63066b.mo28235c(2.6179938f);
                aVar2.f63066b.mo28235c(3.6651917f);
                aVar3.f63066b.mo28235c(4.712389f);
                aVar4.f63066b.mo28235c(1.5707964f);
            } else if (f3 < 0.9175f) {
                aVar.f63066b.mo28235c(3.1415927f);
                aVar2.f63066b.mo28235c(4.712389f);
                aVar3.f63066b.mo28235c(0.0f);
                aVar4.f63066b.mo28235c(1.5707964f);
            } else if (f3 < 1.0f) {
                aVar.f63066b.mo28235c(4.712389f);
                aVar2.f63066b.mo28235c(5.759587f);
                aVar3.f63066b.mo28235c(0.5235988f);
                aVar4.f63066b.mo28235c(1.5707964f);
            }
            f = 2.0f;
            bVar2.f63083h.mo28271b(f * 3.0f);
            return true;
        }
        f = 1.0f;
        bVar2.f63083h.mo28271b(f * 3.0f);
        return true;
    }
}
