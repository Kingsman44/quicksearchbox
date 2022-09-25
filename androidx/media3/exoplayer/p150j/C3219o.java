package androidx.media3.exoplayer.p150j;

import androidx.media3.common.C2680x;
import com.google.common.p4522b.C58391dh;
import com.google.common.p4575r.C60745b;

/* renamed from: androidx.media3.exoplayer.j.o */
/* compiled from: PG */
public final class C3219o implements Comparable {

    /* renamed from: a */
    private final boolean f9663a;

    /* renamed from: b */
    private final boolean f9664b;

    public C3219o(C2680x xVar, int i) {
        this.f9663a = 1 != (xVar.f7488f & 1) ? false : true;
        this.f9664b = C3195ab.m9359f(i, false);
    }

    /* renamed from: a */
    public final int compareTo(C3219o oVar) {
        return C58391dh.m89477g(C60745b.m92716a(this.f9664b, oVar.f9664b)).mo55138e(this.f9663a, oVar.f9663a).mo55134a();
    }
}
