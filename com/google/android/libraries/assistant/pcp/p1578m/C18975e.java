package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.assistant.pcp.m.e */
/* compiled from: PG */
public final class C18975e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C18975e f53304c;

    /* renamed from: d */
    public static final C62940bt f53305d;

    /* renamed from: e */
    private static volatile C63010eb f53306e;

    /* renamed from: a */
    public int f53307a = 0;

    /* renamed from: b */
    public Object f53308b;

    static {
        C18975e eVar = new C18975e();
        f53304c = eVar;
        C62942bv.registerDefaultInstance(C18975e.class, eVar);
        f53305d = C62942bv.newSingularGeneratedExtension(C48904f.f126552a, eVar, eVar, (C62958ce) null, 450014552, C63066gd.MESSAGE, C18975e.class);
    }

    private C18975e() {
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
                return newMessageInfo(f53304c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C18962ac.class, C18964ae.class, C18960aa.class, C18993w.class, C18987q.class, C18991u.class, C18972b.class});
            case 3:
                return new C18975e();
            case 4:
                return new C18974d();
            case 5:
                return f53304c;
            case 6:
                C63010eb ebVar = f53306e;
                if (ebVar == null) {
                    synchronized (C18975e.class) {
                        ebVar = f53306e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53304c);
                            f53306e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
