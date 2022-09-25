package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.bz */
/* compiled from: PG */
public final class C57401bz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57401bz f153323d;

    /* renamed from: e */
    private static volatile C63010eb f153324e;

    /* renamed from: a */
    public int f153325a;

    /* renamed from: b */
    public C57355ag f153326b;

    /* renamed from: c */
    public int f153327c = 1;

    static {
        C57401bz bzVar = new C57401bz();
        f153323d = bzVar;
        C62942bv.registerDefaultInstance(C57401bz.class, bzVar);
    }

    private C57401bz() {
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
                return newMessageInfo(f153323d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C57398bw.f153322a});
            case 3:
                return new C57401bz();
            case 4:
                return new C57400by();
            case 5:
                return f153323d;
            case 6:
                C63010eb ebVar = f153324e;
                if (ebVar == null) {
                    synchronized (C57401bz.class) {
                        ebVar = f153324e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153323d);
                            f153324e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
