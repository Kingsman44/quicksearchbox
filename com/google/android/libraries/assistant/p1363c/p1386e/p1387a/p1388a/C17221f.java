package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1388a;

import android.media.AudioManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66544aa;
import com.google.speech.p5208h.C66545ab;
import com.google.speech.p5208h.C66691y;
import com.google.speech.p5208h.C66692z;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.commons3request.CommonS3RequestProducer$produceDeviceArbitrationInfo$1$createInitialRequestMutator$1", mo61344c = "CommonS3RequestProducer.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.libraries.assistant.c.e.a.a.f */
/* compiled from: PG */
final class C17221f extends C69572j implements C69630p {

    /* renamed from: a */
    int f49968a;

    /* renamed from: b */
    final /* synthetic */ AudioManager f49969b;

    /* renamed from: c */
    final /* synthetic */ C38487e f49970c;

    /* renamed from: d */
    private /* synthetic */ Object f49971d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17221f(AudioManager audioManager, C38487e eVar, C69577g gVar) {
        super(2, gVar);
        this.f49969b = audioManager;
        this.f49970c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17221f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C66691y yVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f49968a != 0) {
            yVar = (C66691y) this.f49971d;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C66691y yVar2 = (C66691y) C66692z.f181426e.createBuilder();
            C69664n.m101060f(yVar2, "newBuilder()");
            C59052c cVar = (C59052c) C17232q.f49988c.mo56224b();
            cVar.mo56379ah(new C59094n(42641));
            cVar.mo56386p("Beginning device info proto construction");
            C71604be c = C71803m.m105042c((C71422aw) this.f49971d, (C69585o) null, (C71424ay) null, new C17220e(this.f49970c, (C69577g) null), 3);
            AudioManager audioManager = this.f49969b;
            C66544aa aaVar = (C66544aa) C66545ab.f180982c.createBuilder();
            C69664n.m101060f(aaVar, "newBuilder()");
            if (audioManager.isBluetoothScoOn()) {
                aaVar.copyOnWrite();
                C66545ab abVar = (C66545ab) aaVar.instance;
                abVar.f180985b = 2;
                abVar.f180984a |= 1;
            } else if (audioManager.isWiredHeadsetOn()) {
                aaVar.copyOnWrite();
                C66545ab abVar2 = (C66545ab) aaVar.instance;
                abVar2.f180985b = 4;
                abVar2.f180984a |= 1;
            } else {
                aaVar.copyOnWrite();
                C66545ab abVar3 = (C66545ab) aaVar.instance;
                abVar3.f180985b = 1;
                abVar3.f180984a |= 1;
            }
            C62942bv build = aaVar.build();
            C69664n.m101060f(build, "microphoneInfoBuilder.build()");
            yVar2.mo59705b((C66545ab) build);
            this.f49971d = yVar2;
            this.f49968a = 1;
            obj = c.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
            yVar = yVar2;
        }
        String str = (String) ((Optional) obj).orElse(BuildConfig.FLAVOR);
        C59052c cVar2 = (C59052c) C17232q.f49988c.mo56224b();
        cVar2.mo56379ah(new C59094n(42642));
        cVar2.mo56389s("Adding device info with device ID %s to request header.", str);
        C69664n.m101060f(str, "deviceId");
        if (str.length() > 0) {
            yVar.copyOnWrite();
            C66692z zVar = (C66692z) yVar.instance;
            C66692z zVar2 = C66692z.f181426e;
            str.getClass();
            zVar.f181429a |= 16;
            zVar.f181432d = str;
        }
        return new C17219d(yVar);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17221f fVar = new C17221f(this.f49969b, this.f49970c, gVar);
        fVar.f49971d = obj;
        return fVar;
    }
}
