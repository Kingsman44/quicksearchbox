package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aff */
/* compiled from: PG */
public final class aff extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aff f158511f;

    /* renamed from: g */
    private static volatile C63010eb f158512g;

    /* renamed from: a */
    public int f158513a;

    /* renamed from: b */
    public double f158514b;

    /* renamed from: c */
    public int f158515c;

    /* renamed from: d */
    public int f158516d;

    /* renamed from: e */
    public C62960cg f158517e = emptyFloatList();

    static {
        aff aff = new aff();
        f158511f = aff;
        C62942bv.registerDefaultInstance(aff.class, aff);
    }

    private aff() {
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
                return newMessageInfo(f158511f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new aff();
            case 4:
                return new afe();
            case 5:
                return f158511f;
            case 6:
                C63010eb ebVar = f158512g;
                if (ebVar == null) {
                    synchronized (aff.class) {
                        ebVar = f158512g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158511f);
                            f158512g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
