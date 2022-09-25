package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j;

import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95874b;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48081bo;
import com.google.assistant.p3739a.p3740a.C48100cg;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Deque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.j.h */
/* compiled from: PG */
final class C95017h implements C94934b {

    /* renamed from: a */
    final /* synthetic */ C95018i f265830a;

    public C95017h(C95018i iVar) {
        this.f265830a = iVar;
    }

    /* renamed from: A */
    public final boolean mo88653A() {
        return true;
    }

    /* renamed from: c */
    public final void mo88657c(C94936d dVar) {
    }

    /* renamed from: d */
    public final void mo88658d(C94936d dVar) {
    }

    /* renamed from: q */
    public final void mo88662q(C94936d dVar, Deque deque) {
        if (dVar == C94936d.TTS_OUTPUT) {
            C59071e eVar = C95018i.f265831a;
            C58976aa aaVar = C58975e.f156826a;
            deque.size();
            boolean z = C95874b.f268447a.f268448b;
        }
    }

    /* renamed from: s */
    public final void mo88663s(C94936d dVar, byte[] bArr) {
        try {
            if (dVar == C94936d.CONTROL_OUTPUT) {
                C48065az azVar = (C48065az) C62942bv.parseFrom((C62942bv) C48065az.f124397c, bArr, C62921ba.f169869a);
                C95874b bVar = C95874b.f268447a;
                C95874b.f268447a.mo89830a(new ProtoLiteParcelable((MessageLite) azVar));
                C59104x b = C95018i.f265831a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "LocalConnection");
                ((C59052c) ((C59052c) b).mo56372aa(17887)).mo56389s("HostRequest : %s", azVar);
                char c = 2;
                if (azVar.f124399a == 2) {
                    C48100cg cgVar = (C48100cg) azVar.f124400b;
                    int i = cgVar.f124493b;
                    if (i != 0) {
                        c = i != 1 ? i != 2 ? i != 3 ? i != 4 ? (char) 0 : 6 : 5 : 4 : 3;
                    }
                    if (c != 0) {
                        if (c == 5) {
                            this.f265830a.f265833c.mo88869h();
                            return;
                        }
                    }
                    if (cgVar.f124496e) {
                        this.f265830a.mo88928b(false, false);
                    }
                }
            } else if (dVar == C94936d.PROXY_OUTPUT) {
                C62921ba baVar = C62921ba.f169869a;
                C95874b bVar2 = C95874b.f268447a;
                C59104x b2 = C95018i.f265831a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "LocalConnection");
                ((C59052c) ((C59052c) b2).mo56372aa(17885)).mo56389s("ProxyHostRequest : %s", (C48081bo) C62942bv.parseFrom((C62942bv) C48081bo.f124437c, bArr, baVar));
            }
        } catch (IOException e) {
            C59104x c2 = C95018i.f265831a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "LocalConnection");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(17886)).mo56386p("Failed to parse data");
        }
    }
}
