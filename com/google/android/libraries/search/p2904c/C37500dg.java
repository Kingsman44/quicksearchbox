package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.dg */
/* compiled from: PG */
public final class C37500dg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37500dg f99557c;

    /* renamed from: d */
    private static volatile C63010eb f99558d;

    /* renamed from: a */
    public int f99559a;

    /* renamed from: b */
    public int f99560b;

    static {
        C37500dg dgVar = new C37500dg();
        f99557c = dgVar;
        C62942bv.registerDefaultInstance(C37500dg.class, dgVar);
    }

    private C37500dg() {
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
                return newMessageInfo(f99557c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37500dg();
            case 4:
                return new C37499df();
            case 5:
                return f99557c;
            case 6:
                C63010eb ebVar = f99558d;
                if (ebVar == null) {
                    synchronized (C37500dg.class) {
                        ebVar = f99558d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99557c);
                            f99558d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
