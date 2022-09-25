package com.google.protos.p4985f.p5006h;

import com.google.assistant.p4003x.p4004a.C53528e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.h.b */
/* compiled from: PG */
public final class C64857b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64857b f175755c;

    /* renamed from: d */
    private static volatile C63010eb f175756d;

    /* renamed from: a */
    public int f175757a;

    /* renamed from: b */
    public C53528e f175758b;

    static {
        C64857b bVar = new C64857b();
        f175755c = bVar;
        C62942bv.registerDefaultInstance(C64857b.class, bVar);
    }

    private C64857b() {
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
                return newMessageInfo(f175755c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64857b();
            case 4:
                return new C64856a();
            case 5:
                return f175755c;
            case 6:
                C63010eb ebVar = f175756d;
                if (ebVar == null) {
                    synchronized (C64857b.class) {
                        ebVar = f175756d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175755c);
                            f175756d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
