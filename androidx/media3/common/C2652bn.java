package androidx.media3.common;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2633u;
import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: androidx.media3.common.bn */
/* compiled from: PG */
public final class C2652bn implements C2668l {

    /* renamed from: a */
    public final int f7354a;

    /* renamed from: b */
    public final String f7355b;

    /* renamed from: c */
    public final int f7356c;

    /* renamed from: d */
    public final C2680x[] f7357d;

    /* renamed from: e */
    private int f7358e;

    public C2652bn(String str, C2680x... xVarArr) {
        int length = xVarArr.length;
        int i = 1;
        C2601a.m6830b(length > 0);
        this.f7355b = str;
        this.f7357d = xVarArr;
        this.f7354a = length;
        int b = C2598ay.m6803b(xVarArr[0].f7496n);
        this.f7356c = b == -1 ? C2598ay.m6803b(xVarArr[0].f7495m) : b;
        String b2 = m7187b(xVarArr[0].f7487e);
        int i2 = xVarArr[0].f7489g | 16384;
        while (true) {
            C2680x[] xVarArr2 = this.f7357d;
            if (i >= xVarArr2.length) {
                return;
            }
            if (!b2.equals(m7187b(xVarArr2[i].f7487e))) {
                C2680x[] xVarArr3 = this.f7357d;
                m7188c("languages", xVarArr3[0].f7487e, xVarArr3[i].f7487e, i);
                return;
            }
            C2680x[] xVarArr4 = this.f7357d;
            if (i2 != (xVarArr4[i].f7489g | 16384)) {
                m7188c("role flags", Integer.toBinaryString(xVarArr4[0].f7489g), Integer.toBinaryString(this.f7357d[i].f7489g), i);
                return;
            }
            i++;
        }
    }

    /* renamed from: b */
    private static String m7187b(String str) {
        return (str == null || str.equals("und")) ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: c */
    private static void m7188c(String str, String str2, String str3, int i) {
        C2633u.m7048c("TrackGroup", C2633u.m7046a(BuildConfig.FLAVOR, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")")));
    }

    /* renamed from: a */
    public final int mo6305a(C2680x xVar) {
        int i = 0;
        while (true) {
            C2680x[] xVarArr = this.f7357d;
            if (i >= xVarArr.length) {
                return -1;
            }
            if (xVar == xVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2652bn bnVar = (C2652bn) obj;
            return this.f7355b.equals(bnVar.f7355b) && Arrays.equals(this.f7357d, bnVar.f7357d);
        }
    }

    public final int hashCode() {
        int i = this.f7358e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.f7355b.hashCode() + 527) * 31) + Arrays.hashCode(this.f7357d);
        this.f7358e = hashCode;
        return hashCode;
    }
}
