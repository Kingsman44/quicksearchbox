package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.am */
/* compiled from: PG */
public final class C49828am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49828am f129480a;

    /* renamed from: b */
    private static volatile C63010eb f129481b;

    static {
        C49828am amVar = new C49828am();
        f129480a = amVar;
        C62942bv.registerDefaultInstance(C49828am.class, amVar);
    }

    private C49828am() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f129480a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49828am();
            case 4:
                return new C49827al();
            case 5:
                return f129480a;
            case 6:
                C63010eb ebVar = f129481b;
                if (ebVar == null) {
                    synchronized (C49828am.class) {
                        ebVar = f129481b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129480a);
                            f129481b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
