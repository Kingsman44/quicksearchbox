package com.google.p4242bp.p4257f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b */
/* compiled from: PG */
public final class C56218b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56218b f149746a;

    /* renamed from: b */
    private static volatile C63010eb f149747b;

    static {
        C56218b bVar = new C56218b();
        f149746a = bVar;
        C62942bv.registerDefaultInstance(C56218b.class, bVar);
    }

    private C56218b() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f149746a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56218b();
            case 4:
                return new C56200a();
            case 5:
                return f149746a;
            case 6:
                C63010eb ebVar = f149747b;
                if (ebVar == null) {
                    synchronized (C56218b.class) {
                        ebVar = f149747b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149746a);
                            f149747b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
