package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ec */
/* compiled from: PG */
public final class C52070ec extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52070ec f136651d;

    /* renamed from: e */
    private static volatile C63010eb f136652e;

    /* renamed from: a */
    public int f136653a;

    /* renamed from: b */
    public C52236kg f136654b;

    /* renamed from: c */
    public C52069eb f136655c;

    static {
        C52070ec ecVar = new C52070ec();
        f136651d = ecVar;
        C62942bv.registerDefaultInstance(C52070ec.class, ecVar);
    }

    private C52070ec() {
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
                return newMessageInfo(f136651d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52070ec();
            case 4:
                return new C51810dz();
            case 5:
                return f136651d;
            case 6:
                C63010eb ebVar = f136652e;
                if (ebVar == null) {
                    synchronized (C52070ec.class) {
                        ebVar = f136652e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136651d);
                            f136652e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
