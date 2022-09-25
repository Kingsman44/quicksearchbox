package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129709f;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.state.impl.MicStateReporterImpl$unregister$1", mo61344c = "MicStateReporterImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.c.a.k */
/* compiled from: PG */
final class C38068k extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C38070m f100857a;

    /* renamed from: b */
    final /* synthetic */ C129709f f100858b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38068k(C38070m mVar, C129709f fVar, C69577g gVar) {
        super(1, gVar);
        this.f100857a = mVar;
        this.f100858b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38068k(this.f100857a, this.f100858b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        TelephonyManager telephonyManager;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f100857a.f100867g.remove(this.f100858b);
        this.f100857a.f100868h.remove(this.f100858b);
        if (this.f100857a.f100868h.isEmpty()) {
            C38070m mVar = this.f100857a;
            C38059b bVar = mVar.f100864d;
            if (bVar != null) {
                mVar.f100862b.unregisterAudioRecordingCallback(bVar);
            }
            mVar.f100864d = null;
            C38070m mVar2 = this.f100857a;
            PhoneStateListener phoneStateListener = mVar2.f100863c;
            if (!(phoneStateListener == null || (telephonyManager = mVar2.f100865e) == null)) {
                telephonyManager.listen(phoneStateListener, 0);
            }
            mVar2.f100863c = null;
            C38070m mVar3 = this.f100857a;
            mVar3.f100869i = false;
            mVar3.f100871k = C69496am.f185918a;
        }
        return C69788q.f186170a;
    }
}
