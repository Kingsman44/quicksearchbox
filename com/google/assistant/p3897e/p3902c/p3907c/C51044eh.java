package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.eh */
/* compiled from: PG */
public final class C51044eh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51044eh f132906d;

    /* renamed from: f */
    private static volatile C63010eb f132907f;

    /* renamed from: a */
    public int f132908a;

    /* renamed from: b */
    public C51012dc f132909b;

    /* renamed from: c */
    public String f132910c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f132911e = 2;

    static {
        C51044eh ehVar = new C51044eh();
        f132906d = ehVar;
        C62942bv.registerDefaultInstance(C51044eh.class, ehVar);
    }

    private C51044eh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132911e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132911e = b;
                return null;
            case 2:
                return newMessageInfo(f132906d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51044eh();
            case 4:
                return new C51043eg();
            case 5:
                return f132906d;
            case 6:
                C63010eb ebVar = f132907f;
                if (ebVar == null) {
                    synchronized (C51044eh.class) {
                        ebVar = f132907f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132906d);
                            f132907f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
