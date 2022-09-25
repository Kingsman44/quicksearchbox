package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import android.os.Handler;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateHubmodeConnectionImpl$createTtsAudioPlaybackFlow$1", mo61344c = "VoicePlateHubmodeConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {283})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.da */
/* compiled from: PG */
final class C128773da extends C69572j implements C69630p {

    /* renamed from: a */
    int f353975a;

    /* renamed from: b */
    final /* synthetic */ C128782dj f353976b;

    /* renamed from: c */
    private /* synthetic */ Object f353977c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128773da(C128782dj djVar, C69577g gVar) {
        super(2, gVar);
        this.f353976b = djVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128773da) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353975a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f353977c;
            C128771cz czVar = new C128771cz(aoVar);
            this.f353976b.f354007d.registerAudioPlaybackCallback(czVar, (Handler) null);
            C59052c cVar = (C59052c) C128782dj.f354004a.mo56224b();
            cVar.mo56379ah(new C59094n(38014));
            cVar.mo56386p("Subscribed AudioPlaybackCallback");
            C128770cy cyVar = new C128770cy(this.f353976b, czVar);
            this.f353975a = 1;
            if (C71360an.m104022a(aoVar, cyVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128773da daVar = new C128773da(this.f353976b, gVar);
        daVar.f353977c = obj;
        return daVar;
    }
}
