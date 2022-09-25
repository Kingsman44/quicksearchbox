package com.google.android.libraries.assistant.portable.p1586b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.k */
/* compiled from: PG */
public final class C19079k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C19079k f53513a;

    /* renamed from: b */
    private static volatile C63010eb f53514b;

    static {
        C19079k kVar = new C19079k();
        f53513a = kVar;
        C62942bv.registerDefaultInstance(C19079k.class, kVar);
    }

    private C19079k() {
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
                return newMessageInfo(f53513a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C19079k();
            case 4:
                return new C19078j();
            case 5:
                return f53513a;
            case 6:
                C63010eb ebVar = f53514b;
                if (ebVar == null) {
                    synchronized (C19079k.class) {
                        ebVar = f53514b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53513a);
                            f53514b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
