package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.x */
/* compiled from: PG */
public final class C17328x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17328x f50162a;

    /* renamed from: b */
    private static volatile C63010eb f50163b;

    static {
        C17328x xVar = new C17328x();
        f50162a = xVar;
        C62942bv.registerDefaultInstance(C17328x.class, xVar);
    }

    private C17328x() {
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
                return newMessageInfo(f50162a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C17328x();
            case 4:
                return new C17327w();
            case 5:
                return f50162a;
            case 6:
                C63010eb ebVar = f50163b;
                if (ebVar == null) {
                    synchronized (C17328x.class) {
                        ebVar = f50163b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50162a);
                            f50163b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
