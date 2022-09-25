package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.eb */
/* compiled from: PG */
public final class C37561eb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37561eb f99800c;

    /* renamed from: d */
    private static volatile C63010eb f99801d;

    /* renamed from: a */
    public int f99802a = 0;

    /* renamed from: b */
    public Object f99803b;

    static {
        C37561eb ebVar = new C37561eb();
        f99800c = ebVar;
        C62942bv.registerDefaultInstance(C37561eb.class, ebVar);
    }

    private C37561eb() {
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
                return newMessageInfo(f99800c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C37563ed.m66572b(), C37519dz.m66525b()});
            case 3:
                return new C37561eb();
            case 4:
                return new C37560ea();
            case 5:
                return f99800c;
            case 6:
                C63010eb ebVar = f99801d;
                if (ebVar == null) {
                    synchronized (C37561eb.class) {
                        ebVar = f99801d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99800c);
                            f99801d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
