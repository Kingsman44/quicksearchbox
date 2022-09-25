package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.c */
/* compiled from: PG */
public final class C64017c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64017c f173106f;

    /* renamed from: g */
    private static volatile C63010eb f173107g;

    /* renamed from: a */
    public int f173108a;

    /* renamed from: b */
    public int f173109b = 0;

    /* renamed from: c */
    public Object f173110c;

    /* renamed from: d */
    public int f173111d;

    /* renamed from: e */
    public int f173112e = 30;

    static {
        C64017c cVar = new C64017c();
        f173106f = cVar;
        C62942bv.registerDefaultInstance(C64017c.class, cVar);
    }

    private C64017c() {
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
                return newMessageInfo(f173106f, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ဌ\u0004\u0004ြ\u0000\u0005ြ\u0000\bဋ\u0006", new Object[]{C45240c.f118157a, "b", "a", "d", C63963a.f172990a, C64022ce.class, C64022ce.class, "e"});
            case 3:
                return new C64017c();
            case 4:
                return new C63990b();
            case 5:
                return f173106f;
            case 6:
                C63010eb ebVar = f173107g;
                if (ebVar == null) {
                    synchronized (C64017c.class) {
                        ebVar = f173107g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173106f);
                            f173107g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
