package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cm.a.c.a.a.p */
/* compiled from: PG */
public final class C58164p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58164p f155504d;

    /* renamed from: e */
    private static volatile C63010eb f155505e;

    /* renamed from: a */
    public int f155506a;

    /* renamed from: b */
    public int f155507b;

    /* renamed from: c */
    public C62961ch f155508c = emptyIntList();

    static {
        C58164p pVar = new C58164p();
        f155504d = pVar;
        C62942bv.registerDefaultInstance(C58164p.class, pVar);
    }

    private C58164p() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f155504d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u0016", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C58164p();
            case 4:
                return new C58163o();
            case 5:
                return f155504d;
            case 6:
                C63010eb ebVar = f155505e;
                if (ebVar == null) {
                    synchronized (C58164p.class) {
                        ebVar = f155505e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155504d);
                            f155505e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
