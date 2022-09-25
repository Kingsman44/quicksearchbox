package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.x */
/* compiled from: PG */
public final class C17922x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17922x f51346a;

    /* renamed from: b */
    private static volatile C63010eb f51347b;

    static {
        C17922x xVar = new C17922x();
        f51346a = xVar;
        C62942bv.registerDefaultInstance(C17922x.class, xVar);
    }

    private C17922x() {
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
                return newMessageInfo(f51346a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17922x();
            case 4:
                return new C17921w();
            case 5:
                return f51346a;
            case 6:
                C63010eb ebVar = f51347b;
                if (ebVar == null) {
                    synchronized (C17922x.class) {
                        ebVar = f51347b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51346a);
                            f51347b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
