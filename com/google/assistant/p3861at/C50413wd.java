package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.wd */
/* compiled from: PG */
public final class C50413wd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50413wd f131217d;

    /* renamed from: e */
    private static volatile C63010eb f131218e;

    /* renamed from: a */
    public int f131219a;

    /* renamed from: b */
    public C50427wr f131220b;

    /* renamed from: c */
    public C50427wr f131221c;

    static {
        C50413wd wdVar = new C50413wd();
        f131217d = wdVar;
        C62942bv.registerDefaultInstance(C50413wd.class, wdVar);
    }

    private C50413wd() {
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
                return newMessageInfo(f131217d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50413wd();
            case 4:
                return new C50412wc();
            case 5:
                return f131217d;
            case 6:
                C63010eb ebVar = f131218e;
                if (ebVar == null) {
                    synchronized (C50413wd.class) {
                        ebVar = f131218e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131217d);
                            f131218e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
