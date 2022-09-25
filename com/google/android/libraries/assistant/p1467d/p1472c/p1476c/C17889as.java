package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.android.libraries.assistant.p1467d.p1471b.C17816b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.as */
/* compiled from: PG */
public final class C17889as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17889as f51256c;

    /* renamed from: d */
    private static volatile C63010eb f51257d;

    /* renamed from: a */
    public int f51258a;

    /* renamed from: b */
    public int f51259b;

    static {
        C17889as asVar = new C17889as();
        f51256c = asVar;
        C62942bv.registerDefaultInstance(C17889as.class, asVar);
    }

    private C17889as() {
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
                return newMessageInfo(f51256c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C17816b.f51119a});
            case 3:
                return new C17889as();
            case 4:
                return new C17888ar();
            case 5:
                return f51256c;
            case 6:
                C63010eb ebVar = f51257d;
                if (ebVar == null) {
                    synchronized (C17889as.class) {
                        ebVar = f51257d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51256c);
                            f51257d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
