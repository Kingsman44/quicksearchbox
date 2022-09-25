package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vz */
/* compiled from: PG */
public final class C52552vz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52552vz f137929a;

    /* renamed from: b */
    private static volatile C63010eb f137930b;

    static {
        C52552vz vzVar = new C52552vz();
        f137929a = vzVar;
        C62942bv.registerDefaultInstance(C52552vz.class, vzVar);
    }

    private C52552vz() {
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
                return newMessageInfo(f137929a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52552vz();
            case 4:
                return new C52551vy();
            case 5:
                return f137929a;
            case 6:
                C63010eb ebVar = f137930b;
                if (ebVar == null) {
                    synchronized (C52552vz.class) {
                        ebVar = f137930b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137929a);
                            f137930b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
