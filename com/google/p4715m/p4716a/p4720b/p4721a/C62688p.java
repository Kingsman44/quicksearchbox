package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.p */
/* compiled from: PG */
public final class C62688p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62688p f169251b;

    /* renamed from: c */
    private static volatile C63010eb f169252c;

    /* renamed from: a */
    public C62971cq f169253a = emptyProtobufList();

    static {
        C62688p pVar = new C62688p();
        f169251b = pVar;
        C62942bv.registerDefaultInstance(C62688p.class, pVar);
    }

    private C62688p() {
        emptyIntList();
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
                return newMessageInfo(f169251b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62687o.class});
            case 3:
                return new C62688p();
            case 4:
                return new C62685m();
            case 5:
                return f169251b;
            case 6:
                C63010eb ebVar = f169252c;
                if (ebVar == null) {
                    synchronized (C62688p.class) {
                        ebVar = f169252c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169251b);
                            f169252c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
