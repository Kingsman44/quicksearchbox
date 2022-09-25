package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import com.google.android.libraries.search.integrations.p3015b.p3016a.C38501g;
import com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a.C38495d;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.settings.language.DiscoverLanguageSetting$getPreferredLanguage$2", mo61344c = "DiscoverLanguageSetting.kt", mo61345d = "invokeSuspend", mo61346e = {77})
/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.e */
/* compiled from: PG */
final class C134644e extends C69572j implements C69630p {

    /* renamed from: a */
    int f366652a;

    /* renamed from: b */
    final /* synthetic */ C134646g f366653b;

    /* renamed from: c */
    private /* synthetic */ Object f366654c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134644e(C134646g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f366653b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134644e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f366652a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = ((C38501g) this.f366653b.f366657a).f101859a.mo46042d();
            C69664n.m101060f(d, "store.readDiscoverLanguageData()");
            C71604be c = C71803m.m105042c((C71422aw) this.f366654c, (C69585o) null, (C71424ay) null, new C134642c(d, (C69577g) null), 3);
            c.mo62873s(new C134643d(d));
            this.f366652a = 1;
            obj = c.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C38495d dVar = (C38495d) obj;
        String str = dVar != null ? dVar.f101851c : null;
        if (str == null || C69764m.m101229h(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C134644e eVar = new C134644e(this.f366653b, gVar);
        eVar.f366654c = obj;
        return eVar;
    }
}
