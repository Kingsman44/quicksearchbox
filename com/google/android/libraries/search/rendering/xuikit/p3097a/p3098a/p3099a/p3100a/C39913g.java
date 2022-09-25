package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3100a;

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
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.a.g */
/* compiled from: PG */
public final class C39913g extends C6335n {
    @C6117a(mo12871a = 6)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: m */
    List f104934m;

    public C39913g() {
        super("StaggeredGridSection");
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
        C39913g gVar = (C39913g) nVar;
        List list = this.f104934m;
        if (list != null) {
            if (gVar.f104934m == null || list.size() != gVar.f104934m.size()) {
                return false;
            }
            Iterator it = this.f104934m.iterator();
            Iterator it2 = gVar.f104934m.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!((C6407q) it.next()).mo13057a((C6407q) it2.next())) {
                    return false;
                }
            }
        } else if (gVar.f104934m != null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C6330i mo13352g(C6336o oVar) {
        List<C6407q> list = this.f104934m;
        C6330i iVar = new C6330i();
        if (list != null) {
            for (C6407q c : list) {
                C6294i s = C6295j.m16874s(oVar);
                s.mo13296c(c);
                C6329h.m16982a(s, iVar);
            }
        }
        return iVar;
    }
}
