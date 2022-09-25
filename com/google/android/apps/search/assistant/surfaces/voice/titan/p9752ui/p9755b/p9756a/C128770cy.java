package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.cy */
/* compiled from: PG */
final class C128770cy extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C128782dj f353970a;

    /* renamed from: b */
    final /* synthetic */ C128771cz f353971b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128770cy(C128782dj djVar, C128771cz czVar) {
        super(0);
        this.f353970a = djVar;
        this.f353971b = czVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        this.f353970a.f354007d.unregisterAudioPlaybackCallback(this.f353971b);
        C59052c cVar = (C59052c) C128782dj.f354004a.mo56224b();
        cVar.mo56379ah(new C59094n(38013));
        cVar.mo56386p("Unsubscribed AudioPlaybackCallback");
        return C69788q.f186170a;
    }
}
