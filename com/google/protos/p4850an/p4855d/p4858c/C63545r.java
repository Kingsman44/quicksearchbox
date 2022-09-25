package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.r */
/* compiled from: PG */
public final class C63545r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63545r f171889a;

    /* renamed from: g */
    private static volatile C63010eb f171890g;

    /* renamed from: b */
    private int f171891b;

    /* renamed from: c */
    private C63523bd f171892c;

    /* renamed from: d */
    private C63549v f171893d;

    /* renamed from: e */
    private C63553z f171894e;

    /* renamed from: f */
    private byte f171895f = 2;

    static {
        C63545r rVar = new C63545r();
        f171889a = rVar;
        C62942bv.registerDefaultInstance(C63545r.class, rVar);
    }

    private C63545r() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171895f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171895f = b;
                return null;
            case 2:
                return newMessageInfo(f171889a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63545r();
            case 4:
                return new C63544q();
            case 5:
                return f171889a;
            case 6:
                C63010eb ebVar = f171890g;
                if (ebVar == null) {
                    synchronized (C63545r.class) {
                        ebVar = f171890g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171889a);
                            f171890g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
