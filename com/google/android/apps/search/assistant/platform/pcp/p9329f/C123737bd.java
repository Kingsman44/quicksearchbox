package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bd */
/* compiled from: PG */
public final class C123737bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123737bd f341788c;

    /* renamed from: e */
    private static volatile C63010eb f341789e;

    /* renamed from: a */
    public int f341790a;

    /* renamed from: b */
    public C123746bm f341791b;

    /* renamed from: d */
    private byte f341792d = 2;

    static {
        C123737bd bdVar = new C123737bd();
        f341788c = bdVar;
        C62942bv.registerDefaultInstance(C123737bd.class, bdVar);
    }

    private C123737bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341792d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341792d = b;
                return null;
            case 2:
                return newMessageInfo(f341788c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C123737bd();
            case 4:
                return new C123736bc();
            case 5:
                return f341788c;
            case 6:
                C63010eb ebVar = f341789e;
                if (ebVar == null) {
                    synchronized (C123737bd.class) {
                        ebVar = f341789e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341788c);
                            f341789e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
