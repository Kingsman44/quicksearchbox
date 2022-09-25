package com.google.knowledge.p4682d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.d.f */
/* compiled from: PG */
public final class C61995f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61995f f167540a;

    /* renamed from: b */
    private static volatile C63010eb f167541b;

    static {
        C61995f fVar = new C61995f();
        f167540a = fVar;
        C62942bv.registerDefaultInstance(C61995f.class, fVar);
    }

    private C61995f() {
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
                return newMessageInfo(f167540a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61995f();
            case 4:
                return new C61994e();
            case 5:
                return f167540a;
            case 6:
                C63010eb ebVar = f167541b;
                if (ebVar == null) {
                    synchronized (C61995f.class) {
                        ebVar = f167541b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167540a);
                            f167541b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
