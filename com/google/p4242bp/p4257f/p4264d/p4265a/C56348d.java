package com.google.p4242bp.p4257f.p4264d.p4265a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.d.a.d */
/* compiled from: PG */
public final class C56348d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56348d f150284c;

    /* renamed from: d */
    private static volatile C63010eb f150285d;

    /* renamed from: a */
    public int f150286a = 0;

    /* renamed from: b */
    public Object f150287b;

    static {
        C56348d dVar = new C56348d();
        f150284c = dVar;
        C62942bv.registerDefaultInstance(C56348d.class, dVar);
    }

    private C56348d() {
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
                return newMessageInfo(f150284c, "\u0001\u0002\u0001\u0000\u0001\u0005\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C56346b.class});
            case 3:
                return new C56348d();
            case 4:
                return new C56347c();
            case 5:
                return f150284c;
            case 6:
                C63010eb ebVar = f150285d;
                if (ebVar == null) {
                    synchronized (C56348d.class) {
                        ebVar = f150285d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150284c);
                            f150285d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
