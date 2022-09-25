package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57214t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bm */
/* compiled from: PG */
public final class C134575bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134575bm f366507c;

    /* renamed from: d */
    private static volatile C63010eb f366508d;

    /* renamed from: a */
    public int f366509a = 0;

    /* renamed from: b */
    public Object f366510b;

    static {
        C134575bm bmVar = new C134575bm();
        f366507c = bmVar;
        C62942bv.registerDefaultInstance(C134575bm.class, bmVar);
    }

    private C134575bm() {
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
                return newMessageInfo(f366507c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C57214t.class});
            case 3:
                return new C134575bm();
            case 4:
                return new C134574bl();
            case 5:
                return f366507c;
            case 6:
                C63010eb ebVar = f366508d;
                if (ebVar == null) {
                    synchronized (C134575bm.class) {
                        ebVar = f366508d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366507c);
                            f366508d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
