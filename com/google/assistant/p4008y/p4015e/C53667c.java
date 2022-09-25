package com.google.assistant.p4008y.p4015e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.e.c */
/* compiled from: PG */
public final class C53667c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53667c f140861c;

    /* renamed from: d */
    private static volatile C63010eb f140862d;

    /* renamed from: a */
    public int f140863a;

    /* renamed from: b */
    public int f140864b;

    static {
        C53667c cVar = new C53667c();
        f140861c = cVar;
        C62942bv.registerDefaultInstance(C53667c.class, cVar);
    }

    private C53667c() {
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
                return newMessageInfo(f140861c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53667c();
            case 4:
                return new C53666b();
            case 5:
                return f140861c;
            case 6:
                C63010eb ebVar = f140862d;
                if (ebVar == null) {
                    synchronized (C53667c.class) {
                        ebVar = f140862d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140861c);
                            f140862d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
