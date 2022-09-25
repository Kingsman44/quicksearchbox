package androidx.media3.exoplayer.p150j;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.C2655bq;
import androidx.media3.common.C2668l;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3107cr;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.j.q */
/* compiled from: PG */
public final class C3221q extends C2655bq implements C2668l {

    /* renamed from: A */
    public static final C3221q f9673A = new C3221q(new C3220p());

    /* renamed from: B */
    public final boolean f9674B;

    /* renamed from: C */
    public final boolean f9675C = false;

    /* renamed from: D */
    public final boolean f9676D;

    /* renamed from: E */
    public final boolean f9677E;

    /* renamed from: F */
    public final boolean f9678F;

    /* renamed from: G */
    public final boolean f9679G;

    /* renamed from: H */
    public final boolean f9680H;

    /* renamed from: I */
    public final boolean f9681I;

    /* renamed from: J */
    public final boolean f9682J;

    /* renamed from: K */
    public final boolean f9683K;

    /* renamed from: L */
    public final boolean f9684L;

    /* renamed from: M */
    public final boolean f9685M;

    /* renamed from: N */
    public final boolean f9686N;

    /* renamed from: O */
    public final SparseArray f9687O;

    /* renamed from: P */
    public final SparseBooleanArray f9688P;

    public C3221q(C3220p pVar) {
        super(pVar);
        this.f9674B = pVar.f9665q;
        this.f9676D = pVar.f9666r;
        this.f9677E = false;
        this.f9678F = pVar.f9667s;
        this.f9679G = false;
        this.f9680H = false;
        this.f9681I = false;
        this.f9682J = false;
        this.f9683K = pVar.f9668t;
        this.f9684L = pVar.f9669u;
        this.f9685M = false;
        this.f9686N = pVar.f9670v;
        this.f9687O = pVar.f9671w;
        this.f9688P = pVar.f9672x;
    }

    /* renamed from: a */
    public static C3221q m9426a(Context context) {
        return new C3221q(new C3220p(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3221q qVar = (C3221q) obj;
            if (super.equals(qVar) && this.f9674B == qVar.f9674B && this.f9676D == qVar.f9676D && this.f9678F == qVar.f9678F && this.f9683K == qVar.f9683K && this.f9684L == qVar.f9684L && this.f9686N == qVar.f9686N) {
                SparseBooleanArray sparseBooleanArray = this.f9688P;
                SparseBooleanArray sparseBooleanArray2 = qVar.f9688P;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f9687O;
                            SparseArray sparseArray2 = qVar.f9687O;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                C3107cr crVar = (C3107cr) entry.getKey();
                                                if (map2.containsKey(crVar)) {
                                                    if (!C2612ak.m6951aa(entry.getValue(), map2.get(crVar))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.f9674B ? 1 : 0)) * 961) + (this.f9676D ? 1 : 0)) * 961) + (this.f9678F ? 1 : 0)) * 28629151) + (this.f9683K ? 1 : 0)) * 31) + (this.f9684L ? 1 : 0)) * 961) + (this.f9686N ? 1 : 0);
    }
}
