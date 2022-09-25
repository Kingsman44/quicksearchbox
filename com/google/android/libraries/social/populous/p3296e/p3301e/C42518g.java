package com.google.android.libraries.social.populous.p3296e.p3301e;

import com.google.android.libraries.social.populous.p3296e.p3298b.C42403a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42416am;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58539iu;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58735qa;
import com.google.common.p4522b.C58800sl;
import com.google.p4420by.p4425c.p4426a.p4427a.C57872b;
import com.google.p4420by.p4425c.p4426a.p4427a.C57873c;

/* renamed from: com.google.android.libraries.social.populous.e.e.g */
/* compiled from: PG */
public class C42518g {

    /* renamed from: a */
    private final C42416am f111499a;

    /* renamed from: b */
    private final C42517f f111500b;

    protected C42518g(C42416am amVar, C42517f fVar) {
        this.f111499a = amVar;
        this.f111500b = fVar;
    }

    /* renamed from: c */
    public static final C58485gu m74966c(String str, boolean z) {
        if (z) {
            return C58485gu.m89846n(C57873c.m88544f(str));
        }
        return C57873c.m88541c(str);
    }

    /* renamed from: a */
    public final C58541iw mo45539a(String str) {
        C58528ij ijVar;
        if (C58837ba.m90859h(str)) {
            return C58735qa.f156506a;
        }
        C42416am amVar = this.f111499a;
        if (C58837ba.m90859h(str)) {
            ijVar = C58733pz.f156496a;
        } else {
            C58526ih C = C58528ij.m90003C(6);
            C.mo55373c(str);
            C42403a aVar = (C42403a) amVar;
            String b = aVar.mo45393b(str);
            if (!b.isEmpty()) {
                C.mo55373c(b);
            }
            String a = aVar.mo45392a(str);
            if (!a.isEmpty()) {
                C.mo55373c(a);
            }
            String a2 = aVar.mo45392a(b);
            if (!a2.isEmpty()) {
                C.mo55373c(a2);
            }
            String c = C42403a.m74667c(str);
            if (!c.isEmpty()) {
                C.mo55373c(c);
            }
            String a3 = aVar.mo45392a(c);
            if (!a3.isEmpty()) {
                C.mo55373c(a3);
            }
            ijVar = C.mo55486f();
        }
        C58539iu iuVar = new C58539iu(C57872b.f154596b);
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            iuVar.mo55535n(C57873c.m88539a((String) lA.next()));
        }
        return iuVar.mo55486f();
    }

    /* renamed from: b */
    public final boolean mo45540b(C57872b bVar, C57872b bVar2, boolean z) {
        if (bVar.f154597c.equals(bVar2.f154597c)) {
            return true;
        }
        boolean b = this.f111500b.mo45538b(bVar.f154597c, bVar2.f154597c);
        if (!z) {
            return b;
        }
        if (!b || !this.f111500b.mo45538b(bVar2.f154597c, bVar.f154597c)) {
            return false;
        }
        return true;
    }
}
