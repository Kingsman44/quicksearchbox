package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.f */
/* compiled from: PG */
public final class C54441f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54441f f142966c;

    /* renamed from: d */
    private static volatile C63010eb f142967d;

    /* renamed from: a */
    public long f142968a;

    /* renamed from: b */
    public C54364bq f142969b;

    static {
        C54441f fVar = new C54441f();
        f142966c = fVar;
        C62942bv.registerDefaultInstance(C54441f.class, fVar);
    }

    private C54441f() {
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
                return newMessageInfo(f142966c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0002\u0003\t", new Object[]{"a", "b"});
            case 3:
                return new C54441f();
            case 4:
                return new C54428e();
            case 5:
                return f142966c;
            case 6:
                C63010eb ebVar = f142967d;
                if (ebVar == null) {
                    synchronized (C54441f.class) {
                        ebVar = f142967d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142966c);
                            f142967d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
