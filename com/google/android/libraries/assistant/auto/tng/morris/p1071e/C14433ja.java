package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ja */
/* compiled from: PG */
public final class C14433ja extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14433ja f43665d;

    /* renamed from: e */
    private static volatile C63010eb f43666e;

    /* renamed from: a */
    public int f43667a;

    /* renamed from: b */
    public boolean f43668b;

    /* renamed from: c */
    public int f43669c;

    static {
        C14433ja jaVar = new C14433ja();
        f43665d = jaVar;
        C62942bv.registerDefaultInstance(C14433ja.class, jaVar);
    }

    private C14433ja() {
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
                return newMessageInfo(f43665d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14433ja();
            case 4:
                return new C14431iz();
            case 5:
                return f43665d;
            case 6:
                C63010eb ebVar = f43666e;
                if (ebVar == null) {
                    synchronized (C14433ja.class) {
                        ebVar = f43666e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43665d);
                            f43666e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
