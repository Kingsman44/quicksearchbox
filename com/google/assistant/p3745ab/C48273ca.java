package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ca */
/* compiled from: PG */
public final class C48273ca extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48273ca f124851d;

    /* renamed from: e */
    private static volatile C63010eb f124852e;

    /* renamed from: a */
    public int f124853a;

    /* renamed from: b */
    public float f124854b;

    /* renamed from: c */
    public float f124855c;

    static {
        C48273ca caVar = new C48273ca();
        f124851d = caVar;
        C62942bv.registerDefaultInstance(C48273ca.class, caVar);
    }

    private C48273ca() {
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
                return newMessageInfo(f124851d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48273ca();
            case 4:
                return new C48269bz();
            case 5:
                return f124851d;
            case 6:
                C63010eb ebVar = f124852e;
                if (ebVar == null) {
                    synchronized (C48273ca.class) {
                        ebVar = f124852e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124851d);
                            f124852e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
