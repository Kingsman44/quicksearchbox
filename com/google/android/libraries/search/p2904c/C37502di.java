package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.di */
/* compiled from: PG */
public final class C37502di extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37502di f99561c;

    /* renamed from: d */
    private static volatile C63010eb f99562d;

    /* renamed from: a */
    public int f99563a;

    /* renamed from: b */
    public C37500dg f99564b;

    static {
        C37502di diVar = new C37502di();
        f99561c = diVar;
        C62942bv.registerDefaultInstance(C37502di.class, diVar);
    }

    private C37502di() {
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
                return newMessageInfo(f99561c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37502di();
            case 4:
                return new C37501dh();
            case 5:
                return f99561c;
            case 6:
                C63010eb ebVar = f99562d;
                if (ebVar == null) {
                    synchronized (C37502di.class) {
                        ebVar = f99562d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99561c);
                            f99562d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
