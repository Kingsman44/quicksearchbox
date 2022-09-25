package androidx.media3.exoplayer.p150j;

import androidx.media3.common.C2652bn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.j.f */
/* compiled from: PG */
public final /* synthetic */ class C3210f implements C3227w {

    /* renamed from: a */
    public final /* synthetic */ C3195ab f9633a;

    /* renamed from: b */
    public final /* synthetic */ C3221q f9634b;

    /* renamed from: c */
    public final /* synthetic */ boolean f9635c;

    public /* synthetic */ C3210f(C3195ab abVar, C3221q qVar, boolean z) {
        this.f9633a = abVar;
        this.f9634b = qVar;
        this.f9635c = z;
    }

    /* renamed from: a */
    public final List mo7211a(int i, C2652bn bnVar, int[] iArr) {
        C3195ab abVar = this.f9633a;
        C3221q qVar = this.f9634b;
        boolean z = this.f9635c;
        C3209e eVar = new C3209e(abVar);
        C58480gp e = C58485gu.m89837e();
        C2652bn bnVar2 = bnVar;
        for (int i2 = 0; i2 < bnVar2.f7354a; i2++) {
            e.mo55395g(new C3218n(i, bnVar, i2, qVar, iArr[i2], z, eVar));
        }
        return e.mo55394f();
    }
}
