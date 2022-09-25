package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.al */
/* compiled from: PG */
public final class C54088al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54088al f141920d;

    /* renamed from: e */
    private static volatile C63010eb f141921e;

    /* renamed from: a */
    public int f141922a;

    /* renamed from: b */
    public boolean f141923b;

    /* renamed from: c */
    public boolean f141924c;

    static {
        C54088al alVar = new C54088al();
        f141920d = alVar;
        C62942bv.registerDefaultInstance(C54088al.class, alVar);
    }

    private C54088al() {
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
                return newMessageInfo(f141920d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54088al();
            case 4:
                return new C54087ak();
            case 5:
                return f141920d;
            case 6:
                C63010eb ebVar = f141921e;
                if (ebVar == null) {
                    synchronized (C54088al.class) {
                        ebVar = f141921e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141920d);
                            f141921e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
