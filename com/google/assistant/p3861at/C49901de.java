package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.de */
/* compiled from: PG */
public final class C49901de extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49901de f129708c;

    /* renamed from: d */
    private static volatile C63010eb f129709d;

    /* renamed from: a */
    public int f129710a;

    /* renamed from: b */
    public boolean f129711b;

    static {
        C49901de deVar = new C49901de();
        f129708c = deVar;
        C62942bv.registerDefaultInstance(C49901de.class, deVar);
    }

    private C49901de() {
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
                return newMessageInfo(f129708c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49901de();
            case 4:
                return new C49900dd();
            case 5:
                return f129708c;
            case 6:
                C63010eb ebVar = f129709d;
                if (ebVar == null) {
                    synchronized (C49901de.class) {
                        ebVar = f129709d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129708c);
                            f129709d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
