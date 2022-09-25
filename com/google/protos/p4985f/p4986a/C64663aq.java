package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.aq */
/* compiled from: PG */
public final class C64663aq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64663aq f175269e;

    /* renamed from: f */
    private static volatile C63010eb f175270f;

    /* renamed from: a */
    public int f175271a;

    /* renamed from: b */
    public int f175272b = 0;

    /* renamed from: c */
    public Object f175273c;

    /* renamed from: d */
    public boolean f175274d;

    static {
        C64663aq aqVar = new C64663aq();
        f175269e = aqVar;
        C62942bv.registerDefaultInstance(C64663aq.class, aqVar);
    }

    private C64663aq() {
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
                return newMessageInfo(f175269e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဇ\u0001", new Object[]{C45240c.f118157a, "b", "a", C64671ay.class, "d"});
            case 3:
                return new C64663aq();
            case 4:
                return new C64662ap();
            case 5:
                return f175269e;
            case 6:
                C63010eb ebVar = f175270f;
                if (ebVar == null) {
                    synchronized (C64663aq.class) {
                        ebVar = f175270f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175269e);
                            f175270f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
