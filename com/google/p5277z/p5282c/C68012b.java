package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.z.c.b */
/* compiled from: PG */
public final class C68012b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68012b f184274a;

    /* renamed from: b */
    private static volatile C63010eb f184275b;

    static {
        C68012b bVar = new C68012b();
        f184274a = bVar;
        C62942bv.registerDefaultInstance(C68012b.class, bVar);
    }

    private C68012b() {
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
                return newMessageInfo(f184274a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C68012b();
            case 4:
                return new C67990a();
            case 5:
                return f184274a;
            case 6:
                C63010eb ebVar = f184275b;
                if (ebVar == null) {
                    synchronized (C68012b.class) {
                        ebVar = f184275b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184274a);
                            f184275b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
