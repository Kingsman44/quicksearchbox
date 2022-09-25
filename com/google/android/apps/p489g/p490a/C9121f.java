package com.google.android.apps.p489g.p490a;

import com.google.p375ai.p378b.C7744ii;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.g.a.f */
/* compiled from: PG */
public final class C9121f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9121f f31397c;

    /* renamed from: d */
    public static final C62940bt f31398d;

    /* renamed from: e */
    private static volatile C63010eb f31399e;

    /* renamed from: a */
    public int f31400a;

    /* renamed from: b */
    public long f31401b;

    static {
        C9121f fVar = new C9121f();
        f31397c = fVar;
        C62942bv.registerDefaultInstance(C9121f.class, fVar);
        f31398d = C62942bv.newSingularGeneratedExtension(C7744ii.f27054p, fVar, fVar, (C62958ce) null, 259021205, C63066gd.MESSAGE, C9121f.class);
    }

    private C9121f() {
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
                return newMessageInfo(f31397c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9121f();
            case 4:
                return new C9120e();
            case 5:
                return f31397c;
            case 6:
                C63010eb ebVar = f31399e;
                if (ebVar == null) {
                    synchronized (C9121f.class) {
                        ebVar = f31399e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31397c);
                            f31399e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
