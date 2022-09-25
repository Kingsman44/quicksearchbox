package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2911c.C37423a;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2982x.C38229al;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.android.libraries.search.p2904c.p2982x.p2983a.C38208q;
import com.google.android.libraries.search.p2904c.p2982x.p2983a.C38211t;
import com.google.android.libraries.search.p2904c.p2982x.p2983a.C38212u;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.GrpcAudioRequestReadOnlySessionsProviderImpl$getReadOnlyListeningSession$1", mo61344c = "GrpcAudioRequestReadOnlySessionsProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {53})
/* renamed from: com.google.android.libraries.search.c.t.b.u */
/* compiled from: PG */
final class C38050u extends C69572j implements C69630p {

    /* renamed from: a */
    int f100818a;

    /* renamed from: b */
    /* synthetic */ Object f100819b;

    /* renamed from: c */
    final /* synthetic */ C38212u f100820c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38050u(C38212u uVar, C69577g gVar) {
        super(2, gVar);
        this.f100820c = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38050u) mo5194c((C38237at) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C58833ax axVar;
        C58833ax axVar2;
        C58833ax axVar3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f100818a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C38237at atVar = (C38237at) this.f100819b;
            C38212u uVar = this.f100820c;
            this.f100818a = 1;
            if (uVar.f101281e.get()) {
                obj2 = C69788q.f186170a;
            } else {
                int i = atVar.f101335a;
                if (i == 4) {
                    C71816z zVar = uVar.f101287k;
                    C37397bb bbVar = (C37397bb) atVar.f101336b;
                    C69664n.m101060f(bbVar, "response.firstByteReadResult");
                    zVar.mo62909P(bbVar);
                } else if (i == 1) {
                    C38229al alVar = (C38229al) atVar.f101336b;
                    C69664n.m101060f(alVar, "response.startListeningStatusWithTokens");
                    if ((alVar.f101318a & 8) != 0) {
                        C37360ay ayVar = alVar.f101322e;
                        if (ayVar == null) {
                            ayVar = C37360ay.f99224l;
                        }
                        C69664n.m101060f(ayVar, "if (startListeningStatus…\")\n        return\n      }");
                        uVar.f101288l.mo62909P(ayVar);
                        if ((alVar.f101318a & 1) != 0) {
                            C37416bu buVar = alVar.f101319b;
                            if (buVar == null) {
                                buVar = C37416bu.f99347c;
                            }
                            C37561eb ebVar = buVar.f99350b;
                            if (ebVar == null) {
                                ebVar = C37561eb.f99800c;
                            }
                            C69664n.m101060f(ebVar, "if (startListeningStatus…\")\n        return\n      }");
                            if (ebVar.f99802a != 1 || ayVar.f99236k) {
                                axVar = C58836b.f156633a;
                            } else {
                                C37423a a = uVar.f101278b.mo40955a(ayVar);
                                C38208q.m67483a(uVar.f101280d, a);
                                axVar = C69664n.m101061g(a, "<this>");
                            }
                            if (ebVar.f99802a != 1 || !ayVar.f99236k) {
                                axVar2 = C58836b.f156633a;
                            } else {
                                C37446p c = uVar.f101278b.mo40957c(ayVar, C58836b.f156633a);
                                C38208q.m67483a(uVar.f101280d, c);
                                axVar2 = C69664n.m101061g(c, "<this>");
                            }
                            C71816z zVar2 = uVar.f101285i;
                            if (ebVar.f99802a == 1) {
                                axVar3 = C69664n.m101061g(C71663i.m104688a(uVar.f101287k), "<this>");
                            } else {
                                axVar3 = C58836b.f156633a;
                            }
                            zVar2.mo62909P(C37846as.m66798d(axVar, axVar2, ebVar, axVar3));
                        } else {
                            C59052c cVar = (C59052c) C38212u.f101277a.mo56225c();
                            cVar.mo56379ah(new C59094n(53013));
                            cVar.mo56386p("#audio# Invalid listening session response, no start result");
                        }
                    } else {
                        C59052c cVar2 = (C59052c) C38212u.f101277a.mo56225c();
                        cVar2.mo56379ah(new C59094n(53012));
                        cVar2.mo56386p("#audio# Invalid listening session response, no audio params");
                    }
                } else if (i == 5) {
                    C71816z zVar3 = uVar.f101286j;
                    C37418bw bwVar = (C37418bw) atVar.f101336b;
                    C69664n.m101060f(bwVar, "response.stopListeningStatus");
                    zVar3.mo62909P(bwVar);
                } else if (i == 6) {
                    obj2 = C71803m.m105040a(uVar.f101279c, new C38211t(uVar, atVar, (C69577g) null), this);
                } else {
                    C59052c cVar3 = (C59052c) C38212u.f101277a.mo56226d();
                    cVar3.mo56379ah(new C59094n(53010));
                    cVar3.mo56386p("#audio# Invalid listening session response");
                }
                obj2 = C69788q.f186170a;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C38050u uVar = new C38050u(this.f100820c, gVar);
        uVar.f100819b = obj;
        return uVar;
    }
}
