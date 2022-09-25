package com.google.android.apps.gsa.proactive;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.proactive.q */
/* compiled from: PG */
public final class C84181q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C84181q f229128c;

    /* renamed from: d */
    private static volatile C63010eb f229129d;

    /* renamed from: a */
    public int f229130a;

    /* renamed from: b */
    public boolean f229131b;

    static {
        C84181q qVar = new C84181q();
        f229128c = qVar;
        C62942bv.registerDefaultInstance(C84181q.class, qVar);
    }

    private C84181q() {
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
                return newMessageInfo(f229128c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C84181q();
            case 4:
                return new C84180p();
            case 5:
                return f229128c;
            case 6:
                C63010eb ebVar = f229129d;
                if (ebVar == null) {
                    synchronized (C84181q.class) {
                        ebVar = f229129d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f229128c);
                            f229129d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
