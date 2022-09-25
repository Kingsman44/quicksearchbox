package com.google.android.libraries.search.assistant.p2782r;

import android.location.Location;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.locationservice.DefaultLocationService$getLocation$1", mo61344c = "DefaultLocationService.kt", mo61345d = "invokeSuspend", mo61346e = {46})
/* renamed from: com.google.android.libraries.search.assistant.r.a */
/* compiled from: PG */
final class C36375a extends C69572j implements C69630p {

    /* renamed from: a */
    int f94986a;

    /* renamed from: b */
    final /* synthetic */ C36378d f94987b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36375a(C36378d dVar, C69577g gVar) {
        super(2, gVar);
        this.f94987b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36375a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f94986a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (SecurityException e) {
                C59052c cVar = (C59052c) ((C59052c) C36378d.f94991a.mo56224b()).mo56382g(e);
                cVar.mo56379ah(new C59094n(51429));
                cVar.mo56386p("Failed to get current location");
            }
        } else {
            C69714l.m101134b(obj);
            C36378d dVar = this.f94987b;
            C60870cx d = dVar.f94992b.mo41550d(dVar.f94993c, 3);
            C69664n.m101060f(d, "locationOracle.getLocati…d, RequestType.REAL_TIME)");
            this.f94986a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Location location = (Location) obj;
        if (location != null) {
            return C69664n.m101061g(location, "<this>");
        }
        C59052c cVar2 = (C59052c) C36378d.f94991a.mo56224b();
        cVar2.mo56379ah(new C59094n(51428));
        cVar2.mo56386p("Failed to get current location");
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36375a(this.f94987b, gVar);
    }
}
