package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.e.b.b.a.j */
/* compiled from: PG */
public final class C57095j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57095j f152420d;

    /* renamed from: g */
    private static volatile C63010eb f152421g;

    /* renamed from: a */
    public CommandOuterClass$Command f152422a;

    /* renamed from: b */
    public CommandOuterClass$Command f152423b;

    /* renamed from: c */
    public C63042fg f152424c;

    /* renamed from: e */
    private int f152425e;

    /* renamed from: f */
    private byte f152426f = 2;

    static {
        C57095j jVar = new C57095j();
        f152420d = jVar;
        C62942bv.registerDefaultInstance(C57095j.class, jVar);
    }

    private C57095j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152426f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152426f = b;
                return null;
            case 2:
                return newMessageInfo(f152420d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C57095j();
            case 4:
                return new C57094i();
            case 5:
                return f152420d;
            case 6:
                C63010eb ebVar = f152421g;
                if (ebVar == null) {
                    synchronized (C57095j.class) {
                        ebVar = f152421g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152420d);
                            f152421g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
