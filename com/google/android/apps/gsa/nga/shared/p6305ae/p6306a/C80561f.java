package com.google.android.apps.gsa.nga.shared.p6305ae.p6306a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ae.a.f */
/* compiled from: PG */
public final class C80561f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80561f f221124c;

    /* renamed from: d */
    private static volatile C63010eb f221125d;

    /* renamed from: a */
    public int f221126a;

    /* renamed from: b */
    public int f221127b;

    static {
        C80561f fVar = new C80561f();
        f221124c = fVar;
        C62942bv.registerDefaultInstance(C80561f.class, fVar);
    }

    private C80561f() {
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
                return newMessageInfo(f221124c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80561f();
            case 4:
                return new C80560e();
            case 5:
                return f221124c;
            case 6:
                C63010eb ebVar = f221125d;
                if (ebVar == null) {
                    synchronized (C80561f.class) {
                        ebVar = f221125d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221124c);
                            f221125d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
