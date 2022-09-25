package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134281m;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134283o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Instant;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.av */
/* compiled from: PG */
public final class C134029av implements C134283o {

    /* renamed from: a */
    public final C60950i f365084a;

    /* renamed from: b */
    public final C42876ab f365085b;

    /* renamed from: c */
    public final Executor f365086c;

    /* renamed from: d */
    private final C69585o f365087d;

    /* renamed from: e */
    private final C71422aw f365088e;

    public C134029av(C21370a aVar, C60950i iVar, C42876ab abVar, Executor executor, C69585o oVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(abVar, "dataStore");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "scope");
        this.f365084a = iVar;
        this.f365085b = abVar;
        this.f365086c = executor;
        this.f365087d = oVar;
        this.f365088e = awVar;
    }

    /* renamed from: e */
    public static final C134291k m217409e(String str, List list) {
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (Object next : list) {
            C134284d dVar = new C134284d();
            C134033az azVar = (C134033az) next;
            List list2 = dVar.f365788a;
            C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar, "sensitivity");
            ArrayList arrayList2 = new ArrayList();
            C63042fg fgVar = azVar.f365093b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            C69664n.m101060f(fgVar, "it.timestamp");
            C134297q.m217878b("Time", C62949a.m95469d(fgVar), pVar, arrayList2);
            String str2 = azVar.f365094c;
            C69664n.m101060f(str2, "it.data");
            C134297q.m217880d("Data", str2, pVar, arrayList2);
            C69540x.m100811r(list2, arrayList2);
            arrayList.add(dVar.mo111674a());
        }
        return new C134291k(str, arrayList);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo111527a() {
        return C134281m.m217855a(this);
    }

    /* renamed from: b */
    public final void mo111528b(C134023ap apVar) {
        C69664n.m101061g(apVar, "taskResult");
        Instant a = this.f365084a.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        C46459k.m82829b(this.f365085b.mo46039a(new C134026as(C62949a.m95467b(a), apVar), this.f365086c), "Failed to append onSyncTaskFinished.", new Object[0]);
    }

    /* renamed from: c */
    public final Object mo111529c(C69577g gVar) {
        return C71803m.m105040a(this.f365087d, new C134025ar(this, (C69577g) null), gVar);
    }

    /* renamed from: d */
    public final C71422aw mo111530d() {
        return this.f365088e;
    }
}
