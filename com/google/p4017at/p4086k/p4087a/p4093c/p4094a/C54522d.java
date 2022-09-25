package com.google.p4017at.p4086k.p4087a.p4093c.p4094a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63907au;

/* renamed from: com.google.at.k.a.c.a.d */
/* compiled from: PG */
public final class C54522d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54522d f143156b;

    /* renamed from: e */
    private static volatile C63010eb f143157e;

    /* renamed from: a */
    public C63907au f143158a;

    /* renamed from: c */
    private int f143159c;

    /* renamed from: d */
    private byte f143160d = 2;

    static {
        C54522d dVar = new C54522d();
        f143156b = dVar;
        C62942bv.registerDefaultInstance(C54522d.class, dVar);
    }

    private C54522d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143160d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143160d = b;
                return null;
            case 2:
                return newMessageInfo(f143156b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54522d();
            case 4:
                return new C54521c();
            case 5:
                return f143156b;
            case 6:
                C63010eb ebVar = f143157e;
                if (ebVar == null) {
                    synchronized (C54522d.class) {
                        ebVar = f143157e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143156b);
                            f143157e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
