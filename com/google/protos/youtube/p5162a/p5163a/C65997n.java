package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.n */
/* compiled from: PG */
public final class C65997n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65997n f179488c;

    /* renamed from: d */
    private static volatile C63010eb f179489d;

    /* renamed from: a */
    public int f179490a = 0;

    /* renamed from: b */
    public Object f179491b;

    static {
        C65997n nVar = new C65997n();
        f179488c = nVar;
        C62942bv.registerDefaultInstance(C65997n.class, nVar);
    }

    private C65997n() {
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
                return newMessageInfo(f179488c, "\u0001\u0007\u0001\u0000\u0001\u0012\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0007ြ\u0000\bြ\u0000\u000eြ\u0000\u0012ြ\u0000", new Object[]{"b", "a", C65972ab.class, C65995l.class, C65976af.class, C66007x.class, C65984an.class, C65974ad.class, C65993j.class});
            case 3:
                return new C65997n();
            case 4:
                return new C65996m();
            case 5:
                return f179488c;
            case 6:
                C63010eb ebVar = f179489d;
                if (ebVar == null) {
                    synchronized (C65997n.class) {
                        ebVar = f179489d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179488c);
                            f179489d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
