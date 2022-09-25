package com.google.frameworks.client.data.android.p4636d.p4637a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4541l.C59326i;
import com.google.frameworks.client.data.C61629e;
import com.google.frameworks.client.data.C61630f;
import com.google.frameworks.client.data.C61631g;
import com.google.frameworks.client.data.C61632h;
import com.google.frameworks.client.data.android.p4636d.C61402a;
import com.google.frameworks.client.data.android.p4636d.C61404b;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import com.google.frameworks.client.data.p4631a.C61331a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;

/* renamed from: com.google.frameworks.client.data.android.d.a.a */
/* compiled from: PG */
public final class C61403a implements C61485f {

    /* renamed from: a */
    static final C70297cz f166042a = C70297cz.m102495c(C61331a.m93818a(C61630f.f166514c.f169971d.f169964b), C70334de.f187480b);

    /* renamed from: b */
    static final C70297cz f166043b = C70297cz.m102495c(C61331a.m93818a(C61632h.f166518d.f169971d.f169964b), C70334de.f187480b);

    /* renamed from: c */
    private final C61402a f166044c;

    /* renamed from: d */
    private final C61404b f166045d;

    /* renamed from: e */
    private C58485gu f166046e;

    /* renamed from: f */
    private int f166047f;

    public C61403a(C61402a aVar) {
        this.f166044c = aVar;
        this.f166045d = aVar.mo58008b();
    }

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        this.f166046e = this.f166045d.mo58009a();
        this.f166047f = 2;
        if (!((Boolean) this.f166044c.mo58007a().mo6453a()).booleanValue() || this.f166046e.isEmpty() || this.f166047f != 2) {
            return C61479al.f166225a;
        }
        C70334de deVar = bVar.f166235a;
        C70297cz czVar = f166042a;
        C58485gu guVar = this.f166046e;
        C61629e eVar = (C61629e) C61630f.f166513b.createBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C63088z A = C63088z.m96139A(C59326i.f157517e.mo56836k((String) guVar.get(i)));
            eVar.copyOnWrite();
            C61630f fVar = (C61630f) eVar.instance;
            C62971cq cqVar = fVar.f166516a;
            if (!cqVar.mo58948c()) {
                fVar.f166516a = C62942bv.mutableCopy(cqVar);
            }
            fVar.f166516a.add(A);
        }
        deVar.mo62033h(czVar, ((C61630f) eVar.build()).toByteArray());
        return C61479al.f166225a;
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final C61480am mo39486d(C61483d dVar) {
        if (!((Boolean) this.f166044c.mo58007a().mo6453a()).booleanValue() || this.f166047f != 2) {
            return C61480am.f166232a;
        }
        byte[] bArr = (byte[]) dVar.f166239a.mo62027b(f166043b);
        if (bArr != null) {
            try {
                C61632h hVar = (C61632h) ((C61631g) ((C61631g) C61632h.f166517c.createBuilder()).mergeFrom(bArr, C62921ba.m95368a())).build();
                if ((hVar.f166520a & 1) != 0) {
                    C61404b bVar = this.f166045d;
                    C63088z zVar = hVar.f166521b;
                    bVar.mo58010b();
                }
            } catch (C62974ct e) {
                throw new RuntimeException(e);
            }
        }
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
