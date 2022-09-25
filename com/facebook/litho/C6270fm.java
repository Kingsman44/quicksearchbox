package com.facebook.litho;

import com.facebook.litho.p323b.C6118b;
import com.facebook.yoga.C6565a;
import java.util.List;

/* renamed from: com.facebook.litho.fm */
/* compiled from: PG */
public final class C6270fm extends C6407q {

    /* renamed from: g */
    public static final /* synthetic */ int f18514g = 0;
    @C6118b

    /* renamed from: a */
    public List f18515a;
    @C6118b

    /* renamed from: b */
    public C6565a f18516b;
    @C6118b

    /* renamed from: c */
    public C6565a f18517c;
    @C6118b

    /* renamed from: d */
    public boolean f18518d;
    @C6118b

    /* renamed from: e */
    public int f18519e;
    @C6118b

    /* renamed from: f */
    public int f18520f;

    public C6270fm() {
        super("Row");
    }

    /* renamed from: b */
    public static C6269fl m16828b(C6411u uVar) {
        C6269fl flVar = new C6269fl();
        flVar.mo13265g(uVar, new C6270fm());
        return flVar;
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
        C6124be beVar = (C6124be) a;
        beVar.f18090a.mo13665P(true != this.f18518d ? 3 : 4);
        C6565a aVar = this.f18517c;
        if (aVar != null) {
            beVar.f18090a.mo13697q(aVar);
        }
        C6565a aVar2 = this.f18516b;
        if (aVar2 != null) {
            beVar.f18090a.mo13696p(aVar2);
        }
        int i = this.f18519e;
        if (i != 0) {
            beVar.f18090a.mo13662M(i);
        }
        int i2 = this.f18520f;
        if (i2 != 0) {
            beVar.f18090a.mo13664O(i2);
        }
        List<C6407q> list = this.f18515a;
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
        C6270fm fmVar = (C6270fm) qVar;
        if (this.f18989l == fmVar.f18989l) {
            return true;
        }
        List list = this.f18515a;
        if (list != null) {
            if (fmVar.f18515a == null || list.size() != fmVar.f18515a.size()) {
                return false;
            }
            int size = this.f18515a.size();
            for (int i = 0; i < size; i++) {
                if (!((C6407q) this.f18515a.get(i)).mo13057a((C6407q) fmVar.f18515a.get(i))) {
                    return false;
                }
            }
        } else if (fmVar.f18515a != null) {
            return false;
        }
        C6565a aVar = this.f18517c;
        if (aVar == null ? fmVar.f18517c != null : !aVar.equals(fmVar.f18517c)) {
            return false;
        }
        C6565a aVar2 = this.f18516b;
        if (aVar2 == null ? fmVar.f18516b != null : !aVar2.equals(fmVar.f18516b)) {
            return false;
        }
        int i2 = this.f18519e;
        if (i2 == 0 ? fmVar.f18519e == 0 : i2 == fmVar.f18519e) {
            return this.f18518d == fmVar.f18518d;
        }
        return false;
    }
}
