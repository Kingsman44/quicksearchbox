package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.C12480a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.q */
/* compiled from: PG */
public final class C12497q implements C12480a {

    /* renamed from: a */
    public static final C59071e f39404a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.q");

    /* renamed from: b */
    public final C69464a f39405b;

    /* renamed from: c */
    public final C57987f f39406c;

    /* renamed from: d */
    private final Executor f39407d;

    /* renamed from: e */
    private final C58495hd f39408e;

    public C12497q(C12991i iVar, C58833ax axVar, Executor executor, Map map, C69464a aVar) {
        C13059e eVar;
        C57987f fVar = new C57987f();
        this.f39406c = fVar;
        C59104x b = f39404a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InteractionStateStreamI");
        ((C59052c) ((C59052c) b).mo56372aa(44285)).mo56386p("#ctor");
        this.f39407d = executor;
        this.f39405b = aVar;
        if (axVar.mo56113h()) {
            eVar = (C13059e) ((C13060f) axVar.mo56107c()).toBuilder();
        } else {
            eVar = (C13059e) C13060f.f40536l.createBuilder();
        }
        eVar.copyOnWrite();
        C13060f fVar2 = (C13060f) eVar.instance;
        iVar.getClass();
        fVar2.f40544g = iVar;
        fVar2.f40538a |= 32;
        C12496p pVar = new C12496p(eVar, executor, fVar);
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            gzVar.mo55429h((Class) entry.getKey(), new C12495o(pVar, pVar.f39401a, (C12502v) entry.getValue()));
        }
        this.f39408e = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C60870cx mo20629a(Class cls, C57981b bVar) {
        C12488h hVar = (C12488h) this.f39408e.get(cls);
        hVar.getClass();
        return bVar.mo20440jJ(hVar);
    }

    /* renamed from: b */
    public final C57981b mo20630b() {
        ArrayList b = C58597ky.m90211b(this.f39408e.values());
        C47633f g = C47633f.m84733g(C60856cj.m92896e(C58597ky.m90217h(b, C12483c.f39376a)));
        C12485e eVar = new C12485e(this, b);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(eVar), this.f39407d);
        return new C12487g(this, b);
    }
}
