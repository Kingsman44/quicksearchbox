package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.e.b.b.a.ap */
/* compiled from: PG */
public final class C57074ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57074ap f152366a;

    /* renamed from: e */
    private static volatile C63010eb f152367e;

    /* renamed from: b */
    private int f152368b;

    /* renamed from: c */
    private CommandOuterClass$Command f152369c;

    /* renamed from: d */
    private byte f152370d = 2;

    static {
        C57074ap apVar = new C57074ap();
        f152366a = apVar;
        C62942bv.registerDefaultInstance(C57074ap.class, apVar);
    }

    private C57074ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152370d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152370d = b;
                return null;
            case 2:
                return newMessageInfo(f152366a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C57074ap();
            case 4:
                return new C57073ao();
            case 5:
                return f152366a;
            case 6:
                C63010eb ebVar = f152367e;
                if (ebVar == null) {
                    synchronized (C57074ap.class) {
                        ebVar = f152367e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152366a);
                            f152367e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
