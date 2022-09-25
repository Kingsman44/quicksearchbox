package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fg */
/* compiled from: PG */
public final class C62538fg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62538fg f168846b;

    /* renamed from: c */
    private static volatile C63010eb f168847c;

    /* renamed from: a */
    public C62961ch f168848a = emptyIntList();

    static {
        C62538fg fgVar = new C62538fg();
        f168846b = fgVar;
        C62942bv.registerDefaultInstance(C62538fg.class, fgVar);
    }

    private C62538fg() {
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
                return newMessageInfo(f168846b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C62538fg();
            case 4:
                return new C62537ff();
            case 5:
                return f168846b;
            case 6:
                C63010eb ebVar = f168847c;
                if (ebVar == null) {
                    synchronized (C62538fg.class) {
                        ebVar = f168847c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168846b);
                            f168847c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
