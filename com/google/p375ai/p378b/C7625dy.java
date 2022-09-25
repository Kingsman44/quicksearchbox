package com.google.p375ai.p378b;

import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.dy */
/* compiled from: PG */
public final class C7625dy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7625dy f26342c;

    /* renamed from: e */
    private static volatile C63010eb f26343e;

    /* renamed from: a */
    public int f26344a;

    /* renamed from: b */
    public C55893j f26345b;

    /* renamed from: d */
    private int f26346d;

    static {
        C7625dy dyVar = new C7625dy();
        f26342c = dyVar;
        C62942bv.registerDefaultInstance(C7625dy.class, dyVar);
    }

    private C7625dy() {
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
                return newMessageInfo(f26342c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", C7623dw.f26341a, "b"});
            case 3:
                return new C7625dy();
            case 4:
                return new C7622dv();
            case 5:
                return f26342c;
            case 6:
                C63010eb ebVar = f26343e;
                if (ebVar == null) {
                    synchronized (C7625dy.class) {
                        ebVar = f26343e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26342c);
                            f26343e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
