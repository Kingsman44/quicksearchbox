package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10188c.C134270b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.g */
/* compiled from: PG */
public final class C134727g implements C134270b {

    /* renamed from: a */
    public final ConcurrentHashMap f366882a = new ConcurrentHashMap();

    /* renamed from: a */
    public final C134286f mo111669a() {
        Enumeration elements = this.f366882a.elements();
        C69664n.m101060f(elements, "statusPerSurface.elements()");
        ArrayList list = Collections.list(elements);
        C69664n.m101060f(list, "list(this)");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (Object next : list) {
            C134284d dVar = new C134284d();
            C134725e eVar = (C134725e) next;
            List list2 = dVar.f365788a;
            C134296p pVar = C134296p.NOT_SENSITIVE_OR_PII;
            C69664n.m101061g(pVar, "sensitivity");
            ArrayList arrayList2 = new ArrayList();
            C134297q.m217880d("Surface", eVar.f366875a.toString(), pVar, arrayList2);
            C134297q.m217880d("Launch State", eVar.f366878d.toString(), pVar, arrayList2);
            C134297q.m217880d("Render State", eVar.f366879e.toString(), pVar, arrayList2);
            C134297q.m217880d("Image Load State", eVar.f366880f.toString(), pVar, arrayList2);
            C134297q.m217881e("Is Visible", eVar.f366877c, pVar, arrayList2);
            C134297q.m217881e("Has Been Visible", eVar.f366876b, pVar, arrayList2);
            C69540x.m100811r(list2, arrayList2);
            arrayList.add(dVar.mo111674a());
        }
        return new C134291k("Most recent launch per surface", arrayList);
    }
}
