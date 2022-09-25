package androidx.constraintlayout.p079a.p082b.p083a;

import androidx.constraintlayout.p079a.C1649d;
import androidx.constraintlayout.p079a.p082b.C1634b;
import androidx.constraintlayout.p079a.p082b.C1638f;
import androidx.constraintlayout.p079a.p082b.C1639g;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.a.b.a.q */
/* compiled from: PG */
public final class C1632q {

    /* renamed from: a */
    static int f4531a;

    /* renamed from: b */
    final ArrayList f4532b = new ArrayList();

    /* renamed from: c */
    final int f4533c;

    /* renamed from: d */
    public int f4534d;

    /* renamed from: e */
    ArrayList f4535e = null;

    /* renamed from: f */
    private int f4536f = -1;

    public C1632q(int i) {
        int i2 = f4531a;
        f4531a = i2 + 1;
        this.f4533c = i2;
        this.f4534d = i;
    }

    /* renamed from: a */
    public final int mo4592a(C1649d dVar, int i) {
        int i2;
        int i3;
        if (this.f4532b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.f4532b;
        C1639g gVar = (C1639g) ((C1638f) arrayList.get(0)).f4606Z;
        dVar.mo4682j();
        gVar.mo4560b(dVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((C1638f) arrayList.get(i4)).mo4560b(dVar, false);
        }
        if (i == 0 && gVar.f4675aQ > 0) {
            C1634b.m4389a(gVar, dVar, arrayList, 0);
        }
        if (i == 1 && gVar.f4676aR > 0) {
            C1634b.m4389a(gVar, dVar, arrayList, 1);
        }
        try {
            dVar.mo4681i();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f4535e = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.f4535e.add(new C1631p((C1638f) arrayList.get(i5)));
        }
        if (i == 0) {
            i2 = C1649d.m4494n(gVar.f4594N);
            i3 = C1649d.m4494n(gVar.f4596P);
            dVar.mo4682j();
        } else {
            i2 = C1649d.m4494n(gVar.f4595O);
            i3 = C1649d.m4494n(gVar.f4597Q);
            dVar.mo4682j();
        }
        return i3 - i2;
    }

    /* renamed from: b */
    public final void mo4593b(ArrayList arrayList) {
        int size = this.f4532b.size();
        if (this.f4536f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1632q qVar = (C1632q) arrayList.get(i);
                if (this.f4536f == qVar.f4533c) {
                    mo4594c(this.f4534d, qVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public final void mo4594c(int i, C1632q qVar) {
        ArrayList arrayList = this.f4532b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1638f fVar = (C1638f) arrayList.get(i2);
            qVar.mo4595d(fVar);
            if (i == 0) {
                fVar.f4619aL = qVar.f4533c;
            } else {
                fVar.f4620aM = qVar.f4533c;
            }
        }
        this.f4536f = qVar.f4533c;
    }

    /* renamed from: d */
    public final boolean mo4595d(C1638f fVar) {
        if (this.f4532b.contains(fVar)) {
            return false;
        }
        this.f4532b.add(fVar);
        return true;
    }

    public final String toString() {
        int i = this.f4534d;
        String str = i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both";
        String str2 = str + " [" + this.f4533c + "] <";
        ArrayList arrayList = this.f4532b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            str2 = str2 + " " + ((C1638f) arrayList.get(i2)).f4638ar;
        }
        return str2.concat(" >");
    }
}
