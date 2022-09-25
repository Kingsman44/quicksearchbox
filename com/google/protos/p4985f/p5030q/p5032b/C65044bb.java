package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.bb */
/* compiled from: PG */
public final class C65044bb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65044bb f176144b;

    /* renamed from: c */
    private static volatile C63010eb f176145c;

    /* renamed from: a */
    public C62971cq f176146a = emptyProtobufList();

    static {
        C65044bb bbVar = new C65044bb();
        f176144b = bbVar;
        C62942bv.registerDefaultInstance(C65044bb.class, bbVar);
    }

    private C65044bb() {
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
                return newMessageInfo(f176144b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65041az.class});
            case 3:
                return new C65044bb();
            case 4:
                return new C65043ba();
            case 5:
                return f176144b;
            case 6:
                C63010eb ebVar = f176145c;
                if (ebVar == null) {
                    synchronized (C65044bb.class) {
                        ebVar = f176145c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176144b);
                            f176145c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
