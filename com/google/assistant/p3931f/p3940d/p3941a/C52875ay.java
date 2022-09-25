package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.f.d.a.ay */
/* compiled from: PG */
public final class C52875ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52875ay f138718a;

    /* renamed from: b */
    private static volatile C63010eb f138719b;

    static {
        C52875ay ayVar = new C52875ay();
        f138718a = ayVar;
        C62942bv.registerDefaultInstance(C52875ay.class, ayVar);
    }

    private C52875ay() {
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
                return newMessageInfo(f138718a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52875ay();
            case 4:
                return new C52874ax();
            case 5:
                return f138718a;
            case 6:
                C63010eb ebVar = f138719b;
                if (ebVar == null) {
                    synchronized (C52875ay.class) {
                        ebVar = f138719b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138718a);
                            f138719b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
