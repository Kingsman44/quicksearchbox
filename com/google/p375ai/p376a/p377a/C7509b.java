package com.google.p375ai.p376a.p377a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.a.a.b */
/* compiled from: PG */
public final class C7509b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7509b f24742a;

    /* renamed from: b */
    private static volatile C63010eb f24743b;

    static {
        C7509b bVar = new C7509b();
        f24742a = bVar;
        C62942bv.registerDefaultInstance(C7509b.class, bVar);
    }

    private C7509b() {
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
                return newMessageInfo(f24742a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7509b();
            case 4:
                return new C7508a();
            case 5:
                return f24742a;
            case 6:
                C63010eb ebVar = f24743b;
                if (ebVar == null) {
                    synchronized (C7509b.class) {
                        ebVar = f24743b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f24742a);
                            f24743b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
