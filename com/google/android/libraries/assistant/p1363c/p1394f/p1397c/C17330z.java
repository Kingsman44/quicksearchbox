package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.f.c.z */
/* compiled from: PG */
public final class C17330z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17330z f50164a;

    /* renamed from: b */
    private static volatile C63010eb f50165b;

    static {
        C17330z zVar = new C17330z();
        f50164a = zVar;
        C62942bv.registerDefaultInstance(C17330z.class, zVar);
    }

    private C17330z() {
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
                return newMessageInfo(f50164a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C17330z();
            case 4:
                return new C17329y();
            case 5:
                return f50164a;
            case 6:
                C63010eb ebVar = f50165b;
                if (ebVar == null) {
                    synchronized (C17330z.class) {
                        ebVar = f50165b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50164a);
                            f50165b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
