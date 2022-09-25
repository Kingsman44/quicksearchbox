package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.ab */
/* compiled from: PG */
public final class C52812ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52812ab f138567a;

    /* renamed from: b */
    private static volatile C63010eb f138568b;

    static {
        C52812ab abVar = new C52812ab();
        f138567a = abVar;
        C62942bv.registerDefaultInstance(C52812ab.class, abVar);
    }

    private C52812ab() {
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
                return newMessageInfo(f138567a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52812ab();
            case 4:
                return new C52811aa();
            case 5:
                return f138567a;
            case 6:
                C63010eb ebVar = f138568b;
                if (ebVar == null) {
                    synchronized (C52812ab.class) {
                        ebVar = f138568b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138567a);
                            f138568b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
