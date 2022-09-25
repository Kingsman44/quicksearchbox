package com.google.p4283bv.p4380j.p4381a.p4382a.p4383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4381a.p4382a.p4384b.C57680d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.a.a.a.d */
/* compiled from: PG */
public final class C57676d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57676d f154058b;

    /* renamed from: e */
    private static volatile C63010eb f154059e;

    /* renamed from: a */
    public C57680d f154060a;

    /* renamed from: c */
    private int f154061c;

    /* renamed from: d */
    private byte f154062d = 2;

    static {
        C57676d dVar = new C57676d();
        f154058b = dVar;
        C62942bv.registerDefaultInstance(C57676d.class, dVar);
    }

    private C57676d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154062d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154062d = b;
                return null;
            case 2:
                return newMessageInfo(f154058b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57676d();
            case 4:
                return new C57675c();
            case 5:
                return f154058b;
            case 6:
                C63010eb ebVar = f154059e;
                if (ebVar == null) {
                    synchronized (C57676d.class) {
                        ebVar = f154059e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154058b);
                            f154059e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
