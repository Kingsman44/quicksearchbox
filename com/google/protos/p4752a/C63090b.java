package com.google.protos.p4752a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.a.b */
/* compiled from: PG */
public final class C63090b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63090b f170248c;

    /* renamed from: d */
    private static volatile C63010eb f170249d;

    /* renamed from: a */
    public int f170250a;

    /* renamed from: b */
    public C63095g f170251b;

    static {
        C63090b bVar = new C63090b();
        f170248c = bVar;
        C62942bv.registerDefaultInstance(C63090b.class, bVar);
    }

    private C63090b() {
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
                return newMessageInfo(f170248c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C63090b();
            case 4:
                return new C63089a();
            case 5:
                return f170248c;
            case 6:
                C63010eb ebVar = f170249d;
                if (ebVar == null) {
                    synchronized (C63090b.class) {
                        ebVar = f170249d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170248c);
                            f170249d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
