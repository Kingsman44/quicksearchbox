package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aff */
/* compiled from: PG */
public final class aff extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aff f134995c;

    /* renamed from: d */
    private static volatile C63010eb f134996d;

    /* renamed from: a */
    public int f134997a;

    /* renamed from: b */
    public int f134998b;

    static {
        aff aff = new aff();
        f134995c = aff;
        C62942bv.registerDefaultInstance(aff.class, aff);
    }

    private aff() {
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
                return newMessageInfo(f134995c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            case 3:
                return new aff();
            case 4:
                return new afe();
            case 5:
                return f134995c;
            case 6:
                C63010eb ebVar = f134996d;
                if (ebVar == null) {
                    synchronized (aff.class) {
                        ebVar = f134996d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134995c);
                            f134996d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
