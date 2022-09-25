package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.ag */
/* compiled from: PG */
public final class C24774ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C24774ag f67693e;

    /* renamed from: f */
    private static volatile C63010eb f67694f;

    /* renamed from: a */
    public int f67695a;

    /* renamed from: b */
    public int f67696b;

    /* renamed from: c */
    public long f67697c;

    /* renamed from: d */
    public C24808s f67698d;

    static {
        C24774ag agVar = new C24774ag();
        f67693e = agVar;
        C62942bv.registerDefaultInstance(C24774ag.class, agVar);
    }

    private C24774ag() {
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
                return newMessageInfo(f67693e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C24805p.m45930b(), C45240c.f118157a, "d"});
            case 3:
                return new C24774ag();
            case 4:
                return new C24773af();
            case 5:
                return f67693e;
            case 6:
                C63010eb ebVar = f67694f;
                if (ebVar == null) {
                    synchronized (C24774ag.class) {
                        ebVar = f67694f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67693e);
                            f67694f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
