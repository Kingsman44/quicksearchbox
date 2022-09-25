package com.google.protos.p4841al.p4842a.p4844b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4841al.p4842a.p4843a.C63297b;

/* renamed from: com.google.protos.al.a.b.d */
/* compiled from: PG */
public final class C63301d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63301d f171068b;

    /* renamed from: d */
    private static volatile C63010eb f171069d;

    /* renamed from: a */
    public C63297b f171070a;

    /* renamed from: c */
    private int f171071c;

    static {
        C63301d dVar = new C63301d();
        f171068b = dVar;
        C62942bv.registerDefaultInstance(C63301d.class, dVar);
    }

    private C63301d() {
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
                return newMessageInfo(f171068b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63301d();
            case 4:
                return new C63300c();
            case 5:
                return f171068b;
            case 6:
                C63010eb ebVar = f171069d;
                if (ebVar == null) {
                    synchronized (C63301d.class) {
                        ebVar = f171069d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171068b);
                            f171069d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
