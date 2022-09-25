package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.alu */
/* compiled from: PG */
public final class alu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final alu f135350b;

    /* renamed from: c */
    private static volatile C63010eb f135351c;

    /* renamed from: a */
    public C62971cq f135352a = C62942bv.emptyProtobufList();

    static {
        alu alu = new alu();
        f135350b = alu;
        C62942bv.registerDefaultInstance(alu.class, alu);
    }

    private alu() {
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
                return newMessageInfo(f135350b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new alu();
            case 4:
                return new alt();
            case 5:
                return f135350b;
            case 6:
                C63010eb ebVar = f135351c;
                if (ebVar == null) {
                    synchronized (alu.class) {
                        ebVar = f135351c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135350b);
                            f135351c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
