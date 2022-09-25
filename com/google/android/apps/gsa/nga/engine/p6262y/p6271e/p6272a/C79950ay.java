package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ay */
/* compiled from: PG */
public final class C79950ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C79950ay f219259c;

    /* renamed from: d */
    private static volatile C63010eb f219260d;

    /* renamed from: a */
    public int f219261a;

    /* renamed from: b */
    public float f219262b;

    static {
        C79950ay ayVar = new C79950ay();
        f219259c = ayVar;
        C62942bv.registerDefaultInstance(C79950ay.class, ayVar);
    }

    private C79950ay() {
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
                return newMessageInfo(f219259c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C79950ay();
            case 4:
                return new C79949ax();
            case 5:
                return f219259c;
            case 6:
                C63010eb ebVar = f219260d;
                if (ebVar == null) {
                    synchronized (C79950ay.class) {
                        ebVar = f219260d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219259c);
                            f219260d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
