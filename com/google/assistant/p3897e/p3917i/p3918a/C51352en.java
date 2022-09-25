package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.en */
/* compiled from: PG */
public final class C51352en extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51352en f133752d;

    /* renamed from: e */
    private static volatile C63010eb f133753e;

    /* renamed from: a */
    public int f133754a;

    /* renamed from: b */
    public boolean f133755b;

    /* renamed from: c */
    public C51336dy f133756c;

    static {
        C51352en enVar = new C51352en();
        f133752d = enVar;
        C62942bv.registerDefaultInstance(C51352en.class, enVar);
    }

    private C51352en() {
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
                return newMessageInfo(f133752d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51352en();
            case 4:
                return new C51351em();
            case 5:
                return f133752d;
            case 6:
                C63010eb ebVar = f133753e;
                if (ebVar == null) {
                    synchronized (C51352en.class) {
                        ebVar = f133753e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133752d);
                            f133753e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
