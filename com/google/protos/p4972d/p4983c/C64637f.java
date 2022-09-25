package com.google.protos.p4972d.p4983c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.d.c.f */
/* compiled from: PG */
public final class C64637f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64637f f175219c;

    /* renamed from: d */
    private static volatile C63010eb f175220d;

    /* renamed from: a */
    public C62961ch f175221a = emptyIntList();

    /* renamed from: b */
    public C62971cq f175222b = emptyProtobufList();

    static {
        C64637f fVar = new C64637f();
        f175219c = fVar;
        C62942bv.registerDefaultInstance(C64637f.class, fVar);
    }

    private C64637f() {
    }

    /* renamed from: a */
    public static C64636e m96417a() {
        return (C64636e) f175219c.createBuilder();
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
                return newMessageInfo(f175219c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"a", C64632a.f175214a, "b", C64635d.class});
            case 3:
                return new C64637f();
            case 4:
                return new C64636e();
            case 5:
                return f175219c;
            case 6:
                C63010eb ebVar = f175220d;
                if (ebVar == null) {
                    synchronized (C64637f.class) {
                        ebVar = f175220d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175219c);
                            f175220d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
