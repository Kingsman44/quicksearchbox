package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5022m.C64955d;

/* renamed from: com.google.assistant.e.i.a.d */
/* compiled from: PG */
public final class C51311d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51311d f133579c;

    /* renamed from: d */
    private static volatile C63010eb f133580d;

    /* renamed from: a */
    public int f133581a;

    /* renamed from: b */
    public C64955d f133582b;

    static {
        C51311d dVar = new C51311d();
        f133579c = dVar;
        C62942bv.registerDefaultInstance(C51311d.class, dVar);
    }

    private C51311d() {
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
                return newMessageInfo(f133579c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51311d();
            case 4:
                return new C51284c();
            case 5:
                return f133579c;
            case 6:
                C63010eb ebVar = f133580d;
                if (ebVar == null) {
                    synchronized (C51311d.class) {
                        ebVar = f133580d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133579c);
                            f133580d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
