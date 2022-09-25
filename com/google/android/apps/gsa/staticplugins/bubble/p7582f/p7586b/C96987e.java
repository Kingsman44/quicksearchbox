package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.b.e */
/* compiled from: PG */
public final class C96987e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C96987e f271045a;

    /* renamed from: b */
    private static volatile C63010eb f271046b;

    static {
        C96987e eVar = new C96987e();
        f271045a = eVar;
        C62942bv.registerDefaultInstance(C96987e.class, eVar);
    }

    private C96987e() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f271045a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C96987e();
            case 4:
                return new C96986d();
            case 5:
                return f271045a;
            case 6:
                C63010eb ebVar = f271046b;
                if (ebVar == null) {
                    synchronized (C96987e.class) {
                        ebVar = f271046b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271045a);
                            f271046b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
