package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.d */
/* compiled from: PG */
public final class C49896d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49896d f129700c;

    /* renamed from: d */
    private static volatile C63010eb f129701d;

    /* renamed from: a */
    public int f129702a;

    /* renamed from: b */
    public boolean f129703b;

    static {
        C49896d dVar = new C49896d();
        f129700c = dVar;
        C62942bv.registerDefaultInstance(C49896d.class, dVar);
    }

    private C49896d() {
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
                return newMessageInfo(f129700c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C49896d();
            case 4:
                return new C49869c();
            case 5:
                return f129700c;
            case 6:
                C63010eb ebVar = f129701d;
                if (ebVar == null) {
                    synchronized (C49896d.class) {
                        ebVar = f129701d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129700c);
                            f129701d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
