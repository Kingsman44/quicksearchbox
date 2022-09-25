package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.android.libraries.assistant.p1467d.p1471b.C17825k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.ay */
/* compiled from: PG */
public final class C17895ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17895ay f51269b;

    /* renamed from: d */
    private static volatile C63010eb f51270d;

    /* renamed from: a */
    public int f51271a;

    /* renamed from: c */
    private int f51272c;

    static {
        C17895ay ayVar = new C17895ay();
        f51269b = ayVar;
        C62942bv.registerDefaultInstance(C17895ay.class, ayVar);
    }

    private C17895ay() {
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
                return newMessageInfo(f51269b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C17825k.m35072b()});
            case 3:
                return new C17895ay();
            case 4:
                return new C17894ax();
            case 5:
                return f51269b;
            case 6:
                C63010eb ebVar = f51270d;
                if (ebVar == null) {
                    synchronized (C17895ay.class) {
                        ebVar = f51270d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51269b);
                            f51270d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
