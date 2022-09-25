package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ma */
/* compiled from: PG */
public final class C50140ma extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50140ma f130352d;

    /* renamed from: e */
    private static volatile C63010eb f130353e;

    /* renamed from: a */
    public int f130354a;

    /* renamed from: b */
    public boolean f130355b;

    /* renamed from: c */
    public boolean f130356c;

    static {
        C50140ma maVar = new C50140ma();
        f130352d = maVar;
        C62942bv.registerDefaultInstance(C50140ma.class, maVar);
    }

    private C50140ma() {
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
                return newMessageInfo(f130352d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50140ma();
            case 4:
                return new C50138lz();
            case 5:
                return f130352d;
            case 6:
                C63010eb ebVar = f130353e;
                if (ebVar == null) {
                    synchronized (C50140ma.class) {
                        ebVar = f130353e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130352d);
                            f130353e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
