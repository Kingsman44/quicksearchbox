package com.google.assistant.p3745ab.p3752d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.d.b */
/* compiled from: PG */
public final class C48301b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48301b f124923a;

    /* renamed from: b */
    private static volatile C63010eb f124924b;

    static {
        C48301b bVar = new C48301b();
        f124923a = bVar;
        C62942bv.registerDefaultInstance(C48301b.class, bVar);
    }

    private C48301b() {
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
                return newMessageInfo(f124923a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48301b();
            case 4:
                return new C48300a();
            case 5:
                return f124923a;
            case 6:
                C63010eb ebVar = f124924b;
                if (ebVar == null) {
                    synchronized (C48301b.class) {
                        ebVar = f124924b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124923a);
                            f124924b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
