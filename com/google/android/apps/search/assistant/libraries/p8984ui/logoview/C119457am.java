package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8985a.C119442a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119462a;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8986b.C119463b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.am */
/* compiled from: PG */
final class C119457am {

    /* renamed from: a */
    public static final /* synthetic */ int f333015a = 0;

    /* renamed from: b */
    private static final float[] f333016b = {-4.0f, -1.0f, 3.5f, -4.5f};

    /* renamed from: c */
    private static final int[] f333017c = {0, 2, 3, 1};

    /* renamed from: a */
    public static float m198233a(long j, int i) {
        return ((float) ((j - (((long) f333017c[i]) * 50)) % 1200)) / 1200.0f;
    }

    /* renamed from: b */
    static void m198234b(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.mo104374a(true);
            aVar.mo104376c(true);
            aVar.mo104377d(true);
            aVar.mo104375b(true);
        }
    }

    /* renamed from: c */
    public static void m198235c(C119463b bVar) {
        bVar.f333045b.f333035e.mo104357c(12.0f);
        bVar.f333046c.f333035e.mo104357c(9.0f);
        bVar.f333047d.f333035e.mo104357c(14.0f);
        bVar.f333048e.f333035e.mo104357c(8.0f);
    }

    /* renamed from: d */
    public static void m198236d(C119463b bVar, C119462a aVar, long j) {
        int b = bVar.mo104383b(aVar);
        if (aVar == bVar.f333048e) {
            b = 3;
        }
        aVar.f333035e.mo104357c((float) Math.sin((double) ((((((float) j) - (((float) b) * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f)));
    }

    /* renamed from: e */
    public static void m198237e(C119463b bVar, long j) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            m198236d(bVar, (C119462a) it.next(), j);
        }
    }

    /* renamed from: f */
    public static void m198238f(C119462a aVar, int i, float f) {
        aVar.f333035e.mo104357c(f333016b[i] + ((float) Math.sin((double) (f * 6.2831855f))));
    }

    /* renamed from: g */
    public static void m198239g(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333039i.mo104357c(1.0f);
            aVar.f333035e.mo104357c(-6.0f);
            if (aVar == bVar.f333046c) {
                aVar.f333034d.mo104357c(-2.0f);
            }
            if (aVar == bVar.f333047d) {
                aVar.f333034d.mo104357c(2.0f);
            }
        }
    }

    /* renamed from: h */
    static void m198240h(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333032b.f332973a = true;
            aVar.mo104376c(false);
            aVar.mo104374a(false);
            aVar.mo104377d(false);
            aVar.mo104375b(false);
            aVar.f333034d.mo104362h(true);
        }
    }

    /* renamed from: i */
    public static void m198241i(C119463b bVar) {
        C119462a aVar = bVar.f333045b;
        aVar.f333031a.mo104357c(12.0f);
        aVar.f333032b.mo104357c(3.1415927f);
        C119462a aVar2 = bVar.f333046c;
        aVar2.f333031a.mo104357c(4.0f);
        aVar2.f333032b.mo104357c(3.1415927f);
        C119462a aVar3 = bVar.f333047d;
        aVar3.f333031a.mo104357c(4.0f);
        aVar3.f333032b.mo104357c(0.0f);
        C119462a aVar4 = bVar.f333048e;
        aVar4.f333031a.mo104357c(12.0f);
        aVar4.f333032b.mo104357c(0.0f);
    }

    /* renamed from: j */
    static void m198242j(C119463b bVar) {
        bVar.f333045b.f333039i.mo104357c(1.0f);
        bVar.f333046c.f333034d.mo104357c(-2.0f);
        bVar.f333047d.f333034d.mo104357c(2.0f);
        bVar.f333048e.f333039i.mo104357c(1.0f);
        if (bVar.f333045b.f333039i.f332975c > 0.66f) {
            bVar.f333046c.f333039i.mo104357c(1.0f);
            bVar.f333047d.f333039i.mo104357c(1.0f);
        }
    }

    /* renamed from: k */
    public static void m198243k(C119463b bVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, 0.0f};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {0.0f, 0.0f, 1.5707964f, 0.0f};
        boolean[] zArr = {false, false, true, true};
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            int b = bVar.mo104383b(aVar);
            boolean z = zArr[b];
            C119442a aVar2 = aVar.f333032b;
            aVar2.f332973a = z;
            aVar2.mo104357c(fArr4[b]);
            aVar.f333031a.mo104357c(fArr3[b] * 1.0416666f);
            aVar.f333034d.mo104357c(fArr2[b] * 1.0416666f);
            aVar.f333035e.mo104357c(f333016b[b] * 1.0416666f);
            aVar.f333033c.mo104357c(fArr[b] * 1.0416666f);
        }
    }

    /* renamed from: l */
    public static boolean m198244l(C119463b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            float f = ((C119462a) it.next()).f333032b.f332975c;
            if (f > 0.3926991f && f < 2.7488937f) {
                return false;
            }
            if (f > 3.5342917f && f < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static void m198245m(C119463b bVar) {
        bVar.f333051h.mo104391b(3.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C119462a aVar = (C119462a) it.next();
            aVar.f333031a.mo104357c(5.656f);
            aVar.f333035e.mo104357c(0.0f);
        }
        bVar.mo104385d(4.712389f, bVar.f333045b);
        bVar.f333045b.f333032b.mo104357c(4.712389f);
        bVar.f333046c.f333032b.mo104357c(0.0f);
        bVar.f333047d.f333032b.mo104357c(1.5707964f);
        bVar.f333048e.f333032b.mo104357c(3.1415927f);
    }
}
