package com.google.android.libraries.search.p2904c.p2905a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.a.b */
/* compiled from: PG */
public final class C37323b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37323b f99159c;

    /* renamed from: d */
    private static volatile C63010eb f99160d;

    /* renamed from: a */
    public int f99161a;

    /* renamed from: b */
    public int f99162b;

    static {
        C37323b bVar = new C37323b();
        f99159c = bVar;
        C62942bv.registerDefaultInstance(C37323b.class, bVar);
    }

    private C37323b() {
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
                return newMessageInfo(f99159c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37323b();
            case 4:
                return new C37322a();
            case 5:
                return f99159c;
            case 6:
                C63010eb ebVar = f99160d;
                if (ebVar == null) {
                    synchronized (C37323b.class) {
                        ebVar = f99160d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99159c);
                            f99160d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
