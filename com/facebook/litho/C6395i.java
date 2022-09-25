package com.facebook.litho;

import com.facebook.litho.p323b.C6118b;
import com.facebook.yoga.C6565a;
import java.util.List;

/* renamed from: com.facebook.litho.i */
/* compiled from: PG */
public final class C6395i extends C6407q {

    /* renamed from: g */
    public static final /* synthetic */ int f18920g = 0;
    @C6118b

    /* renamed from: a */
    public List f18921a;
    @C6118b

    /* renamed from: b */
    public C6565a f18922b;
    @C6118b

    /* renamed from: c */
    public C6565a f18923c;
    @C6118b

    /* renamed from: d */
    public boolean f18924d;
    @C6118b

    /* renamed from: e */
    public int f18925e;
    @C6118b

    /* renamed from: f */
    public int f18926f;

    public C6395i() {
        super("Column");
    }

    /* renamed from: b */
    public static C6374h m17143b(C6411u uVar) {
        C6374h hVar = new C6374h();
        hVar.mo13389g(uVar, new C6395i());
        return hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C6407q mo12835c(C6411u uVar) {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C6181da mo12836d(C6411u uVar) {
        C6181da a = C6182db.m16301a(uVar);
        int i = 1;
        if (true == this.f18924d) {
            i = 2;
        }
        C6124be beVar = (C6124be) a;
        beVar.f18090a.mo13665P(i);
        C6565a aVar = this.f18923c;
        if (aVar != null) {
            beVar.f18090a.mo13697q(aVar);
        }
        C6565a aVar2 = this.f18922b;
        if (aVar2 != null) {
            beVar.f18090a.mo13696p(aVar2);
        }
        int i2 = this.f18925e;
        if (i2 != 0) {
            beVar.f18090a.mo13662M(i2);
        }
        int i3 = this.f18926f;
        if (i3 != 0) {
            beVar.f18090a.mo13664O(i3);
        }
        List<C6407q> list = this.f18921a;
        if (list != null) {
            for (C6407q qVar : list) {
                if (uVar.mo13474l()) {
                    a.mo12920aS(qVar);
                } else {
                    a.mo12955bA(qVar);
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo13269e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C6395i iVar = (C6395i) qVar;
        if (this.f18989l == iVar.f18989l) {
            return true;
        }
        List list = this.f18921a;
        if (list != null) {
            if (iVar.f18921a == null || list.size() != iVar.f18921a.size()) {
                return false;
            }
            int size = this.f18921a.size();
            for (int i = 0; i < size; i++) {
                if (!((C6407q) this.f18921a.get(i)).mo13057a((C6407q) iVar.f18921a.get(i))) {
                    return false;
                }
            }
        } else if (iVar.f18921a != null) {
            return false;
        }
        C6565a aVar = this.f18923c;
        if (aVar == null ? iVar.f18923c != null : !aVar.equals(iVar.f18923c)) {
            return false;
        }
        C6565a aVar2 = this.f18922b;
        if (aVar2 == null ? iVar.f18922b != null : !aVar2.equals(iVar.f18922b)) {
            return false;
        }
        int i2 = this.f18925e;
        if (i2 == 0 ? iVar.f18925e == 0 : i2 == iVar.f18925e) {
            return this.f18924d == iVar.f18924d;
        }
        return false;
    }
}
