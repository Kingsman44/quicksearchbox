package com.google.p395al.p417d.p418a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.s */
/* compiled from: PG */
public final class C8592s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8592s f29730d;

    /* renamed from: e */
    private static volatile C63010eb f29731e;

    /* renamed from: a */
    public int f29732a;

    /* renamed from: b */
    public long f29733b;

    /* renamed from: c */
    public long f29734c;

    static {
        C8592s sVar = new C8592s();
        f29730d = sVar;
        C62942bv.registerDefaultInstance(C8592s.class, sVar);
    }

    private C8592s() {
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
                return newMessageInfo(f29730d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002စ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8592s();
            case 4:
                return new C8591r();
            case 5:
                return f29730d;
            case 6:
                C63010eb ebVar = f29731e;
                if (ebVar == null) {
                    synchronized (C8592s.class) {
                        ebVar = f29731e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29730d);
                            f29731e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
