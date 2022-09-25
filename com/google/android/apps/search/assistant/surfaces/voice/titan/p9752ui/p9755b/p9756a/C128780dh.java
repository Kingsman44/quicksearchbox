package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateHubmodeConnectionImpl$filter$$inlined$transform$1", mo61344c = "VoicePlateHubmodeConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dh */
/* compiled from: PG */
public final class C128780dh extends C69572j implements C69630p {

    /* renamed from: a */
    int f353994a;

    /* renamed from: b */
    final /* synthetic */ C71587n f353995b;

    /* renamed from: c */
    final /* synthetic */ int f353996c;

    /* renamed from: d */
    private /* synthetic */ Object f353997d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128780dh(C71587n nVar, C69577g gVar, int i) {
        super(2, gVar);
        this.f353995b = nVar;
        this.f353996c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128780dh) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353994a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f353995b;
            C128779dg dgVar = new C128779dg((C71588o) this.f353997d, this.f353996c);
            this.f353994a = 1;
            if (nVar.mo38165mp(dgVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128780dh dhVar = new C128780dh(this.f353995b, gVar, this.f353996c);
        dhVar.f353997d = obj;
        return dhVar;
    }
}
