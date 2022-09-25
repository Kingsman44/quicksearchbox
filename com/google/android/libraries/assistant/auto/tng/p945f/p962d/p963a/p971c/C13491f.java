package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13532h;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13544t;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13545u;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13519e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13528n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.f */
/* compiled from: PG */
public final /* synthetic */ class C13491f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13496k f41386a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f41387b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f41388c;

    /* renamed from: d */
    public final /* synthetic */ C13495j f41389d;

    public /* synthetic */ C13491f(C13496k kVar, C60870cx cxVar, C60870cx cxVar2, C13495j jVar) {
        this.f41386a = kVar;
        this.f41387b = cxVar;
        this.f41388c = cxVar2;
        this.f41389d = jVar;
    }

    public final Object call() {
        C13496k kVar = this.f41386a;
        C60870cx cxVar = this.f41387b;
        C60870cx cxVar2 = this.f41388c;
        C13495j jVar = this.f41389d;
        C13544t tVar = (C13544t) C13546v.f41508e.createBuilder();
        tVar.copyOnWrite();
        ((C13546v) tVar.instance).f41511b = C13545u.m29826a(3);
        tVar.mo21161a((Iterable) C60856cj.m92909r(cxVar));
        C13532h hVar = (C13532h) C60856cj.m92909r(cxVar2);
        tVar.copyOnWrite();
        C13546v vVar = (C13546v) tVar.instance;
        hVar.getClass();
        vVar.f41513d = hVar;
        vVar.f41510a |= 1;
        C13546v vVar2 = (C13546v) tVar.build();
        C59104x b = C13496k.f41395a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TcLibSmartActionGen");
        ((C59052c) ((C59052c) b).mo56372aa(44818)).mo56393w("Generated %d smart action candidate(s) from %d TcLib conversation action suggestion(s).", vVar2.f41512c.size(), ((C61886aw) jVar.mo21104a().mo56107c()).mo58325a().size());
        C13528n.m29813d(vVar2.f41512c);
        kVar.f41397c.mo22352b(C13519e.m29803a(3, vVar2));
        return vVar2;
    }
}
