package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.cv */
/* compiled from: PG */
public final class C135020cv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C135020cv f367673d;

    /* renamed from: f */
    private static volatile C63010eb f367674f;

    /* renamed from: a */
    public int f367675a;

    /* renamed from: b */
    public int f367676b = 1;

    /* renamed from: c */
    public C57303dd f367677c;

    /* renamed from: e */
    private byte f367678e = 2;

    static {
        C135020cv cvVar = new C135020cv();
        f367673d = cvVar;
        C62942bv.registerDefaultInstance(C135020cv.class, cvVar);
    }

    private C135020cv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f367678e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f367678e = b;
                return null;
            case 2:
                return newMessageInfo(f367673d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C135022cx.m218951b(), C45240c.f118157a});
            case 3:
                return new C135020cv();
            case 4:
                return new C135019cu();
            case 5:
                return f367673d;
            case 6:
                C63010eb ebVar = f367674f;
                if (ebVar == null) {
                    synchronized (C135020cv.class) {
                        ebVar = f367674f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367673d);
                            f367674f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
