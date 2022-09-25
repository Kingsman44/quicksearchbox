package com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae;

import com.google.p4283bv.p4287b.p4342b.C56938b;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ae.d */
/* compiled from: PG */
public final class C56646d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56646d f151227c;

    /* renamed from: e */
    private static volatile C63010eb f151228e;

    /* renamed from: a */
    public C56943g f151229a;

    /* renamed from: b */
    public C56938b f151230b;

    /* renamed from: d */
    private int f151231d;

    static {
        C56646d dVar = new C56646d();
        f151227c = dVar;
        C62942bv.registerDefaultInstance(C56646d.class, dVar);
    }

    private C56646d() {
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
                return newMessageInfo(f151227c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C56646d();
            case 4:
                return new C56645c();
            case 5:
                return f151227c;
            case 6:
                C63010eb ebVar = f151228e;
                if (ebVar == null) {
                    synchronized (C56646d.class) {
                        ebVar = f151228e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151227c);
                            f151228e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
