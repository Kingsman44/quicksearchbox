package com.google.assistant.p3745ab.p3760l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.l.b */
/* compiled from: PG */
public final class C48354b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48354b f125022a;

    /* renamed from: b */
    private static volatile C63010eb f125023b;

    static {
        C48354b bVar = new C48354b();
        f125022a = bVar;
        C62942bv.registerDefaultInstance(C48354b.class, bVar);
    }

    private C48354b() {
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
                return newMessageInfo(f125022a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48354b();
            case 4:
                return new C48353a();
            case 5:
                return f125022a;
            case 6:
                C63010eb ebVar = f125023b;
                if (ebVar == null) {
                    synchronized (C48354b.class) {
                        ebVar = f125023b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125022a);
                            f125023b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
