package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.eo */
/* compiled from: PG */
public final class C37574eo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37574eo f99847c;

    /* renamed from: d */
    private static volatile C63010eb f99848d;

    /* renamed from: a */
    public int f99849a;

    /* renamed from: b */
    public int f99850b;

    static {
        C37574eo eoVar = new C37574eo();
        f99847c = eoVar;
        C62942bv.registerDefaultInstance(C37574eo.class, eoVar);
    }

    private C37574eo() {
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
                return newMessageInfo(f99847c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37575ep.f99851a});
            case 3:
                return new C37574eo();
            case 4:
                return new C37573en();
            case 5:
                return f99847c;
            case 6:
                C63010eb ebVar = f99848d;
                if (ebVar == null) {
                    synchronized (C37574eo.class) {
                        ebVar = f99848d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99847c);
                            f99848d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
