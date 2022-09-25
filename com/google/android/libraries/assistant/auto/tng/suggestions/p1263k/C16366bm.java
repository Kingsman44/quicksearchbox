package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.bm */
/* compiled from: PG */
public final class C16366bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16366bm f48176c;

    /* renamed from: e */
    private static volatile C63010eb f48177e;

    /* renamed from: a */
    public boolean f48178a;

    /* renamed from: b */
    public boolean f48179b;

    /* renamed from: d */
    private int f48180d;

    static {
        C16366bm bmVar = new C16366bm();
        f48176c = bmVar;
        C62942bv.registerDefaultInstance(C16366bm.class, bmVar);
    }

    private C16366bm() {
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
                return newMessageInfo(f48176c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C16366bm();
            case 4:
                return new C16365bl();
            case 5:
                return f48176c;
            case 6:
                C63010eb ebVar = f48177e;
                if (ebVar == null) {
                    synchronized (C16366bm.class) {
                        ebVar = f48177e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48176c);
                            f48177e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
