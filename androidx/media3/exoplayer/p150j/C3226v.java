package androidx.media3.exoplayer.p150j;

import androidx.media3.common.C2652bn;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58391dh;
import com.google.common.p4522b.C58393dj;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58739qe;
import com.google.common.p4575r.C60745b;
import java.util.Comparator;

/* renamed from: androidx.media3.exoplayer.j.v */
/* compiled from: PG */
final class C3226v extends C3228x implements Comparable {

    /* renamed from: e */
    private final int f9695e;

    /* renamed from: f */
    private final boolean f9696f;

    /* renamed from: g */
    private final boolean f9697g;

    /* renamed from: h */
    private final boolean f9698h;

    /* renamed from: i */
    private final int f9699i;

    /* renamed from: j */
    private final int f9700j;

    /* renamed from: k */
    private final int f9701k;

    /* renamed from: l */
    private final int f9702l;

    /* renamed from: m */
    private final boolean f9703m;

    public C3226v(int i, C2652bn bnVar, int i2, C3221q qVar, int i3, String str) {
        super(i, bnVar, i2);
        C58485gu guVar;
        int i4;
        int i5 = 0;
        this.f9696f = C3195ab.m9359f(i3, false);
        int i6 = this.f9707d.f7488f;
        int i7 = qVar.f7395u;
        this.f9697g = 1 == (i6 & 1);
        this.f9698h = (i6 & 2) != 0;
        if (qVar.f7393s.isEmpty()) {
            guVar = C58485gu.m89846n(BuildConfig.FLAVOR);
        } else {
            guVar = qVar.f7393s;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= ((C58724pq) guVar).f156474d) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = qVar.f7396v;
            i4 = C3195ab.m9356a(this.f9707d, (String) guVar.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.f9699i = i8;
        this.f9700j = i4;
        int b = C3195ab.m9357b(this.f9707d.f7489g, qVar.f7394t);
        this.f9701k = b;
        this.f9703m = (this.f9707d.f7489g & 1088) != 0;
        int a = C3195ab.m9356a(this.f9707d, str, C3195ab.m9358c(str) == null);
        this.f9702l = a;
        boolean z2 = i4 > 0 || (qVar.f7393s.isEmpty() && b > 0) || this.f9697g || (this.f9698h && a > 0);
        if (C3195ab.m9359f(i3, qVar.f9684L) && z2) {
            i5 = 1;
        }
        this.f9695e = i5;
    }

    /* renamed from: a */
    public final int compareTo(C3226v vVar) {
        Comparator comparator;
        C58393dj e = C58391dh.m89477g(C60745b.m92716a(this.f9696f, vVar.f9696f)).mo55137d(Integer.valueOf(this.f9699i), Integer.valueOf(vVar.f9699i), C58739qe.f156510a).mo55135b(this.f9700j, vVar.f9700j).mo55135b(this.f9701k, vVar.f9701k).mo55138e(this.f9697g, vVar.f9697g);
        Boolean valueOf = Boolean.valueOf(this.f9698h);
        Boolean valueOf2 = Boolean.valueOf(vVar.f9698h);
        if (this.f9700j == 0) {
            comparator = C58701ou.f156429a;
        } else {
            comparator = C58739qe.f156510a;
        }
        C58393dj b = e.mo55137d(valueOf, valueOf2, comparator).mo55135b(this.f9702l, vVar.f9702l);
        if (this.f9701k == 0) {
            b = b.mo55139f(this.f9703m, vVar.f9703m);
        }
        return b.mo55134a();
    }

    /* renamed from: b */
    public final int mo7202b() {
        return this.f9695e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo7203c(C3228x xVar) {
        C3226v vVar = (C3226v) xVar;
        return false;
    }
}
