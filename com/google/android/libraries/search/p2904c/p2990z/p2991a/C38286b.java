package com.google.android.libraries.search.p2904c.p2990z.p2991a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.store.impl.SingleAudioRecordStoreImpl$SingleAudioRecordWriter$write$1", mo61344c = "SingleAudioRecordStoreImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.z.a.b */
/* compiled from: PG */
final class C38286b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C38287c f101430a;

    /* renamed from: b */
    final /* synthetic */ C63088z f101431b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38286b(C38287c cVar, C63088z zVar, C69577g gVar) {
        super(2, gVar);
        this.f101430a = cVar;
        this.f101431b = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38286b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        if (!this.f101430a.f101435d.get()) {
            C38287c cVar = this.f101430a;
            cVar.f101434c = cVar.f101434c.mo59177x(this.f101431b);
            return C69788q.f186170a;
        }
        C59052c cVar2 = (C59052c) C38289e.f101439a.mo56226d();
        cVar2.mo56378ag(C58975e.f156826a, "ALT.AudioStore");
        cVar2.mo56374ac(250, TimeUnit.MILLISECONDS);
        long j = this.f101430a.f101433b;
        cVar2.mo56379ah(new C59094n(53082));
        cVar2.mo56388r("#audio# AudioStoreWriter.Write called after close. AudioRecordId: %d", j);
        long j2 = this.f101430a.f101433b;
        throw new IllegalStateException("AudioStoreWriter.Write called after close. AudioRecordId: " + j2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38286b(this.f101430a, this.f101431b, gVar);
    }
}
