package com.google.assistant.p4008y.p4013d.p4014a;

import com.google.knowledge.p4671b.C61822o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.a.n */
/* compiled from: PG */
public final class C53645n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53645n f140798c;

    /* renamed from: d */
    private static volatile C63010eb f140799d;

    /* renamed from: a */
    public int f140800a;

    /* renamed from: b */
    public int f140801b;

    static {
        C53645n nVar = new C53645n();
        f140798c = nVar;
        C62942bv.registerDefaultInstance(C53645n.class, nVar);
    }

    private C53645n() {
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
                return newMessageInfo(f140798c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C61822o.m94478b()});
            case 3:
                return new C53645n();
            case 4:
                return new C53644m();
            case 5:
                return f140798c;
            case 6:
                C63010eb ebVar = f140799d;
                if (ebVar == null) {
                    synchronized (C53645n.class) {
                        ebVar = f140799d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140798c);
                            f140799d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
