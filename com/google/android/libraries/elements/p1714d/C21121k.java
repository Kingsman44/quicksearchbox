package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6407q;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p329g.C6329h;
import com.facebook.litho.p329g.C6330i;
import com.facebook.litho.p329g.C6335n;
import com.facebook.litho.p329g.C6336o;
import com.facebook.litho.p329g.p330a.C6294i;
import com.facebook.litho.p329g.p330a.C6295j;
import com.google.android.libraries.elements.interfaces.C21239ai;
import com.google.android.libraries.elements.interfaces.C21249as;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68093o;
import com.youtube.p5283a.p5284a.C68094p;
import java.util.Iterator;
import java.util.List;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.libraries.elements.d.k */
/* compiled from: PG */
final class C21121k extends C6335n {
    @C6117a(mo12871a = 6)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: m */
    List f59212m;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: n */
    C68093o f59213n;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: o */
    C69802a f59214o;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: p */
    C21319z f59215p;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: q */
    C21239ai f59216q;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: r */
    C21249as f59217r;

    public C21121k() {
        super("CollectionSection");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13290f((C6335n) obj);
    }

    /* renamed from: f */
    public final boolean mo13290f(C6335n nVar) {
        if (this == nVar) {
            return true;
        }
        if (nVar == null || getClass() != nVar.getClass()) {
            return false;
        }
        C21121k kVar = (C21121k) nVar;
        List list = this.f59212m;
        if (list != null) {
            if (kVar.f59212m == null || list.size() != kVar.f59212m.size()) {
                return false;
            }
            Iterator it = this.f59212m.iterator();
            Iterator it2 = kVar.f59212m.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!((C6407q) it.next()).mo13057a((C6407q) it2.next())) {
                    return false;
                }
            }
        } else if (kVar.f59212m != null) {
            return false;
        }
        C68093o oVar = this.f59213n;
        if (oVar == null ? kVar.f59213n != null : !oVar.equals(kVar.f59213n)) {
            return false;
        }
        C69802a aVar = this.f59214o;
        if (aVar == null ? kVar.f59214o != null : !aVar.equals(kVar.f59214o)) {
            return false;
        }
        C21319z zVar = this.f59215p;
        if (zVar == null ? kVar.f59215p != null : !zVar.equals(kVar.f59215p)) {
            return false;
        }
        C21239ai aiVar = this.f59216q;
        if (aiVar == null ? kVar.f59216q != null : !aiVar.equals(kVar.f59216q)) {
            return false;
        }
        C21249as asVar = this.f59217r;
        return asVar == null ? kVar.f59217r == null : asVar.equals(kVar.f59217r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C6330i mo13352g(C6336o oVar) {
        C21319z zVar = this.f59215p;
        C21249as asVar = this.f59217r;
        C21239ai aiVar = this.f59216q;
        C69802a aVar = this.f59214o;
        C68093o oVar2 = this.f59213n;
        List<C6407q> list = this.f59212m;
        C6330i iVar = new C6330i();
        if (oVar2.mo60241h() > 0) {
            C68039ab abVar = new C68039ab();
            C68094p pVar = new C68094p();
            int i = 0;
            while (i < oVar2.mo60241h()) {
                int i2 = 4;
                int a = oVar2.mo16913a(4);
                if (a != 0) {
                    int b = oVar2.mo16914b(a) + (i * 4);
                    pVar.mo16917e(b + oVar2.f24704b.getInt(b), oVar2.f24704b);
                }
                int i3 = 0;
                while (true) {
                    int a2 = pVar.mo16913a(i2);
                    if (i3 >= (a2 != 0 ? pVar.mo16915c(a2) : 0)) {
                        break;
                    }
                    int a3 = pVar.mo16913a(i2);
                    if (a3 != 0) {
                        int b2 = pVar.mo16914b(a3) + (i3 * 4);
                        abVar.mo16917e(b2 + pVar.f24704b.getInt(b2), pVar.f24704b);
                    }
                    int i4 = i3;
                    int i5 = i;
                    C6407q a4 = asVar.mo26711a(oVar, zVar, abVar, aiVar, aVar);
                    if (a4 != null) {
                        C6294i s = C6295j.m16874s(oVar);
                        s.mo13296c(a4);
                        C6329h.m16982a(s, iVar);
                    }
                    i3 = i4 + 1;
                    i = i5;
                    i2 = 4;
                }
                i++;
            }
        } else if (list != null) {
            for (C6407q c : list) {
                C6294i s2 = C6295j.m16874s(oVar);
                s2.mo13296c(c);
                C6329h.m16982a(s2, iVar);
            }
        }
        return iVar;
    }
}
