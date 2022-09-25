package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import com.facebook.litho.C6411u;
import com.facebook.litho.widget.C6474cf;
import com.facebook.litho.widget.C6491cw;
import com.facebook.litho.widget.C6548m;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import com.google.android.apps.search.googleapp.discover.p10248y.C135216ad;
import com.google.android.apps.search.googleapp.discover.p10248y.C135268s;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t */
/* compiled from: PG */
public final class C134888t implements C134270b {

    /* renamed from: a */
    public static final C134878j f367192a = new C134878j();

    /* renamed from: b */
    public static final C59071e f367193b = C59071e.m91331h();

    /* renamed from: c */
    public final ContentDisposableManager f367194c;

    /* renamed from: d */
    public final C6474cf f367195d;

    /* renamed from: e */
    public final C134889u f367196e;

    /* renamed from: f */
    public final C6411u f367197f;

    /* renamed from: g */
    public final C134876h f367198g;

    /* renamed from: h */
    public final int f367199h;

    /* renamed from: i */
    public final int f367200i;

    /* renamed from: j */
    public C135216ad f367201j;

    /* renamed from: k */
    private final C134866a f367202k;

    public C134888t(ContentDisposableManager contentDisposableManager, C6474cf cfVar, C134889u uVar, C6411u uVar2, C134876h hVar, long j, long j2, C134866a aVar) {
        C69664n.m101061g(contentDisposableManager, "contentDisposableManager");
        C69664n.m101061g(cfVar, "recyclerBinder");
        C69664n.m101061g(uVar2, "componentContext");
        C69664n.m101061g(aVar, "batchUpdateTracker");
        this.f367194c = contentDisposableManager;
        this.f367195d = cfVar;
        this.f367196e = uVar;
        this.f367197f = uVar2;
        this.f367198g = hVar;
        this.f367202k = aVar;
        this.f367199h = (int) j;
        this.f367200i = (int) j2;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        C135216ad adVar = this.f367201j;
        if (adVar == null) {
            List list = dVar.f365788a;
            C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar, "sensitivity");
            ArrayList arrayList = new ArrayList();
            C134297q.m217880d("No loaded RenderableStream", "true", pVar, arrayList);
            C69540x.m100811r(list, arrayList);
        } else {
            C134286f a = adVar.mo111669a();
            C69664n.m101060f(a, "this.debuggableFeature");
            C134268c.m217847b(a, dVar);
        }
        return C134268c.m217846a("Content Manager", dVar);
    }

    /* renamed from: b */
    public final void mo112044b(C135216ad adVar) {
        ArrayList arrayList;
        this.f367202k.f367151a.clear();
        this.f367194c.mo112038a();
        C6474cf cfVar = this.f367195d;
        List<C135268s> c = adVar.mo112171c();
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(c, 10));
        for (C135268s a : c) {
            arrayList2.add(this.f367196e.mo112045a(a));
        }
        synchronized (cfVar) {
            boolean z = cfVar.f19231x;
            arrayList = new ArrayList();
            int size = cfVar.f19203a.size();
            int size2 = arrayList2.size();
            if (size > size2) {
                while (true) {
                    size--;
                    if (size < size2) {
                        break;
                    }
                    arrayList.add((C6548m) cfVar.f19203a.remove(size));
                }
            }
            for (int i = 0; i < size2; i++) {
                C6491cw cwVar = (C6491cw) arrayList2.get(i);
                if (i >= cfVar.f19203a.size()) {
                    cfVar.f19203a.add(i, cfVar.mo13563q(cwVar));
                } else {
                    C6548m mVar = (C6548m) cfVar.f19203a.get(i);
                    if (!mVar.mo13632d().mo13533o() || !cwVar.mo13533o()) {
                        arrayList.add(mVar);
                        cfVar.f19203a.set(i, cfVar.mo13563q(cwVar));
                    } else {
                        mVar.mo13640l(cwVar);
                    }
                }
                cfVar.f19184D.mo13578a(cwVar);
            }
        }
        cfVar.f19211d.mObservable.mo2879a();
        cfVar.f19182B.mo13621c(true);
        cfVar.mo13554E(arrayList);
        this.f367201j = adVar;
    }
}
