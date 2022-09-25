package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.protos.aw.a.a.a.a.b.j */
/* compiled from: PG */
public final class C63878j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63878j f172724b;

    /* renamed from: c */
    public static final C62940bt f172725c;

    /* renamed from: e */
    private static volatile C63010eb f172726e;

    /* renamed from: a */
    public int f172727a;

    /* renamed from: d */
    private int f172728d;

    static {
        C63878j jVar = new C63878j();
        f172724b = jVar;
        C62942bv.registerDefaultInstance(C63878j.class, jVar);
        f172725c = C62942bv.newSingularGeneratedExtension(C63955s.f172966b, jVar, jVar, (C62958ce) null, 1008, C63066gd.MESSAGE, C63878j.class);
    }

    private C63878j() {
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
                return newMessageInfo(f172724b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "a"});
            case 3:
                return new C63878j();
            case 4:
                return new C63877i();
            case 5:
                return f172724b;
            case 6:
                C63010eb ebVar = f172726e;
                if (ebVar == null) {
                    synchronized (C63878j.class) {
                        ebVar = f172726e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172724b);
                            f172726e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
