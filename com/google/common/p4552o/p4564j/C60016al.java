package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.al */
/* compiled from: PG */
public final class C60016al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60016al f162216a;

    /* renamed from: e */
    private static volatile C63010eb f162217e;

    /* renamed from: b */
    private int f162218b;

    /* renamed from: c */
    private C60031f f162219c;

    /* renamed from: d */
    private byte f162220d = 2;

    static {
        C60016al alVar = new C60016al();
        f162216a = alVar;
        C62942bv.registerDefaultInstance(C60016al.class, alVar);
    }

    private C60016al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162220d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162220d = b;
                return null;
            case 2:
                return newMessageInfo(f162216a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60016al();
            case 4:
                return new C60015ak();
            case 5:
                return f162216a;
            case 6:
                C63010eb ebVar = f162217e;
                if (ebVar == null) {
                    synchronized (C60016al.class) {
                        ebVar = f162217e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162216a);
                            f162217e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
