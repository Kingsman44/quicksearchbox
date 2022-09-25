package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.ad */
/* compiled from: PG */
public final class C52854ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52854ad f138663a;

    /* renamed from: b */
    private static volatile C63010eb f138664b;

    static {
        C52854ad adVar = new C52854ad();
        f138663a = adVar;
        C62942bv.registerDefaultInstance(C52854ad.class, adVar);
    }

    private C52854ad() {
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
                return newMessageInfo(f138663a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52854ad();
            case 4:
                return new C52853ac();
            case 5:
                return f138663a;
            case 6:
                C63010eb ebVar = f138664b;
                if (ebVar == null) {
                    synchronized (C52854ad.class) {
                        ebVar = f138664b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138663a);
                            f138664b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
