package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.ao */
/* compiled from: PG */
public final class C54311ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54311ao f142679b;

    /* renamed from: c */
    private static volatile C63010eb f142680c;

    /* renamed from: a */
    public C54297aa f142681a;

    static {
        C54311ao aoVar = new C54311ao();
        f142679b = aoVar;
        C62942bv.registerDefaultInstance(C54311ao.class, aoVar);
    }

    private C54311ao() {
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
                return newMessageInfo(f142679b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54311ao();
            case 4:
                return new C54310an();
            case 5:
                return f142679b;
            case 6:
                C63010eb ebVar = f142680c;
                if (ebVar == null) {
                    synchronized (C54311ao.class) {
                        ebVar = f142680c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142679b);
                            f142680c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
