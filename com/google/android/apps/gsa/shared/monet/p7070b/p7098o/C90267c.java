package com.google.android.apps.gsa.shared.monet.p7070b.p7098o;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.o.c */
/* compiled from: PG */
public final class C90267c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C90267c f252135e;

    /* renamed from: g */
    private static volatile C63010eb f252136g;

    /* renamed from: a */
    public int f252137a;

    /* renamed from: b */
    public C57784p f252138b;

    /* renamed from: c */
    public int f252139c;

    /* renamed from: d */
    public C60214n f252140d;

    /* renamed from: f */
    private byte f252141f = 2;

    static {
        C90267c cVar = new C90267c();
        f252135e = cVar;
        C62942bv.registerDefaultInstance(C90267c.class, cVar);
    }

    private C90267c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252141f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f252141f = b;
                return null;
            case 2:
                return newMessageInfo(f252135e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0002\u0002ဌ\u0001\u0003ᐉ\u0000\u0004ᐉ\u0002", new Object[]{"a", C45240c.f118157a, C89849ae.m146282b(), "b", "d"});
            case 3:
                return new C90267c();
            case 4:
                return new C90266b();
            case 5:
                return f252135e;
            case 6:
                C63010eb ebVar = f252136g;
                if (ebVar == null) {
                    synchronized (C90267c.class) {
                        ebVar = f252136g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252135e);
                            f252136g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
