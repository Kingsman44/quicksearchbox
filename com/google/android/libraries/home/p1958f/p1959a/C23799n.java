package com.google.android.libraries.home.p1958f.p1959a;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69502as;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69571i;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5480j.C69694b;
import p5462h.p5480j.C69695c;
import p5462h.p5480j.C69699g;
import p5462h.p5482l.C69733m;

@C69567e(mo61343b = "com.google.android.libraries.home.settings.accountlinking.ProviderListPreferenceFragment$Companion$iterator$1", mo61344c = "ProviderListPreferenceFragment.kt", mo61345d = "invokeSuspend", mo61346e = {614})
/* renamed from: com.google.android.libraries.home.f.a.n */
/* compiled from: PG */
final class C23799n extends C69571i implements C69630p {

    /* renamed from: a */
    Object f65210a;

    /* renamed from: b */
    Object f65211b;

    /* renamed from: c */
    int f65212c;

    /* renamed from: d */
    final /* synthetic */ PreferenceGroup f65213d;

    /* renamed from: e */
    private /* synthetic */ Object f65214e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23799n(PreferenceGroup preferenceGroup, C69577g gVar) {
        super(gVar);
        this.f65213d = preferenceGroup;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C23799n) mo5194c((C69733m) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69733m mVar;
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f65212c != 0) {
            obj3 = this.f65211b;
            obj2 = this.f65210a;
            mVar = (C69733m) this.f65214e;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69695c d = C69699g.m101122d(0, this.f65213d.mo8381j());
            obj2 = this.f65213d;
            obj3 = d.iterator();
            mVar = (C69733m) this.f65214e;
        }
        while (((C69694b) obj3).f186062a) {
            Preference o = ((PreferenceGroup) obj2).mo8383o(((C69502as) obj3).mo5128a());
            this.f65214e = mVar;
            this.f65210a = obj2;
            this.f65211b = obj3;
            this.f65212c = 1;
            if (mVar.mo61426a(o, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C23799n nVar = new C23799n(this.f65213d, gVar);
        nVar.f65214e = obj;
        return nVar;
    }
}
