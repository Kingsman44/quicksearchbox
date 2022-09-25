package com.google.assistant.p3886c;

import com.google.p4283bv.p4345d.p4350b.p4353c.C57019k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.cd */
/* compiled from: PG */
public final class C50780cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50780cd f132145c;

    /* renamed from: d */
    public static final C62940bt f132146d;

    /* renamed from: e */
    private static volatile C63010eb f132147e;

    /* renamed from: a */
    public int f132148a;

    /* renamed from: b */
    public C57019k f132149b;

    static {
        C50780cd cdVar = new C50780cd();
        f132145c = cdVar;
        C62942bv.registerDefaultInstance(C50780cd.class, cdVar);
        f132146d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, cdVar, cdVar, (C62958ce) null, 355900395, C63066gd.MESSAGE, C50780cd.class);
    }

    private C50780cd() {
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
                return newMessageInfo(f132145c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50780cd();
            case 4:
                return new C50779cc();
            case 5:
                return f132145c;
            case 6:
                C63010eb ebVar = f132147e;
                if (ebVar == null) {
                    synchronized (C50780cd.class) {
                        ebVar = f132147e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132145c);
                            f132147e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
