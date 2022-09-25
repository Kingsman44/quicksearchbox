package com.google.android.libraries.gsa.conversation.p1853g;

import androidx.p060c.C0984n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.conversation.g.u */
/* compiled from: PG */
public final class C22677u {

    /* renamed from: a */
    public static final C59071e f62457a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g.u");

    /* renamed from: b */
    public final C51183n f62458b;

    /* renamed from: c */
    public final C60887da f62459c;

    /* renamed from: d */
    public final C0984n f62460d;

    /* renamed from: e */
    public final C0984n f62461e;

    /* renamed from: f */
    public final C0984n f62462f;

    /* renamed from: g */
    public final Set f62463g;

    /* renamed from: h */
    public final int f62464h;

    /* renamed from: i */
    private final C58495hd f62465i;

    public C22677u(C52081en enVar, C51183n nVar, int i, C58495hd hdVar, C60887da daVar) {
        this.f62458b = nVar;
        this.f62464h = i;
        this.f62465i = hdVar;
        this.f62459c = daVar;
        this.f62462f = new C0984n(nVar.f133229b.size());
        this.f62461e = new C0984n(enVar.f136684d.size());
        for (C52083ep epVar : enVar.f136684d) {
            this.f62461e.put(Integer.valueOf(epVar.f136694d), epVar);
        }
        this.f62460d = new C0984n(nVar.f133229b.size());
        for (C51175f fVar : nVar.f133229b) {
            this.f62460d.put(Integer.valueOf(fVar.f133208b), fVar);
        }
        this.f62463g = new HashSet(enVar.f136684d.size());
    }

    /* renamed from: a */
    public static C58833ax m42208a(C52083ep epVar) {
        if (epVar.f136692b == 4) {
            C52076ei eiVar = (C52076ei) epVar.f136693c;
            if ((eiVar.f136666a & 32) != 0) {
                C51809dy dyVar = eiVar.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                return C58833ax.m90834k(dyVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public static String m42209e(C52083ep epVar) {
        C58833ax a = m42208a(epVar);
        return a.mo56113h() ? ((C51809dy) a.mo56107c()).f135936b : "UNKNOWN";
    }

    /* renamed from: b */
    public final synchronized C58485gu mo27782b(C60870cx cxVar, List list, C22669m mVar) {
        C58485gu j;
        Iterator it;
        C52076ei eiVar;
        C60870cx cxVar2;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                if (this.f62460d.containsKey(num)) {
                    C51175f fVar = (C51175f) this.f62460d.get(num);
                    int i = fVar.f133208b;
                    C62961ch chVar = fVar.f133211e;
                    C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(C22671o.f62445a), this.f62459c);
                    ArrayList arrayList2 = new ArrayList(fVar.f133211e.size());
                    C60870cx cxVar3 = g;
                    for (Integer num2 : fVar.f133211e) {
                        if (!this.f62461e.containsKey(num2) || this.f62463g.contains(num2)) {
                            it = it2;
                        } else {
                            C52083ep epVar = (C52083ep) this.f62461e.get(num2);
                            if (epVar.f136692b == 4) {
                                eiVar = (C52076ei) epVar.f136693c;
                            } else {
                                eiVar = C52076ei.f136664f;
                            }
                            if (!eiVar.f136670e || !this.f62465i.containsKey(Integer.valueOf(epVar.f136694d))) {
                                cxVar2 = C60856cj.m92900i(C58833ax.m90834k(epVar));
                            } else {
                                cxVar2 = (C60870cx) this.f62465i.get(Integer.valueOf(epVar.f136694d));
                            }
                            C60870cx cxVar4 = cxVar2;
                            it = it2;
                            cxVar3 = C60922j.m93045h(cxVar3, C47810es.m84966f(new C22672p(this, cxVar4, epVar, fVar, mVar)), this.f62459c);
                            arrayList2.add(new C22595a(epVar, cxVar4, cxVar3));
                        }
                        it2 = it;
                    }
                    C22668l lVar = new C22668l(C60922j.m93044g(cxVar3, C47810es.m84963c(new C22673q(fVar)), this.f62459c), C58485gu.m89842j(arrayList2));
                    arrayList.addAll(lVar.f62439c);
                    this.f62462f.put(num, lVar.f62438b);
                    it2 = it2;
                } else {
                    C60870cx cxVar5 = cxVar;
                }
            }
            j = C58485gu.m89842j(arrayList);
        }
        return j;
    }

    /* renamed from: c */
    public final C60870cx mo27783c(C52083ep epVar, C22669m mVar) {
        this.f62463g.add(Integer.valueOf(epVar.f136694d));
        return mVar.mo27742a(epVar, C58836b.f156633a, this.f62464h);
    }

    /* renamed from: d */
    public final synchronized C60870cx mo27784d(C22667k kVar, List list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (this.f62462f.containsKey(num)) {
                arrayList.add((C60870cx) this.f62462f.get(num));
            }
        }
        return C60922j.m93044g(C60846c.m92879h(C60856cj.m92896e(arrayList), Throwable.class, C47810es.m84966f(new C22678v(arrayList)), C60826bg.f164896a), C47810es.m84963c(new C22674r(kVar)), this.f62459c);
    }
}
