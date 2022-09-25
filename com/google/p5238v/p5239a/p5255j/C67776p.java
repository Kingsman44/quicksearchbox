package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.p */
/* compiled from: PG */
public final class C67776p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67776p f183876e;

    /* renamed from: f */
    private static volatile C63010eb f183877f;

    /* renamed from: a */
    public int f183878a;

    /* renamed from: b */
    public int f183879b;

    /* renamed from: c */
    public int f183880c;

    /* renamed from: d */
    public C67707cj f183881d;

    static {
        C67776p pVar = new C67776p();
        f183876e = pVar;
        C62942bv.registerDefaultInstance(C67776p.class, pVar);
    }

    private C67776p() {
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
                return newMessageInfo(f183876e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67776p();
            case 4:
                return new C67775o();
            case 5:
                return f183876e;
            case 6:
                C63010eb ebVar = f183877f;
                if (ebVar == null) {
                    synchronized (C67776p.class) {
                        ebVar = f183877f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183876e);
                            f183877f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
