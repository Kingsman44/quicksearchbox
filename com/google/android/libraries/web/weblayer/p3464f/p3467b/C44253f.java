package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.internal.ProfileManagerImpl$removeWebLayerPersistenceStorageForJava$1", mo61344c = "ProfileManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {95})
/* renamed from: com.google.android.libraries.web.weblayer.f.b.f */
/* compiled from: PG */
final class C44253f extends C69572j implements C69630p {

    /* renamed from: a */
    int f115094a;

    /* renamed from: b */
    final /* synthetic */ C44256i f115095b;

    /* renamed from: c */
    final /* synthetic */ Set f115096c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44253f(C44256i iVar, Set set, C69577g gVar) {
        super(2, gVar);
        this.f115095b = iVar;
        this.f115096c = set;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44253f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115094a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44256i iVar = this.f115095b;
            Set set = this.f115096c;
            this.f115094a = 1;
            Object f = iVar.mo47163f(new C44252e(set, (C69577g) null), this);
            if (f != C69554a.COROUTINE_SUSPENDED) {
                f = C69788q.f186170a;
            }
            if (f == aVar) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44253f(this.f115095b, this.f115096c, gVar);
    }
}
