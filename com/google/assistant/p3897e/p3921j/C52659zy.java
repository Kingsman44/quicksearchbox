package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.zy */
/* compiled from: PG */
public final class C52659zy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52659zy f138244c;

    /* renamed from: d */
    private static volatile C63010eb f138245d;

    /* renamed from: a */
    public int f138246a;

    /* renamed from: b */
    public int f138247b;

    static {
        C52659zy zyVar = new C52659zy();
        f138244c = zyVar;
        C62942bv.registerDefaultInstance(C52659zy.class, zyVar);
    }

    private C52659zy() {
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
                return newMessageInfo(f138244c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52658zx.f138243a});
            case 3:
                return new C52659zy();
            case 4:
                return new C52657zw();
            case 5:
                return f138244c;
            case 6:
                C63010eb ebVar = f138245d;
                if (ebVar == null) {
                    synchronized (C52659zy.class) {
                        ebVar = f138245d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138244c);
                            f138245d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
