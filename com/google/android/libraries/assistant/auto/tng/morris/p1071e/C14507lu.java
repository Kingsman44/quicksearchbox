package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lu */
/* compiled from: PG */
public final class C14507lu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14507lu f43875a;

    /* renamed from: b */
    private static volatile C63010eb f43876b;

    static {
        C14507lu luVar = new C14507lu();
        f43875a = luVar;
        C62942bv.registerDefaultInstance(C14507lu.class, luVar);
    }

    private C14507lu() {
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
                return newMessageInfo(f43875a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14507lu();
            case 4:
                return new C14506lt();
            case 5:
                return f43875a;
            case 6:
                C63010eb ebVar = f43876b;
                if (ebVar == null) {
                    synchronized (C14507lu.class) {
                        ebVar = f43876b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43875a);
                            f43876b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
