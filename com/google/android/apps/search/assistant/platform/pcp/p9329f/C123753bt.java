package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bt */
/* compiled from: PG */
public final class C123753bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123753bt f341832c;

    /* renamed from: e */
    private static volatile C63010eb f341833e;

    /* renamed from: a */
    public int f341834a;

    /* renamed from: b */
    public C123730ax f341835b;

    /* renamed from: d */
    private byte f341836d = 2;

    static {
        C123753bt btVar = new C123753bt();
        f341832c = btVar;
        C62942bv.registerDefaultInstance(C123753bt.class, btVar);
    }

    private C123753bt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341836d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341836d = b;
                return null;
            case 2:
                return newMessageInfo(f341832c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C123753bt();
            case 4:
                return new C123752bs();
            case 5:
                return f341832c;
            case 6:
                C63010eb ebVar = f341833e;
                if (ebVar == null) {
                    synchronized (C123753bt.class) {
                        ebVar = f341833e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341832c);
                            f341833e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
