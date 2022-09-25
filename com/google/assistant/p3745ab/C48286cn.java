package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cn */
/* compiled from: PG */
public final class C48286cn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48286cn f124881a;

    /* renamed from: b */
    private static volatile C63010eb f124882b;

    static {
        C48286cn cnVar = new C48286cn();
        f124881a = cnVar;
        C62942bv.registerDefaultInstance(C48286cn.class, cnVar);
    }

    private C48286cn() {
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
                return newMessageInfo(f124881a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48286cn();
            case 4:
                return new C48285cm();
            case 5:
                return f124881a;
            case 6:
                C63010eb ebVar = f124882b;
                if (ebVar == null) {
                    synchronized (C48286cn.class) {
                        ebVar = f124882b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124881a);
                            f124882b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
