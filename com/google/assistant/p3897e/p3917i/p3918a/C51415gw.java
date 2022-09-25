package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.gw */
/* compiled from: PG */
public final class C51415gw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51415gw f133920c;

    /* renamed from: d */
    private static volatile C63010eb f133921d;

    /* renamed from: a */
    public int f133922a;

    /* renamed from: b */
    public long f133923b;

    static {
        C51415gw gwVar = new C51415gw();
        f133920c = gwVar;
        C62942bv.registerDefaultInstance(C51415gw.class, gwVar);
    }

    private C51415gw() {
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
                return newMessageInfo(f133920c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C51415gw();
            case 4:
                return new C51414gv();
            case 5:
                return f133920c;
            case 6:
                C63010eb ebVar = f133921d;
                if (ebVar == null) {
                    synchronized (C51415gw.class) {
                        ebVar = f133921d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133920c);
                            f133921d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
