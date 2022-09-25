package com.google.android.libraries.search.p3091p.p3092a.p3093a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66629d;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.p.a.a.b */
/* compiled from: PG */
public final class C39841b implements C17268f {

    /* renamed from: a */
    private static final C59071e f104751a = C59071e.m91332i("com.google.android.libraries.search.p.a.a.b");

    /* renamed from: b */
    private final Set f104752b;

    public C39841b(Set set) {
        this.f104752b = set;
    }

    /* renamed from: a */
    public final void mo23256a() {
        ((C59052c) ((C59052c) f104751a.mo56224b()).mo56372aa(53879)).mo56386p("#onCompleted");
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f104751a.mo56226d()).mo56382g(th)).mo56372aa(53880)).mo56386p("#onError");
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        Object obj;
        C58833ax axVar;
        C62940bt r0 = C62942bv.checkIsLite(C66629d.f181275b);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            ((C59052c) ((C59052c) f104751a.mo56224b()).mo56372aa(53881)).mo56386p("#onNext");
            C62940bt r02 = C62942bv.checkIsLite(C66629d.f181275b);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C51195j jVar = (C51195j) obj;
            if ((jVar.f133266a & 128) != 0 && !this.f104752b.isEmpty()) {
                C52081en enVar = jVar.f133275j;
                if (enVar == null) {
                    enVar = C52081en.f136679i;
                }
                if ((enVar.f136681a & 16) != 0) {
                    C52091ex exVar = enVar.f136685e;
                    if (exVar == null) {
                        exVar = C52091ex.f136710b;
                    }
                    for (C52232kc kcVar : exVar.f136712a) {
                        if ("asst.response.logging.params".equals(kcVar.f137065b)) {
                            C52230ka kaVar = kcVar.f137066c;
                            if (kaVar == null) {
                                kaVar = C52230ka.f137057d;
                            }
                            if ("assistant.api.params.ResponseLoggingParams".equals(kaVar.f137060b)) {
                                C52230ka kaVar2 = kcVar.f137066c;
                                if (kaVar2 == null) {
                                    kaVar2 = C52230ka.f137057d;
                                }
                                C63088z zVar = kaVar2.f137061c;
                                try {
                                    axVar = C58833ax.m90834k((C51544lq) C62942bv.parseFrom((C62942bv) C51544lq.f134342j, zVar, C62921ba.m95368a()));
                                } catch (C62974ct e) {
                                    ((C59052c) ((C59052c) ((C59052c) f104751a.mo56226d()).mo56382g(e)).mo56372aa(53878)).mo56386p("Failed to decode ResponseLoggingParams");
                                    axVar = C58836b.f156633a;
                                }
                                if (axVar.mo56113h() && (((C51544lq) axVar.mo56107c()).f134344a & 8) != 0) {
                                    String str = ((C51544lq) axVar.mo56107c()).f134346c;
                                    if (!C58837ba.m90859h(str)) {
                                        for (C39840a aVar : this.f104752b) {
                                            if (!C58837ba.m90859h(str)) {
                                                ((C59052c) ((C59052c) C39840a.f104750a.mo56224b()).mo56372aa(53877)).mo56389s("Sherlog: %s", str);
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
