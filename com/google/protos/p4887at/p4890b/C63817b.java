package com.google.protos.p4887at.p4890b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.at.b.b */
/* compiled from: PG */
public final class C63817b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63817b f172595a;

    /* renamed from: b */
    private static volatile C63010eb f172596b;

    static {
        C63817b bVar = new C63817b();
        f172595a = bVar;
        C62942bv.registerDefaultInstance(C63817b.class, bVar);
    }

    private C63817b() {
        emptyProtobufList();
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
                return newMessageInfo(f172595a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63817b();
            case 4:
                return new C63816a();
            case 5:
                return f172595a;
            case 6:
                C63010eb ebVar = f172596b;
                if (ebVar == null) {
                    synchronized (C63817b.class) {
                        ebVar = f172596b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172595a);
                            f172596b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
