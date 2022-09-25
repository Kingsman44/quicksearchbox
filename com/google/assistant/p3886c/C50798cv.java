package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.cv */
/* compiled from: PG */
public final class C50798cv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50798cv f132227e;

    /* renamed from: f */
    private static volatile C63010eb f132228f;

    /* renamed from: a */
    public int f132229a;

    /* renamed from: b */
    public C50723h f132230b;

    /* renamed from: c */
    public C50723h f132231c;

    /* renamed from: d */
    public C50729n f132232d;

    static {
        C50798cv cvVar = new C50798cv();
        f132227e = cvVar;
        C62942bv.registerDefaultInstance(C50798cv.class, cvVar);
    }

    private C50798cv() {
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
                return newMessageInfo(f132227e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50798cv();
            case 4:
                return new C50797cu();
            case 5:
                return f132227e;
            case 6:
                C63010eb ebVar = f132228f;
                if (ebVar == null) {
                    synchronized (C50798cv.class) {
                        ebVar = f132228f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132227e);
                            f132228f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
