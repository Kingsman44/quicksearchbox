package android.support.constraint.p029a.p030a;

import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.g */
/* compiled from: PG */
public final class C0137g {

    /* renamed from: a */
    public int f496a;

    /* renamed from: b */
    public int f497b;

    /* renamed from: c */
    public int f498c;

    /* renamed from: d */
    public int f499d;

    /* renamed from: e */
    public ArrayList f500e = new ArrayList();

    public C0137g(C0133c cVar) {
        this.f496a = cVar.f468w;
        this.f497b = cVar.f469x;
        this.f498c = cVar.mo132d();
        this.f499d = cVar.mo129a();
        ArrayList arrayList = cVar.f462q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f500e.add(new C0136f((C0132b) arrayList.get(i)));
        }
    }
}
