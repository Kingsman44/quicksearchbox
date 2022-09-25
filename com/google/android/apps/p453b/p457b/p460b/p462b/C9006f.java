package com.google.android.apps.p453b.p457b.p460b.p462b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.android.apps.b.b.b.b.f */
/* compiled from: PG */
public final class C9006f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9006f f31120b;

    /* renamed from: c */
    public static final C62940bt f31121c;

    /* renamed from: e */
    private static volatile C63010eb f31122e;

    /* renamed from: a */
    public int f31123a;

    /* renamed from: d */
    private int f31124d;

    static {
        C9006f fVar = new C9006f();
        f31120b = fVar;
        C62942bv.registerDefaultInstance(C9006f.class, fVar);
        f31121c = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, fVar, fVar, (C62958ce) null, 265798317, C63066gd.MESSAGE, C9006f.class);
    }

    private C9006f() {
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
                return newMessageInfo(f31120b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", C9004d.f31119a});
            case 3:
                return new C9006f();
            case 4:
                return new C9003c();
            case 5:
                return f31120b;
            case 6:
                C63010eb ebVar = f31122e;
                if (ebVar == null) {
                    synchronized (C9006f.class) {
                        ebVar = f31122e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31120b);
                            f31122e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
