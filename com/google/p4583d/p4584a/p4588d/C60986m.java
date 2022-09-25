package com.google.p4583d.p4584a.p4588d;

import com.google.p4583d.p4584a.C61012g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.d.a.d.m */
/* compiled from: PG */
public final class C60986m extends C60980g implements C60983j {

    /* renamed from: a */
    protected final List f165111a;

    /* renamed from: b */
    protected final List f165112b;

    /* renamed from: c */
    protected C61012g f165113c;

    private C60986m(C60986m mVar) {
        super(mVar.f165107d);
        ArrayList arrayList = new ArrayList(mVar.f165111a.size());
        this.f165111a = arrayList;
        arrayList.addAll(mVar.f165111a);
        ArrayList arrayList2 = new ArrayList(mVar.f165112b.size());
        this.f165112b = arrayList2;
        arrayList2.addAll(mVar.f165112b);
        this.f165113c = mVar.f165113c;
    }

    /* renamed from: a */
    public final C60987n mo57451a(C61012g gVar, List list) {
        C61012g a = this.f165113c.mo57525a();
        for (int i = 0; i < this.f165111a.size(); i++) {
            if (i < list.size()) {
                a.mo57528d((String) this.f165111a.get(i), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(i)));
            } else {
                a.mo57528d((String) this.f165111a.get(i), f165114f);
            }
        }
        for (C60987n nVar : this.f165112b) {
            C60987n a2 = a.f165215b.mo57519a(a, nVar);
            if (a2 instanceof C60988o) {
                a2 = a.f165215b.mo57519a(a, nVar);
            }
            if (a2 instanceof C60978e) {
                return ((C60978e) a2).f165104a;
            }
        }
        return C60987n.f165114f;
    }

    /* renamed from: d */
    public final C60987n mo57468d() {
        return new C60986m(this);
    }

    public C60986m(String str, List list, List list2, C61012g gVar) {
        super(str);
        this.f165111a = new ArrayList();
        this.f165113c = gVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f165111a.add(((C60987n) it.next()).mo57475i());
            }
        }
        this.f165112b = new ArrayList(list2);
    }
}
