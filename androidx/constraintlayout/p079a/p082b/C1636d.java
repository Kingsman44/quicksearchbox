package androidx.constraintlayout.p079a.p082b;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.constraintlayout.p079a.C1654i;
import androidx.constraintlayout.p079a.p082b.p083a.C1625j;
import androidx.constraintlayout.p079a.p082b.p083a.C1632q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.a.b.d */
/* compiled from: PG */
public final class C1636d {

    /* renamed from: a */
    public HashSet f4567a = null;

    /* renamed from: b */
    public int f4568b;

    /* renamed from: c */
    public boolean f4569c;

    /* renamed from: d */
    public final C1638f f4570d;

    /* renamed from: e */
    public C1636d f4571e;

    /* renamed from: f */
    public int f4572f = 0;

    /* renamed from: g */
    int f4573g = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: h */
    public C1654i f4574h;

    /* renamed from: i */
    public final int f4575i;

    public C1636d(C1638f fVar, int i) {
        this.f4570d = fVar;
        this.f4575i = i;
    }

    /* renamed from: a */
    public final int mo4600a() {
        if (!this.f4569c) {
            return 0;
        }
        return this.f4568b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r2 = r3.f4571e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4601b() {
        /*
            r3 = this;
            androidx.constraintlayout.a.b.f r0 = r3.f4570d
            int r0 = r0.f4637aq
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            int r0 = r3.f4573g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x001b
            androidx.constraintlayout.a.b.d r2 = r3.f4571e
            if (r2 == 0) goto L_0x001b
            androidx.constraintlayout.a.b.f r2 = r2.f4570d
            int r2 = r2.f4637aq
            if (r2 != r1) goto L_0x001b
            return r0
        L_0x001b:
            int r0 = r3.f4572f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.C1636d.mo4601b():int");
    }

    /* renamed from: c */
    public final C1636d mo4602c() {
        int i = this.f4575i - 1;
        if (i == 1) {
            return this.f4570d.f4596P;
        }
        if (i == 2) {
            return this.f4570d.f4597Q;
        }
        if (i == 3) {
            return this.f4570d.f4594N;
        }
        if (i != 4) {
            return null;
        }
        return this.f4570d.f4595O;
    }

    /* renamed from: d */
    public final void mo4603d(int i, ArrayList arrayList, C1632q qVar) {
        HashSet hashSet = this.f4567a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1625j.m4343a(((C1636d) it.next()).f4570d, i, arrayList, qVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo4604e() {
        HashSet hashSet;
        C1636d dVar = this.f4571e;
        if (!(dVar == null || (hashSet = dVar.f4567a) == null)) {
            hashSet.remove(this);
            if (this.f4571e.f4567a.size() == 0) {
                this.f4571e.f4567a = null;
            }
        }
        this.f4567a = null;
        this.f4571e = null;
        this.f4572f = 0;
        this.f4573g = LinearLayoutManager.INVALID_OFFSET;
        this.f4569c = false;
        this.f4568b = 0;
    }

    /* renamed from: f */
    public final void mo4605f(int i) {
        this.f4568b = i;
        this.f4569c = true;
    }

    /* renamed from: g */
    public final void mo4606g(int i) {
        if (mo4609j()) {
            this.f4573g = i;
        }
    }

    /* renamed from: h */
    public final boolean mo4607h() {
        HashSet hashSet = this.f4567a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1636d) it.next()).mo4602c().mo4609j()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo4608i() {
        HashSet hashSet = this.f4567a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: j */
    public final boolean mo4609j() {
        return this.f4571e != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0065  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4610k(androidx.constraintlayout.p079a.p082b.C1636d r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r10.f4575i
            int r2 = r9.f4575i
            r3 = 6
            r4 = 1
            if (r1 != r2) goto L_0x001c
            if (r2 != r3) goto L_0x001b
            androidx.constraintlayout.a.b.f r10 = r10.f4570d
            boolean r10 = r10.f4589I
            if (r10 == 0) goto L_0x001a
            androidx.constraintlayout.a.b.f r10 = r9.f4570d
            boolean r10 = r10.f4589I
            if (r10 != 0) goto L_0x001b
        L_0x001a:
            return r0
        L_0x001b:
            return r4
        L_0x001c:
            int r2 = r2 + -1
            r5 = 9
            r6 = 8
            r7 = 2
            r8 = 4
            switch(r2) {
                case 1: goto L_0x0050;
                case 2: goto L_0x0037;
                case 3: goto L_0x0050;
                case 4: goto L_0x0037;
                case 5: goto L_0x0030;
                case 6: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            return r0
        L_0x0028:
            if (r1 == r3) goto L_0x002f
            if (r1 == r6) goto L_0x002f
            if (r1 == r5) goto L_0x002f
            return r4
        L_0x002f:
            return r0
        L_0x0030:
            if (r1 == r7) goto L_0x0036
            if (r1 != r8) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            return r4
        L_0x0036:
            return r0
        L_0x0037:
            r2 = 3
            if (r1 == r2) goto L_0x0041
            r2 = 5
            if (r1 != r2) goto L_0x003f
            r1 = 5
            goto L_0x0041
        L_0x003f:
            r2 = 0
            goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            androidx.constraintlayout.a.b.f r10 = r10.f4570d
            boolean r10 = r10 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r10 == 0) goto L_0x004e
            if (r2 != 0) goto L_0x004c
            if (r1 != r5) goto L_0x004f
        L_0x004c:
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            return r0
        L_0x0050:
            if (r1 == r7) goto L_0x0058
            if (r1 != r8) goto L_0x0056
            r1 = 4
            goto L_0x0058
        L_0x0056:
            r2 = 0
            goto L_0x0059
        L_0x0058:
            r2 = 1
        L_0x0059:
            androidx.constraintlayout.a.b.f r10 = r10.f4570d
            boolean r10 = r10 instanceof androidx.constraintlayout.p079a.p082b.C1642j
            if (r10 == 0) goto L_0x0065
            if (r2 != 0) goto L_0x0063
            if (r1 != r6) goto L_0x0066
        L_0x0063:
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = r2
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p082b.C1636d.mo4610k(androidx.constraintlayout.a.b.d):boolean");
    }

    /* renamed from: l */
    public final void mo4611l(C1636d dVar, int i) {
        mo4613n(dVar, i, LinearLayoutManager.INVALID_OFFSET, false);
    }

    /* renamed from: m */
    public final void mo4612m() {
        C1654i iVar = this.f4574h;
        if (iVar == null) {
            this.f4574h = new C1654i(1);
        } else {
            iVar.mo4695c();
        }
    }

    /* renamed from: n */
    public final void mo4613n(C1636d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo4604e();
        } else if (z || mo4610k(dVar)) {
            this.f4571e = dVar;
            if (dVar.f4567a == null) {
                dVar.f4567a = new HashSet();
            }
            HashSet hashSet = this.f4571e.f4567a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f4572f = i;
            this.f4573g = i2;
        }
    }

    public final String toString() {
        String str;
        String str2 = this.f4570d.f4638ar;
        switch (this.f4575i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        return str2 + ":" + str;
    }
}
