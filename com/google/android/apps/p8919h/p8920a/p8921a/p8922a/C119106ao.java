package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.h.a.a.a.ao */
/* compiled from: PG */
public final class C119106ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119106ao f332233c;

    /* renamed from: d */
    private static volatile C63010eb f332234d;

    /* renamed from: a */
    public int f332235a;

    /* renamed from: b */
    public int f332236b;

    static {
        C119106ao aoVar = new C119106ao();
        f332233c = aoVar;
        C62942bv.registerDefaultInstance(C119106ao.class, aoVar);
    }

    private C119106ao() {
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
                return newMessageInfo(f332233c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C119106ao();
            case 4:
                return new C119105an();
            case 5:
                return f332233c;
            case 6:
                C63010eb ebVar = f332234d;
                if (ebVar == null) {
                    synchronized (C119106ao.class) {
                        ebVar = f332234d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332233c);
                            f332234d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
