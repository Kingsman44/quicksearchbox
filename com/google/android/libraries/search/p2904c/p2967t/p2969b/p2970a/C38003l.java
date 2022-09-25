package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37510dq;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2911c.C37423a;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37848c;
import com.google.common.base.C58833ax;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.audiosourcedataaccessor.AudioAdapterAudioSourceDataAccessor$startListeningInternal$startListeningResult$1", mo61344c = "AudioAdapterAudioSourceDataAccessor.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.b.a.l */
/* compiled from: PG */
final class C38003l extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C37335b f100682a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f100683b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38003l(C37335b bVar, C58833ax axVar, C69577g gVar) {
        super(2, gVar);
        this.f100682a = bVar;
        this.f100683b = axVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38003l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C37335b bVar = this.f100682a;
        if (bVar instanceof C37423a) {
            C69664n.m101060f(bVar, "writeableAudioBuffer");
            C58833ax a = C69664n.m101061g(bVar, "<this>");
            C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
            C69664n.m101060f(eaVar, "newBuilder()");
            C37510dq a2 = C69664n.m101061g(eaVar, "builder");
            a2.mo40998c(C37563ed.OPENED);
            return C37848c.m66815b(a, (C58833ax) null, a2.mo40996a(), this.f100683b, 2);
        } else if (!(bVar instanceof C37446p)) {
            return C37848c.m66817d(C37519dz.FAILED_OPENING_INVALID_WRITEABLE_AUDIO_BUFFER_DATA);
        } else {
            C69664n.m101060f(bVar, "writeableAudioBuffer");
            C58833ax a3 = C69664n.m101061g(bVar, "<this>");
            C37560ea eaVar2 = (C37560ea) C37561eb.f99800c.createBuilder();
            C69664n.m101060f(eaVar2, "newBuilder()");
            C37510dq a4 = C69664n.m101061g(eaVar2, "builder");
            a4.mo40998c(C37563ed.OPENED);
            return C37848c.m66815b((C58833ax) null, a3, a4.mo40996a(), this.f100683b, 1);
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38003l(this.f100682a, this.f100683b, gVar);
    }
}
