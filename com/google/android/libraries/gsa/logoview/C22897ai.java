package com.google.android.libraries.gsa.logoview;

import com.google.android.libraries.gsa.logoview.p1881a.C22886a;
import com.google.android.libraries.gsa.logoview.p1882b.C22903a;
import com.google.android.libraries.gsa.logoview.p1882b.C22904b;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.logoview.ai */
/* compiled from: PG */
public abstract class C22897ai {

    /* renamed from: A */
    public static final C22897ai f63020A = new C22931x();

    /* renamed from: B */
    public static final C22897ai f63021B = new C22932y();

    /* renamed from: C */
    public static final C22897ai f63022C = new C22933z();

    /* renamed from: D */
    private static final int[] f63023D = {0, 2, 3, 1};

    /* renamed from: a */
    public static final float[] f63024a = {-4.0f, -1.0f, 3.5f, -4.5f};

    /* renamed from: b */
    public static final C22897ai f63025b = new C22924q();

    /* renamed from: c */
    public static final C22897ai f63026c = new C22889aa();

    /* renamed from: d */
    public static final C22897ai f63027d = new C22890ab();

    /* renamed from: e */
    public static final C22897ai f63028e = new C22891ac();

    /* renamed from: f */
    public static final C22897ai f63029f = new C22892ad();

    /* renamed from: g */
    public static final C22897ai f63030g = new C22893ae();

    /* renamed from: h */
    public static final C22897ai f63031h = new C22894af();

    /* renamed from: i */
    public static final C22897ai f63032i = new C22895ag();

    /* renamed from: j */
    public static final C22897ai f63033j = new C22896ah();

    /* renamed from: k */
    public static final C22897ai f63034k = new C22914g();

    /* renamed from: l */
    public static final C22897ai f63035l = new C22915h();

    /* renamed from: m */
    public static final C22897ai f63036m = new C22916i();

    /* renamed from: n */
    public static final C22897ai f63037n = new C22917j();

    /* renamed from: o */
    public static final C22897ai f63038o = new C22918k();

    /* renamed from: p */
    public static final C22897ai f63039p = new C22919l();

    /* renamed from: q */
    public static final C22897ai f63040q = new C22920m();

    /* renamed from: r */
    public static final C22897ai f63041r = new C22921n();

    /* renamed from: s */
    public static final C22897ai f63042s = new C22922o();

    /* renamed from: t */
    public static final C22897ai f63043t = new C22923p();

    /* renamed from: u */
    public static final C22897ai f63044u = new C22925r();

    /* renamed from: v */
    public static final C22897ai f63045v = new C22926s();

    /* renamed from: w */
    public static final C22897ai f63046w = new C22927t();

    /* renamed from: x */
    public static final C22897ai f63047x = new C22928u();

    /* renamed from: y */
    public static final C22897ai f63048y = new C22929v();

    /* renamed from: z */
    public static final C22897ai f63049z = new C22930w();

    /* renamed from: E */
    private final String f63050E;

    public C22897ai(String str) {
        this.f63050E = str;
    }

    /* renamed from: e */
    public static float m42799e(long j, int i) {
        return ((float) ((j - (((long) f63023D[i]) * 50)) % 1200)) / 1200.0f;
    }

