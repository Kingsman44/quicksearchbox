package com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34416f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.gsa.shared.apa.triggering.hotword.LegacyHotwordInvocationSource$initialize$1", mo61344c = "LegacyHotwordInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.gsa.shared.d.b.a.m */
/* compiled from: PG */
final class C89710m extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C89712o f242851a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89710m(C89712o oVar, C69577g gVar) {
        super(2, gVar);
        this.f242851a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C89710m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw b = C71423ax.m104197b(this.f242851a.f242855b);
        C89712o oVar = this.f242851a;
        C71594u.m104517d(C71477ah.m104295b(C71536cm.m104384b(oVar.f242856c.f91965c, new C89706i(oVar, (C69577g) null)), new C89707j(this.f242851a, (C69577g) null)), b);
        C71594u.m104517d(C71477ah.m104295b(C71536cm.m104384b(this.f242851a.f242860g.mo39282a(C34043bf.ENTRYPOINT_LEGACY_HOTWORD), new C89708k(this.f242851a, (C69577g) null)), new C89709l(this.f242851a, (C69577g) null)), b);
        return C34416f.m63110b(b);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C89710m(this.f242851a, gVar);
    }
}
