package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.bi */
/* compiled from: PG */
public final class C101050bi {

    /* renamed from: a */
    public static final C59071e f282183a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.j.bi");

    /* renamed from: e */
    private static final C58485gu f282184e = C58485gu.m89848p("lens_proactive_policy_config_group", "sheldon_policy_config_group", "federated_unintended_policy_config_group");

    /* renamed from: b */
    public final C68214a f282185b;

    /* renamed from: c */
    public final C68214a f282186c;

    /* renamed from: d */
    public final C68214a f282187d;

    /* renamed from: f */
    private final C68214a f282188f;

    /* renamed from: g */
    private final C22871g f282189g;

    public C101050bi(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C22871g gVar) {
        this.f282185b = aVar;
        this.f282188f = aVar2;
        this.f282186c = aVar3;
        this.f282187d = aVar4;
        this.f282189g = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo92131a() {
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = f282184e;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(mo92132b((String) guVar.get(i2)));
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C101047bf(arrayList), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo92132b(String str) {
        C59071e eVar = f282183a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(19760)).mo56389s("Get policy config URI for group: %s", str);
        Optional optional = (Optional) this.f282188f.mo27525b();
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(19761)).mo56386p("Mdd is not available. Cannot get policy file!!");
            return C60856cj.m92900i(Optional.empty());
        }
        return this.f282189g.mo28209i(this.f282189g.mo28202b("Get Policy Config FileGroup", new C101042ba(optional, str)), "Get policy ClientFile", C101043bb.f282169a);
    }

    /* renamed from: c */
    public final C60870cx mo92133c() {
        ((C59052c) ((C59052c) f282183a.mo56224b()).mo56372aa(19762)).mo56386p("Refresh account policy.");
        return this.f282189g.mo28202b("[FedAss] Refresh account policy", new C101044bc(this));
    }
}
