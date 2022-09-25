package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.x */
/* compiled from: PG */
public final class C121260x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C121260x f336824a;

    /* renamed from: b */
    private static volatile C63010eb f336825b;

    static {
        C121260x xVar = new C121260x();
        f336824a = xVar;
        C62942bv.registerDefaultInstance(C121260x.class, xVar);
    }

    private C121260x() {
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
                return newMessageInfo(f336824a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C121260x();
            case 4:
                return new C121259w();
            case 5:
                return f336824a;
            case 6:
                C63010eb ebVar = f336825b;
                if (ebVar == null) {
                    synchronized (C121260x.class) {
                        ebVar = f336825b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336824a);
                            f336825b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
