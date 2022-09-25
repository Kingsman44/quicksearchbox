package com.google.assistant.p3745ab.p3756h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.h.b */
/* compiled from: PG */
public final class C48342b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48342b f125006a;

    /* renamed from: b */
    private static volatile C63010eb f125007b;

    static {
        C48342b bVar = new C48342b();
        f125006a = bVar;
        C62942bv.registerDefaultInstance(C48342b.class, bVar);
    }

    private C48342b() {
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
                return newMessageInfo(f125006a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48342b();
            case 4:
                return new C48341a();
            case 5:
                return f125006a;
            case 6:
                C63010eb ebVar = f125007b;
                if (ebVar == null) {
                    synchronized (C48342b.class) {
                        ebVar = f125007b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125006a);
                            f125007b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
