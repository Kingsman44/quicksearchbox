package com.google.protos.p4850an.p4855d.p4861f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.f.b */
/* compiled from: PG */
public final class C63562b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63562b f171925a;

    /* renamed from: b */
    private static volatile C63010eb f171926b;

    static {
        C63562b bVar = new C63562b();
        f171925a = bVar;
        C62942bv.registerDefaultInstance(C63562b.class, bVar);
    }

    private C63562b() {
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
                return newMessageInfo(f171925a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63562b();
            case 4:
                return new C63561a();
            case 5:
                return f171925a;
            case 6:
                C63010eb ebVar = f171926b;
                if (ebVar == null) {
                    synchronized (C63562b.class) {
                        ebVar = f171926b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171925a);
                            f171926b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
