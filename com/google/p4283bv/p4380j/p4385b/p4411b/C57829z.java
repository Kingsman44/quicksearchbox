package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.z */
/* compiled from: PG */
public final class C57829z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57829z f154506b;

    /* renamed from: e */
    private static volatile C63010eb f154507e;

    /* renamed from: a */
    public C57827x f154508a;

    /* renamed from: c */
    private int f154509c;

    /* renamed from: d */
    private byte f154510d = 2;

    static {
        C57829z zVar = new C57829z();
        f154506b = zVar;
        C62942bv.registerDefaultInstance(C57829z.class, zVar);
    }

    private C57829z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154510d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154510d = b;
                return null;
            case 2:
                return newMessageInfo(f154506b, "\u0001\u0001\u0000\u0001놩놩\u0001\u0000\u0000\u0001놩ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57829z();
            case 4:
                return new C57828y();
            case 5:
                return f154506b;
            case 6:
                C63010eb ebVar = f154507e;
                if (ebVar == null) {
                    synchronized (C57829z.class) {
                        ebVar = f154507e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154506b);
                            f154507e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
