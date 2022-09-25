package com.google.assistant.p3989p.p3990a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.p.a.h */
/* compiled from: PG */
public final class C53046h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53046h f139029c;

    /* renamed from: d */
    private static volatile C63010eb f139030d;

    /* renamed from: a */
    public int f139031a;

    /* renamed from: b */
    public int f139032b;

    static {
        C53046h hVar = new C53046h();
        f139029c = hVar;
        C62942bv.registerDefaultInstance(C53046h.class, hVar);
    }

    private C53046h() {
        emptyProtobufList();
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
                return newMessageInfo(f139029c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53046h();
            case 4:
                return new C53045g();
            case 5:
                return f139029c;
            case 6:
                C63010eb ebVar = f139030d;
                if (ebVar == null) {
                    synchronized (C53046h.class) {
                        ebVar = f139030d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139029c);
                            f139030d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
