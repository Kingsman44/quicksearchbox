package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.h */
/* compiled from: PG */
public final class C13695h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13695h f41781c;

    /* renamed from: d */
    private static volatile C63010eb f41782d;

    /* renamed from: a */
    public int f41783a;

    /* renamed from: b */
    public C52070ec f41784b;

    static {
        C13695h hVar = new C13695h();
        f41781c = hVar;
        C62942bv.registerDefaultInstance(C13695h.class, hVar);
    }

    private C13695h() {
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
                return newMessageInfo(f41781c, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13695h();
            case 4:
                return new C13694g();
            case 5:
                return f41781c;
            case 6:
                C63010eb ebVar = f41782d;
                if (ebVar == null) {
                    synchronized (C13695h.class) {
                        ebVar = f41782d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41781c);
                            f41782d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
