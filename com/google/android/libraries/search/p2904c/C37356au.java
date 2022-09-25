package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.au */
/* compiled from: PG */
public final class C37356au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37356au f99216c;

    /* renamed from: d */
    private static volatile C63010eb f99217d;

    /* renamed from: a */
    public int f99218a;

    /* renamed from: b */
    public boolean f99219b;

    static {
        C37356au auVar = new C37356au();
        f99216c = auVar;
        C62942bv.registerDefaultInstance(C37356au.class, auVar);
    }

    private C37356au() {
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
                return newMessageInfo(f99216c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37356au();
            case 4:
                return new C37355at();
            case 5:
                return f99216c;
            case 6:
                C63010eb ebVar = f99217d;
                if (ebVar == null) {
                    synchronized (C37356au.class) {
                        ebVar = f99217d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99216c);
                            f99217d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
