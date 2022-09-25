package com.google.p4017at.p4027c.p4028a.p4029a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.ac */
/* compiled from: PG */
public final class C53837ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53837ac f141302a;

    /* renamed from: b */
    private static volatile C63010eb f141303b;

    static {
        C53837ac acVar = new C53837ac();
        f141302a = acVar;
        C62942bv.registerDefaultInstance(C53837ac.class, acVar);
    }

    private C53837ac() {
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
                return newMessageInfo(f141302a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C53837ac();
            case 4:
                return new C53836ab();
            case 5:
                return f141302a;
            case 6:
                C63010eb ebVar = f141303b;
                if (ebVar == null) {
                    synchronized (C53837ac.class) {
                        ebVar = f141303b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141302a);
                            f141303b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
