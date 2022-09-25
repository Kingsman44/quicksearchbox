package com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b;

import com.google.android.apps.gsa.staticplugins.p7611bv.C97300w;
import com.google.android.gms.common.api.internal.C143782cc;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.mdh.C145078l;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.C145037ad;
import com.google.android.gms.mdh.internal.C145043aj;
import com.google.android.gms.mdh.internal.C145044ak;
import com.google.android.gms.mdh.internal.C145045al;
import com.google.android.gms.mdh.internal.C145047an;
import com.google.android.gms.mdh.internal.C145050aq;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21651p;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21652q;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21654s;
import com.google.android.libraries.gcoreclient.p1809y.p1810a.C21742c;
import com.google.android.libraries.p10923ac.p10924a.C146765h;
import com.google.android.libraries.p10923ac.p10947c.C147201c;
import com.google.android.libraries.p10923ac.p10947c.C147208j;
import com.google.android.libraries.p10923ac.p10947c.C147209k;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147212b;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147216f;
import com.google.common.base.C58820ak;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62917ay;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ac.d.a.a.b.f */
/* compiled from: PG */
public final class C147222f implements C147209k {

    /* renamed from: a */
    private final Executor f397444a;

    /* renamed from: b */
    private final WeakHashMap f397445b = new WeakHashMap();

    /* renamed from: c */
    private final C62917ay f397446c;

    /* renamed from: d */
    private final C21652q f397447d;

    public C147222f(Executor executor, C21652q qVar, C62917ay ayVar) {
        this.f397444a = executor;
        this.f397447d = qVar;
        this.f397446c = ayVar;
    }

    /* renamed from: e */
    private final C147223g m240079e(C97300w wVar) {
        C147223g gVar;
        synchronized (this.f397445b) {
            WeakReference weakReference = (WeakReference) this.f397445b.get(wVar);
            if (weakReference == null) {
                gVar = null;
            } else {
                gVar = (C147223g) weakReference.get();
            }
            if (gVar == null) {
                gVar = new C147223g(wVar, this.f397446c);
                this.f397445b.put(wVar, new WeakReference(gVar));
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public final C60870cx mo124037a(C146765h hVar, C147208j jVar) {
        C147201c cVar = (C147201c) jVar;
        return C147216f.m240072a(this.f397444a, new C21742c(this.f397447d.f60002a.mo120577a(C147212b.m240067a(hVar).f59998a, new C21654s(new TimeSeriesFootprintsSubscriptionFilter(cVar.f397417a, cVar.f397418b, cVar.f397419c)).f60004a), C58820ak.f156611a));
    }

    /* renamed from: b */
    public final C60870cx mo124038b() {
        return C147216f.m240072a(this.f397444a, new C21742c(((C145050aq) this.f397447d.f60002a).mo120577a(SyncPolicy.f392028a, TimeSeriesFootprintsSubscriptionFilter.f392043a), C58820ak.f156611a));
    }

    /* renamed from: c */
    public final C60870cx mo124039c(C97300w wVar) {
        C146014aj ajVar;
        Executor executor = this.f397444a;
        C21652q qVar = this.f397447d;
        C147223g e = m240079e(wVar);
        C145078l lVar = qVar.f60002a;
        C21651p a = qVar.mo27042a(e);
        synchronized (((C145050aq) lVar).f392106i) {
            C145044ak akVar = (C145044ak) ((C145050aq) lVar).f392106i.get(a);
            if (akVar == null) {
                akVar = new C145044ak((C145050aq) lVar);
                ((C145050aq) lVar).f392106i.put(a, akVar);
            }
            C145044ak akVar2 = akVar;
            akVar2.f392084b = true;
            C143784ce b = C143785cf.m233680b(a, ((C145050aq) lVar).f392101d.f389927B, "registerTimeSeriesFootprintsListener");
            C146010af afVar = new C146010af();
            C145045al alVar = new C145045al(afVar, new C145037ad((C145050aq) lVar, b, akVar2, a, afVar));
            synchronized (((C145050aq) lVar).f392105h) {
                if (!((C145050aq) lVar).f392105h.isEmpty()) {
                    C145047an anVar = (C145047an) ((C145050aq) lVar).f392105h.getLast();
                    anVar.f392089a.add(alVar);
                    if (!anVar.f392090b && anVar == anVar.f392092d.f392105h.getFirst()) {
                        anVar.mo120576a();
                    }
                } else {
                    alVar.mo120575a();
                }
            }
            ajVar = afVar.f394698a;
        }
        return C147216f.m240072a(executor, new C21742c(ajVar, C58820ak.f156611a));
    }

    /* renamed from: d */
    public final void mo124040d(C97300w wVar) {
        C146006ab abVar;
        Executor executor = this.f397444a;
        C21652q qVar = this.f397447d;
        C147223g e = m240079e(wVar);
        C145078l lVar = qVar.f60002a;
        C21651p a = qVar.mo27042a(e);
        synchronized (((C145050aq) lVar).f392106i) {
            C145044ak akVar = (C145044ak) ((C145050aq) lVar).f392106i.get(a);
            if (akVar == null) {
                abVar = C146021aq.m237850d(false);
            } else {
                akVar.f392084b = false;
                C145043aj ajVar = akVar.f392083a;
                if (ajVar != null) {
                    ajVar.f392080a = false;
                }
                C143782cc ccVar = C143785cf.m233680b(a, ((C145050aq) lVar).f392101d.f389927B, "registerTimeSeriesFootprintsListener").f389806b;
                C143919bh.m233971n(ccVar, "Key must not be null");
                abVar = ((C145050aq) lVar).f392101d.mo119292w(ccVar, 7515);
            }
        }
        C147216f.m240072a(executor, new C21742c(abVar, C58820ak.f156611a));
    }
}
