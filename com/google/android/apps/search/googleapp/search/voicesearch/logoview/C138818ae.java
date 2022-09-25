package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10473a.C138811a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138823a;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10474b.C138824b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.ae */
/* compiled from: PG */
final class C138818ae {

    /* renamed from: a */
    public static final /* synthetic */ int f377619a = 0;

    /* renamed from: b */
    private static final float[] f377620b = {-4.0f, -1.0f, 3.5f, -4.5f};

    /* renamed from: a */
    public static void m225488a(C138824b bVar, C138823a aVar, long j) {
        int b = bVar.mo114585b(aVar);
        if (aVar == bVar.f377649e) {
            b = 3;
        }
        aVar.f377638e.mo114560c((float) Math.sin((double) ((((((float) j) - (((float) b) * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f)));
    }

    /* renamed from: b */
    public static void m225489b(C138824b bVar, long j) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            m225488a(bVar, (C138823a) it.next(), j);
        }
    }

    /* renamed from: c */
    public static void m225490c(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377642i.mo114560c(1.0f);
            aVar.f377638e.mo114560c(-6.0f);
            if (aVar == bVar.f377647c) {
                aVar.f377637d.mo114560c(-2.0f);
            }
            if (aVar == bVar.f377648d) {
                aVar.f377637d.mo114560c(2.0f);
            }
        }
    }

    /* renamed from: d */
    static void m225491d(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377635b.f377587a = true;
            aVar.mo114579d(false);
            aVar.mo114577b(false);
            aVar.mo114580e(false);
            aVar.mo114578c(false);
            aVar.f377637d.mo114565h(true);
        }
    }

    /* renamed from: e */
    public static void m225492e(C138824b bVar) {
        C138823a aVar = bVar.f377646b;
        aVar.f377634a.mo114560c(12.0f);
        aVar.f377635b.mo114560c(3.1415927f);
        C138823a aVar2 = bVar.f377647c;
        aVar2.f377634a.mo114560c(4.0f);
        aVar2.f377635b.mo114560c(3.1415927f);
        C138823a aVar3 = bVar.f377648d;
        aVar3.f377634a.mo114560c(4.0f);
        aVar3.f377635b.mo114560c(0.0f);
        C138823a aVar4 = bVar.f377649e;
        aVar4.f377634a.mo114560c(12.0f);
        aVar4.f377635b.mo114560c(0.0f);
    }

    /* renamed from: f */
    static void m225493f(C138824b bVar) {
        bVar.f377646b.f377642i.mo114560c(1.0f);
        bVar.f377647c.f377637d.mo114560c(-2.0f);
        bVar.f377648d.f377637d.mo114560c(2.0f);
        bVar.f377649e.f377642i.mo114560c(1.0f);
        if (bVar.f377646b.f377642i.f377589c > 0.66f) {
            bVar.f377647c.f377642i.mo114560c(1.0f);
            bVar.f377648d.f377642i.mo114560c(1.0f);
        }
    }

    /* renamed from: g */
    public static void m225494g(C138824b bVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, 0.0f};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {0.0f, 0.0f, 1.5707964f, 0.0f};
        boolean[] zArr = {false, false, true, true};
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            int b = bVar.mo114585b(aVar);
            boolean z = zArr[b];
            C138811a aVar2 = aVar.f377635b;
            aVar2.f377587a = z;
            aVar2.mo114560c(fArr4[b]);
            aVar.f377634a.mo114560c(fArr3[b] * 1.0416666f);
            aVar.f377637d.mo114560c(fArr2[b] * 1.0416666f);
            aVar.f377638e.mo114560c(f377620b[b] * 1.0416666f);
            aVar.f377636c.mo114560c(fArr[b] * 1.0416666f);
        }
    }

    /* renamed from: h */
    public static boolean m225495h(C138824b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            float f = ((C138823a) it.next()).f377635b.f377589c;
            if (f > 0.3926991f && f < 2.7488937f) {
                return false;
            }
            if (f > 3.5342917f && f < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static void m225496i(C138824b bVar) {
        bVar.f377652h.mo114592b(3.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C138823a aVar = (C138823a) it.next();
            aVar.f377634a.mo114560c(5.656f);
            aVar.f377638e.mo114560c(0.0f);
        }
        bVar.mo114586c(4.712389f, bVar.f377646b);
        bVar.f377646b.f377635b.mo114560c(4.712389f);
        bVar.f377647c.f377635b.mo114560c(0.0f);
        bVar.f377648d.f377635b.mo114560c(1.5707964f);
        bVar.f377649e.f377635b.mo114560c(3.1415927f);
    }
}
