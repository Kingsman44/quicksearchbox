package com.google.p4242bp.p4257f.p4264d.p4265a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.d.a.f */
/* compiled from: PG */
public final class C56350f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56350f f150288b;

    /* renamed from: c */
    private static volatile C63010eb f150289c;

    /* renamed from: a */
    public C62971cq f150290a = emptyProtobufList();

    static {
        C56350f fVar = new C56350f();
        f150288b = fVar;
        C62942bv.registerDefaultInstance(C56350f.class, fVar);
    }

    private C56350f() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f150288b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C56348d.class});
            case 3:
                return new C56350f();
            case 4:
                return new C56349e();
            case 5:
                return f150288b;
            case 6:
                C63010eb ebVar = f150289c;
                if (ebVar == null) {
                    synchronized (C56350f.class) {
                        ebVar = f150289c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150288b);
                            f150289c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
