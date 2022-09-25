package androidx.constraintlayout.p079a;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.i */
/* compiled from: PG */
public final class C1654i implements Comparable {

    /* renamed from: a */
    public static int f4787a = 1;

    /* renamed from: b */
    public boolean f4788b;

    /* renamed from: c */
    public int f4789c = -1;

    /* renamed from: d */
    int f4790d = -1;

    /* renamed from: e */
    public int f4791e = 0;

    /* renamed from: f */
    public float f4792f;

    /* renamed from: g */
    public boolean f4793g = false;

    /* renamed from: h */
    final float[] f4794h = new float[9];

    /* renamed from: i */
    final float[] f4795i = new float[9];

    /* renamed from: j */
    C1614b[] f4796j = new C1614b[16];

    /* renamed from: k */
    int f4797k = 0;

    /* renamed from: l */
    public int f4798l = 0;

    /* renamed from: m */
    boolean f4799m = false;

    /* renamed from: n */
    int f4800n;

    public C1654i(int i) {
        this.f4800n = i;
    }

    /* renamed from: a */
    public final void mo4693a(C1614b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f4797k;
            if (i >= i2) {
                C1614b[] bVarArr = this.f4796j;
                int length = bVarArr.length;
                if (i2 >= length) {
                    this.f4796j = (C1614b[]) Arrays.copyOf(bVarArr, length + length);
                }
                C1614b[] bVarArr2 = this.f4796j;
                int i3 = this.f4797k;
                bVarArr2[i3] = bVar;
                this.f4797k = i3 + 1;
                return;
            } else if (this.f4796j[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo4694b(C1614b bVar) {
        int i = this.f4797k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f4796j[i2] == bVar) {
                while (i2 < i - 1) {
                    C1614b[] bVarArr = this.f4796j;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f4797k--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo4695c() {
        this.f4800n = 5;
        this.f4791e = 0;
        this.f4789c = -1;
        this.f4790d = -1;
        this.f4792f = 0.0f;
        this.f4793g = false;
        this.f4799m = false;
        int i = this.f4797k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4796j[i2] = null;
        }
        this.f4797k = 0;
        this.f4798l = 0;
        this.f4788b = false;
        Arrays.fill(this.f4795i, 0.0f);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f4789c - ((C1654i) obj).f4789c;
    }

    /* renamed from: d */
    public final void mo4697d(C1649d dVar, float f) {
        this.f4792f = f;
        this.f4793g = true;
        this.f4799m = false;
        int i = this.f4797k;
        this.f4790d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4796j[i2].mo4549c(dVar, this, false);
        }
        this.f4797k = 0;
    }

    /* renamed from: e */
    public final void mo4698e(C1649d dVar, C1614b bVar) {
        int i = this.f4797k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4796j[i2].mo4550d(dVar, bVar, false);
        }
        this.f4797k = 0;
    }

    public final String toString() {
        int i = this.f4789c;
        return BuildConfig.FLAVOR + i;
    }
}
