package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.abc */
/* compiled from: PG */
public final class abc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final abc f158180c;

    /* renamed from: d */
    private static volatile C63010eb f158181d;

    /* renamed from: a */
    public int f158182a;

    /* renamed from: b */
    public boolean f158183b;

    static {
        abc abc = new abc();
        f158180c = abc;
        C62942bv.registerDefaultInstance(abc.class, abc);
    }

    private abc() {
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
                return newMessageInfo(f158180c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            case 3:
                return new abc();
            case 4:
                return new abb();
            case 5:
                return f158180c;
            case 6:
                C63010eb ebVar = f158181d;
                if (ebVar == null) {
                    synchronized (abc.class) {
                        ebVar = f158181d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158180c);
                            f158181d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
