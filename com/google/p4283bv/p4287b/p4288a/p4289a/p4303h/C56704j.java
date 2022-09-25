package com.google.p4283bv.p4287b.p4288a.p4289a.p4303h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.h.j */
/* compiled from: PG */
public final class C56704j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56704j f151353b;

    /* renamed from: e */
    private static volatile C63010eb f151354e;

    /* renamed from: a */
    public C57578av f151355a;

    /* renamed from: c */
    private int f151356c;

    /* renamed from: d */
    private byte f151357d = 2;

    static {
        C56704j jVar = new C56704j();
        f151353b = jVar;
        C62942bv.registerDefaultInstance(C56704j.class, jVar);
    }

    private C56704j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151357d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151357d = b;
                return null;
            case 2:
                return newMessageInfo(f151353b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56704j();
            case 4:
                return new C56703i();
            case 5:
                return f151353b;
            case 6:
                C63010eb ebVar = f151354e;
                if (ebVar == null) {
                    synchronized (C56704j.class) {
                        ebVar = f151354e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151353b);
                            f151354e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
