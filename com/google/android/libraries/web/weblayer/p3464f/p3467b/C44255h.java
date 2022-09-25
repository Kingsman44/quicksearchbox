package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.weblayer.p3448b.C44129e;
import kotlinx.coroutines.C71422aw;
import org.chromium.weblayer.C72587aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69588r;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.internal.ProfileManagerImpl$withWebLayerProfileOnUiThread$2", mo61344c = "ProfileManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {116, 131})
/* renamed from: com.google.android.libraries.web.weblayer.f.b.h */
/* compiled from: PG */
final class C44255h extends C69572j implements C69630p {

    /* renamed from: a */
    int f115099a;

    /* renamed from: b */
    final /* synthetic */ C69630p f115100b;

    /* renamed from: c */
    final /* synthetic */ C44256i f115101c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44255h(C69630p pVar, C44256i iVar, C69577g gVar) {
        super(2, gVar);
        this.f115100b = pVar;
        this.f115101c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44255h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f115099a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C44256i iVar = this.f115101c;
            this.f115099a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            try {
                iVar.f115103b.mo47218i(new C44254g(rVar, iVar));
            } catch (Throwable th) {
                rVar.mo61338mb(C69714l.m101133a(new C44129e(BuildConfig.FLAVOR, th)));
            }
            obj = rVar.mo61355a();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C69630p pVar = this.f115100b;
        this.f115099a = 2;
        obj = pVar.mo5192a((C72587aw) obj, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44255h(this.f115100b, this.f115101c, gVar);
    }
}