    /* renamed from: f */
    public static void m42800f(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.mo28256b(true);
            aVar.mo28258d(true);
            aVar.mo28259e(true);
            aVar.mo28257c(true);
        }
    }

    /* renamed from: g */
    public static void m42801g(C22904b bVar, C22903a aVar, long j) {
        int b = bVar.mo28264b(aVar);
        if (aVar == bVar.f63080e) {
            b = 3;
        }
        aVar.f63069e.mo28235c((float) Math.sin((double) ((((((float) j) - (((float) b) * 200.0f)) % 1667.0f) / 1667.0f) * 6.2831855f)));
    }

    /* renamed from: h */
    public static void m42802h(C22904b bVar, long j) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            m42801g(bVar, (C22903a) it.next(), j);
        }
    }

    /* renamed from: i */
    public static void m42803i(C22903a aVar, int i, float f) {
        aVar.f63069e.mo28235c(f63024a[i] + ((float) Math.sin((double) (f * 6.2831855f))));
    }

    /* renamed from: j */
    public static void m42804j(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63073i.mo28235c(1.0f);
            aVar.f63069e.mo28235c(-6.0f);
            if (aVar == bVar.f63078c) {
                aVar.f63068d.mo28235c(-2.0f);
            }
            if (aVar == bVar.f63079d) {
                aVar.f63068d.mo28235c(2.0f);
            }
        }
    }

    /* renamed from: k */
    public static void m42805k(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63066b.f63011a = true;
            aVar.mo28258d(false);
            aVar.mo28256b(false);
            aVar.mo28259e(false);
            aVar.mo28257c(false);
            aVar.f63068d.mo28240h(true);
        }
    }

    /* renamed from: l */
    public static void m42806l(C22904b bVar) {
        C22903a aVar = bVar.f63077b;
        aVar.f63065a.mo28235c(12.0f);
        aVar.f63066b.mo28235c(3.1415927f);
        C22903a aVar2 = bVar.f63078c;
        aVar2.f63065a.mo28235c(4.0f);
        aVar2.f63066b.mo28235c(3.1415927f);
        C22903a aVar3 = bVar.f63079d;
        aVar3.f63065a.mo28235c(4.0f);
        aVar3.f63066b.mo28235c(0.0f);
        C22903a aVar4 = bVar.f63080e;
        aVar4.f63065a.mo28235c(12.0f);
        aVar4.f63066b.mo28235c(0.0f);
    }

    /* renamed from: m */
    public static void m42807m(C22904b bVar) {
        bVar.f63077b.f63073i.mo28235c(1.0f);
        bVar.f63078c.f63068d.mo28235c(-2.0f);
        bVar.f63079d.f63068d.mo28235c(2.0f);
        bVar.f63080e.f63073i.mo28235c(1.0f);
        if (bVar.f63077b.f63073i.f63013c > 0.66f) {
            bVar.f63078c.f63073i.mo28235c(1.0f);
            bVar.f63079d.f63073i.mo28235c(1.0f);
        }
    }

    /* renamed from: n */
    public static void m42808n(C22904b bVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, 0.0f};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {0.0f, 0.0f, 1.5707964f, 0.0f};
        boolean[] zArr = {false, false, true, true};
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            int b = bVar.mo28264b(aVar);
            boolean z = zArr[b];
            C22886a aVar2 = aVar.f63066b;
            aVar2.f63011a = z;
            aVar2.mo28235c(fArr4[b]);
            aVar.f63065a.mo28235c(fArr3[b] * 1.0416666f);
            aVar.f63068d.mo28235c(fArr2[b] * 1.0416666f);
            aVar.f63069e.mo28235c(f63024a[b] * 1.0416666f);
            aVar.f63067c.mo28235c(fArr[b] * 1.0416666f);
        }
    }

    /* renamed from: o */
    public static boolean m42809o(C22904b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            float f = ((C22903a) it.next()).f63066b.f63013c;
            if (f > 0.3926991f && f < 2.7488937f) {
                return false;
            }
            if (f > 3.5342917f && f < 5.8904862f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m42810p(C22904b bVar) {
        return bVar.f63077b.f63066b.f63012b == 3.1415927f && bVar.f63078c.f63066b.f63012b == 3.1415927f && bVar.f63079d.f63066b.f63012b == 0.0f && bVar.f63080e.f63066b.f63012b == 0.0f;
    }

    /* renamed from: q */
    public static void m42811q(C22904b bVar) {
        bVar.f63083h.mo28271b(3.0f);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C22903a aVar = (C22903a) it.next();
            aVar.f63065a.mo28235c(5.656f);
            aVar.f63069e.mo28235c(0.0f);
        }
        bVar.mo28265c(bVar.f63077b, 4.712389f);
        bVar.f63077b.f63066b.mo28235c(4.712389f);
        bVar.f63078c.f63066b.mo28235c(0.0f);
        bVar.f63079d.f63066b.mo28235c(1.5707964f);
        bVar.f63080e.f63066b.mo28235c(3.1415927f);
    }

    /* renamed from: a */
    public abstract void mo28241a(C22904b bVar);

    /* renamed from: b */
    public abstract void mo28242b(C22904b bVar);

    /* renamed from: c */
    public abstract boolean mo28243c(long j, long j2, C22904b bVar);

    public final String toString() {
        return this.f63050E;
    }
}
