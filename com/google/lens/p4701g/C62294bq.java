package com.google.lens.p4701g;

import com.google.p4172bg.C55764y;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bq */
/* compiled from: PG */
public final class C62294bq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62294bq f168171c;

    /* renamed from: d */
    private static volatile C63010eb f168172d;

    /* renamed from: a */
    public int f168173a;

    /* renamed from: b */
    public C55764y f168174b;

    static {
        C62294bq bqVar = new C62294bq();
        f168171c = bqVar;
        C62942bv.registerDefaultInstance(C62294bq.class, bqVar);
    }

    private C62294bq() {
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
                return newMessageInfo(f168171c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62294bq();
            case 4:
                return new C62293bp();
            case 5:
                return f168171c;
            case 6:
                C63010eb ebVar = f168172d;
                if (ebVar == null) {
                    synchronized (C62294bq.class) {
                        ebVar = f168172d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168171c);
                            f168172d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
