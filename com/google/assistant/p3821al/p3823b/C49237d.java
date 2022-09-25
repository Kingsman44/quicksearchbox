package com.google.assistant.p3821al.p3823b;

import com.google.p4653i.p4654a.C61690bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.al.b.d */
/* compiled from: PG */
public final class C49237d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49237d f127290b;

    /* renamed from: c */
    public static final C62940bt f127291c;

    /* renamed from: e */
    private static volatile C63010eb f127292e;

    /* renamed from: a */
    public int f127293a;

    /* renamed from: d */
    private int f127294d;

    static {
        C49237d dVar = new C49237d();
        f127290b = dVar;
        C62942bv.registerDefaultInstance(C49237d.class, dVar);
        f127291c = C62942bv.newSingularGeneratedExtension(C61690bd.f166668a, dVar, dVar, (C62958ce) null, 1012, C63066gd.MESSAGE, C49237d.class);
    }

    private C49237d() {
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
                return newMessageInfo(f127290b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", C49234a.f127289a});
            case 3:
                return new C49237d();
            case 4:
                return new C49236c();
            case 5:
                return f127290b;
            case 6:
                C63010eb ebVar = f127292e;
                if (ebVar == null) {
                    synchronized (C49237d.class) {
                        ebVar = f127292e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127290b);
                            f127292e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
