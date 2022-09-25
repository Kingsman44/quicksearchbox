package com.google.knowledge.p4661a.p4662a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4794ae.p4795a.C63148b;

/* renamed from: com.google.knowledge.a.a.t */
/* compiled from: PG */
public final class C61758t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61758t f166824c;

    /* renamed from: d */
    private static volatile C63010eb f166825d;

    /* renamed from: a */
    public int f166826a = 0;

    /* renamed from: b */
    public Object f166827b;

    static {
        C61758t tVar = new C61758t();
        f166824c = tVar;
        C62942bv.registerDefaultInstance(C61758t.class, tVar);
    }

    private C61758t() {
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
                return newMessageInfo(f166824c, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001ျ\u0000\u0002ဵ\u0000\u0003ဳ\u0000\u0004်\u0000\u0005ျ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C63148b.class});
            case 3:
                return new C61758t();
            case 4:
                return new C61757s();
            case 5:
                return f166824c;
            case 6:
                C63010eb ebVar = f166825d;
                if (ebVar == null) {
                    synchronized (C61758t.class) {
                        ebVar = f166825d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166824c);
                            f166825d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
