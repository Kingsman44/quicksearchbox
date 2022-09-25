package com.google.android.libraries.assistant.contexttrigger.p1457c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.s */
/* compiled from: PG */
public final class C17655s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17655s f50782c;

    /* renamed from: d */
    private static volatile C63010eb f50783d;

    /* renamed from: a */
    public int f50784a;

    /* renamed from: b */
    public C17653q f50785b;

    static {
        C17655s sVar = new C17655s();
        f50782c = sVar;
        C62942bv.registerDefaultInstance(C17655s.class, sVar);
    }

    private C17655s() {
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
                return newMessageInfo(f50782c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17655s();
            case 4:
                return new C17654r();
            case 5:
                return f50782c;
            case 6:
                C63010eb ebVar = f50783d;
                if (ebVar == null) {
                    synchronized (C17655s.class) {
                        ebVar = f50783d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50782c);
                            f50783d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
