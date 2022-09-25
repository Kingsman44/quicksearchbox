package com.google.android.libraries.logging.p2185ve.p2200g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.g.b */
/* compiled from: PG */
public final class C28425b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28425b f77194b;

    /* renamed from: c */
    private static volatile C63010eb f77195c;

    /* renamed from: a */
    public C62961ch f77196a = emptyIntList();

    static {
        C28425b bVar = new C28425b();
        f77194b = bVar;
        C62942bv.registerDefaultInstance(C28425b.class, bVar);
    }

    private C28425b() {
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
                return newMessageInfo(f77194b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C28425b();
            case 4:
                return new C28424a();
            case 5:
                return f77194b;
            case 6:
                C63010eb ebVar = f77195c;
                if (ebVar == null) {
                    synchronized (C28425b.class) {
                        ebVar = f77195c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77194b);
                            f77195c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
