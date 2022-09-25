package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.dd */
/* compiled from: PG */
public final class C52752dd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52752dd f138441a;

    /* renamed from: b */
    private static volatile C63010eb f138442b;

    static {
        C52752dd ddVar = new C52752dd();
        f138441a = ddVar;
        C62942bv.registerDefaultInstance(C52752dd.class, ddVar);
    }

    private C52752dd() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f138441a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52752dd();
            case 4:
                return new C52751dc();
            case 5:
                return f138441a;
            case 6:
                C63010eb ebVar = f138442b;
                if (ebVar == null) {
                    synchronized (C52752dd.class) {
                        ebVar = f138442b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138441a);
                            f138442b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
