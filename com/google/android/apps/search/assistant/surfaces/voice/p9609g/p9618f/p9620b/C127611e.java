package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9620b;

import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.C127586a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127592f;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127593g;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127597k;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127600n;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127601o;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a.C127604r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71547cx;
import kotlinx.coroutines.p5574b.C71557dg;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.b.e */
/* compiled from: PG */
public final class C127611e extends C127604r implements C127586a {

    /* renamed from: a */
    private static final C59071e f351318a = C59071e.m91331h();

    /* renamed from: b */
    private final C71547cx f351319b = C71557dg.m104445c(1, 2, C71387t.DROP_OLDEST);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127611e(C69585o oVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
    }

    /* renamed from: a */
    public final /* synthetic */ C71587n mo108141a() {
        return this.f351319b;
    }

    /* renamed from: b */
    public final Object mo108145b(C127597k kVar) {
        C127593g gVar = kVar.f351299a;
        if (gVar == null) {
            gVar = C127593g.f351292c;
        }
        int a = C127592f.m208594a(gVar.f351294a);
        int i = a - 1;
        if (a != 0) {
            if (!(i == 0 || i == 1)) {
                C59052c cVar = (C59052c) f351318a.mo56225c();
                cVar.mo56379ah(new C59094n(37514));
                cVar.mo56386p("Setting Type not set");
            }
            C71547cx cxVar = this.f351319b;
            C127593g gVar2 = kVar.f351299a;
            if (gVar2 == null) {
                gVar2 = C127593g.f351292c;
            }
            C69664n.m101060f(gVar2, "request.settingType");
            cxVar.mo62806d(gVar2);
            C127600n nVar = (C127600n) C127601o.f351301a.createBuilder();
            C69664n.m101060f(nVar, "newBuilder()");
            C69664n.m101061g(nVar, "builder");
            C62942bv build = nVar.build();
            C69664n.m101060f(build, "_builder.build()");
            return (C127601o) build;
        }
        throw null;
    }
}
