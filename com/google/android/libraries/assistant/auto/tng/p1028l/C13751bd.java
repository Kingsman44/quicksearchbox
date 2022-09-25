package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.bd */
/* compiled from: PG */
public final class C13751bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C13751bd f41927b;

    /* renamed from: d */
    private static volatile C63010eb f41928d;

    /* renamed from: a */
    public int f41929a;

    /* renamed from: c */
    private int f41930c;

    static {
        C13751bd bdVar = new C13751bd();
        f41927b = bdVar;
        C62942bv.registerDefaultInstance(C13751bd.class, bdVar);
    }

    private C13751bd() {
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
                return newMessageInfo(f41927b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C13750bc.m30000b()});
            case 3:
                return new C13751bd();
            case 4:
                return new C13748ba();
            case 5:
                return f41927b;
            case 6:
                C63010eb ebVar = f41928d;
                if (ebVar == null) {
                    synchronized (C13751bd.class) {
                        ebVar = f41928d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41927b);
                            f41928d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
