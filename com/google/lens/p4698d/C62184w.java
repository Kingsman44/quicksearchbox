package com.google.lens.p4698d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.w */
/* compiled from: PG */
public final class C62184w extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62184w f167902f;

    /* renamed from: g */
    private static volatile C63010eb f167903g;

    /* renamed from: a */
    public int f167904a;

    /* renamed from: b */
    public boolean f167905b;

    /* renamed from: c */
    public long f167906c;

    /* renamed from: d */
    public long f167907d;

    /* renamed from: e */
    public int f167908e;

    static {
        C62184w wVar = new C62184w();
        f167902f = wVar;
        C62942bv.registerDefaultInstance(C62184w.class, wVar);
    }

    private C62184w() {
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
                return newMessageInfo(f167902f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C62164c.f167823a});
            case 3:
                return new C62184w();
            case 4:
                return new C62183v();
            case 5:
                return f167902f;
            case 6:
                C63010eb ebVar = f167903g;
                if (ebVar == null) {
                    synchronized (C62184w.class) {
                        ebVar = f167903g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167902f);
                            f167903g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
