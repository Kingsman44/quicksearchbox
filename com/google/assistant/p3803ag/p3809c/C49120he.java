package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.he */
/* compiled from: PG */
public final class C49120he extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49120he f127037e;

    /* renamed from: g */
    private static volatile C63010eb f127038g;

    /* renamed from: a */
    public int f127039a;

    /* renamed from: b */
    public C49113gy f127040b;

    /* renamed from: c */
    public C49029dv f127041c;

    /* renamed from: d */
    public C49101gm f127042d;

    /* renamed from: f */
    private byte f127043f = 2;

    static {
        C49120he heVar = new C49120he();
        f127037e = heVar;
        C62942bv.registerDefaultInstance(C49120he.class, heVar);
    }

    private C49120he() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127043f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127043f = b;
                return null;
            case 2:
                return newMessageInfo(f127037e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49120he();
            case 4:
                return new C49119hd();
            case 5:
                return f127037e;
            case 6:
                C63010eb ebVar = f127038g;
                if (ebVar == null) {
                    synchronized (C49120he.class) {
                        ebVar = f127038g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127037e);
                            f127038g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
