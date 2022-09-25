package com.google.android.libraries.social.populous.p3295d;

import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4181bi.C55799ai;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69308p;

/* renamed from: com.google.android.libraries.social.populous.d.q */
/* compiled from: PG */
public final class C42383q implements C42373g {

    /* renamed from: a */
    public final ClientVersion f111145a;

    /* renamed from: b */
    public final C42352m f111146b;

    /* renamed from: c */
    public final C42591z f111147c;

    /* renamed from: d */
    public final C58833ax f111148d;

    /* renamed from: e */
    final ConcurrentHashMap f111149e = new ConcurrentHashMap();

    /* renamed from: f */
    public final C42211b f111150f;

    /* renamed from: g */
    public final C42377k f111151g;

    /* renamed from: h */
    private final C60887da f111152h;

    public C42383q(ClientVersion clientVersion, C42211b bVar, C42352m mVar, C60887da daVar, C42591z zVar, C42377k kVar, C58833ax axVar) {
        this.f111145a = clientVersion;
        this.f111150f = bVar;
        this.f111146b = mVar;
        this.f111152h = daVar;
        this.f111147c = zVar;
        this.f111151g = kVar;
        this.f111148d = axVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo45357a(ClientConfigInternal clientConfigInternal, List list) {
        if (C69308p.m100584c()) {
            if (this.f111146b.f111091c != C42351l.SUCCESS_LOGGED_IN) {
                C42374h hVar = new C42374h();
                hVar.f111117c = 10;
                hVar.f111118d = 18;
                hVar.mo45360c(list);
                return C60856cj.m92900i(hVar.mo45358a());
            }
        }
        HashSet<C42321ct> hashSet = new HashSet<>();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42321ct ctVar = (C42321ct) it.next();
            C60870cx cxVar = (C60870cx) this.f111149e.get(ctVar);
            if (cxVar != null) {
                arrayList.add(ctVar);
                arrayList2.add(cxVar);
            } else {
                if (C69296d.m100510c()) {
                    C42320cs a = ctVar.mo45203a();
                    C42320cs csVar = C42320cs.EMAIL;
                    C55799ai aiVar = C55799ai.EMAIL;
                    int ordinal = a.ordinal();
                    if (!(ordinal == 0 || ordinal == 1 || ordinal == 2)) {
                    }
                }
                hashSet.add(ctVar);
            }
        }
        if (!hashSet.isEmpty()) {
            C58485gu j = C58485gu.m89842j(hashSet);
            C58872ci b = this.f111147c.mo45632b();
            C60870cx n = C60856cj.m92905n(new C42380n(this, clientConfigInternal, j), this.f111152h);
            C60856cj.m92911t(n, new C42381o(this, j, b), C60826bg.f164896a);
            C60856cj.m92911t(n, new C42382p(this, j), this.f111152h);
            for (C42321ct ctVar2 : hashSet) {
                arrayList.add(ctVar2);
                arrayList2.add(n);
                this.f111149e.put(ctVar2, n);
            }
        }
        return C60856cj.m92901j(C60922j.m93045h(C60856cj.m92896e(arrayList2), new C42378l(this, list, arrayList), this.f111152h));
    }
}
