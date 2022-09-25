package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.b */
/* compiled from: PG */
public final class C48241b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48241b f124797b;

    /* renamed from: c */
    private static volatile C63010eb f124798c;

    /* renamed from: a */
    public int f124799a;

    static {
        C48241b bVar = new C48241b();
        f124797b = bVar;
        C62942bv.registerDefaultInstance(C48241b.class, bVar);
    }

    private C48241b() {
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
                return newMessageInfo(f124797b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u0004", new Object[]{"a"});
            case 3:
                return new C48241b();
            case 4:
                return new C48176a();
            case 5:
                return f124797b;
            case 6:
                C63010eb ebVar = f124798c;
                if (ebVar == null) {
                    synchronized (C48241b.class) {
                        ebVar = f124798c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124797b);
                            f124798c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
