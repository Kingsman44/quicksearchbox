package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.p2906aa.C37330e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.resources.audioinput.EagerAudioInputResourceSession$handleEagerSessionTimeout$1", mo61344c = "AudioInputResourceSession.kt", mo61345d = "invokeSuspend", mo61346e = {94, 97})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.aq */
/* compiled from: PG */
final class C121768aq extends C69572j implements C69630p {

    /* renamed from: a */
    int f337926a;

    /* renamed from: b */
    final /* synthetic */ C121769ar f337927b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121768aq(C121769ar arVar, C69577g gVar) {
        super(2, gVar);
        this.f337927b = arVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121768aq) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f337926a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx c = this.f337927b.f337928a.mo20356c();
            C69664n.m101060f(c, "delegate.sessionAccessToken");
            this.f337926a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C37454cc ccVar = (C37454cc) obj;
        C59052c cVar = (C59052c) C121762ak.f337915a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "INV.AudioInput");
        C69664n.m101060f(ccVar, "token");
        int a = C37330e.m66336a(ccVar);
        cVar.mo56379ah(new C59094n(35986));
        cVar.mo56387q("Stopping session(%s) due to handover timeout.", a);
        C121758ag agVar = this.f337927b.f337929b;
        this.f337926a = 2;
        if (agVar.mo105347g(ccVar, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121768aq(this.f337927b, gVar);
    }
}
