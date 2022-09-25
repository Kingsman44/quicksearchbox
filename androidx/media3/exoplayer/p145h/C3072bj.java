package androidx.media3.exoplayer.p145h;

import androidx.media3.common.C2576ac;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2651bm;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;
import com.google.common.p4522b.C58672ns;
import com.google.common.p4522b.C58677nx;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: androidx.media3.exoplayer.h.bj */
/* compiled from: PG */
public final class C3072bj extends C3115j {

    /* renamed from: a */
    private static final C2590aq f8926a;

    /* renamed from: b */
    private final C3038au[] f8927b;

    /* renamed from: c */
    private final C2651bm[] f8928c;

    /* renamed from: d */
    private final ArrayList f8929d;

    /* renamed from: e */
    private int f8930e = -1;

    /* renamed from: f */
    private long[][] f8931f;

    /* renamed from: g */
    private C3071bi f8932g;

    static {
        C2576ac acVar = new C2576ac();
        acVar.f7103a = "MergingMediaSource";
        f8926a = acVar.mo6082a();
    }

    public C3072bj(C3038au... auVarArr) {
        this.f8927b = auVarArr;
        this.f8929d = new ArrayList(Arrays.asList(auVarArr));
        this.f8928c = new C2651bm[auVarArr.length];
        this.f8931f = new long[0][];
        new HashMap();
        new C58677nx(new C58672ns()).mo55746a();
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        C3038au[] auVarArr = this.f8927b;
        return auVarArr.length > 0 ? auVarArr[0].mo6745a() : f8926a;
    }

    /* renamed from: c */
    public final void mo6747c() {
        C3071bi biVar = this.f8932g;
        if (biVar == null) {
            super.mo6747c();
            return;
        }
        throw biVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C3036as mo6963d(Object obj, C3036as asVar) {
        if (((Integer) obj).intValue() == 0) {
            return asVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        super.mo6750f(anVar);
        int i = 0;
        while (true) {
            C3038au[] auVarArr = this.f8927b;
            if (i < auVarArr.length) {
                mo7104k(Integer.valueOf(i), auVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C3070bh bhVar = (C3070bh) aqVar;
        int i = 0;
        while (true) {
            C3038au[] auVarArr = this.f8927b;
            if (i < auVarArr.length) {
                C3038au auVar = auVarArr[i];
                C3034aq aqVar2 = bhVar.f8918a[i];
                if (aqVar2 instanceof C3068bf) {
                    aqVar2 = ((C3068bf) aqVar2).f8913a;
                }
                auVar.mo6752h(aqVar2);
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
        super.mo6753i();
        Arrays.fill(this.f8928c, (Object) null);
        this.f8930e = -1;
        this.f8932g = null;
        this.f8929d.clear();
        Collections.addAll(this.f8929d, this.f8927b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo6964j(Object obj, C3038au auVar, C2651bm bmVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.f8932g == null) {
            if (this.f8930e == -1) {
                i = bmVar.mo6021b();
                this.f8930e = i;
            } else {
                int b = bmVar.mo6021b();
                int i2 = this.f8930e;
                if (b == i2) {
                    i = i2;
                } else {
                    this.f8932g = new C3071bi();
                    return;
                }
            }
            if (this.f8931f.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.f8928c.length;
                iArr[0] = i;
                this.f8931f = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            this.f8929d.remove(auVar);
            this.f8928c[num.intValue()] = bmVar;
            if (this.f8929d.isEmpty()) {
                mo6952y(this.f8928c[0]);
            }
        }
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        int length = this.f8927b.length;
        C3034aq[] aqVarArr = new C3034aq[length];
        int a = this.f8928c[0].mo6020a(asVar.f7204a);
        for (int i = 0; i < length; i++) {
            aqVarArr[i] = this.f8927b[i].mo6757m(asVar.mo6972b(this.f8928c[i].mo6026f(a)), gVar, j - this.f8931f[a][i]);
        }
        return new C3070bh(this.f8931f[a], aqVarArr);
    }
}
