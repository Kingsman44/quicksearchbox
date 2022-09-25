package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.au */
/* compiled from: PG */
public final class C48947au extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48947au f126650b;

    /* renamed from: d */
    private static volatile C63010eb f126651d;

    /* renamed from: a */
    public int f126652a;

    /* renamed from: c */
    private int f126653c;

    static {
        C48947au auVar = new C48947au();
        f126650b = auVar;
        C62942bv.registerDefaultInstance(C48947au.class, auVar);
    }

    private C48947au() {
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
                return newMessageInfo(f126650b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C48946at.m85318b()});
            case 3:
                return new C48947au();
            case 4:
                return new C48944ar();
            case 5:
                return f126650b;
            case 6:
                C63010eb ebVar = f126651d;
                if (ebVar == null) {
                    synchronized (C48947au.class) {
                        ebVar = f126651d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126650b);
                            f126651d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
