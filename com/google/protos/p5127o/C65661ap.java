package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.ap */
/* compiled from: PG */
public final class C65661ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65661ap f178411c;

    /* renamed from: e */
    private static volatile C63010eb f178412e;

    /* renamed from: a */
    public C65672b f178413a;

    /* renamed from: b */
    public C62971cq f178414b = emptyProtobufList();

    /* renamed from: d */
    private int f178415d;

    static {
        C65661ap apVar = new C65661ap();
        f178411c = apVar;
        C62942bv.registerDefaultInstance(C65661ap.class, apVar);
    }

    private C65661ap() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f178411c, "\u0001\u0002\u0000\u0001\u0002\n\u0002\u0000\u0001\u0000\u0002\u001b\nဉ\u0000", new Object[]{"d", "b", C65667av.class, "a"});
            case 3:
                return new C65661ap();
            case 4:
                return new C65660ao();
            case 5:
                return f178411c;
            case 6:
                C63010eb ebVar = f178412e;
                if (ebVar == null) {
                    synchronized (C65661ap.class) {
                        ebVar = f178412e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178411c);
                            f178412e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
