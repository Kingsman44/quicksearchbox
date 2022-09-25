package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53299it;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.eb */
/* compiled from: PG */
public final class C52777eb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52777eb f138473a;

    /* renamed from: d */
    private static volatile C63010eb f138474d;

    /* renamed from: b */
    private int f138475b;

    /* renamed from: c */
    private C53299it f138476c;

    static {
        C52777eb ebVar = new C52777eb();
        f138473a = ebVar;
        C62942bv.registerDefaultInstance(C52777eb.class, ebVar);
    }

    private C52777eb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f138473a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52777eb();
            case 4:
                return new C52776ea();
            case 5:
                return f138473a;
            case 6:
                C63010eb ebVar = f138474d;
                if (ebVar == null) {
                    synchronized (C52777eb.class) {
                        ebVar = f138474d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138473a);
                            f138474d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
