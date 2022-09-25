package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.cg */
/* compiled from: PG */
public final class C66861cg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66861cg f181783b;

    /* renamed from: c */
    private static volatile C63010eb f181784c;

    /* renamed from: a */
    public C62971cq f181785a = emptyProtobufList();

    static {
        C66861cg cgVar = new C66861cg();
        f181783b = cgVar;
        C62942bv.registerDefaultInstance(C66861cg.class, cgVar);
    }

    private C66861cg() {
    }

    /* renamed from: a */
    public final void mo59746a() {
        C62971cq cqVar = this.f181785a;
        if (!cqVar.mo58948c()) {
            this.f181785a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f181783b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66865ck.class});
            case 3:
                return new C66861cg();
            case 4:
                return new C66860cf();
            case 5:
                return f181783b;
            case 6:
                C63010eb ebVar = f181784c;
                if (ebVar == null) {
                    synchronized (C66861cg.class) {
                        ebVar = f181784c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181783b);
                            f181784c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
