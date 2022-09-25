package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3858ar.p3859a.C49736z;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.yh */
/* compiled from: PG */
public final class C88347yh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88347yh f238923d;

    /* renamed from: f */
    private static volatile C63010eb f238924f;

    /* renamed from: a */
    public int f238925a;

    /* renamed from: b */
    public C49736z f238926b;

    /* renamed from: c */
    public C53499f f238927c;

    /* renamed from: e */
    private byte f238928e = 2;

    static {
        C88347yh yhVar = new C88347yh();
        f238923d = yhVar;
        C62942bv.registerDefaultInstance(C88347yh.class, yhVar);
    }

    private C88347yh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238928e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238928e = b;
                return null;
            case 2:
                return newMessageInfo(f238923d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88347yh();
            case 4:
                return new C88346yg();
            case 5:
                return f238923d;
            case 6:
                C63010eb ebVar = f238924f;
                if (ebVar == null) {
                    synchronized (C88347yh.class) {
                        ebVar = f238924f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238923d);
                            f238924f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
