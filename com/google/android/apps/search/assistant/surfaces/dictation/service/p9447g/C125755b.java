package com.google.android.apps.search.assistant.surfaces.dictation.service.p9447g;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125150dx;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125151dy;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125166o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126040be;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.g.b */
/* compiled from: PG */
public final /* synthetic */ class C125755b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C125757d f346570a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f346571b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f346572c;

    /* renamed from: d */
    public final /* synthetic */ af f346573d;

    public /* synthetic */ C125755b(C125757d dVar, C60870cx cxVar, C60870cx cxVar2, af afVar) {
        this.f346570a = dVar;
        this.f346571b = cxVar;
        this.f346572c = cxVar2;
        this.f346573d = afVar;
    }

    public final Object call() {
        C125757d dVar = this.f346570a;
        C60870cx cxVar = this.f346571b;
        C60870cx cxVar2 = this.f346572c;
        af afVar = this.f346573d;
        C125150dx dxVar = (C125150dx) C125151dy.f345235c.createBuilder();
        C126040be a = dVar.f346578c.mo66636a(afVar.l);
        C125160i a2 = dVar.f346576a.mo107166a(afVar);
        C69664n.m101061g(afVar, "configurationData");
        C125166o b = a.mo107268b((C125160i) C60856cj.m92909r(cxVar), a2, (Map) C60856cj.m92909r(cxVar2));
        dxVar.copyOnWrite();
        C125151dy dyVar = (C125151dy) dxVar.instance;
        b.getClass();
        dyVar.f345238b = b;
        dyVar.f345237a = 2;
        return (C125151dy) dxVar.build();
    }
}
