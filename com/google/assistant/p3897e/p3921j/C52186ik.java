package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ik */
/* compiled from: PG */
public final class C52186ik extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52186ik f136967d;

    /* renamed from: f */
    private static volatile C63010eb f136968f;

    /* renamed from: a */
    public int f136969a;

    /* renamed from: b */
    public C52159hk f136970b;

    /* renamed from: c */
    public C52568wo f136971c;

    /* renamed from: e */
    private byte f136972e = 2;

    static {
        C52186ik ikVar = new C52186ik();
        f136967d = ikVar;
        C62942bv.registerDefaultInstance(C52186ik.class, ikVar);
    }

    private C52186ik() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136972e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136972e = b;
                return null;
            case 2:
                return newMessageInfo(f136967d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52186ik();
            case 4:
                return new C52185ij();
            case 5:
                return f136967d;
            case 6:
                C63010eb ebVar = f136968f;
                if (ebVar == null) {
                    synchronized (C52186ik.class) {
                        ebVar = f136968f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136967d);
                            f136968f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
