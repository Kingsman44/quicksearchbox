package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.am */
/* compiled from: PG */
public final class C37348am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37348am f99205c;

    /* renamed from: d */
    private static volatile C63010eb f99206d;

    /* renamed from: a */
    public int f99207a;

    /* renamed from: b */
    public int f99208b;

    static {
        C37348am amVar = new C37348am();
        f99205c = amVar;
        C62942bv.registerDefaultInstance(C37348am.class, amVar);
    }

    private C37348am() {
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
                return newMessageInfo(f99205c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37344ai.m66354b()});
            case 3:
                return new C37348am();
            case 4:
                return new C37347al();
            case 5:
                return f99205c;
            case 6:
                C63010eb ebVar = f99206d;
                if (ebVar == null) {
                    synchronized (C37348am.class) {
                        ebVar = f99206d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99205c);
                            f99206d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
