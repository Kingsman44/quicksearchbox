package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3295d.C42367a;
import com.google.android.libraries.social.populous.p3295d.C42368b;
import com.google.android.libraries.social.populous.p3295d.C42371e;
import com.google.android.libraries.social.populous.p3295d.C42372f;
import com.google.android.libraries.social.populous.p3295d.C42373g;
import com.google.android.libraries.social.populous.p3295d.C42375i;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.populous.az */
/* compiled from: PG */
public final class C42193az implements C42189av {

    /* renamed from: a */
    public final ClientConfigInternal f110509a;

    /* renamed from: b */
    public final C42373g f110510b;

    /* renamed from: c */
    public final C58495hd f110511c;

    /* renamed from: d */
    public final ExecutorService f110512d;

    /* renamed from: e */
    public final C42591z f110513e;

    /* renamed from: f */
    private final C42160an f110514f;

    /* renamed from: g */
    private final C42373g f110515g;

    public C42193az(ClientConfigInternal clientConfigInternal, C42373g gVar, C42373g gVar2, C58495hd hdVar, ExecutorService executorService, C42591z zVar, C42160an anVar) {
        this.f110509a = clientConfigInternal;
        this.f110515g = gVar;
        this.f110510b = gVar2;
        this.f110511c = hdVar;
        this.f110512d = executorService;
        this.f110513e = zVar;
        this.f110514f = anVar;
    }

    /* renamed from: a */
    public final void mo44881a(List list, C42197bb bbVar) {
        C58872ci d = this.f110513e.mo45634d(10, list.size(), (Integer) null, C42576k.f111734a);
        C58838bb.m90883r(bbVar != null);
        mo44883c(list, new C42188au(bbVar), d, C42201bf.f110521a);
    }

    /* renamed from: b */
    public final C58495hd mo44882b(C42375i iVar, C58528ij ijVar) {
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = iVar.f111121a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (!ijVar.contains(entry.getKey())) {
                gzVar.mo55429h((C42321ct) entry.getKey(), this.f110514f.mo44852a((C42405ab) entry.getValue()).mo44773b());
            }
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: c */
    public final void mo44883c(List list, C42188au auVar, C58872ci ciVar, C42201bf bfVar) {
        C42373g gVar = this.f110515g;
        ClientConfigInternal clientConfigInternal = this.f110509a;
        C42372f fVar = (C42372f) gVar;
        C58872ci b = fVar.f111113d.mo45632b();
        C58486gv gvVar = new C58486gv();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42321ct ctVar = (C42321ct) it.next();
            gvVar.mo55419c(ctVar.mo45203a(), ctVar);
        }
        C58487gw a = gvVar.mo55417a();
        ArrayList arrayList = new ArrayList();
        C58800sl lA = a.map.keySet().iterator();
        while (lA.hasNext()) {
            C42320cs csVar = (C42320cs) lA.next();
            C42372f fVar2 = fVar;
            arrayList.add(fVar.f111112c.mo19399b(new C42368b(fVar2, csVar, a.mo55277g(csVar), fVar.f111110a.mo26870b() - clientConfigInternal.f110729o)));
        }
        List list2 = list;
        C60870cx h = C60922j.m93045h(C60856cj.m92896e(arrayList), new C42367a(fVar, clientConfigInternal, list2), C60826bg.f164896a);
        C60856cj.m92911t(h, new C42371e(fVar, b), C60826bg.f164896a);
        C58872ci ciVar2 = ciVar;
        mo44884d(h, 9, ciVar2);
        C60856cj.m92911t(h, new C42190aw(this, auVar, ciVar2, bfVar, list2), this.f110512d);
    }

    /* renamed from: d */
    public final void mo44884d(C60870cx cxVar, int i, C58872ci ciVar) {
        C60856cj.m92911t(cxVar, new C42192ay(this, ciVar, i, cxVar), C60826bg.f164896a);
    }
}
