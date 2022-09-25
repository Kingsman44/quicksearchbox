package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ce */
/* compiled from: PG */
public final class C51289ce extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51289ce f133517c;

    /* renamed from: d */
    private static volatile C63010eb f133518d;

    /* renamed from: a */
    public int f133519a;

    /* renamed from: b */
    public int f133520b;

    static {
        C51289ce ceVar = new C51289ce();
        f133517c = ceVar;
        C62942bv.registerDefaultInstance(C51289ce.class, ceVar);
    }

    private C51289ce() {
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
                return newMessageInfo(f133517c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51288cd.f133516a});
            case 3:
                return new C51289ce();
            case 4:
                return new C51287cc();
            case 5:
                return f133517c;
            case 6:
                C63010eb ebVar = f133518d;
                if (ebVar == null) {
                    synchronized (C51289ce.class) {
                        ebVar = f133518d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133517c);
                            f133518d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
