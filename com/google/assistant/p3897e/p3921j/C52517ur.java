package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ur */
/* compiled from: PG */
public final class C52517ur extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52517ur f137858c;

    /* renamed from: d */
    private static volatile C63010eb f137859d;

    /* renamed from: a */
    public int f137860a;

    /* renamed from: b */
    public int f137861b;

    static {
        C52517ur urVar = new C52517ur();
        f137858c = urVar;
        C62942bv.registerDefaultInstance(C52517ur.class, urVar);
    }

    private C52517ur() {
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
                return newMessageInfo(f137858c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52517ur();
            case 4:
                return new C52516uq();
            case 5:
                return f137858c;
            case 6:
                C63010eb ebVar = f137859d;
                if (ebVar == null) {
                    synchronized (C52517ur.class) {
                        ebVar = f137859d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137858c);
                            f137859d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
