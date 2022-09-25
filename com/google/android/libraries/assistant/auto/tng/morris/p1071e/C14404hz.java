package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hz */
/* compiled from: PG */
public final class C14404hz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14404hz f43575a;

    /* renamed from: b */
    private static volatile C63010eb f43576b;

    static {
        C14404hz hzVar = new C14404hz();
        f43575a = hzVar;
        C62942bv.registerDefaultInstance(C14404hz.class, hzVar);
    }

    private C14404hz() {
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
                return newMessageInfo(f43575a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14404hz();
            case 4:
                return new C14403hy();
            case 5:
                return f43575a;
            case 6:
                C63010eb ebVar = f43576b;
                if (ebVar == null) {
                    synchronized (C14404hz.class) {
                        ebVar = f43576b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43575a);
                            f43576b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
