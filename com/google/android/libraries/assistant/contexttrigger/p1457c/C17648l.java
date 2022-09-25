package com.google.android.libraries.assistant.contexttrigger.p1457c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.l */
/* compiled from: PG */
public final class C17648l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f50769b = new C17646j();

    /* renamed from: c */
    public static final C17648l f50770c;

    /* renamed from: d */
    private static volatile C63010eb f50771d;

    /* renamed from: a */
    public C62961ch f50772a = emptyIntList();

    static {
        C17648l lVar = new C17648l();
        f50770c = lVar;
        C62942bv.registerDefaultInstance(C17648l.class, lVar);
    }

    private C17648l() {
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
                return newMessageInfo(f50770c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C17651o.m34943b()});
            case 3:
                return new C17648l();
            case 4:
                return new C17647k();
            case 5:
                return f50770c;
            case 6:
                C63010eb ebVar = f50771d;
                if (ebVar == null) {
                    synchronized (C17648l.class) {
                        ebVar = f50771d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50770c);
                            f50771d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
