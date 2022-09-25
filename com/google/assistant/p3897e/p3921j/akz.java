package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.akz */
/* compiled from: PG */
public final class akz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final akz f135298c;

    /* renamed from: d */
    private static volatile C63010eb f135299d;

    /* renamed from: a */
    public int f135300a = 0;

    /* renamed from: b */
    public Object f135301b;

    static {
        akz akz = new akz();
        f135298c = akz;
        C62942bv.registerDefaultInstance(akz.class, akz);
    }

    private akz() {
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
                return newMessageInfo(f135298c, "\u0001\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", aku.class, akw.class, aky.class});
            case 3:
                return new akz();
            case 4:
                return new aks();
            case 5:
                return f135298c;
            case 6:
                C63010eb ebVar = f135299d;
                if (ebVar == null) {
                    synchronized (akz.class) {
                        ebVar = f135299d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135298c);
                            f135299d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
