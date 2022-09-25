package com.google.assistant.p3745ab.p3770v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.ab.v.b */
/* compiled from: PG */
public final class C48408b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48408b f125108a;

    /* renamed from: b */
    private static volatile C63010eb f125109b;

    static {
        C48408b bVar = new C48408b();
        f125108a = bVar;
        C62942bv.registerDefaultInstance(C48408b.class, bVar);
    }

    private C48408b() {
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
                return newMessageInfo(f125108a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48408b();
            case 4:
                return new C48407a();
            case 5:
                return f125108a;
            case 6:
                C63010eb ebVar = f125109b;
                if (ebVar == null) {
                    synchronized (C48408b.class) {
                        ebVar = f125109b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125108a);
                            f125109b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
