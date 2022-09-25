package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.p */
/* compiled from: PG */
public final class C54164p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54164p f142144b;

    /* renamed from: e */
    private static volatile C63010eb f142145e;

    /* renamed from: a */
    public C54154f f142146a;

    /* renamed from: c */
    private int f142147c;

    /* renamed from: d */
    private byte f142148d = 2;

    static {
        C54164p pVar = new C54164p();
        f142144b = pVar;
        C62942bv.registerDefaultInstance(C54164p.class, pVar);
    }

    private C54164p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142148d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142148d = b;
                return null;
            case 2:
                return newMessageInfo(f142144b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54164p();
            case 4:
                return new C54163o();
            case 5:
                return f142144b;
            case 6:
                C63010eb ebVar = f142145e;
                if (ebVar == null) {
                    synchronized (C54164p.class) {
                        ebVar = f142145e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142144b);
                            f142145e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
