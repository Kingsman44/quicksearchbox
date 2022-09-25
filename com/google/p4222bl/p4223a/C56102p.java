package com.google.p4222bl.p4223a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.p */
/* compiled from: PG */
public final class C56102p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56102p f149450b;

    /* renamed from: c */
    private static volatile C63010eb f149451c;

    /* renamed from: a */
    public C62971cq f149452a = C62942bv.emptyProtobufList();

    static {
        C56102p pVar = new C56102p();
        f149450b = pVar;
        C62942bv.registerDefaultInstance(C56102p.class, pVar);
    }

    private C56102p() {
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
                return newMessageInfo(f149450b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C56102p();
            case 4:
                return new C56101o();
            case 5:
                return f149450b;
            case 6:
                C63010eb ebVar = f149451c;
                if (ebVar == null) {
                    synchronized (C56102p.class) {
                        ebVar = f149451c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149450b);
                            f149451c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
