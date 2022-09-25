package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import androidx.core.p094f.C1888a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125082bj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125083bk;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.p9477a.C126186a;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.execution.performer.AutoCompletePerformer$perform$1", mo61344c = "AutoCompletePerformer.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.a */
/* compiled from: PG */
final class C125432a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C125436b f345917a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125432a(C125436b bVar, C69577g gVar) {
        super(2, gVar);
        this.f345917a = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125432a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C125931t tVar = this.f345917a.f345923a;
        if (C1888a.m5150d() || !tVar.mo107189h() || !C69664n.m101066l(tVar.mo107187f(), "com.google.android.gm")) {
            return C36180b.m64578b(C52235kf.UNIMPLEMENTED);
        }
        C125082bj bjVar = (C125082bj) C125083bk.f345071c.createBuilder();
        bjVar.copyOnWrite();
        ((C125083bk) bjVar.instance).f345073a = 62;
        bjVar.copyOnWrite();
        ((C125083bk) bjVar.instance).f345074b = true;
        C126186a.m206398a((C125083bk) bjVar.build(), this.f345917a.f345924b);
        return C36180b.f94544a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125432a(this.f345917a, gVar);
    }
}
