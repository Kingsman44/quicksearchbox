package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.ag */
/* compiled from: PG */
public final class C54814ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54814ag f143814c;

    /* renamed from: d */
    private static volatile C63010eb f143815d;

    /* renamed from: a */
    public int f143816a;

    /* renamed from: b */
    public int f143817b;

    static {
        C54814ag agVar = new C54814ag();
        f143814c = agVar;
        C62942bv.registerDefaultInstance(C54814ag.class, agVar);
    }

    private C54814ag() {
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
                return newMessageInfo(f143814c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C54813af.m87537b()});
            case 3:
                return new C54814ag();
            case 4:
                return new C54811ad();
            case 5:
                return f143814c;
            case 6:
                C63010eb ebVar = f143815d;
                if (ebVar == null) {
                    synchronized (C54814ag.class) {
                        ebVar = f143815d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143814c);
                            f143815d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
