package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57366ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.c.n */
/* compiled from: PG */
public final class C97009n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97009n f271098e;

    /* renamed from: f */
    public static final C62940bt f271099f;

    /* renamed from: h */
    private static volatile C63010eb f271100h;

    /* renamed from: a */
    public int f271101a;

    /* renamed from: b */
    public int f271102b = 0;

    /* renamed from: c */
    public Object f271103c;

    /* renamed from: d */
    public int f271104d;

    /* renamed from: g */
    private byte f271105g = 2;

    static {
        C97009n nVar = new C97009n();
        f271098e = nVar;
        C62942bv.registerDefaultInstance(C97009n.class, nVar);
        f271099f = C62942bv.newSingularGeneratedExtension(C57366ar.f153251a, nVar, nVar, (C62958ce) null, 218338482, C63066gd.MESSAGE, C97009n.class);
    }

    private C97009n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271105g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271105g = b;
                return null;
            case 2:
                return newMessageInfo(f271098e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ြ\u0000\u0003်\u0000\u0004ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C97007l.f271097a, C97006k.class, C97004i.class});
            case 3:
                return new C97009n();
            case 4:
                return new C97000e();
            case 5:
                return f271098e;
            case 6:
                C63010eb ebVar = f271100h;
                if (ebVar == null) {
                    synchronized (C97009n.class) {
                        ebVar = f271100h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271098e);
                            f271100h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
