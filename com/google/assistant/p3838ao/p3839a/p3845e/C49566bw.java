package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.bw */
/* compiled from: PG */
public final class C49566bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49566bw f127897a;

    /* renamed from: d */
    private static volatile C63010eb f127898d;

    /* renamed from: b */
    private int f127899b;

    /* renamed from: c */
    private C49518ab f127900c;

    static {
        C49566bw bwVar = new C49566bw();
        f127897a = bwVar;
        C62942bv.registerDefaultInstance(C49566bw.class, bwVar);
    }

    private C49566bw() {
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
                return newMessageInfo(f127897a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49566bw();
            case 4:
                return new C49565bv();
            case 5:
                return f127897a;
            case 6:
                C63010eb ebVar = f127898d;
                if (ebVar == null) {
                    synchronized (C49566bw.class) {
                        ebVar = f127898d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127897a);
                            f127898d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
