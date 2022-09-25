package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40451k;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import java.io.File;
import kotlinx.coroutines.C71422aw;
import p5304e.p5305a.p5306a.p5346al.p5347a.p5348a.C68448g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.prefetch.DiskCache$get$2", mo61344c = "DiskCache.kt", mo61345d = "invokeSuspend", mo61346e = {135, 140})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.r */
/* compiled from: PG */
final class C40294r extends C69572j implements C69630p {

    /* renamed from: a */
    Object f105853a;

    /* renamed from: b */
    int f105854b;

    /* renamed from: c */
    final /* synthetic */ String f105855c;

    /* renamed from: d */
    final /* synthetic */ C40301y f105856d;

    /* renamed from: e */
    final /* synthetic */ C57695ab f105857e;

    /* renamed from: f */
    final /* synthetic */ C40451k f105858f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40294r(String str, C40301y yVar, C57695ab abVar, C40451k kVar, C69577g gVar) {
        super(2, gVar);
        this.f105855c = str;
        this.f105856d = yVar;
        this.f105857e = abVar;
        this.f105858f = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C40294r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f105854b;
        if (i == 0) {
            C69714l.m101134b(obj);
            Object a = this.f105856d.f105879e.mo42414a(this.f105857e);
            if (!C68448g.m98859c(this.f105856d.f105876b)) {
                return null;
            }
            C40301y yVar = this.f105856d;
            String str = this.f105855c;
            this.f105853a = a;
            this.f105854b = 1;
            obj = yVar.mo42387d(str, this);
            obj2 = a;
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return (C40291o) obj;
        } else {
            Object obj3 = this.f105853a;
            C69714l.m101134b(obj);
            obj2 = obj3;
        }
        File file = (File) obj;
        if (file.exists()) {
            ((C40358k) obj2).mo42417d("PreregisteredResources.PrefetchRequest.Count", C40267ag.DISK.f105768f);
            return new C40291o(C40267ag.DISK, file);
        }
        C40289m mVar = new C40289m(this.f105856d, file, this.f105855c, this.f105858f, (C40358k) obj2);
        this.f105853a = null;
        this.f105854b = 2;
        obj = mVar.mo42374b(this);
        if (obj == aVar) {
            return aVar;
        }
        return (C40291o) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C40294r(this.f105855c, this.f105856d, this.f105857e, this.f105858f, gVar);
    }
}
