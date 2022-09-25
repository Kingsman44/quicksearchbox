package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37848c;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.audiosourcedataaccessor.AudioAdapterAudioSourceDataAccessor$handoverAudioSource$1", mo61344c = "AudioAdapterAudioSourceDataAccessor.kt", mo61345d = "invokeSuspend", mo61346e = {229})
/* renamed from: com.google.android.libraries.search.c.t.b.a.d */
/* compiled from: PG */
final class C37995d extends C69572j implements C69630p {

    /* renamed from: a */
    int f100661a;

    /* renamed from: b */
    final /* synthetic */ C38006o f100662b;

    /* renamed from: c */
    final /* synthetic */ int f100663c;

    /* renamed from: d */
    private /* synthetic */ Object f100664d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37995d(C38006o oVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f100662b = oVar;
        this.f100663c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37995d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C37519dz dzVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f100661a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f100664d;
            C38006o oVar = this.f100662b;
            int i = this.f100663c;
            this.f100661a = 1;
            obj = oVar.mo41202i(i, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        obj2 = (C37400be) obj;
        Throwable a = C69702k.m101124a(obj2);
        if (a == null) {
            return obj2;
        }
        C59052c cVar = (C59052c) C38006o.f100686a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "ALT.AdapterSrcAccessor");
        C59052c cVar2 = (C59052c) cVar.mo56382g(a);
        cVar2.mo56379ah(new C59094n(52932));
        cVar2.mo56386p("#audio# handoverAudioSource failed");
        if (!(a instanceof C37902d)) {
            return C37848c.m66817d(C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE);
        }
        C37561eb ebVar = ((C37902d) a).f100480a;
        if (ebVar.f99802a == 2) {
            dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
            if (dzVar == null) {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
        } else {
            dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
        }
        C69664n.m101060f(dzVar, "it.audioSourceOpeningStatus.failure");
        return C37848c.m66817d(dzVar);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37995d dVar = new C37995d(this.f100662b, this.f100663c, gVar);
        dVar.f100664d = obj;
        return dVar;
    }
}
