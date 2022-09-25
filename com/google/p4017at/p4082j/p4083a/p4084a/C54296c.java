package com.google.p4017at.p4082j.p4083a.p4084a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.j.a.a.c */
/* compiled from: PG */
public final class C54296c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54296c f142647a;

    /* renamed from: c */
    private static volatile C63010eb f142648c;

    /* renamed from: b */
    private C62995dn f142649b = C62995dn.f170057a;

    static {
        C54296c cVar = new C54296c();
        f142647a = cVar;
        C62942bv.registerDefaultInstance(C54296c.class, cVar);
    }

    private C54296c() {
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
                return newMessageInfo(f142647a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", C54295b.f142646a});
            case 3:
                return new C54296c();
            case 4:
                return new C54294a();
            case 5:
                return f142647a;
            case 6:
                C63010eb ebVar = f142648c;
                if (ebVar == null) {
                    synchronized (C54296c.class) {
                        ebVar = f142648c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142647a);
                            f142648c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
