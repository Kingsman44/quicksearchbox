package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.p */
/* compiled from: PG */
public final class C48119p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48119p f124535c;

    /* renamed from: d */
    private static volatile C63010eb f124536d;

    /* renamed from: a */
    public int f124537a;

    /* renamed from: b */
    public C63088z f124538b = C63088z.f170246b;

    static {
        C48119p pVar = new C48119p();
        f124535c = pVar;
        C62942bv.registerDefaultInstance(C48119p.class, pVar);
    }

    private C48119p() {
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
                return newMessageInfo(f124535c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\n", new Object[]{"a", "b"});
            case 3:
                return new C48119p();
            case 4:
                return new C48118o();
            case 5:
                return f124535c;
            case 6:
                C63010eb ebVar = f124536d;
                if (ebVar == null) {
                    synchronized (C48119p.class) {
                        ebVar = f124536d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124535c);
                            f124536d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
