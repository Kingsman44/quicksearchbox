package com.google.protos.p4850an.p4854c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.c.l */
/* compiled from: PG */
public final class C63423l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63423l f171398a;

    /* renamed from: e */
    private static volatile C63010eb f171399e;

    /* renamed from: b */
    private int f171400b;

    /* renamed from: c */
    private C63389bg f171401c;

    /* renamed from: d */
    private byte f171402d = 2;

    static {
        C63423l lVar = new C63423l();
        f171398a = lVar;
        C62942bv.registerDefaultInstance(C63423l.class, lVar);
    }

    private C63423l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171402d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171402d = b;
                return null;
            case 2:
                return newMessageInfo(f171398a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63423l();
            case 4:
                return new C63422k();
            case 5:
                return f171398a;
            case 6:
                C63010eb ebVar = f171399e;
                if (ebVar == null) {
                    synchronized (C63423l.class) {
                        ebVar = f171399e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171398a);
                            f171399e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
