package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.de */
/* compiled from: PG */
public final class C37498de extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37498de f99553c;

    /* renamed from: d */
    private static volatile C63010eb f99554d;

    /* renamed from: a */
    public int f99555a;

    /* renamed from: b */
    public C37679hz f99556b;

    static {
        C37498de deVar = new C37498de();
        f99553c = deVar;
        C62942bv.registerDefaultInstance(C37498de.class, deVar);
    }

    private C37498de() {
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
                return newMessageInfo(f99553c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37498de();
            case 4:
                return new C37497dd();
            case 5:
                return f99553c;
            case 6:
                C63010eb ebVar = f99554d;
                if (ebVar == null) {
                    synchronized (C37498de.class) {
                        ebVar = f99554d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99553c);
                            f99554d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
