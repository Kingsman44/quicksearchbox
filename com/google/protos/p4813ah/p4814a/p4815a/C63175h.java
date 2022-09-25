package com.google.protos.p4813ah.p4814a.p4815a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ah.a.a.h */
/* compiled from: PG */
public final class C63175h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63175h f170573d;

    /* renamed from: e */
    private static volatile C63010eb f170574e;

    /* renamed from: a */
    public int f170575a;

    /* renamed from: b */
    public int f170576b;

    /* renamed from: c */
    public int f170577c;

    static {
        C63175h hVar = new C63175h();
        f170573d = hVar;
        C62942bv.registerDefaultInstance(C63175h.class, hVar);
    }

    private C63175h() {
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
                return newMessageInfo(f170573d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဍ\u0000\u0002ဍ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63175h();
            case 4:
                return new C63174g();
            case 5:
                return f170573d;
            case 6:
                C63010eb ebVar = f170574e;
                if (ebVar == null) {
                    synchronized (C63175h.class) {
                        ebVar = f170574e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170573d);
                            f170574e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
