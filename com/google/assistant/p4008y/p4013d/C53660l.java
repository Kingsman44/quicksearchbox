package com.google.assistant.p4008y.p4013d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.l */
/* compiled from: PG */
public final class C53660l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53660l f140838d;

    /* renamed from: e */
    private static volatile C63010eb f140839e;

    /* renamed from: a */
    public int f140840a;

    /* renamed from: b */
    public C53650b f140841b;

    /* renamed from: c */
    public C53654f f140842c;

    static {
        C53660l lVar = new C53660l();
        f140838d = lVar;
        C62942bv.registerDefaultInstance(C53660l.class, lVar);
    }

    private C53660l() {
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
                return newMessageInfo(f140838d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53660l();
            case 4:
                return new C53659k();
            case 5:
                return f140838d;
            case 6:
                C63010eb ebVar = f140839e;
                if (ebVar == null) {
                    synchronized (C53660l.class) {
                        ebVar = f140839e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140838d);
                            f140839e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
