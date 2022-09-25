package com.google.nlp.p4735b.p4736a.p4738b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.b */
/* compiled from: PG */
public final class C62820b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62820b f169645c;

    /* renamed from: e */
    private static volatile C63010eb f169646e;

    /* renamed from: a */
    public C62825g f169647a;

    /* renamed from: b */
    public C62825g f169648b;

    /* renamed from: d */
    private int f169649d;

    static {
        C62820b bVar = new C62820b();
        f169645c = bVar;
        C62942bv.registerDefaultInstance(C62820b.class, bVar);
    }

    private C62820b() {
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
                return newMessageInfo(f169645c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C62820b();
            case 4:
                return new C62819a();
            case 5:
                return f169645c;
            case 6:
                C63010eb ebVar = f169646e;
                if (ebVar == null) {
                    synchronized (C62820b.class) {
                        ebVar = f169646e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169645c);
                            f169646e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
