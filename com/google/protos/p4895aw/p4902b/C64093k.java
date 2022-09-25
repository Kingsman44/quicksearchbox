package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.k */
/* compiled from: PG */
public final class C64093k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64093k f173280b;

    /* renamed from: c */
    private static volatile C63010eb f173281c;

    /* renamed from: a */
    public C62971cq f173282a = emptyProtobufList();

    static {
        C64093k kVar = new C64093k();
        f173280b = kVar;
        C62942bv.registerDefaultInstance(C64093k.class, kVar);
    }

    private C64093k() {
    }

    /* renamed from: a */
    public final void mo59259a() {
        C62971cq cqVar = this.f173282a;
        if (!cqVar.mo58948c()) {
            this.f173282a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f173280b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64091i.class});
            case 3:
                return new C64093k();
            case 4:
                return new C64092j();
            case 5:
                return f173280b;
            case 6:
                C63010eb ebVar = f173281c;
                if (ebVar == null) {
                    synchronized (C64093k.class) {
                        ebVar = f173281c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173280b);
                            f173281c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
