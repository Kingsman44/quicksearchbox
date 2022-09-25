package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.h */
/* compiled from: PG */
public final class C52901h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52901h f138739a;

    /* renamed from: b */
    private static volatile C63010eb f138740b;

    static {
        C52901h hVar = new C52901h();
        f138739a = hVar;
        C62942bv.registerDefaultInstance(C52901h.class, hVar);
    }

    private C52901h() {
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
                return newMessageInfo(f138739a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52901h();
            case 4:
                return new C52900g();
            case 5:
                return f138739a;
            case 6:
                C63010eb ebVar = f138740b;
                if (ebVar == null) {
                    synchronized (C52901h.class) {
                        ebVar = f138740b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138739a);
                            f138740b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
