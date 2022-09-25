package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.y */
/* compiled from: PG */
public final class C54460y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54460y f143004c;

    /* renamed from: d */
    private static volatile C63010eb f143005d;

    /* renamed from: a */
    public C54394ct f143006a;

    /* renamed from: b */
    public C54366bs f143007b;

    static {
        C54460y yVar = new C54460y();
        f143004c = yVar;
        C62942bv.registerDefaultInstance(C54460y.class, yVar);
    }

    private C54460y() {
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
                return newMessageInfo(f143004c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54460y();
            case 4:
                return new C54459x();
            case 5:
                return f143004c;
            case 6:
                C63010eb ebVar = f143005d;
                if (ebVar == null) {
                    synchronized (C54460y.class) {
                        ebVar = f143005d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143004c);
                            f143005d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
