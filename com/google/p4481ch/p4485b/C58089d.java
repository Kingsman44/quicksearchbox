package com.google.p4481ch.p4485b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ch.b.d */
/* compiled from: PG */
public final class C58089d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C58089d f155275a;

    /* renamed from: b */
    private static volatile C63010eb f155276b;

    static {
        C58089d dVar = new C58089d();
        f155275a = dVar;
        C62942bv.registerDefaultInstance(C58089d.class, dVar);
    }

    private C58089d() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f155275a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C58089d();
            case 4:
                return new C58088c();
            case 5:
                return f155275a;
            case 6:
                C63010eb ebVar = f155276b;
                if (ebVar == null) {
                    synchronized (C58089d.class) {
                        ebVar = f155276b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155275a);
                            f155276b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
