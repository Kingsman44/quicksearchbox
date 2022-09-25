package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37565ef;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.audiosourcedataaccessor.AudioAdapterAudioSourceDataAccessor$closeAudioSource$1", mo61344c = "AudioAdapterAudioSourceDataAccessor.kt", mo61345d = "invokeSuspend", mo61346e = {174, 192})
/* renamed from: com.google.android.libraries.search.c.t.b.a.a */
/* compiled from: PG */
final class C37980a extends C69572j implements C69630p {

    /* renamed from: a */
    int f100617a;

    /* renamed from: b */
    final /* synthetic */ C38006o f100618b;

    /* renamed from: c */
    final /* synthetic */ C37565ef f100619c;

    /* renamed from: d */
    private /* synthetic */ Object f100620d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37980a(C38006o oVar, C37565ef efVar, C69577g gVar) {
        super(2, gVar);
        this.f100618b = oVar;
        this.f100619c = efVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37980a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f100617a
            r2 = 1
            if (r1 == 0) goto L_0x0014
            if (r1 == r2) goto L_0x000e
            p5462h.C69714l.m101134b(r6)
            goto L_0x00aa
        L_0x000e:
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x0012 }
            goto L_0x0026
        L_0x0012:
            r6 = move-exception
            goto L_0x0029
        L_0x0014:
            p5462h.C69714l.m101134b(r6)
            java.lang.Object r6 = r5.f100620d
            kotlinx.coroutines.aw r6 = (kotlinx.coroutines.C71422aw) r6
            com.google.android.libraries.search.c.t.b.a.o r6 = r5.f100618b
            r5.f100617a = r2     // Catch:{ all -> 0x0012 }
            java.lang.Object r6 = r6.mo41201h(r5)     // Catch:{ all -> 0x0012 }
            if (r6 != r0) goto L_0x0026
            return r0
        L_0x0026:
            com.google.android.libraries.search.c.du r6 = (com.google.android.libraries.search.p2904c.C37514du) r6     // Catch:{ all -> 0x0012 }
            goto L_0x002d
        L_0x0029:
            java.lang.Object r6 = p5462h.C69714l.m101133a(r6)
        L_0x002d:
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r6)
            r2 = 2
            if (r1 == 0) goto L_0x008e
            com.google.common.f.e r6 = com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a.C38006o.f100686a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "ALT.AdapterSrcAccessor"
            r6.mo56378ag(r3, r4)
            com.google.common.f.x r6 = r6.mo56382g(r1)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 52931(0xcec3, float:7.4172E-41)
            r3.<init>(r4)
            r6.mo56379ah(r3)
            java.lang.String r3 = "#audio# closeAudioSource failed"
            r6.mo56386p(r3)
            boolean r6 = r1 instanceof com.google.android.libraries.search.p2904c.p2951n.C37902d
            if (r6 == 0) goto L_0x0088
            com.google.android.libraries.search.c.n.d r1 = (com.google.android.libraries.search.p2904c.p2951n.C37902d) r1
            com.google.android.libraries.search.c.eb r6 = r1.f100480a
            int r1 = r6.f99802a
            if (r1 != r2) goto L_0x0076
            java.lang.Object r6 = r6.f99803b
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.android.libraries.search.c.dz r6 = com.google.android.libraries.search.p2904c.C37519dz.m66524a(r6)
            if (r6 != 0) goto L_0x0078
            com.google.android.libraries.search.c.dz r6 = com.google.android.libraries.search.p2904c.C37519dz.UNKNOWN_OPENING_FAILURE
            goto L_0x0078
        L_0x0076:
            com.google.android.libraries.search.c.dz r6 = com.google.android.libraries.search.p2904c.C37519dz.UNKNOWN_OPENING_FAILURE
        L_0x0078:
            java.lang.String r1 = "it.audioSourceOpeningStatus.failure"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.libraries.search.c.ds r1 = com.google.android.libraries.search.p2904c.C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS
            com.google.android.libraries.search.c.ds r6 = com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a.C38009r.m67092a(r6, r1)
            com.google.android.libraries.search.c.du r6 = com.google.android.libraries.search.p2904c.p2942m.p2943a.C37848c.m66814a(r6)
            goto L_0x008e
        L_0x0088:
            com.google.android.libraries.search.c.ds r6 = com.google.android.libraries.search.p2904c.C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS
            com.google.android.libraries.search.c.du r6 = com.google.android.libraries.search.p2904c.p2942m.p2943a.C37848c.m66814a(r6)
        L_0x008e:
            com.google.android.libraries.search.c.du r6 = (com.google.android.libraries.search.p2904c.C37514du) r6
            com.google.android.libraries.search.c.t.b.a.o r1 = r5.f100618b
            kotlinx.coroutines.z r1 = r1.f100696k
            com.google.android.libraries.search.c.ef r3 = r5.f100619c
            com.google.android.libraries.search.c.bw r6 = com.google.android.libraries.search.p2904c.p2942m.p2943a.C37848c.m66816c(r6, r3)
            r1.mo62909P(r6)
            com.google.android.libraries.search.c.t.b.a.o r6 = r5.f100618b
            kotlinx.coroutines.z r6 = r6.f100696k
            r5.f100617a = r2
            java.lang.Object r6 = r6.mo62825a(r5)
            if (r6 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            com.google.android.libraries.search.c.bw r6 = (com.google.android.libraries.search.p2904c.C37418bw) r6
            com.google.android.libraries.search.c.du r6 = r6.f99354b
            if (r6 != 0) goto L_0x00b2
            com.google.android.libraries.search.c.du r6 = com.google.android.libraries.search.p2904c.C37514du.f99629c
        L_0x00b2:
            java.lang.String r0 = "stopListeningCompletable….audioSourceClosingStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a.C37980a.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37980a aVar = new C37980a(this.f100618b, this.f100619c, gVar);
        aVar.f100620d = obj;
        return aVar;
    }
}
