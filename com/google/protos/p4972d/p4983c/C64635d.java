package com.google.protos.p4972d.p4983c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.d.c.d */
/* compiled from: PG */
public final class C64635d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64635d f175215c;

    /* renamed from: d */
    private static volatile C63010eb f175216d;

    /* renamed from: a */
    public C62961ch f175217a = emptyIntList();

    /* renamed from: b */
    public C62971cq f175218b = emptyProtobufList();

    static {
        C64635d dVar = new C64635d();
        f175215c = dVar;
        C62942bv.registerDefaultInstance(C64635d.class, dVar);
    }

    private C64635d() {
    }

    /* renamed from: a */
    public static C64634c m96414a() {
        return (C64634c) f175215c.createBuilder();
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
                return newMessageInfo(f175215c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"a", C64632a.f175214a, "b", C64637f.class});
            case 3:
                return new C64635d();
            case 4:
                return new C64634c();
            case 5:
                return f175215c;
            case 6:
                C63010eb ebVar = f175216d;
                if (ebVar == null) {
                    synchronized (C64635d.class) {
                        ebVar = f175216d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175215c);
                            f175216d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
