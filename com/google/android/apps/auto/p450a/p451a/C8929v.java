package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.auto.a.a.v */
/* compiled from: PG */
public final class C8929v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8929v f30962c;

    /* renamed from: d */
    public static final C62940bt f30963d;

    /* renamed from: e */
    private static volatile C63010eb f30964e;

    /* renamed from: a */
    public int f30965a;

    /* renamed from: b */
    public boolean f30966b;

    static {
        C8929v vVar = new C8929v();
        f30962c = vVar;
        C62942bv.registerDefaultInstance(C8929v.class, vVar);
        f30963d = C62942bv.newSingularGeneratedExtension(C8884bb.f30842c, vVar, vVar, (C62958ce) null, 102, C63066gd.MESSAGE, C8929v.class);
    }

    private C8929v() {
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
                return newMessageInfo(f30962c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8929v();
            case 4:
                return new C8928u();
            case 5:
                return f30962c;
            case 6:
                C63010eb ebVar = f30964e;
                if (ebVar == null) {
                    synchronized (C8929v.class) {
                        ebVar = f30964e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30962c);
                            f30964e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
