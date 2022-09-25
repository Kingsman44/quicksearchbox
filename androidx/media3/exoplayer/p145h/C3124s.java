package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2590aq;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: androidx.media3.exoplayer.h.s */
/* compiled from: PG */
public final class C3124s {

    /* renamed from: a */
    public final C58480gp f9153a = C58485gu.m89837e();

    /* renamed from: b */
    public int f9154b;

    /* renamed from: c */
    public C2590aq f9155c;

    /* renamed from: d */
    public C3035ar f9156d;

    /* renamed from: a */
    public final void mo7109a(C2590aq aqVar) {
        C2601a.m6835g(this.f9156d, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
        C3038au b = this.f9156d.mo6760b(aqVar);
        b.getClass();
        C58480gp gpVar = this.f9153a;
        int i = this.f9154b;
        this.f9154b = i + 1;
        gpVar.mo55395g(new C3126u(b, i, C2612ak.m6998w(5000)));
    }
}
