package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ln */
/* compiled from: PG */
public final class C51541ln extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51541ln f134330c;

    /* renamed from: d */
    private static volatile C63010eb f134331d;

    /* renamed from: a */
    public int f134332a;

    /* renamed from: b */
    public int f134333b;

    static {
        C51541ln lnVar = new C51541ln();
        f134330c = lnVar;
        C62942bv.registerDefaultInstance(C51541ln.class, lnVar);
    }

    private C51541ln() {
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
                return newMessageInfo(f134330c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C51539ll.f134329a});
            case 3:
                return new C51541ln();
            case 4:
                return new C51538lk();
            case 5:
                return f134330c;
            case 6:
                C63010eb ebVar = f134331d;
                if (ebVar == null) {
                    synchronized (C51541ln.class) {
                        ebVar = f134331d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134330c);
                            f134331d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
