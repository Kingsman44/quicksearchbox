package com.google.p3723ar.imp.p3726a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ar.imp.a.b */
/* compiled from: PG */
public final class C47970b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C47970b f124148a;

    /* renamed from: b */
    private static volatile C63010eb f124149b;

    static {
        C47970b bVar = new C47970b();
        f124148a = bVar;
        C62942bv.registerDefaultInstance(C47970b.class, bVar);
    }

    private C47970b() {
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
                return newMessageInfo(f124148a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C47970b();
            case 4:
                return new C47969a();
            case 5:
                return f124148a;
            case 6:
                C63010eb ebVar = f124149b;
                if (ebVar == null) {
                    synchronized (C47970b.class) {
                        ebVar = f124149b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124148a);
                            f124149b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
