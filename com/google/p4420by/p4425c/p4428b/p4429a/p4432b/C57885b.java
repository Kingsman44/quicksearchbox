package com.google.p4420by.p4425c.p4428b.p4429a.p4432b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.by.c.b.a.b.b */
/* compiled from: PG */
public final class C57885b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57885b f154844a;

    /* renamed from: b */
    private static volatile C63010eb f154845b;

    static {
        C57885b bVar = new C57885b();
        f154844a = bVar;
        C62942bv.registerDefaultInstance(C57885b.class, bVar);
    }

    private C57885b() {
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
                return newMessageInfo(f154844a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57885b();
            case 4:
                return new C57884a();
            case 5:
                return f154844a;
            case 6:
                C63010eb ebVar = f154845b;
                if (ebVar == null) {
                    synchronized (C57885b.class) {
                        ebVar = f154845b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154844a);
                            f154845b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
