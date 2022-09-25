package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.al */
/* compiled from: PG */
public final class C83623al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83623al f227970c;

    /* renamed from: d */
    private static volatile C63010eb f227971d;

    /* renamed from: a */
    public int f227972a;

    /* renamed from: b */
    public long f227973b;

    static {
        C83623al alVar = new C83623al();
        f227970c = alVar;
        C62942bv.registerDefaultInstance(C83623al.class, alVar);
    }

    private C83623al() {
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
                return newMessageInfo(f227970c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83623al();
            case 4:
                return new C83622ak();
            case 5:
                return f227970c;
            case 6:
                C63010eb ebVar = f227971d;
                if (ebVar == null) {
                    synchronized (C83623al.class) {
                        ebVar = f227971d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227970c);
                            f227971d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
