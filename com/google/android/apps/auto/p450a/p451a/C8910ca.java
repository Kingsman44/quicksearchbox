package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.auto.a.a.ca */
/* compiled from: PG */
public final class C8910ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8910ca f30917c;

    /* renamed from: d */
    public static final C62940bt f30918d;

    /* renamed from: e */
    private static volatile C63010eb f30919e;

    /* renamed from: a */
    public int f30920a = 0;

    /* renamed from: b */
    public Object f30921b;

    static {
        C8910ca caVar = new C8910ca();
        f30917c = caVar;
        C62942bv.registerDefaultInstance(C8910ca.class, caVar);
        f30918d = C62942bv.newSingularGeneratedExtension(C8884bb.f30842c, caVar, caVar, (C62958ce) null, 103, C63066gd.MESSAGE, C8910ca.class);
    }

    private C8910ca() {
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
                return newMessageInfo(f30917c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C8903bu.class, C8905bw.class, C8907by.class});
            case 3:
                return new C8910ca();
            case 4:
                return new C8908bz();
            case 5:
                return f30917c;
            case 6:
                C63010eb ebVar = f30919e;
                if (ebVar == null) {
                    synchronized (C8910ca.class) {
                        ebVar = f30919e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30917c);
                            f30919e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
