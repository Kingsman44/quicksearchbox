package com.google.android.libraries.assistant.portable.p1586b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.am */
/* compiled from: PG */
public final class C19069am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19069am f53489c;

    /* renamed from: d */
    private static volatile C63010eb f53490d;

    /* renamed from: a */
    public int f53491a = 0;

    /* renamed from: b */
    public Object f53492b;

    static {
        C19069am amVar = new C19069am();
        f53489c = amVar;
        C62942bv.registerDefaultInstance(C19069am.class, amVar);
    }

    private C19069am() {
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
                return newMessageInfo(f53489c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C19070b.class});
            case 3:
                return new C19069am();
            case 4:
                return new C19068al();
            case 5:
                return f53489c;
            case 6:
                C63010eb ebVar = f53490d;
                if (ebVar == null) {
                    synchronized (C19069am.class) {
                        ebVar = f53490d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53489c);
                            f53490d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
