package com.google.android.libraries.assistant.p1363c.p1364a.p1370c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.a.c.f */
/* compiled from: PG */
public final class C16982f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16982f f49608e;

    /* renamed from: g */
    private static volatile C63010eb f49609g;

    /* renamed from: a */
    public String f49610a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f49611b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f49612c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C51012dc f49613d;

    /* renamed from: f */
    private byte f49614f = 2;

    static {
        C16982f fVar = new C16982f();
        f49608e = fVar;
        C62942bv.registerDefaultInstance(C16982f.class, fVar);
    }

    private C16982f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49614f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49614f = b;
                return null;
            case 2:
                return newMessageInfo(f49608e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Љ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C16982f();
            case 4:
                return new C16981e();
            case 5:
                return f49608e;
            case 6:
                C63010eb ebVar = f49609g;
                if (ebVar == null) {
                    synchronized (C16982f.class) {
                        ebVar = f49609g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49608e);
                            f49609g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
