package com.google.protos.p4985f.p5007i.p5008a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.i.a.d */
/* compiled from: PG */
public final class C64863d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64863d f175765c;

    /* renamed from: e */
    private static volatile C63010eb f175766e;

    /* renamed from: a */
    public C62971cq f175767a = emptyProtobufList();

    /* renamed from: b */
    public C64865f f175768b;

    /* renamed from: d */
    private int f175769d;

    static {
        C64863d dVar = new C64863d();
        f175765c = dVar;
        C62942bv.registerDefaultInstance(C64863d.class, dVar);
    }

    private C64863d() {
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
                return newMessageInfo(f175765c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0000", new Object[]{"d", "a", C64861b.class, "b"});
            case 3:
                return new C64863d();
            case 4:
                return new C64862c();
            case 5:
                return f175765c;
            case 6:
                C63010eb ebVar = f175766e;
                if (ebVar == null) {
                    synchronized (C64863d.class) {
                        ebVar = f175766e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175765c);
                            f175766e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
