package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3825an.p3830c.p3831a.C49259ae;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.f */
/* compiled from: PG */
public final class C65837f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65837f f178971c;

    /* renamed from: d */
    public static final C62940bt f178972d;

    /* renamed from: e */
    private static volatile C63010eb f178973e;

    /* renamed from: a */
    public int f178974a;

    /* renamed from: b */
    public C49259ae f178975b;

    static {
        C65837f fVar = new C65837f();
        f178971c = fVar;
        C62942bv.registerDefaultInstance(C65837f.class, fVar);
        f178972d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, fVar, fVar, (C62958ce) null, 310197569, C63066gd.MESSAGE, C65837f.class);
    }

    private C65837f() {
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
                return newMessageInfo(f178971c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65837f();
            case 4:
                return new C65836e();
            case 5:
                return f178971c;
            case 6:
                C63010eb ebVar = f178973e;
                if (ebVar == null) {
                    synchronized (C65837f.class) {
                        ebVar = f178973e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178971c);
                            f178973e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
