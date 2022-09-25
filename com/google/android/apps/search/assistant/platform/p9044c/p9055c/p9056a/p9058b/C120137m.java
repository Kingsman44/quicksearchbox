package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.b.m */
/* compiled from: PG */
public final class C120137m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C120137m f334377a;

    /* renamed from: b */
    private static volatile C63010eb f334378b;

    static {
        C120137m mVar = new C120137m();
        f334377a = mVar;
        C62942bv.registerDefaultInstance(C120137m.class, mVar);
    }

    private C120137m() {
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
                return newMessageInfo(f334377a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C120137m();
            case 4:
                return new C120136l();
            case 5:
                return f334377a;
            case 6:
                C63010eb ebVar = f334378b;
                if (ebVar == null) {
                    synchronized (C120137m.class) {
                        ebVar = f334378b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f334377a);
                            f334378b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
