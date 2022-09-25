package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.hw */
/* compiled from: PG */
public final class C50027hw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50027hw f130055d;

    /* renamed from: e */
    private static volatile C63010eb f130056e;

    /* renamed from: a */
    public int f130057a;

    /* renamed from: b */
    public boolean f130058b;

    /* renamed from: c */
    public boolean f130059c;

    static {
        C50027hw hwVar = new C50027hw();
        f130055d = hwVar;
        C62942bv.registerDefaultInstance(C50027hw.class, hwVar);
    }

    private C50027hw() {
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
                return newMessageInfo(f130055d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50027hw();
            case 4:
                return new C50026hv();
            case 5:
                return f130055d;
            case 6:
                C63010eb ebVar = f130056e;
                if (ebVar == null) {
                    synchronized (C50027hw.class) {
                        ebVar = f130056e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130055d);
                            f130056e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
