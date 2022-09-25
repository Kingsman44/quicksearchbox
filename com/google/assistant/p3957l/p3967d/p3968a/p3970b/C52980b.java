package com.google.assistant.p3957l.p3967d.p3968a.p3970b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.d.a.b.b */
/* compiled from: PG */
public final class C52980b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52980b f138888a;

    /* renamed from: b */
    private static volatile C63010eb f138889b;

    static {
        C52980b bVar = new C52980b();
        f138888a = bVar;
        C62942bv.registerDefaultInstance(C52980b.class, bVar);
    }

    private C52980b() {
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
                return newMessageInfo(f138888a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52980b();
            case 4:
                return new C52979a();
            case 5:
                return f138888a;
            case 6:
                C63010eb ebVar = f138889b;
                if (ebVar == null) {
                    synchronized (C52980b.class) {
                        ebVar = f138889b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138888a);
                            f138889b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
