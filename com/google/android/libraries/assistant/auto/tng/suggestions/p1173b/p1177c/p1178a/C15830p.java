package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1174a.C15786a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15792b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.C15814a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.C15832a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1186a.C15839a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.C15886a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58529ik;
import com.google.common.p4522b.C58532in;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.p */
/* compiled from: PG */
public final class C15830p implements C15814a {

    /* renamed from: a */
    public static final C59071e f47061a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.p");

    /* renamed from: b */
    public final C15815a f47062b;

    /* renamed from: c */
    public final C58532in f47063c;

    /* renamed from: d */
    public final C58528ij f47064d = new C58759qy(C15792b.f47026a);

    /* renamed from: e */
    private final C60887da f47065e;

    /* renamed from: f */
    private final C58528ij f47066f;

    /* renamed from: g */
    private final C58495hd f47067g;

    /* renamed from: h */
    private final C58528ij f47068h;

    /* renamed from: i */
    private final C58495hd f47069i;

    /* renamed from: j */
    private final C15839a f47070j;

    public C15830p(C15815a aVar, Set set, Set set2, Set set3, Set set4, C15839a aVar2, C60887da daVar) {
        this.f47062b = aVar;
        this.f47065e = daVar;
        C58490gz gzVar = new C58490gz(4);
        Collection.EL.stream(set).forEach(new C15819e(gzVar));
        this.f47067g = gzVar.mo55427f(false);
        this.f47066f = C58528ij.m90006F(set3);
        C58490gz gzVar2 = new C58490gz(4);
        Collection.EL.stream(set4).forEach(new C15820f(gzVar2));
        this.f47069i = gzVar2.mo55427f(false);
        C58529ik ikVar = new C58529ik();
        Collection.EL.stream(set2).forEach(new C15821g(ikVar));
        this.f47063c = ikVar.mo55493a();
        this.f47068h = C58528ij.m90006F(set2);
        this.f47070j = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo22573a(C15785a aVar) {
        C15886a aVar2 = (C15886a) this.f47069i.get(aVar);
        if (aVar2 != null) {
            return (C60870cx) aVar2.get();
        }
        C58800sl lA = this.f47068h.iterator();
        while (lA.hasNext()) {
            C15786a aVar3 = (C15786a) lA.next();
            if (aVar3.mo22569a() == aVar) {
                return mo22580c(aVar3);
            }
        }
        return C60856cj.m92900i(this.f47062b.mo22575b(aVar));
    }

    /* renamed from: b */
    public final C60870cx mo22574b() {
        C59104x b = f47061a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ContextManager");
        ((C59052c) ((C59052c) b).mo56372aa(46436)).mo56386p("Context Manager Initializing.");
        ArrayList arrayList = new ArrayList();
        Collection.EL.stream(this.f47066f).forEach(new C15822h(this, arrayList));
        C58485gu guVar = (C58485gu) Collection.EL.stream(this.f47066f).filter(new C15823i(this)).map(C15824j.f47052a).collect(C58370cn.f155946a);
        if (!guVar.isEmpty()) {
            arrayList.add(this.f47070j.mo22586a(guVar));
        }
        return C47638k.m84750a(arrayList).mo51520a(C15825k.f47053a, this.f47065e);
    }

    /* renamed from: c */
    public final C60870cx mo22580c(C15786a aVar) {
        C15785a a = aVar.mo22569a();
        C58833ax b = this.f47062b.mo22575b(a);
        C60870cx c = aVar.mo22571c(this);
        C15828n nVar = new C15828n(this, a, b);
        C60856cj.m92911t(c, C47810es.m84974n(nVar), this.f47065e);
        C15818d dVar = C15818d.f47045a;
        return C60922j.m93044g(c, C47810es.m84963c(dVar), this.f47065e);
    }

    /* renamed from: d */
    public final void mo22581d(C15785a aVar, C58833ax axVar, MessageLite messageLite) {
        C15832a aVar2 = (C15832a) this.f47067g.get(aVar);
        if (aVar2 != null) {
            C15817c cVar = new C15817c(aVar2, axVar, messageLite);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(cVar), this.f47065e), "Error notifying observer", new Object[0]);
        }
    }
}
