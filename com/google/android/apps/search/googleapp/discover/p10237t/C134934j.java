package com.google.android.apps.search.googleapp.discover.p10237t;

import com.google.android.apps.search.googleapp.discover.p10214s.C134536aa;
import com.google.android.apps.search.googleapp.discover.p10214s.C134537ab;
import com.google.android.apps.search.googleapp.discover.p10214s.C134538ac;
import com.google.android.apps.search.googleapp.discover.p10214s.C134561az;
import com.google.android.apps.search.googleapp.discover.p10214s.C134564bb;
import com.google.android.apps.search.googleapp.discover.p10214s.C134572bj;
import com.google.android.apps.search.googleapp.discover.p10214s.C134573bk;
import com.google.android.apps.search.googleapp.discover.p10214s.C134579bq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.j */
/* compiled from: PG */
public final class C134934j {
    /* renamed from: a */
    public static final C134538ac m218818a(C134564bb bbVar, C134572bj bjVar, String str, String str2) {
        C134537ab abVar = (C134537ab) C134538ac.f366376d.createBuilder();
        C69664n.m101060f(abVar, "newBuilder()");
        C134536aa a = C69664n.m101061g(abVar, "builder");
        C134561az azVar = (C134561az) C134573bk.f366497h.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C134579bq a2 = C69664n.m101061g(azVar, "builder");
        a2.mo111824c(bbVar);
        C69664n.m101061g(bjVar, "value");
        C134561az azVar2 = a2.f366518a;
        azVar2.copyOnWrite();
        C134573bk bkVar = (C134573bk) azVar2.instance;
        bkVar.f366504f = bjVar.f366496h;
        bkVar.f366499a |= 16;
        if (str != null) {
            a2.mo111823b(str);
        }
        if (str2 != null) {
            C134561az azVar3 = a2.f366518a;
            azVar3.copyOnWrite();
            C134573bk bkVar2 = (C134573bk) azVar3.instance;
            bkVar2.f366499a |= 4;
            bkVar2.f366502d = str2;
        }
        a.mo111815e(a2.mo111822a());
        return a.mo111811a();
    }
}
