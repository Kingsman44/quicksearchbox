package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.shared.p6926d.C87540b;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.ay */
/* compiled from: PG */
public final class C85806ay {

    /* renamed from: a */
    private final C68214a f232026a;

    /* renamed from: b */
    private final C118827a f232027b;

    public C85806ay(C68214a aVar, C118827a aVar2) {
        this.f232026a = aVar;
        this.f232027b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo79450a() {
        /*
            r6 = this;
            com.google.android.apps.gsa.y.a r0 = r6.f232027b
            com.google.android.apps.gsa.u.b r1 = com.google.android.apps.gsa.p8852u.C118569b.GMM_STATE_PARAMS_PROTO_FILLER_GRPC_FETCH_COUNT
            com.google.android.apps.gsa.u.h r2 = com.google.android.apps.gsa.p8852u.C118575h.ASSISTANT_AUTO
            com.google.android.apps.gsa.y.a.d r0 = r0.mo77944g(r1, r2)
            r1 = 1
            r0.mo104025g(r1)
            com.google.assistant.e.i.a.ha r0 = com.google.assistant.p3897e.p3917i.p3918a.C51420ha.f133933d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.i.a.gx r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51416gx) r0
            dagger.a r1 = r6.f232026a
            java.lang.Object r1 = r1.mo27525b()
            r2 = 2
            if (r1 == 0) goto L_0x0040
            dagger.a r1 = r6.f232026a
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r1 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r1
            boolean r1 = r1.mo81639A()
            if (r1 == 0) goto L_0x0030
            r1 = 3
            goto L_0x0041
        L_0x0030:
            dagger.a r1 = r6.f232026a
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r1 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r1
            boolean r1 = r1.mo81664z()
            if (r1 == 0) goto L_0x0040
            r1 = 4
            goto L_0x0041
        L_0x0040:
            r1 = 2
        L_0x0041:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.i.a.ha r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51420ha) r3
            int r1 = r1 + -1
            r3.f133937c = r1
            int r1 = r3.f133935a
            r1 = r1 | r2
            r3.f133935a = r1
            dagger.a r1 = r6.f232026a
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r1 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r1
            com.google.protobuf.z r1 = r1.mo81651m()
            if (r1 == 0) goto L_0x006e
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.i.a.ha r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51420ha) r3
            int r4 = r3.f133935a
            r4 = r4 | 1
            r3.f133935a = r4
            r3.f133936b = r1
        L_0x006e:
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.i.a.ha r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51420ha) r0
            com.google.assistant.e.j.kc r1 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kb r1 = (com.google.assistant.p3897e.p3921j.C52231kb) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            int r4 = r3.f137064a
            r4 = r4 | 1
            r3.f137064a = r4
            java.lang.String r4 = "asst.gmm.state.params"
            r3.f137065b = r4
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.jz r3 = (com.google.assistant.p3897e.p3921j.C52228jz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            int r5 = r4.f137059a
            r5 = r5 | 1
            r4.f137059a = r5
            java.lang.String r5 = "assistant.api.params.GmmStateParams"
            r4.f137060b = r5
            com.google.protobuf.z r0 = r0.toByteString()
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            r0.getClass()
            int r5 = r4.f137059a
            r5 = r5 | r2
            r4.f137059a = r5
            r4.f137061c = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            r0.getClass()
            r3.f137066c = r0
            int r0 = r3.f137064a
            r0 = r0 | r2
            r3.f137064a = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6790a.C85806ay.mo79450a():com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C55876h mo79451b() {
        C55876h hVar = null;
        if (this.f232026a.mo27525b() == null) {
            return null;
        }
        C87541c cVar = (C87541c) this.f232026a.mo27525b();
        synchronized (cVar.f236439a) {
            C87540b bVar = cVar.f236449k;
            if (bVar.f236436a.mo26871c() - bVar.f236438c <= 120000) {
                hVar = bVar.f236437b;
            }
        }
        return hVar;
    }
}
