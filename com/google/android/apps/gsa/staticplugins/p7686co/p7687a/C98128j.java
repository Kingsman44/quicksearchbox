package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.p489g.C9136d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C8144xd;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.j */
/* compiled from: PG */
final class C98128j extends C98045a {

    /* renamed from: a */
    public final C58480gp f274023a;

    /* renamed from: b */
    public int f274024b = 0;

    /* renamed from: c */
    public int f274025c = 0;

    /* renamed from: d */
    private final Map f274026d;

    /* renamed from: e */
    private final C58485gu f274027e;

    /* renamed from: f */
    private final int f274028f;

    public C98128j(int i, Map map, C58485gu guVar) {
        this.f274028f = i;
        this.f274026d = map;
        this.f274027e = guVar;
        this.f274023a = C58485gu.m89837e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77745a(C7718hj hjVar) {
        int a;
        int i = this.f274028f;
        if ((i <= 0 || this.f274025c < i) && !hjVar.f26946R && (a = C8144xd.m22956a(hjVar.f26929A)) != 0 && a == 2) {
            C58485gu guVar = this.f274027e;
            C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
            if (a2 == null) {
                a2 = C7746ik.UNKNOWN;
            }
            if (!guVar.contains(Integer.valueOf(a2.f27108J)) && (hjVar.f26955a & 4) != 0) {
                this.f274025c++;
                if (hjVar.f26949U) {
                    this.f274024b++;
                    Map map = this.f274026d;
                    C7669fo foVar = hjVar.f26968i;
                    if (foVar == null) {
                        foVar = C7669fo.f26633e;
                    }
                    if (((C9136d) map.get(foVar)) == null) {
                        C58480gp gpVar = this.f274023a;
                        C7669fo foVar2 = hjVar.f26968i;
                        if (foVar2 == null) {
                            foVar2 = C7669fo.f26633e;
                        }
                        gpVar.mo55395g(foVar2);
                    }
                }
            }
        }
    }
}
