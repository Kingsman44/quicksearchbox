package com.airbnb.lottie.p234a.p235a;

import android.graphics.Path;
import com.airbnb.lottie.p238c.p240b.C4864g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.m */
/* compiled from: PG */
public final class C4794m implements C4795n, C4792k {

    /* renamed from: a */
    private final Path f15236a = new Path();

    /* renamed from: b */
    private final Path f15237b = new Path();

    /* renamed from: c */
    private final Path f15238c = new Path();

    /* renamed from: d */
    private final List f15239d = new ArrayList();

    /* renamed from: e */
    private final C4864g f15240e;

    public C4794m(C4864g gVar) {
        this.f15240e = gVar;
    }

    /* renamed from: a */
    private final void m13359a(Path.Op op) {
        this.f15237b.reset();
        this.f15236a.reset();
        int size = this.f15239d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            C4795n nVar = (C4795n) this.f15239d.get(size);
            if (nVar instanceof C4786e) {
                C4786e eVar = (C4786e) nVar;
                List j = eVar.mo9725j();
                int size2 = j.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    Path i = ((C4795n) j.get(size2)).mo9724i();
                    i.transform(eVar.mo9723h());
                    this.f15237b.addPath(i);
                }
            } else {
                this.f15237b.addPath(nVar.mo9724i());
            }
        }
        C4795n nVar2 = (C4795n) this.f15239d.get(0);
        if (nVar2 instanceof C4786e) {
            C4786e eVar2 = (C4786e) nVar2;
            List j2 = eVar2.mo9725j();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                Path i3 = ((C4795n) j2.get(i2)).mo9724i();
                i3.transform(eVar2.mo9723h());
                this.f15236a.addPath(i3);
            }
        } else {
            this.f15236a.set(nVar2.mo9724i());
        }
        this.f15238c.op(this.f15236a, this.f15237b, op);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        for (int i = 0; i < this.f15239d.size(); i++) {
            ((C4795n) this.f15239d.get(i)).mo9719f(list, list2);
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000b, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9726h(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 != 0) goto L_0x0007
            goto L_0x000e
        L_0x0007:
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000e
            goto L_0x0000
        L_0x000e:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r3.previous()
            com.airbnb.lottie.a.a.d r0 = (com.airbnb.lottie.p234a.p235a.C4785d) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.p234a.p235a.C4795n
            if (r1 == 0) goto L_0x000e
            java.util.List r1 = r2.f15239d
            com.airbnb.lottie.a.a.n r0 = (com.airbnb.lottie.p234a.p235a.C4795n) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000e
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p234a.p235a.C4794m.mo9726h(java.util.ListIterator):void");
    }

    /* renamed from: i */
    public final Path mo9724i() {
        this.f15238c.reset();
        C4864g gVar = this.f15240e;
        if (gVar.f15482a) {
            return this.f15238c;
        }
        int i = gVar.f15483b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                for (int i3 = 0; i3 < this.f15239d.size(); i3++) {
                    this.f15238c.addPath(((C4795n) this.f15239d.get(i3)).mo9724i());
                }
            } else if (i2 == 1) {
                m13359a(Path.Op.UNION);
            } else if (i2 == 2) {
                m13359a(Path.Op.REVERSE_DIFFERENCE);
            } else if (i2 == 3) {
                m13359a(Path.Op.INTERSECT);
            } else if (i2 == 4) {
                m13359a(Path.Op.XOR);
            }
            return this.f15238c;
        }
        throw null;
    }
}
