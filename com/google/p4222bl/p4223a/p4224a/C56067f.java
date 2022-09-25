package com.google.p4222bl.p4223a.p4224a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.f */
/* compiled from: PG */
public final class C56067f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56067f f149389b;

    /* renamed from: c */
    private static volatile C63010eb f149390c;

    /* renamed from: a */
    public C62971cq f149391a = emptyProtobufList();

    static {
        C56067f fVar = new C56067f();
        f149389b = fVar;
        C62942bv.registerDefaultInstance(C56067f.class, fVar);
    }

    private C56067f() {
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
                return newMessageInfo(f149389b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C56065d.class});
            case 3:
                return new C56067f();
            case 4:
                return new C56066e();
            case 5:
                return f149389b;
            case 6:
                C63010eb ebVar = f149390c;
                if (ebVar == null) {
                    synchronized (C56067f.class) {
                        ebVar = f149390c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149389b);
                            f149390c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
