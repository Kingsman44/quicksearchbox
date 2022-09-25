package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57767j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.y */
/* compiled from: PG */
public final class C54516y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54516y f143137b;

    /* renamed from: c */
    private static volatile C63010eb f143138c;

    /* renamed from: a */
    public C57767j f143139a;

    static {
        C54516y yVar = new C54516y();
        f143137b = yVar;
        C62942bv.registerDefaultInstance(C54516y.class, yVar);
    }

    private C54516y() {
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
                return newMessageInfo(f143137b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54516y();
            case 4:
                return new C54515x();
            case 5:
                return f143137b;
            case 6:
                C63010eb ebVar = f143138c;
                if (ebVar == null) {
                    synchronized (C54516y.class) {
                        ebVar = f143138c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143137b);
                            f143138c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
