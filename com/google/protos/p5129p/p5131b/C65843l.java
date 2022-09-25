package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.l */
/* compiled from: PG */
public final class C65843l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65843l f178987c;

    /* renamed from: d */
    public static final C62940bt f178988d;

    /* renamed from: e */
    private static volatile C63010eb f178989e;

    /* renamed from: a */
    public int f178990a;

    /* renamed from: b */
    public C52428rj f178991b;

    static {
        C65843l lVar = new C65843l();
        f178987c = lVar;
        C62942bv.registerDefaultInstance(C65843l.class, lVar);
        f178988d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, lVar, lVar, (C62958ce) null, 18, C63066gd.MESSAGE, C65843l.class);
    }

    private C65843l() {
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
                return newMessageInfo(f178987c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65843l();
            case 4:
                return new C65842k();
            case 5:
                return f178987c;
            case 6:
                C63010eb ebVar = f178989e;
                if (ebVar == null) {
                    synchronized (C65843l.class) {
                        ebVar = f178989e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178987c);
                            f178989e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
