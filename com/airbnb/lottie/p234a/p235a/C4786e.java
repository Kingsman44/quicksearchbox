package com.airbnb.lottie.p234a.p235a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.p234a.C4781a;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4821t;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.C4891f;
import com.airbnb.lottie.p238c.p239a.C4854l;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p246g.C4958c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.e */
/* compiled from: PG */
public final class C4786e implements C4787f, C4795n, C4802a, C4891f {

    /* renamed from: a */
    private final Matrix f15180a;

    /* renamed from: b */
    private final Path f15181b;

    /* renamed from: c */
    private final RectF f15182c;

    /* renamed from: d */
    private final String f15183d;

    /* renamed from: e */
    private final boolean f15184e;

    /* renamed from: f */
    private final List f15185f;

    /* renamed from: g */
    private final C4825ac f15186g;

    /* renamed from: h */
    private List f15187h;

    /* renamed from: i */
    private C4821t f15188i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4786e(com.airbnb.lottie.C4825ac r8, com.airbnb.lottie.p238c.p241c.C4878b r9, com.airbnb.lottie.p238c.p240b.C4870m r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f15513a
            boolean r4 = r10.f15515c
            java.util.List r0 = r10.f15514b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x0029
            java.lang.Object r6 = r0.get(r2)
            com.airbnb.lottie.c.b.b r6 = (com.airbnb.lottie.p238c.p240b.C4859b) r6
            com.airbnb.lottie.a.a.d r6 = r6.mo9801a(r8, r9)
            if (r6 == 0) goto L_0x0026
            r5.add(r6)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            java.util.List r10 = r10.f15514b
        L_0x002b:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r0 = r10.get(r1)
            com.airbnb.lottie.c.b.b r0 = (com.airbnb.lottie.p238c.p240b.C4859b) r0
            boolean r2 = r0 instanceof com.airbnb.lottie.p238c.p239a.C4854l
            if (r2 == 0) goto L_0x003f
            com.airbnb.lottie.c.a.l r0 = (com.airbnb.lottie.p238c.p239a.C4854l) r0
            r6 = r0
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0042:
            r10 = 0
            r6 = r10
        L_0x0044:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p234a.p235a.C4786e.<init>(com.airbnb.lottie.ac, com.airbnb.lottie.c.c.b, com.airbnb.lottie.c.b.m):void");
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        C4821t tVar = this.f15188i;
        if (tVar != null) {
            tVar.mo9754e(obj, cVar);
        }
    }

    /* renamed from: b */
    public final void mo9715b(Canvas canvas, Matrix matrix, int i) {
        int i2;
        if (!this.f15184e) {
            this.f15180a.set(matrix);
            C4821t tVar = this.f15188i;
            if (tVar != null) {
                this.f15180a.preConcat(tVar.mo9750a());
                C4807f fVar = this.f15188i.f15330e;
                if (fVar == null) {
                    i2 = 100;
                } else {
                    i2 = ((Integer) fVar.mo9738e()).intValue();
                }
                i = (int) ((((((float) i2) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            int size = this.f15185f.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Object obj = this.f15185f.get(size);
                    if (obj instanceof C4787f) {
                        ((C4787f) obj).mo9715b(canvas, this.f15180a, i);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo9716c(RectF rectF, Matrix matrix, boolean z) {
        this.f15180a.set(matrix);
        C4821t tVar = this.f15188i;
        if (tVar != null) {
            this.f15180a.preConcat(tVar.mo9750a());
        }
        this.f15182c.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f15185f.size();
        while (true) {
            size--;
            if (size >= 0) {
                C4785d dVar = (C4785d) this.f15185f.get(size);
                if (dVar instanceof C4787f) {
                    ((C4787f) dVar).mo9716c(this.f15182c, this.f15180a, z);
                    rectF.union(this.f15182c);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15186g.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        if (eVar.mo9826e(this.f15183d, i) || "__container".equals(this.f15183d)) {
            if (!"__container".equals(this.f15183d)) {
                eVar2 = eVar2.mo9823b(this.f15183d);
                if (eVar.mo9825d(this.f15183d, i)) {
                    list.add(eVar2.mo9824c(this));
                }
            }
            if (eVar.mo9827f(this.f15183d, i)) {
                int a = i + eVar.mo9822a(this.f15183d, i);
                for (int i2 = 0; i2 < this.f15185f.size(); i2++) {
                    C4785d dVar = (C4785d) this.f15185f.get(i2);
                    if (dVar instanceof C4891f) {
                        ((C4891f) dVar).mo9718e(eVar, a, list, eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f15185f.size());
        arrayList.addAll(list);
        int size = this.f15185f.size();
        while (true) {
            size--;
            if (size >= 0) {
                C4785d dVar = (C4785d) this.f15185f.get(size);
                dVar.mo9719f(arrayList, this.f15185f.subList(0, size));
                arrayList.add(dVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Matrix mo9723h() {
        C4821t tVar = this.f15188i;
        if (tVar != null) {
            return tVar.mo9750a();
        }
        this.f15180a.reset();
        return this.f15180a;
    }

    /* renamed from: i */
    public final Path mo9724i() {
        this.f15180a.reset();
        C4821t tVar = this.f15188i;
        if (tVar != null) {
            this.f15180a.set(tVar.mo9750a());
        }
        this.f15181b.reset();
        if (this.f15184e) {
            return this.f15181b;
        }
        int size = this.f15185f.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.f15181b;
            }
            C4785d dVar = (C4785d) this.f15185f.get(size);
            if (dVar instanceof C4795n) {
                this.f15181b.addPath(((C4795n) dVar).mo9724i(), this.f15180a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final List mo9725j() {
        if (this.f15187h == null) {
            this.f15187h = new ArrayList();
            for (int i = 0; i < this.f15185f.size(); i++) {
                C4785d dVar = (C4785d) this.f15185f.get(i);
                if (dVar instanceof C4795n) {
                    this.f15187h.add((C4795n) dVar);
                }
            }
        }
        return this.f15187h;
    }

    public C4786e(C4825ac acVar, C4878b bVar, String str, boolean z, List list, C4854l lVar) {
        new C4781a();
        new RectF();
        this.f15180a = new Matrix();
        this.f15181b = new Path();
        this.f15182c = new RectF();
        this.f15183d = str;
        this.f15186g = acVar;
        this.f15184e = z;
        this.f15185f = list;
        if (lVar != null) {
            C4821t tVar = new C4821t(lVar);
            this.f15188i = tVar;
            tVar.mo9752c(bVar);
            this.f15188i.mo9753d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C4785d dVar = (C4785d) list.get(size);
            if (dVar instanceof C4792k) {
                arrayList.add((C4792k) dVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((C4792k) arrayList.get(size2)).mo9726h(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
