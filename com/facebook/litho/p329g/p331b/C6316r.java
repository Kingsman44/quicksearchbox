package com.facebook.litho.p329g.p331b;

import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.C0710hr;
import android.support.p033v7.widget.LinearLayoutManager;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6190dj;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6348ga;
import com.facebook.litho.C6374h;
import com.facebook.litho.C6393hr;
import com.facebook.litho.C6394hs;
import com.facebook.litho.C6395i;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.litho.p329g.C6335n;
import com.facebook.litho.p329g.C6336o;
import com.facebook.litho.p329g.C6341t;
import com.facebook.litho.p329g.C6346y;
import com.facebook.litho.widget.C6427am;
import com.facebook.litho.widget.C6433as;
import com.facebook.litho.widget.C6439ay;
import com.facebook.litho.widget.C6442ba;
import com.facebook.litho.widget.C6465bx;
import com.facebook.litho.widget.C6468c;
import com.facebook.litho.widget.C6474cf;
import com.facebook.litho.widget.C6549n;
import com.facebook.yoga.C6565a;
import com.google.android.libraries.elements.p1708c.p1710b.C20747a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.litho.g.b.r */
/* compiled from: PG */
public final class C6316r {

    /* renamed from: a */
    public static final C6319u f18687a = new C6304f(1, LinearLayoutManager.INVALID_OFFSET, C6302d.f18599a, C6302d.f18600d);

    /* renamed from: b */
    public static final C0646fh f18688b = new C6305g();

    /* renamed from: a */
    static void m16935a(C6281fx fxVar, C6313o oVar) {
        fxVar.f18496a = oVar;
    }

    /* renamed from: b */
    static void m16936b(C6411u uVar, C6281fx fxVar, C6281fx fxVar2, C6281fx fxVar3, C6281fx fxVar4, C6281fx fxVar5, C6281fx fxVar6, C6281fx fxVar7, @C6118b C6335n nVar, @C6118b C6319u uVar2, @C6118b C6317s sVar, @C6118b boolean z, @C6118b boolean z2) {
        C6308j d = uVar2.mo13306d();
        C6427am e = uVar2.mo13307e(uVar);
        fxVar7.f18496a = e;
        C6465bx bxVar = new C6465bx();
        bxVar.f19152c = e;
        bxVar.f19151b = d.f18618a;
        bxVar.f19162m = d.f18638u;
        boolean z3 = d.f18620c;
        boolean z4 = d.f18629l;
        List list = d.f18630m;
        C6190dj djVar = d.f18639v;
        boolean z5 = d.f18628k;
        boolean z6 = d.f18619b;
        bxVar.f19154e = d.f18626i;
        bxVar.f19161l = d.f18637t;
        bxVar.f19157h = z2;
        boolean z7 = d.f18632o;
        boolean z8 = d.f18622e;
        boolean z9 = d.f18621d;
        boolean z10 = d.f18633p;
        int i = d.f18624g;
        bxVar.f19158i = d.f18634q;
        C6549n nVar2 = d.f18623f;
        C6433as asVar = d.f18625h;
        if (d.f18636s == -1) {
            C6474cf a = bxVar.mo13545a(uVar);
            boolean z11 = d.f18627j;
            C6320v vVar = new C6320v(a);
            C6336o oVar = new C6336o(uVar);
            fxVar4.f18496a = vVar;
            fxVar.f18496a = uVar2.mo13305c();
            C6341t tVar = new C6341t(oVar, vVar);
            tVar.f18753c = nVar.f18735f;
            tVar.f18754d = d.f18631n;
            boolean z12 = d.f18635r;
            C6346y yVar = new C6346y(tVar);
            fxVar2.f18496a = yVar;
            if (sVar == null) {
                sVar = new C6317s();
            }
            int b = uVar2.mo13304b();
            if (b == Integer.MIN_VALUE) {
                b = Integer.MAX_VALUE;
            }
            sVar.f18689a = b;
            fxVar6.f18496a = sVar;
            C6314p pVar = new C6314p(uVar, sVar);
            fxVar3.f18496a = pVar;
            yVar.f18776i = pVar;
            vVar.f18690a.f19182B.mo13619a(new C6312n(yVar));
            vVar.f18690a.f19221n = z;
            fxVar5.f18496a = C6313o.LOADING;
            return;
        }
        throw new IllegalArgumentException("Estimated viewport count must be > 0: 0");
    }

    /* renamed from: c */
    static void m16937c(C6468c cVar) {
        cVar.mo13327a();
    }

    /* renamed from: d */
    protected static void m16938d(C6411u uVar, C6346y yVar) {
        C6335n nVar;
        int i = C6311m.f18652R;
        C6407q qVar = uVar.f19012e;
        if (qVar != null) {
            C6311m mVar = (C6311m) qVar;
        }
        synchronized (yVar) {
            boolean z = yVar.f18768a;
            nVar = yVar.f18773f;
        }
        if (nVar != null) {
            yVar.mo13365f(nVar);
        }
    }

