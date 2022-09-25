package com.google.android.apps.search.googleapp.search.p10418j;

import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63077o;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.permissions.SearchPermissionService$permissionStateFlow$1", mo61344c = "SearchPermissionService.kt", mo61345d = "invokeSuspend", mo61346e = {32})
/* renamed from: com.google.android.apps.search.googleapp.search.j.i */
/* compiled from: PG */
final class C137535i extends C69572j implements C69630p {

    /* renamed from: a */
    int f374075a;

    /* renamed from: b */
    final /* synthetic */ C137536j f374076b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137535i(C137536j jVar, C69577g gVar) {
        super(2, gVar);
        this.f374076b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137535i) mo5194c((C69788q) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f374075a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                if (!(e instanceof CancellationException)) {
                    C59052c cVar = (C59052c) C137536j.f374077a.mo56226d();
                    cVar.mo56378ag(C38505d.f101864b, new Integer(145005885));
                    C59052c cVar2 = (C59052c) cVar.mo56382g(e);
                    cVar2.mo56379ah(new C59094n(41010));
                    cVar2.mo56386p("Fail to fetch search permission");
                }
                throw e;
            }
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f374076b.f374078b.mo113801b();
            this.f374075a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(((C63077o) obj).f170230a);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137535i(this.f374076b, gVar);
    }
}
