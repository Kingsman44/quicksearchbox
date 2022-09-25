package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62988dg;
import com.google.protobuf.C63063ga;
import java.util.ArrayList;
import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.f */
/* compiled from: PG */
public final class C23579f implements C23543dq {
    /* renamed from: b */
    public static final C23580g m44002b(Collection collection) {
        C69664n.m101061g(collection, "value");
        return new C23580g(collection);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C23544dr mo28843a(C63063ga gaVar) {
        C62988dg dgVar;
        C69664n.m101061g(gaVar, "value");
        if (gaVar.f170181a == 6) {
            dgVar = (C62988dg) gaVar.f170182b;
        } else {
            dgVar = C62988dg.f170043b;
        }
        C62971cq<C63063ga> cqVar = dgVar.f170045a;
        C69664n.m101060f(cqVar, "value.listValue.valuesList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C63063ga gaVar2 : cqVar) {
            String str = gaVar2.f170181a == 3 ? (String) gaVar2.f170182b : BuildConfig.FLAVOR;
            C69664n.m101060f(str, "it.stringValue");
            arrayList.add(str);
        }
        return m44002b(arrayList);
    }
}
