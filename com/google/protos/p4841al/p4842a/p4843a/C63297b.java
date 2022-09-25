package com.google.protos.p4841al.p4842a.p4843a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.al.a.a.b */
/* compiled from: PG */
public final class C63297b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63297b f171058c;

    /* renamed from: e */
    private static volatile C63010eb f171059e;

    /* renamed from: a */
    public float f171060a;

    /* renamed from: b */
    public float f171061b;

    /* renamed from: d */
    private int f171062d;

    static {
        C63297b bVar = new C63297b();
        f171058c = bVar;
        C62942bv.registerDefaultInstance(C63297b.class, bVar);
    }

    private C63297b() {
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
                return newMessageInfo(f171058c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0003ခ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C63297b();
            case 4:
                return new C63296a();
            case 5:
                return f171058c;
            case 6:
                C63010eb ebVar = f171059e;
                if (ebVar == null) {
                    synchronized (C63297b.class) {
                        ebVar = f171059e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171058c);
                            f171059e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
