package com.google.p4283bv.p4379i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.i.c */
/* compiled from: PG */
public final class C57672c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57672c f154051a;

    /* renamed from: c */
    private static volatile C63010eb f154052c;

    /* renamed from: b */
    private C62995dn f154053b = C62995dn.f170057a;

    static {
        C57672c cVar = new C57672c();
        f154051a = cVar;
        C62942bv.registerDefaultInstance(C57672c.class, cVar);
    }

    private C57672c() {
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
                return newMessageInfo(f154051a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", C57671b.f154050a});
            case 3:
                return new C57672c();
            case 4:
                return new C57670a();
            case 5:
                return f154051a;
            case 6:
                C63010eb ebVar = f154052c;
                if (ebVar == null) {
                    synchronized (C57672c.class) {
                        ebVar = f154052c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154051a);
                            f154052c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
