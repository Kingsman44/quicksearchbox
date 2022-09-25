package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.ac */
/* compiled from: PG */
public final class C18962ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18962ac f53286a;

    /* renamed from: b */
    private static volatile C63010eb f53287b;

    static {
        C18962ac acVar = new C18962ac();
        f53286a = acVar;
        C62942bv.registerDefaultInstance(C18962ac.class, acVar);
    }

    private C18962ac() {
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
                return newMessageInfo(f53286a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C18962ac();
            case 4:
                return new C18961ab();
            case 5:
                return f53286a;
            case 6:
                C63010eb ebVar = f53287b;
                if (ebVar == null) {
                    synchronized (C18962ac.class) {
                        ebVar = f53287b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53286a);
                            f53287b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
