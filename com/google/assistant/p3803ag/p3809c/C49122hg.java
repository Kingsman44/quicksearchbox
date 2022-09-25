package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hg */
/* compiled from: PG */
public final class C49122hg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49122hg f127044d;

    /* renamed from: f */
    private static volatile C63010eb f127045f;

    /* renamed from: a */
    public int f127046a;

    /* renamed from: b */
    public C49031dx f127047b;

    /* renamed from: c */
    public C49103go f127048c;

    /* renamed from: e */
    private byte f127049e = 2;

    static {
        C49122hg hgVar = new C49122hg();
        f127044d = hgVar;
        C62942bv.registerDefaultInstance(C49122hg.class, hgVar);
    }

    private C49122hg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127049e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127049e = b;
                return null;
            case 2:
                return newMessageInfo(f127044d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49122hg();
            case 4:
                return new C49121hf();
            case 5:
                return f127044d;
            case 6:
                C63010eb ebVar = f127045f;
                if (ebVar == null) {
                    synchronized (C49122hg.class) {
                        ebVar = f127045f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127044d);
                            f127045f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
