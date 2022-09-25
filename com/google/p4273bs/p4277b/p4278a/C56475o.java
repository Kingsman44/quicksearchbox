package com.google.p4273bs.p4277b.p4278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.o */
/* compiled from: PG */
public final class C56475o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56475o f150854a;

    /* renamed from: b */
    private static volatile C63010eb f150855b;

    static {
        C56475o oVar = new C56475o();
        f150854a = oVar;
        C62942bv.registerDefaultInstance(C56475o.class, oVar);
    }

    private C56475o() {
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
                return newMessageInfo(f150854a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56475o();
            case 4:
                return new C56474n();
            case 5:
                return f150854a;
            case 6:
                C63010eb ebVar = f150855b;
                if (ebVar == null) {
                    synchronized (C56475o.class) {
                        ebVar = f150855b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150854a);
                            f150855b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
