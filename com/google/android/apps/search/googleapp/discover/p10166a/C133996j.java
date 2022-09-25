package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.ClientDataPopulator$populateActions$2", mo61344c = "ClientDataPopulator.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.j */
/* compiled from: PG */
final class C133996j extends C69572j implements C69630p {

    /* renamed from: a */
    Object f364990a;

    /* renamed from: b */
    int f364991b;

    /* renamed from: c */
    final /* synthetic */ C133997k f364992c;

    /* renamed from: d */
    final /* synthetic */ List f364993d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133996j(C133997k kVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f364992c = kVar;
        this.f364993d = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133996j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364991b != 0) {
            obj2 = this.f364990a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69648ae aeVar = new C69648ae();
            aeVar.f186027a = C69496am.f185918a;
            C60870cx a = this.f364992c.f364995b.mo46039a(new C133995i(aeVar, this.f364993d), C60826bg.f164896a);
            C69664n.m101060f(a, "feedActions: List<FeedAc…irectExecutor()\n        )");
            this.f364990a = aeVar;
            this.f364991b = 1;
            if (C71663i.m104690c(a, this) == aVar) {
                return aVar;
            }
            obj2 = aeVar;
        }
        return ((C69648ae) obj2).f186027a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133996j(this.f364992c, this.f364993d, gVar);
    }
}
