package com.google.protos.p5146w.p5147a.p5148a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.w.a.a.d */
/* compiled from: PG */
public final class C65926d extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C65926d f179289b;

    /* renamed from: d */
    private static volatile C63010eb f179290d;

    /* renamed from: a */
    public C62971cq f179291a = emptyProtobufList();

    /* renamed from: c */
    private byte f179292c = 2;

    static {
        C65926d dVar = new C65926d();
        f179289b = dVar;
        C62942bv.registerDefaultInstance(C65926d.class, dVar);
    }

    private C65926d() {
    }

    /* renamed from: a */
    public final void mo59440a() {
        C62971cq cqVar = this.f179291a;
        if (!cqVar.mo58948c()) {
            this.f179291a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179292c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179292c = b;
                return null;
            case 2:
                return newMessageInfo(f179289b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65930h.class});
            case 3:
                return new C65926d();
            case 4:
                return new C65925c();
            case 5:
                return f179289b;
            case 6:
                C63010eb ebVar = f179290d;
                if (ebVar == null) {
                    synchronized (C65926d.class) {
                        ebVar = f179290d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179289b);
                            f179290d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
