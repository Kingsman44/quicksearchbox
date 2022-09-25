package com.google.p4242bp.p4267h.p4268a;

import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55215kc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.bp.h.a.f */
/* compiled from: PG */
public final class C56373f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56373f f150334a;

    /* renamed from: b */
    public static final C62940bt f150335b = C62942bv.newSingularGeneratedExtension(C55215kc.f145365c, C54944ab.UNKNOWN, (MessageLite) null, C54944ab.f144502Q, 109696811, C63066gd.ENUM, C54944ab.class);

    /* renamed from: c */
    public static final C62940bt f150336c = C62942bv.newRepeatedGeneratedExtension(C55215kc.f145365c, (MessageLite) null, (C62958ce) null, 109696812, C63066gd.STRING, false, String.class);

    /* renamed from: d */
    public static final C62940bt f150337d = C62942bv.newRepeatedGeneratedExtension(C55215kc.f145365c, (MessageLite) null, (C62958ce) null, 109696813, C63066gd.STRING, false, String.class);

    /* renamed from: e */
    private static volatile C63010eb f150338e;

    static {
        C56373f fVar = new C56373f();
        f150334a = fVar;
        C62942bv.registerDefaultInstance(C56373f.class, fVar);
    }

    private C56373f() {
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
                return newMessageInfo(f150334a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56373f();
            case 4:
                return new C56372e();
            case 5:
                return f150334a;
            case 6:
                C63010eb ebVar = f150338e;
                if (ebVar == null) {
                    synchronized (C56373f.class) {
                        ebVar = f150338e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150334a);
                            f150338e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
