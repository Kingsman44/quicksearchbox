package com.google.assistant.p3803ag.p3809c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.di */
/* compiled from: PG */
public final class C49016di extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49016di f126780f;

    /* renamed from: h */
    private static volatile C63010eb f126781h;

    /* renamed from: a */
    public int f126782a = 0;

    /* renamed from: b */
    public Object f126783b;

    /* renamed from: c */
    public int f126784c;

    /* renamed from: d */
    public long f126785d;

    /* renamed from: e */
    public long f126786e;

    /* renamed from: g */
    private int f126787g;

    static {
        C49016di diVar = new C49016di();
        f126780f = diVar;
        C62942bv.registerDefaultInstance(C49016di.class, diVar);
    }

    private C49016di() {
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
                return newMessageInfo(f126780f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ျ\u0000\u0005်\u0000", new Object[]{"b", "a", C30325g.f82003a, C45240c.f118157a, C49014dg.f126779a, "d", "e"});
            case 3:
                return new C49016di();
            case 4:
                return new C49013df();
            case 5:
                return f126780f;
            case 6:
                C63010eb ebVar = f126781h;
                if (ebVar == null) {
                    synchronized (C49016di.class) {
                        ebVar = f126781h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126780f);
                            f126781h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
