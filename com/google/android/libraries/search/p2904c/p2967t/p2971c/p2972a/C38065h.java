package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import android.media.AudioRecordingConfiguration;
import android.os.Handler;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129709f;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.state.impl.MicStateReporterImpl$register$1", mo61344c = "MicStateReporterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {108})
/* renamed from: com.google.android.libraries.search.c.t.c.a.h */
/* compiled from: PG */
final class C38065h extends C69572j implements C69626l {

    /* renamed from: a */
    int f100848a;

    /* renamed from: b */
    final /* synthetic */ C38070m f100849b;

    /* renamed from: c */
    final /* synthetic */ C129709f f100850c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38065h(C38070m mVar, C129709f fVar, C69577g gVar) {
        super(1, gVar);
        this.f100849b = mVar;
        this.f100850c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38065h(this.f100849b, this.f100850c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f100848a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (this.f100849b.f100868h.contains(this.f100850c)) {
                C59052c cVar = (C59052c) C38070m.f100861a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
                String a = C37331f.m66337a(this.f100850c);
                cVar.mo56379ah(new C59094n(52949));
                cVar.mo56389s("#audio# listener(%s) already registered, skip it", a);
                return C69788q.f186170a;
            }
            this.f100849b.f100868h.add(this.f100850c);
            if (this.f100849b.f100868h.size() == 1) {
                C38070m mVar = this.f100849b;
                C38059b bVar = new C38059b(mVar);
                mVar.f100864d = bVar;
                mVar.f100862b.registerAudioRecordingCallback(bVar, (Handler) null);
                List<AudioRecordingConfiguration> activeRecordingConfigurations = mVar.f100862b.getActiveRecordingConfigurations();
                C69664n.m101060f(activeRecordingConfigurations, "audioManager.activeRecordingConfigurations");
                mVar.mo41234e(activeRecordingConfigurations);
                C38070m mVar2 = this.f100849b;
                this.f100848a = 1;
                if (mVar2.mo41235f(this) == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }
}
