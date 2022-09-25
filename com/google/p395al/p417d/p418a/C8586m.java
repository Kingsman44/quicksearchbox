package com.google.p395al.p417d.p418a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.m */
/* compiled from: PG */
public final class C8586m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8586m f29714d;

    /* renamed from: e */
    private static volatile C63010eb f29715e;

    /* renamed from: a */
    public int f29716a;

    /* renamed from: b */
    public boolean f29717b;

    /* renamed from: c */
    public C8588o f29718c;

    static {
        C8586m mVar = new C8586m();
        f29714d = mVar;
        C62942bv.registerDefaultInstance(C8586m.class, mVar);
    }

    private C8586m() {
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
                return newMessageInfo(f29714d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8586m();
            case 4:
                return new C8585l();
            case 5:
                return f29714d;
            case 6:
                C63010eb ebVar = f29715e;
                if (ebVar == null) {
                    synchronized (C8586m.class) {
                        ebVar = f29715e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29714d);
                            f29715e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
