package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.geller.p1818f.C21859i;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28786ca;
import com.google.android.libraries.mdi.download.C28793ch;
import com.google.android.libraries.mdi.download.C28795cj;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2248h.C29494ad;
import com.google.android.libraries.mdi.download.p2248h.C29495ae;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.h.b.w */
/* compiled from: PG */
public final class C29576w implements C21859i {

    /* renamed from: d */
    public static final /* synthetic */ int f80133d = 0;

    /* renamed from: e */
    private static final C58528ij f80134e = C58528ij.m90012L("next-pending", "current-active", "inline-payload");

    /* renamed from: a */
    public final Executor f80135a;

    /* renamed from: b */
    public final C58881cr f80136b;

    /* renamed from: c */
    public final C29575v f80137c;

    /* renamed from: f */
    private final C58833ax f80138f;

    public C29576w(C29573t tVar) {
        this.f80135a = tVar.f80125a;
        this.f80136b = tVar.f80126b;
        this.f80138f = tVar.f80127c;
        this.f80137c = tVar.f80129e;
    }

    /* renamed from: b */
    public static C28795cj m54561b(C65768az azVar) {
        C63070h hVar = azVar.f178799e;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        return (C28795cj) C62942bv.parseFrom((C62942bv) C28795cj.f78251c, hVar.f170218b, C62921ba.f169869a);
    }

    /* renamed from: c */
    public static C29573t m54562c() {
        return new C29573t();
    }

    /* renamed from: d */
    public static C58485gu m54563d(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28706al alVar = (C28706al) it.next();
            if (alVar.f77980c.startsWith("inlinefile")) {
                e.mo55395g(alVar);
            }
        }
        return e.mo55394f();
    }

    /* renamed from: e */
    public static C58485gu m54564e(C58495hd hdVar, List list) {
        if (list.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C58833ax axVar = (C58833ax) it.next();
            if (axVar.mo56113h()) {
                C28708an anVar = (C28708an) axVar.mo56107c();
                C58485gu d = m54563d(anVar.f78003h);
                C58490gz gzVar = new C58490gz(4);
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    C28706al alVar = (C28706al) d.get(i);
                    C58838bb.m90879n(hdVar.containsKey(alVar.f77983f), "Can't find the inlinefile %s of group %s in the inlinePayload", alVar.f77979b, anVar.f77997b);
                    String str = alVar.f77979b;
                    C28786ca caVar = (C28786ca) hdVar.get(alVar.f77983f);
                    caVar.getClass();
                    gzVar.mo55429h(str, caVar);
                }
                e.mo55395g(new C29518a((C28708an) axVar.mo56107c(), gzVar.mo55427f(true)));
            }
        }
        return e.mo55394f();
    }

    /* renamed from: a */
    public final C60870cx mo27164a(C58833ax axVar, C65855x xVar, C58485gu guVar) {
        C60870cx i;
        C29045l.m53931c("%s: Processing Sync Response, expected response type = %s", "GddDownloadedElementsListener", this.f80137c);
        if (!guVar.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = guVar.size();
            int i2 = 0;
            while (i2 < size) {
                C65768az azVar = (C65768az) guVar.get(i2);
                try {
                    String str = azVar.f178798d;
                    int indexOf = str.indexOf(":");
                    String substring = indexOf != -1 ? str.substring(0, indexOf) : str;
                    if (f80134e.contains(substring)) {
                        if (!hashMap.containsKey(substring)) {
                            hashMap.put(substring, new ArrayList());
                        }
                        ((List) hashMap.get(substring)).add(azVar);
                        i2++;
                    } else {
                        throw new IllegalArgumentException(String.format(Locale.US, "Element key (%s) had an unexpected key type", new Object[]{str}));
                    }
                } catch (IllegalArgumentException e) {
                    i = C60856cj.m92899h(e);
                }
            }
            if (hashMap.size() != 1 || hashMap.containsKey("next-pending")) {
                if (!hashMap.containsKey("inline-payload") || ((List) hashMap.get("inline-payload")).size() == 1) {
                    i = C60856cj.m92900i(C58495hd.m89898l(hashMap));
                } else {
                    i = C60856cj.m92899h(new IllegalArgumentException(String.format(Locale.US, "Only 1 inline payload element should be in the response, but multiple (%d) elements were received", new Object[]{Integer.valueOf(((List) hashMap.get("inline-payload")).size())})));
                }
                return C29670b.m54719g(C28738bp.m53591a(i, C28737bo.GDD_INVALID_ELEMENT_COMBINATION_RECEIVED, "Unexpected element combination received")).mo34822i(new C29567n(this, axVar, xVar), this.f80135a);
            }
            i = C60856cj.m92899h(new IllegalArgumentException(String.format("1 element synced and was expected to be next-pending element, but was: %s", new Object[]{hashMap.keySet()})));
            return C29670b.m54719g(C28738bp.m53591a(i, C28737bo.GDD_INVALID_ELEMENT_COMBINATION_RECEIVED, "Unexpected element combination received")).mo34822i(new C29567n(this, axVar, xVar), this.f80135a);
        }
        C29045l.m53930b("%s: No elements were synced, returning early.", "GddDownloadedElementsListener");
        return C60866ct.f164955a;
    }

    /* renamed from: f */
    public final List mo34771f(List list) {
        C60870cx cxVar;
        C28793ch chVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                C28795cj b = m54561b((C65768az) ((C58847bk) C58833ax.m90834k((C65768az) it.next())).f156646a);
                C58838bb.m90869d(b.f78253a == 3, "MddElement with current-active or next-pending key must contain a ManifestConfig");
                if (b.f78253a == 3) {
                    chVar = (C28793ch) b.f78254b;
                } else {
                    chVar = C28793ch.f78247c;
                }
                C58838bb.m90869d(1 == (chVar.f78249a & 1), "ManifestConfigResponse should contain ManifestConfig to process, but none was found.");
                C28728bf bfVar = chVar.f78250b;
                if (bfVar == null) {
                    bfVar = C28728bf.f78043d;
                }
                C28728bf a = C29494ad.m54458a(bfVar);
                C58838bb.m90869d(a.f78046b.size() > 0, "ManifestConfig should contain at least one entry, but none was found");
                if (this.f80138f.mo56113h()) {
                    Boolean bool = true;
                    if (bool.booleanValue()) {
                        cxVar = C60922j.m93044g(((C29495ae) this.f80138f.mo56107c()).mo19281a(a), C47810es.m84963c(C29566m.f80109a), this.f80135a);
                        arrayList.add(cxVar);
                    }
                }
                C28708an anVar = ((C28725bc) a.f78046b.get(0)).f78038c;
                if (anVar == null) {
                    anVar = C28708an.f77994l;
                }
                cxVar = C60856cj.m92900i(C58833ax.m90834k(anVar));
            } catch (C62974ct | IllegalArgumentException e) {
                cxVar = C60856cj.m92899h(e);
            }
            arrayList.add(cxVar);
        }
        return arrayList;
    }
}
