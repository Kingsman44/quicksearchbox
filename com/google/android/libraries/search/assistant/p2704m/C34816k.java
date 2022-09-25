package com.google.android.libraries.search.assistant.p2704m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.m.k */
/* compiled from: PG */
public final class C34816k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34816k f92352a;

    /* renamed from: b */
    private static volatile C63010eb f92353b;

    static {
        C34816k kVar = new C34816k();
        f92352a = kVar;
        C62942bv.registerDefaultInstance(C34816k.class, kVar);
    }

    private C34816k() {
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
                return newMessageInfo(f92352a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34816k();
            case 4:
                return new C34815j();
            case 5:
                return f92352a;
            case 6:
                C63010eb ebVar = f92353b;
                if (ebVar == null) {
                    synchronized (C34816k.class) {
                        ebVar = f92353b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92352a);
                            f92353b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
