package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.cw */
/* compiled from: PG */
public final class C51005cw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51005cw f132789e;

    /* renamed from: g */
    private static volatile C63010eb f132790g;

    /* renamed from: a */
    public int f132791a;

    /* renamed from: b */
    public String f132792b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132793c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f132794d = emptyProtobufList();

    /* renamed from: f */
    private byte f132795f = 2;

    static {
        C51005cw cwVar = new C51005cw();
        f132789e = cwVar;
        C62942bv.registerDefaultInstance(C51005cw.class, cwVar);
    }

    private C51005cw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132795f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132795f = b;
                return null;
            case 2:
                return newMessageInfo(f132789e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л", new Object[]{"a", "b", C45240c.f118157a, "d", C51004cv.class});
            case 3:
                return new C51005cw();
            case 4:
                return new C51002ct();
            case 5:
                return f132789e;
            case 6:
                C63010eb ebVar = f132790g;
                if (ebVar == null) {
                    synchronized (C51005cw.class) {
                        ebVar = f132790g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132789e);
                            f132790g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
