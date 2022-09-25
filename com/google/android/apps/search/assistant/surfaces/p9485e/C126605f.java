package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126404t;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$consumeAndCloseMicrophone$2$2$1", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {222})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.f */
/* compiled from: PG */
final class C126605f extends C69572j implements C69630p {

    /* renamed from: a */
    int f348653a;

    /* renamed from: b */
    final /* synthetic */ C126621v f348654b;

    /* renamed from: c */
    final /* synthetic */ C126404t f348655c;

    /* renamed from: d */
    final /* synthetic */ C71389v f348656d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126605f(C126621v vVar, C126404t tVar, C71389v vVar2, C69577g gVar) {
        super(2, gVar);
        this.f348654b = vVar;
        this.f348655c = tVar;
        this.f348656d = vVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126605f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348653a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f348654b.f348706k;
            this.f348653a = 1;
            if (zVar.mo62825a(this) == aVar) {
                return aVar;
            }
        }
        this.f348655c.close();
        this.f348656d.mo62727D((Throwable) null);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126605f(this.f348654b, this.f348655c, this.f348656d, gVar);
    }
}
