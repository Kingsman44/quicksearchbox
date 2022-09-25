package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.b.h */
/* compiled from: PG */
public final class C57151h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57151h f152573b;

    /* renamed from: c */
    public static final C62940bt f152574c;

    /* renamed from: e */
    private static volatile C63010eb f152575e;

    /* renamed from: a */
    public int f152576a;

    /* renamed from: d */
    private int f152577d;

    static {
        C57151h hVar = new C57151h();
        f152573b = hVar;
        C62942bv.registerDefaultInstance(C57151h.class, hVar);
        f152574c = C62942bv.newSingularGeneratedExtension(C57137au.f152511a, hVar, hVar, (C62958ce) null, 100, C63066gd.MESSAGE, C57151h.class);
    }

    private C57151h() {
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
                return newMessageInfo(f152573b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"d", "a"});
            case 3:
                return new C57151h();
            case 4:
                return new C57150g();
            case 5:
                return f152573b;
            case 6:
                C63010eb ebVar = f152575e;
                if (ebVar == null) {
                    synchronized (C57151h.class) {
                        ebVar = f152575e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152573b);
                            f152575e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
