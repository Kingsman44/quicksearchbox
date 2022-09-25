package com.facebook.litho;

import android.graphics.Rect;
import com.facebook.yoga.C6575k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.litho.au */
/* compiled from: PG */
public final class C6110au {

    /* renamed from: a */
    public static final Map f18040a = new HashMap();

    /* renamed from: b */
    public C6181da f18041b;

    /* renamed from: c */
    private int f18042c;

    private C6110au() {
    }

    /* renamed from: c */
    static synchronized C6110au m15897c(C6181da daVar, int i) {
        synchronized (C6110au.class) {
            C6110au auVar = new C6110au();
            C6411u aj = daVar.mo12937aj();
            if (i >= daVar.mo12915aN().size()) {
                return null;
            }
            C6407q qVar = (C6407q) daVar.mo12915aN().get(i);
            if (daVar.mo12914aM() != null) {
                String str = (String) daVar.mo12914aM().get(i);
            }
            m15900j(aj, C6103an.m15882i(qVar));
            auVar.f18041b = daVar;
            auVar.f18042c = i;
            daVar.mo12925aX(auVar);
            return auVar;
        }
    }

    /* renamed from: e */
    public static C6110au m15899e(LithoView lithoView) {
        return m15898d(lithoView.f17938n);
    }

    /* renamed from: j */
    public static String m15900j(C6411u uVar, String str) {
        int identityHashCode = System.identityHashCode(uVar.f19017j);
        return identityHashCode + str;
    }

    /* renamed from: m */
    static void m15901m(C6411u uVar, C6181da daVar) {
        if (daVar.mo12915aN() != null && !daVar.mo12915aN().isEmpty()) {
            C6407q qVar = (C6407q) daVar.mo12915aN().get(0);
            if (daVar.mo12914aM() != null) {
                String str = (String) daVar.mo12914aM().get(0);
            }
            C6109at atVar = (C6109at) f18040a.get(m15900j(uVar, C6103an.m15882i(qVar)));
            if (atVar != null) {
                atVar.mo12858b();
            }
        }
    }

    /* renamed from: o */
    private static int m15902o(C6181da daVar) {
        if (daVar == null) {
            return 0;
        }
        return daVar.mo12883I() + m15902o(m15904q(daVar));
    }

    /* renamed from: p */
    private static int m15903p(C6181da daVar) {
        if (daVar == null) {
            return 0;
        }
        return daVar.mo12884J() + m15903p(m15904q(daVar));
    }

    /* renamed from: q */
    private static C6181da m15904q(C6181da daVar) {
        C6181da aw = daVar.mo12950aw();
        return aw != null ? aw : daVar.mo12949av();
    }

    /* renamed from: a */
    public final Rect mo12860a() {
        if (this.f18042c == 0 && this.f18041b.mo12950aw() == null) {
            return new Rect(0, 0, this.f18041b.mo12882H(), this.f18041b.mo12901a());
        }
        int o = m15902o(this.f18041b);
        int p = m15903p(this.f18041b);
        return new Rect(o, p, this.f18041b.mo12882H() + o, this.f18041b.mo12901a() + p);
    }

    /* renamed from: b */
    public final C6407q mo12861b() {
        return (C6407q) this.f18041b.mo12915aN().get(this.f18042c);
    }

    /* renamed from: f */
    public final C6120ba mo12862f() {
        if (mo12868n()) {
            return new C6120ba(this.f18041b);
        }
        return null;
    }

    /* renamed from: g */
    public final LithoView mo12863g() {
        ComponentTree componentTree;
        C6411u aj = this.f18041b.mo12937aj();
        if (aj == null) {
            componentTree = null;
        } else {
            componentTree = aj.f19017j;
        }
        if (componentTree == null) {
            return null;
        }
        return componentTree.getLithoView();
    }

    /* renamed from: h */
    public final C6575k mo12864h() {
        return this.f18041b.mo12906aE();
    }

    /* renamed from: i */
    public final Object mo12865i() {
        C6402l lVar = ((C6407q) this.f18041b.mo12915aN().get(this.f18042c)).f19001x;
        if (lVar != null) {
            return lVar.f18972f;
        }
        return null;
    }

    /* renamed from: k */
    public final String mo12866k() {
        C6402l lVar = ((C6407q) this.f18041b.mo12915aN().get(this.f18042c)).f19001x;
        if (lVar == null || (lVar.f18967a & 2) == 0) {
            return null;
        }
        return lVar.f18971e;
    }

    /* renamed from: l */
    public final List mo12867l() {
        if (!mo12868n()) {
            C6110au c = m15897c(this.f18041b, this.f18042c - 1);
            if (c != null) {
                return Collections.singletonList(c);
            }
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int T = this.f18041b.mo12894T();
        for (int i = 0; i < T; i++) {
            C6181da at = this.f18041b.mo12947at(i);
            C6110au c2 = m15897c(at, Math.max(0, at.mo12915aN().size() - 1));
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        C6181da au = this.f18041b.mo12948au();
        if (au != null && au.mo12996bq()) {
            int T2 = au.mo12894T();
            for (int i2 = 0; i2 < T2; i2++) {
                C6181da at2 = au.mo12947at(i2);
                C6110au c3 = m15897c(at2, Math.max(0, at2.mo12915aN().size() - 1));
                if (c3 != null) {
                    arrayList.add(c3);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public final boolean mo12868n() {
        return this.f18042c == 0;
    }

    /* renamed from: d */
    public static C6110au m15898d(ComponentTree componentTree) {
        C6187dg dgVar = componentTree == null ? null : componentTree.f17871B;
        C6181da daVar = dgVar == null ? null : dgVar.f18310o;
        if (daVar == null || daVar == C6411u.f19008a) {
            return null;
        }
        return m15897c(daVar, Math.max(0, daVar.mo12915aN().size() - 1));
    }
}
