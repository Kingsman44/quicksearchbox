package androidx.media3.exoplayer.p150j;

import androidx.media3.common.C2652bn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58710pc;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.j.j */
/* compiled from: PG */
public final /* synthetic */ class C3214j implements C3227w {

    /* renamed from: a */
    public final /* synthetic */ C3221q f9640a;

    /* renamed from: b */
    public final /* synthetic */ String f9641b;

    public /* synthetic */ C3214j(C3221q qVar, String str) {
        this.f9640a = qVar;
        this.f9641b = str;
    }

    /* renamed from: a */
    public final List mo7211a(int i, C2652bn bnVar, int[] iArr) {
        C3221q qVar = this.f9640a;
        String str = this.f9641b;
        C58710pc pcVar = C3195ab.f9596a;
        C58480gp e = C58485gu.m89837e();
        for (int i2 = 0; i2 < bnVar.f7354a; i2++) {
            e.mo55395g(new C3226v(i, bnVar, i2, qVar, iArr[i2], str));
        }
        return e.mo55394f();
    }
}
