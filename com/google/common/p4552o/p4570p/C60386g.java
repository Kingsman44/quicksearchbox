package com.google.common.p4552o.p4570p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.g */
/* compiled from: PG */
public final class C60386g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60386g f163418c;

    /* renamed from: d */
    private static volatile C63010eb f163419d;

    /* renamed from: a */
    public int f163420a;

    /* renamed from: b */
    public C60389j f163421b;

    static {
        C60386g gVar = new C60386g();
        f163418c = gVar;
        C62942bv.registerDefaultInstance(C60386g.class, gVar);
    }

    private C60386g() {
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
                return newMessageInfo(f163418c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"a", "b"});
            case 3:
                return new C60386g();
            case 4:
                return new C60385f();
            case 5:
                return f163418c;
            case 6:
                C63010eb ebVar = f163419d;
                if (ebVar == null) {
                    synchronized (C60386g.class) {
                        ebVar = f163419d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163418c);
                            f163419d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
