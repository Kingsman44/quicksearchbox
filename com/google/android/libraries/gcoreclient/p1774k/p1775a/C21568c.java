package com.google.android.libraries.gcoreclient.p1774k.p1775a;

import android.util.Pair;
import com.google.android.apps.gsa.staticplugins.feedback.C101245n;
import com.google.android.apps.gsa.staticplugins.feedback.C101246o;
import com.google.android.gms.feedback.C144189a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gcoreclient.k.a.c */
/* compiled from: PG */
public final class C21568c extends C144189a {

    /* renamed from: a */
    final /* synthetic */ C101245n f59955a;

    public C21568c(C101245n nVar) {
        this.f59955a = nVar;
    }

    /* renamed from: a */
    public final List mo27016a() {
        C101245n nVar = this.f59955a;
        String str = nVar.f282538a.f254175a;
        C58480gp e = C58485gu.m89837e();
        Charset forName = Charset.forName("UTF-8");
        if (str != null) {
            C59104x b = C101246o.f282539z.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SendGoogleFeedback");
            ((C59052c) ((C59052c) b).mo56372aa(19916)).mo56387q("Attaching state dump to feedback: %d chars", str.length());
            e.mo55395g(new C21572g(str.getBytes(forName), "state_dump"));
        }
        Map map = nVar.f282538a.f254181g;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                e.mo55395g(new C21572g(((String) entry.getValue()).getBytes(forName), (String) entry.getKey()));
            }
        }
        C58485gu f = e.mo55394f();
        if (f == null) {
            return null;
        }
        int i = ((C58724pq) f).f156474d;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(((C21572g) f.get(i2)).f59958a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo27017b() {
        Map map = this.f59955a.f282538a.f254179e;
        C58480gp e = C58485gu.m89837e();
        for (Map.Entry entry : map.entrySet()) {
            e.mo55395g(new Pair((String) entry.getKey(), (String) entry.getValue()));
        }
        return e.mo55394f();
    }
}
