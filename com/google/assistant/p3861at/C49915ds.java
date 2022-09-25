package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ds */
/* compiled from: PG */
public final class C49915ds extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49915ds f129741c;

    /* renamed from: d */
    private static volatile C63010eb f129742d;

    /* renamed from: a */
    public int f129743a;

    /* renamed from: b */
    public boolean f129744b;

    static {
        C49915ds dsVar = new C49915ds();
        f129741c = dsVar;
        C62942bv.registerDefaultInstance(C49915ds.class, dsVar);
    }

    private C49915ds() {
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
                return newMessageInfo(f129741c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49915ds();
            case 4:
                return new C49914dr();
            case 5:
                return f129741c;
            case 6:
                C63010eb ebVar = f129742d;
                if (ebVar == null) {
                    synchronized (C49915ds.class) {
                        ebVar = f129742d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129741c);
                            f129742d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
