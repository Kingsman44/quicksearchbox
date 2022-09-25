package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.d */
/* compiled from: PG */
public final class C13058d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13058d f40532c;

    /* renamed from: d */
    private static volatile C63010eb f40533d;

    /* renamed from: a */
    public int f40534a;

    /* renamed from: b */
    public C52289mf f40535b;

    static {
        C13058d dVar = new C13058d();
        f40532c = dVar;
        C62942bv.registerDefaultInstance(C13058d.class, dVar);
    }

    private C13058d() {
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
                return newMessageInfo(f40532c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13058d();
            case 4:
                return new C13057c();
            case 5:
                return f40532c;
            case 6:
                C63010eb ebVar = f40533d;
                if (ebVar == null) {
                    synchronized (C13058d.class) {
                        ebVar = f40533d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40532c);
                            f40533d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
