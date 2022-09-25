package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.ek */
/* compiled from: PG */
public final class C66224ek extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66224ek f180081d;

    /* renamed from: e */
    private static volatile C63010eb f180082e;

    /* renamed from: a */
    public int f180083a;

    /* renamed from: b */
    public float f180084b;

    /* renamed from: c */
    public float f180085c;

    static {
        C66224ek ekVar = new C66224ek();
        f180081d = ekVar;
        C62942bv.registerDefaultInstance(C66224ek.class, ekVar);
    }

    private C66224ek() {
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
                return newMessageInfo(f180081d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66224ek();
            case 4:
                return new C66223ej();
            case 5:
                return f180081d;
            case 6:
                C63010eb ebVar = f180082e;
                if (ebVar == null) {
                    synchronized (C66224ek.class) {
                        ebVar = f180082e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180081d);
                            f180082e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
