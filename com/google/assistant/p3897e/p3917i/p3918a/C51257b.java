package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4986a.C64655ai;

/* renamed from: com.google.assistant.e.i.a.b */
/* compiled from: PG */
public final class C51257b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51257b f133440b;

    /* renamed from: c */
    private static volatile C63010eb f133441c;

    /* renamed from: a */
    public C62971cq f133442a = emptyProtobufList();

    static {
        C51257b bVar = new C51257b();
        f133440b = bVar;
        C62942bv.registerDefaultInstance(C51257b.class, bVar);
    }

    private C51257b() {
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
                return newMessageInfo(f133440b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64655ai.class});
            case 3:
                return new C51257b();
            case 4:
                return new C51230a();
            case 5:
                return f133440b;
            case 6:
                C63010eb ebVar = f133441c;
                if (ebVar == null) {
                    synchronized (C51257b.class) {
                        ebVar = f133441c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133440b);
                            f133441c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
