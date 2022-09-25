package com.google.assistant.p3821al.p3822a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.al.a.h */
/* compiled from: PG */
public final class C49225h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49225h f127269a;

    /* renamed from: b */
    private static volatile C63010eb f127270b;

    static {
        C49225h hVar = new C49225h();
        f127269a = hVar;
        C62942bv.registerDefaultInstance(C49225h.class, hVar);
    }

    private C49225h() {
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
                return newMessageInfo(f127269a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49225h();
            case 4:
                return new C49224g();
            case 5:
                return f127269a;
            case 6:
                C63010eb ebVar = f127270b;
                if (ebVar == null) {
                    synchronized (C49225h.class) {
                        ebVar = f127270b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127269a);
                            f127270b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
