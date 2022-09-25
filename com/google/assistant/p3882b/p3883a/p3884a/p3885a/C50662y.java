package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.y */
/* compiled from: PG */
public final class C50662y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50662y f131783c;

    /* renamed from: d */
    private static volatile C63010eb f131784d;

    /* renamed from: a */
    public C50631ag f131785a;

    /* renamed from: b */
    public int f131786b;

    static {
        C50662y yVar = new C50662y();
        f131783c = yVar;
        C62942bv.registerDefaultInstance(C50662y.class, yVar);
    }

    private C50662y() {
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
                return newMessageInfo(f131783c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\f", new Object[]{"a", "b"});
            case 3:
                return new C50662y();
            case 4:
                return new C50660w();
            case 5:
                return f131783c;
            case 6:
                C63010eb ebVar = f131784d;
                if (ebVar == null) {
                    synchronized (C50662y.class) {
                        ebVar = f131784d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131783c);
                            f131784d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
