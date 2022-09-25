package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.af */
/* compiled from: PG */
public final class C65976af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65976af f179446a;

    /* renamed from: b */
    private static volatile C63010eb f179447b;

    static {
        C65976af afVar = new C65976af();
        f179446a = afVar;
        C62942bv.registerDefaultInstance(C65976af.class, afVar);
    }

    private C65976af() {
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
                return newMessageInfo(f179446a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65976af();
            case 4:
                return new C65975ae();
            case 5:
                return f179446a;
            case 6:
                C63010eb ebVar = f179447b;
                if (ebVar == null) {
                    synchronized (C65976af.class) {
                        ebVar = f179447b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179446a);
                            f179447b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
