package com.google.android.apps.gsa.shared.p7122o;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87785dm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87786dn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87787do;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.common.p4526f.C59052c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.shared.o.d */
/* compiled from: PG */
public final /* synthetic */ class C90440d implements C21247aq {

    /* renamed from: a */
    public final /* synthetic */ C90441e f252654a;

    /* renamed from: b */
    public final /* synthetic */ String f252655b;

    /* renamed from: c */
    public final /* synthetic */ C57696b f252656c;

    public /* synthetic */ C90440d(C90441e eVar, String str, C57696b bVar) {
        this.f252654a = eVar;
        this.f252655b = str;
        this.f252656c = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25924a(View view, View view2) {
        C90441e eVar = this.f252654a;
        String str = this.f252655b;
        C57696b bVar = this.f252656c;
        String a = C90443g.m147128a(new C90443g(str, C90442f.SHOW));
        if (a != null) {
            C88489j jVar = new C88489j(C87739bu.ELEMENTS_LOG_VISIBILITY_CHANGE);
            C62940bt btVar = C87785dm.f237566a;
            C87786dn dnVar = (C87786dn) C87787do.f237567d.createBuilder();
            dnVar.copyOnWrite();
            C87787do doVar = (C87787do) dnVar.instance;
            doVar.f237569a = 1 | doVar.f237569a;
            doVar.f237570b = a;
            String str2 = bVar.f154144e;
            dnVar.copyOnWrite();
            C87787do doVar2 = (C87787do) dnVar.instance;
            str2.getClass();
            doVar2.f237569a |= 2;
            doVar2.f237571c = str2;
            jVar.mo82014b(btVar, (C87787do) dnVar.build());
            eVar.f252658b.mo81961c(jVar.mo82013a());
            return;
        }
        ((C59052c) ((C59052c) C90441e.f252657a.mo56226d()).mo56372aa(10576)).mo56389s("Generated vet is null for ved: %s", str);
    }
}
