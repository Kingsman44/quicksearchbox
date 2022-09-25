package com.google.android.libraries.search.p2904c.p2990z.p2991a;

import com.google.android.libraries.search.p2904c.C37609fu;
import com.google.android.libraries.search.p2904c.C37610fv;
import com.google.android.libraries.search.p2904c.C37612fx;
import com.google.android.libraries.search.p2904c.C37613fy;
import com.google.android.libraries.search.p2904c.C37614fz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.store.impl.SingleAudioRecordStoreImpl$SingleAudioRecordWriter$close$1", mo61344c = "SingleAudioRecordStoreImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.z.a.a */
/* compiled from: PG */
final class C38285a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C38287c f101428a;

    /* renamed from: b */
    final /* synthetic */ C38289e f101429b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38285a(C38287c cVar, C38289e eVar, C69577g gVar) {
        super(2, gVar);
        this.f101428a = cVar;
        this.f101429b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38285a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (this.f101428a.f101435d.getAndSet(true)) {
            C59052c cVar = (C59052c) C38289e.f101439a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ALT.AudioStore");
            long j = this.f101428a.f101433b;
            cVar.mo56379ah(new C59094n(53081));
            cVar.mo56388r("#audio# AudioStoreWriter.Close called, writer already closed, skip. AudioRecordId: %d", j);
            return C69788q.f186170a;
        }
        AtomicReference atomicReference = this.f101429b.f101441c;
        C38287c cVar2 = this.f101428a;
        C37613fy fyVar = (C37613fy) C37614fz.f99950e.createBuilder();
        C69664n.m101060f(fyVar, "newBuilder()");
        C69664n.m101061g(fyVar, "builder");
        C37609fu fuVar = (C37609fu) C37610fv.f99940c.createBuilder();
        C69664n.m101060f(fuVar, "newBuilder()");
        C69664n.m101061g(fuVar, "builder");
        long j2 = cVar2.f101433b;
        fuVar.copyOnWrite();
        C37610fv fvVar = (C37610fv) fuVar.instance;
        fvVar.f99942a |= 1;
        fvVar.f99943b = j2;
        C62942bv build = fuVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C37610fv fvVar2 = (C37610fv) build;
        C69664n.m101061g(fvVar2, "value");
        fyVar.copyOnWrite();
        C37614fz fzVar = (C37614fz) fyVar.instance;
        fvVar2.getClass();
        fzVar.f99953b = fvVar2;
        fzVar.f99952a = 1 | fzVar.f99952a;
        C37612fx fxVar = cVar2.f101432a;
        C69664n.m101061g(fxVar, "value");
        fyVar.copyOnWrite();
        C37614fz fzVar2 = (C37614fz) fyVar.instance;
        fxVar.getClass();
        fzVar2.f99955d = fxVar;
        fzVar2.f99952a |= 4;
        C63088z zVar = cVar2.f101434c;
        C69664n.m101060f(zVar, "audioRecordingBytes");
        C69664n.m101061g(zVar, "value");
        fyVar.copyOnWrite();
        C37614fz fzVar3 = (C37614fz) fyVar.instance;
        zVar.getClass();
        fzVar3.f99952a |= 2;
        fzVar3.f99954c = zVar;
        C62942bv build2 = fyVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        atomicReference.set((C37614fz) build2);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38285a(this.f101428a, this.f101429b, gVar);
    }
}
