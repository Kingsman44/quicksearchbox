package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.nk */
/* compiled from: PG */
public final class C14551nk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14551nk f44004a;

    /* renamed from: b */
    private static volatile C63010eb f44005b;

    static {
        C14551nk nkVar = new C14551nk();
        f44004a = nkVar;
        C62942bv.registerDefaultInstance(C14551nk.class, nkVar);
    }

    private C14551nk() {
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
                return newMessageInfo(f44004a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14551nk();
            case 4:
                return new C14550nj();
            case 5:
                return f44004a;
            case 6:
                C63010eb ebVar = f44005b;
                if (ebVar == null) {
                    synchronized (C14551nk.class) {
                        ebVar = f44005b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44004a);
                            f44005b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
