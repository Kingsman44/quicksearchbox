package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.v */
/* compiled from: PG */
public final class C48740v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48740v f126119c;

    /* renamed from: d */
    private static volatile C63010eb f126120d;

    /* renamed from: a */
    public int f126121a;

    /* renamed from: b */
    public int f126122b;

    static {
        C48740v vVar = new C48740v();
        f126119c = vVar;
        C62942bv.registerDefaultInstance(C48740v.class, vVar);
    }

    private C48740v() {
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
                return newMessageInfo(f126119c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48739u.f126118a});
            case 3:
                return new C48740v();
            case 4:
                return new C48738t();
            case 5:
                return f126119c;
            case 6:
                C63010eb ebVar = f126120d;
                if (ebVar == null) {
                    synchronized (C48740v.class) {
                        ebVar = f126120d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126119c);
                            f126120d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
