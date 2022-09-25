package com.google.android.libraries.lens.view.vision;

import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.lens.view.vision.u */
/* compiled from: PG */
public abstract class C28179u {

    /* renamed from: A */
    public static final AtomicInteger f76693A = new AtomicInteger(0);

    /* renamed from: C */
    public static C28178t m52642C(int i) {
        C28164f fVar = new C28164f();
        fVar.f76633a = i;
        fVar.f76643k = (short) (fVar.f76643k | 1);
        fVar.mo33650n(0);
        fVar.mo33644h(C58485gu.m89845m());
        fVar.mo33641e(C25349y.UNKNOWN);
        fVar.mo33645i(false);
        fVar.mo33642f(false);
        fVar.mo33643g(false);
        fVar.f76643k = (short) (fVar.f76643k | 256);
        fVar.mo33649m(false);
        fVar.mo33638b(false);
        fVar.mo33639c(1.0f);
        fVar.mo33640d(1.0f);
        fVar.mo33651o(false);
        return fVar;
    }

    /* renamed from: D */
    public static C28178t m52643D() {
        return m52642C(f76693A.getAndIncrement());
    }

    /* renamed from: A */
    public abstract boolean mo33654A();

    /* renamed from: B */
    public abstract boolean mo33655B();

    /* renamed from: E */
    public final boolean mo33697E() {
        return mo33679u().size() == 8;
    }

    /* renamed from: a */
    public abstract float mo33656a();

    /* renamed from: b */
    public abstract float mo33657b();

    /* renamed from: c */
    public abstract float mo33658c();

    /* renamed from: d */
    public abstract float mo33659d();

    /* renamed from: e */
    public abstract float mo33660e();

    /* renamed from: f */
    public abstract float mo33662f();

    /* renamed from: g */
    public abstract float mo33663g();

    /* renamed from: h */
    public abstract int mo33664h();

    /* renamed from: i */
    public abstract long mo33666i();

    /* renamed from: j */
    public abstract C25349y mo33667j();

    /* renamed from: k */
    public abstract C28178t mo33668k();

    /* renamed from: l */
    public abstract C58833ax mo33669l();

    /* renamed from: m */
    public abstract C58833ax mo33670m();

    /* renamed from: n */
    public abstract C58833ax mo33671n();

    /* renamed from: o */
    public abstract C58833ax mo33672o();

    /* renamed from: p */
    public abstract C58833ax mo33673p();

    /* renamed from: q */
    public abstract C58833ax mo33674q();

    /* renamed from: r */
    public abstract C58833ax mo33675r();

    /* renamed from: s */
    public abstract C58833ax mo33676s();

    /* renamed from: t */
    public abstract C58833ax mo33677t();

    /* renamed from: u */
    public abstract C58485gu mo33679u();

    /* renamed from: v */
    public abstract boolean mo33680v();

    /* renamed from: w */
    public abstract boolean mo33681w();

    /* renamed from: x */
    public abstract boolean mo33682x();

    /* renamed from: y */
    public abstract boolean mo33683y();

    /* renamed from: z */
    public abstract boolean mo33684z();
}
