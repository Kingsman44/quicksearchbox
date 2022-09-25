package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.en */
/* compiled from: PG */
public final class C53185en extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53185en f139377e;

    /* renamed from: f */
    private static volatile C63010eb f139378f;

    /* renamed from: a */
    public int f139379a;

    /* renamed from: b */
    public String f139380b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139381c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139382d = BuildConfig.FLAVOR;

    static {
        C53185en enVar = new C53185en();
        f139377e = enVar;
        C62942bv.registerDefaultInstance(C53185en.class, enVar);
    }

    private C53185en() {
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
                return newMessageInfo(f139377e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53185en();
            case 4:
                return new C53184em();
            case 5:
                return f139377e;
            case 6:
                C63010eb ebVar = f139378f;
                if (ebVar == null) {
                    synchronized (C53185en.class) {
                        ebVar = f139378f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139377e);
                            f139378f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
