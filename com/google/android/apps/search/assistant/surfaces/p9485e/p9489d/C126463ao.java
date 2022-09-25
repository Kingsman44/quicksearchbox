package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126561f;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126564i;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126565j;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126567l;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71367au;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$4", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {131})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.ao */
/* compiled from: PG */
final class C126463ao extends C69572j implements C69630p {

    /* renamed from: a */
    int f348287a;

    /* renamed from: b */
    final /* synthetic */ C71553dc f348288b;

    /* renamed from: c */
    final /* synthetic */ C71367au f348289c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126463ao(C71553dc dcVar, C71367au auVar, C69577g gVar) {
        super(2, gVar);
        this.f348288b = dcVar;
        this.f348289c = auVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126463ao) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348287a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71498bb.m104325a(this.f348288b, new C126462an((C69577g) null));
            C71367au auVar = this.f348289c;
            this.f348287a = 1;
            Object mp = C71477ah.m104295b(new C126564i(new C126561f(a)), new C126565j(auVar, (C69577g) null)).mo38165mp(new C126567l(auVar), this);
            if (mp != C69554a.COROUTINE_SUSPENDED) {
                mp = C69788q.f186170a;
            }
            if (mp == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126463ao(this.f348288b, this.f348289c, gVar);
    }
}
