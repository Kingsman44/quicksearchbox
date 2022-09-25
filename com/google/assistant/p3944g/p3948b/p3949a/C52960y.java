package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.y */
/* compiled from: PG */
public final class C52960y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52960y f138856c;

    /* renamed from: d */
    private static volatile C63010eb f138857d;

    /* renamed from: a */
    public int f138858a;

    /* renamed from: b */
    public int f138859b;

    static {
        C52960y yVar = new C52960y();
        f138856c = yVar;
        C62942bv.registerDefaultInstance(C52960y.class, yVar);
    }

    private C52960y() {
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
                return newMessageInfo(f138856c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52959x.f138855a});
            case 3:
                return new C52960y();
            case 4:
                return new C52958w();
            case 5:
                return f138856c;
            case 6:
                C63010eb ebVar = f138857d;
                if (ebVar == null) {
                    synchronized (C52960y.class) {
                        ebVar = f138857d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138856c);
                            f138857d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
