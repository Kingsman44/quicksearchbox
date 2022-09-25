package com.google.assistant.p3745ab.p3762n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.n.b */
/* compiled from: PG */
public final class C48360b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48360b f125032a;

    /* renamed from: b */
    private static volatile C63010eb f125033b;

    static {
        C48360b bVar = new C48360b();
        f125032a = bVar;
        C62942bv.registerDefaultInstance(C48360b.class, bVar);
    }

    private C48360b() {
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
                return newMessageInfo(f125032a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48360b();
            case 4:
                return new C48359a();
            case 5:
                return f125032a;
            case 6:
                C63010eb ebVar = f125033b;
                if (ebVar == null) {
                    synchronized (C48360b.class) {
                        ebVar = f125033b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125032a);
                            f125033b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
