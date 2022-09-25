package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.y */
/* compiled from: PG */
public final class C124209y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C124209y f342968a;

    /* renamed from: b */
    private static volatile C63010eb f342969b;

    static {
        C124209y yVar = new C124209y();
        f342968a = yVar;
        C62942bv.registerDefaultInstance(C124209y.class, yVar);
    }

    private C124209y() {
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
                return newMessageInfo(f342968a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C124209y();
            case 4:
                return new C124208x();
            case 5:
                return f342968a;
            case 6:
                C63010eb ebVar = f342969b;
                if (ebVar == null) {
                    synchronized (C124209y.class) {
                        ebVar = f342969b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f342968a);
                            f342969b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
