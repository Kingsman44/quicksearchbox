package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.cd */
/* compiled from: PG */
public final class C65800cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65800cd f178860c;

    /* renamed from: d */
    public static final C62940bt f178861d;

    /* renamed from: e */
    private static volatile C63010eb f178862e;

    /* renamed from: a */
    public int f178863a;

    /* renamed from: b */
    public boolean f178864b;

    static {
        C65800cd cdVar = new C65800cd();
        f178860c = cdVar;
        C62942bv.registerDefaultInstance(C65800cd.class, cdVar);
        f178861d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, cdVar, cdVar, (C62958ce) null, 381372842, C63066gd.MESSAGE, C65800cd.class);
    }

    private C65800cd() {
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
                return newMessageInfo(f178860c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65800cd();
            case 4:
                return new C65799cc();
            case 5:
                return f178860c;
            case 6:
                C63010eb ebVar = f178862e;
                if (ebVar == null) {
                    synchronized (C65800cd.class) {
                        ebVar = f178862e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178860c);
                            f178862e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
