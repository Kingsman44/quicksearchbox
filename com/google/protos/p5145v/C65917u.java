package com.google.protos.p5145v;

import com.google.common.p4552o.apv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.v.u */
/* compiled from: PG */
public final class C65917u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65917u f179261c;

    /* renamed from: d */
    public static final C62940bt f179262d;

    /* renamed from: e */
    private static volatile C63010eb f179263e;

    /* renamed from: a */
    public int f179264a;

    /* renamed from: b */
    public C65921y f179265b;

    static {
        C65917u uVar = new C65917u();
        f179261c = uVar;
        C62942bv.registerDefaultInstance(C65917u.class, uVar);
        f179262d = C62942bv.newSingularGeneratedExtension(apv.f159704a, uVar, uVar, (C62958ce) null, 435473683, C63066gd.MESSAGE, C65917u.class);
    }

    private C65917u() {
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
                return newMessageInfo(f179261c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65917u();
            case 4:
                return new C65916t();
            case 5:
                return f179261c;
            case 6:
                C63010eb ebVar = f179263e;
                if (ebVar == null) {
                    synchronized (C65917u.class) {
                        ebVar = f179263e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179261c);
                            f179263e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