    /* renamed from: e */
    static C6407q m16939e(C6411u uVar, @C6118b C6335n nVar, @C6118b C6407q qVar, @C6118b C6407q qVar2, @C6118b C6407q qVar3, @C6118b List list, @C6118b boolean z, @C6118b boolean z2, @C6118b boolean z3, @C6118b C0646fh fhVar, @C6118b int i, @C6118b(mo12872a = C6119c.DIMEN_SIZE) int i2, @C6118b(mo12872a = C6119c.DIMEN_SIZE) int i3, @C6118b(mo12872a = C6119c.DIMEN_SIZE) int i4, @C6118b(mo12872a = C6119c.DIMEN_SIZE) int i5, @C6118b C20747a aVar, @C6118b C0657fs fsVar, @C6118b boolean z4, @C6118b C6319u uVar2, C6317s sVar, C6427am amVar, C6313o oVar, C6468c cVar, C6346y yVar, C0710hr hrVar) {
        C6154cb cbVar;
        C6411u uVar3 = uVar;
        C6335n nVar2 = nVar;
        C6407q qVar4 = qVar;
        C6407q qVar5 = qVar2;
        C6407q qVar6 = qVar3;
        List list2 = list;
        C6313o oVar2 = oVar;
        C6346y yVar2 = yVar;
        if (uVar3.f19012e != null) {
            C6278fu fuVar = new C6278fu(LinearLayoutManager.INVALID_OFFSET, true);
            ComponentTree componentTree = uVar3.f19017j;
            if (componentTree != null) {
                String e = uVar.mo13348e();
                synchronized (componentTree) {
                    if (componentTree.f17922y != null) {
                        componentTree.f17873D.mo13287l(e, fuVar, true);
                    }
                }
            }
        }
        synchronized (yVar) {
            boolean z5 = yVar2.f18768a;
            C6335n nVar3 = yVar2.f18773f;
            if (nVar3 == null || nVar3.f18737h != nVar2.f18737h) {
                C6335n nVar4 = yVar2.f18774g;
                if (nVar4 == null || nVar4.f18737h != nVar2.f18737h) {
                    yVar2.f18774g = C6346y.m17025b(nVar, false);
                    yVar2.mo13370k(0, (String) null, (C6348ga) null);
                }
            }
        }
        boolean z6 = oVar2 == C6313o.ERROR && qVar6 == null;
        if ((oVar2 == C6313o.EMPTY && qVar5 == null) || z6) {
            return null;
        }
        boolean z7 = uVar2.mo13303a() != 0 && !z4;
        C6439ay ayVar = new C6439ay();
        ayVar.mo13518c(uVar, new C6442ba());
        C6442ba baVar = ayVar.f19085a;
        baVar.f19114d = z;
        baVar.f19094C = i2;
        baVar.f19105N = i3;
        baVar.f19108Q = i4;
        baVar.f19112b = i5;
        baVar.f19113c = z2;
        baVar.f19095D = z3;
        baVar.f19106O = 0;
        baVar.f19101J = -1;
        baVar.f19098G = i;
        baVar.f19100I = sVar;
        if (!z7) {
            cbVar = null;
        } else {
            cbVar = C6311m.m15817L(C6311m.class, "RecyclerCollectionComponent", uVar, -1873243140, new Object[]{uVar3, yVar2});
        }
        C6442ba baVar2 = ayVar.f19085a;
        baVar2.f19102K = cbVar;
        baVar2.f19099H = z7;
        baVar2.f19093B = null;
        baVar2.f19117g = false;
        baVar2.f19109R = false;
        baVar2.f19116f = ayVar.f18979b.mo13257a(0.0f);
        C6315q qVar7 = new C6315q(amVar);
        if (ayVar.f19085a.f19097F == Collections.EMPTY_LIST) {
            ayVar.f19085a.f19097F = new ArrayList();
        }
        ayVar.f19085a.f19097F.add(qVar7);
        if (list2 != null) {
            if (ayVar.f19085a.f19097F.isEmpty()) {
                ayVar.f19085a.f19097F = list2;
            } else {
                ayVar.f19085a.f19097F.addAll(list2);
            }
        }
        C6442ba baVar3 = ayVar.f19085a;
        baVar3.f19103L = null;
        baVar3.f19104M = -12425294;
        baVar3.f19107P = hrVar;
        baVar3.f19110S = aVar;
        baVar3.f19096E = fsVar;
        baVar3.f19111a = cVar;
        ayVar.f19086d.set(0);
        C6305g gVar = fhVar;
        if (f18688b == gVar) {
            gVar = new C6305g();
        }
        ayVar.f19085a.f19092A = gVar;
        ayVar.mo13430N(0.0f);
        ayVar.mo13436T((C6154cb) null);
        if (!cVar.mo13328f()) {
            boolean z8 = uVar2.mo13306d().f18620c;
            ayVar.mo13435S(3);
            ayVar.mo13434R(9, 0);
        }
        C6374h b = C6395i.m17143b(uVar);
        b.mo13430N(0.0f);
        b.f18849a.f18922b = C6565a.FLEX_START;
        b.mo13390j(ayVar);
        if (oVar2 == C6313o.LOADING && qVar4 != null) {
            C6393hr b2 = C6394hs.m17136b(uVar);
            b2.mo13404d(qVar4);
            b2.mo13430N(0.0f);
            b2.mo13435S(3);
            b2.mo13434R(9, 0);
            b.mo13390j(b2);
        } else if (oVar2 == C6313o.EMPTY) {
            C6393hr b3 = C6394hs.m17136b(uVar);
            b3.mo13404d(qVar5);
            b3.mo13430N(0.0f);
            b3.mo13435S(3);
            b3.mo13434R(9, 0);
            b.mo13390j(b3);
        } else if (oVar2 == C6313o.ERROR) {
            C6393hr b4 = C6394hs.m17136b(uVar);
            b4.mo13404d(qVar6);
            b4.mo13430N(0.0f);
            b4.mo13435S(3);
            b4.mo13434R(9, 0);
            b.mo13390j(b4);
        }
        return b.f18849a;
    }
}
