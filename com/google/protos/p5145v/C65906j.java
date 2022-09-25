package com.google.protos.p5145v;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.j */
/* compiled from: PG */
public final class C65906j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65906j f179236e;

    /* renamed from: g */
    private static volatile C63010eb f179237g;

    /* renamed from: a */
    public C65911o f179238a;

    /* renamed from: b */
    public C65911o f179239b;

    /* renamed from: c */
    public C65911o f179240c;

    /* renamed from: d */
    public C65911o f179241d;

    /* renamed from: f */
    private int f179242f;

    static {
        C65906j jVar = new C65906j();
        f179236e = jVar;
        C62942bv.registerDefaultInstance(C65906j.class, jVar);
    }

    private C65906j() {
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
                return newMessageInfo(f179236e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65906j();
            case 4:
                return new C65905i();
            case 5:
                return f179236e;
            case 6:
                C63010eb ebVar = f179237g;
                if (ebVar == null) {
                    synchronized (C65906j.class) {
                        ebVar = f179237g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179236e);
                            f179237g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
