package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ho */
/* compiled from: PG */
public final class C52163ho extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52163ho f136875d;

    /* renamed from: e */
    private static volatile C63010eb f136876e;

    /* renamed from: a */
    public int f136877a;

    /* renamed from: b */
    public int f136878b;

    /* renamed from: c */
    public boolean f136879c;

    static {
        C52163ho hoVar = new C52163ho();
        f136875d = hoVar;
        C62942bv.registerDefaultInstance(C52163ho.class, hoVar);
    }

    private C52163ho() {
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
                return newMessageInfo(f136875d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C52161hm.m86525b(), C45240c.f118157a});
            case 3:
                return new C52163ho();
            case 4:
                return new C52162hn();
            case 5:
                return f136875d;
            case 6:
                C63010eb ebVar = f136876e;
                if (ebVar == null) {
                    synchronized (C52163ho.class) {
                        ebVar = f136876e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136875d);
                            f136876e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
