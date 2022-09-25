package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.w */
/* compiled from: PG */
public final class C55515w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55515w f146494c;

    /* renamed from: d */
    private static volatile C63010eb f146495d;

    /* renamed from: a */
    public int f146496a = 0;

    /* renamed from: b */
    public Object f146497b;

    static {
        C55515w wVar = new C55515w();
        f146494c = wVar;
        C62942bv.registerDefaultInstance(C55515w.class, wVar);
    }

    private C55515w() {
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
                return newMessageInfo(f146494c, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", C55437aa.class, C55443ag.class, C55445ai.class, C55463b.class, C55476bm.class, C55513u.class, C55495ce.class, C55453aq.class, C55447ak.class});
            case 3:
                return new C55515w();
            case 4:
                return new C55514v();
            case 5:
                return f146494c;
            case 6:
                C63010eb ebVar = f146495d;
                if (ebVar == null) {
                    synchronized (C55515w.class) {
                        ebVar = f146495d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146494c);
                            f146495d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
