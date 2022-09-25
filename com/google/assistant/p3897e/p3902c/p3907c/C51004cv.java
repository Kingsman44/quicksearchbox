package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.cv */
/* compiled from: PG */
public final class C51004cv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51004cv f132783d;

    /* renamed from: f */
    private static volatile C63010eb f132784f;

    /* renamed from: a */
    public int f132785a;

    /* renamed from: b */
    public String f132786b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51012dc f132787c;

    /* renamed from: e */
    private byte f132788e = 2;

    static {
        C51004cv cvVar = new C51004cv();
        f132783d = cvVar;
        C62942bv.registerDefaultInstance(C51004cv.class, cvVar);
    }

    private C51004cv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132788e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132788e = b;
                return null;
            case 2:
                return newMessageInfo(f132783d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51004cv();
            case 4:
                return new C51003cu();
            case 5:
                return f132783d;
            case 6:
                C63010eb ebVar = f132784f;
                if (ebVar == null) {
                    synchronized (C51004cv.class) {
                        ebVar = f132784f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132783d);
                            f132784f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
