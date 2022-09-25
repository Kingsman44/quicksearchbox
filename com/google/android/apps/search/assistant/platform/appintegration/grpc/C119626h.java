package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.h */
/* compiled from: PG */
public final class C119626h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119626h f333378d;

    /* renamed from: f */
    private static volatile C63010eb f333379f;

    /* renamed from: a */
    public int f333380a;

    /* renamed from: b */
    public C51809dy f333381b;

    /* renamed from: c */
    public C119793ao f333382c;

    /* renamed from: e */
    private byte f333383e = 2;

    static {
        C119626h hVar = new C119626h();
        f333378d = hVar;
        C62942bv.registerDefaultInstance(C119626h.class, hVar);
    }

    private C119626h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333383e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333383e = b;
                return null;
            case 2:
                return newMessageInfo(f333378d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119626h();
            case 4:
                return new C119625g();
            case 5:
                return f333378d;
            case 6:
                C63010eb ebVar = f333379f;
                if (ebVar == null) {
                    synchronized (C119626h.class) {
                        ebVar = f333379f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333378d);
                            f333379f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
