package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.dg */
/* compiled from: PG */
public final class C57436dg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57436dg f153415a;

    /* renamed from: b */
    private static volatile C63010eb f153416b;

    static {
        C57436dg dgVar = new C57436dg();
        f153415a = dgVar;
        C62942bv.registerDefaultInstance(C57436dg.class, dgVar);
    }

    private C57436dg() {
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
                return newMessageInfo(f153415a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57436dg();
            case 4:
                return new C57435df();
            case 5:
                return f153415a;
            case 6:
                C63010eb ebVar = f153416b;
                if (ebVar == null) {
                    synchronized (C57436dg.class) {
                        ebVar = f153416b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153415a);
                            f153416b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
