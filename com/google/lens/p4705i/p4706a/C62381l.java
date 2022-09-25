package com.google.lens.p4705i.p4706a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.l */
/* compiled from: PG */
public final class C62381l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62381l f168399c;

    /* renamed from: d */
    private static volatile C63010eb f168400d;

    /* renamed from: a */
    public int f168401a;

    /* renamed from: b */
    public C62370ab f168402b;

    static {
        C62381l lVar = new C62381l();
        f168399c = lVar;
        C62942bv.registerDefaultInstance(C62381l.class, lVar);
    }

    private C62381l() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f168399c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62381l();
            case 4:
                return new C62380k();
            case 5:
                return f168399c;
            case 6:
                C63010eb ebVar = f168400d;
                if (ebVar == null) {
                    synchronized (C62381l.class) {
                        ebVar = f168400d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168399c);
                            f168400d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
