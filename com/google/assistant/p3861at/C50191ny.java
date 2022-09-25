package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ny */
/* compiled from: PG */
public final class C50191ny extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50191ny f130478e;

    /* renamed from: f */
    private static volatile C63010eb f130479f;

    /* renamed from: a */
    public int f130480a;

    /* renamed from: b */
    public boolean f130481b;

    /* renamed from: c */
    public boolean f130482c;

    /* renamed from: d */
    public boolean f130483d;

    static {
        C50191ny nyVar = new C50191ny();
        f130478e = nyVar;
        C62942bv.registerDefaultInstance(C50191ny.class, nyVar);
    }

    private C50191ny() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130478e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0005ဇ\u0001\u0006ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50191ny();
            case 4:
                return new C50190nx();
            case 5:
                return f130478e;
            case 6:
                C63010eb ebVar = f130479f;
                if (ebVar == null) {
                    synchronized (C50191ny.class) {
                        ebVar = f130479f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130478e);
                            f130479f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
